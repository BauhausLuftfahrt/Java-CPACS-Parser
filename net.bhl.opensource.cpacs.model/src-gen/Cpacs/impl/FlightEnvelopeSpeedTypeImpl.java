/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleVectorBaseType;
import Cpacs.FlightEnvelopeSpeedType;
import Cpacs.SpeedDesignatorsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flight Envelope Speed Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlightEnvelopeSpeedTypeImpl#getSpeedName <em>Speed Name</em>}</li>
 *   <li>{@link Cpacs.impl.FlightEnvelopeSpeedTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.FlightEnvelopeSpeedTypeImpl#getTrueAirSpeed <em>True Air Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlightEnvelopeSpeedTypeImpl extends ComplexBaseTypeImpl implements FlightEnvelopeSpeedType {
	/**
	 * The cached value of the '{@link #getSpeedName() <em>Speed Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedName()
	 * @generated
	 * @ordered
	 */
	protected SpeedDesignatorsType speedName;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType altitude;

	/**
	 * The cached value of the '{@link #getTrueAirSpeed() <em>True Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueAirSpeed()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType trueAirSpeed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlightEnvelopeSpeedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlightEnvelopeSpeedType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeedDesignatorsType getSpeedName() {
		return speedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeedName(SpeedDesignatorsType newSpeedName, NotificationChain msgs) {
		SpeedDesignatorsType oldSpeedName = speedName;
		speedName = newSpeedName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__SPEED_NAME, oldSpeedName, newSpeedName);
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
	public void setSpeedName(SpeedDesignatorsType newSpeedName) {
		if (newSpeedName != speedName) {
			NotificationChain msgs = null;
			if (speedName != null)
				msgs = ((InternalEObject) speedName).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__SPEED_NAME, null, msgs);
			if (newSpeedName != null)
				msgs = ((InternalEObject) newSpeedName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__SPEED_NAME, null, msgs);
			msgs = basicSetSpeedName(newSpeedName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__SPEED_NAME,
					newSpeedName, newSpeedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(DoubleVectorBaseType newAltitude, NotificationChain msgs) {
		DoubleVectorBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(DoubleVectorBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__ALTITUDE,
					newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getTrueAirSpeed() {
		return trueAirSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrueAirSpeed(DoubleVectorBaseType newTrueAirSpeed, NotificationChain msgs) {
		DoubleVectorBaseType oldTrueAirSpeed = trueAirSpeed;
		trueAirSpeed = newTrueAirSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__TRUE_AIR_SPEED, oldTrueAirSpeed, newTrueAirSpeed);
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
	public void setTrueAirSpeed(DoubleVectorBaseType newTrueAirSpeed) {
		if (newTrueAirSpeed != trueAirSpeed) {
			NotificationChain msgs = null;
			if (trueAirSpeed != null)
				msgs = ((InternalEObject) trueAirSpeed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__TRUE_AIR_SPEED, null, msgs);
			if (newTrueAirSpeed != null)
				msgs = ((InternalEObject) newTrueAirSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__TRUE_AIR_SPEED, null, msgs);
			msgs = basicSetTrueAirSpeed(newTrueAirSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__TRUE_AIR_SPEED, newTrueAirSpeed, newTrueAirSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__SPEED_NAME:
			return basicSetSpeedName(null, msgs);
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__TRUE_AIR_SPEED:
			return basicSetTrueAirSpeed(null, msgs);
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
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__SPEED_NAME:
			return getSpeedName();
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__ALTITUDE:
			return getAltitude();
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__TRUE_AIR_SPEED:
			return getTrueAirSpeed();
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
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__SPEED_NAME:
			setSpeedName((SpeedDesignatorsType) newValue);
			return;
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__ALTITUDE:
			setAltitude((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__TRUE_AIR_SPEED:
			setTrueAirSpeed((DoubleVectorBaseType) newValue);
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
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__SPEED_NAME:
			setSpeedName((SpeedDesignatorsType) null);
			return;
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__ALTITUDE:
			setAltitude((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__TRUE_AIR_SPEED:
			setTrueAirSpeed((DoubleVectorBaseType) null);
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
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__SPEED_NAME:
			return speedName != null;
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__ALTITUDE:
			return altitude != null;
		case CpacsPackage.FLIGHT_ENVELOPE_SPEED_TYPE__TRUE_AIR_SPEED:
			return trueAirSpeed != null;
		}
		return super.eIsSet(featureID);
	}

} //FlightEnvelopeSpeedTypeImpl
