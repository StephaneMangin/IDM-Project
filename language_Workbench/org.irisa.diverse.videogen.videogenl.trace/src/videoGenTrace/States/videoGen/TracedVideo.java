/**
 */
package videoGenTrace.States.videoGen;

import org.irisa.diverse.videogen.videogenl.videoGen.Video;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.videoGen.TracedVideo#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedVideo()
 * @model
 * @generated
 */
public interface TracedVideo extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Video)
	 * @see videoGenTrace.States.videoGen.VideoGenPackage#getTracedVideo_OriginalObject()
	 * @model
	 * @generated
	 */
	Video getOriginalObject();

	/**
	 * Sets the value of the '{@link videoGenTrace.States.videoGen.TracedVideo#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Video value);

} // TracedVideo
