/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LandingGearBrakingStateType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Braking State Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearBrakingStateTypeImpl#getControlParameterBraked <em>Control Parameter Braked</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearBrakingStateTypeImpl#getControlParameterReleased <em>Control Parameter Released</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearBrakingStateTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearBrakingStateTypeImpl extends MinimalEObjectImpl.Container
		implements LandingGearBrakingStateType {
	/**
	 * The cached value of the '{@link #getControlParameterBraked() <em>Control Parameter Braked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlParameterBraked()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType controlParameterBraked;

	/**
	 * The cached value of the '{@link #getControlParameterReleased() <em>Control Parameter Released</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlParameterReleased()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType controlParameterReleased;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingGearBrakingStateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearBrakingStateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getControlParameterBraked() {
		return controlParameterBraked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlParameterBraked(DoubleBaseType newControlParameterBraked,
			NotificationChain msgs) {
		DoubleBaseType oldControlParameterBraked = controlParameterBraked;
		controlParameterBraked = newControlParameterBraked;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_BRAKED, oldControlParameterBraked,
					newControlParameterBraked);
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
	public void setControlParameterBraked(DoubleBaseType newControlParameterBraked) {
		if (newControlParameterBraked != controlParameterBraked) {
			NotificationChain msgs = null;
			if (controlParameterBraked != null)
				msgs = ((InternalEObject) controlParameterBraked).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_BRAKED,
						null, msgs);
			if (newControlParameterBraked != null)
				msgs = ((InternalEObject) newControlParameterBraked).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_BRAKED,
						null, msgs);
			msgs = basicSetControlParameterBraked(newControlParameterBraked, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_BRAKED, newControlParameterBraked,
					newControlParameterBraked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getControlParameterReleased() {
		return controlParameterReleased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlParameterReleased(DoubleBaseType newControlParameterReleased,
			NotificationChain msgs) {
		DoubleBaseType oldControlParameterReleased = controlParameterReleased;
		controlParameterReleased = newControlParameterReleased;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_RELEASED,
					oldControlParameterReleased, newControlParameterReleased);
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
	public void setControlParameterReleased(DoubleBaseType newControlParameterReleased) {
		if (newControlParameterReleased != controlParameterReleased) {
			NotificationChain msgs = null;
			if (controlParameterReleased != null)
				msgs = ((InternalEObject) controlParameterReleased).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_RELEASED, null, msgs);
			if (newControlParameterReleased != null)
				msgs = ((InternalEObject) newControlParameterReleased).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_RELEASED, null, msgs);
			msgs = basicSetControlParameterReleased(newControlParameterReleased, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_RELEASED,
					newControlParameterReleased, newControlParameterReleased));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_BRAKED:
			return basicSetControlParameterBraked(null, msgs);
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_RELEASED:
			return basicSetControlParameterReleased(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_BRAKED:
			return getControlParameterBraked();
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_RELEASED:
			return getControlParameterReleased();
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__UID:
			return getUID();
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
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_BRAKED:
			setControlParameterBraked((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_RELEASED:
			setControlParameterReleased((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_BRAKED:
			setControlParameterBraked((DoubleBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_RELEASED:
			setControlParameterReleased((DoubleBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_BRAKED:
			return controlParameterBraked != null;
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__CONTROL_PARAMETER_RELEASED:
			return controlParameterReleased != null;
		case CpacsPackage.LANDING_GEAR_BRAKING_STATE_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //LandingGearBrakingStateTypeImpl
