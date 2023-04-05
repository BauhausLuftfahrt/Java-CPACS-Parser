/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FuelPlanningTypeType;
import Cpacs.IntegerBaseType;
import Cpacs.MissionSegmentBlockConstraintsType;
import Cpacs.MissionSegmentBlockType;
import Cpacs.SegmentDirectionType;
import Cpacs.StringBaseType;
import Cpacs.UIDSequenceType;
import Cpacs.VariableSegmentsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Segment Block Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getSegmentBlockConstraints <em>Segment Block Constraints</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getSegmentDirection <em>Segment Direction</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getSegmentUIDs <em>Segment UI Ds</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getVariableSegments <em>Variable Segments</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getFuelPlanningType <em>Fuel Planning Type</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getNumberOfRepetitions <em>Number Of Repetitions</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionSegmentBlockTypeImpl extends ComplexBaseTypeImpl implements MissionSegmentBlockType {
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
	 * The cached value of the '{@link #getSegmentBlockConstraints() <em>Segment Block Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentBlockConstraints()
	 * @generated
	 * @ordered
	 */
	protected MissionSegmentBlockConstraintsType segmentBlockConstraints;

	/**
	 * The cached value of the '{@link #getSegmentDirection() <em>Segment Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentDirection()
	 * @generated
	 * @ordered
	 */
	protected SegmentDirectionType segmentDirection;

	/**
	 * The cached value of the '{@link #getSegmentUIDs() <em>Segment UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentUIDs()
	 * @generated
	 * @ordered
	 */
	protected UIDSequenceType segmentUIDs;

	/**
	 * The cached value of the '{@link #getVariableSegments() <em>Variable Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSegments()
	 * @generated
	 * @ordered
	 */
	protected VariableSegmentsType variableSegments;

	/**
	 * The cached value of the '{@link #getFuelPlanningType() <em>Fuel Planning Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuelPlanningType()
	 * @generated
	 * @ordered
	 */
	protected FuelPlanningTypeType fuelPlanningType;

	/**
	 * The cached value of the '{@link #getNumberOfRepetitions() <em>Number Of Repetitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRepetitions()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType numberOfRepetitions;

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
	protected MissionSegmentBlockTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionSegmentBlockType();
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
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NAME,
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
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MissionSegmentBlockConstraintsType getSegmentBlockConstraints() {
		return segmentBlockConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentBlockConstraints(
			MissionSegmentBlockConstraintsType newSegmentBlockConstraints, NotificationChain msgs) {
		MissionSegmentBlockConstraintsType oldSegmentBlockConstraints = segmentBlockConstraints;
		segmentBlockConstraints = newSegmentBlockConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS, oldSegmentBlockConstraints,
					newSegmentBlockConstraints);
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
	public void setSegmentBlockConstraints(MissionSegmentBlockConstraintsType newSegmentBlockConstraints) {
		if (newSegmentBlockConstraints != segmentBlockConstraints) {
			NotificationChain msgs = null;
			if (segmentBlockConstraints != null)
				msgs = ((InternalEObject) segmentBlockConstraints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS,
						null, msgs);
			if (newSegmentBlockConstraints != null)
				msgs = ((InternalEObject) newSegmentBlockConstraints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS,
						null, msgs);
			msgs = basicSetSegmentBlockConstraints(newSegmentBlockConstraints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS, newSegmentBlockConstraints,
					newSegmentBlockConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SegmentDirectionType getSegmentDirection() {
		return segmentDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentDirection(SegmentDirectionType newSegmentDirection,
			NotificationChain msgs) {
		SegmentDirectionType oldSegmentDirection = segmentDirection;
		segmentDirection = newSegmentDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION, oldSegmentDirection,
					newSegmentDirection);
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
	public void setSegmentDirection(SegmentDirectionType newSegmentDirection) {
		if (newSegmentDirection != segmentDirection) {
			NotificationChain msgs = null;
			if (segmentDirection != null)
				msgs = ((InternalEObject) segmentDirection).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION, null,
						msgs);
			if (newSegmentDirection != null)
				msgs = ((InternalEObject) newSegmentDirection).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION, null,
						msgs);
			msgs = basicSetSegmentDirection(newSegmentDirection, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION, newSegmentDirection,
					newSegmentDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIDSequenceType getSegmentUIDs() {
		return segmentUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentUIDs(UIDSequenceType newSegmentUIDs, NotificationChain msgs) {
		UIDSequenceType oldSegmentUIDs = segmentUIDs;
		segmentUIDs = newSegmentUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UI_DS, oldSegmentUIDs, newSegmentUIDs);
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
	public void setSegmentUIDs(UIDSequenceType newSegmentUIDs) {
		if (newSegmentUIDs != segmentUIDs) {
			NotificationChain msgs = null;
			if (segmentUIDs != null)
				msgs = ((InternalEObject) segmentUIDs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UI_DS, null, msgs);
			if (newSegmentUIDs != null)
				msgs = ((InternalEObject) newSegmentUIDs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UI_DS, null, msgs);
			msgs = basicSetSegmentUIDs(newSegmentUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UI_DS, newSegmentUIDs, newSegmentUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableSegmentsType getVariableSegments() {
		return variableSegments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableSegments(VariableSegmentsType newVariableSegments,
			NotificationChain msgs) {
		VariableSegmentsType oldVariableSegments = variableSegments;
		variableSegments = newVariableSegments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS, oldVariableSegments,
					newVariableSegments);
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
	public void setVariableSegments(VariableSegmentsType newVariableSegments) {
		if (newVariableSegments != variableSegments) {
			NotificationChain msgs = null;
			if (variableSegments != null)
				msgs = ((InternalEObject) variableSegments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS, null,
						msgs);
			if (newVariableSegments != null)
				msgs = ((InternalEObject) newVariableSegments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS, null,
						msgs);
			msgs = basicSetVariableSegments(newVariableSegments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS, newVariableSegments,
					newVariableSegments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelPlanningTypeType getFuelPlanningType() {
		return fuelPlanningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuelPlanningType(FuelPlanningTypeType newFuelPlanningType,
			NotificationChain msgs) {
		FuelPlanningTypeType oldFuelPlanningType = fuelPlanningType;
		fuelPlanningType = newFuelPlanningType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE, oldFuelPlanningType,
					newFuelPlanningType);
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
	public void setFuelPlanningType(FuelPlanningTypeType newFuelPlanningType) {
		if (newFuelPlanningType != fuelPlanningType) {
			NotificationChain msgs = null;
			if (fuelPlanningType != null)
				msgs = ((InternalEObject) fuelPlanningType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE, null,
						msgs);
			if (newFuelPlanningType != null)
				msgs = ((InternalEObject) newFuelPlanningType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE, null,
						msgs);
			msgs = basicSetFuelPlanningType(newFuelPlanningType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE, newFuelPlanningType,
					newFuelPlanningType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getNumberOfRepetitions() {
		return numberOfRepetitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfRepetitions(IntegerBaseType newNumberOfRepetitions,
			NotificationChain msgs) {
		IntegerBaseType oldNumberOfRepetitions = numberOfRepetitions;
		numberOfRepetitions = newNumberOfRepetitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NUMBER_OF_REPETITIONS, oldNumberOfRepetitions,
					newNumberOfRepetitions);
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
	public void setNumberOfRepetitions(IntegerBaseType newNumberOfRepetitions) {
		if (newNumberOfRepetitions != numberOfRepetitions) {
			NotificationChain msgs = null;
			if (numberOfRepetitions != null)
				msgs = ((InternalEObject) numberOfRepetitions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NUMBER_OF_REPETITIONS, null,
						msgs);
			if (newNumberOfRepetitions != null)
				msgs = ((InternalEObject) newNumberOfRepetitions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NUMBER_OF_REPETITIONS, null,
						msgs);
			msgs = basicSetNumberOfRepetitions(newNumberOfRepetitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NUMBER_OF_REPETITIONS, newNumberOfRepetitions,
					newNumberOfRepetitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS:
			return basicSetSegmentBlockConstraints(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION:
			return basicSetSegmentDirection(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UI_DS:
			return basicSetSegmentUIDs(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS:
			return basicSetVariableSegments(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE:
			return basicSetFuelPlanningType(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NUMBER_OF_REPETITIONS:
			return basicSetNumberOfRepetitions(null, msgs);
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NAME:
			return getName();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS:
			return getSegmentBlockConstraints();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION:
			return getSegmentDirection();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UI_DS:
			return getSegmentUIDs();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS:
			return getVariableSegments();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE:
			return getFuelPlanningType();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NUMBER_OF_REPETITIONS:
			return getNumberOfRepetitions();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__UID:
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS:
			setSegmentBlockConstraints((MissionSegmentBlockConstraintsType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION:
			setSegmentDirection((SegmentDirectionType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UI_DS:
			setSegmentUIDs((UIDSequenceType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS:
			setVariableSegments((VariableSegmentsType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE:
			setFuelPlanningType((FuelPlanningTypeType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NUMBER_OF_REPETITIONS:
			setNumberOfRepetitions((IntegerBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__UID:
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS:
			setSegmentBlockConstraints((MissionSegmentBlockConstraintsType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION:
			setSegmentDirection((SegmentDirectionType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UI_DS:
			setSegmentUIDs((UIDSequenceType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS:
			setVariableSegments((VariableSegmentsType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE:
			setFuelPlanningType((FuelPlanningTypeType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NUMBER_OF_REPETITIONS:
			setNumberOfRepetitions((IntegerBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__UID:
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NAME:
			return name != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS:
			return segmentBlockConstraints != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION:
			return segmentDirection != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UI_DS:
			return segmentUIDs != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS:
			return variableSegments != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE:
			return fuelPlanningType != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__NUMBER_OF_REPETITIONS:
			return numberOfRepetitions != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__UID:
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

} //MissionSegmentBlockTypeImpl
