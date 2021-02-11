/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PayloadGlobalType;
import Cpacs.RequirementType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payload Global Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PayloadGlobalTypeImpl#getPaxSeats <em>Pax Seats</em>}</li>
 *   <li>{@link Cpacs.impl.PayloadGlobalTypeImpl#getCargoCapacity <em>Cargo Capacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PayloadGlobalTypeImpl extends ComplexBaseTypeImpl implements PayloadGlobalType {
	/**
	 * The cached value of the '{@link #getPaxSeats() <em>Pax Seats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaxSeats()
	 * @generated
	 * @ordered
	 */
	protected RequirementType paxSeats;

	/**
	 * The cached value of the '{@link #getCargoCapacity() <em>Cargo Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCargoCapacity()
	 * @generated
	 * @ordered
	 */
	protected RequirementType cargoCapacity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayloadGlobalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPayloadGlobalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getPaxSeats() {
		return paxSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaxSeats(RequirementType newPaxSeats, NotificationChain msgs) {
		RequirementType oldPaxSeats = paxSeats;
		paxSeats = newPaxSeats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PAYLOAD_GLOBAL_TYPE__PAX_SEATS, oldPaxSeats, newPaxSeats);
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
	public void setPaxSeats(RequirementType newPaxSeats) {
		if (newPaxSeats != paxSeats) {
			NotificationChain msgs = null;
			if (paxSeats != null)
				msgs = ((InternalEObject) paxSeats).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PAYLOAD_GLOBAL_TYPE__PAX_SEATS, null, msgs);
			if (newPaxSeats != null)
				msgs = ((InternalEObject) newPaxSeats).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PAYLOAD_GLOBAL_TYPE__PAX_SEATS, null, msgs);
			msgs = basicSetPaxSeats(newPaxSeats, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PAYLOAD_GLOBAL_TYPE__PAX_SEATS,
					newPaxSeats, newPaxSeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType getCargoCapacity() {
		return cargoCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCargoCapacity(RequirementType newCargoCapacity, NotificationChain msgs) {
		RequirementType oldCargoCapacity = cargoCapacity;
		cargoCapacity = newCargoCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PAYLOAD_GLOBAL_TYPE__CARGO_CAPACITY, oldCargoCapacity, newCargoCapacity);
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
	public void setCargoCapacity(RequirementType newCargoCapacity) {
		if (newCargoCapacity != cargoCapacity) {
			NotificationChain msgs = null;
			if (cargoCapacity != null)
				msgs = ((InternalEObject) cargoCapacity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PAYLOAD_GLOBAL_TYPE__CARGO_CAPACITY, null, msgs);
			if (newCargoCapacity != null)
				msgs = ((InternalEObject) newCargoCapacity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PAYLOAD_GLOBAL_TYPE__CARGO_CAPACITY, null, msgs);
			msgs = basicSetCargoCapacity(newCargoCapacity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PAYLOAD_GLOBAL_TYPE__CARGO_CAPACITY,
					newCargoCapacity, newCargoCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE__PAX_SEATS:
			return basicSetPaxSeats(null, msgs);
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE__CARGO_CAPACITY:
			return basicSetCargoCapacity(null, msgs);
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
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE__PAX_SEATS:
			return getPaxSeats();
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE__CARGO_CAPACITY:
			return getCargoCapacity();
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
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE__PAX_SEATS:
			setPaxSeats((RequirementType) newValue);
			return;
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE__CARGO_CAPACITY:
			setCargoCapacity((RequirementType) newValue);
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
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE__PAX_SEATS:
			setPaxSeats((RequirementType) null);
			return;
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE__CARGO_CAPACITY:
			setCargoCapacity((RequirementType) null);
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
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE__PAX_SEATS:
			return paxSeats != null;
		case CpacsPackage.PAYLOAD_GLOBAL_TYPE__CARGO_CAPACITY:
			return cargoCapacity != null;
		}
		return super.eIsSet(featureID);
	}

} //PayloadGlobalTypeImpl
