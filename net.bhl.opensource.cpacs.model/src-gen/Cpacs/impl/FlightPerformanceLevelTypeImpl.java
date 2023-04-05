/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FlightPerformanceLevelType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Performance Level Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightPerformanceLevelTypeImpl#getSpecificExcessPower <em>Specific Excess Power</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPerformanceLevelTypeImpl extends ComplexBaseTypeImpl implements FlightPerformanceLevelType {
	/**
	 * The cached value of the '{@link #getSpecificExcessPower() <em>Specific Excess Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificExcessPower()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType specificExcessPower;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightPerformanceLevelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightPerformanceLevelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSpecificExcessPower() {
		return specificExcessPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificExcessPower(DoubleBaseType newSpecificExcessPower,
			NotificationChain msgs) {
		DoubleBaseType oldSpecificExcessPower = specificExcessPower;
		specificExcessPower = newSpecificExcessPower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_LEVEL_TYPE__SPECIFIC_EXCESS_POWER, oldSpecificExcessPower,
					newSpecificExcessPower);
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
	public void setSpecificExcessPower(DoubleBaseType newSpecificExcessPower) {
		if (newSpecificExcessPower != specificExcessPower) {
			NotificationChain msgs = null;
			if (specificExcessPower != null)
				msgs = ((InternalEObject) specificExcessPower).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_LEVEL_TYPE__SPECIFIC_EXCESS_POWER,
						null, msgs);
			if (newSpecificExcessPower != null)
				msgs = ((InternalEObject) newSpecificExcessPower).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_LEVEL_TYPE__SPECIFIC_EXCESS_POWER,
						null, msgs);
			msgs = basicSetSpecificExcessPower(newSpecificExcessPower, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_LEVEL_TYPE__SPECIFIC_EXCESS_POWER, newSpecificExcessPower,
					newSpecificExcessPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_PERFORMANCE_LEVEL_TYPE__SPECIFIC_EXCESS_POWER:
			return basicSetSpecificExcessPower(null, msgs);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_LEVEL_TYPE__SPECIFIC_EXCESS_POWER:
			return getSpecificExcessPower();
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
		case CpacsPackage.FLIGHT_PERFORMANCE_LEVEL_TYPE__SPECIFIC_EXCESS_POWER:
			setSpecificExcessPower((DoubleBaseType) newValue);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_LEVEL_TYPE__SPECIFIC_EXCESS_POWER:
			setSpecificExcessPower((DoubleBaseType) null);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_LEVEL_TYPE__SPECIFIC_EXCESS_POWER:
			return specificExcessPower != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightPerformanceLevelTypeImpl
