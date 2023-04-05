/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightPerformanceCaseType;
import Cpacs.FlightPerformanceLandingType;
import Cpacs.FlightPerformanceLevelType;
import Cpacs.FlightPerformanceTakeoffType;
import Cpacs.FlightPerformanceTurnType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Performance Case Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightPerformanceCaseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceCaseTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceCaseTypeImpl#getFlightPerformanceReqUID <em>Flight Performance Req UID</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceCaseTypeImpl#getTakeoff <em>Takeoff</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceCaseTypeImpl#getLanding <em>Landing</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceCaseTypeImpl#getTurn <em>Turn</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceCaseTypeImpl#getLevelFlight <em>Level Flight</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceCaseTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPerformanceCaseTypeImpl extends ComplexBaseTypeImpl implements FlightPerformanceCaseType {
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
	 * The cached value of the '{@link #getFlightPerformanceReqUID() <em>Flight Performance Req UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightPerformanceReqUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType flightPerformanceReqUID;

	/**
	 * The cached value of the '{@link #getTakeoff() <em>Takeoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakeoff()
	 * @generated
	 * @ordered
	 */
	protected FlightPerformanceTakeoffType takeoff;

	/**
	 * The cached value of the '{@link #getLanding() <em>Landing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanding()
	 * @generated
	 * @ordered
	 */
	protected FlightPerformanceLandingType landing;

	/**
	 * The cached value of the '{@link #getTurn() <em>Turn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurn()
	 * @generated
	 * @ordered
	 */
	protected FlightPerformanceTurnType turn;

	/**
	 * The cached value of the '{@link #getLevelFlight() <em>Level Flight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelFlight()
	 * @generated
	 * @ordered
	 */
	protected FlightPerformanceLevelType levelFlight;

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
	protected FlightPerformanceCaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightPerformanceCaseType();
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
					CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__NAME,
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
					CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFlightPerformanceReqUID() {
		return flightPerformanceReqUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlightPerformanceReqUID(StringUIDBaseType newFlightPerformanceReqUID,
			NotificationChain msgs) {
		StringUIDBaseType oldFlightPerformanceReqUID = flightPerformanceReqUID;
		flightPerformanceReqUID = newFlightPerformanceReqUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__FLIGHT_PERFORMANCE_REQ_UID, oldFlightPerformanceReqUID,
					newFlightPerformanceReqUID);
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
	public void setFlightPerformanceReqUID(StringUIDBaseType newFlightPerformanceReqUID) {
		if (newFlightPerformanceReqUID != flightPerformanceReqUID) {
			NotificationChain msgs = null;
			if (flightPerformanceReqUID != null)
				msgs = ((InternalEObject) flightPerformanceReqUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__FLIGHT_PERFORMANCE_REQ_UID,
						null, msgs);
			if (newFlightPerformanceReqUID != null)
				msgs = ((InternalEObject) newFlightPerformanceReqUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__FLIGHT_PERFORMANCE_REQ_UID,
						null, msgs);
			msgs = basicSetFlightPerformanceReqUID(newFlightPerformanceReqUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__FLIGHT_PERFORMANCE_REQ_UID, newFlightPerformanceReqUID,
					newFlightPerformanceReqUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPerformanceTakeoffType getTakeoff() {
		return takeoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTakeoff(FlightPerformanceTakeoffType newTakeoff, NotificationChain msgs) {
		FlightPerformanceTakeoffType oldTakeoff = takeoff;
		takeoff = newTakeoff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF, oldTakeoff, newTakeoff);
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
	public void setTakeoff(FlightPerformanceTakeoffType newTakeoff) {
		if (newTakeoff != takeoff) {
			NotificationChain msgs = null;
			if (takeoff != null)
				msgs = ((InternalEObject) takeoff).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF, null, msgs);
			if (newTakeoff != null)
				msgs = ((InternalEObject) newTakeoff).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF, null, msgs);
			msgs = basicSetTakeoff(newTakeoff, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF,
					newTakeoff, newTakeoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPerformanceLandingType getLanding() {
		return landing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanding(FlightPerformanceLandingType newLanding, NotificationChain msgs) {
		FlightPerformanceLandingType oldLanding = landing;
		landing = newLanding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING, oldLanding, newLanding);
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
	public void setLanding(FlightPerformanceLandingType newLanding) {
		if (newLanding != landing) {
			NotificationChain msgs = null;
			if (landing != null)
				msgs = ((InternalEObject) landing).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING, null, msgs);
			if (newLanding != null)
				msgs = ((InternalEObject) newLanding).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING, null, msgs);
			msgs = basicSetLanding(newLanding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING,
					newLanding, newLanding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPerformanceTurnType getTurn() {
		return turn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurn(FlightPerformanceTurnType newTurn, NotificationChain msgs) {
		FlightPerformanceTurnType oldTurn = turn;
		turn = newTurn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TURN, oldTurn, newTurn);
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
	public void setTurn(FlightPerformanceTurnType newTurn) {
		if (newTurn != turn) {
			NotificationChain msgs = null;
			if (turn != null)
				msgs = ((InternalEObject) turn).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TURN, null, msgs);
			if (newTurn != null)
				msgs = ((InternalEObject) newTurn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TURN, null, msgs);
			msgs = basicSetTurn(newTurn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TURN,
					newTurn, newTurn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightPerformanceLevelType getLevelFlight() {
		return levelFlight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevelFlight(FlightPerformanceLevelType newLevelFlight, NotificationChain msgs) {
		FlightPerformanceLevelType oldLevelFlight = levelFlight;
		levelFlight = newLevelFlight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LEVEL_FLIGHT, oldLevelFlight, newLevelFlight);
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
	public void setLevelFlight(FlightPerformanceLevelType newLevelFlight) {
		if (newLevelFlight != levelFlight) {
			NotificationChain msgs = null;
			if (levelFlight != null)
				msgs = ((InternalEObject) levelFlight).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LEVEL_FLIGHT, null, msgs);
			if (newLevelFlight != null)
				msgs = ((InternalEObject) newLevelFlight).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LEVEL_FLIGHT, null, msgs);
			msgs = basicSetLevelFlight(newLevelFlight, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LEVEL_FLIGHT, newLevelFlight, newLevelFlight));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__UID,
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__FLIGHT_PERFORMANCE_REQ_UID:
			return basicSetFlightPerformanceReqUID(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF:
			return basicSetTakeoff(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING:
			return basicSetLanding(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TURN:
			return basicSetTurn(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LEVEL_FLIGHT:
			return basicSetLevelFlight(null, msgs);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__NAME:
			return getName();
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__FLIGHT_PERFORMANCE_REQ_UID:
			return getFlightPerformanceReqUID();
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF:
			return getTakeoff();
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING:
			return getLanding();
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TURN:
			return getTurn();
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LEVEL_FLIGHT:
			return getLevelFlight();
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__UID:
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__FLIGHT_PERFORMANCE_REQ_UID:
			setFlightPerformanceReqUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF:
			setTakeoff((FlightPerformanceTakeoffType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING:
			setLanding((FlightPerformanceLandingType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TURN:
			setTurn((FlightPerformanceTurnType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LEVEL_FLIGHT:
			setLevelFlight((FlightPerformanceLevelType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__UID:
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__FLIGHT_PERFORMANCE_REQ_UID:
			setFlightPerformanceReqUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF:
			setTakeoff((FlightPerformanceTakeoffType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING:
			setLanding((FlightPerformanceLandingType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TURN:
			setTurn((FlightPerformanceTurnType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LEVEL_FLIGHT:
			setLevelFlight((FlightPerformanceLevelType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__UID:
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__NAME:
			return name != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__FLIGHT_PERFORMANCE_REQ_UID:
			return flightPerformanceReqUID != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF:
			return takeoff != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING:
			return landing != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TURN:
			return turn != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LEVEL_FLIGHT:
			return levelFlight != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__UID:
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

} //FlightPerformanceCaseTypeImpl
