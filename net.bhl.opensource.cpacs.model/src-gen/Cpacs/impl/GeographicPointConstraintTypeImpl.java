/**
 */
package Cpacs.impl;

import Cpacs.AltitudeType;
import Cpacs.CpacsPackage;
import Cpacs.GeographicPointConstraintType;
import Cpacs.LatitudeType;
import Cpacs.LongitudeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geographic Point Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GeographicPointConstraintTypeImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link Cpacs.impl.GeographicPointConstraintTypeImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link Cpacs.impl.GeographicPointConstraintTypeImpl#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeographicPointConstraintTypeImpl extends ComplexBaseTypeImpl implements GeographicPointConstraintType {
	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected LongitudeType longitude;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected LatitudeType latitude;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected AltitudeType altitude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeographicPointConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGeographicPointConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LongitudeType getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongitude(LongitudeType newLongitude, NotificationChain msgs) {
		LongitudeType oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LONGITUDE, oldLongitude, newLongitude);
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
	public void setLongitude(LongitudeType newLongitude) {
		if (newLongitude != longitude) {
			NotificationChain msgs = null;
			if (longitude != null)
				msgs = ((InternalEObject) longitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LONGITUDE, null, msgs);
			if (newLongitude != null)
				msgs = ((InternalEObject) newLongitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LONGITUDE, null, msgs);
			msgs = basicSetLongitude(newLongitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LONGITUDE, newLongitude, newLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatitudeType getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatitude(LatitudeType newLatitude, NotificationChain msgs) {
		LatitudeType oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LATITUDE, oldLatitude, newLatitude);
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
	public void setLatitude(LatitudeType newLatitude) {
		if (newLatitude != latitude) {
			NotificationChain msgs = null;
			if (latitude != null)
				msgs = ((InternalEObject) latitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LATITUDE, null, msgs);
			if (newLatitude != null)
				msgs = ((InternalEObject) newLatitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LATITUDE, null, msgs);
			msgs = basicSetLatitude(newLatitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LATITUDE, newLatitude, newLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltitudeType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(AltitudeType newAltitude, NotificationChain msgs) {
		AltitudeType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(AltitudeType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__ALTITUDE, newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LONGITUDE:
			return basicSetLongitude(null, msgs);
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LATITUDE:
			return basicSetLatitude(null, msgs);
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
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
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LONGITUDE:
			return getLongitude();
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LATITUDE:
			return getLatitude();
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__ALTITUDE:
			return getAltitude();
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
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LONGITUDE:
			setLongitude((LongitudeType) newValue);
			return;
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LATITUDE:
			setLatitude((LatitudeType) newValue);
			return;
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__ALTITUDE:
			setAltitude((AltitudeType) newValue);
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
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LONGITUDE:
			setLongitude((LongitudeType) null);
			return;
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LATITUDE:
			setLatitude((LatitudeType) null);
			return;
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__ALTITUDE:
			setAltitude((AltitudeType) null);
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
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LONGITUDE:
			return longitude != null;
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__LATITUDE:
			return latitude != null;
		case CpacsPackage.GEOGRAPHIC_POINT_CONSTRAINT_TYPE__ALTITUDE:
			return altitude != null;
		}
		return super.eIsSet(featureID);
	}

} //GeographicPointConstraintTypeImpl
