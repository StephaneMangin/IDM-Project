/**
 */
package org.irisa.diverse.videogen.videoGen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.irisa.diverse.videogen.videoGen.Conclusion;
import org.irisa.diverse.videogen.videoGen.Sequence;
import org.irisa.diverse.videogen.videoGen.Video;
import org.irisa.diverse.videogen.videoGen.VideoGen;
import org.irisa.diverse.videogen.videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.ConclusionImpl#getNextSequence <em>Next Sequence</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.ConclusionImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.ConclusionImpl#getVideo <em>Video</em>}</li>
 *   <li>{@link org.irisa.diverse.videogen.videoGen.impl.ConclusionImpl#getVideogen <em>Videogen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConclusionImpl extends NamedElementImpl implements Conclusion {
	/**
	 * The cached value of the '{@link #getNextSequence() <em>Next Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence nextSequence;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVideo() <em>Video</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideo()
	 * @generated
	 * @ordered
	 */
	protected Video video;

	/**
	 * The cached value of the '{@link #getVideogen() <em>Videogen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideogen()
	 * @generated
	 * @ordered
	 */
	protected VideoGen videogen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VideoGenPackage.Literals.CONCLUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getNextSequence() {
		if (nextSequence != null && nextSequence.eIsProxy()) {
			InternalEObject oldNextSequence = (InternalEObject)nextSequence;
			nextSequence = (Sequence)eResolveProxy(oldNextSequence);
			if (nextSequence != oldNextSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.CONCLUSION__NEXT_SEQUENCE, oldNextSequence, nextSequence));
			}
		}
		return nextSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence basicGetNextSequence() {
		return nextSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextSequence(Sequence newNextSequence) {
		Sequence oldNextSequence = nextSequence;
		nextSequence = newNextSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.CONCLUSION__NEXT_SEQUENCE, oldNextSequence, nextSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.CONCLUSION__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video getVideo() {
		if (video != null && video.eIsProxy()) {
			InternalEObject oldVideo = (InternalEObject)video;
			video = (Video)eResolveProxy(oldVideo);
			if (video != oldVideo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.CONCLUSION__VIDEO, oldVideo, video));
			}
		}
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video basicGetVideo() {
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideo(Video newVideo) {
		Video oldVideo = video;
		video = newVideo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.CONCLUSION__VIDEO, oldVideo, video));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen getVideogen() {
		if (videogen != null && videogen.eIsProxy()) {
			InternalEObject oldVideogen = (InternalEObject)videogen;
			videogen = (VideoGen)eResolveProxy(oldVideogen);
			if (videogen != oldVideogen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VideoGenPackage.CONCLUSION__VIDEOGEN, oldVideogen, videogen));
			}
		}
		return videogen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoGen basicGetVideogen() {
		return videogen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVideogen(VideoGen newVideogen, NotificationChain msgs) {
		VideoGen oldVideogen = videogen;
		videogen = newVideogen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VideoGenPackage.CONCLUSION__VIDEOGEN, oldVideogen, newVideogen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideogen(VideoGen newVideogen) {
		if (newVideogen != videogen) {
			NotificationChain msgs = null;
			if (videogen != null)
				msgs = ((InternalEObject)videogen).eInverseRemove(this, VideoGenPackage.VIDEO_GEN__CONCLUSION, VideoGen.class, msgs);
			if (newVideogen != null)
				msgs = ((InternalEObject)newVideogen).eInverseAdd(this, VideoGenPackage.VIDEO_GEN__CONCLUSION, VideoGen.class, msgs);
			msgs = basicSetVideogen(newVideogen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VideoGenPackage.CONCLUSION__VIDEOGEN, newVideogen, newVideogen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoGenPackage.CONCLUSION__VIDEOGEN:
				if (videogen != null)
					msgs = ((InternalEObject)videogen).eInverseRemove(this, VideoGenPackage.VIDEO_GEN__CONCLUSION, VideoGen.class, msgs);
				return basicSetVideogen((VideoGen)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VideoGenPackage.CONCLUSION__VIDEOGEN:
				return basicSetVideogen(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VideoGenPackage.CONCLUSION__NEXT_SEQUENCE:
				if (resolve) return getNextSequence();
				return basicGetNextSequence();
			case VideoGenPackage.CONCLUSION__ACTIVE:
				return isActive();
			case VideoGenPackage.CONCLUSION__VIDEO:
				if (resolve) return getVideo();
				return basicGetVideo();
			case VideoGenPackage.CONCLUSION__VIDEOGEN:
				if (resolve) return getVideogen();
				return basicGetVideogen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VideoGenPackage.CONCLUSION__NEXT_SEQUENCE:
				setNextSequence((Sequence)newValue);
				return;
			case VideoGenPackage.CONCLUSION__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case VideoGenPackage.CONCLUSION__VIDEO:
				setVideo((Video)newValue);
				return;
			case VideoGenPackage.CONCLUSION__VIDEOGEN:
				setVideogen((VideoGen)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VideoGenPackage.CONCLUSION__NEXT_SEQUENCE:
				setNextSequence((Sequence)null);
				return;
			case VideoGenPackage.CONCLUSION__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case VideoGenPackage.CONCLUSION__VIDEO:
				setVideo((Video)null);
				return;
			case VideoGenPackage.CONCLUSION__VIDEOGEN:
				setVideogen((VideoGen)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VideoGenPackage.CONCLUSION__NEXT_SEQUENCE:
				return nextSequence != null;
			case VideoGenPackage.CONCLUSION__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case VideoGenPackage.CONCLUSION__VIDEO:
				return video != null;
			case VideoGenPackage.CONCLUSION__VIDEOGEN:
				return videogen != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} //ConclusionImpl
