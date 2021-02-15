/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightPointType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.TrajectoryGlobalType;
import Cpacs.TrajectoryType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectory Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrajectoryTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryTypeImpl#getMissionUID <em>Mission UID</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryTypeImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryTypeImpl#getFlightPoints <em>Flight Points</em>}</li>
 *   <li>{@link Cpacs.impl.TrajectoryTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrajectoryTypeImpl extends ComplexBaseTypeImpl implements TrajectoryType {
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
	 * The cached value of the '{@link #getMissionUID() <em>Mission UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType missionUID;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected TrajectoryGlobalType global;

	/**
	 * The cached value of the '{@link #getFlightPoints() <em>Flight Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightPoints()
	 * @generated
	 * @ordered
	 */
	protected FlightPointType flightPoints;

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
	protected TrajectoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrajectoryType();
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
					CpacsPackage.TRAJECTORY_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_TYPE__NAME, newName,
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
					CpacsPackage.TRAJECTORY_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getMissionUID() {
		return missionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMissionUID(StringUIDBaseType newMissionUID, NotificationChain msgs) {
		StringUIDBaseType oldMissionUID = missionUID;
		missionUID = newMissionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_TYPE__MISSION_UID, oldMissionUID, newMissionUID);
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
	public void setMissionUID(StringUIDBaseType newMissionUID) {
		if (newMissionUID != missionUID) {
			NotificationChain msgs = null;
			if (missionUID != null)
				msgs = ((InternalEObject) missionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_TYPE__MISSION_UID, null, msgs);
			if (newMissionUID != null)
				msgs = ((InternalEObject) newMissionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_TYPE__MISSION_UID, null, msgs);
			msgs = basicSetMissionUID(newMissionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_TYPE__MISSION_UID,
					newMissionUID, newMissionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrajectoryGlobalType getGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobal(TrajectoryGlobalType newGlobal, NotificationChain msgs) {
		TrajectoryGlobalType oldGlobal = global;
		global = newGlobal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_TYPE__GLOBAL, oldGlobal, newGlobal);
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
	public void setGlobal(TrajectoryGlobalType newGlobal) {
		if (newGlobal != global) {
			NotificationChain msgs = null;
			if (global != null)
				msgs = ((InternalEObject) global).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_TYPE__GLOBAL, null, msgs);
			if (newGlobal != null)
				msgs = ((InternalEObject) newGlobal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_TYPE__GLOBAL, null, msgs);
			msgs = basicSetGlobal(newGlobal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_TYPE__GLOBAL, newGlobal,
					newGlobal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPointType getFlightPoints() {
		return flightPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightPoints(FlightPointType newFlightPoints, NotificationChain msgs) {
		FlightPointType oldFlightPoints = flightPoints;
		flightPoints = newFlightPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.TRAJECTORY_TYPE__FLIGHT_POINTS, oldFlightPoints, newFlightPoints);
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
	public void setFlightPoints(FlightPointType newFlightPoints) {
		if (newFlightPoints != flightPoints) {
			NotificationChain msgs = null;
			if (flightPoints != null)
				msgs = ((InternalEObject) flightPoints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_TYPE__FLIGHT_POINTS, null, msgs);
			if (newFlightPoints != null)
				msgs = ((InternalEObject) newFlightPoints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.TRAJECTORY_TYPE__FLIGHT_POINTS, null, msgs);
			msgs = basicSetFlightPoints(newFlightPoints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_TYPE__FLIGHT_POINTS,
					newFlightPoints, newFlightPoints));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.TRAJECTORY_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRAJECTORY_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.TRAJECTORY_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.TRAJECTORY_TYPE__MISSION_UID:
			return basicSetMissionUID(null, msgs);
		case CpacsPackage.TRAJECTORY_TYPE__GLOBAL:
			return basicSetGlobal(null, msgs);
		case CpacsPackage.TRAJECTORY_TYPE__FLIGHT_POINTS:
			return basicSetFlightPoints(null, msgs);
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
		case CpacsPackage.TRAJECTORY_TYPE__NAME:
			return getName();
		case CpacsPackage.TRAJECTORY_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.TRAJECTORY_TYPE__MISSION_UID:
			return getMissionUID();
		case CpacsPackage.TRAJECTORY_TYPE__GLOBAL:
			return getGlobal();
		case CpacsPackage.TRAJECTORY_TYPE__FLIGHT_POINTS:
			return getFlightPoints();
		case CpacsPackage.TRAJECTORY_TYPE__UID:
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
		case CpacsPackage.TRAJECTORY_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_TYPE__MISSION_UID:
			setMissionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_TYPE__GLOBAL:
			setGlobal((TrajectoryGlobalType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_TYPE__FLIGHT_POINTS:
			setFlightPoints((FlightPointType) newValue);
			return;
		case CpacsPackage.TRAJECTORY_TYPE__UID:
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
		case CpacsPackage.TRAJECTORY_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_TYPE__MISSION_UID:
			setMissionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.TRAJECTORY_TYPE__GLOBAL:
			setGlobal((TrajectoryGlobalType) null);
			return;
		case CpacsPackage.TRAJECTORY_TYPE__FLIGHT_POINTS:
			setFlightPoints((FlightPointType) null);
			return;
		case CpacsPackage.TRAJECTORY_TYPE__UID:
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
		case CpacsPackage.TRAJECTORY_TYPE__NAME:
			return name != null;
		case CpacsPackage.TRAJECTORY_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.TRAJECTORY_TYPE__MISSION_UID:
			return missionUID != null;
		case CpacsPackage.TRAJECTORY_TYPE__GLOBAL:
			return global != null;
		case CpacsPackage.TRAJECTORY_TYPE__FLIGHT_POINTS:
			return flightPoints != null;
		case CpacsPackage.TRAJECTORY_TYPE__UID:
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

} //TrajectoryTypeImpl
