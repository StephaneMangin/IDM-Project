/*
 * generated by Xtext
 */
package org.istic.idm.xtext.videogen;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class VideoGenStandaloneSetup extends VideoGenStandaloneSetupGenerated{

	public static void doSetup() {
		new VideoGenStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
