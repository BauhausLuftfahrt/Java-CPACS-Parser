/**
 */
package Cpacs.impl;

import Cpacs.CenterFuselageHighWingConfigurationType;
import Cpacs.CpacsPackage;
import Cpacs.LandingGearInterfaceDefinitionsType;
import Cpacs.MainStrutInterfaceDefinitionsType;
import Cpacs.WingInterfaceDefinitionsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Center Fuselage High Wing Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CenterFuselageHighWingConfigurationTypeImpl#getWingInterfaceDefinitions <em>Wing Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageHighWingConfigurationTypeImpl#getLandingGearInterfaceDefinitions <em>Landing Gear Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageHighWingConfigurationTypeImpl#getMainStrutInterfaceDefinitions <em>Main Strut Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.impl.CenterFuselageHighWingConfigurationTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CenterFuselageHighWingConfigurationTypeImpl extends ComplexBaseTypeImpl
		implements CenterFuselageHighWingConfigurationType {
	/**
	 * The cached value of the '{@link #getWingInterfaceDefinitions() <em>Wing Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingInterfaceDefinitions()
	 * @generated
	 * @ordered
	 */
	protected WingInterfaceDefinitionsType wingInterfaceDefinitions;

	/**
	 * The cached value of the '{@link #getLandingGearInterfaceDefinitions() <em>Landing Gear Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLandingGearInterfaceDefinitions()
	 * @generated
	 * @ordered
	 */
	protected LandingGearInterfaceDefinitionsType landingGearInterfaceDefinitions;

	/**
	 * The cached value of the '{@link #getMainStrutInterfaceDefinitions() <em>Main Strut Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainStrutInterfaceDefinitions()
	 * @generated
	 * @ordered
	 */
	protected MainStrutInterfaceDefinitionsType mainStrutInterfaceDefinitions;

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
	protected CenterFuselageHighWingConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCenterFuselageHighWingConfigurationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WingInterfaceDefinitionsType getWingInterfaceDefinitions() {
		return wingInterfaceDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingInterfaceDefinitions(WingInterfaceDefinitionsType newWingInterfaceDefinitions,
			NotificationChain msgs) {
		WingInterfaceDefinitionsType oldWingInterfaceDefinitions = wingInterfaceDefinitions;
		wingInterfaceDefinitions = newWingInterfaceDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__WING_INTERFACE_DEFINITIONS,
					oldWingInterfaceDefinitions, newWingInterfaceDefinitions);
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
	public void setWingInterfaceDefinitions(WingInterfaceDefinitionsType newWingInterfaceDefinitions) {
		if (newWingInterfaceDefinitions != wingInterfaceDefinitions) {
			NotificationChain msgs = null;
			if (wingInterfaceDefinitions != null)
				msgs = ((InternalEObject) wingInterfaceDefinitions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__WING_INTERFACE_DEFINITIONS,
						null, msgs);
			if (newWingInterfaceDefinitions != null)
				msgs = ((InternalEObject) newWingInterfaceDefinitions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__WING_INTERFACE_DEFINITIONS,
						null, msgs);
			msgs = basicSetWingInterfaceDefinitions(newWingInterfaceDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__WING_INTERFACE_DEFINITIONS,
					newWingInterfaceDefinitions, newWingInterfaceDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingGearInterfaceDefinitionsType getLandingGearInterfaceDefinitions() {
		return landingGearInterfaceDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingGearInterfaceDefinitions(
			LandingGearInterfaceDefinitionsType newLandingGearInterfaceDefinitions, NotificationChain msgs) {
		LandingGearInterfaceDefinitionsType oldLandingGearInterfaceDefinitions = landingGearInterfaceDefinitions;
		landingGearInterfaceDefinitions = newLandingGearInterfaceDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__LANDING_GEAR_INTERFACE_DEFINITIONS,
					oldLandingGearInterfaceDefinitions, newLandingGearInterfaceDefinitions);
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
	public void setLandingGearInterfaceDefinitions(
			LandingGearInterfaceDefinitionsType newLandingGearInterfaceDefinitions) {
		if (newLandingGearInterfaceDefinitions != landingGearInterfaceDefinitions) {
			NotificationChain msgs = null;
			if (landingGearInterfaceDefinitions != null)
				msgs = ((InternalEObject) landingGearInterfaceDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__LANDING_GEAR_INTERFACE_DEFINITIONS,
						null, msgs);
			if (newLandingGearInterfaceDefinitions != null)
				msgs = ((InternalEObject) newLandingGearInterfaceDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__LANDING_GEAR_INTERFACE_DEFINITIONS,
						null, msgs);
			msgs = basicSetLandingGearInterfaceDefinitions(newLandingGearInterfaceDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__LANDING_GEAR_INTERFACE_DEFINITIONS,
					newLandingGearInterfaceDefinitions, newLandingGearInterfaceDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MainStrutInterfaceDefinitionsType getMainStrutInterfaceDefinitions() {
		return mainStrutInterfaceDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainStrutInterfaceDefinitions(
			MainStrutInterfaceDefinitionsType newMainStrutInterfaceDefinitions, NotificationChain msgs) {
		MainStrutInterfaceDefinitionsType oldMainStrutInterfaceDefinitions = mainStrutInterfaceDefinitions;
		mainStrutInterfaceDefinitions = newMainStrutInterfaceDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__MAIN_STRUT_INTERFACE_DEFINITIONS,
					oldMainStrutInterfaceDefinitions, newMainStrutInterfaceDefinitions);
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
	public void setMainStrutInterfaceDefinitions(MainStrutInterfaceDefinitionsType newMainStrutInterfaceDefinitions) {
		if (newMainStrutInterfaceDefinitions != mainStrutInterfaceDefinitions) {
			NotificationChain msgs = null;
			if (mainStrutInterfaceDefinitions != null)
				msgs = ((InternalEObject) mainStrutInterfaceDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__MAIN_STRUT_INTERFACE_DEFINITIONS,
						null, msgs);
			if (newMainStrutInterfaceDefinitions != null)
				msgs = ((InternalEObject) newMainStrutInterfaceDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__MAIN_STRUT_INTERFACE_DEFINITIONS,
						null, msgs);
			msgs = basicSetMainStrutInterfaceDefinitions(newMainStrutInterfaceDefinitions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__MAIN_STRUT_INTERFACE_DEFINITIONS,
					newMainStrutInterfaceDefinitions, newMainStrutInterfaceDefinitions));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__WING_INTERFACE_DEFINITIONS:
			return basicSetWingInterfaceDefinitions(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__LANDING_GEAR_INTERFACE_DEFINITIONS:
			return basicSetLandingGearInterfaceDefinitions(null, msgs);
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__MAIN_STRUT_INTERFACE_DEFINITIONS:
			return basicSetMainStrutInterfaceDefinitions(null, msgs);
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
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__WING_INTERFACE_DEFINITIONS:
			return getWingInterfaceDefinitions();
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__LANDING_GEAR_INTERFACE_DEFINITIONS:
			return getLandingGearInterfaceDefinitions();
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__MAIN_STRUT_INTERFACE_DEFINITIONS:
			return getMainStrutInterfaceDefinitions();
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__WING_INTERFACE_DEFINITIONS:
			setWingInterfaceDefinitions((WingInterfaceDefinitionsType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__LANDING_GEAR_INTERFACE_DEFINITIONS:
			setLandingGearInterfaceDefinitions((LandingGearInterfaceDefinitionsType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__MAIN_STRUT_INTERFACE_DEFINITIONS:
			setMainStrutInterfaceDefinitions((MainStrutInterfaceDefinitionsType) newValue);
			return;
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__WING_INTERFACE_DEFINITIONS:
			setWingInterfaceDefinitions((WingInterfaceDefinitionsType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__LANDING_GEAR_INTERFACE_DEFINITIONS:
			setLandingGearInterfaceDefinitions((LandingGearInterfaceDefinitionsType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__MAIN_STRUT_INTERFACE_DEFINITIONS:
			setMainStrutInterfaceDefinitions((MainStrutInterfaceDefinitionsType) null);
			return;
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__UID:
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
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__WING_INTERFACE_DEFINITIONS:
			return wingInterfaceDefinitions != null;
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__LANDING_GEAR_INTERFACE_DEFINITIONS:
			return landingGearInterfaceDefinitions != null;
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__MAIN_STRUT_INTERFACE_DEFINITIONS:
			return mainStrutInterfaceDefinitions != null;
		case CpacsPackage.CENTER_FUSELAGE_HIGH_WING_CONFIGURATION_TYPE__UID:
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

} //CenterFuselageHighWingConfigurationTypeImpl
