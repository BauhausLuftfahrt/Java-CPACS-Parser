/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LandingGearSettingType;
import Cpacs.LoadCaseLandingGearsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Landing Gears Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseLandingGearsTypeImpl#getLandingGear <em>Landing Gear</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseLandingGearsTypeImpl extends ComplexBaseTypeImpl implements LoadCaseLandingGearsType {
	/**
	 * The cached value of the '{@link #getLandingGear() <em>Landing Gear</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGear()
	 * @generated
	 * @ordered
	 */
	protected EList<LandingGearSettingType> landingGear;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseLandingGearsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseLandingGearsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LandingGearSettingType> getLandingGear() {
		if (landingGear == null) {
			landingGear = new EObjectContainmentEList<LandingGearSettingType>(LandingGearSettingType.class, this,
					CpacsPackage.LOAD_CASE_LANDING_GEARS_TYPE__LANDING_GEAR);
		}
		return landingGear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_LANDING_GEARS_TYPE__LANDING_GEAR:
			return ((InternalEList<?>) getLandingGear()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LOAD_CASE_LANDING_GEARS_TYPE__LANDING_GEAR:
			return getLandingGear();
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
		case CpacsPackage.LOAD_CASE_LANDING_GEARS_TYPE__LANDING_GEAR:
			getLandingGear().clear();
			getLandingGear().addAll((Collection<? extends LandingGearSettingType>) newValue);
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
		case CpacsPackage.LOAD_CASE_LANDING_GEARS_TYPE__LANDING_GEAR:
			getLandingGear().clear();
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
		case CpacsPackage.LOAD_CASE_LANDING_GEARS_TYPE__LANDING_GEAR:
			return landingGear != null && !landingGear.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseLandingGearsTypeImpl
