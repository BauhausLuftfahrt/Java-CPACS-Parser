/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MTrailingEdgeDeviceType;
import Cpacs.MTrailingEdgeDevicesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MTrailing Edge Devices Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MTrailingEdgeDevicesTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MTrailingEdgeDevicesTypeImpl#getMTrailingEdgeDevice <em>MTrailing Edge Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MTrailingEdgeDevicesTypeImpl extends ComplexBaseTypeImpl implements MTrailingEdgeDevicesType {
	/**
	 * The cached value of the '{@link #getMassDescription() <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDescription()
	 * @generated
	 * @ordered
	 */
	protected GenericMassType massDescription;

	/**
	 * The cached value of the '{@link #getMTrailingEdgeDevice() <em>MTrailing Edge Device</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTrailingEdgeDevice()
	 * @generated
	 * @ordered
	 */
	protected EList<MTrailingEdgeDeviceType> mTrailingEdgeDevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTrailingEdgeDevicesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMTrailingEdgeDevicesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMassType getMassDescription() {
		return massDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassDescription(GenericMassType newMassDescription, NotificationChain msgs) {
		GenericMassType oldMassDescription = massDescription;
		massDescription = newMassDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MASS_DESCRIPTION, oldMassDescription, newMassDescription);
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
	public void setMassDescription(GenericMassType newMassDescription) {
		if (newMassDescription != massDescription) {
			NotificationChain msgs = null;
			if (massDescription != null)
				msgs = ((InternalEObject) massDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MASS_DESCRIPTION, null,
						msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MASS_DESCRIPTION, null,
						msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MASS_DESCRIPTION, newMassDescription,
					newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MTrailingEdgeDeviceType> getMTrailingEdgeDevice() {
		if (mTrailingEdgeDevice == null) {
			mTrailingEdgeDevice = new EObjectContainmentEList<MTrailingEdgeDeviceType>(MTrailingEdgeDeviceType.class,
					this, CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MTRAILING_EDGE_DEVICE);
		}
		return mTrailingEdgeDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MTRAILING_EDGE_DEVICE:
			return ((InternalEList<?>) getMTrailingEdgeDevice()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MTRAILING_EDGE_DEVICE:
			return getMTrailingEdgeDevice();
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
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MTRAILING_EDGE_DEVICE:
			getMTrailingEdgeDevice().clear();
			getMTrailingEdgeDevice().addAll((Collection<? extends MTrailingEdgeDeviceType>) newValue);
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
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MTRAILING_EDGE_DEVICE:
			getMTrailingEdgeDevice().clear();
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
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MTRAILING_EDGE_DEVICES_TYPE__MTRAILING_EDGE_DEVICE:
			return mTrailingEdgeDevice != null && !mTrailingEdgeDevice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MTrailingEdgeDevicesTypeImpl
