/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EnvironmentType;
import Cpacs.PointPerformanceConstraintsType;
import Cpacs.PointPerformanceDefinitionType;
import Cpacs.PointPerformanceRequirementsType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.TypeOfPointPerformanceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Performance Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PointPerformanceDefinitionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceDefinitionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceDefinitionTypeImpl#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceDefinitionTypeImpl#getMassFraction <em>Mass Fraction</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceDefinitionTypeImpl#getFuelFraction <em>Fuel Fraction</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceDefinitionTypeImpl#getTypeOfPointPerformance <em>Type Of Point Performance</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceDefinitionTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceDefinitionTypeImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceDefinitionTypeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link Cpacs.impl.PointPerformanceDefinitionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointPerformanceDefinitionTypeImpl extends ComplexBaseTypeImpl implements PointPerformanceDefinitionType {
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
	 * The cached value of the '{@link #getSegmentUID() <em>Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType segmentUID;

	/**
	 * The cached value of the '{@link #getMassFraction() <em>Mass Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassFraction()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType massFraction;

	/**
	 * The cached value of the '{@link #getFuelFraction() <em>Fuel Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelFraction()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType fuelFraction;

	/**
	 * The cached value of the '{@link #getTypeOfPointPerformance() <em>Type Of Point Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeOfPointPerformance()
	 * @generated
	 * @ordered
	 */
	protected TypeOfPointPerformanceType typeOfPointPerformance;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected PointPerformanceConstraintsType constraints;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected PointPerformanceRequirementsType requirements;

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
	protected PointPerformanceDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPointPerformanceDefinitionType();
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
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__NAME,
					newName, newName));
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
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__DESCRIPTION, null,
						msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__DESCRIPTION, null,
						msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getSegmentUID() {
		return segmentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentUID(StringUIDBaseType newSegmentUID, NotificationChain msgs) {
		StringUIDBaseType oldSegmentUID = segmentUID;
		segmentUID = newSegmentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__SEGMENT_UID, oldSegmentUID, newSegmentUID);
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
	public void setSegmentUID(StringUIDBaseType newSegmentUID) {
		if (newSegmentUID != segmentUID) {
			NotificationChain msgs = null;
			if (segmentUID != null)
				msgs = ((InternalEObject) segmentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__SEGMENT_UID, null,
						msgs);
			if (newSegmentUID != null)
				msgs = ((InternalEObject) newSegmentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__SEGMENT_UID, null,
						msgs);
			msgs = basicSetSegmentUID(newSegmentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__SEGMENT_UID, newSegmentUID, newSegmentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMassFraction() {
		return massFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassFraction(DoubleBaseType newMassFraction, NotificationChain msgs) {
		DoubleBaseType oldMassFraction = massFraction;
		massFraction = newMassFraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__MASS_FRACTION, oldMassFraction, newMassFraction);
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
	public void setMassFraction(DoubleBaseType newMassFraction) {
		if (newMassFraction != massFraction) {
			NotificationChain msgs = null;
			if (massFraction != null)
				msgs = ((InternalEObject) massFraction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__MASS_FRACTION, null,
						msgs);
			if (newMassFraction != null)
				msgs = ((InternalEObject) newMassFraction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__MASS_FRACTION, null,
						msgs);
			msgs = basicSetMassFraction(newMassFraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__MASS_FRACTION, newMassFraction, newMassFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getFuelFraction() {
		return fuelFraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelFraction(DoubleBaseType newFuelFraction, NotificationChain msgs) {
		DoubleBaseType oldFuelFraction = fuelFraction;
		fuelFraction = newFuelFraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__FUEL_FRACTION, oldFuelFraction, newFuelFraction);
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
	public void setFuelFraction(DoubleBaseType newFuelFraction) {
		if (newFuelFraction != fuelFraction) {
			NotificationChain msgs = null;
			if (fuelFraction != null)
				msgs = ((InternalEObject) fuelFraction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__FUEL_FRACTION, null,
						msgs);
			if (newFuelFraction != null)
				msgs = ((InternalEObject) newFuelFraction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__FUEL_FRACTION, null,
						msgs);
			msgs = basicSetFuelFraction(newFuelFraction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__FUEL_FRACTION, newFuelFraction, newFuelFraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeOfPointPerformanceType getTypeOfPointPerformance() {
		return typeOfPointPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeOfPointPerformance(TypeOfPointPerformanceType newTypeOfPointPerformance,
			NotificationChain msgs) {
		TypeOfPointPerformanceType oldTypeOfPointPerformance = typeOfPointPerformance;
		typeOfPointPerformance = newTypeOfPointPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__TYPE_OF_POINT_PERFORMANCE,
					oldTypeOfPointPerformance, newTypeOfPointPerformance);
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
	public void setTypeOfPointPerformance(TypeOfPointPerformanceType newTypeOfPointPerformance) {
		if (newTypeOfPointPerformance != typeOfPointPerformance) {
			NotificationChain msgs = null;
			if (typeOfPointPerformance != null)
				msgs = ((InternalEObject) typeOfPointPerformance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__TYPE_OF_POINT_PERFORMANCE,
						null, msgs);
			if (newTypeOfPointPerformance != null)
				msgs = ((InternalEObject) newTypeOfPointPerformance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__TYPE_OF_POINT_PERFORMANCE,
						null, msgs);
			msgs = basicSetTypeOfPointPerformance(newTypeOfPointPerformance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__TYPE_OF_POINT_PERFORMANCE,
					newTypeOfPointPerformance, newTypeOfPointPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointPerformanceConstraintsType getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(PointPerformanceConstraintsType newConstraints,
			NotificationChain msgs) {
		PointPerformanceConstraintsType oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__CONSTRAINTS, oldConstraints, newConstraints);
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
	public void setConstraints(PointPerformanceConstraintsType newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject) constraints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__CONSTRAINTS, null,
						msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject) newConstraints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__CONSTRAINTS, null,
						msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointPerformanceRequirementsType getRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(PointPerformanceRequirementsType newRequirements,
			NotificationChain msgs) {
		PointPerformanceRequirementsType oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__REQUIREMENTS, oldRequirements, newRequirements);
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
	public void setRequirements(PointPerformanceRequirementsType newRequirements) {
		if (newRequirements != requirements) {
			NotificationChain msgs = null;
			if (requirements != null)
				msgs = ((InternalEObject) requirements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__REQUIREMENTS, null,
						msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject) newRequirements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__REQUIREMENTS, null,
						msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__REQUIREMENTS, newRequirements, newRequirements));
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
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__ENVIRONMENT, oldEnvironment, newEnvironment);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__ENVIRONMENT, null,
						msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject) newEnvironment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__ENVIRONMENT, null,
						msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__ENVIRONMENT, newEnvironment, newEnvironment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__SEGMENT_UID:
			return basicSetSegmentUID(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__MASS_FRACTION:
			return basicSetMassFraction(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__FUEL_FRACTION:
			return basicSetFuelFraction(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__TYPE_OF_POINT_PERFORMANCE:
			return basicSetTypeOfPointPerformance(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__CONSTRAINTS:
			return basicSetConstraints(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__REQUIREMENTS:
			return basicSetRequirements(null, msgs);
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__ENVIRONMENT:
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
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__NAME:
			return getName();
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__SEGMENT_UID:
			return getSegmentUID();
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__MASS_FRACTION:
			return getMassFraction();
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__FUEL_FRACTION:
			return getFuelFraction();
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__TYPE_OF_POINT_PERFORMANCE:
			return getTypeOfPointPerformance();
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__CONSTRAINTS:
			return getConstraints();
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__REQUIREMENTS:
			return getRequirements();
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__ENVIRONMENT:
			return getEnvironment();
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__UID:
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
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__SEGMENT_UID:
			setSegmentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__MASS_FRACTION:
			setMassFraction((DoubleBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__FUEL_FRACTION:
			setFuelFraction((DoubleBaseType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__TYPE_OF_POINT_PERFORMANCE:
			setTypeOfPointPerformance((TypeOfPointPerformanceType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__CONSTRAINTS:
			setConstraints((PointPerformanceConstraintsType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__REQUIREMENTS:
			setRequirements((PointPerformanceRequirementsType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__ENVIRONMENT:
			setEnvironment((EnvironmentType) newValue);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__UID:
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
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__SEGMENT_UID:
			setSegmentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__MASS_FRACTION:
			setMassFraction((DoubleBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__FUEL_FRACTION:
			setFuelFraction((DoubleBaseType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__TYPE_OF_POINT_PERFORMANCE:
			setTypeOfPointPerformance((TypeOfPointPerformanceType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__CONSTRAINTS:
			setConstraints((PointPerformanceConstraintsType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__REQUIREMENTS:
			setRequirements((PointPerformanceRequirementsType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__ENVIRONMENT:
			setEnvironment((EnvironmentType) null);
			return;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__UID:
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
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__NAME:
			return name != null;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__SEGMENT_UID:
			return segmentUID != null;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__MASS_FRACTION:
			return massFraction != null;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__FUEL_FRACTION:
			return fuelFraction != null;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__TYPE_OF_POINT_PERFORMANCE:
			return typeOfPointPerformance != null;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__CONSTRAINTS:
			return constraints != null;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__REQUIREMENTS:
			return requirements != null;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__ENVIRONMENT:
			return environment != null;
		case CpacsPackage.POINT_PERFORMANCE_DEFINITION_TYPE__UID:
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

} //PointPerformanceDefinitionTypeImpl
