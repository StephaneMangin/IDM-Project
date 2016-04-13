/**
 */
package org.irisa.diverse.videogen.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Introduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.Introduction#getVideoGen <em>Video Gen</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getIntroduction()
 * @model
 * @generated
 */
public interface Introduction extends Optional {
	/**
	 * Returns the value of the '<em><b>Video Gen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Gen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Gen</em>' reference.
	 * @see #setVideoGen(VideoGen)
	 * @see org.irisa.diverse.videogen.videoGen.VideoGenPackage#getIntroduction_VideoGen()
	 * @model required="true"
	 * @generated
	 */
	VideoGen getVideoGen();

	/**
	 * Sets the value of the '{@link org.irisa.diverse.videogen.videoGen.Introduction#getVideoGen <em>Video Gen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Gen</em>' reference.
	 * @see #getVideoGen()
	 * @generated
	 */
	void setVideoGen(VideoGen value);

} // Introduction
