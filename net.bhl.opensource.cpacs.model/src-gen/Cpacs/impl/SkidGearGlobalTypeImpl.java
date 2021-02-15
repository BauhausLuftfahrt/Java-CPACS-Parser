/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.SkidGearGlobalType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skid Gear Global Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SkidGearGlobalTypeImpl#getTotalLength <em>Total Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkidGearGlobalTypeImpl extends ComplexBaseTypeImpl implements SkidGearGlobalType {
	/**
	 * The cached value of the '{@link #getTotalLength() <em>Total Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLength()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType totalLength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkidGearGlobalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSkidGearGlobalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTotalLength() {
		return totalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalLength(DoubleBaseType newTotalLength, NotificationChain msgs) {
		DoubleBaseType oldTotalLength = totalLength;
		totalLength = newTotalLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SKID_GEAR_GLOBAL_TYPE__TOTAL_LENGTH, oldTotalLength, newTotalLength);
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
	public void setTotalLength(DoubleBaseType newTotalLength) {
		if (newTotalLength != totalLength) {
			NotificationChain msgs = null;
			if (totalLength != null)
				msgs = ((InternalEObject) totalLength).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKID_GEAR_GLOBAL_TYPE__TOTAL_LENGTH, null, msgs);
			if (newTotalLength != null)
				msgs = ((InternalEObject) newTotalLength).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SKID_GEAR_GLOBAL_TYPE__TOTAL_LENGTH, null, msgs);
			msgs = basicSetTotalLength(newTotalLength, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SKID_GEAR_GLOBAL_TYPE__TOTAL_LENGTH,
					newTotalLength, newTotalLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SKID_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			return basicSetTotalLength(null, msgs);
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
		case CpacsPackage.SKID_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			return getTotalLength();
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
		case CpacsPackage.SKID_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			setTotalLength((DoubleBaseType) newValue);
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
		case CpacsPackage.SKID_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			setTotalLength((DoubleBaseType) null);
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
		case CpacsPackage.SKID_GEAR_GLOBAL_TYPE__TOTAL_LENGTH:
			return totalLength != null;
		}
		return super.eIsSet(featureID);
	}

} //SkidGearGlobalTypeImpl
