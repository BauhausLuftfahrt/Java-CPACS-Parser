/**
 */
package Cpacs.impl;

import Cpacs.CargoContainerElementType;
import Cpacs.CargoContainerElementsType;
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
 * An implementation of the model object '<em><b>Cargo Container Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CargoContainerElementsTypeImpl#getCargoContainerElement <em>Cargo Container Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CargoContainerElementsTypeImpl extends ComplexBaseTypeImpl implements CargoContainerElementsType {
	/**
	 * The cached value of the '{@link #getCargoContainerElement() <em>Cargo Container Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoContainerElement()
	 * @generated
	 * @ordered
	 */
	protected EList<CargoContainerElementType> cargoContainerElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CargoContainerElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCargoContainerElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CargoContainerElementType> getCargoContainerElement() {
		if (cargoContainerElement == null) {
			cargoContainerElement = new EObjectContainmentEList<CargoContainerElementType>(
					CargoContainerElementType.class, this,
					CpacsPackage.CARGO_CONTAINER_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENT);
		}
		return cargoContainerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CARGO_CONTAINER_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENT:
			return ((InternalEList<?>) getCargoContainerElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CARGO_CONTAINER_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENT:
			return getCargoContainerElement();
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
		case CpacsPackage.CARGO_CONTAINER_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENT:
			getCargoContainerElement().clear();
			getCargoContainerElement().addAll((Collection<? extends CargoContainerElementType>) newValue);
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
		case CpacsPackage.CARGO_CONTAINER_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENT:
			getCargoContainerElement().clear();
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
		case CpacsPackage.CARGO_CONTAINER_ELEMENTS_TYPE__CARGO_CONTAINER_ELEMENT:
			return cargoContainerElement != null && !cargoContainerElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CargoContainerElementsTypeImpl
