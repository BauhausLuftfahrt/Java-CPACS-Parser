/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericMassType;
import Cpacs.MMoveableTrailingEdgeType;
import Cpacs.MSpoilersType;
import Cpacs.MTrailingEdgeDevicesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMoveable Trailing Edge Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.MMoveableTrailingEdgeTypeImpl#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.impl.MMoveableTrailingEdgeTypeImpl#getMSpoilers <em>MSpoilers</em>}</li>
 *   <li>{@link Cpacs.impl.MMoveableTrailingEdgeTypeImpl#getMTrailingEdgeDevices <em>MTrailing Edge Devices</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMoveableTrailingEdgeTypeImpl extends ComplexBaseTypeImpl implements MMoveableTrailingEdgeType {
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
	 * The cached value of the '{@link #getMSpoilers() <em>MSpoilers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSpoilers()
	 * @generated
	 * @ordered
	 */
	protected MSpoilersType mSpoilers;

	/**
	 * The cached value of the '{@link #getMTrailingEdgeDevices() <em>MTrailing Edge Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTrailingEdgeDevices()
	 * @generated
	 * @ordered
	 */
	protected MTrailingEdgeDevicesType mTrailingEdgeDevices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMoveableTrailingEdgeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getMMoveableTrailingEdgeType();
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
					CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MASS_DESCRIPTION, oldMassDescription,
					newMassDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MASS_DESCRIPTION, null,
						msgs);
			if (newMassDescription != null)
				msgs = ((InternalEObject) newMassDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MASS_DESCRIPTION, null,
						msgs);
			msgs = basicSetMassDescription(newMassDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MASS_DESCRIPTION, newMassDescription,
					newMassDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MSpoilersType getMSpoilers() {
		return mSpoilers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSpoilers(MSpoilersType newMSpoilers, NotificationChain msgs) {
		MSpoilersType oldMSpoilers = mSpoilers;
		mSpoilers = newMSpoilers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MSPOILERS, oldMSpoilers, newMSpoilers);
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
	public void setMSpoilers(MSpoilersType newMSpoilers) {
		if (newMSpoilers != mSpoilers) {
			NotificationChain msgs = null;
			if (mSpoilers != null)
				msgs = ((InternalEObject) mSpoilers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MSPOILERS, null, msgs);
			if (newMSpoilers != null)
				msgs = ((InternalEObject) newMSpoilers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MSPOILERS, null, msgs);
			msgs = basicSetMSpoilers(newMSpoilers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MSPOILERS,
					newMSpoilers, newMSpoilers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MTrailingEdgeDevicesType getMTrailingEdgeDevices() {
		return mTrailingEdgeDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMTrailingEdgeDevices(MTrailingEdgeDevicesType newMTrailingEdgeDevices,
			NotificationChain msgs) {
		MTrailingEdgeDevicesType oldMTrailingEdgeDevices = mTrailingEdgeDevices;
		mTrailingEdgeDevices = newMTrailingEdgeDevices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MTRAILING_EDGE_DEVICES, oldMTrailingEdgeDevices,
					newMTrailingEdgeDevices);
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
	public void setMTrailingEdgeDevices(MTrailingEdgeDevicesType newMTrailingEdgeDevices) {
		if (newMTrailingEdgeDevices != mTrailingEdgeDevices) {
			NotificationChain msgs = null;
			if (mTrailingEdgeDevices != null)
				msgs = ((InternalEObject) mTrailingEdgeDevices).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MTRAILING_EDGE_DEVICES,
						null, msgs);
			if (newMTrailingEdgeDevices != null)
				msgs = ((InternalEObject) newMTrailingEdgeDevices).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MTRAILING_EDGE_DEVICES,
						null, msgs);
			msgs = basicSetMTrailingEdgeDevices(newMTrailingEdgeDevices, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MTRAILING_EDGE_DEVICES, newMTrailingEdgeDevices,
					newMTrailingEdgeDevices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MASS_DESCRIPTION:
			return basicSetMassDescription(null, msgs);
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MSPOILERS:
			return basicSetMSpoilers(null, msgs);
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MTRAILING_EDGE_DEVICES:
			return basicSetMTrailingEdgeDevices(null, msgs);
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
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MASS_DESCRIPTION:
			return getMassDescription();
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MSPOILERS:
			return getMSpoilers();
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MTRAILING_EDGE_DEVICES:
			return getMTrailingEdgeDevices();
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
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) newValue);
			return;
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MSPOILERS:
			setMSpoilers((MSpoilersType) newValue);
			return;
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MTRAILING_EDGE_DEVICES:
			setMTrailingEdgeDevices((MTrailingEdgeDevicesType) newValue);
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
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MASS_DESCRIPTION:
			setMassDescription((GenericMassType) null);
			return;
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MSPOILERS:
			setMSpoilers((MSpoilersType) null);
			return;
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MTRAILING_EDGE_DEVICES:
			setMTrailingEdgeDevices((MTrailingEdgeDevicesType) null);
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
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MASS_DESCRIPTION:
			return massDescription != null;
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MSPOILERS:
			return mSpoilers != null;
		case CpacsPackage.MMOVEABLE_TRAILING_EDGE_TYPE__MTRAILING_EDGE_DEVICES:
			return mTrailingEdgeDevices != null;
		}
		return super.eIsSet(featureID);
	}

} //MMoveableTrailingEdgeTypeImpl
