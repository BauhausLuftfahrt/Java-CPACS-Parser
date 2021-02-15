/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FuelTankVolumeType;
import Cpacs.StringBaseType;
import Cpacs.WingFuelTankGeometryType;
import Cpacs.WingFuelTankType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Fuel Tank Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingFuelTankTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.WingFuelTankTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.WingFuelTankTypeImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link Cpacs.impl.WingFuelTankTypeImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link Cpacs.impl.WingFuelTankTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingFuelTankTypeImpl extends ComplexBaseTypeImpl implements WingFuelTankType {
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
	 * The cached value of the '{@link #getGeometry() <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometry()
	 * @generated
	 * @ordered
	 */
	protected WingFuelTankGeometryType geometry;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected FuelTankVolumeType volume;

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
	protected WingFuelTankTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingFuelTankType();
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
					CpacsPackage.WING_FUEL_TANK_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_FUEL_TANK_TYPE__NAME, newName,
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
					CpacsPackage.WING_FUEL_TANK_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_FUEL_TANK_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingFuelTankGeometryType getGeometry() {
		return geometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(WingFuelTankGeometryType newGeometry, NotificationChain msgs) {
		WingFuelTankGeometryType oldGeometry = geometry;
		geometry = newGeometry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_FUEL_TANK_TYPE__GEOMETRY, oldGeometry, newGeometry);
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
	public void setGeometry(WingFuelTankGeometryType newGeometry) {
		if (newGeometry != geometry) {
			NotificationChain msgs = null;
			if (geometry != null)
				msgs = ((InternalEObject) geometry).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_TYPE__GEOMETRY, null, msgs);
			if (newGeometry != null)
				msgs = ((InternalEObject) newGeometry).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_TYPE__GEOMETRY, null, msgs);
			msgs = basicSetGeometry(newGeometry, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_FUEL_TANK_TYPE__GEOMETRY,
					newGeometry, newGeometry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FuelTankVolumeType getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolume(FuelTankVolumeType newVolume, NotificationChain msgs) {
		FuelTankVolumeType oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_FUEL_TANK_TYPE__VOLUME, oldVolume, newVolume);
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
	public void setVolume(FuelTankVolumeType newVolume) {
		if (newVolume != volume) {
			NotificationChain msgs = null;
			if (volume != null)
				msgs = ((InternalEObject) volume).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_TYPE__VOLUME, null, msgs);
			if (newVolume != null)
				msgs = ((InternalEObject) newVolume).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_FUEL_TANK_TYPE__VOLUME, null, msgs);
			msgs = basicSetVolume(newVolume, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_FUEL_TANK_TYPE__VOLUME, newVolume,
					newVolume));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_FUEL_TANK_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_FUEL_TANK_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.WING_FUEL_TANK_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.WING_FUEL_TANK_TYPE__GEOMETRY:
			return basicSetGeometry(null, msgs);
		case CpacsPackage.WING_FUEL_TANK_TYPE__VOLUME:
			return basicSetVolume(null, msgs);
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
		case CpacsPackage.WING_FUEL_TANK_TYPE__NAME:
			return getName();
		case CpacsPackage.WING_FUEL_TANK_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.WING_FUEL_TANK_TYPE__GEOMETRY:
			return getGeometry();
		case CpacsPackage.WING_FUEL_TANK_TYPE__VOLUME:
			return getVolume();
		case CpacsPackage.WING_FUEL_TANK_TYPE__UID:
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
		case CpacsPackage.WING_FUEL_TANK_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_FUEL_TANK_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_FUEL_TANK_TYPE__GEOMETRY:
			setGeometry((WingFuelTankGeometryType) newValue);
			return;
		case CpacsPackage.WING_FUEL_TANK_TYPE__VOLUME:
			setVolume((FuelTankVolumeType) newValue);
			return;
		case CpacsPackage.WING_FUEL_TANK_TYPE__UID:
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
		case CpacsPackage.WING_FUEL_TANK_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.WING_FUEL_TANK_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.WING_FUEL_TANK_TYPE__GEOMETRY:
			setGeometry((WingFuelTankGeometryType) null);
			return;
		case CpacsPackage.WING_FUEL_TANK_TYPE__VOLUME:
			setVolume((FuelTankVolumeType) null);
			return;
		case CpacsPackage.WING_FUEL_TANK_TYPE__UID:
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
		case CpacsPackage.WING_FUEL_TANK_TYPE__NAME:
			return name != null;
		case CpacsPackage.WING_FUEL_TANK_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.WING_FUEL_TANK_TYPE__GEOMETRY:
			return geometry != null;
		case CpacsPackage.WING_FUEL_TANK_TYPE__VOLUME:
			return volume != null;
		case CpacsPackage.WING_FUEL_TANK_TYPE__UID:
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

} //WingFuelTankTypeImpl
