/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CurvePointType;
import Cpacs.DoubleBaseType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CurvePointTypeImpl#getEta <em>Eta</em>}</li>
 *   <li>{@link Cpacs.impl.CurvePointTypeImpl#getReferenceUID <em>Reference UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurvePointTypeImpl extends ComplexBaseTypeImpl implements CurvePointType {
	/**
	 * The cached value of the '{@link #getEta() <em>Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEta()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType eta;

	/**
	 * The cached value of the '{@link #getReferenceUID() <em>Reference UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceUID()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType referenceUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurvePointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCurvePointType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getEta() {
		return eta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEta(DoubleBaseType newEta, NotificationChain msgs) {
		DoubleBaseType oldEta = eta;
		eta = newEta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CURVE_POINT_TYPE__ETA, oldEta, newEta);
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
	public void setEta(DoubleBaseType newEta) {
		if (newEta != eta) {
			NotificationChain msgs = null;
			if (eta != null)
				msgs = ((InternalEObject) eta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_POINT_TYPE__ETA, null, msgs);
			if (newEta != null)
				msgs = ((InternalEObject) newEta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_POINT_TYPE__ETA, null, msgs);
			msgs = basicSetEta(newEta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CURVE_POINT_TYPE__ETA, newEta, newEta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getReferenceUID() {
		return referenceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceUID(StringBaseType newReferenceUID, NotificationChain msgs) {
		StringBaseType oldReferenceUID = referenceUID;
		referenceUID = newReferenceUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CURVE_POINT_TYPE__REFERENCE_UID, oldReferenceUID, newReferenceUID);
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
	public void setReferenceUID(StringBaseType newReferenceUID) {
		if (newReferenceUID != referenceUID) {
			NotificationChain msgs = null;
			if (referenceUID != null)
				msgs = ((InternalEObject) referenceUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_POINT_TYPE__REFERENCE_UID, null, msgs);
			if (newReferenceUID != null)
				msgs = ((InternalEObject) newReferenceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CURVE_POINT_TYPE__REFERENCE_UID, null, msgs);
			msgs = basicSetReferenceUID(newReferenceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CURVE_POINT_TYPE__REFERENCE_UID,
					newReferenceUID, newReferenceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CURVE_POINT_TYPE__ETA:
			return basicSetEta(null, msgs);
		case CpacsPackage.CURVE_POINT_TYPE__REFERENCE_UID:
			return basicSetReferenceUID(null, msgs);
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
		case CpacsPackage.CURVE_POINT_TYPE__ETA:
			return getEta();
		case CpacsPackage.CURVE_POINT_TYPE__REFERENCE_UID:
			return getReferenceUID();
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
		case CpacsPackage.CURVE_POINT_TYPE__ETA:
			setEta((DoubleBaseType) newValue);
			return;
		case CpacsPackage.CURVE_POINT_TYPE__REFERENCE_UID:
			setReferenceUID((StringBaseType) newValue);
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
		case CpacsPackage.CURVE_POINT_TYPE__ETA:
			setEta((DoubleBaseType) null);
			return;
		case CpacsPackage.CURVE_POINT_TYPE__REFERENCE_UID:
			setReferenceUID((StringBaseType) null);
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
		case CpacsPackage.CURVE_POINT_TYPE__ETA:
			return eta != null;
		case CpacsPackage.CURVE_POINT_TYPE__REFERENCE_UID:
			return referenceUID != null;
		}
		return super.eIsSet(featureID);
	}

} //CurvePointTypeImpl
