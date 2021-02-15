/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FuelPlanningTypeType;
import Cpacs.MissionSegmentBlockConstraintsType;
import Cpacs.MissionSegmentBlockType;
import Cpacs.SegmentDirectionType;
import Cpacs.StringVectorBaseType;
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
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getSegmentBlockConstraints <em>Segment Block Constraints</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getSegmentDirection <em>Segment Direction</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getSegmentUIDSequence <em>Segment UID Sequence</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getVariableSegments <em>Variable Segments</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getFuelPlanningType <em>Fuel Planning Type</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionSegmentBlockTypeImpl extends ComplexBaseTypeImpl implements MissionSegmentBlockType {
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
	 * The cached value of the '{@link #getSegmentUIDSequence() <em>Segment UID Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentUIDSequence()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType segmentUIDSequence;

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
	public StringVectorBaseType getSegmentUIDSequence() {
		return segmentUIDSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegmentUIDSequence(StringVectorBaseType newSegmentUIDSequence,
			NotificationChain msgs) {
		StringVectorBaseType oldSegmentUIDSequence = segmentUIDSequence;
		segmentUIDSequence = newSegmentUIDSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UID_SEQUENCE, oldSegmentUIDSequence,
					newSegmentUIDSequence);
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
	public void setSegmentUIDSequence(StringVectorBaseType newSegmentUIDSequence) {
		if (newSegmentUIDSequence != segmentUIDSequence) {
			NotificationChain msgs = null;
			if (segmentUIDSequence != null)
				msgs = ((InternalEObject) segmentUIDSequence).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UID_SEQUENCE, null,
						msgs);
			if (newSegmentUIDSequence != null)
				msgs = ((InternalEObject) newSegmentUIDSequence).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UID_SEQUENCE, null,
						msgs);
			msgs = basicSetSegmentUIDSequence(newSegmentUIDSequence, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UID_SEQUENCE, newSegmentUIDSequence,
					newSegmentUIDSequence));
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS:
			return basicSetSegmentBlockConstraints(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION:
			return basicSetSegmentDirection(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UID_SEQUENCE:
			return basicSetSegmentUIDSequence(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS:
			return basicSetVariableSegments(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE:
			return basicSetFuelPlanningType(null, msgs);
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS:
			return getSegmentBlockConstraints();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION:
			return getSegmentDirection();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UID_SEQUENCE:
			return getSegmentUIDSequence();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS:
			return getVariableSegments();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE:
			return getFuelPlanningType();
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS:
			setSegmentBlockConstraints((MissionSegmentBlockConstraintsType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION:
			setSegmentDirection((SegmentDirectionType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UID_SEQUENCE:
			setSegmentUIDSequence((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS:
			setVariableSegments((VariableSegmentsType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE:
			setFuelPlanningType((FuelPlanningTypeType) newValue);
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS:
			setSegmentBlockConstraints((MissionSegmentBlockConstraintsType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION:
			setSegmentDirection((SegmentDirectionType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UID_SEQUENCE:
			setSegmentUIDSequence((StringVectorBaseType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS:
			setVariableSegments((VariableSegmentsType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE:
			setFuelPlanningType((FuelPlanningTypeType) null);
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_BLOCK_CONSTRAINTS:
			return segmentBlockConstraints != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_DIRECTION:
			return segmentDirection != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__SEGMENT_UID_SEQUENCE:
			return segmentUIDSequence != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__VARIABLE_SEGMENTS:
			return variableSegments != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_TYPE__FUEL_PLANNING_TYPE:
			return fuelPlanningType != null;
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
