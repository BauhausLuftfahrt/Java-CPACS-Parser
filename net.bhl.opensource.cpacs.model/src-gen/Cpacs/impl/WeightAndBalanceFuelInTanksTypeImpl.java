/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WeightAndBalanceFuelInTankType;
import Cpacs.WeightAndBalanceFuelInTanksType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weight And Balance Fuel In Tanks Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WeightAndBalanceFuelInTanksTypeImpl#getFuelInTank <em>Fuel In Tank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeightAndBalanceFuelInTanksTypeImpl extends ComplexBaseTypeImpl
		implements WeightAndBalanceFuelInTanksType {
	/**
	 * The cached value of the '{@link #getFuelInTank() <em>Fuel In Tank</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelInTank()
	 * @generated
	 * @ordered
	 */
	protected EList<WeightAndBalanceFuelInTankType> fuelInTank;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeightAndBalanceFuelInTanksTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWeightAndBalanceFuelInTanksType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeightAndBalanceFuelInTankType> getFuelInTank() {
		if (fuelInTank == null) {
			fuelInTank = new EObjectContainmentEList<WeightAndBalanceFuelInTankType>(
					WeightAndBalanceFuelInTankType.class, this,
					CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANKS_TYPE__FUEL_IN_TANK);
		}
		return fuelInTank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANKS_TYPE__FUEL_IN_TANK:
			return ((InternalEList<?>) getFuelInTank()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANKS_TYPE__FUEL_IN_TANK:
			return getFuelInTank();
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
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANKS_TYPE__FUEL_IN_TANK:
			getFuelInTank().clear();
			getFuelInTank().addAll((Collection<? extends WeightAndBalanceFuelInTankType>) newValue);
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
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANKS_TYPE__FUEL_IN_TANK:
			getFuelInTank().clear();
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
		case CpacsPackage.WEIGHT_AND_BALANCE_FUEL_IN_TANKS_TYPE__FUEL_IN_TANK:
			return fuelInTank != null && !fuelInTank.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WeightAndBalanceFuelInTanksTypeImpl
