/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.InternalPressureType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Pressure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.InternalPressureTypeImpl#getReferenceUID <em>Reference UID</em>}</li>
 *   <li>{@link Cpacs.impl.InternalPressureTypeImpl#getPressure <em>Pressure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalPressureTypeImpl extends ComplexBaseTypeImpl implements InternalPressureType {
	/**
	 * The cached value of the '{@link #getReferenceUID() <em>Reference UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType referenceUID;

	/**
	 * The cached value of the '{@link #getPressure() <em>Pressure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressure()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType pressure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalPressureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getInternalPressureType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getReferenceUID() {
		return referenceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceUID(StringUIDBaseType newReferenceUID, NotificationChain msgs) {
		StringUIDBaseType oldReferenceUID = referenceUID;
		referenceUID = newReferenceUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERNAL_PRESSURE_TYPE__REFERENCE_UID, oldReferenceUID, newReferenceUID);
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
	public void setReferenceUID(StringUIDBaseType newReferenceUID) {
		if (newReferenceUID != referenceUID) {
			NotificationChain msgs = null;
			if (referenceUID != null)
				msgs = ((InternalEObject) referenceUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERNAL_PRESSURE_TYPE__REFERENCE_UID, null, msgs);
			if (newReferenceUID != null)
				msgs = ((InternalEObject) newReferenceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERNAL_PRESSURE_TYPE__REFERENCE_UID, null, msgs);
			msgs = basicSetReferenceUID(newReferenceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.INTERNAL_PRESSURE_TYPE__REFERENCE_UID,
					newReferenceUID, newReferenceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPressure() {
		return pressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPressure(DoubleBaseType newPressure, NotificationChain msgs) {
		DoubleBaseType oldPressure = pressure;
		pressure = newPressure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERNAL_PRESSURE_TYPE__PRESSURE, oldPressure, newPressure);
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
	public void setPressure(DoubleBaseType newPressure) {
		if (newPressure != pressure) {
			NotificationChain msgs = null;
			if (pressure != null)
				msgs = ((InternalEObject) pressure).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERNAL_PRESSURE_TYPE__PRESSURE, null, msgs);
			if (newPressure != null)
				msgs = ((InternalEObject) newPressure).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERNAL_PRESSURE_TYPE__PRESSURE, null, msgs);
			msgs = basicSetPressure(newPressure, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.INTERNAL_PRESSURE_TYPE__PRESSURE,
					newPressure, newPressure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.INTERNAL_PRESSURE_TYPE__REFERENCE_UID:
			return basicSetReferenceUID(null, msgs);
		case CpacsPackage.INTERNAL_PRESSURE_TYPE__PRESSURE:
			return basicSetPressure(null, msgs);
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
		case CpacsPackage.INTERNAL_PRESSURE_TYPE__REFERENCE_UID:
			return getReferenceUID();
		case CpacsPackage.INTERNAL_PRESSURE_TYPE__PRESSURE:
			return getPressure();
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
		case CpacsPackage.INTERNAL_PRESSURE_TYPE__REFERENCE_UID:
			setReferenceUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.INTERNAL_PRESSURE_TYPE__PRESSURE:
			setPressure((DoubleBaseType) newValue);
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
		case CpacsPackage.INTERNAL_PRESSURE_TYPE__REFERENCE_UID:
			setReferenceUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.INTERNAL_PRESSURE_TYPE__PRESSURE:
			setPressure((DoubleBaseType) null);
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
		case CpacsPackage.INTERNAL_PRESSURE_TYPE__REFERENCE_UID:
			return referenceUID != null;
		case CpacsPackage.INTERNAL_PRESSURE_TYPE__PRESSURE:
			return pressure != null;
		}
		return super.eIsSet(featureID);
	}

} //InternalPressureTypeImpl
