/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightPerformanceCaseType;
import Cpacs.FlightPerformanceCasesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Performance Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightPerformanceCasesTypeImpl#getFlightPerformanceCase <em>Flight Performance Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPerformanceCasesTypeImpl extends ComplexBaseTypeImpl implements FlightPerformanceCasesType {
	/**
	 * The cached value of the '{@link #getFlightPerformanceCase() <em>Flight Performance Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightPerformanceCase()
	 * @generated
	 * @ordered
	 */
	protected EList<FlightPerformanceCaseType> flightPerformanceCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightPerformanceCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightPerformanceCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlightPerformanceCaseType> getFlightPerformanceCase() {
		if (flightPerformanceCase == null) {
			flightPerformanceCase = new EObjectContainmentEList<FlightPerformanceCaseType>(
					FlightPerformanceCaseType.class, this,
					CpacsPackage.FLIGHT_PERFORMANCE_CASES_TYPE__FLIGHT_PERFORMANCE_CASE);
		}
		return flightPerformanceCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_PERFORMANCE_CASES_TYPE__FLIGHT_PERFORMANCE_CASE:
			return ((InternalEList<?>) getFlightPerformanceCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASES_TYPE__FLIGHT_PERFORMANCE_CASE:
			return getFlightPerformanceCase();
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASES_TYPE__FLIGHT_PERFORMANCE_CASE:
			getFlightPerformanceCase().clear();
			getFlightPerformanceCase().addAll((Collection<? extends FlightPerformanceCaseType>) newValue);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASES_TYPE__FLIGHT_PERFORMANCE_CASE:
			getFlightPerformanceCase().clear();
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASES_TYPE__FLIGHT_PERFORMANCE_CASE:
			return flightPerformanceCase != null && !flightPerformanceCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlightPerformanceCasesTypeImpl
