/**
 */
package videoGenTrace.States.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import videoGenTrace.States.State;
import videoGenTrace.States.StatesPackage;
import videoGenTrace.States.VideoGen_initialized_Value;

import videoGenTrace.States.videoGen.TracedVideoGen;
import videoGenTrace.States.videoGen.VideoGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Gen initialized Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link videoGenTrace.States.impl.VideoGen_initialized_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link videoGenTrace.States.impl.VideoGen_initialized_ValueImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link videoGenTrace.States.impl.VideoGen_initialized_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link videoGenTrace.States.impl.VideoGen_initialized_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VideoGen_initialized_ValueImpl extends MinimalEObjectImpl.Container implements VideoGen_initialized_Value {
	/**
	 * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected boolean initialized = INITIALIZED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoGen_initialized_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.VIDEO_GEN_INITIALIZED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialized(boolean newInitialized) {
		boolean oldInitialized = initialized;
		initialized = newInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedVideoGen getParent() {
		if (eContainerFeatureID() != StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__PARENT) return null;
		return (TracedVideoGen)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedVideoGen newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedVideoGen newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, VideoGenPackage.TRACED_VIDEO_GEN__INITIALIZED_SEQUENCE, TracedVideoGen.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__STATES, StatesPackage.STATE__VIDEO_GEN_INITIALIZED_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedVideoGen)otherEnd, msgs);
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, VideoGenPackage.TRACED_VIDEO_GEN__INITIALIZED_SEQUENCE, TracedVideoGen.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__INITIALIZED:
				return isInitialized();
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__PARENT:
				return getParent();
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__STATES:
				return getStates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__PARENT:
				setParent((TracedVideoGen)newValue);
				return;
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__PARENT:
				setParent((TracedVideoGen)null);
				return;
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.VIDEO_GEN_INITIALIZED_VALUE__STATES:
				return states != null && !states.isEmpty();
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
		result.append(" (initialized: ");
		result.append(initialized);
		result.append(')');
		return result.toString();
	}

} //VideoGen_initialized_ValueImpl
