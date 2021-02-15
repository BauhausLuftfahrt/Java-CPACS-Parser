/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceDeflectionsType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.FlowConditionType;
import Cpacs.QuasiSteadyRotationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Condition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getReynoldsNumber <em>Reynolds Number</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getStandardAltitude <em>Standard Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getDeltaTemperature <em>Delta Temperature</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getKinematicViscosity <em>Kinematic Viscosity</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getAirspeed <em>Airspeed</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getSpeedOfSound <em>Speed Of Sound</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getReynoldsNumber1 <em>Reynolds Number1</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getStandardAltitude1 <em>Standard Altitude1</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getDeltaTemperature1 <em>Delta Temperature1</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getSpeedOfSound1 <em>Speed Of Sound1</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getAirspeed1 <em>Airspeed1</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getKinematicViscosity1 <em>Kinematic Viscosity1</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getAirspeed2 <em>Airspeed2</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getStandardAltitude2 <em>Standard Altitude2</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getDeltaTemperature2 <em>Delta Temperature2</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getKinematicViscosity2 <em>Kinematic Viscosity2</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getSpeedOfSound2 <em>Speed Of Sound2</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getTargetLiftCoefficient <em>Target Lift Coefficient</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getQuasiSteadyRotation <em>Quasi Steady Rotation</em>}</li>
 *   <li>{@link Cpacs.impl.FlowConditionTypeImpl#getControlSurfaces <em>Control Surfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowConditionTypeImpl extends ComplexBaseTypeImpl implements FlowConditionType {
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
	 * The cached value of the '{@link #getReynoldsNumber() <em>Reynolds Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReynoldsNumber()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType reynoldsNumber;

	/**
	 * The cached value of the '{@link #getStandardAltitude() <em>Standard Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType standardAltitude;

	/**
	 * The cached value of the '{@link #getDeltaTemperature() <em>Delta Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTemperature()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaTemperature;

	/**
	 * The cached value of the '{@link #getKinematicViscosity() <em>Kinematic Viscosity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinematicViscosity()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType kinematicViscosity;

	/**
	 * The cached value of the '{@link #getAirspeed() <em>Airspeed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirspeed()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType airspeed;

	/**
	 * The cached value of the '{@link #getSpeedOfSound() <em>Speed Of Sound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOfSound()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType speedOfSound;

	/**
	 * The cached value of the '{@link #getReynoldsNumber1() <em>Reynolds Number1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReynoldsNumber1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType reynoldsNumber1;

	/**
	 * The cached value of the '{@link #getStandardAltitude1() <em>Standard Altitude1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardAltitude1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType standardAltitude1;

	/**
	 * The cached value of the '{@link #getDeltaTemperature1() <em>Delta Temperature1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTemperature1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaTemperature1;

	/**
	 * The cached value of the '{@link #getSpeedOfSound1() <em>Speed Of Sound1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOfSound1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType speedOfSound1;

	/**
	 * The cached value of the '{@link #getAirspeed1() <em>Airspeed1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirspeed1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType airspeed1;

	/**
	 * The cached value of the '{@link #getKinematicViscosity1() <em>Kinematic Viscosity1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinematicViscosity1()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType kinematicViscosity1;

	/**
	 * The cached value of the '{@link #getAirspeed2() <em>Airspeed2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirspeed2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType airspeed2;

	/**
	 * The cached value of the '{@link #getStandardAltitude2() <em>Standard Altitude2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardAltitude2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType standardAltitude2;

	/**
	 * The cached value of the '{@link #getDeltaTemperature2() <em>Delta Temperature2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTemperature2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType deltaTemperature2;

	/**
	 * The cached value of the '{@link #getKinematicViscosity2() <em>Kinematic Viscosity2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinematicViscosity2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType kinematicViscosity2;

	/**
	 * The cached value of the '{@link #getSpeedOfSound2() <em>Speed Of Sound2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOfSound2()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType speedOfSound2;

	/**
	 * The cached value of the '{@link #getAngleOfSideslip() <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleOfSideslip()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType angleOfSideslip;

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
	 * The cached value of the '{@link #getTargetLiftCoefficient() <em>Target Lift Coefficient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLiftCoefficient()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType targetLiftCoefficient;

	/**
	 * The cached value of the '{@link #getQuasiSteadyRotation() <em>Quasi Steady Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuasiSteadyRotation()
	 * @generated
	 * @ordered
	 */
	protected QuasiSteadyRotationType quasiSteadyRotation;

	/**
	 * The cached value of the '{@link #getControlSurfaces() <em>Control Surfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfaces()
	 * @generated
	 * @ordered
	 */
	protected ControlSurfaceDeflectionsType controlSurfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowConditionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlowConditionType();
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
					CpacsPackage.FLOW_CONDITION_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__MACH_NUMBER, null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__MACH_NUMBER, null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__MACH_NUMBER,
					newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getReynoldsNumber() {
		return reynoldsNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReynoldsNumber(DoubleBaseType newReynoldsNumber, NotificationChain msgs) {
		DoubleBaseType oldReynoldsNumber = reynoldsNumber;
		reynoldsNumber = newReynoldsNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER, oldReynoldsNumber, newReynoldsNumber);
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
	public void setReynoldsNumber(DoubleBaseType newReynoldsNumber) {
		if (newReynoldsNumber != reynoldsNumber) {
			NotificationChain msgs = null;
			if (reynoldsNumber != null)
				msgs = ((InternalEObject) reynoldsNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER, null, msgs);
			if (newReynoldsNumber != null)
				msgs = ((InternalEObject) newReynoldsNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER, null, msgs);
			msgs = basicSetReynoldsNumber(newReynoldsNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER,
					newReynoldsNumber, newReynoldsNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getStandardAltitude() {
		return standardAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardAltitude(DoubleBaseType newStandardAltitude, NotificationChain msgs) {
		DoubleBaseType oldStandardAltitude = standardAltitude;
		standardAltitude = newStandardAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE, oldStandardAltitude, newStandardAltitude);
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
	public void setStandardAltitude(DoubleBaseType newStandardAltitude) {
		if (newStandardAltitude != standardAltitude) {
			NotificationChain msgs = null;
			if (standardAltitude != null)
				msgs = ((InternalEObject) standardAltitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE, null, msgs);
			if (newStandardAltitude != null)
				msgs = ((InternalEObject) newStandardAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE, null, msgs);
			msgs = basicSetStandardAltitude(newStandardAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE,
					newStandardAltitude, newStandardAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaTemperature() {
		return deltaTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaTemperature(DoubleBaseType newDeltaTemperature, NotificationChain msgs) {
		DoubleBaseType oldDeltaTemperature = deltaTemperature;
		deltaTemperature = newDeltaTemperature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE, oldDeltaTemperature, newDeltaTemperature);
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
	public void setDeltaTemperature(DoubleBaseType newDeltaTemperature) {
		if (newDeltaTemperature != deltaTemperature) {
			NotificationChain msgs = null;
			if (deltaTemperature != null)
				msgs = ((InternalEObject) deltaTemperature).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE, null, msgs);
			if (newDeltaTemperature != null)
				msgs = ((InternalEObject) newDeltaTemperature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE, null, msgs);
			msgs = basicSetDeltaTemperature(newDeltaTemperature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE,
					newDeltaTemperature, newDeltaTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getKinematicViscosity() {
		return kinematicViscosity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKinematicViscosity(DoubleBaseType newKinematicViscosity, NotificationChain msgs) {
		DoubleBaseType oldKinematicViscosity = kinematicViscosity;
		kinematicViscosity = newKinematicViscosity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY, oldKinematicViscosity,
					newKinematicViscosity);
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
	public void setKinematicViscosity(DoubleBaseType newKinematicViscosity) {
		if (newKinematicViscosity != kinematicViscosity) {
			NotificationChain msgs = null;
			if (kinematicViscosity != null)
				msgs = ((InternalEObject) kinematicViscosity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY, null, msgs);
			if (newKinematicViscosity != null)
				msgs = ((InternalEObject) newKinematicViscosity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY, null, msgs);
			msgs = basicSetKinematicViscosity(newKinematicViscosity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY,
					newKinematicViscosity, newKinematicViscosity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAirspeed() {
		return airspeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirspeed(DoubleBaseType newAirspeed, NotificationChain msgs) {
		DoubleBaseType oldAirspeed = airspeed;
		airspeed = newAirspeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED, oldAirspeed, newAirspeed);
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
	public void setAirspeed(DoubleBaseType newAirspeed) {
		if (newAirspeed != airspeed) {
			NotificationChain msgs = null;
			if (airspeed != null)
				msgs = ((InternalEObject) airspeed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED, null, msgs);
			if (newAirspeed != null)
				msgs = ((InternalEObject) newAirspeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED, null, msgs);
			msgs = basicSetAirspeed(newAirspeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED,
					newAirspeed, newAirspeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSpeedOfSound() {
		return speedOfSound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeedOfSound(DoubleBaseType newSpeedOfSound, NotificationChain msgs) {
		DoubleBaseType oldSpeedOfSound = speedOfSound;
		speedOfSound = newSpeedOfSound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND, oldSpeedOfSound, newSpeedOfSound);
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
	public void setSpeedOfSound(DoubleBaseType newSpeedOfSound) {
		if (newSpeedOfSound != speedOfSound) {
			NotificationChain msgs = null;
			if (speedOfSound != null)
				msgs = ((InternalEObject) speedOfSound).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND, null, msgs);
			if (newSpeedOfSound != null)
				msgs = ((InternalEObject) newSpeedOfSound).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND, null, msgs);
			msgs = basicSetSpeedOfSound(newSpeedOfSound, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND,
					newSpeedOfSound, newSpeedOfSound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getReynoldsNumber1() {
		return reynoldsNumber1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReynoldsNumber1(DoubleBaseType newReynoldsNumber1, NotificationChain msgs) {
		DoubleBaseType oldReynoldsNumber1 = reynoldsNumber1;
		reynoldsNumber1 = newReynoldsNumber1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER1, oldReynoldsNumber1, newReynoldsNumber1);
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
	public void setReynoldsNumber1(DoubleBaseType newReynoldsNumber1) {
		if (newReynoldsNumber1 != reynoldsNumber1) {
			NotificationChain msgs = null;
			if (reynoldsNumber1 != null)
				msgs = ((InternalEObject) reynoldsNumber1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER1, null, msgs);
			if (newReynoldsNumber1 != null)
				msgs = ((InternalEObject) newReynoldsNumber1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER1, null, msgs);
			msgs = basicSetReynoldsNumber1(newReynoldsNumber1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER1,
					newReynoldsNumber1, newReynoldsNumber1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getStandardAltitude1() {
		return standardAltitude1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardAltitude1(DoubleBaseType newStandardAltitude1, NotificationChain msgs) {
		DoubleBaseType oldStandardAltitude1 = standardAltitude1;
		standardAltitude1 = newStandardAltitude1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE1, oldStandardAltitude1, newStandardAltitude1);
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
	public void setStandardAltitude1(DoubleBaseType newStandardAltitude1) {
		if (newStandardAltitude1 != standardAltitude1) {
			NotificationChain msgs = null;
			if (standardAltitude1 != null)
				msgs = ((InternalEObject) standardAltitude1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE1, null, msgs);
			if (newStandardAltitude1 != null)
				msgs = ((InternalEObject) newStandardAltitude1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE1, null, msgs);
			msgs = basicSetStandardAltitude1(newStandardAltitude1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE1,
					newStandardAltitude1, newStandardAltitude1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaTemperature1() {
		return deltaTemperature1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaTemperature1(DoubleBaseType newDeltaTemperature1, NotificationChain msgs) {
		DoubleBaseType oldDeltaTemperature1 = deltaTemperature1;
		deltaTemperature1 = newDeltaTemperature1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE1, oldDeltaTemperature1, newDeltaTemperature1);
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
	public void setDeltaTemperature1(DoubleBaseType newDeltaTemperature1) {
		if (newDeltaTemperature1 != deltaTemperature1) {
			NotificationChain msgs = null;
			if (deltaTemperature1 != null)
				msgs = ((InternalEObject) deltaTemperature1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE1, null, msgs);
			if (newDeltaTemperature1 != null)
				msgs = ((InternalEObject) newDeltaTemperature1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE1, null, msgs);
			msgs = basicSetDeltaTemperature1(newDeltaTemperature1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE1,
					newDeltaTemperature1, newDeltaTemperature1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSpeedOfSound1() {
		return speedOfSound1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeedOfSound1(DoubleBaseType newSpeedOfSound1, NotificationChain msgs) {
		DoubleBaseType oldSpeedOfSound1 = speedOfSound1;
		speedOfSound1 = newSpeedOfSound1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND1, oldSpeedOfSound1, newSpeedOfSound1);
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
	public void setSpeedOfSound1(DoubleBaseType newSpeedOfSound1) {
		if (newSpeedOfSound1 != speedOfSound1) {
			NotificationChain msgs = null;
			if (speedOfSound1 != null)
				msgs = ((InternalEObject) speedOfSound1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND1, null, msgs);
			if (newSpeedOfSound1 != null)
				msgs = ((InternalEObject) newSpeedOfSound1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND1, null, msgs);
			msgs = basicSetSpeedOfSound1(newSpeedOfSound1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND1,
					newSpeedOfSound1, newSpeedOfSound1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAirspeed1() {
		return airspeed1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirspeed1(DoubleBaseType newAirspeed1, NotificationChain msgs) {
		DoubleBaseType oldAirspeed1 = airspeed1;
		airspeed1 = newAirspeed1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED1, oldAirspeed1, newAirspeed1);
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
	public void setAirspeed1(DoubleBaseType newAirspeed1) {
		if (newAirspeed1 != airspeed1) {
			NotificationChain msgs = null;
			if (airspeed1 != null)
				msgs = ((InternalEObject) airspeed1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED1, null, msgs);
			if (newAirspeed1 != null)
				msgs = ((InternalEObject) newAirspeed1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED1, null, msgs);
			msgs = basicSetAirspeed1(newAirspeed1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED1,
					newAirspeed1, newAirspeed1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getKinematicViscosity1() {
		return kinematicViscosity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKinematicViscosity1(DoubleBaseType newKinematicViscosity1,
			NotificationChain msgs) {
		DoubleBaseType oldKinematicViscosity1 = kinematicViscosity1;
		kinematicViscosity1 = newKinematicViscosity1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY1, oldKinematicViscosity1,
					newKinematicViscosity1);
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
	public void setKinematicViscosity1(DoubleBaseType newKinematicViscosity1) {
		if (newKinematicViscosity1 != kinematicViscosity1) {
			NotificationChain msgs = null;
			if (kinematicViscosity1 != null)
				msgs = ((InternalEObject) kinematicViscosity1).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY1, null, msgs);
			if (newKinematicViscosity1 != null)
				msgs = ((InternalEObject) newKinematicViscosity1).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY1, null, msgs);
			msgs = basicSetKinematicViscosity1(newKinematicViscosity1, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY1, newKinematicViscosity1,
					newKinematicViscosity1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAirspeed2() {
		return airspeed2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAirspeed2(DoubleBaseType newAirspeed2, NotificationChain msgs) {
		DoubleBaseType oldAirspeed2 = airspeed2;
		airspeed2 = newAirspeed2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED2, oldAirspeed2, newAirspeed2);
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
	public void setAirspeed2(DoubleBaseType newAirspeed2) {
		if (newAirspeed2 != airspeed2) {
			NotificationChain msgs = null;
			if (airspeed2 != null)
				msgs = ((InternalEObject) airspeed2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED2, null, msgs);
			if (newAirspeed2 != null)
				msgs = ((InternalEObject) newAirspeed2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED2, null, msgs);
			msgs = basicSetAirspeed2(newAirspeed2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED2,
					newAirspeed2, newAirspeed2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getStandardAltitude2() {
		return standardAltitude2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStandardAltitude2(DoubleBaseType newStandardAltitude2, NotificationChain msgs) {
		DoubleBaseType oldStandardAltitude2 = standardAltitude2;
		standardAltitude2 = newStandardAltitude2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE2, oldStandardAltitude2, newStandardAltitude2);
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
	public void setStandardAltitude2(DoubleBaseType newStandardAltitude2) {
		if (newStandardAltitude2 != standardAltitude2) {
			NotificationChain msgs = null;
			if (standardAltitude2 != null)
				msgs = ((InternalEObject) standardAltitude2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE2, null, msgs);
			if (newStandardAltitude2 != null)
				msgs = ((InternalEObject) newStandardAltitude2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE2, null, msgs);
			msgs = basicSetStandardAltitude2(newStandardAltitude2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE2,
					newStandardAltitude2, newStandardAltitude2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getDeltaTemperature2() {
		return deltaTemperature2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaTemperature2(DoubleBaseType newDeltaTemperature2, NotificationChain msgs) {
		DoubleBaseType oldDeltaTemperature2 = deltaTemperature2;
		deltaTemperature2 = newDeltaTemperature2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE2, oldDeltaTemperature2, newDeltaTemperature2);
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
	public void setDeltaTemperature2(DoubleBaseType newDeltaTemperature2) {
		if (newDeltaTemperature2 != deltaTemperature2) {
			NotificationChain msgs = null;
			if (deltaTemperature2 != null)
				msgs = ((InternalEObject) deltaTemperature2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE2, null, msgs);
			if (newDeltaTemperature2 != null)
				msgs = ((InternalEObject) newDeltaTemperature2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE2, null, msgs);
			msgs = basicSetDeltaTemperature2(newDeltaTemperature2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE2,
					newDeltaTemperature2, newDeltaTemperature2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getKinematicViscosity2() {
		return kinematicViscosity2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKinematicViscosity2(DoubleBaseType newKinematicViscosity2,
			NotificationChain msgs) {
		DoubleBaseType oldKinematicViscosity2 = kinematicViscosity2;
		kinematicViscosity2 = newKinematicViscosity2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY2, oldKinematicViscosity2,
					newKinematicViscosity2);
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
	public void setKinematicViscosity2(DoubleBaseType newKinematicViscosity2) {
		if (newKinematicViscosity2 != kinematicViscosity2) {
			NotificationChain msgs = null;
			if (kinematicViscosity2 != null)
				msgs = ((InternalEObject) kinematicViscosity2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY2, null, msgs);
			if (newKinematicViscosity2 != null)
				msgs = ((InternalEObject) newKinematicViscosity2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY2, null, msgs);
			msgs = basicSetKinematicViscosity2(newKinematicViscosity2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY2, newKinematicViscosity2,
					newKinematicViscosity2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSpeedOfSound2() {
		return speedOfSound2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeedOfSound2(DoubleBaseType newSpeedOfSound2, NotificationChain msgs) {
		DoubleBaseType oldSpeedOfSound2 = speedOfSound2;
		speedOfSound2 = newSpeedOfSound2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND2, oldSpeedOfSound2, newSpeedOfSound2);
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
	public void setSpeedOfSound2(DoubleBaseType newSpeedOfSound2) {
		if (newSpeedOfSound2 != speedOfSound2) {
			NotificationChain msgs = null;
			if (speedOfSound2 != null)
				msgs = ((InternalEObject) speedOfSound2).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND2, null, msgs);
			if (newSpeedOfSound2 != null)
				msgs = ((InternalEObject) newSpeedOfSound2).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND2, null, msgs);
			msgs = basicSetSpeedOfSound2(newSpeedOfSound2, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND2,
					newSpeedOfSound2, newSpeedOfSound2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAngleOfSideslip() {
		return angleOfSideslip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleOfSideslip(DoubleBaseType newAngleOfSideslip, NotificationChain msgs) {
		DoubleBaseType oldAngleOfSideslip = angleOfSideslip;
		angleOfSideslip = newAngleOfSideslip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_SIDESLIP, oldAngleOfSideslip, newAngleOfSideslip);
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
	public void setAngleOfSideslip(DoubleBaseType newAngleOfSideslip) {
		if (newAngleOfSideslip != angleOfSideslip) {
			NotificationChain msgs = null;
			if (angleOfSideslip != null)
				msgs = ((InternalEObject) angleOfSideslip).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			if (newAngleOfSideslip != null)
				msgs = ((InternalEObject) newAngleOfSideslip).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			msgs = basicSetAngleOfSideslip(newAngleOfSideslip, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_SIDESLIP,
					newAngleOfSideslip, newAngleOfSideslip));
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
					CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_ATTACK, oldAngleOfAttack, newAngleOfAttack);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_ATTACK, null, msgs);
			if (newAngleOfAttack != null)
				msgs = ((InternalEObject) newAngleOfAttack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_ATTACK, null, msgs);
			msgs = basicSetAngleOfAttack(newAngleOfAttack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_ATTACK,
					newAngleOfAttack, newAngleOfAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTargetLiftCoefficient() {
		return targetLiftCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetLiftCoefficient(DoubleBaseType newTargetLiftCoefficient,
			NotificationChain msgs) {
		DoubleBaseType oldTargetLiftCoefficient = targetLiftCoefficient;
		targetLiftCoefficient = newTargetLiftCoefficient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__TARGET_LIFT_COEFFICIENT, oldTargetLiftCoefficient,
					newTargetLiftCoefficient);
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
	public void setTargetLiftCoefficient(DoubleBaseType newTargetLiftCoefficient) {
		if (newTargetLiftCoefficient != targetLiftCoefficient) {
			NotificationChain msgs = null;
			if (targetLiftCoefficient != null)
				msgs = ((InternalEObject) targetLiftCoefficient).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__TARGET_LIFT_COEFFICIENT, null, msgs);
			if (newTargetLiftCoefficient != null)
				msgs = ((InternalEObject) newTargetLiftCoefficient).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__TARGET_LIFT_COEFFICIENT, null, msgs);
			msgs = basicSetTargetLiftCoefficient(newTargetLiftCoefficient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__TARGET_LIFT_COEFFICIENT, newTargetLiftCoefficient,
					newTargetLiftCoefficient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuasiSteadyRotationType getQuasiSteadyRotation() {
		return quasiSteadyRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuasiSteadyRotation(QuasiSteadyRotationType newQuasiSteadyRotation,
			NotificationChain msgs) {
		QuasiSteadyRotationType oldQuasiSteadyRotation = quasiSteadyRotation;
		quasiSteadyRotation = newQuasiSteadyRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__QUASI_STEADY_ROTATION, oldQuasiSteadyRotation,
					newQuasiSteadyRotation);
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
	public void setQuasiSteadyRotation(QuasiSteadyRotationType newQuasiSteadyRotation) {
		if (newQuasiSteadyRotation != quasiSteadyRotation) {
			NotificationChain msgs = null;
			if (quasiSteadyRotation != null)
				msgs = ((InternalEObject) quasiSteadyRotation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__QUASI_STEADY_ROTATION, null, msgs);
			if (newQuasiSteadyRotation != null)
				msgs = ((InternalEObject) newQuasiSteadyRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__QUASI_STEADY_ROTATION, null, msgs);
			msgs = basicSetQuasiSteadyRotation(newQuasiSteadyRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__QUASI_STEADY_ROTATION, newQuasiSteadyRotation,
					newQuasiSteadyRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlSurfaceDeflectionsType getControlSurfaces() {
		return controlSurfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlSurfaces(ControlSurfaceDeflectionsType newControlSurfaces,
			NotificationChain msgs) {
		ControlSurfaceDeflectionsType oldControlSurfaces = controlSurfaces;
		controlSurfaces = newControlSurfaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLOW_CONDITION_TYPE__CONTROL_SURFACES, oldControlSurfaces, newControlSurfaces);
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
	public void setControlSurfaces(ControlSurfaceDeflectionsType newControlSurfaces) {
		if (newControlSurfaces != controlSurfaces) {
			NotificationChain msgs = null;
			if (controlSurfaces != null)
				msgs = ((InternalEObject) controlSurfaces).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__CONTROL_SURFACES, null, msgs);
			if (newControlSurfaces != null)
				msgs = ((InternalEObject) newControlSurfaces).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLOW_CONDITION_TYPE__CONTROL_SURFACES, null, msgs);
			msgs = basicSetControlSurfaces(newControlSurfaces, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLOW_CONDITION_TYPE__CONTROL_SURFACES,
					newControlSurfaces, newControlSurfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLOW_CONDITION_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER:
			return basicSetReynoldsNumber(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE:
			return basicSetStandardAltitude(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE:
			return basicSetDeltaTemperature(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY:
			return basicSetKinematicViscosity(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED:
			return basicSetAirspeed(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND:
			return basicSetSpeedOfSound(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER1:
			return basicSetReynoldsNumber1(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE1:
			return basicSetStandardAltitude1(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE1:
			return basicSetDeltaTemperature1(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND1:
			return basicSetSpeedOfSound1(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED1:
			return basicSetAirspeed1(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY1:
			return basicSetKinematicViscosity1(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED2:
			return basicSetAirspeed2(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE2:
			return basicSetStandardAltitude2(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE2:
			return basicSetDeltaTemperature2(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY2:
			return basicSetKinematicViscosity2(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND2:
			return basicSetSpeedOfSound2(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_SIDESLIP:
			return basicSetAngleOfSideslip(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_ATTACK:
			return basicSetAngleOfAttack(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__TARGET_LIFT_COEFFICIENT:
			return basicSetTargetLiftCoefficient(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__QUASI_STEADY_ROTATION:
			return basicSetQuasiSteadyRotation(null, msgs);
		case CpacsPackage.FLOW_CONDITION_TYPE__CONTROL_SURFACES:
			return basicSetControlSurfaces(null, msgs);
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
		case CpacsPackage.FLOW_CONDITION_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER:
			return getReynoldsNumber();
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE:
			return getStandardAltitude();
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE:
			return getDeltaTemperature();
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY:
			return getKinematicViscosity();
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED:
			return getAirspeed();
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND:
			return getSpeedOfSound();
		case CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER1:
			return getReynoldsNumber1();
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE1:
			return getStandardAltitude1();
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE1:
			return getDeltaTemperature1();
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND1:
			return getSpeedOfSound1();
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED1:
			return getAirspeed1();
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY1:
			return getKinematicViscosity1();
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED2:
			return getAirspeed2();
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE2:
			return getStandardAltitude2();
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE2:
			return getDeltaTemperature2();
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY2:
			return getKinematicViscosity2();
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND2:
			return getSpeedOfSound2();
		case CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_SIDESLIP:
			return getAngleOfSideslip();
		case CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_ATTACK:
			return getAngleOfAttack();
		case CpacsPackage.FLOW_CONDITION_TYPE__TARGET_LIFT_COEFFICIENT:
			return getTargetLiftCoefficient();
		case CpacsPackage.FLOW_CONDITION_TYPE__QUASI_STEADY_ROTATION:
			return getQuasiSteadyRotation();
		case CpacsPackage.FLOW_CONDITION_TYPE__CONTROL_SURFACES:
			return getControlSurfaces();
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
		case CpacsPackage.FLOW_CONDITION_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER:
			setReynoldsNumber((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE:
			setStandardAltitude((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE:
			setDeltaTemperature((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY:
			setKinematicViscosity((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED:
			setAirspeed((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND:
			setSpeedOfSound((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER1:
			setReynoldsNumber1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE1:
			setStandardAltitude1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE1:
			setDeltaTemperature1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND1:
			setSpeedOfSound1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED1:
			setAirspeed1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY1:
			setKinematicViscosity1((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED2:
			setAirspeed2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE2:
			setStandardAltitude2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE2:
			setDeltaTemperature2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY2:
			setKinematicViscosity2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND2:
			setSpeedOfSound2((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__TARGET_LIFT_COEFFICIENT:
			setTargetLiftCoefficient((DoubleBaseType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__QUASI_STEADY_ROTATION:
			setQuasiSteadyRotation((QuasiSteadyRotationType) newValue);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__CONTROL_SURFACES:
			setControlSurfaces((ControlSurfaceDeflectionsType) newValue);
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
		case CpacsPackage.FLOW_CONDITION_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER:
			setReynoldsNumber((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE:
			setStandardAltitude((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE:
			setDeltaTemperature((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY:
			setKinematicViscosity((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED:
			setAirspeed((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND:
			setSpeedOfSound((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER1:
			setReynoldsNumber1((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE1:
			setStandardAltitude1((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE1:
			setDeltaTemperature1((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND1:
			setSpeedOfSound1((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED1:
			setAirspeed1((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY1:
			setKinematicViscosity1((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED2:
			setAirspeed2((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE2:
			setStandardAltitude2((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE2:
			setDeltaTemperature2((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY2:
			setKinematicViscosity2((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND2:
			setSpeedOfSound2((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__TARGET_LIFT_COEFFICIENT:
			setTargetLiftCoefficient((DoubleBaseType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__QUASI_STEADY_ROTATION:
			setQuasiSteadyRotation((QuasiSteadyRotationType) null);
			return;
		case CpacsPackage.FLOW_CONDITION_TYPE__CONTROL_SURFACES:
			setControlSurfaces((ControlSurfaceDeflectionsType) null);
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
		case CpacsPackage.FLOW_CONDITION_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER:
			return reynoldsNumber != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE:
			return standardAltitude != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE:
			return deltaTemperature != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY:
			return kinematicViscosity != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED:
			return airspeed != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND:
			return speedOfSound != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__REYNOLDS_NUMBER1:
			return reynoldsNumber1 != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE1:
			return standardAltitude1 != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE1:
			return deltaTemperature1 != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND1:
			return speedOfSound1 != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED1:
			return airspeed1 != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY1:
			return kinematicViscosity1 != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__AIRSPEED2:
			return airspeed2 != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__STANDARD_ALTITUDE2:
			return standardAltitude2 != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__DELTA_TEMPERATURE2:
			return deltaTemperature2 != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__KINEMATIC_VISCOSITY2:
			return kinematicViscosity2 != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__SPEED_OF_SOUND2:
			return speedOfSound2 != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_SIDESLIP:
			return angleOfSideslip != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__ANGLE_OF_ATTACK:
			return angleOfAttack != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__TARGET_LIFT_COEFFICIENT:
			return targetLiftCoefficient != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__QUASI_STEADY_ROTATION:
			return quasiSteadyRotation != null;
		case CpacsPackage.FLOW_CONDITION_TYPE__CONTROL_SURFACES:
			return controlSurfaces != null;
		}
		return super.eIsSet(featureID);
	}

} //FlowConditionTypeImpl
