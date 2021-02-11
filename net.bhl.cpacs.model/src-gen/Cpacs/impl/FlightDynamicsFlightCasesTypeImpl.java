/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightDynamicsFlightCaseType;
import Cpacs.FlightDynamicsFlightCasesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Dynamics Flight Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightDynamicsFlightCasesTypeImpl#getFlightCase <em>Flight Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightDynamicsFlightCasesTypeImpl extends ComplexBaseTypeImpl implements FlightDynamicsFlightCasesType {
	/**
	 * The cached value of the '{@link #getFlightCase() <em>Flight Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightCase()
	 * @generated
	 * @ordered
	 */
	protected EList<FlightDynamicsFlightCaseType> flightCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightDynamicsFlightCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightDynamicsFlightCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlightDynamicsFlightCaseType> getFlightCase() {
		if (flightCase == null) {
			flightCase = new EObjectContainmentEList<FlightDynamicsFlightCaseType>(FlightDynamicsFlightCaseType.class,
					this, CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASES_TYPE__FLIGHT_CASE);
		}
		return flightCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASES_TYPE__FLIGHT_CASE:
			return ((InternalEList<?>) getFlightCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASES_TYPE__FLIGHT_CASE:
			return getFlightCase();
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
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASES_TYPE__FLIGHT_CASE:
			getFlightCase().clear();
			getFlightCase().addAll((Collection<? extends FlightDynamicsFlightCaseType>) newValue);
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
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASES_TYPE__FLIGHT_CASE:
			getFlightCase().clear();
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
		case CpacsPackage.FLIGHT_DYNAMICS_FLIGHT_CASES_TYPE__FLIGHT_CASE:
			return flightCase != null && !flightCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlightDynamicsFlightCasesTypeImpl
