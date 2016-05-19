/**
 */
package videoGenTrace.Steps.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.executionframework.engine.mse.impl.StepImpl;

import org.irisa.diverse.videogen.videoGen.Video;

import videoGenTrace.States.State;
import videoGenTrace.States.StatesPackage;

import videoGenTrace.Steps.StepsPackage;
import videoGenTrace.Steps.VideoGen_Video_Select;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Gen Video Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.Steps.impl.VideoGen_Video_SelectImpl#getEndingState <em>Ending State</em>}</li>
 *   <li>{@link videoGenTrace.Steps.impl.VideoGen_Video_SelectImpl#getStartingState <em>Starting State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoGen_Video_SelectImpl extends StepImpl implements VideoGen_Video_Select {
	/**
	 * The cached value of the '{@link #getEndingState() <em>Ending State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingState()
	 * @generated
	 * @ordered
	 */
	protected State endingState;

	/**
	 * The cached value of the '{@link #getStartingState() <em>Starting State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingState()
	 * @generated
	 * @ordered
	 */
	protected State startingState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoGen_Video_SelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.VIDEO_GEN_VIDEO_SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getEndingState() {
		if (endingState != null && endingState.eIsProxy()) {
			InternalEObject oldEndingState = (InternalEObject)endingState;
			endingState = (State)eResolveProxy(oldEndingState);
			if (endingState != oldEndingState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.VIDEO_GEN_VIDEO_SELECT__ENDING_STATE, oldEndingState, endingState));
			}
		}
		return endingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetEndingState() {
		return endingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndingState(State newEndingState, NotificationChain msgs) {
		State oldEndingState = endingState;
		endingState = newEndingState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.VIDEO_GEN_VIDEO_SELECT__ENDING_STATE, oldEndingState, newEndingState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndingState(State newEndingState) {
		if (newEndingState != endingState) {
			NotificationChain msgs = null;
			if (endingState != null)
				msgs = ((InternalEObject)endingState).eInverseRemove(this, StatesPackage.STATE__ENDED_STEPS, State.class, msgs);
			if (newEndingState != null)
				msgs = ((InternalEObject)newEndingState).eInverseAdd(this, StatesPackage.STATE__ENDED_STEPS, State.class, msgs);
			msgs = basicSetEndingState(newEndingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.VIDEO_GEN_VIDEO_SELECT__ENDING_STATE, newEndingState, newEndingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStartingState() {
		if (startingState != null && startingState.eIsProxy()) {
			InternalEObject oldStartingState = (InternalEObject)startingState;
			startingState = (State)eResolveProxy(oldStartingState);
			if (startingState != oldStartingState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StepsPackage.VIDEO_GEN_VIDEO_SELECT__STARTING_STATE, oldStartingState, startingState));
			}
		}
		return startingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetStartingState() {
		return startingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartingState(State newStartingState, NotificationChain msgs) {
		State oldStartingState = startingState;
		startingState = newStartingState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StepsPackage.VIDEO_GEN_VIDEO_SELECT__STARTING_STATE, oldStartingState, newStartingState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingState(State newStartingState) {
		if (newStartingState != startingState) {
			NotificationChain msgs = null;
			if (startingState != null)
				msgs = ((InternalEObject)startingState).eInverseRemove(this, StatesPackage.STATE__STARTED_STEPS, State.class, msgs);
			if (newStartingState != null)
				msgs = ((InternalEObject)newStartingState).eInverseAdd(this, StatesPackage.STATE__STARTED_STEPS, State.class, msgs);
			msgs = basicSetStartingState(newStartingState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepsPackage.VIDEO_GEN_VIDEO_SELECT__STARTING_STATE, newStartingState, newStartingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Video getCaller() {
		return (org.irisa.diverse.videogen.videoGen.Video) this.getMseoccurrence().getMse().getCaller();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT__ENDING_STATE:
				if (endingState != null)
					msgs = ((InternalEObject)endingState).eInverseRemove(this, StatesPackage.STATE__ENDED_STEPS, State.class, msgs);
				return basicSetEndingState((State)otherEnd, msgs);
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT__STARTING_STATE:
				if (startingState != null)
					msgs = ((InternalEObject)startingState).eInverseRemove(this, StatesPackage.STATE__STARTED_STEPS, State.class, msgs);
				return basicSetStartingState((State)otherEnd, msgs);
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
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT__ENDING_STATE:
				return basicSetEndingState(null, msgs);
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT__STARTING_STATE:
				return basicSetStartingState(null, msgs);
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
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT__ENDING_STATE:
				if (resolve) return getEndingState();
				return basicGetEndingState();
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT__STARTING_STATE:
				if (resolve) return getStartingState();
				return basicGetStartingState();
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
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT__ENDING_STATE:
				setEndingState((State)newValue);
				return;
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT__STARTING_STATE:
				setStartingState((State)newValue);
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
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT__ENDING_STATE:
				setEndingState((State)null);
				return;
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT__STARTING_STATE:
				setStartingState((State)null);
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
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT__ENDING_STATE:
				return endingState != null;
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT__STARTING_STATE:
				return startingState != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StepsPackage.VIDEO_GEN_VIDEO_SELECT___GET_CALLER:
				return getCaller();
		}
		return super.eInvoke(operationID, arguments);
	}

} //VideoGen_Video_SelectImpl
