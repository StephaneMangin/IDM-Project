package org.irisa.diverse.videogen.videoGen.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.HashMap
import java.util.Map
import org.irisa.diverse.videogen.transformations.VideoGenTransform
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Conclusion
import org.irisa.diverse.videogen.videoGen.Introduction
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.Video
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.aspects.exceptions.ConstraintsFailed
import org.irisa.diverse.videogen.videoGen.aspects.exceptions.ConstraintsType

import static extension org.irisa.diverse.videogen.videoGen.aspects.AlternativesAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.SequenceAspect.*
import static extension org.irisa.diverse.videogen.videoGen.aspects.VideoAspect.*

@Aspect(className=VideoGen)
class VideoGenAspect {

	def public void initialize() {
		println("##### VideoGen '" + _self.name + "' has been initialized.")
		
		// Constraints initialization
		_self.setConstraints(_self.computeMinDuration, _self.computeMaxDuration)
		
		// Initialize all sequences
		VideoGenHelper.allSequences(_self).forEach[sequence | 
			sequence.initialize
		]
	}
	
	@Main
	def public void process() {
		_self.initialize
		
		// Then process each sequences
		VideoGenHelper.getIntroduction(_self).process
		
		// And at the end (sequential so ok !) call the video generation
		_self.compute
	}
	
	/**
	 * Start the computation (model transformation) of all selected video to create the final sequence (PlayList format)
	 * 
	 * @see : ffmpeg
	 */
	def public void compute() {
		val videos = new HashMap
		println("##### VideoGen '" + _self.name + "' start computation.")
		
		// Constraints checking
		if (_self.computeMinDuration < _self.minDurationConstraint) {
			throw new ConstraintsFailed(ConstraintsType.MIN_DURATION, true)
		}
		if (_self.computeMaxDuration > _self.maxDurationConstraint) {
			throw new ConstraintsFailed(ConstraintsType.MAX_DURATION, true)
		}
		
		println("##### Videos computation result in playlist format : ")
		//TODO: re-implement the initial IDM project model transformation. See master branch package 'fr.nemomen.utils'.
		VideoGenHelper.allSelectedVideos(_self).forEach[video |
			println("\t" + video.name + ": " + video.url)
			videos.put(video.name, true)
		]
		// TODO: Manage model transformation here
		println(VideoGenTransform.toM3U(_self, true, videos))
		
	}
	
	/**
	 * Return the maximum duration of a generated sequence.
	 * 
	 */
	def public Integer computeMaxDuration() {
		var duration = 0
		var Sequence sequence = VideoGenHelper.getIntroduction(_self)
		while(sequence !== null) { 
			if (sequence.active) {
				if (sequence instanceof Mandatory) {
					duration += sequence.video.duration
				} else if (sequence instanceof Optional) {
					duration += sequence.video.duration
				} else if (sequence instanceof Alternatives) {
					duration += sequence.computeMaxDuration
				}
			}
			sequence = sequence.nextSequence
		}
		duration
	}
	
	/**
	 * Return the minimum duration of a generated sequence.
	 * 
	 */
	def public Integer computeMinDuration() {
		var duration = 0
		var Sequence sequence = VideoGenHelper.getIntroduction(_self)
		while(sequence !== null) { 
			if (sequence instanceof Mandatory) {
				duration += sequence.video.duration
			} else if (sequence instanceof Alternatives) {
				duration += sequence.computeMinDuration
			}
			sequence = sequence.nextSequence
		}
		duration
	}
	
	@Step
	def public void setConstraints(Integer minDuration, Integer maxDuration) {
		_self.minDurationConstraint = minDuration
		_self.maxDurationConstraint = maxDuration
	}
	
}

@Aspect(className=Sequence)
abstract class SequenceAspect {

	public Boolean done = false
	public Boolean callNextSequence = true
	
	/**
	 * Call the sequence processor. Need to be overridden by a inherited class
	 * Be careful to call this super method at the end of the override call.
	 * 	cf: _self.super_process() (kermeta style)
	 * 
	 */
	@Step
	def public void process() {
		// If this sequence has already been done, do nothing at all
		if (!_self.done) {
			// Call the next sequence in all case
			if (_self.nextSequence !== null) {
				//Don't forget to reset current state
				_self.done = true;
				// Before calling next sequence
				if (_self.callNextSequence) {
					_self.nextSequence.process	
				}
			}
		}
	}
	
