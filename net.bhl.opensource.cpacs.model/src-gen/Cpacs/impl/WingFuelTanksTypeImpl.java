/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WingFuelTankType;
import Cpacs.WingFuelTanksType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Fuel Tanks Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingFuelTanksTypeImpl#getWingFuelTank <em>Wing Fuel Tank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingFuelTanksTypeImpl extends ComplexBaseTypeImpl implements WingFuelTanksType {
	/**
	 * The cached value of the '{@link #getWingFuelTank() <em>Wing Fuel Tank</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingFuelTank()
	 * @generated
	 * @ordered
	 */
	protected EList<WingFuelTankType> wingFuelTank;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingFuelTanksTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingFuelTanksType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WingFuelTankType> getWingFuelTank() {
		if (wingFuelTank == null) {
			wingFuelTank = new EObjectContainmentEList<WingFuelTankType>(WingFuelTankType.class, this,
					CpacsPackage.WING_FUEL_TANKS_TYPE__WING_FUEL_TANK);
		}
		return wingFuelTank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_FUEL_TANKS_TYPE__WING_FUEL_TANK:
			return ((InternalEList<?>) getWingFuelTank()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WING_FUEL_TANKS_TYPE__WING_FUEL_TANK:
			return getWingFuelTank();
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
		case CpacsPackage.WING_FUEL_TANKS_TYPE__WING_FUEL_TANK:
			getWingFuelTank().clear();
			getWingFuelTank().addAll((Collection<? extends WingFuelTankType>) newValue);
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
		case CpacsPackage.WING_FUEL_TANKS_TYPE__WING_FUEL_TANK:
			getWingFuelTank().clear();
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
		case CpacsPackage.WING_FUEL_TANKS_TYPE__WING_FUEL_TANK:
			return wingFuelTank != null && !wingFuelTank.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WingFuelTanksTypeImpl
