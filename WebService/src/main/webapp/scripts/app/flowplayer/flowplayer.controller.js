'use strict';

angular.module('videogenApp')
    .controller('FlowPlayerController', function ($scope) {
    	
    	  var flashplayer = flowplayer("#hlsjs", {
    		  	wmode: 'direct',
    		    splash: true,
    		    embed: false, // setup would need iframe embedding
    		    ratio: 5/12,
    		    clip: {
    		    	accelerated: true,
    		    	sources: [
    		    	          {
    		    	        	  type: "application/x-mpegurl",
    		    	              src:  "http://localhost:8080/static/playlists/random.m3u8"
    		    	          }
    		    	],
	     		    lang: "fr",
   		       		autoPlay: false,
   		       		autoBuffering: true
    		    }

    		  }).on("ready", function (e, api, video) {
    		    // info for demo purposes
    		    document.getElementById("engine").innerHTML = api.engine.engineName;
    		    document.getElementById("vtype").innerHTML = video.type;
    		    document.getElementById("src").innerHTML = video.src;

    		  });
    	  
//    	flowplayer("hlsjs", "libs/flowplayer-6.0.4/flowplayer.swf", {
//    		   wmode: 'direct',
//    		   plugins: {
//    		       httpstreaming: {
//    		           url: 'libs/flowplayer-6.0.4/flashlsFlowPlayer.swf',
//    		           hls_debug : false,
//    		           hls_debug2 : false,
//    		           hls_lowbufferlength : 3,
//    		           hls_minbufferlength : 5,
//    		           hls_maxbufferlength : 0,
//    		           hls_startfromlevel : -1,
//    		           hls_seekfromlevel : -1,
//    		           hls_live_flushurlcache : false,
//    		           hls_seekmode : "ACCURATE",
//    		           hls_fragmentloadmaxretry : -1,
//    		           hls_manifestloadmaxretry : -1,
//    		           hls_capleveltostage : false,
//    		           hls_maxlevelcappingmode : "downscale"
//    		       }
//    		   },
//    		   clip: {
//    		       accelerated: true,
//    		       url: "http://localhost:8080/static/playlist.m3u8",
//    		       urlResolvers: "httpstreaming",
//    		       lang: "fr",
//    		       provider: "httpstreaming",
//    		       autoPlay: false,
//    		       autoBuffering: true
//    		   },
//    		   log: {
//    		       level: 'none',
//    		       filter: 'org.flowplayer.controller.*'
//    		   }
//    		});
    });
