/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FlightDynamicsTrimResultType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Dynamics Trim Result Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightDynamicsTrimResultTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsTrimResultTypeImpl#getTrueAirSpeed <em>True Air Speed</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsTrimResultTypeImpl#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.impl.FlightDynamicsTrimResultTypeImpl#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightDynamicsTrimResultTypeImpl extends ComplexBaseTypeImpl implements FlightDynamicsTrimResultType {
	/**
	 * The cached value of the '{@link #getMachNumber() <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachNumber()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType machNumber;

	/**
	 * The cached value of the '{@link #getTrueAirSpeed() <em>True Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueAirSpeed()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType trueAirSpeed;

	/**
	 * The cached value of the '{@link #getAngleOfAttack() <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfAttack()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType angleOfAttack;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType altitude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightDynamicsTrimResultTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightDynamicsTrimResultType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMachNumber() {
		return machNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachNumber(DoubleBaseType newMachNumber, NotificationChain msgs) {
		DoubleBaseType oldMachNumber = machNumber;
		machNumber = newMachNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
	public void setMachNumber(DoubleBaseType newMachNumber) {
		if (newMachNumber != machNumber) {
			NotificationChain msgs = null;
			if (machNumber != null)
				msgs = ((InternalEObject) machNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH_NUMBER, null,
						msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH_NUMBER, null,
						msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH_NUMBER, newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTrueAirSpeed() {
		return trueAirSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrueAirSpeed(DoubleBaseType newTrueAirSpeed, NotificationChain msgs) {
		DoubleBaseType oldTrueAirSpeed = trueAirSpeed;
		trueAirSpeed = newTrueAirSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__TRUE_AIR_SPEED, oldTrueAirSpeed, newTrueAirSpeed);
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
	public void setTrueAirSpeed(DoubleBaseType newTrueAirSpeed) {
		if (newTrueAirSpeed != trueAirSpeed) {
			NotificationChain msgs = null;
			if (trueAirSpeed != null)
				msgs = ((InternalEObject) trueAirSpeed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__TRUE_AIR_SPEED, null,
						msgs);
			if (newTrueAirSpeed != null)
				msgs = ((InternalEObject) newTrueAirSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__TRUE_AIR_SPEED, null,
						msgs);
			msgs = basicSetTrueAirSpeed(newTrueAirSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__TRUE_AIR_SPEED, newTrueAirSpeed, newTrueAirSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAngleOfAttack() {
		return angleOfAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfAttack(DoubleBaseType newAngleOfAttack, NotificationChain msgs) {
		DoubleBaseType oldAngleOfAttack = angleOfAttack;
		angleOfAttack = newAngleOfAttack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ANGLE_OF_ATTACK, oldAngleOfAttack, newAngleOfAttack);
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
	public void setAngleOfAttack(DoubleBaseType newAngleOfAttack) {
		if (newAngleOfAttack != angleOfAttack) {
			NotificationChain msgs = null;
			if (angleOfAttack != null)
				msgs = ((InternalEObject) angleOfAttack).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ANGLE_OF_ATTACK, null,
						msgs);
			if (newAngleOfAttack != null)
				msgs = ((InternalEObject) newAngleOfAttack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ANGLE_OF_ATTACK, null,
						msgs);
			msgs = basicSetAngleOfAttack(newAngleOfAttack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ANGLE_OF_ATTACK, newAngleOfAttack,
					newAngleOfAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(DoubleBaseType newAltitude, NotificationChain msgs) {
		DoubleBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(DoubleBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE, newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__TRUE_AIR_SPEED:
			return basicSetTrueAirSpeed(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ANGLE_OF_ATTACK:
			return basicSetAngleOfAttack(null, msgs);
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
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
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__TRUE_AIR_SPEED:
			return getTrueAirSpeed();
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ANGLE_OF_ATTACK:
			return getAngleOfAttack();
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE:
			return getAltitude();
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
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__TRUE_AIR_SPEED:
			setTrueAirSpeed((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE:
			setAltitude((DoubleBaseType) newValue);
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
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__TRUE_AIR_SPEED:
			setTrueAirSpeed((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleBaseType) null);
			return;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE:
			setAltitude((DoubleBaseType) null);
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
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__TRUE_AIR_SPEED:
			return trueAirSpeed != null;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ANGLE_OF_ATTACK:
			return angleOfAttack != null;
		case CpacsPackage.FLIGHT_DYNAMICS_TRIM_RESULT_TYPE__ALTITUDE:
			return altitude != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightDynamicsTrimResultTypeImpl
