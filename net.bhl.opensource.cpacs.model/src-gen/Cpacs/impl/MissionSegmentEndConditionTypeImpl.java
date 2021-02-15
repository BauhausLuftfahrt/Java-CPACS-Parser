/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleConstraintBaseType;
import Cpacs.GeographicPointConstraintType;
import Cpacs.MissionSegmentEndConditionType;
import Cpacs.OrientationType;
import Cpacs.PointConstraintType;
import Cpacs.StringUIDBaseType;

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
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getCAS <em>CAS</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getPositionXYZ <em>Position XYZ</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getPositionGeo <em>Position Geo</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getRunwayUID <em>Runway UID</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getSpecificExcessPower <em>Specific Excess Power</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getRateOfClimb <em>Rate Of Climb</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getFlightPathAngle <em>Flight Path Angle</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getMassFraction <em>Mass Fraction</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getFuelFraction <em>Fuel Fraction</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getFuelRemaining <em>Fuel Remaining</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentEndConditionTypeImpl#getFuelConsumed <em>Fuel Consumed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionSegmentEndConditionTypeImpl extends ComplexBaseTypeImpl implements MissionSegmentEndConditionType {
	/**
	 * The cached value of the '{@link #getCAS() <em>CAS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCAS()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType cAS;

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
	 * The cached value of the '{@link #getRunwayUID() <em>Runway UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunwayUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType runwayUID;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType orientation;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected PointConstraintType range;

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
	 * The cached value of the '{@link #getSpecificExcessPower() <em>Specific Excess Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificExcessPower()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType specificExcessPower;

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
	 * The cached value of the '{@link #getFlightPathAngle() <em>Flight Path Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightPathAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType flightPathAngle;

	/**
	 * The cached value of the '{@link #getMassFraction() <em>Mass Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassFraction()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType massFraction;

	/**
	 * The cached value of the '{@link #getFuelFraction() <em>Fuel Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelFraction()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType fuelFraction;

	/**
	 * The cached value of the '{@link #getFuelRemaining() <em>Fuel Remaining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelRemaining()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType fuelRemaining;

	/**
	 * The cached value of the '{@link #getFuelConsumed() <em>Fuel Consumed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelConsumed()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType fuelConsumed;

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
	public DoubleConstraintBaseType getCAS() {
		return cAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCAS(DoubleConstraintBaseType newCAS, NotificationChain msgs) {
		DoubleConstraintBaseType oldCAS = cAS;
		cAS = newCAS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CAS, oldCAS, newCAS);
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
	public void setCAS(DoubleConstraintBaseType newCAS) {
		if (newCAS != cAS) {
			NotificationChain msgs = null;
			if (cAS != null)
				msgs = ((InternalEObject) cAS).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CAS, null, msgs);
			if (newCAS != null)
				msgs = ((InternalEObject) newCAS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CAS, null, msgs);
			msgs = basicSetCAS(newCAS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CAS,
					newCAS, newCAS));
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
	public void setMachNumber(DoubleConstraintBaseType newMachNumber) {
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
	public StringUIDBaseType getRunwayUID() {
		return runwayUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunwayUID(StringUIDBaseType newRunwayUID, NotificationChain msgs) {
		StringUIDBaseType oldRunwayUID = runwayUID;
		runwayUID = newRunwayUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY_UID, oldRunwayUID, newRunwayUID);
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
	public void setRunwayUID(StringUIDBaseType newRunwayUID) {
		if (newRunwayUID != runwayUID) {
			NotificationChain msgs = null;
			if (runwayUID != null)
				msgs = ((InternalEObject) runwayUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY_UID, null,
						msgs);
			if (newRunwayUID != null)
				msgs = ((InternalEObject) newRunwayUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY_UID, null,
						msgs);
			msgs = basicSetRunwayUID(newRunwayUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY_UID, newRunwayUID, newRunwayUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientationType getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(OrientationType newOrientation, NotificationChain msgs) {
		OrientationType oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__ORIENTATION, oldOrientation, newOrientation);
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
	public void setOrientation(OrientationType newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject) orientation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__ORIENTATION, null,
						msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject) newOrientation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__ORIENTATION, null,
						msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__ORIENTATION, newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointConstraintType getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(PointConstraintType newRange, NotificationChain msgs) {
		PointConstraintType oldRange = range;
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
	public void setRange(PointConstraintType newRange) {
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
	public void setDuration(DoubleConstraintBaseType newDuration) {
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
	public DoubleConstraintBaseType getSpecificExcessPower() {
		return specificExcessPower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificExcessPower(DoubleConstraintBaseType newSpecificExcessPower,
			NotificationChain msgs) {
		DoubleConstraintBaseType oldSpecificExcessPower = specificExcessPower;
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
	public void setSpecificExcessPower(DoubleConstraintBaseType newSpecificExcessPower) {
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
	public void setRateOfClimb(DoubleConstraintBaseType newRateOfClimb) {
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
	public DoubleConstraintBaseType getFlightPathAngle() {
		return flightPathAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightPathAngle(DoubleConstraintBaseType newFlightPathAngle,
			NotificationChain msgs) {
		DoubleConstraintBaseType oldFlightPathAngle = flightPathAngle;
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
	public void setFlightPathAngle(DoubleConstraintBaseType newFlightPathAngle) {
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
	public DoubleConstraintBaseType getMassFraction() {
		return massFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassFraction(DoubleConstraintBaseType newMassFraction, NotificationChain msgs) {
		DoubleConstraintBaseType oldMassFraction = massFraction;
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
	public void setMassFraction(DoubleConstraintBaseType newMassFraction) {
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
	public DoubleConstraintBaseType getFuelFraction() {
		return fuelFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelFraction(DoubleConstraintBaseType newFuelFraction, NotificationChain msgs) {
		DoubleConstraintBaseType oldFuelFraction = fuelFraction;
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
	public void setFuelFraction(DoubleConstraintBaseType newFuelFraction) {
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
	public DoubleConstraintBaseType getFuelRemaining() {
		return fuelRemaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelRemaining(DoubleConstraintBaseType newFuelRemaining, NotificationChain msgs) {
		DoubleConstraintBaseType oldFuelRemaining = fuelRemaining;
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
	public void setFuelRemaining(DoubleConstraintBaseType newFuelRemaining) {
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
	public DoubleConstraintBaseType getFuelConsumed() {
		return fuelConsumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelConsumed(DoubleConstraintBaseType newFuelConsumed, NotificationChain msgs) {
		DoubleConstraintBaseType oldFuelConsumed = fuelConsumed;
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
	public void setFuelConsumed(DoubleConstraintBaseType newFuelConsumed) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CAS:
			return basicSetCAS(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ:
			return basicSetPositionXYZ(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO:
			return basicSetPositionGeo(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY_UID:
			return basicSetRunwayUID(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__ORIENTATION:
			return basicSetOrientation(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE:
			return basicSetRange(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION:
			return basicSetDuration(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER:
			return basicSetSpecificExcessPower(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB:
			return basicSetRateOfClimb(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE:
			return basicSetFlightPathAngle(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION:
			return basicSetMassFraction(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION:
			return basicSetFuelFraction(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING:
			return basicSetFuelRemaining(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED:
			return basicSetFuelConsumed(null, msgs);
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
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CAS:
			return getCAS();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ:
			return getPositionXYZ();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO:
			return getPositionGeo();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY_UID:
			return getRunwayUID();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__ORIENTATION:
			return getOrientation();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE:
			return getRange();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION:
			return getDuration();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER:
			return getSpecificExcessPower();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB:
			return getRateOfClimb();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE:
			return getFlightPathAngle();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION:
			return getMassFraction();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION:
			return getFuelFraction();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING:
			return getFuelRemaining();
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED:
			return getFuelConsumed();
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
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CAS:
			setCAS((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER:
			setMachNumber((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ:
			setPositionXYZ((PointConstraintType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO:
			setPositionGeo((GeographicPointConstraintType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY_UID:
			setRunwayUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__ORIENTATION:
			setOrientation((OrientationType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE:
			setRange((PointConstraintType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION:
			setDuration((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER:
			setSpecificExcessPower((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB:
			setRateOfClimb((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE:
			setFlightPathAngle((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION:
			setMassFraction((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION:
			setFuelFraction((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING:
			setFuelRemaining((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED:
			setFuelConsumed((DoubleConstraintBaseType) newValue);
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
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CAS:
			setCAS((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER:
			setMachNumber((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ:
			setPositionXYZ((PointConstraintType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO:
			setPositionGeo((GeographicPointConstraintType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY_UID:
			setRunwayUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__ORIENTATION:
			setOrientation((OrientationType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE:
			setRange((PointConstraintType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION:
			setDuration((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER:
			setSpecificExcessPower((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB:
			setRateOfClimb((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE:
			setFlightPathAngle((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION:
			setMassFraction((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION:
			setFuelFraction((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING:
			setFuelRemaining((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED:
			setFuelConsumed((DoubleConstraintBaseType) null);
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
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__CAS:
			return cAS != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_XYZ:
			return positionXYZ != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__POSITION_GEO:
			return positionGeo != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RUNWAY_UID:
			return runwayUID != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__ORIENTATION:
			return orientation != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RANGE:
			return range != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__DURATION:
			return duration != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__SPECIFIC_EXCESS_POWER:
			return specificExcessPower != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__RATE_OF_CLIMB:
			return rateOfClimb != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FLIGHT_PATH_ANGLE:
			return flightPathAngle != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__MASS_FRACTION:
			return massFraction != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_FRACTION:
			return fuelFraction != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_REMAINING:
			return fuelRemaining != null;
		case CpacsPackage.MISSION_SEGMENT_END_CONDITION_TYPE__FUEL_CONSUMED:
			return fuelConsumed != null;
		}
		return super.eIsSet(featureID);
	}

} //MissionSegmentEndConditionTypeImpl
