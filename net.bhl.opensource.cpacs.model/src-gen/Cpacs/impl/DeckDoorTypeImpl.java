/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckDoorType;
import Cpacs.DoorOpeningType;
import Cpacs.DoorTypeType;
import Cpacs.IntegerBaseType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deck Door Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DeckDoorTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.DeckDoorTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.DeckDoorTypeImpl#getPaxCapacity <em>Pax Capacity</em>}</li>
 *   <li>{@link Cpacs.impl.DeckDoorTypeImpl#getOpening <em>Opening</em>}</li>
 *   <li>{@link Cpacs.impl.DeckDoorTypeImpl#getDoorType <em>Door Type</em>}</li>
 *   <li>{@link Cpacs.impl.DeckDoorTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeckDoorTypeImpl extends ComplexBaseTypeImpl implements DeckDoorType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected StringBaseType description;

	/**
	 * The cached value of the '{@link #getPaxCapacity() <em>Pax Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaxCapacity()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType paxCapacity;

	/**
	 * The cached value of the '{@link #getOpening() <em>Opening</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpening()
	 * @generated
	 * @ordered
	 */
	protected DoorOpeningType opening;

	/**
	 * The cached value of the '{@link #getDoorType() <em>Door Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorType()
	 * @generated
	 * @ordered
	 */
	protected DoorTypeType doorType;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeckDoorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDeckDoorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(StringBaseType newName, NotificationChain msgs) {
		StringBaseType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_DOOR_TYPE__NAME, oldName, newName);
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
	public void setName(StringBaseType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_DOOR_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_DOOR_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_DOOR_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringBaseType getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(StringBaseType newDescription, NotificationChain msgs) {
		StringBaseType oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_DOOR_TYPE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(StringBaseType newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_DOOR_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_DOOR_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_DOOR_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getPaxCapacity() {
		return paxCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaxCapacity(IntegerBaseType newPaxCapacity, NotificationChain msgs) {
		IntegerBaseType oldPaxCapacity = paxCapacity;
		paxCapacity = newPaxCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_DOOR_TYPE__PAX_CAPACITY, oldPaxCapacity, newPaxCapacity);
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
	public void setPaxCapacity(IntegerBaseType newPaxCapacity) {
		if (newPaxCapacity != paxCapacity) {
			NotificationChain msgs = null;
			if (paxCapacity != null)
				msgs = ((InternalEObject) paxCapacity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_DOOR_TYPE__PAX_CAPACITY, null, msgs);
			if (newPaxCapacity != null)
				msgs = ((InternalEObject) newPaxCapacity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_DOOR_TYPE__PAX_CAPACITY, null, msgs);
			msgs = basicSetPaxCapacity(newPaxCapacity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_DOOR_TYPE__PAX_CAPACITY,
					newPaxCapacity, newPaxCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorOpeningType getOpening() {
		return opening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpening(DoorOpeningType newOpening, NotificationChain msgs) {
		DoorOpeningType oldOpening = opening;
		opening = newOpening;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_DOOR_TYPE__OPENING, oldOpening, newOpening);
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
	public void setOpening(DoorOpeningType newOpening) {
		if (newOpening != opening) {
			NotificationChain msgs = null;
			if (opening != null)
				msgs = ((InternalEObject) opening).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_DOOR_TYPE__OPENING, null, msgs);
			if (newOpening != null)
				msgs = ((InternalEObject) newOpening).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_DOOR_TYPE__OPENING, null, msgs);
			msgs = basicSetOpening(newOpening, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_DOOR_TYPE__OPENING, newOpening,
					newOpening));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorTypeType getDoorType() {
		return doorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoorType(DoorTypeType newDoorType, NotificationChain msgs) {
		DoorTypeType oldDoorType = doorType;
		doorType = newDoorType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_DOOR_TYPE__DOOR_TYPE, oldDoorType, newDoorType);
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
	public void setDoorType(DoorTypeType newDoorType) {
		if (newDoorType != doorType) {
			NotificationChain msgs = null;
			if (doorType != null)
				msgs = ((InternalEObject) doorType).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_DOOR_TYPE__DOOR_TYPE, null, msgs);
			if (newDoorType != null)
				msgs = ((InternalEObject) newDoorType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_DOOR_TYPE__DOOR_TYPE, null, msgs);
			msgs = basicSetDoorType(newDoorType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_DOOR_TYPE__DOOR_TYPE, newDoorType,
					newDoorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_DOOR_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DECK_DOOR_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.DECK_DOOR_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.DECK_DOOR_TYPE__PAX_CAPACITY:
			return basicSetPaxCapacity(null, msgs);
		case CpacsPackage.DECK_DOOR_TYPE__OPENING:
			return basicSetOpening(null, msgs);
		case CpacsPackage.DECK_DOOR_TYPE__DOOR_TYPE:
			return basicSetDoorType(null, msgs);
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
		case CpacsPackage.DECK_DOOR_TYPE__NAME:
			return getName();
		case CpacsPackage.DECK_DOOR_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.DECK_DOOR_TYPE__PAX_CAPACITY:
			return getPaxCapacity();
		case CpacsPackage.DECK_DOOR_TYPE__OPENING:
			return getOpening();
		case CpacsPackage.DECK_DOOR_TYPE__DOOR_TYPE:
			return getDoorType();
		case CpacsPackage.DECK_DOOR_TYPE__UID:
			return getUID();
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
		case CpacsPackage.DECK_DOOR_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.DECK_DOOR_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.DECK_DOOR_TYPE__PAX_CAPACITY:
			setPaxCapacity((IntegerBaseType) newValue);
			return;
		case CpacsPackage.DECK_DOOR_TYPE__OPENING:
			setOpening((DoorOpeningType) newValue);
			return;
		case CpacsPackage.DECK_DOOR_TYPE__DOOR_TYPE:
			setDoorType((DoorTypeType) newValue);
			return;
		case CpacsPackage.DECK_DOOR_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.DECK_DOOR_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.DECK_DOOR_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.DECK_DOOR_TYPE__PAX_CAPACITY:
			setPaxCapacity((IntegerBaseType) null);
			return;
		case CpacsPackage.DECK_DOOR_TYPE__OPENING:
			setOpening((DoorOpeningType) null);
			return;
		case CpacsPackage.DECK_DOOR_TYPE__DOOR_TYPE:
			setDoorType((DoorTypeType) null);
			return;
		case CpacsPackage.DECK_DOOR_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.DECK_DOOR_TYPE__NAME:
			return name != null;
		case CpacsPackage.DECK_DOOR_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.DECK_DOOR_TYPE__PAX_CAPACITY:
			return paxCapacity != null;
		case CpacsPackage.DECK_DOOR_TYPE__OPENING:
			return opening != null;
		case CpacsPackage.DECK_DOOR_TYPE__DOOR_TYPE:
			return doorType != null;
		case CpacsPackage.DECK_DOOR_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //DeckDoorTypeImpl
