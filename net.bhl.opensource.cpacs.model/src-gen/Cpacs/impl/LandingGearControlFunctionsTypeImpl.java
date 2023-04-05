/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LandingGearBrakingStateType;
import Cpacs.LandingGearControlFunctionsType;
import Cpacs.LandingGearExtensionFunctionType;
import Cpacs.LandingGearSteeringFunctionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Control Functions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearControlFunctionsTypeImpl#getExtensionPath <em>Extension Path</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearControlFunctionsTypeImpl#getSteeringPath <em>Steering Path</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearControlFunctionsTypeImpl#getBrakingState <em>Braking State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearControlFunctionsTypeImpl extends MinimalEObjectImpl.Container
		implements LandingGearControlFunctionsType {
	/**
	 * The cached value of the '{@link #getExtensionPath() <em>Extension Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPath()
	 * @generated
	 * @ordered
	 */
	protected LandingGearExtensionFunctionType extensionPath;

	/**
	 * The cached value of the '{@link #getSteeringPath() <em>Steering Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteeringPath()
	 * @generated
	 * @ordered
	 */
	protected LandingGearSteeringFunctionType steeringPath;

	/**
	 * The cached value of the '{@link #getBrakingState() <em>Braking State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrakingState()
	 * @generated
	 * @ordered
	 */
	protected LandingGearBrakingStateType brakingState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingGearControlFunctionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearControlFunctionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearExtensionFunctionType getExtensionPath() {
		return extensionPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionPath(LandingGearExtensionFunctionType newExtensionPath,
			NotificationChain msgs) {
		LandingGearExtensionFunctionType oldExtensionPath = extensionPath;
		extensionPath = newExtensionPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__EXTENSION_PATH, oldExtensionPath,
					newExtensionPath);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtensionPath(LandingGearExtensionFunctionType newExtensionPath) {
		if (newExtensionPath != extensionPath) {
			NotificationChain msgs = null;
			if (extensionPath != null)
				msgs = ((InternalEObject) extensionPath).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__EXTENSION_PATH, null,
						msgs);
			if (newExtensionPath != null)
				msgs = ((InternalEObject) newExtensionPath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__EXTENSION_PATH, null,
						msgs);
			msgs = basicSetExtensionPath(newExtensionPath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__EXTENSION_PATH, newExtensionPath,
					newExtensionPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearSteeringFunctionType getSteeringPath() {
		return steeringPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSteeringPath(LandingGearSteeringFunctionType newSteeringPath,
			NotificationChain msgs) {
		LandingGearSteeringFunctionType oldSteeringPath = steeringPath;
		steeringPath = newSteeringPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__STEERING_PATH, oldSteeringPath, newSteeringPath);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSteeringPath(LandingGearSteeringFunctionType newSteeringPath) {
		if (newSteeringPath != steeringPath) {
			NotificationChain msgs = null;
			if (steeringPath != null)
				msgs = ((InternalEObject) steeringPath).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__STEERING_PATH, null,
						msgs);
			if (newSteeringPath != null)
				msgs = ((InternalEObject) newSteeringPath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__STEERING_PATH, null,
						msgs);
			msgs = basicSetSteeringPath(newSteeringPath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__STEERING_PATH, newSteeringPath, newSteeringPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearBrakingStateType getBrakingState() {
		return brakingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrakingState(LandingGearBrakingStateType newBrakingState, NotificationChain msgs) {
		LandingGearBrakingStateType oldBrakingState = brakingState;
		brakingState = newBrakingState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__BRAKING_STATE, oldBrakingState, newBrakingState);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBrakingState(LandingGearBrakingStateType newBrakingState) {
		if (newBrakingState != brakingState) {
			NotificationChain msgs = null;
			if (brakingState != null)
				msgs = ((InternalEObject) brakingState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__BRAKING_STATE, null,
						msgs);
			if (newBrakingState != null)
				msgs = ((InternalEObject) newBrakingState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__BRAKING_STATE, null,
						msgs);
			msgs = basicSetBrakingState(newBrakingState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__BRAKING_STATE, newBrakingState, newBrakingState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__EXTENSION_PATH:
			return basicSetExtensionPath(null, msgs);
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__STEERING_PATH:
			return basicSetSteeringPath(null, msgs);
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__BRAKING_STATE:
			return basicSetBrakingState(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__EXTENSION_PATH:
			return getExtensionPath();
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__STEERING_PATH:
			return getSteeringPath();
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__BRAKING_STATE:
			return getBrakingState();
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
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__EXTENSION_PATH:
			setExtensionPath((LandingGearExtensionFunctionType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__STEERING_PATH:
			setSteeringPath((LandingGearSteeringFunctionType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__BRAKING_STATE:
			setBrakingState((LandingGearBrakingStateType) newValue);
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
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__EXTENSION_PATH:
			setExtensionPath((LandingGearExtensionFunctionType) null);
			return;
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__STEERING_PATH:
			setSteeringPath((LandingGearSteeringFunctionType) null);
			return;
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__BRAKING_STATE:
			setBrakingState((LandingGearBrakingStateType) null);
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
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__EXTENSION_PATH:
			return extensionPath != null;
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__STEERING_PATH:
			return steeringPath != null;
		case CpacsPackage.LANDING_GEAR_CONTROL_FUNCTIONS_TYPE__BRAKING_STATE:
			return brakingState != null;
		}
		return super.eIsSet(featureID);
	}

} //LandingGearControlFunctionsTypeImpl
