/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoorSurroundStructurePositionType;
import Cpacs.DoorSurroundStructuresAssemblyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door Surround Structures Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DoorSurroundStructuresAssemblyTypeImpl#getDoorSurroundStructure <em>Door Surround Structure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoorSurroundStructuresAssemblyTypeImpl extends ComplexBaseTypeImpl
		implements DoorSurroundStructuresAssemblyType {
	/**
	 * The cached value of the '{@link #getDoorSurroundStructure() <em>Door Surround Structure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorSurroundStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<DoorSurroundStructurePositionType> doorSurroundStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoorSurroundStructuresAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDoorSurroundStructuresAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DoorSurroundStructurePositionType> getDoorSurroundStructure() {
		if (doorSurroundStructure == null) {
			doorSurroundStructure = new EObjectContainmentEList<DoorSurroundStructurePositionType>(
					DoorSurroundStructurePositionType.class, this,
					CpacsPackage.DOOR_SURROUND_STRUCTURES_ASSEMBLY_TYPE__DOOR_SURROUND_STRUCTURE);
		}
		return doorSurroundStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DOOR_SURROUND_STRUCTURES_ASSEMBLY_TYPE__DOOR_SURROUND_STRUCTURE:
			return ((InternalEList<?>) getDoorSurroundStructure()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.DOOR_SURROUND_STRUCTURES_ASSEMBLY_TYPE__DOOR_SURROUND_STRUCTURE:
			return getDoorSurroundStructure();
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
		case CpacsPackage.DOOR_SURROUND_STRUCTURES_ASSEMBLY_TYPE__DOOR_SURROUND_STRUCTURE:
			getDoorSurroundStructure().clear();
			getDoorSurroundStructure().addAll((Collection<? extends DoorSurroundStructurePositionType>) newValue);
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
		case CpacsPackage.DOOR_SURROUND_STRUCTURES_ASSEMBLY_TYPE__DOOR_SURROUND_STRUCTURE:
			getDoorSurroundStructure().clear();
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
		case CpacsPackage.DOOR_SURROUND_STRUCTURES_ASSEMBLY_TYPE__DOOR_SURROUND_STRUCTURE:
			return doorSurroundStructure != null && !doorSurroundStructure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DoorSurroundStructuresAssemblyTypeImpl
