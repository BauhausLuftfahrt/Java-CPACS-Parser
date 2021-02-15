/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightPathType;
import Cpacs.MissionSegmentBlockConstraintsType;
import Cpacs.MissionSegmentEndConditionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Segment Block Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockConstraintsTypeImpl#getEndCondition <em>End Condition</em>}</li>
 *   <li>{@link Cpacs.impl.MissionSegmentBlockConstraintsTypeImpl#getFlightPath <em>Flight Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionSegmentBlockConstraintsTypeImpl extends ComplexBaseTypeImpl
		implements MissionSegmentBlockConstraintsType {
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
	 * The cached value of the '{@link #getFlightPath() <em>Flight Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightPath()
	 * @generated
	 * @ordered
	 */
	protected FlightPathType flightPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionSegmentBlockConstraintsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMissionSegmentBlockConstraintsType();
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
					CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__END_CONDITION, oldEndCondition,
					newEndCondition);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__END_CONDITION,
						null, msgs);
			if (newEndCondition != null)
				msgs = ((InternalEObject) newEndCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__END_CONDITION,
						null, msgs);
			msgs = basicSetEndCondition(newEndCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__END_CONDITION, newEndCondition,
					newEndCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPathType getFlightPath() {
		return flightPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightPath(FlightPathType newFlightPath, NotificationChain msgs) {
		FlightPathType oldFlightPath = flightPath;
		flightPath = newFlightPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__FLIGHT_PATH, oldFlightPath, newFlightPath);
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
	public void setFlightPath(FlightPathType newFlightPath) {
		if (newFlightPath != flightPath) {
			NotificationChain msgs = null;
			if (flightPath != null)
				msgs = ((InternalEObject) flightPath).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__FLIGHT_PATH, null,
						msgs);
			if (newFlightPath != null)
				msgs = ((InternalEObject) newFlightPath).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__FLIGHT_PATH, null,
						msgs);
			msgs = basicSetFlightPath(newFlightPath, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__FLIGHT_PATH, newFlightPath, newFlightPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__END_CONDITION:
			return basicSetEndCondition(null, msgs);
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__FLIGHT_PATH:
			return basicSetFlightPath(null, msgs);
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__END_CONDITION:
			return getEndCondition();
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__FLIGHT_PATH:
			return getFlightPath();
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__END_CONDITION:
			setEndCondition((MissionSegmentEndConditionType) newValue);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__FLIGHT_PATH:
			setFlightPath((FlightPathType) newValue);
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__END_CONDITION:
			setEndCondition((MissionSegmentEndConditionType) null);
			return;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__FLIGHT_PATH:
			setFlightPath((FlightPathType) null);
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
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__END_CONDITION:
			return endCondition != null;
		case CpacsPackage.MISSION_SEGMENT_BLOCK_CONSTRAINTS_TYPE__FLIGHT_PATH:
			return flightPath != null;
		}
		return super.eIsSet(featureID);
	}

} //MissionSegmentBlockConstraintsTypeImpl
