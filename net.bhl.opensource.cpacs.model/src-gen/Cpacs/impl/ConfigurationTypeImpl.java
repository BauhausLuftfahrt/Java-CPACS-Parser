/**
 */
package Cpacs.impl;

import Cpacs.AircraftControlElementsType;
import Cpacs.ConfigurationType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ConfigurationTypeImpl#getConfigurationUID <em>Configuration UID</em>}</li>
 *   <li>{@link Cpacs.impl.ConfigurationTypeImpl#getControlElements <em>Control Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationTypeImpl extends ComplexBaseTypeImpl implements ConfigurationType {
	/**
	 * The cached value of the '{@link #getConfigurationUID() <em>Configuration UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType configurationUID;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getConfigurationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getConfigurationUID() {
		return configurationUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationUID(StringUIDBaseType newConfigurationUID, NotificationChain msgs) {
		StringUIDBaseType oldConfigurationUID = configurationUID;
		configurationUID = newConfigurationUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONFIGURATION_TYPE__CONFIGURATION_UID, oldConfigurationUID, newConfigurationUID);
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
	public void setConfigurationUID(StringUIDBaseType newConfigurationUID) {
		if (newConfigurationUID != configurationUID) {
			NotificationChain msgs = null;
			if (configurationUID != null)
				msgs = ((InternalEObject) configurationUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONFIGURATION_TYPE__CONFIGURATION_UID, null, msgs);
			if (newConfigurationUID != null)
				msgs = ((InternalEObject) newConfigurationUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONFIGURATION_TYPE__CONFIGURATION_UID, null, msgs);
			msgs = basicSetConfigurationUID(newConfigurationUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONFIGURATION_TYPE__CONFIGURATION_UID,
					newConfigurationUID, newConfigurationUID));
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
					CpacsPackage.CONFIGURATION_TYPE__CONTROL_ELEMENTS, oldControlElements, newControlElements);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONFIGURATION_TYPE__CONTROL_ELEMENTS, null, msgs);
			if (newControlElements != null)
				msgs = ((InternalEObject) newControlElements).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONFIGURATION_TYPE__CONTROL_ELEMENTS, null, msgs);
			msgs = basicSetControlElements(newControlElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONFIGURATION_TYPE__CONTROL_ELEMENTS,
					newControlElements, newControlElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONFIGURATION_TYPE__CONFIGURATION_UID:
			return basicSetConfigurationUID(null, msgs);
		case CpacsPackage.CONFIGURATION_TYPE__CONTROL_ELEMENTS:
			return basicSetControlElements(null, msgs);
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
		case CpacsPackage.CONFIGURATION_TYPE__CONFIGURATION_UID:
			return getConfigurationUID();
		case CpacsPackage.CONFIGURATION_TYPE__CONTROL_ELEMENTS:
			return getControlElements();
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
		case CpacsPackage.CONFIGURATION_TYPE__CONFIGURATION_UID:
			setConfigurationUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONFIGURATION_TYPE__CONTROL_ELEMENTS:
			setControlElements((AircraftControlElementsType) newValue);
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
		case CpacsPackage.CONFIGURATION_TYPE__CONFIGURATION_UID:
			setConfigurationUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONFIGURATION_TYPE__CONTROL_ELEMENTS:
			setControlElements((AircraftControlElementsType) null);
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
		case CpacsPackage.CONFIGURATION_TYPE__CONFIGURATION_UID:
			return configurationUID != null;
		case CpacsPackage.CONFIGURATION_TYPE__CONTROL_ELEMENTS:
			return controlElements != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationTypeImpl
