/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LeadingEdgeDeviceType;
import Cpacs.LeadingEdgeDevicesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leading Edge Devices Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LeadingEdgeDevicesTypeImpl#getLeadingEdgeDevice <em>Leading Edge Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeadingEdgeDevicesTypeImpl extends ComplexBaseTypeImpl implements LeadingEdgeDevicesType {
	/**
	 * The cached value of the '{@link #getLeadingEdgeDevice() <em>Leading Edge Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadingEdgeDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<LeadingEdgeDeviceType> leadingEdgeDevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeadingEdgeDevicesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLeadingEdgeDevicesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LeadingEdgeDeviceType> getLeadingEdgeDevice() {
		if (leadingEdgeDevice == null) {
			leadingEdgeDevice = new EObjectContainmentEList<LeadingEdgeDeviceType>(LeadingEdgeDeviceType.class, this,
					CpacsPackage.LEADING_EDGE_DEVICES_TYPE__LEADING_EDGE_DEVICE);
		}
		return leadingEdgeDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LEADING_EDGE_DEVICES_TYPE__LEADING_EDGE_DEVICE:
			return ((InternalEList<?>) getLeadingEdgeDevice()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LEADING_EDGE_DEVICES_TYPE__LEADING_EDGE_DEVICE:
			return getLeadingEdgeDevice();
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
		case CpacsPackage.LEADING_EDGE_DEVICES_TYPE__LEADING_EDGE_DEVICE:
			getLeadingEdgeDevice().clear();
			getLeadingEdgeDevice().addAll((Collection<? extends LeadingEdgeDeviceType>) newValue);
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
		case CpacsPackage.LEADING_EDGE_DEVICES_TYPE__LEADING_EDGE_DEVICE:
			getLeadingEdgeDevice().clear();
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
		case CpacsPackage.LEADING_EDGE_DEVICES_TYPE__LEADING_EDGE_DEVICE:
			return leadingEdgeDevice != null && !leadingEdgeDevice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LeadingEdgeDevicesTypeImpl
