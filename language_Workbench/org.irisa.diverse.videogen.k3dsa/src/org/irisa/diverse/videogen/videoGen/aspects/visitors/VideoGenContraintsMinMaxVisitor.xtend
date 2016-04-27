package org.irisa.diverse.videogen.videoGen.aspects.visitors

import java.util.List
import org.irisa.diverse.videogen.transformations.helpers.VideoGenHelper
import org.irisa.diverse.videogen.videoGen.Alternatives
import org.irisa.diverse.videogen.videoGen.Mandatory
import org.irisa.diverse.videogen.videoGen.Optional
import org.irisa.diverse.videogen.videoGen.Sequence
import org.irisa.diverse.videogen.videoGen.VideoGen
import org.irisa.diverse.videogen.videoGen.aspects.utils.LoggableVisitor

class VideoGenContraintsMinMaxVisitor extends LoggableVisitor {
	
	public int minDuration
	public int maxDuration
	private Boolean selected
	
	new(Boolean selected) {
		super()
		// manage if only selected video must be process
		this.selected = selected
		log.info("Selected mode: " + selected)
	}
	
	def VideoGenContraintsMinMaxVisitor visit(VideoGen vid) {
		minDuration = 0
		maxDuration = 0
		log.info("VideoGen Constraints Min Max Visitor started...")
		VideoGenHelper.allSequences(vid).forEach[visit]
		this
	}
	
	def private void visit(Sequence seq) {
		if (seq.active) {
			log.info(seq.toString)
			if (seq instanceof Mandatory) {
				seq.visit
			} else if (seq instanceof Optional) {
				seq.visit
			} else if (seq instanceof Alternatives) {
				seq.visit
			}
			log.info("minDUration:" + minDuration  + ", maxDUration:" + maxDuration )
		}
	}
	
	def private visit(Mandatory man) {
		log.info("duration: " + man.video.duration)
		minDuration += man.video.duration
		maxDuration += man.video.duration
	}
	
	def private visit(Alternatives alt) {
		var List<Integer> durations = alt.options.map[video.duration]
		if (selected) {
			durations = alt.options.filter[selected].map[video.duration].toList
		}
		minDuration += durations.min
		maxDuration += durations.max
	}
	
	def private visit(Optional opt) {
		if (selected && opt.selected) {
			minDuration += opt.video.duration
		}
		maxDuration += opt.video.duration
	}
}