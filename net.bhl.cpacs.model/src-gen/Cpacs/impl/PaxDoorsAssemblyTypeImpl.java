/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoorAssemblyPositionType;
import Cpacs.PaxDoorsAssemblyType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pax Doors Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PaxDoorsAssemblyTypeImpl#getPaxDoor <em>Pax Door</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaxDoorsAssemblyTypeImpl extends ComplexBaseTypeImpl implements PaxDoorsAssemblyType {
	/**
	 * The cached value of the '{@link #getPaxDoor() <em>Pax Door</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaxDoor()
	 * @generated
	 * @ordered
	 */
	protected EList<DoorAssemblyPositionType> paxDoor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaxDoorsAssemblyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPaxDoorsAssemblyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DoorAssemblyPositionType> getPaxDoor() {
		if (paxDoor == null) {
			paxDoor = new EObjectContainmentEList<DoorAssemblyPositionType>(DoorAssemblyPositionType.class, this,
					CpacsPackage.PAX_DOORS_ASSEMBLY_TYPE__PAX_DOOR);
		}
		return paxDoor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PAX_DOORS_ASSEMBLY_TYPE__PAX_DOOR:
			return ((InternalEList<?>) getPaxDoor()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.PAX_DOORS_ASSEMBLY_TYPE__PAX_DOOR:
			return getPaxDoor();
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
		case CpacsPackage.PAX_DOORS_ASSEMBLY_TYPE__PAX_DOOR:
			getPaxDoor().clear();
			getPaxDoor().addAll((Collection<? extends DoorAssemblyPositionType>) newValue);
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
		case CpacsPackage.PAX_DOORS_ASSEMBLY_TYPE__PAX_DOOR:
			getPaxDoor().clear();
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
		case CpacsPackage.PAX_DOORS_ASSEMBLY_TYPE__PAX_DOOR:
			return paxDoor != null && !paxDoor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PaxDoorsAssemblyTypeImpl
