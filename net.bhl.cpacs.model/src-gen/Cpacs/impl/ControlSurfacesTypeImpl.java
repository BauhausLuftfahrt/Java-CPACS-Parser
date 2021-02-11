/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfacesType;
import Cpacs.CpacsPackage;
import Cpacs.LeadingEdgeDevicesType;
import Cpacs.SpoilersType;
import Cpacs.TrailingEdgeDevicesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Surfaces Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfacesTypeImpl#getLeadingEdgeDevices <em>Leading Edge Devices</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfacesTypeImpl#getTrailingEdgeDevices <em>Trailing Edge Devices</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfacesTypeImpl#getSpoilers <em>Spoilers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfacesTypeImpl extends ComplexBaseTypeImpl implements ControlSurfacesType {
	/**
	 * The cached value of the '{@link #getLeadingEdgeDevices() <em>Leading Edge Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeadingEdgeDevices()
	 * @generated
	 * @ordered
	 */
	protected LeadingEdgeDevicesType leadingEdgeDevices;

	/**
	 * The cached value of the '{@link #getTrailingEdgeDevices() <em>Trailing Edge Devices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrailingEdgeDevices()
	 * @generated
	 * @ordered
	 */
	protected TrailingEdgeDevicesType trailingEdgeDevices;

	/**
	 * The cached value of the '{@link #getSpoilers() <em>Spoilers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpoilers()
	 * @generated
	 * @ordered
	 */
	protected SpoilersType spoilers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfacesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfacesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LeadingEdgeDevicesType getLeadingEdgeDevices() {
		return leadingEdgeDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeadingEdgeDevices(LeadingEdgeDevicesType newLeadingEdgeDevices,
			NotificationChain msgs) {
		LeadingEdgeDevicesType oldLeadingEdgeDevices = leadingEdgeDevices;
		leadingEdgeDevices = newLeadingEdgeDevices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACES_TYPE__LEADING_EDGE_DEVICES, oldLeadingEdgeDevices,
					newLeadingEdgeDevices);
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
	public void setLeadingEdgeDevices(LeadingEdgeDevicesType newLeadingEdgeDevices) {
		if (newLeadingEdgeDevices != leadingEdgeDevices) {
			NotificationChain msgs = null;
			if (leadingEdgeDevices != null)
				msgs = ((InternalEObject) leadingEdgeDevices).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACES_TYPE__LEADING_EDGE_DEVICES, null, msgs);
			if (newLeadingEdgeDevices != null)
				msgs = ((InternalEObject) newLeadingEdgeDevices).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACES_TYPE__LEADING_EDGE_DEVICES, null, msgs);
			msgs = basicSetLeadingEdgeDevices(newLeadingEdgeDevices, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACES_TYPE__LEADING_EDGE_DEVICES, newLeadingEdgeDevices,
					newLeadingEdgeDevices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrailingEdgeDevicesType getTrailingEdgeDevices() {
		return trailingEdgeDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrailingEdgeDevices(TrailingEdgeDevicesType newTrailingEdgeDevices,
			NotificationChain msgs) {
		TrailingEdgeDevicesType oldTrailingEdgeDevices = trailingEdgeDevices;
		trailingEdgeDevices = newTrailingEdgeDevices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACES_TYPE__TRAILING_EDGE_DEVICES, oldTrailingEdgeDevices,
					newTrailingEdgeDevices);
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
	public void setTrailingEdgeDevices(TrailingEdgeDevicesType newTrailingEdgeDevices) {
		if (newTrailingEdgeDevices != trailingEdgeDevices) {
			NotificationChain msgs = null;
			if (trailingEdgeDevices != null)
				msgs = ((InternalEObject) trailingEdgeDevices).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACES_TYPE__TRAILING_EDGE_DEVICES, null, msgs);
			if (newTrailingEdgeDevices != null)
				msgs = ((InternalEObject) newTrailingEdgeDevices).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACES_TYPE__TRAILING_EDGE_DEVICES, null, msgs);
			msgs = basicSetTrailingEdgeDevices(newTrailingEdgeDevices, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACES_TYPE__TRAILING_EDGE_DEVICES, newTrailingEdgeDevices,
					newTrailingEdgeDevices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpoilersType getSpoilers() {
		return spoilers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpoilers(SpoilersType newSpoilers, NotificationChain msgs) {
		SpoilersType oldSpoilers = spoilers;
		spoilers = newSpoilers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACES_TYPE__SPOILERS, oldSpoilers, newSpoilers);
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
	public void setSpoilers(SpoilersType newSpoilers) {
		if (newSpoilers != spoilers) {
			NotificationChain msgs = null;
			if (spoilers != null)
				msgs = ((InternalEObject) spoilers).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACES_TYPE__SPOILERS, null, msgs);
			if (newSpoilers != null)
				msgs = ((InternalEObject) newSpoilers).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACES_TYPE__SPOILERS, null, msgs);
			msgs = basicSetSpoilers(newSpoilers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_SURFACES_TYPE__SPOILERS,
					newSpoilers, newSpoilers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACES_TYPE__LEADING_EDGE_DEVICES:
			return basicSetLeadingEdgeDevices(null, msgs);
		case CpacsPackage.CONTROL_SURFACES_TYPE__TRAILING_EDGE_DEVICES:
			return basicSetTrailingEdgeDevices(null, msgs);
		case CpacsPackage.CONTROL_SURFACES_TYPE__SPOILERS:
			return basicSetSpoilers(null, msgs);
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
		case CpacsPackage.CONTROL_SURFACES_TYPE__LEADING_EDGE_DEVICES:
			return getLeadingEdgeDevices();
		case CpacsPackage.CONTROL_SURFACES_TYPE__TRAILING_EDGE_DEVICES:
			return getTrailingEdgeDevices();
		case CpacsPackage.CONTROL_SURFACES_TYPE__SPOILERS:
			return getSpoilers();
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
		case CpacsPackage.CONTROL_SURFACES_TYPE__LEADING_EDGE_DEVICES:
			setLeadingEdgeDevices((LeadingEdgeDevicesType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACES_TYPE__TRAILING_EDGE_DEVICES:
			setTrailingEdgeDevices((TrailingEdgeDevicesType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACES_TYPE__SPOILERS:
			setSpoilers((SpoilersType) newValue);
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
		case CpacsPackage.CONTROL_SURFACES_TYPE__LEADING_EDGE_DEVICES:
			setLeadingEdgeDevices((LeadingEdgeDevicesType) null);
			return;
		case CpacsPackage.CONTROL_SURFACES_TYPE__TRAILING_EDGE_DEVICES:
			setTrailingEdgeDevices((TrailingEdgeDevicesType) null);
			return;
		case CpacsPackage.CONTROL_SURFACES_TYPE__SPOILERS:
			setSpoilers((SpoilersType) null);
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
		case CpacsPackage.CONTROL_SURFACES_TYPE__LEADING_EDGE_DEVICES:
			return leadingEdgeDevices != null;
		case CpacsPackage.CONTROL_SURFACES_TYPE__TRAILING_EDGE_DEVICES:
			return trailingEdgeDevices != null;
		case CpacsPackage.CONTROL_SURFACES_TYPE__SPOILERS:
			return spoilers != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfacesTypeImpl
