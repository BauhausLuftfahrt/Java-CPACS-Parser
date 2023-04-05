/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckElementBaseType;
import Cpacs.GenericFloorElementsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Floor Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GenericFloorElementsTypeImpl#getGenericFloorElement <em>Generic Floor Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericFloorElementsTypeImpl extends ComplexBaseTypeImpl implements GenericFloorElementsType {
	/**
	 * The cached value of the '{@link #getGenericFloorElement() <em>Generic Floor Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericFloorElement()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckElementBaseType> genericFloorElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericFloorElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGenericFloorElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckElementBaseType> getGenericFloorElement() {
		if (genericFloorElement == null) {
			genericFloorElement = new EObjectContainmentEList<DeckElementBaseType>(DeckElementBaseType.class, this,
					CpacsPackage.GENERIC_FLOOR_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENT);
		}
		return genericFloorElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GENERIC_FLOOR_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENT:
			return ((InternalEList<?>) getGenericFloorElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GENERIC_FLOOR_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENT:
			return getGenericFloorElement();
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
		case CpacsPackage.GENERIC_FLOOR_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENT:
			getGenericFloorElement().clear();
			getGenericFloorElement().addAll((Collection<? extends DeckElementBaseType>) newValue);
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
		case CpacsPackage.GENERIC_FLOOR_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENT:
			getGenericFloorElement().clear();
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
		case CpacsPackage.GENERIC_FLOOR_ELEMENTS_TYPE__GENERIC_FLOOR_ELEMENT:
			return genericFloorElement != null && !genericFloorElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenericFloorElementsTypeImpl
