/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.IntegerBaseType;
import Cpacs.MRibType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MRib Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MRibTypeImpl#getRibNumber <em>Rib Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MRibTypeImpl extends GenericMassTypeImpl implements MRibType {
	/**
	 * The cached value of the '{@link #getRibNumber() <em>Rib Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibNumber()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType ribNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRibTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMRibType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getRibNumber() {
		return ribNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRibNumber(IntegerBaseType newRibNumber, NotificationChain msgs) {
		IntegerBaseType oldRibNumber = ribNumber;
		ribNumber = newRibNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MRIB_TYPE__RIB_NUMBER, oldRibNumber, newRibNumber);
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
	public void setRibNumber(IntegerBaseType newRibNumber) {
		if (newRibNumber != ribNumber) {
			NotificationChain msgs = null;
			if (ribNumber != null)
				msgs = ((InternalEObject) ribNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MRIB_TYPE__RIB_NUMBER, null, msgs);
			if (newRibNumber != null)
				msgs = ((InternalEObject) newRibNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MRIB_TYPE__RIB_NUMBER, null, msgs);
			msgs = basicSetRibNumber(newRibNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MRIB_TYPE__RIB_NUMBER, newRibNumber,
					newRibNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MRIB_TYPE__RIB_NUMBER:
			return basicSetRibNumber(null, msgs);
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
		case CpacsPackage.MRIB_TYPE__RIB_NUMBER:
			return getRibNumber();
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
		case CpacsPackage.MRIB_TYPE__RIB_NUMBER:
			setRibNumber((IntegerBaseType) newValue);
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
		case CpacsPackage.MRIB_TYPE__RIB_NUMBER:
			setRibNumber((IntegerBaseType) null);
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
		case CpacsPackage.MRIB_TYPE__RIB_NUMBER:
			return ribNumber != null;
		}
		return super.eIsSet(featureID);
	}

} //MRibTypeImpl
