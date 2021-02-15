/**
 */
package Cpacs.impl;

import Cpacs.CabinFloorElementType;
import Cpacs.CabinFloorElementsType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cabin Floor Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CabinFloorElementsTypeImpl#getFloorElement <em>Floor Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CabinFloorElementsTypeImpl extends ComplexBaseTypeImpl implements CabinFloorElementsType {
	/**
	 * The cached value of the '{@link #getFloorElement() <em>Floor Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloorElement()
	 * @generated
	 * @ordered
	 */
	protected EList<CabinFloorElementType> floorElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CabinFloorElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCabinFloorElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CabinFloorElementType> getFloorElement() {
		if (floorElement == null) {
			floorElement = new EObjectContainmentEList<CabinFloorElementType>(CabinFloorElementType.class, this,
					CpacsPackage.CABIN_FLOOR_ELEMENTS_TYPE__FLOOR_ELEMENT);
		}
		return floorElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CABIN_FLOOR_ELEMENTS_TYPE__FLOOR_ELEMENT:
			return ((InternalEList<?>) getFloorElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CABIN_FLOOR_ELEMENTS_TYPE__FLOOR_ELEMENT:
			return getFloorElement();
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
		case CpacsPackage.CABIN_FLOOR_ELEMENTS_TYPE__FLOOR_ELEMENT:
			getFloorElement().clear();
			getFloorElement().addAll((Collection<? extends CabinFloorElementType>) newValue);
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
		case CpacsPackage.CABIN_FLOOR_ELEMENTS_TYPE__FLOOR_ELEMENT:
			getFloorElement().clear();
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
		case CpacsPackage.CABIN_FLOOR_ELEMENTS_TYPE__FLOOR_ELEMENT:
			return floorElement != null && !floorElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CabinFloorElementsTypeImpl
