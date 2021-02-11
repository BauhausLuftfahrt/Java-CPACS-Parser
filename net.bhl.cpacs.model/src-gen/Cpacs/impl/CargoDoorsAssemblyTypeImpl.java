/**
 */
package Cpacs.impl;

import Cpacs.CargoDoorsAssemblyType;
import Cpacs.CpacsPackage;
import Cpacs.DoorAssemblyPositionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cargo Doors Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CargoDoorsAssemblyTypeImpl#getCargoDoor <em>Cargo Door</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CargoDoorsAssemblyTypeImpl extends ComplexBaseTypeImpl implements CargoDoorsAssemblyType {
	/**
	 * The cached value of the '{@link #getCargoDoor() <em>Cargo Door</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoDoor()
	 * @generated
	 * @ordered
	 */
	protected EList<DoorAssemblyPositionType> cargoDoor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CargoDoorsAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCargoDoorsAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DoorAssemblyPositionType> getCargoDoor() {
		if (cargoDoor == null) {
			cargoDoor = new EObjectContainmentEList<DoorAssemblyPositionType>(DoorAssemblyPositionType.class, this,
					CpacsPackage.CARGO_DOORS_ASSEMBLY_TYPE__CARGO_DOOR);
		}
		return cargoDoor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CARGO_DOORS_ASSEMBLY_TYPE__CARGO_DOOR:
			return ((InternalEList<?>) getCargoDoor()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CARGO_DOORS_ASSEMBLY_TYPE__CARGO_DOOR:
			return getCargoDoor();
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
		case CpacsPackage.CARGO_DOORS_ASSEMBLY_TYPE__CARGO_DOOR:
			getCargoDoor().clear();
			getCargoDoor().addAll((Collection<? extends DoorAssemblyPositionType>) newValue);
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
		case CpacsPackage.CARGO_DOORS_ASSEMBLY_TYPE__CARGO_DOOR:
			getCargoDoor().clear();
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
		case CpacsPackage.CARGO_DOORS_ASSEMBLY_TYPE__CARGO_DOOR:
			return cargoDoor != null && !cargoDoor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CargoDoorsAssemblyTypeImpl
