/*
 * generated by Xtext
 */
package org.istic.idm.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractVideoGenValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.istic.idm.xtext.videoGen.VideoGenPackage.eINSTANCE);
		return result;
	}
}
