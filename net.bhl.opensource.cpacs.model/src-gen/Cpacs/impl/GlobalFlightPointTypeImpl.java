/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.EnvironmentType;
import Cpacs.GlobalFlightPointType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Flight Point Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GlobalFlightPointTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalFlightPointTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalFlightPointTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalFlightPointTypeImpl#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalFlightPointTypeImpl#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalFlightPointTypeImpl#getTrueAirSpeed <em>True Air Speed</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalFlightPointTypeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link Cpacs.impl.GlobalFlightPointTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlobalFlightPointTypeImpl extends ComplexBaseTypeImpl implements GlobalFlightPointType {
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
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType altitude;

	/**
	 * The cached value of the '{@link #getMachNumber() <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMachNumber()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType machNumber;

	/**
	 * The cached value of the '{@link #getCalibratedAirSpeed() <em>Calibrated Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalibratedAirSpeed()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType calibratedAirSpeed;

	/**
	 * The cached value of the '{@link #getTrueAirSpeed() <em>True Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueAirSpeed()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType trueAirSpeed;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentType environment;

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
	protected GlobalFlightPointTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGlobalFlightPointType();
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
					CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__NAME, newName,
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
					CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(DoubleBaseType newAltitude, NotificationChain msgs) {
		DoubleBaseType oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ALTITUDE, oldAltitude, newAltitude);
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
	public void setAltitude(DoubleBaseType newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject) altitude).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject) newAltitude).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ALTITUDE,
					newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getMachNumber() {
		return machNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMachNumber(DoubleBaseType newMachNumber, NotificationChain msgs) {
		DoubleBaseType oldMachNumber = machNumber;
		machNumber = newMachNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__MACH_NUMBER, oldMachNumber, newMachNumber);
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
	public void setMachNumber(DoubleBaseType newMachNumber) {
		if (newMachNumber != machNumber) {
			NotificationChain msgs = null;
			if (machNumber != null)
				msgs = ((InternalEObject) machNumber).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__MACH_NUMBER, null, msgs);
			if (newMachNumber != null)
				msgs = ((InternalEObject) newMachNumber).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__MACH_NUMBER, null, msgs);
			msgs = basicSetMachNumber(newMachNumber, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__MACH_NUMBER,
					newMachNumber, newMachNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCalibratedAirSpeed() {
		return calibratedAirSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalibratedAirSpeed(DoubleBaseType newCalibratedAirSpeed, NotificationChain msgs) {
		DoubleBaseType oldCalibratedAirSpeed = calibratedAirSpeed;
		calibratedAirSpeed = newCalibratedAirSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__CALIBRATED_AIR_SPEED, oldCalibratedAirSpeed,
					newCalibratedAirSpeed);
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
	public void setCalibratedAirSpeed(DoubleBaseType newCalibratedAirSpeed) {
		if (newCalibratedAirSpeed != calibratedAirSpeed) {
			NotificationChain msgs = null;
			if (calibratedAirSpeed != null)
				msgs = ((InternalEObject) calibratedAirSpeed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__CALIBRATED_AIR_SPEED, null,
						msgs);
			if (newCalibratedAirSpeed != null)
				msgs = ((InternalEObject) newCalibratedAirSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__CALIBRATED_AIR_SPEED, null,
						msgs);
			msgs = basicSetCalibratedAirSpeed(newCalibratedAirSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__CALIBRATED_AIR_SPEED, newCalibratedAirSpeed,
					newCalibratedAirSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getTrueAirSpeed() {
		return trueAirSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrueAirSpeed(DoubleBaseType newTrueAirSpeed, NotificationChain msgs) {
		DoubleBaseType oldTrueAirSpeed = trueAirSpeed;
		trueAirSpeed = newTrueAirSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__TRUE_AIR_SPEED, oldTrueAirSpeed, newTrueAirSpeed);
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
	public void setTrueAirSpeed(DoubleBaseType newTrueAirSpeed) {
		if (newTrueAirSpeed != trueAirSpeed) {
			NotificationChain msgs = null;
			if (trueAirSpeed != null)
				msgs = ((InternalEObject) trueAirSpeed).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__TRUE_AIR_SPEED, null, msgs);
			if (newTrueAirSpeed != null)
				msgs = ((InternalEObject) newTrueAirSpeed).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__TRUE_AIR_SPEED, null, msgs);
			msgs = basicSetTrueAirSpeed(newTrueAirSpeed, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__TRUE_AIR_SPEED,
					newTrueAirSpeed, newTrueAirSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentType getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(EnvironmentType newEnvironment, NotificationChain msgs) {
		EnvironmentType oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ENVIRONMENT, oldEnvironment, newEnvironment);
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
	public void setEnvironment(EnvironmentType newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject) environment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject) newEnvironment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ENVIRONMENT,
					newEnvironment, newEnvironment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__UID, oldUID,
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
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ALTITUDE:
			return basicSetAltitude(null, msgs);
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__MACH_NUMBER:
			return basicSetMachNumber(null, msgs);
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__CALIBRATED_AIR_SPEED:
			return basicSetCalibratedAirSpeed(null, msgs);
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__TRUE_AIR_SPEED:
			return basicSetTrueAirSpeed(null, msgs);
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ENVIRONMENT:
			return basicSetEnvironment(null, msgs);
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
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__NAME:
			return getName();
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ALTITUDE:
			return getAltitude();
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__MACH_NUMBER:
			return getMachNumber();
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__CALIBRATED_AIR_SPEED:
			return getCalibratedAirSpeed();
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__TRUE_AIR_SPEED:
			return getTrueAirSpeed();
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ENVIRONMENT:
			return getEnvironment();
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__UID:
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
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ALTITUDE:
			setAltitude((DoubleBaseType) newValue);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) newValue);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__CALIBRATED_AIR_SPEED:
			setCalibratedAirSpeed((DoubleBaseType) newValue);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__TRUE_AIR_SPEED:
			setTrueAirSpeed((DoubleBaseType) newValue);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ENVIRONMENT:
			setEnvironment((EnvironmentType) newValue);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__UID:
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
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ALTITUDE:
			setAltitude((DoubleBaseType) null);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__MACH_NUMBER:
			setMachNumber((DoubleBaseType) null);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__CALIBRATED_AIR_SPEED:
			setCalibratedAirSpeed((DoubleBaseType) null);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__TRUE_AIR_SPEED:
			setTrueAirSpeed((DoubleBaseType) null);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ENVIRONMENT:
			setEnvironment((EnvironmentType) null);
			return;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__UID:
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
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__NAME:
			return name != null;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ALTITUDE:
			return altitude != null;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__MACH_NUMBER:
			return machNumber != null;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__CALIBRATED_AIR_SPEED:
			return calibratedAirSpeed != null;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__TRUE_AIR_SPEED:
			return trueAirSpeed != null;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__ENVIRONMENT:
			return environment != null;
		case CpacsPackage.GLOBAL_FLIGHT_POINT_TYPE__UID:
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

} //GlobalFlightPointTypeImpl
