/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightLoadCaseType;
import Cpacs.FlightLoadCasesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Load Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightLoadCasesTypeImpl#getFlightLoadCase <em>Flight Load Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightLoadCasesTypeImpl extends ComplexBaseTypeImpl implements FlightLoadCasesType {
	/**
	 * The cached value of the '{@link #getFlightLoadCase() <em>Flight Load Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightLoadCase()
	 * @generated
	 * @ordered
	 */
	protected EList<FlightLoadCaseType> flightLoadCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightLoadCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightLoadCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlightLoadCaseType> getFlightLoadCase() {
		if (flightLoadCase == null) {
			flightLoadCase = new EObjectContainmentEList<FlightLoadCaseType>(FlightLoadCaseType.class, this,
					CpacsPackage.FLIGHT_LOAD_CASES_TYPE__FLIGHT_LOAD_CASE);
		}
		return flightLoadCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_LOAD_CASES_TYPE__FLIGHT_LOAD_CASE:
			return ((InternalEList<?>) getFlightLoadCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FLIGHT_LOAD_CASES_TYPE__FLIGHT_LOAD_CASE:
			return getFlightLoadCase();
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
		case CpacsPackage.FLIGHT_LOAD_CASES_TYPE__FLIGHT_LOAD_CASE:
			getFlightLoadCase().clear();
			getFlightLoadCase().addAll((Collection<? extends FlightLoadCaseType>) newValue);
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
		case CpacsPackage.FLIGHT_LOAD_CASES_TYPE__FLIGHT_LOAD_CASE:
			getFlightLoadCase().clear();
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
		case CpacsPackage.FLIGHT_LOAD_CASES_TYPE__FLIGHT_LOAD_CASE:
			return flightLoadCase != null && !flightLoadCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlightLoadCasesTypeImpl
