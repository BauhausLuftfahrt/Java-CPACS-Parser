/**
 */
package Cpacs.impl;

import Cpacs.ConstraintSettingsPointPerformanceType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleConstraintBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Settings Point Performance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getCAS <em>CAS</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getThrustSetting <em>Thrust Setting</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getClimbAngle <em>Climb Angle</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getRateOfClimb <em>Rate Of Climb</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getRateOfTurn <em>Rate Of Turn</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getRateOfDescent <em>Rate Of Descent</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getDescentAngle <em>Descent Angle</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getLoadFactor <em>Load Factor</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.impl.ConstraintSettingsPointPerformanceTypeImpl#getDeltaTemperatureISA <em>Delta Temperature ISA</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintSettingsPointPerformanceTypeImpl extends ComplexBaseTypeImpl
		implements ConstraintSettingsPointPerformanceType {
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
	 * The cached value of the '{@link #getThrustSetting() <em>Thrust Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrustSetting()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType thrustSetting;

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
	 * The cached value of the '{@link #getRateOfDescent() <em>Rate Of Descent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateOfDescent()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType rateOfDescent;

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
	 * The cached value of the '{@link #getDescentAngle() <em>Descent Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescentAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType descentAngle;

	/**
	 * The cached value of the '{@link #getLoadFactor() <em>Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadFactor()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType loadFactor;

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
	 * The cached value of the '{@link #getDeltaTemperatureISA() <em>Delta Temperature ISA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTemperatureISA()
	 * @generated
	 * @ordered
	 */
	protected DoubleConstraintBaseType deltaTemperatureISA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintSettingsPointPerformanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getConstraintSettingsPointPerformanceType();
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
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CAS, oldCAS, newCAS);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CAS, null,
						msgs);
			if (newCAS != null)
				msgs = ((InternalEObject) newCAS).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CAS, null,
						msgs);
			msgs = basicSetCAS(newCAS, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CAS, newCAS, newCAS));
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
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__MACH_NUMBER,
						null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__MACH_NUMBER,
						null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__MACH_NUMBER, newMachNumber,
					newMachNumber));
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
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__THRUST_SETTING, oldThrustSetting,
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
				msgs = ((InternalEObject) thrustSetting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__THRUST_SETTING, null, msgs);
			if (newThrustSetting != null)
				msgs = ((InternalEObject) newThrustSetting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__THRUST_SETTING, null, msgs);
			msgs = basicSetThrustSetting(newThrustSetting, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__THRUST_SETTING, newThrustSetting,
					newThrustSetting));
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
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CLIMB_ANGLE, oldClimbAngle, newClimbAngle);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CLIMB_ANGLE,
						null, msgs);
			if (newClimbAngle != null)
				msgs = ((InternalEObject) newClimbAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CLIMB_ANGLE,
						null, msgs);
			msgs = basicSetClimbAngle(newClimbAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CLIMB_ANGLE, newClimbAngle,
					newClimbAngle));
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
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_CLIMB, oldRateOfClimb,
					newRateOfClimb);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_CLIMB,
						null, msgs);
			if (newRateOfClimb != null)
				msgs = ((InternalEObject) newRateOfClimb).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_CLIMB,
						null, msgs);
			msgs = basicSetRateOfClimb(newRateOfClimb, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_CLIMB, newRateOfClimb,
					newRateOfClimb));
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
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_TURN, oldRateOfTurn,
					newRateOfTurn);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_TURN,
						null, msgs);
			if (newRateOfTurn != null)
				msgs = ((InternalEObject) newRateOfTurn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_TURN,
						null, msgs);
			msgs = basicSetRateOfTurn(newRateOfTurn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_TURN, newRateOfTurn,
					newRateOfTurn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getRateOfDescent() {
		return rateOfDescent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateOfDescent(DoubleConstraintBaseType newRateOfDescent, NotificationChain msgs) {
		DoubleConstraintBaseType oldRateOfDescent = rateOfDescent;
		rateOfDescent = newRateOfDescent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_DESCENT, oldRateOfDescent,
					newRateOfDescent);
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
	public void setRateOfDescent(DoubleConstraintBaseType newRateOfDescent) {
		if (newRateOfDescent != rateOfDescent) {
			NotificationChain msgs = null;
			if (rateOfDescent != null)
				msgs = ((InternalEObject) rateOfDescent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_DESCENT, null, msgs);
			if (newRateOfDescent != null)
				msgs = ((InternalEObject) newRateOfDescent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_DESCENT, null, msgs);
			msgs = basicSetRateOfDescent(newRateOfDescent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_DESCENT, newRateOfDescent,
					newRateOfDescent));
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
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ACCELERATION, oldAcceleration,
					newAcceleration);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ACCELERATION,
						null, msgs);
			if (newAcceleration != null)
				msgs = ((InternalEObject) newAcceleration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ACCELERATION,
						null, msgs);
			msgs = basicSetAcceleration(newAcceleration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ACCELERATION, newAcceleration,
					newAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getDescentAngle() {
		return descentAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescentAngle(DoubleConstraintBaseType newDescentAngle, NotificationChain msgs) {
		DoubleConstraintBaseType oldDescentAngle = descentAngle;
		descentAngle = newDescentAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DESCENT_ANGLE, oldDescentAngle,
					newDescentAngle);
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
	public void setDescentAngle(DoubleConstraintBaseType newDescentAngle) {
		if (newDescentAngle != descentAngle) {
			NotificationChain msgs = null;
			if (descentAngle != null)
				msgs = ((InternalEObject) descentAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DESCENT_ANGLE,
						null, msgs);
			if (newDescentAngle != null)
				msgs = ((InternalEObject) newDescentAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DESCENT_ANGLE,
						null, msgs);
			msgs = basicSetDescentAngle(newDescentAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DESCENT_ANGLE, newDescentAngle,
					newDescentAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getLoadFactor() {
		return loadFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadFactor(DoubleConstraintBaseType newLoadFactor, NotificationChain msgs) {
		DoubleConstraintBaseType oldLoadFactor = loadFactor;
		loadFactor = newLoadFactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__LOAD_FACTOR, oldLoadFactor, newLoadFactor);
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
	public void setLoadFactor(DoubleConstraintBaseType newLoadFactor) {
		if (newLoadFactor != loadFactor) {
			NotificationChain msgs = null;
			if (loadFactor != null)
				msgs = ((InternalEObject) loadFactor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__LOAD_FACTOR,
						null, msgs);
			if (newLoadFactor != null)
				msgs = ((InternalEObject) newLoadFactor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__LOAD_FACTOR,
						null, msgs);
			msgs = basicSetLoadFactor(newLoadFactor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__LOAD_FACTOR, newLoadFactor,
					newLoadFactor));
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
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DURATION, oldDuration, newDuration);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DURATION,
						null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject) newDuration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DURATION,
						null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DURATION, newDuration, newDuration));
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
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ANGLE_OF_ATTACK, oldAngleOfAttack,
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
				msgs = ((InternalEObject) angleOfAttack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ANGLE_OF_ATTACK, null, msgs);
			if (newAngleOfAttack != null)
				msgs = ((InternalEObject) newAngleOfAttack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ANGLE_OF_ATTACK, null, msgs);
			msgs = basicSetAngleOfAttack(newAngleOfAttack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ANGLE_OF_ATTACK, newAngleOfAttack,
					newAngleOfAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleConstraintBaseType getDeltaTemperatureISA() {
		return deltaTemperatureISA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeltaTemperatureISA(DoubleConstraintBaseType newDeltaTemperatureISA,
			NotificationChain msgs) {
		DoubleConstraintBaseType oldDeltaTemperatureISA = deltaTemperatureISA;
		deltaTemperatureISA = newDeltaTemperatureISA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DELTA_TEMPERATURE_ISA,
					oldDeltaTemperatureISA, newDeltaTemperatureISA);
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
	public void setDeltaTemperatureISA(DoubleConstraintBaseType newDeltaTemperatureISA) {
		if (newDeltaTemperatureISA != deltaTemperatureISA) {
			NotificationChain msgs = null;
			if (deltaTemperatureISA != null)
				msgs = ((InternalEObject) deltaTemperatureISA).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DELTA_TEMPERATURE_ISA,
						null, msgs);
			if (newDeltaTemperatureISA != null)
				msgs = ((InternalEObject) newDeltaTemperatureISA).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DELTA_TEMPERATURE_ISA,
						null, msgs);
			msgs = basicSetDeltaTemperatureISA(newDeltaTemperatureISA, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DELTA_TEMPERATURE_ISA,
					newDeltaTemperatureISA, newDeltaTemperatureISA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CAS:
			return basicSetCAS(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__THRUST_SETTING:
			return basicSetThrustSetting(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CLIMB_ANGLE:
			return basicSetClimbAngle(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_CLIMB:
			return basicSetRateOfClimb(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_TURN:
			return basicSetRateOfTurn(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_DESCENT:
			return basicSetRateOfDescent(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ACCELERATION:
			return basicSetAcceleration(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DESCENT_ANGLE:
			return basicSetDescentAngle(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__LOAD_FACTOR:
			return basicSetLoadFactor(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DURATION:
			return basicSetDuration(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ANGLE_OF_ATTACK:
			return basicSetAngleOfAttack(null, msgs);
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DELTA_TEMPERATURE_ISA:
			return basicSetDeltaTemperatureISA(null, msgs);
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
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CAS:
			return getCAS();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__THRUST_SETTING:
			return getThrustSetting();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CLIMB_ANGLE:
			return getClimbAngle();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_CLIMB:
			return getRateOfClimb();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_TURN:
			return getRateOfTurn();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_DESCENT:
			return getRateOfDescent();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ACCELERATION:
			return getAcceleration();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DESCENT_ANGLE:
			return getDescentAngle();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__LOAD_FACTOR:
			return getLoadFactor();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DURATION:
			return getDuration();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ANGLE_OF_ATTACK:
			return getAngleOfAttack();
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DELTA_TEMPERATURE_ISA:
			return getDeltaTemperatureISA();
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
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CAS:
			setCAS((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__MACH_NUMBER:
			setMachNumber((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__THRUST_SETTING:
			setThrustSetting((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CLIMB_ANGLE:
			setClimbAngle((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_CLIMB:
			setRateOfClimb((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_TURN:
			setRateOfTurn((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_DESCENT:
			setRateOfDescent((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ACCELERATION:
			setAcceleration((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DESCENT_ANGLE:
			setDescentAngle((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__LOAD_FACTOR:
			setLoadFactor((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DURATION:
			setDuration((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleConstraintBaseType) newValue);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DELTA_TEMPERATURE_ISA:
			setDeltaTemperatureISA((DoubleConstraintBaseType) newValue);
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
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CAS:
			setCAS((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__MACH_NUMBER:
			setMachNumber((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__THRUST_SETTING:
			setThrustSetting((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CLIMB_ANGLE:
			setClimbAngle((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_CLIMB:
			setRateOfClimb((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_TURN:
			setRateOfTurn((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_DESCENT:
			setRateOfDescent((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ACCELERATION:
			setAcceleration((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DESCENT_ANGLE:
			setDescentAngle((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__LOAD_FACTOR:
			setLoadFactor((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DURATION:
			setDuration((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleConstraintBaseType) null);
			return;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DELTA_TEMPERATURE_ISA:
			setDeltaTemperatureISA((DoubleConstraintBaseType) null);
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
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CAS:
			return cAS != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__THRUST_SETTING:
			return thrustSetting != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__CLIMB_ANGLE:
			return climbAngle != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_CLIMB:
			return rateOfClimb != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_TURN:
			return rateOfTurn != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__RATE_OF_DESCENT:
			return rateOfDescent != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ACCELERATION:
			return acceleration != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DESCENT_ANGLE:
			return descentAngle != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__LOAD_FACTOR:
			return loadFactor != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DURATION:
			return duration != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__ANGLE_OF_ATTACK:
			return angleOfAttack != null;
		case CpacsPackage.CONSTRAINT_SETTINGS_POINT_PERFORMANCE_TYPE__DELTA_TEMPERATURE_ISA:
			return deltaTemperatureISA != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstraintSettingsPointPerformanceTypeImpl
