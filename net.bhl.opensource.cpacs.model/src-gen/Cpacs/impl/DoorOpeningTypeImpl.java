/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoorOpeningLegacyType;
import Cpacs.DoorOpeningType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door Opening Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DoorOpeningTypeImpl#getCutOutUID <em>Cut Out UID</em>}</li>
 *   <li>{@link Cpacs.impl.DoorOpeningTypeImpl#getDoorOpeningLegacy <em>Door Opening Legacy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoorOpeningTypeImpl extends ComplexBaseTypeImpl implements DoorOpeningType {
	/**
	 * The cached value of the '{@link #getCutOutUID() <em>Cut Out UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCutOutUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType cutOutUID;

	/**
	 * The cached value of the '{@link #getDoorOpeningLegacy() <em>Door Opening Legacy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorOpeningLegacy()
	 * @generated
	 * @ordered
	 */
	protected DoorOpeningLegacyType doorOpeningLegacy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoorOpeningTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDoorOpeningType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getCutOutUID() {
		return cutOutUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCutOutUID(StringUIDBaseType newCutOutUID, NotificationChain msgs) {
		StringUIDBaseType oldCutOutUID = cutOutUID;
		cutOutUID = newCutOutUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_OPENING_TYPE__CUT_OUT_UID, oldCutOutUID, newCutOutUID);
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
	public void setCutOutUID(StringUIDBaseType newCutOutUID) {
		if (newCutOutUID != cutOutUID) {
			NotificationChain msgs = null;
			if (cutOutUID != null)
				msgs = ((InternalEObject) cutOutUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_TYPE__CUT_OUT_UID, null, msgs);
			if (newCutOutUID != null)
				msgs = ((InternalEObject) newCutOutUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_TYPE__CUT_OUT_UID, null, msgs);
			msgs = basicSetCutOutUID(newCutOutUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_OPENING_TYPE__CUT_OUT_UID,
					newCutOutUID, newCutOutUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorOpeningLegacyType getDoorOpeningLegacy() {
		return doorOpeningLegacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoorOpeningLegacy(DoorOpeningLegacyType newDoorOpeningLegacy,
			NotificationChain msgs) {
		DoorOpeningLegacyType oldDoorOpeningLegacy = doorOpeningLegacy;
		doorOpeningLegacy = newDoorOpeningLegacy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_OPENING_TYPE__DOOR_OPENING_LEGACY, oldDoorOpeningLegacy, newDoorOpeningLegacy);
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
	public void setDoorOpeningLegacy(DoorOpeningLegacyType newDoorOpeningLegacy) {
		if (newDoorOpeningLegacy != doorOpeningLegacy) {
			NotificationChain msgs = null;
			if (doorOpeningLegacy != null)
				msgs = ((InternalEObject) doorOpeningLegacy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_TYPE__DOOR_OPENING_LEGACY, null, msgs);
			if (newDoorOpeningLegacy != null)
				msgs = ((InternalEObject) newDoorOpeningLegacy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_OPENING_TYPE__DOOR_OPENING_LEGACY, null, msgs);
			msgs = basicSetDoorOpeningLegacy(newDoorOpeningLegacy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DOOR_OPENING_TYPE__DOOR_OPENING_LEGACY,
					newDoorOpeningLegacy, newDoorOpeningLegacy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DOOR_OPENING_TYPE__CUT_OUT_UID:
			return basicSetCutOutUID(null, msgs);
		case CpacsPackage.DOOR_OPENING_TYPE__DOOR_OPENING_LEGACY:
			return basicSetDoorOpeningLegacy(null, msgs);
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
		case CpacsPackage.DOOR_OPENING_TYPE__CUT_OUT_UID:
			return getCutOutUID();
		case CpacsPackage.DOOR_OPENING_TYPE__DOOR_OPENING_LEGACY:
			return getDoorOpeningLegacy();
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
		case CpacsPackage.DOOR_OPENING_TYPE__CUT_OUT_UID:
			setCutOutUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.DOOR_OPENING_TYPE__DOOR_OPENING_LEGACY:
			setDoorOpeningLegacy((DoorOpeningLegacyType) newValue);
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
		case CpacsPackage.DOOR_OPENING_TYPE__CUT_OUT_UID:
			setCutOutUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.DOOR_OPENING_TYPE__DOOR_OPENING_LEGACY:
			setDoorOpeningLegacy((DoorOpeningLegacyType) null);
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
		case CpacsPackage.DOOR_OPENING_TYPE__CUT_OUT_UID:
			return cutOutUID != null;
		case CpacsPackage.DOOR_OPENING_TYPE__DOOR_OPENING_LEGACY:
			return doorOpeningLegacy != null;
		}
		return super.eIsSet(featureID);
	}

} //DoorOpeningTypeImpl
