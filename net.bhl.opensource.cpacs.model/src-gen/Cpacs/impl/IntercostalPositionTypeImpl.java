/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.IntercostalPositionType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intercostal Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.IntercostalPositionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.IntercostalPositionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.IntercostalPositionTypeImpl#getFrontFrameUID <em>Front Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.IntercostalPositionTypeImpl#getRearFrameUID <em>Rear Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.IntercostalPositionTypeImpl#getDoorUID <em>Door UID</em>}</li>
 *   <li>{@link Cpacs.impl.IntercostalPositionTypeImpl#getPositionRelZ <em>Position Rel Z</em>}</li>
 *   <li>{@link Cpacs.impl.IntercostalPositionTypeImpl#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.IntercostalPositionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntercostalPositionTypeImpl extends ComplexBaseTypeImpl implements IntercostalPositionType {
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
	 * The cached value of the '{@link #getFrontFrameUID() <em>Front Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType frontFrameUID;

	/**
	 * The cached value of the '{@link #getRearFrameUID() <em>Rear Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRearFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType rearFrameUID;

	/**
	 * The cached value of the '{@link #getDoorUID() <em>Door UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType doorUID;

	/**
	 * The cached value of the '{@link #getPositionRelZ() <em>Position Rel Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionRelZ()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType positionRelZ;

	/**
	 * The cached value of the '{@link #getStructuralElementUID() <em>Structural Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType structuralElementUID;

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
	protected IntercostalPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getIntercostalPositionType();
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
					CpacsPackage.INTERCOSTAL_POSITION_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.INTERCOSTAL_POSITION_TYPE__NAME, newName,
					newName));
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
					CpacsPackage.INTERCOSTAL_POSITION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.INTERCOSTAL_POSITION_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFrontFrameUID() {
		return frontFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrontFrameUID(StringUIDBaseType newFrontFrameUID, NotificationChain msgs) {
		StringUIDBaseType oldFrontFrameUID = frontFrameUID;
		frontFrameUID = newFrontFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCOSTAL_POSITION_TYPE__FRONT_FRAME_UID, oldFrontFrameUID, newFrontFrameUID);
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
	public void setFrontFrameUID(StringUIDBaseType newFrontFrameUID) {
		if (newFrontFrameUID != frontFrameUID) {
			NotificationChain msgs = null;
			if (frontFrameUID != null)
				msgs = ((InternalEObject) frontFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__FRONT_FRAME_UID, null, msgs);
			if (newFrontFrameUID != null)
				msgs = ((InternalEObject) newFrontFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__FRONT_FRAME_UID, null, msgs);
			msgs = basicSetFrontFrameUID(newFrontFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCOSTAL_POSITION_TYPE__FRONT_FRAME_UID, newFrontFrameUID, newFrontFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getRearFrameUID() {
		return rearFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRearFrameUID(StringUIDBaseType newRearFrameUID, NotificationChain msgs) {
		StringUIDBaseType oldRearFrameUID = rearFrameUID;
		rearFrameUID = newRearFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCOSTAL_POSITION_TYPE__REAR_FRAME_UID, oldRearFrameUID, newRearFrameUID);
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
	public void setRearFrameUID(StringUIDBaseType newRearFrameUID) {
		if (newRearFrameUID != rearFrameUID) {
			NotificationChain msgs = null;
			if (rearFrameUID != null)
				msgs = ((InternalEObject) rearFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__REAR_FRAME_UID, null, msgs);
			if (newRearFrameUID != null)
				msgs = ((InternalEObject) newRearFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__REAR_FRAME_UID, null, msgs);
			msgs = basicSetRearFrameUID(newRearFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCOSTAL_POSITION_TYPE__REAR_FRAME_UID, newRearFrameUID, newRearFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getDoorUID() {
		return doorUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoorUID(StringUIDBaseType newDoorUID, NotificationChain msgs) {
		StringUIDBaseType oldDoorUID = doorUID;
		doorUID = newDoorUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCOSTAL_POSITION_TYPE__DOOR_UID, oldDoorUID, newDoorUID);
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
	public void setDoorUID(StringUIDBaseType newDoorUID) {
		if (newDoorUID != doorUID) {
			NotificationChain msgs = null;
			if (doorUID != null)
				msgs = ((InternalEObject) doorUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__DOOR_UID, null, msgs);
			if (newDoorUID != null)
				msgs = ((InternalEObject) newDoorUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__DOOR_UID, null, msgs);
			msgs = basicSetDoorUID(newDoorUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.INTERCOSTAL_POSITION_TYPE__DOOR_UID,
					newDoorUID, newDoorUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getPositionRelZ() {
		return positionRelZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionRelZ(DoubleBaseType newPositionRelZ, NotificationChain msgs) {
		DoubleBaseType oldPositionRelZ = positionRelZ;
		positionRelZ = newPositionRelZ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCOSTAL_POSITION_TYPE__POSITION_REL_Z, oldPositionRelZ, newPositionRelZ);
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
	public void setPositionRelZ(DoubleBaseType newPositionRelZ) {
		if (newPositionRelZ != positionRelZ) {
			NotificationChain msgs = null;
			if (positionRelZ != null)
				msgs = ((InternalEObject) positionRelZ).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__POSITION_REL_Z, null, msgs);
			if (newPositionRelZ != null)
				msgs = ((InternalEObject) newPositionRelZ).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__POSITION_REL_Z, null, msgs);
			msgs = basicSetPositionRelZ(newPositionRelZ, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCOSTAL_POSITION_TYPE__POSITION_REL_Z, newPositionRelZ, newPositionRelZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStructuralElementUID() {
		return structuralElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralElementUID(StringUIDBaseType newStructuralElementUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStructuralElementUID = structuralElementUID;
		structuralElementUID = newStructuralElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCOSTAL_POSITION_TYPE__STRUCTURAL_ELEMENT_UID, oldStructuralElementUID,
					newStructuralElementUID);
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
	public void setStructuralElementUID(StringUIDBaseType newStructuralElementUID) {
		if (newStructuralElementUID != structuralElementUID) {
			NotificationChain msgs = null;
			if (structuralElementUID != null)
				msgs = ((InternalEObject) structuralElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__STRUCTURAL_ELEMENT_UID, null,
						msgs);
			if (newStructuralElementUID != null)
				msgs = ((InternalEObject) newStructuralElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.INTERCOSTAL_POSITION_TYPE__STRUCTURAL_ELEMENT_UID, null,
						msgs);
			msgs = basicSetStructuralElementUID(newStructuralElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.INTERCOSTAL_POSITION_TYPE__STRUCTURAL_ELEMENT_UID, newStructuralElementUID,
					newStructuralElementUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.INTERCOSTAL_POSITION_TYPE__UID, oldUID,
					uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__FRONT_FRAME_UID:
			return basicSetFrontFrameUID(null, msgs);
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__REAR_FRAME_UID:
			return basicSetRearFrameUID(null, msgs);
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__DOOR_UID:
			return basicSetDoorUID(null, msgs);
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__POSITION_REL_Z:
			return basicSetPositionRelZ(null, msgs);
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return basicSetStructuralElementUID(null, msgs);
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
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__NAME:
			return getName();
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__FRONT_FRAME_UID:
			return getFrontFrameUID();
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__REAR_FRAME_UID:
			return getRearFrameUID();
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__DOOR_UID:
			return getDoorUID();
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__POSITION_REL_Z:
			return getPositionRelZ();
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return getStructuralElementUID();
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__UID:
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
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__FRONT_FRAME_UID:
			setFrontFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__REAR_FRAME_UID:
			setRearFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__DOOR_UID:
			setDoorUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__POSITION_REL_Z:
			setPositionRelZ((DoubleBaseType) newValue);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__UID:
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
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__FRONT_FRAME_UID:
			setFrontFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__REAR_FRAME_UID:
			setRearFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__DOOR_UID:
			setDoorUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__POSITION_REL_Z:
			setPositionRelZ((DoubleBaseType) null);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__UID:
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
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__NAME:
			return name != null;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__FRONT_FRAME_UID:
			return frontFrameUID != null;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__REAR_FRAME_UID:
			return rearFrameUID != null;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__DOOR_UID:
			return doorUID != null;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__POSITION_REL_Z:
			return positionRelZ != null;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return structuralElementUID != null;
		case CpacsPackage.INTERCOSTAL_POSITION_TYPE__UID:
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

} //IntercostalPositionTypeImpl
