package org.irisa.diverse.videogen.videoGen.aspects

import org.chocosolver.solver.Solver
import org.chocosolver.solver.constraints.IntConstraintFactory
import org.chocosolver.solver.trace.Chatterbox
import org.chocosolver.solver.variables.IntVar
import org.chocosolver.solver.variables.VariableFactory
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.chocosolver.solver.constraints.SatFactory
import org.chocosolver.solver.ResolutionPolicy
import org.chocosolver.solver.constraints.nary.cnf.LogOp
import org.chocosolver.solver.variables.BoolVar
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.List

import static extension org.irisa.diverse.videogen.videoGen.aspects.VideoGenDurationConstraintsAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.SequenceDurationConstraintsAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.OptionalDurationConstraintsAspect.*

@Aspect(className=VideoGen)
class VideoGenDurationConstraintsAspect {
	
	public var List<IntVar> variables
	private var List<Integer> constants
    private var IntVar objective
    private var int indice
    public var Solver solver
    
	def void applyUserConstraints() {
		_self.solver = new Solver("Min max durations constraints")
		_self.indice = 0
		val videoNumber = _self.videos.size
		
		// Define the objective scalar with given contraints
		_self.objective = VariableFactory.bounded("objective", _self.minUserConstraint, _self.maxUserConstraint, _self.solver)
		_self.variables = newArrayOfSize(videoNumber) // Used to insert optional's coefficient
		_self.constants = newIntArrayOfSize(videoNumber) // Used to insert video durations. Must be a partition of coefs
				
		// Call the visitor
		_self.transitions.filter[it instanceof Sequence]
			.map[it as Sequence]
			.filter[active]
			.forEach[configureUserConstraints(_self)]
		
		// Create and post constraints by using constraint factories
        _self.solver.post(IntConstraintFactory.scalar(_self.variables, _self.constants, _self.objective));
        // Launch the resolution process
        _self.solver.findOptimalSolution(ResolutionPolicy.MAXIMIZE, _self.objective);
        //solver.findParetoFront(ResolutionPolicy.MAXIMIZE, objective);
        //solver.findAllSolutions
        // Print search statistics
        Chatterbox.printStatistics(_self.solver);
        // Print solutions
        
        // Then apply constraints
		_self.transitions.filter[it instanceof Sequence]
			.map[it as Sequence]
			.filter[active]
			.forEach[applyUserConstraints(_self)]
        
        // Get all solutions
        val solutions = _self.solver.findAllSolutions

	}
	
	
	def public void addVar(IntVar intvar, int duration) {
		_self.variables.set(_self.indice, intvar)
		_self.constants.set(_self.indice, duration)
		_self.indice = _self.indice + 1
	}
}

@Aspect(className=Sequence)
class SequenceDurationConstraintsAspect {

	def void configureUserConstraints(VideoGen vid) {
		if (_self instanceof Optional) {
			_self.configureUserConstraints(vid)
		} else if (_self instanceof Mandatory) {
			_self.configureUserConstraints(vid)
		} else if (_self instanceof Alternatives) {
			_self.configureUserConstraints(vid)
		}
	}
	
	def void applyUserConstraints(VideoGen vid) {
		if (_self instanceof Optional) {
			_self.applyUserConstraints(vid)
		} else if (_self instanceof Alternatives) {
			_self.applyUserConstraints(vid)
		}
	}
}	
@Aspect(className=Alternatives)
class AlternativesDurationConstraintsAspect {
	
	def void configureUserConstraints(VideoGen vid) {
		val optionsSize = _self.options.size
		val localVars = newArrayOfSize(optionsSize)
		var localCount = 0
		for (Optional opt: _self.options) {
			val ft = opt.configureUserConstraints(vid)
			localVars.set(localCount, ft)
			localCount++
		}
		
		// Create the clause
		val logOp = _self.createAlternativesXorClause(localVars)
		SatFactory.addClauses(logOp, vid.solver)
	}
	
	def void applyUserConstraints(VideoGen vid) {
		_self.options.forEach[applyUserConstraints(vid)]
	}
	
	/*
	 * Constructs the Xor constraints fro man Alternative
	 * 
	 * Result is :
	 * 		logOp = LogOp.xor(lastVar,
	 *			LogOp.xor(...
	 *				LogOp.xor(firstVar, secondVar)))
	 */
	def private LogOp createAlternativesXorClause(IntVar[] vars) {
		var LogOp logOp = null
		var BoolVar firstVar = vars.head  as BoolVar
		// Browse except the first element

		for (IntVar boolVar: vars.tail) {
			if (logOp == null) {
				logOp = LogOp.xor(firstVar, boolVar as BoolVar)
			} else {
				logOp = LogOp.xor(boolVar as BoolVar, logOp)
			}
		}
		logOp
	}
}

@Aspect(className=Optional)
class OptionalDurationConstraintsAspect {
	
	def IntVar configureUserConstraints(VideoGen vid) {
		// For choco, a bool is a integer between 0 and 1
		var IntVar ft
		if (_self.active) {	
			if (_self.selected) {
				ft = VariableFactory.fixed(_self.name, 1, vid.solver)
			} else {
				ft = VariableFactory.bool(_self.name, vid.solver)
			}
		} else {
			ft = VariableFactory.fixed(_self.name, 0, vid.solver)
		}
		vid.addVar(ft, _self.video.duration)
		ft
	}
	
	def void applyUserConstraints(VideoGen vid) {
		if (vid.variables.filter[value == 0].exists[name == _self.name]) {
			_self.active = false
		}
	}
}

@Aspect(className=Mandatory)
class MandatoryDurationConstraintsAspect {
	
	def void configureUserConstraints(VideoGen vid) {
		// A mandatory has a fixed coef value of 1, mandatory right ;)
		vid.addVar(VariableFactory.fixed(_self.name, 1, vid.solver), _self.video.duration)
	}
}
