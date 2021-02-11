/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DateBaseType;
import Cpacs.FlightAnalysisType;
import Cpacs.FlightType;
import Cpacs.StringUIDBaseType;
import Cpacs.TimeBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightTypeImpl#getMissionUID <em>Mission UID</em>}</li>
 *   <li>{@link Cpacs.impl.FlightTypeImpl#getModelUID <em>Model UID</em>}</li>
 *   <li>{@link Cpacs.impl.FlightTypeImpl#getDepartureDate <em>Departure Date</em>}</li>
 *   <li>{@link Cpacs.impl.FlightTypeImpl#getDepartureTime <em>Departure Time</em>}</li>
 *   <li>{@link Cpacs.impl.FlightTypeImpl#getArrivalDate <em>Arrival Date</em>}</li>
 *   <li>{@link Cpacs.impl.FlightTypeImpl#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link Cpacs.impl.FlightTypeImpl#getOperatingAirline <em>Operating Airline</em>}</li>
 *   <li>{@link Cpacs.impl.FlightTypeImpl#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link Cpacs.impl.FlightTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightTypeImpl extends ComplexBaseTypeImpl implements FlightType {
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
	 * The cached value of the '{@link #getModelUID() <em>Model UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType modelUID;

	/**
	 * The cached value of the '{@link #getDepartureDate() <em>Departure Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureDate()
	 * @generated
	 * @ordered
	 */
	protected DateBaseType departureDate;

	/**
	 * The cached value of the '{@link #getDepartureTime() <em>Departure Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected TimeBaseType departureTime;

	/**
	 * The cached value of the '{@link #getArrivalDate() <em>Arrival Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalDate()
	 * @generated
	 * @ordered
	 */
	protected DateBaseType arrivalDate;

	/**
	 * The cached value of the '{@link #getArrivalTime() <em>Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalTime()
	 * @generated
	 * @ordered
	 */
	protected TimeBaseType arrivalTime;

	/**
	 * The cached value of the '{@link #getOperatingAirline() <em>Operating Airline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingAirline()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType operatingAirline;

	/**
	 * The cached value of the '{@link #getAnalysis() <em>Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysis()
	 * @generated
	 * @ordered
	 */
	protected FlightAnalysisType analysis;

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
	protected FlightTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightType();
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
					CpacsPackage.FLIGHT_TYPE__MISSION_UID, oldMissionUID, newMissionUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__MISSION_UID, null, msgs);
			if (newMissionUID != null)
				msgs = ((InternalEObject) newMissionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__MISSION_UID, null, msgs);
			msgs = basicSetMissionUID(newMissionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_TYPE__MISSION_UID, newMissionUID,
					newMissionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getModelUID() {
		return modelUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelUID(StringUIDBaseType newModelUID, NotificationChain msgs) {
		StringUIDBaseType oldModelUID = modelUID;
		modelUID = newModelUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_TYPE__MODEL_UID, oldModelUID, newModelUID);
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
	public void setModelUID(StringUIDBaseType newModelUID) {
		if (newModelUID != modelUID) {
			NotificationChain msgs = null;
			if (modelUID != null)
				msgs = ((InternalEObject) modelUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__MODEL_UID, null, msgs);
			if (newModelUID != null)
				msgs = ((InternalEObject) newModelUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__MODEL_UID, null, msgs);
			msgs = basicSetModelUID(newModelUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_TYPE__MODEL_UID, newModelUID,
					newModelUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateBaseType getDepartureDate() {
		return departureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartureDate(DateBaseType newDepartureDate, NotificationChain msgs) {
		DateBaseType oldDepartureDate = departureDate;
		departureDate = newDepartureDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_TYPE__DEPARTURE_DATE, oldDepartureDate, newDepartureDate);
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
	public void setDepartureDate(DateBaseType newDepartureDate) {
		if (newDepartureDate != departureDate) {
			NotificationChain msgs = null;
			if (departureDate != null)
				msgs = ((InternalEObject) departureDate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__DEPARTURE_DATE, null, msgs);
			if (newDepartureDate != null)
				msgs = ((InternalEObject) newDepartureDate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__DEPARTURE_DATE, null, msgs);
			msgs = basicSetDepartureDate(newDepartureDate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_TYPE__DEPARTURE_DATE,
					newDepartureDate, newDepartureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeBaseType getDepartureTime() {
		return departureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartureTime(TimeBaseType newDepartureTime, NotificationChain msgs) {
		TimeBaseType oldDepartureTime = departureTime;
		departureTime = newDepartureTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_TYPE__DEPARTURE_TIME, oldDepartureTime, newDepartureTime);
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
	public void setDepartureTime(TimeBaseType newDepartureTime) {
		if (newDepartureTime != departureTime) {
			NotificationChain msgs = null;
			if (departureTime != null)
				msgs = ((InternalEObject) departureTime).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__DEPARTURE_TIME, null, msgs);
			if (newDepartureTime != null)
				msgs = ((InternalEObject) newDepartureTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__DEPARTURE_TIME, null, msgs);
			msgs = basicSetDepartureTime(newDepartureTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_TYPE__DEPARTURE_TIME,
					newDepartureTime, newDepartureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateBaseType getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalDate(DateBaseType newArrivalDate, NotificationChain msgs) {
		DateBaseType oldArrivalDate = arrivalDate;
		arrivalDate = newArrivalDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_TYPE__ARRIVAL_DATE, oldArrivalDate, newArrivalDate);
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
	public void setArrivalDate(DateBaseType newArrivalDate) {
		if (newArrivalDate != arrivalDate) {
			NotificationChain msgs = null;
			if (arrivalDate != null)
				msgs = ((InternalEObject) arrivalDate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__ARRIVAL_DATE, null, msgs);
			if (newArrivalDate != null)
				msgs = ((InternalEObject) newArrivalDate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__ARRIVAL_DATE, null, msgs);
			msgs = basicSetArrivalDate(newArrivalDate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_TYPE__ARRIVAL_DATE,
					newArrivalDate, newArrivalDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeBaseType getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrivalTime(TimeBaseType newArrivalTime, NotificationChain msgs) {
		TimeBaseType oldArrivalTime = arrivalTime;
		arrivalTime = newArrivalTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_TYPE__ARRIVAL_TIME, oldArrivalTime, newArrivalTime);
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
	public void setArrivalTime(TimeBaseType newArrivalTime) {
		if (newArrivalTime != arrivalTime) {
			NotificationChain msgs = null;
			if (arrivalTime != null)
				msgs = ((InternalEObject) arrivalTime).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__ARRIVAL_TIME, null, msgs);
			if (newArrivalTime != null)
				msgs = ((InternalEObject) newArrivalTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__ARRIVAL_TIME, null, msgs);
			msgs = basicSetArrivalTime(newArrivalTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_TYPE__ARRIVAL_TIME,
					newArrivalTime, newArrivalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getOperatingAirline() {
		return operatingAirline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperatingAirline(StringUIDBaseType newOperatingAirline, NotificationChain msgs) {
		StringUIDBaseType oldOperatingAirline = operatingAirline;
		operatingAirline = newOperatingAirline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_TYPE__OPERATING_AIRLINE, oldOperatingAirline, newOperatingAirline);
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
	public void setOperatingAirline(StringUIDBaseType newOperatingAirline) {
		if (newOperatingAirline != operatingAirline) {
			NotificationChain msgs = null;
			if (operatingAirline != null)
				msgs = ((InternalEObject) operatingAirline).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__OPERATING_AIRLINE, null, msgs);
			if (newOperatingAirline != null)
				msgs = ((InternalEObject) newOperatingAirline).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__OPERATING_AIRLINE, null, msgs);
			msgs = basicSetOperatingAirline(newOperatingAirline, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_TYPE__OPERATING_AIRLINE,
					newOperatingAirline, newOperatingAirline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlightAnalysisType getAnalysis() {
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysis(FlightAnalysisType newAnalysis, NotificationChain msgs) {
		FlightAnalysisType oldAnalysis = analysis;
		analysis = newAnalysis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_TYPE__ANALYSIS, oldAnalysis, newAnalysis);
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
	public void setAnalysis(FlightAnalysisType newAnalysis) {
		if (newAnalysis != analysis) {
			NotificationChain msgs = null;
			if (analysis != null)
				msgs = ((InternalEObject) analysis).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__ANALYSIS, null, msgs);
			if (newAnalysis != null)
				msgs = ((InternalEObject) newAnalysis).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_TYPE__ANALYSIS, null, msgs);
			msgs = basicSetAnalysis(newAnalysis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_TYPE__ANALYSIS, newAnalysis,
					newAnalysis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_TYPE__MISSION_UID:
			return basicSetMissionUID(null, msgs);
		case CpacsPackage.FLIGHT_TYPE__MODEL_UID:
			return basicSetModelUID(null, msgs);
		case CpacsPackage.FLIGHT_TYPE__DEPARTURE_DATE:
			return basicSetDepartureDate(null, msgs);
		case CpacsPackage.FLIGHT_TYPE__DEPARTURE_TIME:
			return basicSetDepartureTime(null, msgs);
		case CpacsPackage.FLIGHT_TYPE__ARRIVAL_DATE:
			return basicSetArrivalDate(null, msgs);
		case CpacsPackage.FLIGHT_TYPE__ARRIVAL_TIME:
			return basicSetArrivalTime(null, msgs);
		case CpacsPackage.FLIGHT_TYPE__OPERATING_AIRLINE:
			return basicSetOperatingAirline(null, msgs);
		case CpacsPackage.FLIGHT_TYPE__ANALYSIS:
			return basicSetAnalysis(null, msgs);
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
		case CpacsPackage.FLIGHT_TYPE__MISSION_UID:
			return getMissionUID();
		case CpacsPackage.FLIGHT_TYPE__MODEL_UID:
			return getModelUID();
		case CpacsPackage.FLIGHT_TYPE__DEPARTURE_DATE:
			return getDepartureDate();
		case CpacsPackage.FLIGHT_TYPE__DEPARTURE_TIME:
			return getDepartureTime();
		case CpacsPackage.FLIGHT_TYPE__ARRIVAL_DATE:
			return getArrivalDate();
		case CpacsPackage.FLIGHT_TYPE__ARRIVAL_TIME:
			return getArrivalTime();
		case CpacsPackage.FLIGHT_TYPE__OPERATING_AIRLINE:
			return getOperatingAirline();
		case CpacsPackage.FLIGHT_TYPE__ANALYSIS:
			return getAnalysis();
		case CpacsPackage.FLIGHT_TYPE__UID:
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
		case CpacsPackage.FLIGHT_TYPE__MISSION_UID:
			setMissionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_TYPE__MODEL_UID:
			setModelUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_TYPE__DEPARTURE_DATE:
			setDepartureDate((DateBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_TYPE__DEPARTURE_TIME:
			setDepartureTime((TimeBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_TYPE__ARRIVAL_DATE:
			setArrivalDate((DateBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_TYPE__ARRIVAL_TIME:
			setArrivalTime((TimeBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_TYPE__OPERATING_AIRLINE:
			setOperatingAirline((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_TYPE__ANALYSIS:
			setAnalysis((FlightAnalysisType) newValue);
			return;
		case CpacsPackage.FLIGHT_TYPE__UID:
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
		case CpacsPackage.FLIGHT_TYPE__MISSION_UID:
			setMissionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FLIGHT_TYPE__MODEL_UID:
			setModelUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.FLIGHT_TYPE__DEPARTURE_DATE:
			setDepartureDate((DateBaseType) null);
			return;
		case CpacsPackage.FLIGHT_TYPE__DEPARTURE_TIME:
			setDepartureTime((TimeBaseType) null);
			return;
		case CpacsPackage.FLIGHT_TYPE__ARRIVAL_DATE:
			setArrivalDate((DateBaseType) null);
			return;
		case CpacsPackage.FLIGHT_TYPE__ARRIVAL_TIME:
			setArrivalTime((TimeBaseType) null);
			return;
		case CpacsPackage.FLIGHT_TYPE__OPERATING_AIRLINE:
			setOperatingAirline((StringUIDBaseType) null);
			return;
		case CpacsPackage.FLIGHT_TYPE__ANALYSIS:
			setAnalysis((FlightAnalysisType) null);
			return;
		case CpacsPackage.FLIGHT_TYPE__UID:
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
		case CpacsPackage.FLIGHT_TYPE__MISSION_UID:
			return missionUID != null;
		case CpacsPackage.FLIGHT_TYPE__MODEL_UID:
			return modelUID != null;
		case CpacsPackage.FLIGHT_TYPE__DEPARTURE_DATE:
			return departureDate != null;
		case CpacsPackage.FLIGHT_TYPE__DEPARTURE_TIME:
			return departureTime != null;
		case CpacsPackage.FLIGHT_TYPE__ARRIVAL_DATE:
			return arrivalDate != null;
		case CpacsPackage.FLIGHT_TYPE__ARRIVAL_TIME:
			return arrivalTime != null;
		case CpacsPackage.FLIGHT_TYPE__OPERATING_AIRLINE:
			return operatingAirline != null;
		case CpacsPackage.FLIGHT_TYPE__ANALYSIS:
			return analysis != null;
		case CpacsPackage.FLIGHT_TYPE__UID:
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

} //FlightTypeImpl
