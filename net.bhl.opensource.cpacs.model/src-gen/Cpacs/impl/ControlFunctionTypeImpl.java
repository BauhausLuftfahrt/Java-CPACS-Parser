/**
 */
package Cpacs.impl;

import Cpacs.ControlFunctionType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlFunctionTypeImpl#getControlDistributorUID <em>Control Distributor UID</em>}</li>
 *   <li>{@link Cpacs.impl.ControlFunctionTypeImpl#getKRate <em>KRate</em>}</li>
 *   <li>{@link Cpacs.impl.ControlFunctionTypeImpl#getKRateI <em>KRate I</em>}</li>
 *   <li>{@link Cpacs.impl.ControlFunctionTypeImpl#getKAngle <em>KAngle</em>}</li>
 *   <li>{@link Cpacs.impl.ControlFunctionTypeImpl#getKAngleI <em>KAngle I</em>}</li>
 *   <li>{@link Cpacs.impl.ControlFunctionTypeImpl#getKAngleRateF1 <em>KAngle Rate F1</em>}</li>
 *   <li>{@link Cpacs.impl.ControlFunctionTypeImpl#getKAngleRateF2 <em>KAngle Rate F2</em>}</li>
 *   <li>{@link Cpacs.impl.ControlFunctionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlFunctionTypeImpl extends ComplexBaseTypeImpl implements ControlFunctionType {
	/**
	 * The cached value of the '{@link #getControlDistributorUID() <em>Control Distributor UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlDistributorUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType controlDistributorUID;

	/**
	 * The cached value of the '{@link #getKRate() <em>KRate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKRate()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType kRate;

	/**
	 * The cached value of the '{@link #getKRateI() <em>KRate I</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKRateI()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType kRateI;

	/**
	 * The cached value of the '{@link #getKAngle() <em>KAngle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType kAngle;

	/**
	 * The cached value of the '{@link #getKAngleI() <em>KAngle I</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKAngleI()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType kAngleI;

	/**
	 * The cached value of the '{@link #getKAngleRateF1() <em>KAngle Rate F1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKAngleRateF1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType kAngleRateF1;

	/**
	 * The cached value of the '{@link #getKAngleRateF2() <em>KAngle Rate F2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKAngleRateF2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType kAngleRateF2;

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
	protected ControlFunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlFunctionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getControlDistributorUID() {
		return controlDistributorUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlDistributorUID(StringUIDBaseType newControlDistributorUID,
			NotificationChain msgs) {
		StringUIDBaseType oldControlDistributorUID = controlDistributorUID;
		controlDistributorUID = newControlDistributorUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_FUNCTION_TYPE__CONTROL_DISTRIBUTOR_UID, oldControlDistributorUID,
					newControlDistributorUID);
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
	public void setControlDistributorUID(StringUIDBaseType newControlDistributorUID) {
		if (newControlDistributorUID != controlDistributorUID) {
			NotificationChain msgs = null;
			if (controlDistributorUID != null)
				msgs = ((InternalEObject) controlDistributorUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__CONTROL_DISTRIBUTOR_UID, null,
						msgs);
			if (newControlDistributorUID != null)
				msgs = ((InternalEObject) newControlDistributorUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__CONTROL_DISTRIBUTOR_UID, null,
						msgs);
			msgs = basicSetControlDistributorUID(newControlDistributorUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_FUNCTION_TYPE__CONTROL_DISTRIBUTOR_UID, newControlDistributorUID,
					newControlDistributorUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getKRate() {
		return kRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKRate(DoubleBaseType newKRate, NotificationChain msgs) {
		DoubleBaseType oldKRate = kRate;
		kRate = newKRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE, oldKRate, newKRate);
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
	public void setKRate(DoubleBaseType newKRate) {
		if (newKRate != kRate) {
			NotificationChain msgs = null;
			if (kRate != null)
				msgs = ((InternalEObject) kRate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE, null, msgs);
			if (newKRate != null)
				msgs = ((InternalEObject) newKRate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE, null, msgs);
			msgs = basicSetKRate(newKRate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE, newKRate,
					newKRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getKRateI() {
		return kRateI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKRateI(DoubleBaseType newKRateI, NotificationChain msgs) {
		DoubleBaseType oldKRateI = kRateI;
		kRateI = newKRateI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE_I, oldKRateI, newKRateI);
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
	public void setKRateI(DoubleBaseType newKRateI) {
		if (newKRateI != kRateI) {
			NotificationChain msgs = null;
			if (kRateI != null)
				msgs = ((InternalEObject) kRateI).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE_I, null, msgs);
			if (newKRateI != null)
				msgs = ((InternalEObject) newKRateI).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE_I, null, msgs);
			msgs = basicSetKRateI(newKRateI, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE_I,
					newKRateI, newKRateI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getKAngle() {
		return kAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKAngle(DoubleBaseType newKAngle, NotificationChain msgs) {
		DoubleBaseType oldKAngle = kAngle;
		kAngle = newKAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE, oldKAngle, newKAngle);
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
	public void setKAngle(DoubleBaseType newKAngle) {
		if (newKAngle != kAngle) {
			NotificationChain msgs = null;
			if (kAngle != null)
				msgs = ((InternalEObject) kAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE, null, msgs);
			if (newKAngle != null)
				msgs = ((InternalEObject) newKAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE, null, msgs);
			msgs = basicSetKAngle(newKAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE, newKAngle,
					newKAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getKAngleI() {
		return kAngleI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKAngleI(DoubleBaseType newKAngleI, NotificationChain msgs) {
		DoubleBaseType oldKAngleI = kAngleI;
		kAngleI = newKAngleI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_I, oldKAngleI, newKAngleI);
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
	public void setKAngleI(DoubleBaseType newKAngleI) {
		if (newKAngleI != kAngleI) {
			NotificationChain msgs = null;
			if (kAngleI != null)
				msgs = ((InternalEObject) kAngleI).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_I, null, msgs);
			if (newKAngleI != null)
				msgs = ((InternalEObject) newKAngleI).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_I, null, msgs);
			msgs = basicSetKAngleI(newKAngleI, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_I,
					newKAngleI, newKAngleI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getKAngleRateF1() {
		return kAngleRateF1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKAngleRateF1(DoubleBaseType newKAngleRateF1, NotificationChain msgs) {
		DoubleBaseType oldKAngleRateF1 = kAngleRateF1;
		kAngleRateF1 = newKAngleRateF1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F1, oldKAngleRateF1, newKAngleRateF1);
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
	public void setKAngleRateF1(DoubleBaseType newKAngleRateF1) {
		if (newKAngleRateF1 != kAngleRateF1) {
			NotificationChain msgs = null;
			if (kAngleRateF1 != null)
				msgs = ((InternalEObject) kAngleRateF1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F1, null, msgs);
			if (newKAngleRateF1 != null)
				msgs = ((InternalEObject) newKAngleRateF1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F1, null, msgs);
			msgs = basicSetKAngleRateF1(newKAngleRateF1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F1,
					newKAngleRateF1, newKAngleRateF1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getKAngleRateF2() {
		return kAngleRateF2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKAngleRateF2(DoubleBaseType newKAngleRateF2, NotificationChain msgs) {
		DoubleBaseType oldKAngleRateF2 = kAngleRateF2;
		kAngleRateF2 = newKAngleRateF2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F2, oldKAngleRateF2, newKAngleRateF2);
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
	public void setKAngleRateF2(DoubleBaseType newKAngleRateF2) {
		if (newKAngleRateF2 != kAngleRateF2) {
			NotificationChain msgs = null;
			if (kAngleRateF2 != null)
				msgs = ((InternalEObject) kAngleRateF2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F2, null, msgs);
			if (newKAngleRateF2 != null)
				msgs = ((InternalEObject) newKAngleRateF2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F2, null, msgs);
			msgs = basicSetKAngleRateF2(newKAngleRateF2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F2,
					newKAngleRateF2, newKAngleRateF2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_FUNCTION_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_FUNCTION_TYPE__CONTROL_DISTRIBUTOR_UID:
			return basicSetControlDistributorUID(null, msgs);
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE:
			return basicSetKRate(null, msgs);
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE_I:
			return basicSetKRateI(null, msgs);
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE:
			return basicSetKAngle(null, msgs);
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_I:
			return basicSetKAngleI(null, msgs);
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F1:
			return basicSetKAngleRateF1(null, msgs);
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F2:
			return basicSetKAngleRateF2(null, msgs);
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
		case CpacsPackage.CONTROL_FUNCTION_TYPE__CONTROL_DISTRIBUTOR_UID:
			return getControlDistributorUID();
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE:
			return getKRate();
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE_I:
			return getKRateI();
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE:
			return getKAngle();
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_I:
			return getKAngleI();
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F1:
			return getKAngleRateF1();
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F2:
			return getKAngleRateF2();
		case CpacsPackage.CONTROL_FUNCTION_TYPE__UID:
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
		case CpacsPackage.CONTROL_FUNCTION_TYPE__CONTROL_DISTRIBUTOR_UID:
			setControlDistributorUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE:
			setKRate((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE_I:
			setKRateI((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE:
			setKAngle((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_I:
			setKAngleI((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F1:
			setKAngleRateF1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F2:
			setKAngleRateF2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__UID:
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
		case CpacsPackage.CONTROL_FUNCTION_TYPE__CONTROL_DISTRIBUTOR_UID:
			setControlDistributorUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE:
			setKRate((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE_I:
			setKRateI((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE:
			setKAngle((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_I:
			setKAngleI((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F1:
			setKAngleRateF1((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F2:
			setKAngleRateF2((DoubleBaseType) null);
			return;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__UID:
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
		case CpacsPackage.CONTROL_FUNCTION_TYPE__CONTROL_DISTRIBUTOR_UID:
			return controlDistributorUID != null;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE:
			return kRate != null;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KRATE_I:
			return kRateI != null;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE:
			return kAngle != null;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_I:
			return kAngleI != null;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F1:
			return kAngleRateF1 != null;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__KANGLE_RATE_F2:
			return kAngleRateF2 != null;
		case CpacsPackage.CONTROL_FUNCTION_TYPE__UID:
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

} //ControlFunctionTypeImpl
