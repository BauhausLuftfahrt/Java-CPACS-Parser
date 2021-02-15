/**
 */
package Cpacs.impl;

import Cpacs.AirfoilAeroPerformanceType;
import Cpacs.AirfoilsAeroPerformanceType;
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
 * An implementation of the model object '<em><b>Airfoils Aero Performance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AirfoilsAeroPerformanceTypeImpl#getAirfoilAeroPerformance <em>Airfoil Aero Performance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirfoilsAeroPerformanceTypeImpl extends ComplexBaseTypeImpl implements AirfoilsAeroPerformanceType {
	/**
	 * The cached value of the '{@link #getAirfoilAeroPerformance() <em>Airfoil Aero Performance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirfoilAeroPerformance()
	 * @generated
	 * @ordered
	 */
	protected EList<AirfoilAeroPerformanceType> airfoilAeroPerformance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AirfoilsAeroPerformanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAirfoilsAeroPerformanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AirfoilAeroPerformanceType> getAirfoilAeroPerformance() {
		if (airfoilAeroPerformance == null) {
			airfoilAeroPerformance = new EObjectContainmentEList<AirfoilAeroPerformanceType>(
					AirfoilAeroPerformanceType.class, this,
					CpacsPackage.AIRFOILS_AERO_PERFORMANCE_TYPE__AIRFOIL_AERO_PERFORMANCE);
		}
		return airfoilAeroPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AIRFOILS_AERO_PERFORMANCE_TYPE__AIRFOIL_AERO_PERFORMANCE:
			return ((InternalEList<?>) getAirfoilAeroPerformance()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.AIRFOILS_AERO_PERFORMANCE_TYPE__AIRFOIL_AERO_PERFORMANCE:
			return getAirfoilAeroPerformance();
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
		case CpacsPackage.AIRFOILS_AERO_PERFORMANCE_TYPE__AIRFOIL_AERO_PERFORMANCE:
			getAirfoilAeroPerformance().clear();
			getAirfoilAeroPerformance().addAll((Collection<? extends AirfoilAeroPerformanceType>) newValue);
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
		case CpacsPackage.AIRFOILS_AERO_PERFORMANCE_TYPE__AIRFOIL_AERO_PERFORMANCE:
			getAirfoilAeroPerformance().clear();
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
		case CpacsPackage.AIRFOILS_AERO_PERFORMANCE_TYPE__AIRFOIL_AERO_PERFORMANCE:
			return airfoilAeroPerformance != null && !airfoilAeroPerformance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AirfoilsAeroPerformanceTypeImpl
