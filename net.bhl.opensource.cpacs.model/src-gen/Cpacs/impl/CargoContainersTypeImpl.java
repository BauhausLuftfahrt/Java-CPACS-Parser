/**
 */
package Cpacs.impl;

import Cpacs.CargoContainerType;
import Cpacs.CargoContainersType;
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
 * An implementation of the model object '<em><b>Cargo Containers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CargoContainersTypeImpl#getCargoContainer <em>Cargo Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CargoContainersTypeImpl extends ComplexBaseTypeImpl implements CargoContainersType {
	/**
	 * The cached value of the '{@link #getCargoContainer() <em>Cargo Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<CargoContainerType> cargoContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CargoContainersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCargoContainersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CargoContainerType> getCargoContainer() {
		if (cargoContainer == null) {
			cargoContainer = new EObjectContainmentEList<CargoContainerType>(CargoContainerType.class, this,
					CpacsPackage.CARGO_CONTAINERS_TYPE__CARGO_CONTAINER);
		}
		return cargoContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CARGO_CONTAINERS_TYPE__CARGO_CONTAINER:
			return ((InternalEList<?>) getCargoContainer()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CARGO_CONTAINERS_TYPE__CARGO_CONTAINER:
			return getCargoContainer();
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
		case CpacsPackage.CARGO_CONTAINERS_TYPE__CARGO_CONTAINER:
			getCargoContainer().clear();
			getCargoContainer().addAll((Collection<? extends CargoContainerType>) newValue);
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
		case CpacsPackage.CARGO_CONTAINERS_TYPE__CARGO_CONTAINER:
			getCargoContainer().clear();
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
		case CpacsPackage.CARGO_CONTAINERS_TYPE__CARGO_CONTAINER:
			return cargoContainer != null && !cargoContainer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CargoContainersTypeImpl
