/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PerformanceRequirementConfigurationsType;
import Cpacs.SpecificConfigurationUIDsType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Requirement Configurations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PerformanceRequirementConfigurationsTypeImpl#getDefaultConfigurationUID <em>Default Configuration UID</em>}</li>
 *   <li>{@link Cpacs.impl.PerformanceRequirementConfigurationsTypeImpl#getSpecificConfigurationUIDs <em>Specific Configuration UI Ds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceRequirementConfigurationsTypeImpl extends ComplexBaseTypeImpl
		implements PerformanceRequirementConfigurationsType {
	/**
	 * The cached value of the '{@link #getDefaultConfigurationUID() <em>Default Configuration UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultConfigurationUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType defaultConfigurationUID;

	/**
	 * The cached value of the '{@link #getSpecificConfigurationUIDs() <em>Specific Configuration UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificConfigurationUIDs()
	 * @generated
	 * @ordered
	 */
	protected SpecificConfigurationUIDsType specificConfigurationUIDs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceRequirementConfigurationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPerformanceRequirementConfigurationsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getDefaultConfigurationUID() {
		return defaultConfigurationUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultConfigurationUID(StringUIDBaseType newDefaultConfigurationUID,
			NotificationChain msgs) {
		StringUIDBaseType oldDefaultConfigurationUID = defaultConfigurationUID;
		defaultConfigurationUID = newDefaultConfigurationUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__DEFAULT_CONFIGURATION_UID,
					oldDefaultConfigurationUID, newDefaultConfigurationUID);
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
	public void setDefaultConfigurationUID(StringUIDBaseType newDefaultConfigurationUID) {
		if (newDefaultConfigurationUID != defaultConfigurationUID) {
			NotificationChain msgs = null;
			if (defaultConfigurationUID != null)
				msgs = ((InternalEObject) defaultConfigurationUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__DEFAULT_CONFIGURATION_UID,
						null, msgs);
			if (newDefaultConfigurationUID != null)
				msgs = ((InternalEObject) newDefaultConfigurationUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__DEFAULT_CONFIGURATION_UID,
						null, msgs);
			msgs = basicSetDefaultConfigurationUID(newDefaultConfigurationUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__DEFAULT_CONFIGURATION_UID,
					newDefaultConfigurationUID, newDefaultConfigurationUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecificConfigurationUIDsType getSpecificConfigurationUIDs() {
		return specificConfigurationUIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificConfigurationUIDs(
			SpecificConfigurationUIDsType newSpecificConfigurationUIDs, NotificationChain msgs) {
		SpecificConfigurationUIDsType oldSpecificConfigurationUIDs = specificConfigurationUIDs;
		specificConfigurationUIDs = newSpecificConfigurationUIDs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__SPECIFIC_CONFIGURATION_UI_DS,
					oldSpecificConfigurationUIDs, newSpecificConfigurationUIDs);
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
	public void setSpecificConfigurationUIDs(SpecificConfigurationUIDsType newSpecificConfigurationUIDs) {
		if (newSpecificConfigurationUIDs != specificConfigurationUIDs) {
			NotificationChain msgs = null;
			if (specificConfigurationUIDs != null)
				msgs = ((InternalEObject) specificConfigurationUIDs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__SPECIFIC_CONFIGURATION_UI_DS, null,
						msgs);
			if (newSpecificConfigurationUIDs != null)
				msgs = ((InternalEObject) newSpecificConfigurationUIDs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__SPECIFIC_CONFIGURATION_UI_DS, null,
						msgs);
			msgs = basicSetSpecificConfigurationUIDs(newSpecificConfigurationUIDs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__SPECIFIC_CONFIGURATION_UI_DS,
					newSpecificConfigurationUIDs, newSpecificConfigurationUIDs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__DEFAULT_CONFIGURATION_UID:
			return basicSetDefaultConfigurationUID(null, msgs);
		case CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__SPECIFIC_CONFIGURATION_UI_DS:
			return basicSetSpecificConfigurationUIDs(null, msgs);
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
		case CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__DEFAULT_CONFIGURATION_UID:
			return getDefaultConfigurationUID();
		case CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__SPECIFIC_CONFIGURATION_UI_DS:
			return getSpecificConfigurationUIDs();
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
		case CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__DEFAULT_CONFIGURATION_UID:
			setDefaultConfigurationUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__SPECIFIC_CONFIGURATION_UI_DS:
			setSpecificConfigurationUIDs((SpecificConfigurationUIDsType) newValue);
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
		case CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__DEFAULT_CONFIGURATION_UID:
			setDefaultConfigurationUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__SPECIFIC_CONFIGURATION_UI_DS:
			setSpecificConfigurationUIDs((SpecificConfigurationUIDsType) null);
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
		case CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__DEFAULT_CONFIGURATION_UID:
			return defaultConfigurationUID != null;
		case CpacsPackage.PERFORMANCE_REQUIREMENT_CONFIGURATIONS_TYPE__SPECIFIC_CONFIGURATION_UI_DS:
			return specificConfigurationUIDs != null;
		}
		return super.eIsSet(featureID);
	}

} //PerformanceRequirementConfigurationsTypeImpl
