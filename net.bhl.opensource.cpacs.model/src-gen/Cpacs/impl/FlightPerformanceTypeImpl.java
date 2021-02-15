/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightPerformanceCasesType;
import Cpacs.FlightPerformanceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Performance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightPerformanceTypeImpl#getPerformanceCases <em>Performance Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPerformanceTypeImpl extends ComplexBaseTypeImpl implements FlightPerformanceType {
	/**
	 * The cached value of the '{@link #getPerformanceCases() <em>Performance Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceCases()
	 * @generated
	 * @ordered
	 */
	protected FlightPerformanceCasesType performanceCases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightPerformanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightPerformanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPerformanceCasesType getPerformanceCases() {
		return performanceCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceCases(FlightPerformanceCasesType newPerformanceCases,
			NotificationChain msgs) {
		FlightPerformanceCasesType oldPerformanceCases = performanceCases;
		performanceCases = newPerformanceCases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_TYPE__PERFORMANCE_CASES, oldPerformanceCases, newPerformanceCases);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformanceCases(FlightPerformanceCasesType newPerformanceCases) {
		if (newPerformanceCases != performanceCases) {
			NotificationChain msgs = null;
			if (performanceCases != null)
				msgs = ((InternalEObject) performanceCases).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_TYPE__PERFORMANCE_CASES, null, msgs);
			if (newPerformanceCases != null)
				msgs = ((InternalEObject) newPerformanceCases).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_TYPE__PERFORMANCE_CASES, null, msgs);
			msgs = basicSetPerformanceCases(newPerformanceCases, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_TYPE__PERFORMANCE_CASES, newPerformanceCases, newPerformanceCases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_PERFORMANCE_TYPE__PERFORMANCE_CASES:
			return basicSetPerformanceCases(null, msgs);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_TYPE__PERFORMANCE_CASES:
			return getPerformanceCases();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_PERFORMANCE_TYPE__PERFORMANCE_CASES:
			setPerformanceCases((FlightPerformanceCasesType) newValue);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_TYPE__PERFORMANCE_CASES:
			setPerformanceCases((FlightPerformanceCasesType) null);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_TYPE__PERFORMANCE_CASES:
			return performanceCases != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightPerformanceTypeImpl
