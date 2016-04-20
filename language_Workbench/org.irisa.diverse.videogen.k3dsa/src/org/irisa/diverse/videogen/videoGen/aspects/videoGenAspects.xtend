package org.irisa.diverse.videogen.videoGen.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.io.File
import java.io.FileWriter
import java.util.HashMap
import java.util.List
import java.util.Map
import org.irisa.diverse.videogen.transformations.VideoGenTransform
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.transformations.utils.DistributedRandomNumberGenerator
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Delay
import org.irisa.diverse.videogen.videoGen.Generate
import org.irisa.diverse.videogen.videoGen.Initialize
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.Transition
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.aspects.exceptions.ConstraintsFailed
import org.irisa.diverse.videogen.videoGen.aspects.exceptions.ConstraintsType
import static extension org.irisa.diverse.videogen.videoGen.aspects.VideoAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.InitializeAspect.*
import java.util.logging.Logger
import java.util.logging.FileHandler
import java.util.logging.SimpleFormatter

@Aspect(className=VideoGen)
class VideoGenAspect {

	private long nanotimeStart = 0
	private long nanotimeEnd = 0
	protected static Logger log = Logger.getLogger("VideoGenUserContraintsVisitor")

	@Main
	def void main() {
		val FileHandler fh = new FileHandler("/tmp/" + _self.class.name + ".log")
        val formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);
		log.addHandler(fh)
		_self.execute
	}
	
	@Step
	def private void updateVariant() {
		// Variante initialization
		val variantesVisitor = new VideoGenVarianteVisitor()
		variantesVisitor.visit(_self)
		_self.variantes = variantesVisitor.variantes
	}
	
	@Step
	def private void updateDurations() {
		
		// Duration initialization
		val durationVisitor = new VideoGenDurationVisitor(false)
		durationVisitor.visit(_self)
		
		// Constraints initialization
		_self.minDurationConstraint = durationVisitor.minDuration
		_self.maxDurationConstraint = durationVisitor.maxDuration
		_self.minUserConstraint = durationVisitor.minDuration
		_self.maxUserConstraint = durationVisitor.maxDuration
	}
	
	@Step
	def public void updateModel() {
		_self.updateVariant
		_self.updateDurations
	}
	
	@Step
	def public void setup() {
		val start = System.nanoTime
		// Setup initialization
		new VideoGenSetupVisitor().visit(_self)
		
		val stop = System.nanoTime
		log.info("#### VideoGen, time to setup " + (stop - start))
	}
	
	@Step
	@InitializeModel
	def public void initializeModel(List<String> args){
		_self.setup
		_self.updateModel
	}
	
	@Step
	def public void execute() {
		
		_self.nanotimeStart = System.nanoTime
		// First apply the constraint model before execution
		val visitor = new VideoGenUserContraintsVisitor(_self.minUserConstraint, _self.maxUserConstraint)
		visitor.visit(_self)
		// Then process each sequences
		VideoGenHelper.getInitialize(_self).execute(_self)
	}	
		/**
	 * Start the computation (model transformation) of all selected video to create the final sequence (PlayList format)
	 * 
	 * @see : ffmpeg
	 */
	@Step
	def public void compute() {
		val videos = new HashMap
		log.info("##### VideoGen '" + _self.name + "' start computation.")
		
		// Constraints checking
		val durationVisitor = new VideoGenDurationVisitor(true)
		durationVisitor.visit(_self)
		if (durationVisitor.maxDuration < _self.minDurationConstraint) {
			throw new ConstraintsFailed(ConstraintsType.MIN_DURATION, true)
		}
		if (durationVisitor.maxDuration > _self.maxDurationConstraint) {
			throw new ConstraintsFailed(ConstraintsType.MAX_DURATION, true)
		}
		
		log.info("##### Videos computation result in playlist format : ")
		//TODO: re-implement the initial IDM project model transformation. See master branch package 'fr.nemomen.utils'.
		VideoGenHelper.allSelectedVideos(_self).forEach[video |
			log.info("\t" + video.name + ": " + video.url)
			videos.put(video.name, true)
		]
		// TODO: Manage model transformation here
		val content = VideoGenTransform.toM3U(_self, false, videos)
		log.info(content)
		// Create the temporary file to receive playlist as M3U
		val playlist = File.createTempFile(Long.toString(System.nanoTime()), "-temp.m3u")
		val writer = new FileWriter(playlist)
		writer.write(content)
		writer.flush
		writer.close
		
		// Start VLC
		// TODO: add a new tab inside eclipse to start a video player...
		// If possible (see Jave implementation from org.irisa.diverse.transformations.strategies)
		val p = new ProcessBuilder(
			"vlc",
			"--playlist-autostart",
			"--playlist-tree",
			"--no-overlay",
			playlist.toPath.toString)
		p.start()
		
		_self.nanotimeEnd = System.nanoTime
		log.info("#### VideoGen, time to execute " + (_self.nanotimeEnd - _self.nanotimeStart))
		_self.nanotimeStart = System.nanoTime
	}
}

@Aspect(className=Transition)
abstract class TransitionAspect {

	public VideoGen videoGen = null;
	public Boolean done = false
	public Boolean callnextTransition = true
	
	/**
	 * Call the sequence processor. Need to be overridden by a inherited class
	 * Be careful to call this super method at the end of the override call.
	 * 	cf: _self.super_process() (kermeta style)
	 * 
	 */
	@Step
	def public void execute(VideoGen videoGen) {
		VideoGenAspect.log.info("##### '" + _self.class.name + "::" + _self.name + "' is being processed.")
		// If this sequence has already been done, do nothing at all
		if (_self.active && !_self.done) {
			// Call the next sequence in all case
			if (_self.nextTransition !== null) {
				//Don't forget to reset current state
				_self.done = true;
				// Before calling next sequence
				if (_self.callnextTransition) {
					_self.nextTransition.execute(videoGen)	
				}
			}
		}
	}
}


@Aspect(className=Sequence)
abstract class SequenceAspect extends TransitionAspect {
	
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		_self.super_execute(videoGen)
	}
}

@Aspect(className=Alternatives)
class AlternativesAspect extends SequenceAspect {
	
	
	/**
	 * Return a hashmap with corrected probabilities for an Alternatives instance.
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static Map<Optional, Integer> checkProbabilities() {
		val result = new HashMap<Optional, Integer>
		var totalProb = 0
		var totalProbLeft = 0
		var totalOptions = 0
		VideoGenAspect.log.info(_self.options.filter[active].toList.toString)
		var inactivated = 0
		for (option : _self.options) {
			if (option.active) {
				if (option.probability == 0) {
					totalOptions++
				}
				totalProb += option.probability
				result.put(option, option.probability)
			} else {
				inactivated++
				totalProbLeft += option.probability
			}
		}
		if (result.size != 0) {
			if (result.size == 1) {
				result.replace(result.keySet.get(0), 100)
			} else if (inactivated != 0) {
				for (name : result.keySet) {
					val percentageLeft = totalProbLeft / inactivated
					result.put(name, result.get(name) + percentageLeft)
				}
			} else {
				for (name : result.keySet) {
					if (result.get(name) == 0) {
						val percentageLeft = (100 - totalProb) / totalOptions
						result.put(name, percentageLeft)
					}
				}
			}
		}
		result
	}

	/**
 	 * Process options to find the selectable video
 	 * 
 	 */
	def private Video selectVideo() {

		val drng = new DistributedRandomNumberGenerator()
		val checkedProbabilities = _self.checkProbabilities()
		if (checkedProbabilities.empty) {
			return null
		}
		checkedProbabilities.forEach[option, proba|
			VideoGenAspect.log.info("Select Video #######################################################")
			VideoGenAspect.log.info("Original = " + option.name + "->" +  option.probability + " | Corrected->" + proba)
			drng.addNumber(checkedProbabilities.keySet.toList.indexOf(option), proba)
		] 
		checkedProbabilities.keySet.get(drng.getDistributedRandomNumber()).video
	}

	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		_self.video = _self.selectVideo
		if (_self.video != null) {
			_self.video.select
			// Manage optional next sequence
			_self.options
			.filter[active]
			.filter[video == _self.video]
			.filter[nextTransition != null]
			.forEach[ 
				nextTransition.execute(videoGen)
				// Call of nextTransition.process will not be called in super
				_self.callnextTransition = false
			]
			}
		_self.super_execute(videoGen)
	}
}

@Aspect(className=Mandatory)
class MandatoryAspect extends SequenceAspect {
	
	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		_self.video.select
		_self.super_execute(videoGen)
	}
}

@Aspect(className=Optional)
class OptionalAspect extends SequenceAspect {
	
	/**
	 * Is this video is selectable or not ?
	 * applies 50% in case of undefined proba
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def private Boolean isSelected() {

		var drng = new DistributedRandomNumberGenerator()

		var float proba

		proba = 50
		if (_self.probability != 0) {
			proba = _self.probability
		}
		drng.addNumber(1, proba)
		drng.addNumber(0, 100 - proba)

		drng.getDistributedRandomNumber() > 0
	}

	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		if (_self.isSelected()) {
			_self.video.select
		}
		_self.super_execute(videoGen)
	}
}


@Aspect(className=Initialize)
class InitializeAspect extends TransitionAspect {
	
	@Step
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		//VideoGenAspect.setup(videoGen)
		//VideoGenAspect.updateModel(videoGen)
		_self.super_execute(videoGen)
	}
	
}

@Aspect(className=Generate)
class GenerateAspect extends TransitionAspect {
		
	@OverrideAspectMethod
	def public void execute(VideoGen videoGen) {
		_self.compute(videoGen)
		_self.super_execute(videoGen)
	}
	/**
	 * Call VideogGen.compute() and wait for 1000 ms before the next turn
	 * 
	 * @see : ffmpeg
	 */
	@Step
	def public void compute(VideoGen videoGen) {
		VideoGenAspect.compute(videoGen)
	}
}

@Aspect(className=Video)
class VideoAspect {
	
	public Boolean selected = false
		
	/**
	 * Select this video and apply any of needed operations (conversion or rename for example)
	 * 
	 */
	@Step
	def public void select() {
		VideoGenAspect.log.info("##### Video '" + _self.name + "' has been selected.")
		_self.selected = true
	}
}

@Aspect(className=Delay)
class DelayAspect extends TransitionAspect {
	
	@Step
	@OverrideAspectMethod
	def void execute(VideoGen videoGen) {
		try {
			Thread.sleep(_self.value)
		} catch (InterruptedException e) {
			e.printStackTrace()
		}
		_self.super_execute(videoGen)
	}
}