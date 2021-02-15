/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlightPathType;
import Cpacs.StringVectorBaseType;
import Cpacs.WayPointTypeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Path Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightPathTypeImpl#getWayPoints <em>Way Points</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPathTypeImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPathTypeImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link Cpacs.impl.FlightPathTypeImpl#getWayPointType <em>Way Point Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightPathTypeImpl extends ComplexBaseTypeImpl implements FlightPathType {
	/**
	 * The cached value of the '{@link #getWayPoints() <em>Way Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWayPoints()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType wayPoints;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType latitude;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected StringVectorBaseType longitude;

	/**
	 * The cached value of the '{@link #getWayPointType() <em>Way Point Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWayPointType()
	 * @generated
	 * @ordered
	 */
	protected WayPointTypeType wayPointType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightPathTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightPathType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getWayPoints() {
		return wayPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWayPoints(StringVectorBaseType newWayPoints, NotificationChain msgs) {
		StringVectorBaseType oldWayPoints = wayPoints;
		wayPoints = newWayPoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINTS, oldWayPoints, newWayPoints);
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
	public void setWayPoints(StringVectorBaseType newWayPoints) {
		if (newWayPoints != wayPoints) {
			NotificationChain msgs = null;
			if (wayPoints != null)
				msgs = ((InternalEObject) wayPoints).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINTS, null, msgs);
			if (newWayPoints != null)
				msgs = ((InternalEObject) newWayPoints).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINTS, null, msgs);
			msgs = basicSetWayPoints(newWayPoints, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINTS,
					newWayPoints, newWayPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatitude(StringVectorBaseType newLatitude, NotificationChain msgs) {
		StringVectorBaseType oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PATH_TYPE__LATITUDE, oldLatitude, newLatitude);
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
	public void setLatitude(StringVectorBaseType newLatitude) {
		if (newLatitude != latitude) {
			NotificationChain msgs = null;
			if (latitude != null)
				msgs = ((InternalEObject) latitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PATH_TYPE__LATITUDE, null, msgs);
			if (newLatitude != null)
				msgs = ((InternalEObject) newLatitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PATH_TYPE__LATITUDE, null, msgs);
			msgs = basicSetLatitude(newLatitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_PATH_TYPE__LATITUDE, newLatitude,
					newLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongitude(StringVectorBaseType newLongitude, NotificationChain msgs) {
		StringVectorBaseType oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PATH_TYPE__LONGITUDE, oldLongitude, newLongitude);
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
	public void setLongitude(StringVectorBaseType newLongitude) {
		if (newLongitude != longitude) {
			NotificationChain msgs = null;
			if (longitude != null)
				msgs = ((InternalEObject) longitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PATH_TYPE__LONGITUDE, null, msgs);
			if (newLongitude != null)
				msgs = ((InternalEObject) newLongitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PATH_TYPE__LONGITUDE, null, msgs);
			msgs = basicSetLongitude(newLongitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_PATH_TYPE__LONGITUDE,
					newLongitude, newLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WayPointTypeType getWayPointType() {
		return wayPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWayPointType(WayPointTypeType newWayPointType, NotificationChain msgs) {
		WayPointTypeType oldWayPointType = wayPointType;
		wayPointType = newWayPointType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINT_TYPE, oldWayPointType, newWayPointType);
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
	public void setWayPointType(WayPointTypeType newWayPointType) {
		if (newWayPointType != wayPointType) {
			NotificationChain msgs = null;
			if (wayPointType != null)
				msgs = ((InternalEObject) wayPointType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINT_TYPE, null, msgs);
			if (newWayPointType != null)
				msgs = ((InternalEObject) newWayPointType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINT_TYPE, null, msgs);
			msgs = basicSetWayPointType(newWayPointType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINT_TYPE,
					newWayPointType, newWayPointType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINTS:
			return basicSetWayPoints(null, msgs);
		case CpacsPackage.FLIGHT_PATH_TYPE__LATITUDE:
			return basicSetLatitude(null, msgs);
		case CpacsPackage.FLIGHT_PATH_TYPE__LONGITUDE:
			return basicSetLongitude(null, msgs);
		case CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINT_TYPE:
			return basicSetWayPointType(null, msgs);
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
		case CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINTS:
			return getWayPoints();
		case CpacsPackage.FLIGHT_PATH_TYPE__LATITUDE:
			return getLatitude();
		case CpacsPackage.FLIGHT_PATH_TYPE__LONGITUDE:
			return getLongitude();
		case CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINT_TYPE:
			return getWayPointType();
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
		case CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINTS:
			setWayPoints((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_PATH_TYPE__LATITUDE:
			setLatitude((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_PATH_TYPE__LONGITUDE:
			setLongitude((StringVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINT_TYPE:
			setWayPointType((WayPointTypeType) newValue);
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
		case CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINTS:
			setWayPoints((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_PATH_TYPE__LATITUDE:
			setLatitude((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_PATH_TYPE__LONGITUDE:
			setLongitude((StringVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINT_TYPE:
			setWayPointType((WayPointTypeType) null);
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
		case CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINTS:
			return wayPoints != null;
		case CpacsPackage.FLIGHT_PATH_TYPE__LATITUDE:
			return latitude != null;
		case CpacsPackage.FLIGHT_PATH_TYPE__LONGITUDE:
			return longitude != null;
		case CpacsPackage.FLIGHT_PATH_TYPE__WAY_POINT_TYPE:
			return wayPointType != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightPathTypeImpl
