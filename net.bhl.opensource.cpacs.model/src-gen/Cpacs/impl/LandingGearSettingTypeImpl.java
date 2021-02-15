/**
 */
package Cpacs.impl;

import Cpacs.BooleanBaseType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LandingGearSettingType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Setting Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearSettingTypeImpl#getLandingGearUID <em>Landing Gear UID</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearSettingTypeImpl#getExtended <em>Extended</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearSettingTypeImpl#getControlParameter <em>Control Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearSettingTypeImpl extends ComplexBaseTypeImpl implements LandingGearSettingType {
	/**
	 * The cached value of the '{@link #getLandingGearUID() <em>Landing Gear UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGearUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType landingGearUID;

	/**
	 * The cached value of the '{@link #getExtended() <em>Extended</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtended()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType extended;

	/**
	 * The cached value of the '{@link #getControlParameter() <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlParameter()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType controlParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingGearSettingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearSettingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getLandingGearUID() {
		return landingGearUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGearUID(StringUIDBaseType newLandingGearUID, NotificationChain msgs) {
		StringUIDBaseType oldLandingGearUID = landingGearUID;
		landingGearUID = newLandingGearUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_SETTING_TYPE__LANDING_GEAR_UID, oldLandingGearUID, newLandingGearUID);
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
	public void setLandingGearUID(StringUIDBaseType newLandingGearUID) {
		if (newLandingGearUID != landingGearUID) {
			NotificationChain msgs = null;
			if (landingGearUID != null)
				msgs = ((InternalEObject) landingGearUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_SETTING_TYPE__LANDING_GEAR_UID, null, msgs);
			if (newLandingGearUID != null)
				msgs = ((InternalEObject) newLandingGearUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_SETTING_TYPE__LANDING_GEAR_UID, null, msgs);
			msgs = basicSetLandingGearUID(newLandingGearUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_SETTING_TYPE__LANDING_GEAR_UID, newLandingGearUID, newLandingGearUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getExtended() {
		return extended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtended(BooleanBaseType newExtended, NotificationChain msgs) {
		BooleanBaseType oldExtended = extended;
		extended = newExtended;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_SETTING_TYPE__EXTENDED, oldExtended, newExtended);
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
	public void setExtended(BooleanBaseType newExtended) {
		if (newExtended != extended) {
			NotificationChain msgs = null;
			if (extended != null)
				msgs = ((InternalEObject) extended).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_SETTING_TYPE__EXTENDED, null, msgs);
			if (newExtended != null)
				msgs = ((InternalEObject) newExtended).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_SETTING_TYPE__EXTENDED, null, msgs);
			msgs = basicSetExtended(newExtended, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.LANDING_GEAR_SETTING_TYPE__EXTENDED,
					newExtended, newExtended));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getControlParameter() {
		return controlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlParameter(DoubleBaseType newControlParameter, NotificationChain msgs) {
		DoubleBaseType oldControlParameter = controlParameter;
		controlParameter = newControlParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_SETTING_TYPE__CONTROL_PARAMETER, oldControlParameter,
					newControlParameter);
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
	public void setControlParameter(DoubleBaseType newControlParameter) {
		if (newControlParameter != controlParameter) {
			NotificationChain msgs = null;
			if (controlParameter != null)
				msgs = ((InternalEObject) controlParameter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_SETTING_TYPE__CONTROL_PARAMETER, null, msgs);
			if (newControlParameter != null)
				msgs = ((InternalEObject) newControlParameter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_SETTING_TYPE__CONTROL_PARAMETER, null, msgs);
			msgs = basicSetControlParameter(newControlParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_SETTING_TYPE__CONTROL_PARAMETER, newControlParameter,
					newControlParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__LANDING_GEAR_UID:
			return basicSetLandingGearUID(null, msgs);
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__EXTENDED:
			return basicSetExtended(null, msgs);
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__CONTROL_PARAMETER:
			return basicSetControlParameter(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__LANDING_GEAR_UID:
			return getLandingGearUID();
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__EXTENDED:
			return getExtended();
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__CONTROL_PARAMETER:
			return getControlParameter();
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
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__LANDING_GEAR_UID:
			setLandingGearUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__EXTENDED:
			setExtended((BooleanBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__CONTROL_PARAMETER:
			setControlParameter((DoubleBaseType) newValue);
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
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__LANDING_GEAR_UID:
			setLandingGearUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__EXTENDED:
			setExtended((BooleanBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__CONTROL_PARAMETER:
			setControlParameter((DoubleBaseType) null);
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
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__LANDING_GEAR_UID:
			return landingGearUID != null;
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__EXTENDED:
			return extended != null;
		case CpacsPackage.LANDING_GEAR_SETTING_TYPE__CONTROL_PARAMETER:
			return controlParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //LandingGearSettingTypeImpl
