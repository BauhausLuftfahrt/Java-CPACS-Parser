/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleConstraintBaseType;
import Cpacs.PointPerformanceConstraintsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Performance Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PointPerformanceConstraintsTypeImpl#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceConstraintsTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceConstraintsTypeImpl#getClimbAngle <em>Climb Angle</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceConstraintsTypeImpl#getRateOfClimb <em>Rate Of Climb</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceConstraintsTypeImpl#getRateOfTurn <em>Rate Of Turn</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceConstraintsTypeImpl#getThrustSetting <em>Thrust Setting</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceConstraintsTypeImpl#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceConstraintsTypeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceConstraintsTypeImpl#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceConstraintsTypeImpl#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointPerformanceConstraintsTypeImpl extends ComplexBaseTypeImpl
		implements PointPerformanceConstraintsType {
	/**
	 * The cached value of the '{@link #getCalibratedAirSpeed() <em>Calibrated Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibratedAirSpeed()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType calibratedAirSpeed;

	/**
	 * The cached value of the '{@link #getMachNumber() <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachNumber()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType machNumber;

	/**
	 * The cached value of the '{@link #getClimbAngle() <em>Climb Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClimbAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType climbAngle;

	/**
	 * The cached value of the '{@link #getRateOfClimb() <em>Rate Of Climb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateOfClimb()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType rateOfClimb;

	/**
	 * The cached value of the '{@link #getRateOfTurn() <em>Rate Of Turn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateOfTurn()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType rateOfTurn;

	/**
	 * The cached value of the '{@link #getThrustSetting() <em>Thrust Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrustSetting()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType thrustSetting;

	/**
	 * The cached value of the '{@link #getAcceleration() <em>Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceleration()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType acceleration;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType duration;

	/**
	 * The cached value of the '{@link #getAngleOfAttack() <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfAttack()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType angleOfAttack;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType altitude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointPerformanceConstraintsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPointPerformanceConstraintsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getCalibratedAirSpeed() {
		return calibratedAirSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalibratedAirSpeed(DoubleConstraintBaseType newCalibratedAirSpeed,
			NotificationChain msgs) {
		DoubleConstraintBaseType oldCalibratedAirSpeed = calibratedAirSpeed;
		calibratedAirSpeed = newCalibratedAirSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CALIBRATED_AIR_SPEED, oldCalibratedAirSpeed,
					newCalibratedAirSpeed);
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
	public void setCalibratedAirSpeed(DoubleConstraintBaseType newCalibratedAirSpeed) {
		if (newCalibratedAirSpeed != calibratedAirSpeed) {
			NotificationChain msgs = null;
			if (calibratedAirSpeed != null)
				msgs = ((InternalEObject) calibratedAirSpeed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CALIBRATED_AIR_SPEED,
						null, msgs);
			if (newCalibratedAirSpeed != null)
				msgs = ((InternalEObject) newCalibratedAirSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CALIBRATED_AIR_SPEED,
						null, msgs);
			msgs = basicSetCalibratedAirSpeed(newCalibratedAirSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CALIBRATED_AIR_SPEED, newCalibratedAirSpeed,
					newCalibratedAirSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getMachNumber() {
		return machNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachNumber(DoubleConstraintBaseType newMachNumber, NotificationChain msgs) {
		DoubleConstraintBaseType oldMachNumber = machNumber;
		machNumber = newMachNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
	public void setMachNumber(DoubleConstraintBaseType newMachNumber) {
		if (newMachNumber != machNumber) {
			NotificationChain msgs = null;
			if (machNumber != null)
				msgs = ((InternalEObject) machNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__MACH_NUMBER, null,
						msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__MACH_NUMBER, null,
						msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__MACH_NUMBER, newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getClimbAngle() {
		return climbAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClimbAngle(DoubleConstraintBaseType newClimbAngle, NotificationChain msgs) {
		DoubleConstraintBaseType oldClimbAngle = climbAngle;
		climbAngle = newClimbAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CLIMB_ANGLE, oldClimbAngle, newClimbAngle);
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
	public void setClimbAngle(DoubleConstraintBaseType newClimbAngle) {
		if (newClimbAngle != climbAngle) {
			NotificationChain msgs = null;
			if (climbAngle != null)
				msgs = ((InternalEObject) climbAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CLIMB_ANGLE, null,
						msgs);
			if (newClimbAngle != null)
				msgs = ((InternalEObject) newClimbAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CLIMB_ANGLE, null,
						msgs);
			msgs = basicSetClimbAngle(newClimbAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CLIMB_ANGLE, newClimbAngle, newClimbAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getRateOfClimb() {
		return rateOfClimb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateOfClimb(DoubleConstraintBaseType newRateOfClimb, NotificationChain msgs) {
		DoubleConstraintBaseType oldRateOfClimb = rateOfClimb;
		rateOfClimb = newRateOfClimb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_CLIMB, oldRateOfClimb, newRateOfClimb);
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
	public void setRateOfClimb(DoubleConstraintBaseType newRateOfClimb) {
		if (newRateOfClimb != rateOfClimb) {
			NotificationChain msgs = null;
			if (rateOfClimb != null)
				msgs = ((InternalEObject) rateOfClimb).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_CLIMB, null,
						msgs);
			if (newRateOfClimb != null)
				msgs = ((InternalEObject) newRateOfClimb).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_CLIMB, null,
						msgs);
			msgs = basicSetRateOfClimb(newRateOfClimb, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_CLIMB, newRateOfClimb, newRateOfClimb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getRateOfTurn() {
		return rateOfTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateOfTurn(DoubleConstraintBaseType newRateOfTurn, NotificationChain msgs) {
		DoubleConstraintBaseType oldRateOfTurn = rateOfTurn;
		rateOfTurn = newRateOfTurn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_TURN, oldRateOfTurn, newRateOfTurn);
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
	public void setRateOfTurn(DoubleConstraintBaseType newRateOfTurn) {
		if (newRateOfTurn != rateOfTurn) {
			NotificationChain msgs = null;
			if (rateOfTurn != null)
				msgs = ((InternalEObject) rateOfTurn).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_TURN, null,
						msgs);
			if (newRateOfTurn != null)
				msgs = ((InternalEObject) newRateOfTurn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_TURN, null,
						msgs);
			msgs = basicSetRateOfTurn(newRateOfTurn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_TURN, newRateOfTurn, newRateOfTurn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getThrustSetting() {
		return thrustSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrustSetting(DoubleConstraintBaseType newThrustSetting, NotificationChain msgs) {
		DoubleConstraintBaseType oldThrustSetting = thrustSetting;
		thrustSetting = newThrustSetting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__THRUST_SETTING, oldThrustSetting,
					newThrustSetting);
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
	public void setThrustSetting(DoubleConstraintBaseType newThrustSetting) {
		if (newThrustSetting != thrustSetting) {
			NotificationChain msgs = null;
			if (thrustSetting != null)
				msgs = ((InternalEObject) thrustSetting).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__THRUST_SETTING, null,
						msgs);
			if (newThrustSetting != null)
				msgs = ((InternalEObject) newThrustSetting).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__THRUST_SETTING, null,
						msgs);
			msgs = basicSetThrustSetting(newThrustSetting, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__THRUST_SETTING, newThrustSetting,
					newThrustSetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getAcceleration() {
		return acceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceleration(DoubleConstraintBaseType newAcceleration, NotificationChain msgs) {
		DoubleConstraintBaseType oldAcceleration = acceleration;
		acceleration = newAcceleration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ACCELERATION, oldAcceleration, newAcceleration);
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
	public void setAcceleration(DoubleConstraintBaseType newAcceleration) {
		if (newAcceleration != acceleration) {
			NotificationChain msgs = null;
			if (acceleration != null)
				msgs = ((InternalEObject) acceleration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ACCELERATION, null,
						msgs);
			if (newAcceleration != null)
				msgs = ((InternalEObject) newAcceleration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ACCELERATION, null,
						msgs);
			msgs = basicSetAcceleration(newAcceleration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ACCELERATION, newAcceleration, newAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(DoubleConstraintBaseType newDuration, NotificationChain msgs) {
		DoubleConstraintBaseType oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__DURATION, oldDuration, newDuration);
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
	public void setDuration(DoubleConstraintBaseType newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject) duration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject) newDuration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getAngleOfAttack() {
		return angleOfAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfAttack(DoubleConstraintBaseType newAngleOfAttack, NotificationChain msgs) {
		DoubleConstraintBaseType oldAngleOfAttack = angleOfAttack;
		angleOfAttack = newAngleOfAttack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ANGLE_OF_ATTACK, oldAngleOfAttack,
					newAngleOfAttack);
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
	public void setAngleOfAttack(DoubleConstraintBaseType newAngleOfAttack) {
		if (newAngleOfAttack != angleOfAttack) {
			NotificationChain msgs = null;
			if (angleOfAttack != null)
				msgs = ((InternalEObject) angleOfAttack).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ANGLE_OF_ATTACK, null,
						msgs);
			if (newAngleOfAttack != null)
				msgs = ((InternalEObject) newAngleOfAttack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ANGLE_OF_ATTACK, null,
						msgs);
			msgs = basicSetAngleOfAttack(newAngleOfAttack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ANGLE_OF_ATTACK, newAngleOfAttack,
					newAngleOfAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(DoubleConstraintBaseType newAltitude, NotificationChain msgs) {
		DoubleConstraintBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(DoubleConstraintBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ALTITUDE, newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CALIBRATED_AIR_SPEED:
			return basicSetCalibratedAirSpeed(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CLIMB_ANGLE:
			return basicSetClimbAngle(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_CLIMB:
			return basicSetRateOfClimb(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_TURN:
			return basicSetRateOfTurn(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__THRUST_SETTING:
			return basicSetThrustSetting(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ACCELERATION:
			return basicSetAcceleration(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__DURATION:
			return basicSetDuration(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ANGLE_OF_ATTACK:
			return basicSetAngleOfAttack(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ALTITUDE:
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
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CALIBRATED_AIR_SPEED:
			return getCalibratedAirSpeed();
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CLIMB_ANGLE:
			return getClimbAngle();
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_CLIMB:
			return getRateOfClimb();
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_TURN:
			return getRateOfTurn();
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__THRUST_SETTING:
			return getThrustSetting();
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ACCELERATION:
			return getAcceleration();
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__DURATION:
			return getDuration();
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ANGLE_OF_ATTACK:
			return getAngleOfAttack();
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ALTITUDE:
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
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CALIBRATED_AIR_SPEED:
			setCalibratedAirSpeed((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__MACH_NUMBER:
			setMachNumber((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CLIMB_ANGLE:
			setClimbAngle((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_CLIMB:
			setRateOfClimb((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_TURN:
			setRateOfTurn((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__THRUST_SETTING:
			setThrustSetting((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ACCELERATION:
			setAcceleration((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__DURATION:
			setDuration((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ALTITUDE:
			setAltitude((DoubleConstraintBaseType) newValue);
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
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CALIBRATED_AIR_SPEED:
			setCalibratedAirSpeed((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__MACH_NUMBER:
			setMachNumber((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CLIMB_ANGLE:
			setClimbAngle((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_CLIMB:
			setRateOfClimb((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_TURN:
			setRateOfTurn((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__THRUST_SETTING:
			setThrustSetting((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ACCELERATION:
			setAcceleration((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__DURATION:
			setDuration((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ALTITUDE:
			setAltitude((DoubleConstraintBaseType) null);
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
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CALIBRATED_AIR_SPEED:
			return calibratedAirSpeed != null;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__CLIMB_ANGLE:
			return climbAngle != null;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_CLIMB:
			return rateOfClimb != null;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__RATE_OF_TURN:
			return rateOfTurn != null;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__THRUST_SETTING:
			return thrustSetting != null;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ACCELERATION:
			return acceleration != null;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__DURATION:
			return duration != null;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ANGLE_OF_ATTACK:
			return angleOfAttack != null;
		case CpacsPackage.POINT_PERFORMANCE_CONSTRAINTS_TYPE__ALTITUDE:
			return altitude != null;
		}
		return super.eIsSet(featureID);
	}

} //PointPerformanceConstraintsTypeImpl
