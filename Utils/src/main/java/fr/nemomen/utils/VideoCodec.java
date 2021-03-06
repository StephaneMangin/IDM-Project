package fr.nemomen.utils;

import fr.nemomen.utils.VideoCodec;

/**
 * Enum to bind different mime types format to HTML and fffmpeg parameters
 * 
 * FIXME : should be better in xtend to normalize BUT enum in xtend does not appear to take parameters ???
 * 
 * @author Stéphane Mangin <stephane.mangin@freesbee.fr>
 */
public enum VideoCodec {
	NONE("", "", ""),
	MP4("mp4", "mp4", "video/mp4"),
	FLV("flv", "flv", "video/flash"),
	MPEGTS("mpegts", "ts", "video/mpeg"),
	MPEG("mpeg", "mpg", "video/mpeg"),
	WEBM("webm", "webm", "video/webm"),
	WMV("wmv", "wmv", "video/x-ms-wmv"),
	AVI("avi", "avi", "video/x-msvideo");

	private final String extention;
	private final String mimeType;
	private final String format;
    
    VideoCodec(String format, String extention, String mimeType) {
        this.extention = extention;
        this.mimeType = mimeType;
        this.format = format;
    }
    
    public String extention() { return extention; }
    public String mimeType() { return mimeType; }
    public String format() { return format; }
    
    public static VideoCodec getByExtention(String ext) {
    	for (VideoCodec codec: VideoCodec.values()) {
    		if (codec.extention().equals(ext)) {
    			return codec;
    		}
    	}
    	return VideoCodec.NONE;
    }
    
    public static VideoCodec getByFormat(String format) {
    	for (VideoCodec codec: VideoCodec.values()) {
    		if (codec.format().equals(format)) {
    			return codec;
    		}
    	}
    	return VideoCodec.NONE;
    }
    
    public static VideoCodec getByMimeType(String mimeType) {
    	for (VideoCodec codec: VideoCodec.values()) {
    		if (codec.mimeType().equals(mimeType)) {
    			return codec;
    		}
    	}
    	return VideoCodec.NONE;
    }

}
