/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EnvironmentType;
import Cpacs.GeographicPointType;
import Cpacs.MissionStartConditionType;
import Cpacs.MissionStartRunwayType;
import Cpacs.PointXYZType;
import Cpacs.TimeBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Start Condition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getPositionXYZ <em>Position XYZ</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getPositionGeo <em>Position Geo</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getRunway <em>Runway</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getStartTimeUTC <em>Start Time UTC</em>}</li>
 *   <li>{@link Cpacs.impl.MissionStartConditionTypeImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionStartConditionTypeImpl extends ComplexBaseTypeImpl implements MissionStartConditionType {
	/**
	 * The cached value of the '{@link #getCalibratedAirSpeed() <em>Calibrated Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibratedAirSpeed()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType calibratedAirSpeed;

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
	 * The cached value of the '{@link #getPositionXYZ() <em>Position XYZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionXYZ()
	 * @generated
	 * @ordered
	 */
	protected PointXYZType positionXYZ;

	/**
	 * The cached value of the '{@link #getPositionGeo() <em>Position Geo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionGeo()
	 * @generated
	 * @ordered
	 */
	protected GeographicPointType positionGeo;

	/**
	 * The cached value of the '{@link #getRunway() <em>Runway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunway()
	 * @generated
	 * @ordered
	 */
	protected MissionStartRunwayType runway;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType heading;

	/**
	 * The cached value of the '{@link #getStartTimeUTC() <em>Start Time UTC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTimeUTC()
	 * @generated
	 * @ordered
	 */
	protected TimeBaseType startTimeUTC;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentType environment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionStartConditionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionStartConditionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCalibratedAirSpeed() {
		return calibratedAirSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalibratedAirSpeed(DoubleBaseType newCalibratedAirSpeed, NotificationChain msgs) {
		DoubleBaseType oldCalibratedAirSpeed = calibratedAirSpeed;
		calibratedAirSpeed = newCalibratedAirSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__CALIBRATED_AIR_SPEED, oldCalibratedAirSpeed,
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
	public void setCalibratedAirSpeed(DoubleBaseType newCalibratedAirSpeed) {
		if (newCalibratedAirSpeed != calibratedAirSpeed) {
			NotificationChain msgs = null;
			if (calibratedAirSpeed != null)
				msgs = ((InternalEObject) calibratedAirSpeed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__CALIBRATED_AIR_SPEED, null,
						msgs);
			if (newCalibratedAirSpeed != null)
				msgs = ((InternalEObject) newCalibratedAirSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__CALIBRATED_AIR_SPEED, null,
						msgs);
			msgs = basicSetCalibratedAirSpeed(newCalibratedAirSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__CALIBRATED_AIR_SPEED, newCalibratedAirSpeed,
					newCalibratedAirSpeed));
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
					CpacsPackage.MISSION_START_CONDITION_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__MACH_NUMBER, null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__MACH_NUMBER, null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__MACH_NUMBER, newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointXYZType getPositionXYZ() {
		return positionXYZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionXYZ(PointXYZType newPositionXYZ, NotificationChain msgs) {
		PointXYZType oldPositionXYZ = positionXYZ;
		positionXYZ = newPositionXYZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ, oldPositionXYZ, newPositionXYZ);
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
	public void setPositionXYZ(PointXYZType newPositionXYZ) {
		if (newPositionXYZ != positionXYZ) {
			NotificationChain msgs = null;
			if (positionXYZ != null)
				msgs = ((InternalEObject) positionXYZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ, null, msgs);
			if (newPositionXYZ != null)
				msgs = ((InternalEObject) newPositionXYZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ, null, msgs);
			msgs = basicSetPositionXYZ(newPositionXYZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ, newPositionXYZ, newPositionXYZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeographicPointType getPositionGeo() {
		return positionGeo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionGeo(GeographicPointType newPositionGeo, NotificationChain msgs) {
		GeographicPointType oldPositionGeo = positionGeo;
		positionGeo = newPositionGeo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO, oldPositionGeo, newPositionGeo);
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
	public void setPositionGeo(GeographicPointType newPositionGeo) {
		if (newPositionGeo != positionGeo) {
			NotificationChain msgs = null;
			if (positionGeo != null)
				msgs = ((InternalEObject) positionGeo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO, null, msgs);
			if (newPositionGeo != null)
				msgs = ((InternalEObject) newPositionGeo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO, null, msgs);
			msgs = basicSetPositionGeo(newPositionGeo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO, newPositionGeo, newPositionGeo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionStartRunwayType getRunway() {
		return runway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunway(MissionStartRunwayType newRunway, NotificationChain msgs) {
		MissionStartRunwayType oldRunway = runway;
		runway = newRunway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY, oldRunway, newRunway);
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
	public void setRunway(MissionStartRunwayType newRunway) {
		if (newRunway != runway) {
			NotificationChain msgs = null;
			if (runway != null)
				msgs = ((InternalEObject) runway).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY, null, msgs);
			if (newRunway != null)
				msgs = ((InternalEObject) newRunway).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY, null, msgs);
			msgs = basicSetRunway(newRunway, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY,
					newRunway, newRunway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeading(DoubleBaseType newHeading, NotificationChain msgs) {
		DoubleBaseType oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__HEADING, oldHeading, newHeading);
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
	public void setHeading(DoubleBaseType newHeading) {
		if (newHeading != heading) {
			NotificationChain msgs = null;
			if (heading != null)
				msgs = ((InternalEObject) heading).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__HEADING, null, msgs);
			if (newHeading != null)
				msgs = ((InternalEObject) newHeading).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__HEADING, null, msgs);
			msgs = basicSetHeading(newHeading, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_START_CONDITION_TYPE__HEADING,
					newHeading, newHeading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeBaseType getStartTimeUTC() {
		return startTimeUTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartTimeUTC(TimeBaseType newStartTimeUTC, NotificationChain msgs) {
		TimeBaseType oldStartTimeUTC = startTimeUTC;
		startTimeUTC = newStartTimeUTC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__START_TIME_UTC, oldStartTimeUTC, newStartTimeUTC);
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
	public void setStartTimeUTC(TimeBaseType newStartTimeUTC) {
		if (newStartTimeUTC != startTimeUTC) {
			NotificationChain msgs = null;
			if (startTimeUTC != null)
				msgs = ((InternalEObject) startTimeUTC).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__START_TIME_UTC, null, msgs);
			if (newStartTimeUTC != null)
				msgs = ((InternalEObject) newStartTimeUTC).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__START_TIME_UTC, null, msgs);
			msgs = basicSetStartTimeUTC(newStartTimeUTC, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__START_TIME_UTC, newStartTimeUTC, newStartTimeUTC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentType getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(EnvironmentType newEnvironment, NotificationChain msgs) {
		EnvironmentType oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__ENVIRONMENT, oldEnvironment, newEnvironment);
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
	public void setEnvironment(EnvironmentType newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject) environment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject) newEnvironment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_START_CONDITION_TYPE__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_START_CONDITION_TYPE__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_START_CONDITION_TYPE__CALIBRATED_AIR_SPEED:
			return basicSetCalibratedAirSpeed(null, msgs);
		case CpacsPackage.MISSION_START_CONDITION_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ:
			return basicSetPositionXYZ(null, msgs);
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO:
			return basicSetPositionGeo(null, msgs);
		case CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY:
			return basicSetRunway(null, msgs);
		case CpacsPackage.MISSION_START_CONDITION_TYPE__HEADING:
			return basicSetHeading(null, msgs);
		case CpacsPackage.MISSION_START_CONDITION_TYPE__START_TIME_UTC:
			return basicSetStartTimeUTC(null, msgs);
		case CpacsPackage.MISSION_START_CONDITION_TYPE__ENVIRONMENT:
			return basicSetEnvironment(null, msgs);
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
		case CpacsPackage.MISSION_START_CONDITION_TYPE__CALIBRATED_AIR_SPEED:
			return getCalibratedAirSpeed();
		case CpacsPackage.MISSION_START_CONDITION_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ:
			return getPositionXYZ();
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO:
			return getPositionGeo();
		case CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY:
			return getRunway();
		case CpacsPackage.MISSION_START_CONDITION_TYPE__HEADING:
			return getHeading();
		case CpacsPackage.MISSION_START_CONDITION_TYPE__START_TIME_UTC:
			return getStartTimeUTC();
		case CpacsPackage.MISSION_START_CONDITION_TYPE__ENVIRONMENT:
			return getEnvironment();
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
		case CpacsPackage.MISSION_START_CONDITION_TYPE__CALIBRATED_AIR_SPEED:
			setCalibratedAirSpeed((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ:
			setPositionXYZ((PointXYZType) newValue);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO:
			setPositionGeo((GeographicPointType) newValue);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY:
			setRunway((MissionStartRunwayType) newValue);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__HEADING:
			setHeading((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__START_TIME_UTC:
			setStartTimeUTC((TimeBaseType) newValue);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__ENVIRONMENT:
			setEnvironment((EnvironmentType) newValue);
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
		case CpacsPackage.MISSION_START_CONDITION_TYPE__CALIBRATED_AIR_SPEED:
			setCalibratedAirSpeed((DoubleBaseType) null);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) null);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ:
			setPositionXYZ((PointXYZType) null);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO:
			setPositionGeo((GeographicPointType) null);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY:
			setRunway((MissionStartRunwayType) null);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__HEADING:
			setHeading((DoubleBaseType) null);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__START_TIME_UTC:
			setStartTimeUTC((TimeBaseType) null);
			return;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__ENVIRONMENT:
			setEnvironment((EnvironmentType) null);
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
		case CpacsPackage.MISSION_START_CONDITION_TYPE__CALIBRATED_AIR_SPEED:
			return calibratedAirSpeed != null;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_XYZ:
			return positionXYZ != null;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__POSITION_GEO:
			return positionGeo != null;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__RUNWAY:
			return runway != null;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__HEADING:
			return heading != null;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__START_TIME_UTC:
			return startTimeUTC != null;
		case CpacsPackage.MISSION_START_CONDITION_TYPE__ENVIRONMENT:
			return environment != null;
		}
		return super.eIsSet(featureID);
	}

} //MissionStartConditionTypeImpl
