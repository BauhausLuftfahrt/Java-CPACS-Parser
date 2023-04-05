/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightPerformanceRequirementType;
import Cpacs.FlightPerformanceRequirementsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Performance Requirements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightPerformanceRequirementsTypeImpl#getFlightPerformanceRequirement <em>Flight Performance Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPerformanceRequirementsTypeImpl extends ComplexBaseTypeImpl
		implements FlightPerformanceRequirementsType {
	/**
	 * The cached value of the '{@link #getFlightPerformanceRequirement() <em>Flight Performance Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightPerformanceRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<FlightPerformanceRequirementType> flightPerformanceRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightPerformanceRequirementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightPerformanceRequirementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlightPerformanceRequirementType> getFlightPerformanceRequirement() {
		if (flightPerformanceRequirement == null) {
			flightPerformanceRequirement = new EObjectContainmentEList<FlightPerformanceRequirementType>(
					FlightPerformanceRequirementType.class, this,
					CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENT);
		}
		return flightPerformanceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENT:
			return ((InternalEList<?>) getFlightPerformanceRequirement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENT:
			return getFlightPerformanceRequirement();
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
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENT:
			getFlightPerformanceRequirement().clear();
			getFlightPerformanceRequirement().addAll((Collection<? extends FlightPerformanceRequirementType>) newValue);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENT:
			getFlightPerformanceRequirement().clear();
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
		case CpacsPackage.FLIGHT_PERFORMANCE_REQUIREMENTS_TYPE__FLIGHT_PERFORMANCE_REQUIREMENT:
			return flightPerformanceRequirement != null && !flightPerformanceRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlightPerformanceRequirementsTypeImpl
