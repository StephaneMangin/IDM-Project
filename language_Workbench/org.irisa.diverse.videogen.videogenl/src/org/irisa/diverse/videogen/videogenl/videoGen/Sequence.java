/**
 */
package org.irisa.diverse.videogen.videogenl.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videogenl.videoGen.Sequence#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getSequence()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='notIdentical'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot notIdentical='\n\t\t\tself.allInstances()->forAll(s1, s2 |\n\t\t\t\ts1 <> s2 implies s1.oclAsType(NamedElement).name <> s2.oclAsType(NamedElement).name)'"
 * @generated
 */
public interface Sequence extends Transition {
	/**
	 * Returns the value of the '<em><b>Video</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video</em>' reference.
	 * @see #setVideo(Video)
	 * @see org.irisa.diverse.videogen.videogenl.videoGen.VideoGenPackage#getSequence_Video()
	 * @model required="true"
	 * @generated
	 */
	Video getVideo();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videogenl.videoGen.Sequence#getVideo <em>Video</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video</em>' reference.
	 * @see #getVideo()
	 * @generated
	 */
	void setVideo(Video value);

} // Sequence
