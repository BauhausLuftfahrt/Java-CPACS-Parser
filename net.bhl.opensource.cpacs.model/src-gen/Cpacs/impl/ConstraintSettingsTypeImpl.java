/**
 */
package Cpacs.impl;

import Cpacs.ConstraintSettingsType;
import Cpacs.ContinuityType3;
import Cpacs.CpacsPackage;
import Cpacs.DoubleConstraintBaseType;
import Cpacs.DoubleVectorBaseType;
import Cpacs.DoubleVectorConstraintBaseType;
import Cpacs.PrioritySettingType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Settings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getReferenceEndConditionUID <em>Reference End Condition UID</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getEndConditionRatio <em>End Condition Ratio</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getContinuity <em>Continuity</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getClimbAngle <em>Climb Angle</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getRateOfClimb <em>Rate Of Climb</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getStepClimbSpecificExcessPower <em>Step Climb Specific Excess Power</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getStepClimbAltitudeDifference <em>Step Climb Altitude Difference</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getTurnAngle <em>Turn Angle</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getRateOfTurn <em>Rate Of Turn</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getThrustSetting <em>Thrust Setting</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getLoadFactor <em>Load Factor</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsTypeImpl#getPrioritySetting <em>Priority Setting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintSettingsTypeImpl extends ComplexBaseTypeImpl implements ConstraintSettingsType {
	/**
	 * The cached value of the '{@link #getReferenceEndConditionUID() <em>Reference End Condition UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceEndConditionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType referenceEndConditionUID;

	/**
	 * The cached value of the '{@link #getEndConditionRatio() <em>End Condition Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndConditionRatio()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType endConditionRatio;

	/**
	 * The cached value of the '{@link #getContinuity() <em>Continuity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuity()
	 * @generated
	 * @ordered
	 */
	protected ContinuityType3 continuity;

	/**
	 * The cached value of the '{@link #getCalibratedAirSpeed() <em>Calibrated Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibratedAirSpeed()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorConstraintBaseType calibratedAirSpeed;

	/**
	 * The cached value of the '{@link #getMachNumber() <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachNumber()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorConstraintBaseType machNumber;

	/**
	 * The cached value of the '{@link #getClimbAngle() <em>Climb Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClimbAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorConstraintBaseType climbAngle;

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
	 * The cached value of the '{@link #getStepClimbSpecificExcessPower() <em>Step Climb Specific Excess Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepClimbSpecificExcessPower()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType stepClimbSpecificExcessPower;

	/**
	 * The cached value of the '{@link #getStepClimbAltitudeDifference() <em>Step Climb Altitude Difference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepClimbAltitudeDifference()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorConstraintBaseType stepClimbAltitudeDifference;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorConstraintBaseType heading;

	/**
	 * The cached value of the '{@link #getTurnAngle() <em>Turn Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorConstraintBaseType turnAngle;

	/**
	 * The cached value of the '{@link #getRateOfTurn() <em>Rate Of Turn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateOfTurn()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorConstraintBaseType rateOfTurn;

	/**
	 * The cached value of the '{@link #getThrustSetting() <em>Thrust Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrustSetting()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorConstraintBaseType thrustSetting;

	/**
	 * The cached value of the '{@link #getAcceleration() <em>Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceleration()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorConstraintBaseType acceleration;

	/**
	 * The cached value of the '{@link #getLoadFactor() <em>Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorConstraintBaseType loadFactor;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorConstraintBaseType altitude;

	/**
	 * The cached value of the '{@link #getPrioritySetting() <em>Priority Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioritySetting()
	 * @generated
	 * @ordered
	 */
	protected PrioritySettingType prioritySetting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintSettingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getConstraintSettingsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getReferenceEndConditionUID() {
		return referenceEndConditionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceEndConditionUID(StringUIDBaseType newReferenceEndConditionUID,
			NotificationChain msgs) {
		StringUIDBaseType oldReferenceEndConditionUID = referenceEndConditionUID;
		referenceEndConditionUID = newReferenceEndConditionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__REFERENCE_END_CONDITION_UID, oldReferenceEndConditionUID,
					newReferenceEndConditionUID);
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
	public void setReferenceEndConditionUID(StringUIDBaseType newReferenceEndConditionUID) {
		if (newReferenceEndConditionUID != referenceEndConditionUID) {
			NotificationChain msgs = null;
			if (referenceEndConditionUID != null)
				msgs = ((InternalEObject) referenceEndConditionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__REFERENCE_END_CONDITION_UID,
						null, msgs);
			if (newReferenceEndConditionUID != null)
				msgs = ((InternalEObject) newReferenceEndConditionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__REFERENCE_END_CONDITION_UID,
						null, msgs);
			msgs = basicSetReferenceEndConditionUID(newReferenceEndConditionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__REFERENCE_END_CONDITION_UID, newReferenceEndConditionUID,
					newReferenceEndConditionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getEndConditionRatio() {
		return endConditionRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndConditionRatio(DoubleVectorBaseType newEndConditionRatio,
			NotificationChain msgs) {
		DoubleVectorBaseType oldEndConditionRatio = endConditionRatio;
		endConditionRatio = newEndConditionRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__END_CONDITION_RATIO, oldEndConditionRatio,
					newEndConditionRatio);
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
	public void setEndConditionRatio(DoubleVectorBaseType newEndConditionRatio) {
		if (newEndConditionRatio != endConditionRatio) {
			NotificationChain msgs = null;
			if (endConditionRatio != null)
				msgs = ((InternalEObject) endConditionRatio).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__END_CONDITION_RATIO, null,
						msgs);
			if (newEndConditionRatio != null)
				msgs = ((InternalEObject) newEndConditionRatio).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__END_CONDITION_RATIO, null,
						msgs);
			msgs = basicSetEndConditionRatio(newEndConditionRatio, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__END_CONDITION_RATIO, newEndConditionRatio,
					newEndConditionRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuityType3 getContinuity() {
		return continuity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinuity(ContinuityType3 newContinuity, NotificationChain msgs) {
		ContinuityType3 oldContinuity = continuity;
		continuity = newContinuity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CONTINUITY, oldContinuity, newContinuity);
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
	public void setContinuity(ContinuityType3 newContinuity) {
		if (newContinuity != continuity) {
			NotificationChain msgs = null;
			if (continuity != null)
				msgs = ((InternalEObject) continuity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CONTINUITY, null, msgs);
			if (newContinuity != null)
				msgs = ((InternalEObject) newContinuity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CONTINUITY, null, msgs);
			msgs = basicSetContinuity(newContinuity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CONTINUITY,
					newContinuity, newContinuity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorConstraintBaseType getCalibratedAirSpeed() {
		return calibratedAirSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalibratedAirSpeed(DoubleVectorConstraintBaseType newCalibratedAirSpeed,
			NotificationChain msgs) {
		DoubleVectorConstraintBaseType oldCalibratedAirSpeed = calibratedAirSpeed;
		calibratedAirSpeed = newCalibratedAirSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CALIBRATED_AIR_SPEED, oldCalibratedAirSpeed,
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
	public void setCalibratedAirSpeed(DoubleVectorConstraintBaseType newCalibratedAirSpeed) {
		if (newCalibratedAirSpeed != calibratedAirSpeed) {
			NotificationChain msgs = null;
			if (calibratedAirSpeed != null)
				msgs = ((InternalEObject) calibratedAirSpeed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CALIBRATED_AIR_SPEED, null,
						msgs);
			if (newCalibratedAirSpeed != null)
				msgs = ((InternalEObject) newCalibratedAirSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CALIBRATED_AIR_SPEED, null,
						msgs);
			msgs = basicSetCalibratedAirSpeed(newCalibratedAirSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CALIBRATED_AIR_SPEED, newCalibratedAirSpeed,
					newCalibratedAirSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorConstraintBaseType getMachNumber() {
		return machNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachNumber(DoubleVectorConstraintBaseType newMachNumber, NotificationChain msgs) {
		DoubleVectorConstraintBaseType oldMachNumber = machNumber;
		machNumber = newMachNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
	public void setMachNumber(DoubleVectorConstraintBaseType newMachNumber) {
		if (newMachNumber != machNumber) {
			NotificationChain msgs = null;
			if (machNumber != null)
				msgs = ((InternalEObject) machNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__MACH_NUMBER, null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__MACH_NUMBER, null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONSTRAINT_SETTINGS_TYPE__MACH_NUMBER,
					newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorConstraintBaseType getClimbAngle() {
		return climbAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClimbAngle(DoubleVectorConstraintBaseType newClimbAngle, NotificationChain msgs) {
		DoubleVectorConstraintBaseType oldClimbAngle = climbAngle;
		climbAngle = newClimbAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CLIMB_ANGLE, oldClimbAngle, newClimbAngle);
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
	public void setClimbAngle(DoubleVectorConstraintBaseType newClimbAngle) {
		if (newClimbAngle != climbAngle) {
			NotificationChain msgs = null;
			if (climbAngle != null)
				msgs = ((InternalEObject) climbAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CLIMB_ANGLE, null, msgs);
			if (newClimbAngle != null)
				msgs = ((InternalEObject) newClimbAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CLIMB_ANGLE, null, msgs);
			msgs = basicSetClimbAngle(newClimbAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CLIMB_ANGLE,
					newClimbAngle, newClimbAngle));
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
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_CLIMB, oldRateOfClimb, newRateOfClimb);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_CLIMB, null, msgs);
			if (newRateOfClimb != null)
				msgs = ((InternalEObject) newRateOfClimb).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_CLIMB, null, msgs);
			msgs = basicSetRateOfClimb(newRateOfClimb, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_CLIMB,
					newRateOfClimb, newRateOfClimb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getStepClimbSpecificExcessPower() {
		return stepClimbSpecificExcessPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepClimbSpecificExcessPower(
			DoubleConstraintBaseType newStepClimbSpecificExcessPower, NotificationChain msgs) {
		DoubleConstraintBaseType oldStepClimbSpecificExcessPower = stepClimbSpecificExcessPower;
		stepClimbSpecificExcessPower = newStepClimbSpecificExcessPower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_SPECIFIC_EXCESS_POWER,
					oldStepClimbSpecificExcessPower, newStepClimbSpecificExcessPower);
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
	public void setStepClimbSpecificExcessPower(DoubleConstraintBaseType newStepClimbSpecificExcessPower) {
		if (newStepClimbSpecificExcessPower != stepClimbSpecificExcessPower) {
			NotificationChain msgs = null;
			if (stepClimbSpecificExcessPower != null)
				msgs = ((InternalEObject) stepClimbSpecificExcessPower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_SPECIFIC_EXCESS_POWER, null, msgs);
			if (newStepClimbSpecificExcessPower != null)
				msgs = ((InternalEObject) newStepClimbSpecificExcessPower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_SPECIFIC_EXCESS_POWER, null, msgs);
			msgs = basicSetStepClimbSpecificExcessPower(newStepClimbSpecificExcessPower, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_SPECIFIC_EXCESS_POWER,
					newStepClimbSpecificExcessPower, newStepClimbSpecificExcessPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorConstraintBaseType getStepClimbAltitudeDifference() {
		return stepClimbAltitudeDifference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStepClimbAltitudeDifference(
			DoubleVectorConstraintBaseType newStepClimbAltitudeDifference, NotificationChain msgs) {
		DoubleVectorConstraintBaseType oldStepClimbAltitudeDifference = stepClimbAltitudeDifference;
		stepClimbAltitudeDifference = newStepClimbAltitudeDifference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_ALTITUDE_DIFFERENCE,
					oldStepClimbAltitudeDifference, newStepClimbAltitudeDifference);
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
	public void setStepClimbAltitudeDifference(DoubleVectorConstraintBaseType newStepClimbAltitudeDifference) {
		if (newStepClimbAltitudeDifference != stepClimbAltitudeDifference) {
			NotificationChain msgs = null;
			if (stepClimbAltitudeDifference != null)
				msgs = ((InternalEObject) stepClimbAltitudeDifference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_ALTITUDE_DIFFERENCE,
						null, msgs);
			if (newStepClimbAltitudeDifference != null)
				msgs = ((InternalEObject) newStepClimbAltitudeDifference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_ALTITUDE_DIFFERENCE,
						null, msgs);
			msgs = basicSetStepClimbAltitudeDifference(newStepClimbAltitudeDifference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_ALTITUDE_DIFFERENCE,
					newStepClimbAltitudeDifference, newStepClimbAltitudeDifference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorConstraintBaseType getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeading(DoubleVectorConstraintBaseType newHeading, NotificationChain msgs) {
		DoubleVectorConstraintBaseType oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__HEADING, oldHeading, newHeading);
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
	public void setHeading(DoubleVectorConstraintBaseType newHeading) {
		if (newHeading != heading) {
			NotificationChain msgs = null;
			if (heading != null)
				msgs = ((InternalEObject) heading).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__HEADING, null, msgs);
			if (newHeading != null)
				msgs = ((InternalEObject) newHeading).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__HEADING, null, msgs);
			msgs = basicSetHeading(newHeading, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONSTRAINT_SETTINGS_TYPE__HEADING,
					newHeading, newHeading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorConstraintBaseType getTurnAngle() {
		return turnAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurnAngle(DoubleVectorConstraintBaseType newTurnAngle, NotificationChain msgs) {
		DoubleVectorConstraintBaseType oldTurnAngle = turnAngle;
		turnAngle = newTurnAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__TURN_ANGLE, oldTurnAngle, newTurnAngle);
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
	public void setTurnAngle(DoubleVectorConstraintBaseType newTurnAngle) {
		if (newTurnAngle != turnAngle) {
			NotificationChain msgs = null;
			if (turnAngle != null)
				msgs = ((InternalEObject) turnAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__TURN_ANGLE, null, msgs);
			if (newTurnAngle != null)
				msgs = ((InternalEObject) newTurnAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__TURN_ANGLE, null, msgs);
			msgs = basicSetTurnAngle(newTurnAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONSTRAINT_SETTINGS_TYPE__TURN_ANGLE,
					newTurnAngle, newTurnAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorConstraintBaseType getRateOfTurn() {
		return rateOfTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateOfTurn(DoubleVectorConstraintBaseType newRateOfTurn, NotificationChain msgs) {
		DoubleVectorConstraintBaseType oldRateOfTurn = rateOfTurn;
		rateOfTurn = newRateOfTurn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_TURN, oldRateOfTurn, newRateOfTurn);
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
	public void setRateOfTurn(DoubleVectorConstraintBaseType newRateOfTurn) {
		if (newRateOfTurn != rateOfTurn) {
			NotificationChain msgs = null;
			if (rateOfTurn != null)
				msgs = ((InternalEObject) rateOfTurn).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_TURN, null, msgs);
			if (newRateOfTurn != null)
				msgs = ((InternalEObject) newRateOfTurn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_TURN, null, msgs);
			msgs = basicSetRateOfTurn(newRateOfTurn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_TURN,
					newRateOfTurn, newRateOfTurn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorConstraintBaseType getThrustSetting() {
		return thrustSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrustSetting(DoubleVectorConstraintBaseType newThrustSetting,
			NotificationChain msgs) {
		DoubleVectorConstraintBaseType oldThrustSetting = thrustSetting;
		thrustSetting = newThrustSetting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__THRUST_SETTING, oldThrustSetting, newThrustSetting);
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
	public void setThrustSetting(DoubleVectorConstraintBaseType newThrustSetting) {
		if (newThrustSetting != thrustSetting) {
			NotificationChain msgs = null;
			if (thrustSetting != null)
				msgs = ((InternalEObject) thrustSetting).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__THRUST_SETTING, null, msgs);
			if (newThrustSetting != null)
				msgs = ((InternalEObject) newThrustSetting).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__THRUST_SETTING, null, msgs);
			msgs = basicSetThrustSetting(newThrustSetting, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONSTRAINT_SETTINGS_TYPE__THRUST_SETTING,
					newThrustSetting, newThrustSetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorConstraintBaseType getAcceleration() {
		return acceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceleration(DoubleVectorConstraintBaseType newAcceleration,
			NotificationChain msgs) {
		DoubleVectorConstraintBaseType oldAcceleration = acceleration;
		acceleration = newAcceleration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ACCELERATION, oldAcceleration, newAcceleration);
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
	public void setAcceleration(DoubleVectorConstraintBaseType newAcceleration) {
		if (newAcceleration != acceleration) {
			NotificationChain msgs = null;
			if (acceleration != null)
				msgs = ((InternalEObject) acceleration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ACCELERATION, null, msgs);
			if (newAcceleration != null)
				msgs = ((InternalEObject) newAcceleration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ACCELERATION, null, msgs);
			msgs = basicSetAcceleration(newAcceleration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ACCELERATION,
					newAcceleration, newAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorConstraintBaseType getLoadFactor() {
		return loadFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadFactor(DoubleVectorConstraintBaseType newLoadFactor, NotificationChain msgs) {
		DoubleVectorConstraintBaseType oldLoadFactor = loadFactor;
		loadFactor = newLoadFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__LOAD_FACTOR, oldLoadFactor, newLoadFactor);
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
	public void setLoadFactor(DoubleVectorConstraintBaseType newLoadFactor) {
		if (newLoadFactor != loadFactor) {
			NotificationChain msgs = null;
			if (loadFactor != null)
				msgs = ((InternalEObject) loadFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__LOAD_FACTOR, null, msgs);
			if (newLoadFactor != null)
				msgs = ((InternalEObject) newLoadFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__LOAD_FACTOR, null, msgs);
			msgs = basicSetLoadFactor(newLoadFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONSTRAINT_SETTINGS_TYPE__LOAD_FACTOR,
					newLoadFactor, newLoadFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorConstraintBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(DoubleVectorConstraintBaseType newAltitude, NotificationChain msgs) {
		DoubleVectorConstraintBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(DoubleVectorConstraintBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ALTITUDE,
					newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrioritySettingType getPrioritySetting() {
		return prioritySetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrioritySetting(PrioritySettingType newPrioritySetting, NotificationChain msgs) {
		PrioritySettingType oldPrioritySetting = prioritySetting;
		prioritySetting = newPrioritySetting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__PRIORITY_SETTING, oldPrioritySetting, newPrioritySetting);
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
	public void setPrioritySetting(PrioritySettingType newPrioritySetting) {
		if (newPrioritySetting != prioritySetting) {
			NotificationChain msgs = null;
			if (prioritySetting != null)
				msgs = ((InternalEObject) prioritySetting).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__PRIORITY_SETTING, null, msgs);
			if (newPrioritySetting != null)
				msgs = ((InternalEObject) newPrioritySetting).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_TYPE__PRIORITY_SETTING, null, msgs);
			msgs = basicSetPrioritySetting(newPrioritySetting, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_TYPE__PRIORITY_SETTING, newPrioritySetting, newPrioritySetting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__REFERENCE_END_CONDITION_UID:
			return basicSetReferenceEndConditionUID(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__END_CONDITION_RATIO:
			return basicSetEndConditionRatio(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CONTINUITY:
			return basicSetContinuity(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CALIBRATED_AIR_SPEED:
			return basicSetCalibratedAirSpeed(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CLIMB_ANGLE:
			return basicSetClimbAngle(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_CLIMB:
			return basicSetRateOfClimb(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_SPECIFIC_EXCESS_POWER:
			return basicSetStepClimbSpecificExcessPower(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_ALTITUDE_DIFFERENCE:
			return basicSetStepClimbAltitudeDifference(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__HEADING:
			return basicSetHeading(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__TURN_ANGLE:
			return basicSetTurnAngle(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_TURN:
			return basicSetRateOfTurn(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__THRUST_SETTING:
			return basicSetThrustSetting(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ACCELERATION:
			return basicSetAcceleration(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__LOAD_FACTOR:
			return basicSetLoadFactor(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__PRIORITY_SETTING:
			return basicSetPrioritySetting(null, msgs);
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
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__REFERENCE_END_CONDITION_UID:
			return getReferenceEndConditionUID();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__END_CONDITION_RATIO:
			return getEndConditionRatio();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CONTINUITY:
			return getContinuity();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CALIBRATED_AIR_SPEED:
			return getCalibratedAirSpeed();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CLIMB_ANGLE:
			return getClimbAngle();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_CLIMB:
			return getRateOfClimb();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_SPECIFIC_EXCESS_POWER:
			return getStepClimbSpecificExcessPower();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_ALTITUDE_DIFFERENCE:
			return getStepClimbAltitudeDifference();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__HEADING:
			return getHeading();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__TURN_ANGLE:
			return getTurnAngle();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_TURN:
			return getRateOfTurn();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__THRUST_SETTING:
			return getThrustSetting();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ACCELERATION:
			return getAcceleration();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__LOAD_FACTOR:
			return getLoadFactor();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ALTITUDE:
			return getAltitude();
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__PRIORITY_SETTING:
			return getPrioritySetting();
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
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__REFERENCE_END_CONDITION_UID:
			setReferenceEndConditionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__END_CONDITION_RATIO:
			setEndConditionRatio((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CONTINUITY:
			setContinuity((ContinuityType3) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CALIBRATED_AIR_SPEED:
			setCalibratedAirSpeed((DoubleVectorConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__MACH_NUMBER:
			setMachNumber((DoubleVectorConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CLIMB_ANGLE:
			setClimbAngle((DoubleVectorConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_CLIMB:
			setRateOfClimb((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_SPECIFIC_EXCESS_POWER:
			setStepClimbSpecificExcessPower((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_ALTITUDE_DIFFERENCE:
			setStepClimbAltitudeDifference((DoubleVectorConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__HEADING:
			setHeading((DoubleVectorConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__TURN_ANGLE:
			setTurnAngle((DoubleVectorConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_TURN:
			setRateOfTurn((DoubleVectorConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__THRUST_SETTING:
			setThrustSetting((DoubleVectorConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ACCELERATION:
			setAcceleration((DoubleVectorConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__LOAD_FACTOR:
			setLoadFactor((DoubleVectorConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ALTITUDE:
			setAltitude((DoubleVectorConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__PRIORITY_SETTING:
			setPrioritySetting((PrioritySettingType) newValue);
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
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__REFERENCE_END_CONDITION_UID:
			setReferenceEndConditionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__END_CONDITION_RATIO:
			setEndConditionRatio((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CONTINUITY:
			setContinuity((ContinuityType3) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CALIBRATED_AIR_SPEED:
			setCalibratedAirSpeed((DoubleVectorConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__MACH_NUMBER:
			setMachNumber((DoubleVectorConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CLIMB_ANGLE:
			setClimbAngle((DoubleVectorConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_CLIMB:
			setRateOfClimb((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_SPECIFIC_EXCESS_POWER:
			setStepClimbSpecificExcessPower((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_ALTITUDE_DIFFERENCE:
			setStepClimbAltitudeDifference((DoubleVectorConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__HEADING:
			setHeading((DoubleVectorConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__TURN_ANGLE:
			setTurnAngle((DoubleVectorConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_TURN:
			setRateOfTurn((DoubleVectorConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__THRUST_SETTING:
			setThrustSetting((DoubleVectorConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ACCELERATION:
			setAcceleration((DoubleVectorConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__LOAD_FACTOR:
			setLoadFactor((DoubleVectorConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ALTITUDE:
			setAltitude((DoubleVectorConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__PRIORITY_SETTING:
			setPrioritySetting((PrioritySettingType) null);
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
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__REFERENCE_END_CONDITION_UID:
			return referenceEndConditionUID != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__END_CONDITION_RATIO:
			return endConditionRatio != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CONTINUITY:
			return continuity != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CALIBRATED_AIR_SPEED:
			return calibratedAirSpeed != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__CLIMB_ANGLE:
			return climbAngle != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_CLIMB:
			return rateOfClimb != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_SPECIFIC_EXCESS_POWER:
			return stepClimbSpecificExcessPower != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__STEP_CLIMB_ALTITUDE_DIFFERENCE:
			return stepClimbAltitudeDifference != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__HEADING:
			return heading != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__TURN_ANGLE:
			return turnAngle != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__RATE_OF_TURN:
			return rateOfTurn != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__THRUST_SETTING:
			return thrustSetting != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ACCELERATION:
			return acceleration != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__LOAD_FACTOR:
			return loadFactor != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__ALTITUDE:
			return altitude != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_TYPE__PRIORITY_SETTING:
			return prioritySetting != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstraintSettingsTypeImpl
