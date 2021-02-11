/**
 */
package Cpacs.impl;

import Cpacs.AirportType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.RunwaysType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Airport Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AirportTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.AirportTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.AirportTypeImpl#getIataCode <em>Iata Code</em>}</li>
 *   <li>{@link Cpacs.impl.AirportTypeImpl#getIcaoCode <em>Icao Code</em>}</li>
 *   <li>{@link Cpacs.impl.AirportTypeImpl#getPositionNorth <em>Position North</em>}</li>
 *   <li>{@link Cpacs.impl.AirportTypeImpl#getPositionEast <em>Position East</em>}</li>
 *   <li>{@link Cpacs.impl.AirportTypeImpl#getElevation <em>Elevation</em>}</li>
 *   <li>{@link Cpacs.impl.AirportTypeImpl#getRunways <em>Runways</em>}</li>
 *   <li>{@link Cpacs.impl.AirportTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AirportTypeImpl extends ComplexBaseTypeImpl implements AirportType {
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
	 * The cached value of the '{@link #getIataCode() <em>Iata Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIataCode()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType iataCode;

	/**
	 * The cached value of the '{@link #getIcaoCode() <em>Icao Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcaoCode()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType icaoCode;

	/**
	 * The cached value of the '{@link #getPositionNorth() <em>Position North</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionNorth()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionNorth;

	/**
	 * The cached value of the '{@link #getPositionEast() <em>Position East</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionEast()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionEast;

	/**
	 * The cached value of the '{@link #getElevation() <em>Elevation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType elevation;

	/**
	 * The cached value of the '{@link #getRunways() <em>Runways</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunways()
	 * @generated
	 * @ordered
	 */
	protected RunwaysType runways;

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
	protected AirportTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAirportType();
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
					CpacsPackage.AIRPORT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRPORT_TYPE__NAME, newName, newName));
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
					CpacsPackage.AIRPORT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRPORT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getIataCode() {
		return iataCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIataCode(StringBaseType newIataCode, NotificationChain msgs) {
		StringBaseType oldIataCode = iataCode;
		iataCode = newIataCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_TYPE__IATA_CODE, oldIataCode, newIataCode);
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
	public void setIataCode(StringBaseType newIataCode) {
		if (newIataCode != iataCode) {
			NotificationChain msgs = null;
			if (iataCode != null)
				msgs = ((InternalEObject) iataCode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__IATA_CODE, null, msgs);
			if (newIataCode != null)
				msgs = ((InternalEObject) newIataCode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__IATA_CODE, null, msgs);
			msgs = basicSetIataCode(newIataCode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRPORT_TYPE__IATA_CODE, newIataCode,
					newIataCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getIcaoCode() {
		return icaoCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcaoCode(StringBaseType newIcaoCode, NotificationChain msgs) {
		StringBaseType oldIcaoCode = icaoCode;
		icaoCode = newIcaoCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_TYPE__ICAO_CODE, oldIcaoCode, newIcaoCode);
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
	public void setIcaoCode(StringBaseType newIcaoCode) {
		if (newIcaoCode != icaoCode) {
			NotificationChain msgs = null;
			if (icaoCode != null)
				msgs = ((InternalEObject) icaoCode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__ICAO_CODE, null, msgs);
			if (newIcaoCode != null)
				msgs = ((InternalEObject) newIcaoCode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__ICAO_CODE, null, msgs);
			msgs = basicSetIcaoCode(newIcaoCode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRPORT_TYPE__ICAO_CODE, newIcaoCode,
					newIcaoCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionNorth() {
		return positionNorth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionNorth(DoubleBaseType newPositionNorth, NotificationChain msgs) {
		DoubleBaseType oldPositionNorth = positionNorth;
		positionNorth = newPositionNorth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_TYPE__POSITION_NORTH, oldPositionNorth, newPositionNorth);
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
	public void setPositionNorth(DoubleBaseType newPositionNorth) {
		if (newPositionNorth != positionNorth) {
			NotificationChain msgs = null;
			if (positionNorth != null)
				msgs = ((InternalEObject) positionNorth).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__POSITION_NORTH, null, msgs);
			if (newPositionNorth != null)
				msgs = ((InternalEObject) newPositionNorth).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__POSITION_NORTH, null, msgs);
			msgs = basicSetPositionNorth(newPositionNorth, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRPORT_TYPE__POSITION_NORTH,
					newPositionNorth, newPositionNorth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionEast() {
		return positionEast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionEast(DoubleBaseType newPositionEast, NotificationChain msgs) {
		DoubleBaseType oldPositionEast = positionEast;
		positionEast = newPositionEast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_TYPE__POSITION_EAST, oldPositionEast, newPositionEast);
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
	public void setPositionEast(DoubleBaseType newPositionEast) {
		if (newPositionEast != positionEast) {
			NotificationChain msgs = null;
			if (positionEast != null)
				msgs = ((InternalEObject) positionEast).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__POSITION_EAST, null, msgs);
			if (newPositionEast != null)
				msgs = ((InternalEObject) newPositionEast).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__POSITION_EAST, null, msgs);
			msgs = basicSetPositionEast(newPositionEast, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRPORT_TYPE__POSITION_EAST,
					newPositionEast, newPositionEast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getElevation() {
		return elevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElevation(DoubleBaseType newElevation, NotificationChain msgs) {
		DoubleBaseType oldElevation = elevation;
		elevation = newElevation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_TYPE__ELEVATION, oldElevation, newElevation);
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
	public void setElevation(DoubleBaseType newElevation) {
		if (newElevation != elevation) {
			NotificationChain msgs = null;
			if (elevation != null)
				msgs = ((InternalEObject) elevation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__ELEVATION, null, msgs);
			if (newElevation != null)
				msgs = ((InternalEObject) newElevation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__ELEVATION, null, msgs);
			msgs = basicSetElevation(newElevation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRPORT_TYPE__ELEVATION, newElevation,
					newElevation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RunwaysType getRunways() {
		return runways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunways(RunwaysType newRunways, NotificationChain msgs) {
		RunwaysType oldRunways = runways;
		runways = newRunways;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AIRPORT_TYPE__RUNWAYS, oldRunways, newRunways);
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
	public void setRunways(RunwaysType newRunways) {
		if (newRunways != runways) {
			NotificationChain msgs = null;
			if (runways != null)
				msgs = ((InternalEObject) runways).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__RUNWAYS, null, msgs);
			if (newRunways != null)
				msgs = ((InternalEObject) newRunways).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AIRPORT_TYPE__RUNWAYS, null, msgs);
			msgs = basicSetRunways(newRunways, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRPORT_TYPE__RUNWAYS, newRunways,
					newRunways));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AIRPORT_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AIRPORT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.AIRPORT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.AIRPORT_TYPE__IATA_CODE:
			return basicSetIataCode(null, msgs);
		case CpacsPackage.AIRPORT_TYPE__ICAO_CODE:
			return basicSetIcaoCode(null, msgs);
		case CpacsPackage.AIRPORT_TYPE__POSITION_NORTH:
			return basicSetPositionNorth(null, msgs);
		case CpacsPackage.AIRPORT_TYPE__POSITION_EAST:
			return basicSetPositionEast(null, msgs);
		case CpacsPackage.AIRPORT_TYPE__ELEVATION:
			return basicSetElevation(null, msgs);
		case CpacsPackage.AIRPORT_TYPE__RUNWAYS:
			return basicSetRunways(null, msgs);
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
		case CpacsPackage.AIRPORT_TYPE__NAME:
			return getName();
		case CpacsPackage.AIRPORT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.AIRPORT_TYPE__IATA_CODE:
			return getIataCode();
		case CpacsPackage.AIRPORT_TYPE__ICAO_CODE:
			return getIcaoCode();
		case CpacsPackage.AIRPORT_TYPE__POSITION_NORTH:
			return getPositionNorth();
		case CpacsPackage.AIRPORT_TYPE__POSITION_EAST:
			return getPositionEast();
		case CpacsPackage.AIRPORT_TYPE__ELEVATION:
			return getElevation();
		case CpacsPackage.AIRPORT_TYPE__RUNWAYS:
			return getRunways();
		case CpacsPackage.AIRPORT_TYPE__UID:
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
		case CpacsPackage.AIRPORT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.AIRPORT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.AIRPORT_TYPE__IATA_CODE:
			setIataCode((StringBaseType) newValue);
			return;
		case CpacsPackage.AIRPORT_TYPE__ICAO_CODE:
			setIcaoCode((StringBaseType) newValue);
			return;
		case CpacsPackage.AIRPORT_TYPE__POSITION_NORTH:
			setPositionNorth((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AIRPORT_TYPE__POSITION_EAST:
			setPositionEast((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AIRPORT_TYPE__ELEVATION:
			setElevation((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AIRPORT_TYPE__RUNWAYS:
			setRunways((RunwaysType) newValue);
			return;
		case CpacsPackage.AIRPORT_TYPE__UID:
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
		case CpacsPackage.AIRPORT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.AIRPORT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.AIRPORT_TYPE__IATA_CODE:
			setIataCode((StringBaseType) null);
			return;
		case CpacsPackage.AIRPORT_TYPE__ICAO_CODE:
			setIcaoCode((StringBaseType) null);
			return;
		case CpacsPackage.AIRPORT_TYPE__POSITION_NORTH:
			setPositionNorth((DoubleBaseType) null);
			return;
		case CpacsPackage.AIRPORT_TYPE__POSITION_EAST:
			setPositionEast((DoubleBaseType) null);
			return;
		case CpacsPackage.AIRPORT_TYPE__ELEVATION:
			setElevation((DoubleBaseType) null);
			return;
		case CpacsPackage.AIRPORT_TYPE__RUNWAYS:
			setRunways((RunwaysType) null);
			return;
		case CpacsPackage.AIRPORT_TYPE__UID:
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
		case CpacsPackage.AIRPORT_TYPE__NAME:
			return name != null;
		case CpacsPackage.AIRPORT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.AIRPORT_TYPE__IATA_CODE:
			return iataCode != null;
		case CpacsPackage.AIRPORT_TYPE__ICAO_CODE:
			return icaoCode != null;
		case CpacsPackage.AIRPORT_TYPE__POSITION_NORTH:
			return positionNorth != null;
		case CpacsPackage.AIRPORT_TYPE__POSITION_EAST:
			return positionEast != null;
		case CpacsPackage.AIRPORT_TYPE__ELEVATION:
			return elevation != null;
		case CpacsPackage.AIRPORT_TYPE__RUNWAYS:
			return runways != null;
		case CpacsPackage.AIRPORT_TYPE__UID:
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

} //AirportTypeImpl
