/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.VehicleConfigurationType;
import Cpacs.VehicleConfigurationsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Configurations Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.VehicleConfigurationsTypeImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleConfigurationsTypeImpl extends ComplexBaseTypeImpl implements VehicleConfigurationsType {
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleConfigurationType> configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleConfigurationsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getVehicleConfigurationsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VehicleConfigurationType> getConfiguration() {
		if (configuration == null) {
			configuration = new EObjectContainmentEList<VehicleConfigurationType>(VehicleConfigurationType.class, this,
					CpacsPackage.VEHICLE_CONFIGURATIONS_TYPE__CONFIGURATION);
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.VEHICLE_CONFIGURATIONS_TYPE__CONFIGURATION:
			return ((InternalEList<?>) getConfiguration()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.VEHICLE_CONFIGURATIONS_TYPE__CONFIGURATION:
			return getConfiguration();
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
		case CpacsPackage.VEHICLE_CONFIGURATIONS_TYPE__CONFIGURATION:
			getConfiguration().clear();
			getConfiguration().addAll((Collection<? extends VehicleConfigurationType>) newValue);
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
		case CpacsPackage.VEHICLE_CONFIGURATIONS_TYPE__CONFIGURATION:
			getConfiguration().clear();
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
		case CpacsPackage.VEHICLE_CONFIGURATIONS_TYPE__CONFIGURATION:
			return configuration != null && !configuration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VehicleConfigurationsTypeImpl
