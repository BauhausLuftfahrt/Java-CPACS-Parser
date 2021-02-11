/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FuselageFuelTankType;
import Cpacs.FuselageFuelTanksType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuselage Fuel Tanks Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuselageFuelTanksTypeImpl#getFuselageFuelTank <em>Fuselage Fuel Tank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuselageFuelTanksTypeImpl extends ComplexBaseTypeImpl implements FuselageFuelTanksType {
	/**
	 * The cached value of the '{@link #getFuselageFuelTank() <em>Fuselage Fuel Tank</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageFuelTank()
	 * @generated
	 * @ordered
	 */
	protected EList<FuselageFuelTankType> fuselageFuelTank;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuselageFuelTanksTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuselageFuelTanksType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FuselageFuelTankType> getFuselageFuelTank() {
		if (fuselageFuelTank == null) {
			fuselageFuelTank = new EObjectContainmentEList<FuselageFuelTankType>(FuselageFuelTankType.class, this,
					CpacsPackage.FUSELAGE_FUEL_TANKS_TYPE__FUSELAGE_FUEL_TANK);
		}
		return fuselageFuelTank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FUSELAGE_FUEL_TANKS_TYPE__FUSELAGE_FUEL_TANK:
			return ((InternalEList<?>) getFuselageFuelTank()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FUSELAGE_FUEL_TANKS_TYPE__FUSELAGE_FUEL_TANK:
			return getFuselageFuelTank();
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
		case CpacsPackage.FUSELAGE_FUEL_TANKS_TYPE__FUSELAGE_FUEL_TANK:
			getFuselageFuelTank().clear();
			getFuselageFuelTank().addAll((Collection<? extends FuselageFuelTankType>) newValue);
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
		case CpacsPackage.FUSELAGE_FUEL_TANKS_TYPE__FUSELAGE_FUEL_TANK:
			getFuselageFuelTank().clear();
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
		case CpacsPackage.FUSELAGE_FUEL_TANKS_TYPE__FUSELAGE_FUEL_TANK:
			return fuselageFuelTank != null && !fuselageFuelTank.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FuselageFuelTanksTypeImpl
