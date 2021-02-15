/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.TrailingEdgeDeviceType;
import Cpacs.TrailingEdgeDevicesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trailing Edge Devices Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrailingEdgeDevicesTypeImpl#getTrailingEdgeDevice <em>Trailing Edge Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrailingEdgeDevicesTypeImpl extends ComplexBaseTypeImpl implements TrailingEdgeDevicesType {
	/**
	 * The cached value of the '{@link #getTrailingEdgeDevice() <em>Trailing Edge Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrailingEdgeDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<TrailingEdgeDeviceType> trailingEdgeDevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrailingEdgeDevicesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrailingEdgeDevicesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrailingEdgeDeviceType> getTrailingEdgeDevice() {
		if (trailingEdgeDevice == null) {
			trailingEdgeDevice = new EObjectContainmentEList<TrailingEdgeDeviceType>(TrailingEdgeDeviceType.class, this,
					CpacsPackage.TRAILING_EDGE_DEVICES_TYPE__TRAILING_EDGE_DEVICE);
		}
		return trailingEdgeDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRAILING_EDGE_DEVICES_TYPE__TRAILING_EDGE_DEVICE:
			return ((InternalEList<?>) getTrailingEdgeDevice()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.TRAILING_EDGE_DEVICES_TYPE__TRAILING_EDGE_DEVICE:
			return getTrailingEdgeDevice();
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
		case CpacsPackage.TRAILING_EDGE_DEVICES_TYPE__TRAILING_EDGE_DEVICE:
			getTrailingEdgeDevice().clear();
			getTrailingEdgeDevice().addAll((Collection<? extends TrailingEdgeDeviceType>) newValue);
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
		case CpacsPackage.TRAILING_EDGE_DEVICES_TYPE__TRAILING_EDGE_DEVICE:
			getTrailingEdgeDevice().clear();
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
		case CpacsPackage.TRAILING_EDGE_DEVICES_TYPE__TRAILING_EDGE_DEVICE:
			return trailingEdgeDevice != null && !trailingEdgeDevice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrailingEdgeDevicesTypeImpl
