/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.QuasiSteadyRotationType;
import Cpacs.TrimParametersType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trim Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrimParametersTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.TrimParametersTypeImpl#getReynoldsNumber <em>Reynolds Number</em>}</li>
 *   <li>{@link Cpacs.impl.TrimParametersTypeImpl#getAirspeed <em>Airspeed</em>}</li>
 *   <li>{@link Cpacs.impl.TrimParametersTypeImpl#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.impl.TrimParametersTypeImpl#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.impl.TrimParametersTypeImpl#getLoadFactorZ <em>Load Factor Z</em>}</li>
 *   <li>{@link Cpacs.impl.TrimParametersTypeImpl#getTargetLiftCoefficient <em>Target Lift Coefficient</em>}</li>
 *   <li>{@link Cpacs.impl.TrimParametersTypeImpl#getQuasiSteadyRotation <em>Quasi Steady Rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrimParametersTypeImpl extends ComplexBaseTypeImpl implements TrimParametersType {
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
	 * The cached value of the '{@link #getAirspeed() <em>Airspeed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirspeed()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType airspeed;

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
	 * The cached value of the '{@link #getLoadFactorZ() <em>Load Factor Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadFactorZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType loadFactorZ;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrimParametersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrimParametersType();
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
					CpacsPackage.TRIM_PARAMETERS_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__MACH_NUMBER, null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__MACH_NUMBER, null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_PARAMETERS_TYPE__MACH_NUMBER,
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
					CpacsPackage.TRIM_PARAMETERS_TYPE__REYNOLDS_NUMBER, oldReynoldsNumber, newReynoldsNumber);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__REYNOLDS_NUMBER, null, msgs);
			if (newReynoldsNumber != null)
				msgs = ((InternalEObject) newReynoldsNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__REYNOLDS_NUMBER, null, msgs);
			msgs = basicSetReynoldsNumber(newReynoldsNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_PARAMETERS_TYPE__REYNOLDS_NUMBER,
					newReynoldsNumber, newReynoldsNumber));
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
					CpacsPackage.TRIM_PARAMETERS_TYPE__AIRSPEED, oldAirspeed, newAirspeed);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__AIRSPEED, null, msgs);
			if (newAirspeed != null)
				msgs = ((InternalEObject) newAirspeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__AIRSPEED, null, msgs);
			msgs = basicSetAirspeed(newAirspeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_PARAMETERS_TYPE__AIRSPEED,
					newAirspeed, newAirspeed));
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
					CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_SIDESLIP, oldAngleOfSideslip, newAngleOfSideslip);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			if (newAngleOfSideslip != null)
				msgs = ((InternalEObject) newAngleOfSideslip).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_SIDESLIP, null, msgs);
			msgs = basicSetAngleOfSideslip(newAngleOfSideslip, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_SIDESLIP,
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
					CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_ATTACK, oldAngleOfAttack, newAngleOfAttack);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_ATTACK, null, msgs);
			if (newAngleOfAttack != null)
				msgs = ((InternalEObject) newAngleOfAttack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_ATTACK, null, msgs);
			msgs = basicSetAngleOfAttack(newAngleOfAttack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_ATTACK,
					newAngleOfAttack, newAngleOfAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getLoadFactorZ() {
		return loadFactorZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadFactorZ(DoubleBaseType newLoadFactorZ, NotificationChain msgs) {
		DoubleBaseType oldLoadFactorZ = loadFactorZ;
		loadFactorZ = newLoadFactorZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRIM_PARAMETERS_TYPE__LOAD_FACTOR_Z, oldLoadFactorZ, newLoadFactorZ);
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
	public void setLoadFactorZ(DoubleBaseType newLoadFactorZ) {
		if (newLoadFactorZ != loadFactorZ) {
			NotificationChain msgs = null;
			if (loadFactorZ != null)
				msgs = ((InternalEObject) loadFactorZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__LOAD_FACTOR_Z, null, msgs);
			if (newLoadFactorZ != null)
				msgs = ((InternalEObject) newLoadFactorZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__LOAD_FACTOR_Z, null, msgs);
			msgs = basicSetLoadFactorZ(newLoadFactorZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRIM_PARAMETERS_TYPE__LOAD_FACTOR_Z,
					newLoadFactorZ, newLoadFactorZ));
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
					CpacsPackage.TRIM_PARAMETERS_TYPE__TARGET_LIFT_COEFFICIENT, oldTargetLiftCoefficient,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__TARGET_LIFT_COEFFICIENT, null,
						msgs);
			if (newTargetLiftCoefficient != null)
				msgs = ((InternalEObject) newTargetLiftCoefficient).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__TARGET_LIFT_COEFFICIENT, null,
						msgs);
			msgs = basicSetTargetLiftCoefficient(newTargetLiftCoefficient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRIM_PARAMETERS_TYPE__TARGET_LIFT_COEFFICIENT, newTargetLiftCoefficient,
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
					CpacsPackage.TRIM_PARAMETERS_TYPE__QUASI_STEADY_ROTATION, oldQuasiSteadyRotation,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__QUASI_STEADY_ROTATION, null, msgs);
			if (newQuasiSteadyRotation != null)
				msgs = ((InternalEObject) newQuasiSteadyRotation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRIM_PARAMETERS_TYPE__QUASI_STEADY_ROTATION, null, msgs);
			msgs = basicSetQuasiSteadyRotation(newQuasiSteadyRotation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRIM_PARAMETERS_TYPE__QUASI_STEADY_ROTATION, newQuasiSteadyRotation,
					newQuasiSteadyRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRIM_PARAMETERS_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.TRIM_PARAMETERS_TYPE__REYNOLDS_NUMBER:
			return basicSetReynoldsNumber(null, msgs);
		case CpacsPackage.TRIM_PARAMETERS_TYPE__AIRSPEED:
			return basicSetAirspeed(null, msgs);
		case CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_SIDESLIP:
			return basicSetAngleOfSideslip(null, msgs);
		case CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_ATTACK:
			return basicSetAngleOfAttack(null, msgs);
		case CpacsPackage.TRIM_PARAMETERS_TYPE__LOAD_FACTOR_Z:
			return basicSetLoadFactorZ(null, msgs);
		case CpacsPackage.TRIM_PARAMETERS_TYPE__TARGET_LIFT_COEFFICIENT:
			return basicSetTargetLiftCoefficient(null, msgs);
		case CpacsPackage.TRIM_PARAMETERS_TYPE__QUASI_STEADY_ROTATION:
			return basicSetQuasiSteadyRotation(null, msgs);
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
		case CpacsPackage.TRIM_PARAMETERS_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.TRIM_PARAMETERS_TYPE__REYNOLDS_NUMBER:
			return getReynoldsNumber();
		case CpacsPackage.TRIM_PARAMETERS_TYPE__AIRSPEED:
			return getAirspeed();
		case CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_SIDESLIP:
			return getAngleOfSideslip();
		case CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_ATTACK:
			return getAngleOfAttack();
		case CpacsPackage.TRIM_PARAMETERS_TYPE__LOAD_FACTOR_Z:
			return getLoadFactorZ();
		case CpacsPackage.TRIM_PARAMETERS_TYPE__TARGET_LIFT_COEFFICIENT:
			return getTargetLiftCoefficient();
		case CpacsPackage.TRIM_PARAMETERS_TYPE__QUASI_STEADY_ROTATION:
			return getQuasiSteadyRotation();
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
		case CpacsPackage.TRIM_PARAMETERS_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__REYNOLDS_NUMBER:
			setReynoldsNumber((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__AIRSPEED:
			setAirspeed((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__LOAD_FACTOR_Z:
			setLoadFactorZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__TARGET_LIFT_COEFFICIENT:
			setTargetLiftCoefficient((DoubleBaseType) newValue);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__QUASI_STEADY_ROTATION:
			setQuasiSteadyRotation((QuasiSteadyRotationType) newValue);
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
		case CpacsPackage.TRIM_PARAMETERS_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) null);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__REYNOLDS_NUMBER:
			setReynoldsNumber((DoubleBaseType) null);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__AIRSPEED:
			setAirspeed((DoubleBaseType) null);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_SIDESLIP:
			setAngleOfSideslip((DoubleBaseType) null);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_ATTACK:
			setAngleOfAttack((DoubleBaseType) null);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__LOAD_FACTOR_Z:
			setLoadFactorZ((DoubleBaseType) null);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__TARGET_LIFT_COEFFICIENT:
			setTargetLiftCoefficient((DoubleBaseType) null);
			return;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__QUASI_STEADY_ROTATION:
			setQuasiSteadyRotation((QuasiSteadyRotationType) null);
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
		case CpacsPackage.TRIM_PARAMETERS_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__REYNOLDS_NUMBER:
			return reynoldsNumber != null;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__AIRSPEED:
			return airspeed != null;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_SIDESLIP:
			return angleOfSideslip != null;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__ANGLE_OF_ATTACK:
			return angleOfAttack != null;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__LOAD_FACTOR_Z:
			return loadFactorZ != null;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__TARGET_LIFT_COEFFICIENT:
			return targetLiftCoefficient != null;
		case CpacsPackage.TRIM_PARAMETERS_TYPE__QUASI_STEADY_ROTATION:
			return quasiSteadyRotation != null;
		}
		return super.eIsSet(featureID);
	}

} //TrimParametersTypeImpl
