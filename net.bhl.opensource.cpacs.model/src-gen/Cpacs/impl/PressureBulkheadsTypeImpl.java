/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PressureBulkheadType;
import Cpacs.PressureBulkheadsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pressure Bulkheads Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PressureBulkheadsTypeImpl#getPressureBulkhead <em>Pressure Bulkhead</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PressureBulkheadsTypeImpl extends ComplexBaseTypeImpl implements PressureBulkheadsType {
	/**
	 * The cached value of the '{@link #getPressureBulkhead() <em>Pressure Bulkhead</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressureBulkhead()
	 * @generated
	 * @ordered
	 */
	protected EList<PressureBulkheadType> pressureBulkhead;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PressureBulkheadsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPressureBulkheadsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PressureBulkheadType> getPressureBulkhead() {
		if (pressureBulkhead == null) {
			pressureBulkhead = new EObjectContainmentEList<PressureBulkheadType>(PressureBulkheadType.class, this,
					CpacsPackage.PRESSURE_BULKHEADS_TYPE__PRESSURE_BULKHEAD);
		}
		return pressureBulkhead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PRESSURE_BULKHEADS_TYPE__PRESSURE_BULKHEAD:
			return ((InternalEList<?>) getPressureBulkhead()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.PRESSURE_BULKHEADS_TYPE__PRESSURE_BULKHEAD:
			return getPressureBulkhead();
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
		case CpacsPackage.PRESSURE_BULKHEADS_TYPE__PRESSURE_BULKHEAD:
			getPressureBulkhead().clear();
			getPressureBulkhead().addAll((Collection<? extends PressureBulkheadType>) newValue);
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
		case CpacsPackage.PRESSURE_BULKHEADS_TYPE__PRESSURE_BULKHEAD:
			getPressureBulkhead().clear();
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
		case CpacsPackage.PRESSURE_BULKHEADS_TYPE__PRESSURE_BULKHEAD:
			return pressureBulkhead != null && !pressureBulkhead.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PressureBulkheadsTypeImpl
