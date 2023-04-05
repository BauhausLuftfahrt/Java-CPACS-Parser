/**
 */
package Cpacs.impl;

import Cpacs.AircraftControlElementsType;
import Cpacs.CpacsPackage;
import Cpacs.InternalPressuresType;
import Cpacs.StringBaseType;
import Cpacs.VehicleConfigurationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.VehicleConfigurationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.VehicleConfigurationTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.VehicleConfigurationTypeImpl#getControlElements <em>Control Elements</em>}</li>
 *   <li>{@link Cpacs.impl.VehicleConfigurationTypeImpl#getInternalPressures <em>Internal Pressures</em>}</li>
 *   <li>{@link Cpacs.impl.VehicleConfigurationTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleConfigurationTypeImpl extends ComplexBaseTypeImpl implements VehicleConfigurationType {
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
	 * The cached value of the '{@link #getControlElements() <em>Control Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlElements()
	 * @generated
	 * @ordered
	 */
	protected AircraftControlElementsType controlElements;

	/**
	 * The cached value of the '{@link #getInternalPressures() <em>Internal Pressures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalPressures()
	 * @generated
	 * @ordered
	 */
	protected InternalPressuresType internalPressures;

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
	protected VehicleConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getVehicleConfigurationType();
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
					CpacsPackage.VEHICLE_CONFIGURATION_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLE_CONFIGURATION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLE_CONFIGURATION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLE_CONFIGURATION_TYPE__NAME,
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
					CpacsPackage.VEHICLE_CONFIGURATION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLE_CONFIGURATION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLE_CONFIGURATION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLE_CONFIGURATION_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AircraftControlElementsType getControlElements() {
		return controlElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlElements(AircraftControlElementsType newControlElements,
			NotificationChain msgs) {
		AircraftControlElementsType oldControlElements = controlElements;
		controlElements = newControlElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLE_CONFIGURATION_TYPE__CONTROL_ELEMENTS, oldControlElements, newControlElements);
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
	public void setControlElements(AircraftControlElementsType newControlElements) {
		if (newControlElements != controlElements) {
			NotificationChain msgs = null;
			if (controlElements != null)
				msgs = ((InternalEObject) controlElements).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLE_CONFIGURATION_TYPE__CONTROL_ELEMENTS, null, msgs);
			if (newControlElements != null)
				msgs = ((InternalEObject) newControlElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLE_CONFIGURATION_TYPE__CONTROL_ELEMENTS, null, msgs);
			msgs = basicSetControlElements(newControlElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLE_CONFIGURATION_TYPE__CONTROL_ELEMENTS, newControlElements, newControlElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalPressuresType getInternalPressures() {
		return internalPressures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalPressures(InternalPressuresType newInternalPressures,
			NotificationChain msgs) {
		InternalPressuresType oldInternalPressures = internalPressures;
		internalPressures = newInternalPressures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLE_CONFIGURATION_TYPE__INTERNAL_PRESSURES, oldInternalPressures,
					newInternalPressures);
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
	public void setInternalPressures(InternalPressuresType newInternalPressures) {
		if (newInternalPressures != internalPressures) {
			NotificationChain msgs = null;
			if (internalPressures != null)
				msgs = ((InternalEObject) internalPressures).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLE_CONFIGURATION_TYPE__INTERNAL_PRESSURES, null,
						msgs);
			if (newInternalPressures != null)
				msgs = ((InternalEObject) newInternalPressures).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.VEHICLE_CONFIGURATION_TYPE__INTERNAL_PRESSURES, null,
						msgs);
			msgs = basicSetInternalPressures(newInternalPressures, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.VEHICLE_CONFIGURATION_TYPE__INTERNAL_PRESSURES, newInternalPressures,
					newInternalPressures));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.VEHICLE_CONFIGURATION_TYPE__UID, oldUID,
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
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__CONTROL_ELEMENTS:
			return basicSetControlElements(null, msgs);
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__INTERNAL_PRESSURES:
			return basicSetInternalPressures(null, msgs);
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
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__NAME:
			return getName();
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__CONTROL_ELEMENTS:
			return getControlElements();
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__INTERNAL_PRESSURES:
			return getInternalPressures();
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__UID:
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
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__CONTROL_ELEMENTS:
			setControlElements((AircraftControlElementsType) newValue);
			return;
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__INTERNAL_PRESSURES:
			setInternalPressures((InternalPressuresType) newValue);
			return;
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__UID:
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
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__CONTROL_ELEMENTS:
			setControlElements((AircraftControlElementsType) null);
			return;
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__INTERNAL_PRESSURES:
			setInternalPressures((InternalPressuresType) null);
			return;
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__UID:
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
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__NAME:
			return name != null;
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__CONTROL_ELEMENTS:
			return controlElements != null;
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__INTERNAL_PRESSURES:
			return internalPressures != null;
		case CpacsPackage.VEHICLE_CONFIGURATION_TYPE__UID:
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

} //VehicleConfigurationTypeImpl
