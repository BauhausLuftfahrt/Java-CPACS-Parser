/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightPerformanceCaseType;
import Cpacs.FlightPerformanceLandingType;
import Cpacs.FlightPerformanceTakeoffType;

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
 *   <li>{@link Cpacs.impl.FlightPerformanceCaseTypeImpl#getTakeoff <em>Takeoff</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceCaseTypeImpl#getLanding <em>Landing</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPerformanceCaseTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPerformanceCaseTypeImpl extends ComplexBaseTypeImpl implements FlightPerformanceCaseType {
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF:
			return basicSetTakeoff(null, msgs);
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING:
			return basicSetLanding(null, msgs);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF:
			return getTakeoff();
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING:
			return getLanding();
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF:
			setTakeoff((FlightPerformanceTakeoffType) newValue);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING:
			setLanding((FlightPerformanceLandingType) newValue);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF:
			setTakeoff((FlightPerformanceTakeoffType) null);
			return;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING:
			setLanding((FlightPerformanceLandingType) null);
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
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__TAKEOFF:
			return takeoff != null;
		case CpacsPackage.FLIGHT_PERFORMANCE_CASE_TYPE__LANDING:
			return landing != null;
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
