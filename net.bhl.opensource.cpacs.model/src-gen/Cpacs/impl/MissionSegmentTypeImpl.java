/**
 */
package Cpacs.impl;

import Cpacs.BooleanBaseType;
import Cpacs.ConstraintsType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EnvironmentType;
import Cpacs.FuelMassFractionType;
import Cpacs.MissionSegmentEndConditionType;
import Cpacs.MissionSegmentType;
import Cpacs.SegmentTypeType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Segment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getSegmentType <em>Segment Type</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getCreditDistance <em>Credit Distance</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getFuelMass <em>Fuel Mass</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getFuelMassFraction <em>Fuel Mass Fraction</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getEndCondition <em>End Condition</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionSegmentTypeImpl extends ComplexBaseTypeImpl implements MissionSegmentType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

	/**
	 * The cached value of the '{@link #getSegmentType() <em>Segment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentType()
	 * @generated
	 * @ordered
	 */
	protected SegmentTypeType segmentType;

	/**
	 * The cached value of the '{@link #getCreditDistance() <em>Credit Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditDistance()
	 * @generated
	 * @ordered
	 */
	protected BooleanBaseType creditDistance;

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
	 * The cached value of the '{@link #getFuelMass() <em>Fuel Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelMass()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType fuelMass;

	/**
	 * The cached value of the '{@link #getFuelMassFraction() <em>Fuel Mass Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelMassFraction()
	 * @generated
	 * @ordered
	 */
	protected FuelMassFractionType fuelMassFraction;

	/**
	 * The cached value of the '{@link #getEndCondition() <em>End Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndCondition()
	 * @generated
	 * @ordered
	 */
	protected MissionSegmentEndConditionType endCondition;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected ConstraintsType constraints;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionSegmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionSegmentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__NAME, newName,
					newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentTypeType getSegmentType() {
		return segmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentType(SegmentTypeType newSegmentType, NotificationChain msgs) {
		SegmentTypeType oldSegmentType = segmentType;
		segmentType = newSegmentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE, oldSegmentType, newSegmentType);
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
	public void setSegmentType(SegmentTypeType newSegmentType) {
		if (newSegmentType != segmentType) {
			NotificationChain msgs = null;
			if (segmentType != null)
				msgs = ((InternalEObject) segmentType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE, null, msgs);
			if (newSegmentType != null)
				msgs = ((InternalEObject) newSegmentType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE, null, msgs);
			msgs = basicSetSegmentType(newSegmentType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE,
					newSegmentType, newSegmentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanBaseType getCreditDistance() {
		return creditDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreditDistance(BooleanBaseType newCreditDistance, NotificationChain msgs) {
		BooleanBaseType oldCreditDistance = creditDistance;
		creditDistance = newCreditDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__CREDIT_DISTANCE, oldCreditDistance, newCreditDistance);
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
	public void setCreditDistance(BooleanBaseType newCreditDistance) {
		if (newCreditDistance != creditDistance) {
			NotificationChain msgs = null;
			if (creditDistance != null)
				msgs = ((InternalEObject) creditDistance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__CREDIT_DISTANCE, null, msgs);
			if (newCreditDistance != null)
				msgs = ((InternalEObject) newCreditDistance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__CREDIT_DISTANCE, null, msgs);
			msgs = basicSetCreditDistance(newCreditDistance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__CREDIT_DISTANCE,
					newCreditDistance, newCreditDistance));
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
					CpacsPackage.MISSION_SEGMENT_TYPE__ENVIRONMENT, oldEnvironment, newEnvironment);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject) newEnvironment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__ENVIRONMENT,
					newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFuelMass() {
		return fuelMass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelMass(DoubleBaseType newFuelMass, NotificationChain msgs) {
		DoubleBaseType oldFuelMass = fuelMass;
		fuelMass = newFuelMass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS, oldFuelMass, newFuelMass);
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
	public void setFuelMass(DoubleBaseType newFuelMass) {
		if (newFuelMass != fuelMass) {
			NotificationChain msgs = null;
			if (fuelMass != null)
				msgs = ((InternalEObject) fuelMass).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS, null, msgs);
			if (newFuelMass != null)
				msgs = ((InternalEObject) newFuelMass).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS, null, msgs);
			msgs = basicSetFuelMass(newFuelMass, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS,
					newFuelMass, newFuelMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelMassFractionType getFuelMassFraction() {
		return fuelMassFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelMassFraction(FuelMassFractionType newFuelMassFraction,
			NotificationChain msgs) {
		FuelMassFractionType oldFuelMassFraction = fuelMassFraction;
		fuelMassFraction = newFuelMassFraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS_FRACTION, oldFuelMassFraction, newFuelMassFraction);
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
	public void setFuelMassFraction(FuelMassFractionType newFuelMassFraction) {
		if (newFuelMassFraction != fuelMassFraction) {
			NotificationChain msgs = null;
			if (fuelMassFraction != null)
				msgs = ((InternalEObject) fuelMassFraction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS_FRACTION, null, msgs);
			if (newFuelMassFraction != null)
				msgs = ((InternalEObject) newFuelMassFraction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS_FRACTION, null, msgs);
			msgs = basicSetFuelMassFraction(newFuelMassFraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS_FRACTION,
					newFuelMassFraction, newFuelMassFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionSegmentEndConditionType getEndCondition() {
		return endCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndCondition(MissionSegmentEndConditionType newEndCondition,
			NotificationChain msgs) {
		MissionSegmentEndConditionType oldEndCondition = endCondition;
		endCondition = newEndCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION, oldEndCondition, newEndCondition);
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
	public void setEndCondition(MissionSegmentEndConditionType newEndCondition) {
		if (newEndCondition != endCondition) {
			NotificationChain msgs = null;
			if (endCondition != null)
				msgs = ((InternalEObject) endCondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION, null, msgs);
			if (newEndCondition != null)
				msgs = ((InternalEObject) newEndCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION, null, msgs);
			msgs = basicSetEndCondition(newEndCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION,
					newEndCondition, newEndCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintsType getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(ConstraintsType newConstraints, NotificationChain msgs) {
		ConstraintsType oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINTS, oldConstraints, newConstraints);
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
	public void setConstraints(ConstraintsType newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject) constraints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject) newConstraints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINTS,
					newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_SEGMENT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE:
			return basicSetSegmentType(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__CREDIT_DISTANCE:
			return basicSetCreditDistance(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__ENVIRONMENT:
			return basicSetEnvironment(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS:
			return basicSetFuelMass(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS_FRACTION:
			return basicSetFuelMassFraction(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION:
			return basicSetEndCondition(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINTS:
			return basicSetConstraints(null, msgs);
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
		case CpacsPackage.MISSION_SEGMENT_TYPE__NAME:
			return getName();
		case CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE:
			return getSegmentType();
		case CpacsPackage.MISSION_SEGMENT_TYPE__CREDIT_DISTANCE:
			return getCreditDistance();
		case CpacsPackage.MISSION_SEGMENT_TYPE__ENVIRONMENT:
			return getEnvironment();
		case CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS:
			return getFuelMass();
		case CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS_FRACTION:
			return getFuelMassFraction();
		case CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION:
			return getEndCondition();
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINTS:
			return getConstraints();
		case CpacsPackage.MISSION_SEGMENT_TYPE__UID:
			return getUID();
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
		case CpacsPackage.MISSION_SEGMENT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE:
			setSegmentType((SegmentTypeType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__CREDIT_DISTANCE:
			setCreditDistance((BooleanBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__ENVIRONMENT:
			setEnvironment((EnvironmentType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS:
			setFuelMass((DoubleBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS_FRACTION:
			setFuelMassFraction((FuelMassFractionType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION:
			setEndCondition((MissionSegmentEndConditionType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINTS:
			setConstraints((ConstraintsType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.MISSION_SEGMENT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE:
			setSegmentType((SegmentTypeType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__CREDIT_DISTANCE:
			setCreditDistance((BooleanBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__ENVIRONMENT:
			setEnvironment((EnvironmentType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS:
			setFuelMass((DoubleBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS_FRACTION:
			setFuelMassFraction((FuelMassFractionType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION:
			setEndCondition((MissionSegmentEndConditionType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINTS:
			setConstraints((ConstraintsType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.MISSION_SEGMENT_TYPE__NAME:
			return name != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__SEGMENT_TYPE:
			return segmentType != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__CREDIT_DISTANCE:
			return creditDistance != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__ENVIRONMENT:
			return environment != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS:
			return fuelMass != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__FUEL_MASS_FRACTION:
			return fuelMassFraction != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__END_CONDITION:
			return endCondition != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__CONSTRAINTS:
			return constraints != null;
		case CpacsPackage.MISSION_SEGMENT_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //MissionSegmentTypeImpl
