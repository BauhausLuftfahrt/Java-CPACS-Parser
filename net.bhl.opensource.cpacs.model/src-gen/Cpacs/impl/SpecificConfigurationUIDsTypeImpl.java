/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SpecificConfigurationUIDType;
import Cpacs.SpecificConfigurationUIDsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Configuration UI Ds Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SpecificConfigurationUIDsTypeImpl#getSpecificConfigurationsUID <em>Specific Configurations UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificConfigurationUIDsTypeImpl extends ComplexBaseTypeImpl implements SpecificConfigurationUIDsType {
	/**
	 * The cached value of the '{@link #getSpecificConfigurationsUID() <em>Specific Configurations UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificConfigurationsUID()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificConfigurationUIDType> specificConfigurationsUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificConfigurationUIDsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSpecificConfigurationUIDsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecificConfigurationUIDType> getSpecificConfigurationsUID() {
		if (specificConfigurationsUID == null) {
			specificConfigurationsUID = new EObjectContainmentEList<SpecificConfigurationUIDType>(
					SpecificConfigurationUIDType.class, this,
					CpacsPackage.SPECIFIC_CONFIGURATION_UI_DS_TYPE__SPECIFIC_CONFIGURATIONS_UID);
		}
		return specificConfigurationsUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPECIFIC_CONFIGURATION_UI_DS_TYPE__SPECIFIC_CONFIGURATIONS_UID:
			return ((InternalEList<?>) getSpecificConfigurationsUID()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SPECIFIC_CONFIGURATION_UI_DS_TYPE__SPECIFIC_CONFIGURATIONS_UID:
			return getSpecificConfigurationsUID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.SPECIFIC_CONFIGURATION_UI_DS_TYPE__SPECIFIC_CONFIGURATIONS_UID:
			getSpecificConfigurationsUID().clear();
			getSpecificConfigurationsUID().addAll((Collection<? extends SpecificConfigurationUIDType>) newValue);
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
		case CpacsPackage.SPECIFIC_CONFIGURATION_UI_DS_TYPE__SPECIFIC_CONFIGURATIONS_UID:
			getSpecificConfigurationsUID().clear();
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
		case CpacsPackage.SPECIFIC_CONFIGURATION_UI_DS_TYPE__SPECIFIC_CONFIGURATIONS_UID:
			return specificConfigurationsUID != null && !specificConfigurationsUID.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificConfigurationUIDsTypeImpl
