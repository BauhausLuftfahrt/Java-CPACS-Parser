/**
 */
package Cpacs.impl;

import Cpacs.CalibratedAirSpeedType;
import Cpacs.CpacsPackage;
import Cpacs.DurationType;
import Cpacs.EndTimeUTCType;
import Cpacs.FlightPathAngleType;
import Cpacs.FuelConsumedType;
import Cpacs.FuelFractionType;
import Cpacs.FuelRemainingType;
import Cpacs.GeographicPointConstraintType;
import Cpacs.HeadingType;
import Cpacs.MachNumberType;
import Cpacs.MassFractionType;
import Cpacs.MissionSegmentEndConditionType;
import Cpacs.PointConstraintType;
import Cpacs.PowerConsumedType;
import Cpacs.PowerFractionType;
import Cpacs.PowerRemainingType;
import Cpacs.RangeType;
import Cpacs.RateOfClimbType;
import Cpacs.ReleasedStoresType;
import Cpacs.RunwayType1;
import Cpacs.SpecificExcessPowerType;
import Cpacs.TurnAngleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Segment End Condition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getPositionXYZ <em>Position XYZ</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getPositionGeo <em>Position Geo</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getRunway <em>Runway</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getMassFraction <em>Mass Fraction</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getFuelFraction <em>Fuel Fraction</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getFuelRemaining <em>Fuel Remaining</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getFuelConsumed <em>Fuel Consumed</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getPowerFraction <em>Power Fraction</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getPowerRemaining <em>Power Remaining</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getPowerConsumed <em>Power Consumed</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getTurnAngle <em>Turn Angle</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getEndTimeUTC <em>End Time UTC</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getSpecificExcessPower <em>Specific Excess Power</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getRateOfClimb <em>Rate Of Climb</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getFlightPathAngle <em>Flight Path Angle</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getReleasedStores <em>Released Stores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionSegmentEndConditionTypeImpl extends ComplexBaseTypeImpl implements MissionSegmentEndConditionType {
	/**
	 * The cached value of the '{@link #getCalibratedAirSpeed() <em>Calibrated Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibratedAirSpeed()
	 * @generated
	 * @ordered
	 */
	protected CalibratedAirSpeedType calibratedAirSpeed;

	/**
	 * The cached value of the '{@link #getMachNumber() <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachNumber()
	 * @generated
	 * @ordered
	 */
	protected MachNumberType machNumber;

	/**
	 * The cached value of the '{@link #getPositionXYZ() <em>Position XYZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXYZ()
	 * @generated
	 * @ordered
	 */
	protected PointConstraintType positionXYZ;

	/**
	 * The cached value of the '{@link #getPositionGeo() <em>Position Geo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionGeo()
	 * @generated
	 * @ordered
	 */
	protected GeographicPointConstraintType positionGeo;

	/**
	 * The cached value of the '{@link #getRunway() <em>Runway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunway()
	 * @generated
	 * @ordered
	 */
	protected RunwayType1 runway;

	/**
	 * The cached value of the '{@link #getMassFraction() <em>Mass Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassFraction()
	 * @generated
	 * @ordered
	 */
	protected MassFractionType massFraction;

	/**
	 * The cached value of the '{@link #getFuelFraction() <em>Fuel Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelFraction()
	 * @generated
	 * @ordered
	 */
	protected FuelFractionType fuelFraction;

	/**
	 * The cached value of the '{@link #getFuelRemaining() <em>Fuel Remaining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelRemaining()
	 * @generated
	 * @ordered
	 */
	protected FuelRemainingType fuelRemaining;

	/**
	 * The cached value of the '{@link #getFuelConsumed() <em>Fuel Consumed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelConsumed()
	 * @generated
	 * @ordered
	 */
	protected FuelConsumedType fuelConsumed;

	/**
	 * The cached value of the '{@link #getPowerFraction() <em>Power Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerFraction()
	 * @generated
	 * @ordered
	 */
	protected PowerFractionType powerFraction;

	/**
	 * The cached value of the '{@link #getPowerRemaining() <em>Power Remaining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerRemaining()
	 * @generated
	 * @ordered
	 */
	protected PowerRemainingType powerRemaining;

	/**
	 * The cached value of the '{@link #getPowerConsumed() <em>Power Consumed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumed()
	 * @generated
	 * @ordered
	 */
	protected PowerConsumedType powerConsumed;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected HeadingType heading;

	/**
	 * The cached value of the '{@link #getTurnAngle() <em>Turn Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnAngle()
	 * @generated
	 * @ordered
	 */
	protected TurnAngleType turnAngle;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected RangeType range;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected DurationType duration;

	/**
	 * The cached value of the '{@link #getEndTimeUTC() <em>End Time UTC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTimeUTC()
	 * @generated
	 * @ordered
	 */
	protected EndTimeUTCType endTimeUTC;

	/**
	 * The cached value of the '{@link #getSpecificExcessPower() <em>Specific Excess Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificExcessPower()
	 * @generated
	 * @ordered
	 */
	protected SpecificExcessPowerType specificExcessPower;

	/**
	 * The cached value of the '{@link #getRateOfClimb() <em>Rate Of Climb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateOfClimb()
	 * @generated
	 * @ordered
	 */
	protected RateOfClimbType rateOfClimb;

	/**
	 * The cached value of the '{@link #getFlightPathAngle() <em>Flight Path Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightPathAngle()
	 * @generated
	 * @ordered
	 */
	protected FlightPathAngleType flightPathAngle;

	/**
	 * The cached value of the '{@link #getReleasedStores() <em>Released Stores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleasedStores()
	 * @generated
	 * @ordered
	 */
	protected ReleasedStoresType releasedStores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionSegmentEndConditionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionSegmentEndConditionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CalibratedAirSpeedType getCalibratedAirSpeed() {
		return calibratedAirSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalibratedAirSpeed(CalibratedAirSpeedType newCalibratedAirSpeed,
			NotificationChain msgs) {
		CalibratedAirSpeedType oldCalibratedAirSpeed = calibratedAirSpeed;
		calibratedAirSpeed = newCalibratedAirSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CALIBRATED_AIR_SPEED, oldCalibratedAirSpeed,
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
	public void setCalibratedAirSpeed(CalibratedAirSpeedType newCalibratedAirSpeed) {
		if (newCalibratedAirSpeed != calibratedAirSpeed) {
			NotificationChain msgs = null;
			if (calibratedAirSpeed != null)
				msgs = ((InternalEObject) calibratedAirSpeed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CALIBRATED_AIR_SPEED,
						null, msgs);
			if (newCalibratedAirSpeed != null)
				msgs = ((InternalEObject) newCalibratedAirSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CALIBRATED_AIR_SPEED,
						null, msgs);
			msgs = basicSetCalibratedAirSpeed(newCalibratedAirSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CALIBRATED_AIR_SPEED, newCalibratedAirSpeed,
					newCalibratedAirSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MachNumberType getMachNumber() {
		return machNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachNumber(MachNumberType newMachNumber, NotificationChain msgs) {
		MachNumberType oldMachNumber = machNumber;
		machNumber = newMachNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
	public void setMachNumber(MachNumberType newMachNumber) {
		if (newMachNumber != machNumber) {
			NotificationChain msgs = null;
			if (machNumber != null)
				msgs = ((InternalEObject) machNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER, null,
						msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER, null,
						msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER, newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointConstraintType getPositionXYZ() {
		return positionXYZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionXYZ(PointConstraintType newPositionXYZ, NotificationChain msgs) {
		PointConstraintType oldPositionXYZ = positionXYZ;
		positionXYZ = newPositionXYZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ, oldPositionXYZ, newPositionXYZ);
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
	public void setPositionXYZ(PointConstraintType newPositionXYZ) {
		if (newPositionXYZ != positionXYZ) {
			NotificationChain msgs = null;
			if (positionXYZ != null)
				msgs = ((InternalEObject) positionXYZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ, null,
						msgs);
			if (newPositionXYZ != null)
				msgs = ((InternalEObject) newPositionXYZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ, null,
						msgs);
			msgs = basicSetPositionXYZ(newPositionXYZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ, newPositionXYZ, newPositionXYZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeographicPointConstraintType getPositionGeo() {
		return positionGeo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionGeo(GeographicPointConstraintType newPositionGeo, NotificationChain msgs) {
		GeographicPointConstraintType oldPositionGeo = positionGeo;
		positionGeo = newPositionGeo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO, oldPositionGeo, newPositionGeo);
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
	public void setPositionGeo(GeographicPointConstraintType newPositionGeo) {
		if (newPositionGeo != positionGeo) {
			NotificationChain msgs = null;
			if (positionGeo != null)
				msgs = ((InternalEObject) positionGeo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO, null,
						msgs);
			if (newPositionGeo != null)
				msgs = ((InternalEObject) newPositionGeo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO, null,
						msgs);
			msgs = basicSetPositionGeo(newPositionGeo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO, newPositionGeo, newPositionGeo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunwayType1 getRunway() {
		return runway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunway(RunwayType1 newRunway, NotificationChain msgs) {
		RunwayType1 oldRunway = runway;
		runway = newRunway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY, oldRunway, newRunway);
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
	public void setRunway(RunwayType1 newRunway) {
		if (newRunway != runway) {
			NotificationChain msgs = null;
			if (runway != null)
				msgs = ((InternalEObject) runway).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY, null, msgs);
			if (newRunway != null)
				msgs = ((InternalEObject) newRunway).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY, null, msgs);
			msgs = basicSetRunway(newRunway, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY, newRunway, newRunway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MassFractionType getMassFraction() {
		return massFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassFraction(MassFractionType newMassFraction, NotificationChain msgs) {
		MassFractionType oldMassFraction = massFraction;
		massFraction = newMassFraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION, oldMassFraction, newMassFraction);
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
	public void setMassFraction(MassFractionType newMassFraction) {
		if (newMassFraction != massFraction) {
			NotificationChain msgs = null;
			if (massFraction != null)
				msgs = ((InternalEObject) massFraction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION, null,
						msgs);
			if (newMassFraction != null)
				msgs = ((InternalEObject) newMassFraction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION, null,
						msgs);
			msgs = basicSetMassFraction(newMassFraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION, newMassFraction, newMassFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelFractionType getFuelFraction() {
		return fuelFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelFraction(FuelFractionType newFuelFraction, NotificationChain msgs) {
		FuelFractionType oldFuelFraction = fuelFraction;
		fuelFraction = newFuelFraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION, oldFuelFraction, newFuelFraction);
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
	public void setFuelFraction(FuelFractionType newFuelFraction) {
		if (newFuelFraction != fuelFraction) {
			NotificationChain msgs = null;
			if (fuelFraction != null)
				msgs = ((InternalEObject) fuelFraction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION, null,
						msgs);
			if (newFuelFraction != null)
				msgs = ((InternalEObject) newFuelFraction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION, null,
						msgs);
			msgs = basicSetFuelFraction(newFuelFraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION, newFuelFraction, newFuelFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelRemainingType getFuelRemaining() {
		return fuelRemaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelRemaining(FuelRemainingType newFuelRemaining, NotificationChain msgs) {
		FuelRemainingType oldFuelRemaining = fuelRemaining;
		fuelRemaining = newFuelRemaining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING, oldFuelRemaining,
					newFuelRemaining);
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
	public void setFuelRemaining(FuelRemainingType newFuelRemaining) {
		if (newFuelRemaining != fuelRemaining) {
			NotificationChain msgs = null;
			if (fuelRemaining != null)
				msgs = ((InternalEObject) fuelRemaining).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING, null,
						msgs);
			if (newFuelRemaining != null)
				msgs = ((InternalEObject) newFuelRemaining).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING, null,
						msgs);
			msgs = basicSetFuelRemaining(newFuelRemaining, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING, newFuelRemaining,
					newFuelRemaining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelConsumedType getFuelConsumed() {
		return fuelConsumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelConsumed(FuelConsumedType newFuelConsumed, NotificationChain msgs) {
		FuelConsumedType oldFuelConsumed = fuelConsumed;
		fuelConsumed = newFuelConsumed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED, oldFuelConsumed, newFuelConsumed);
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
	public void setFuelConsumed(FuelConsumedType newFuelConsumed) {
		if (newFuelConsumed != fuelConsumed) {
			NotificationChain msgs = null;
			if (fuelConsumed != null)
				msgs = ((InternalEObject) fuelConsumed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED, null,
						msgs);
			if (newFuelConsumed != null)
				msgs = ((InternalEObject) newFuelConsumed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED, null,
						msgs);
			msgs = basicSetFuelConsumed(newFuelConsumed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED, newFuelConsumed, newFuelConsumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerFractionType getPowerFraction() {
		return powerFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerFraction(PowerFractionType newPowerFraction, NotificationChain msgs) {
		PowerFractionType oldPowerFraction = powerFraction;
		powerFraction = newPowerFraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_FRACTION, oldPowerFraction,
					newPowerFraction);
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
	public void setPowerFraction(PowerFractionType newPowerFraction) {
		if (newPowerFraction != powerFraction) {
			NotificationChain msgs = null;
			if (powerFraction != null)
				msgs = ((InternalEObject) powerFraction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_FRACTION, null,
						msgs);
			if (newPowerFraction != null)
				msgs = ((InternalEObject) newPowerFraction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_FRACTION, null,
						msgs);
			msgs = basicSetPowerFraction(newPowerFraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_FRACTION, newPowerFraction,
					newPowerFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerRemainingType getPowerRemaining() {
		return powerRemaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerRemaining(PowerRemainingType newPowerRemaining, NotificationChain msgs) {
		PowerRemainingType oldPowerRemaining = powerRemaining;
		powerRemaining = newPowerRemaining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_REMAINING, oldPowerRemaining,
					newPowerRemaining);
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
	public void setPowerRemaining(PowerRemainingType newPowerRemaining) {
		if (newPowerRemaining != powerRemaining) {
			NotificationChain msgs = null;
			if (powerRemaining != null)
				msgs = ((InternalEObject) powerRemaining).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_REMAINING, null,
						msgs);
			if (newPowerRemaining != null)
				msgs = ((InternalEObject) newPowerRemaining).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_REMAINING, null,
						msgs);
			msgs = basicSetPowerRemaining(newPowerRemaining, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_REMAINING, newPowerRemaining,
					newPowerRemaining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerConsumedType getPowerConsumed() {
		return powerConsumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerConsumed(PowerConsumedType newPowerConsumed, NotificationChain msgs) {
		PowerConsumedType oldPowerConsumed = powerConsumed;
		powerConsumed = newPowerConsumed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_CONSUMED, oldPowerConsumed,
					newPowerConsumed);
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
	public void setPowerConsumed(PowerConsumedType newPowerConsumed) {
		if (newPowerConsumed != powerConsumed) {
			NotificationChain msgs = null;
			if (powerConsumed != null)
				msgs = ((InternalEObject) powerConsumed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_CONSUMED, null,
						msgs);
			if (newPowerConsumed != null)
				msgs = ((InternalEObject) newPowerConsumed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_CONSUMED, null,
						msgs);
			msgs = basicSetPowerConsumed(newPowerConsumed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_CONSUMED, newPowerConsumed,
					newPowerConsumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeadingType getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeading(HeadingType newHeading, NotificationChain msgs) {
		HeadingType oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__HEADING, oldHeading, newHeading);
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
	public void setHeading(HeadingType newHeading) {
		if (newHeading != heading) {
			NotificationChain msgs = null;
			if (heading != null)
				msgs = ((InternalEObject) heading).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__HEADING, null, msgs);
			if (newHeading != null)
				msgs = ((InternalEObject) newHeading).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__HEADING, null, msgs);
			msgs = basicSetHeading(newHeading, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__HEADING, newHeading, newHeading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TurnAngleType getTurnAngle() {
		return turnAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurnAngle(TurnAngleType newTurnAngle, NotificationChain msgs) {
		TurnAngleType oldTurnAngle = turnAngle;
		turnAngle = newTurnAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__TURN_ANGLE, oldTurnAngle, newTurnAngle);
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
	public void setTurnAngle(TurnAngleType newTurnAngle) {
		if (newTurnAngle != turnAngle) {
			NotificationChain msgs = null;
			if (turnAngle != null)
				msgs = ((InternalEObject) turnAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__TURN_ANGLE, null,
						msgs);
			if (newTurnAngle != null)
				msgs = ((InternalEObject) newTurnAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__TURN_ANGLE, null,
						msgs);
			msgs = basicSetTurnAngle(newTurnAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__TURN_ANGLE, newTurnAngle, newTurnAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RangeType getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(RangeType newRange, NotificationChain msgs) {
		RangeType oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE, oldRange, newRange);
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
	public void setRange(RangeType newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject) range).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject) newRange).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE, newRange, newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DurationType getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(DurationType newDuration, NotificationChain msgs) {
		DurationType oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION, oldDuration, newDuration);
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
	public void setDuration(DurationType newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject) duration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject) newDuration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndTimeUTCType getEndTimeUTC() {
		return endTimeUTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndTimeUTC(EndTimeUTCType newEndTimeUTC, NotificationChain msgs) {
		EndTimeUTCType oldEndTimeUTC = endTimeUTC;
		endTimeUTC = newEndTimeUTC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__END_TIME_UTC, oldEndTimeUTC, newEndTimeUTC);
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
	public void setEndTimeUTC(EndTimeUTCType newEndTimeUTC) {
		if (newEndTimeUTC != endTimeUTC) {
			NotificationChain msgs = null;
			if (endTimeUTC != null)
				msgs = ((InternalEObject) endTimeUTC).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__END_TIME_UTC, null,
						msgs);
			if (newEndTimeUTC != null)
				msgs = ((InternalEObject) newEndTimeUTC).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__END_TIME_UTC, null,
						msgs);
			msgs = basicSetEndTimeUTC(newEndTimeUTC, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__END_TIME_UTC, newEndTimeUTC, newEndTimeUTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecificExcessPowerType getSpecificExcessPower() {
		return specificExcessPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificExcessPower(SpecificExcessPowerType newSpecificExcessPower,
			NotificationChain msgs) {
		SpecificExcessPowerType oldSpecificExcessPower = specificExcessPower;
		specificExcessPower = newSpecificExcessPower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER, oldSpecificExcessPower,
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
	public void setSpecificExcessPower(SpecificExcessPowerType newSpecificExcessPower) {
		if (newSpecificExcessPower != specificExcessPower) {
			NotificationChain msgs = null;
			if (specificExcessPower != null)
				msgs = ((InternalEObject) specificExcessPower).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER,
						null, msgs);
			if (newSpecificExcessPower != null)
				msgs = ((InternalEObject) newSpecificExcessPower).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER,
						null, msgs);
			msgs = basicSetSpecificExcessPower(newSpecificExcessPower, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER, newSpecificExcessPower,
					newSpecificExcessPower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RateOfClimbType getRateOfClimb() {
		return rateOfClimb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateOfClimb(RateOfClimbType newRateOfClimb, NotificationChain msgs) {
		RateOfClimbType oldRateOfClimb = rateOfClimb;
		rateOfClimb = newRateOfClimb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB, oldRateOfClimb, newRateOfClimb);
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
	public void setRateOfClimb(RateOfClimbType newRateOfClimb) {
		if (newRateOfClimb != rateOfClimb) {
			NotificationChain msgs = null;
			if (rateOfClimb != null)
				msgs = ((InternalEObject) rateOfClimb).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB, null,
						msgs);
			if (newRateOfClimb != null)
				msgs = ((InternalEObject) newRateOfClimb).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB, null,
						msgs);
			msgs = basicSetRateOfClimb(newRateOfClimb, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB, newRateOfClimb, newRateOfClimb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPathAngleType getFlightPathAngle() {
		return flightPathAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightPathAngle(FlightPathAngleType newFlightPathAngle, NotificationChain msgs) {
		FlightPathAngleType oldFlightPathAngle = flightPathAngle;
		flightPathAngle = newFlightPathAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE, oldFlightPathAngle,
					newFlightPathAngle);
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
	public void setFlightPathAngle(FlightPathAngleType newFlightPathAngle) {
		if (newFlightPathAngle != flightPathAngle) {
			NotificationChain msgs = null;
			if (flightPathAngle != null)
				msgs = ((InternalEObject) flightPathAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE,
						null, msgs);
			if (newFlightPathAngle != null)
				msgs = ((InternalEObject) newFlightPathAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE,
						null, msgs);
			msgs = basicSetFlightPathAngle(newFlightPathAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE, newFlightPathAngle,
					newFlightPathAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReleasedStoresType getReleasedStores() {
		return releasedStores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleasedStores(ReleasedStoresType newReleasedStores, NotificationChain msgs) {
		ReleasedStoresType oldReleasedStores = releasedStores;
		releasedStores = newReleasedStores;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RELEASED_STORES, oldReleasedStores,
					newReleasedStores);
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
	public void setReleasedStores(ReleasedStoresType newReleasedStores) {
		if (newReleasedStores != releasedStores) {
			NotificationChain msgs = null;
			if (releasedStores != null)
				msgs = ((InternalEObject) releasedStores).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RELEASED_STORES, null,
						msgs);
			if (newReleasedStores != null)
				msgs = ((InternalEObject) newReleasedStores).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RELEASED_STORES, null,
						msgs);
			msgs = basicSetReleasedStores(newReleasedStores, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RELEASED_STORES, newReleasedStores,
					newReleasedStores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CALIBRATED_AIR_SPEED:
			return basicSetCalibratedAirSpeed(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ:
			return basicSetPositionXYZ(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO:
			return basicSetPositionGeo(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY:
			return basicSetRunway(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION:
			return basicSetMassFraction(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION:
			return basicSetFuelFraction(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING:
			return basicSetFuelRemaining(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED:
			return basicSetFuelConsumed(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_FRACTION:
			return basicSetPowerFraction(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_REMAINING:
			return basicSetPowerRemaining(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_CONSUMED:
			return basicSetPowerConsumed(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__HEADING:
			return basicSetHeading(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__TURN_ANGLE:
			return basicSetTurnAngle(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE:
			return basicSetRange(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION:
			return basicSetDuration(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__END_TIME_UTC:
			return basicSetEndTimeUTC(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER:
			return basicSetSpecificExcessPower(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB:
			return basicSetRateOfClimb(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE:
			return basicSetFlightPathAngle(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RELEASED_STORES:
			return basicSetReleasedStores(null, msgs);
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
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CALIBRATED_AIR_SPEED:
			return getCalibratedAirSpeed();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ:
			return getPositionXYZ();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO:
			return getPositionGeo();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY:
			return getRunway();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION:
			return getMassFraction();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION:
			return getFuelFraction();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING:
			return getFuelRemaining();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED:
			return getFuelConsumed();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_FRACTION:
			return getPowerFraction();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_REMAINING:
			return getPowerRemaining();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_CONSUMED:
			return getPowerConsumed();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__HEADING:
			return getHeading();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__TURN_ANGLE:
			return getTurnAngle();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE:
			return getRange();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION:
			return getDuration();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__END_TIME_UTC:
			return getEndTimeUTC();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER:
			return getSpecificExcessPower();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB:
			return getRateOfClimb();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE:
			return getFlightPathAngle();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RELEASED_STORES:
			return getReleasedStores();
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
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CALIBRATED_AIR_SPEED:
			setCalibratedAirSpeed((CalibratedAirSpeedType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER:
			setMachNumber((MachNumberType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ:
			setPositionXYZ((PointConstraintType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO:
			setPositionGeo((GeographicPointConstraintType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY:
			setRunway((RunwayType1) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION:
			setMassFraction((MassFractionType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION:
			setFuelFraction((FuelFractionType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING:
			setFuelRemaining((FuelRemainingType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED:
			setFuelConsumed((FuelConsumedType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_FRACTION:
			setPowerFraction((PowerFractionType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_REMAINING:
			setPowerRemaining((PowerRemainingType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_CONSUMED:
			setPowerConsumed((PowerConsumedType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__HEADING:
			setHeading((HeadingType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__TURN_ANGLE:
			setTurnAngle((TurnAngleType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE:
			setRange((RangeType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION:
			setDuration((DurationType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__END_TIME_UTC:
			setEndTimeUTC((EndTimeUTCType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER:
			setSpecificExcessPower((SpecificExcessPowerType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB:
			setRateOfClimb((RateOfClimbType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE:
			setFlightPathAngle((FlightPathAngleType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RELEASED_STORES:
			setReleasedStores((ReleasedStoresType) newValue);
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
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CALIBRATED_AIR_SPEED:
			setCalibratedAirSpeed((CalibratedAirSpeedType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER:
			setMachNumber((MachNumberType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ:
			setPositionXYZ((PointConstraintType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO:
			setPositionGeo((GeographicPointConstraintType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY:
			setRunway((RunwayType1) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION:
			setMassFraction((MassFractionType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION:
			setFuelFraction((FuelFractionType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING:
			setFuelRemaining((FuelRemainingType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED:
			setFuelConsumed((FuelConsumedType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_FRACTION:
			setPowerFraction((PowerFractionType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_REMAINING:
			setPowerRemaining((PowerRemainingType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_CONSUMED:
			setPowerConsumed((PowerConsumedType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__HEADING:
			setHeading((HeadingType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__TURN_ANGLE:
			setTurnAngle((TurnAngleType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE:
			setRange((RangeType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION:
			setDuration((DurationType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__END_TIME_UTC:
			setEndTimeUTC((EndTimeUTCType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER:
			setSpecificExcessPower((SpecificExcessPowerType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB:
			setRateOfClimb((RateOfClimbType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE:
			setFlightPathAngle((FlightPathAngleType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RELEASED_STORES:
			setReleasedStores((ReleasedStoresType) null);
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
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CALIBRATED_AIR_SPEED:
			return calibratedAirSpeed != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ:
			return positionXYZ != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO:
			return positionGeo != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY:
			return runway != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION:
			return massFraction != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION:
			return fuelFraction != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING:
			return fuelRemaining != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED:
			return fuelConsumed != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_FRACTION:
			return powerFraction != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_REMAINING:
			return powerRemaining != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POWER_CONSUMED:
			return powerConsumed != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__HEADING:
			return heading != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__TURN_ANGLE:
			return turnAngle != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE:
			return range != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION:
			return duration != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__END_TIME_UTC:
			return endTimeUTC != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER:
			return specificExcessPower != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB:
			return rateOfClimb != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE:
			return flightPathAngle != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RELEASED_STORES:
			return releasedStores != null;
		}
		return super.eIsSet(featureID);
	}

} //MissionSegmentEndConditionTypeImpl