	def public void initialize() {
		// Not use right now		
	}
}

@Aspect(className=Alternatives)
class AlternativesAspect extends SequenceAspect {
		
	/**
	 * Populate the video relation with selected optional video
	 * 
	 */
	@Step
	@OverrideAspectMethod
	def public void initialize() {
		val video = _self.selectVideo
		println("##### Alternatives " + _self.name + " video selected: " + video.name)
		_self.video = video
		_self.super_initialize
	}
	
	/**
	 * Return a hashmap with corrected probabilities for an Alternatives instance.
	 * 
	 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
	 */
	def static Map<String, Integer> checkProbabilities() {
		val result = new HashMap<String, Integer>
		var totalProb = 0
		var totalOptions = 0
		for (option : _self.options) {
			if (option.probability == 0) {
				totalOptions++
			}
			totalProb += option.probability
			result.put(option.video.name, option.probability)
		}
		for (name : result.keySet) {
			if (result.get(name) == 0) {
				result.put(name, (100 - totalProb) / totalOptions)
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
		val proba = _self.checkProbabilities()
		_self.options.map[video.name].forEach [ name |
			drng.addNumber(proba.keySet.toList.indexOf(name), proba.get(name))
		] 
		_self.options.get(drng.getDistributedRandomNumber()).video
	}

	@Step
	@OverrideAspectMethod
	def public void process() {
		if (_self.active && !_self.done) {
			println("##### Alternatives '" + _self.name + "' is been processed.")
			_self.video = _self.selectVideo
			_self.video.select
			// Manage optional next sequence
			_self.options.forEach[option | 
				if (option.video == _self.video && option.nextSequence != null) {
					option.nextSequence.process
					// Call of nextSequence.process will not be called in super
					_self.callNextSequence = false
				}
			]
		}
		_self.super_process()
	}
	
	/**
	 * Return the maximum duration of contained videos
	 * 
	 */
	def public Integer computeMaxDuration() {
		println("MAX " + _self.name)
		var Integer max = -1
		for (Optional option: _self.options) {
			if (max != -1) {
				if (max < option.video.duration) {
					max = option.video.duration
				}
			} else {
				max = option.video.duration	
			}		
		}
		max
	}
	
	/**
	 * Return the minimum duration of contained videos
	 * 
	 */
	def public Integer computeMinDuration() {
		println("MIN " + _self.name)
		var Integer min = -1
		for (Optional option: _self.options) {
			if (min != -1) {
				if (min > option.video.duration) {
					min = option.video.duration
				}
			} else {
				min = option.video.duration	
			}		
		}
		min
	}
}

@Aspect(className=Mandatory)
class MandatoryAspect extends SequenceAspect {
	
	@OverrideAspectMethod
	def public void process() {
		if (_self.active && !_self.done) {
			println("##### Mandatory '" + _self.name + "' is been processed.")
			_self.video.select
		}
		_self.super_process
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

	@OverrideAspectMethod
	def public void process() {
		if (_self.active && !_self.done) {
			println("##### Optional '" + _self.name + "' is been processed.")
			if (_self.isSelected()) {
				_self.video.select
			}
		}
		_self.super_process()
	}
}


@Aspect(className=Introduction)
class IntroductionAspect extends SequenceAspect {
	
}

@Aspect(className=Conclusion)
class ConclusionAspect extends SequenceAspect {
	
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
		println("##### Video '" + _self.url + "' has been selected.")
		_self.selected = true
	}
}

/**
 * Randomization helper
 * 
 * @see https://stackoverflow.com/questions/20327958/random-number-with-probabilities/20329901#20329901
 * 
 * @Author http://stackoverflow.com/users/2128755/trylimits
 */
class DistributedRandomNumberGenerator {
	HashMap<Integer, Double> distribution
	double distSum

	new() {
		distribution = new HashMap()
	}

	def void addNumber(int value, double distribution) {
		if (this.distribution.get(value) !== null) {
			distSum -= this.distribution.get(value)
		}
		this.distribution.put(value, distribution)
		distSum += distribution
	}

	def int getDistributedRandomNumber() {
		var double rand = Math.random()
		var double ratio = 1.0f / distSum
		var double tempDist = 0
		for (Integer i : distribution.keySet()) {
			tempDist += distribution.get(i)
			if (rand / ratio <= tempDist) {
				return i
			}

		}
		return 0
	}

}










