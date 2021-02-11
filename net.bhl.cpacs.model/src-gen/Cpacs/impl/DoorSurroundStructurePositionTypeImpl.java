/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoorSurroundStructurePositionType;
import Cpacs.IntegerBaseType;
import Cpacs.StringBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door Surround Structure Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DoorSurroundStructurePositionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.DoorSurroundStructurePositionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.DoorSurroundStructurePositionTypeImpl#getFramesGapFront <em>Frames Gap Front</em>}</li>
 *   <li>{@link Cpacs.impl.DoorSurroundStructurePositionTypeImpl#getFramesGapRear <em>Frames Gap Rear</em>}</li>
 *   <li>{@link Cpacs.impl.DoorSurroundStructurePositionTypeImpl#getStringersGapPrimary <em>Stringers Gap Primary</em>}</li>
 *   <li>{@link Cpacs.impl.DoorSurroundStructurePositionTypeImpl#getStringersGapSecondary <em>Stringers Gap Secondary</em>}</li>
 *   <li>{@link Cpacs.impl.DoorSurroundStructurePositionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoorSurroundStructurePositionTypeImpl extends ComplexBaseTypeImpl
		implements DoorSurroundStructurePositionType {
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
	 * The cached value of the '{@link #getFramesGapFront() <em>Frames Gap Front</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramesGapFront()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType framesGapFront;

	/**
	 * The cached value of the '{@link #getFramesGapRear() <em>Frames Gap Rear</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramesGapRear()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType framesGapRear;

	/**
	 * The cached value of the '{@link #getStringersGapPrimary() <em>Stringers Gap Primary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringersGapPrimary()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType stringersGapPrimary;

	/**
	 * The cached value of the '{@link #getStringersGapSecondary() <em>Stringers Gap Secondary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringersGapSecondary()
	 * @generated
	 * @ordered
	 */
	protected IntegerBaseType stringersGapSecondary;

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
	protected DoorSurroundStructurePositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDoorSurroundStructurePositionType();
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
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__NAME, newName, newName));
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
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__DESCRIPTION, null,
						msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__DESCRIPTION, null,
						msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getFramesGapFront() {
		return framesGapFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFramesGapFront(IntegerBaseType newFramesGapFront, NotificationChain msgs) {
		IntegerBaseType oldFramesGapFront = framesGapFront;
		framesGapFront = newFramesGapFront;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_FRONT, oldFramesGapFront,
					newFramesGapFront);
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
	public void setFramesGapFront(IntegerBaseType newFramesGapFront) {
		if (newFramesGapFront != framesGapFront) {
			NotificationChain msgs = null;
			if (framesGapFront != null)
				msgs = ((InternalEObject) framesGapFront).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_FRONT,
						null, msgs);
			if (newFramesGapFront != null)
				msgs = ((InternalEObject) newFramesGapFront).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_FRONT,
						null, msgs);
			msgs = basicSetFramesGapFront(newFramesGapFront, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_FRONT, newFramesGapFront,
					newFramesGapFront));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getFramesGapRear() {
		return framesGapRear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFramesGapRear(IntegerBaseType newFramesGapRear, NotificationChain msgs) {
		IntegerBaseType oldFramesGapRear = framesGapRear;
		framesGapRear = newFramesGapRear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_REAR, oldFramesGapRear,
					newFramesGapRear);
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
	public void setFramesGapRear(IntegerBaseType newFramesGapRear) {
		if (newFramesGapRear != framesGapRear) {
			NotificationChain msgs = null;
			if (framesGapRear != null)
				msgs = ((InternalEObject) framesGapRear).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_REAR,
						null, msgs);
			if (newFramesGapRear != null)
				msgs = ((InternalEObject) newFramesGapRear).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_REAR,
						null, msgs);
			msgs = basicSetFramesGapRear(newFramesGapRear, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_REAR, newFramesGapRear,
					newFramesGapRear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getStringersGapPrimary() {
		return stringersGapPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringersGapPrimary(IntegerBaseType newStringersGapPrimary,
			NotificationChain msgs) {
		IntegerBaseType oldStringersGapPrimary = stringersGapPrimary;
		stringersGapPrimary = newStringersGapPrimary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_PRIMARY, oldStringersGapPrimary,
					newStringersGapPrimary);
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
	public void setStringersGapPrimary(IntegerBaseType newStringersGapPrimary) {
		if (newStringersGapPrimary != stringersGapPrimary) {
			NotificationChain msgs = null;
			if (stringersGapPrimary != null)
				msgs = ((InternalEObject) stringersGapPrimary).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_PRIMARY,
						null, msgs);
			if (newStringersGapPrimary != null)
				msgs = ((InternalEObject) newStringersGapPrimary).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_PRIMARY,
						null, msgs);
			msgs = basicSetStringersGapPrimary(newStringersGapPrimary, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_PRIMARY, newStringersGapPrimary,
					newStringersGapPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerBaseType getStringersGapSecondary() {
		return stringersGapSecondary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringersGapSecondary(IntegerBaseType newStringersGapSecondary,
			NotificationChain msgs) {
		IntegerBaseType oldStringersGapSecondary = stringersGapSecondary;
		stringersGapSecondary = newStringersGapSecondary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_SECONDARY,
					oldStringersGapSecondary, newStringersGapSecondary);
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
	public void setStringersGapSecondary(IntegerBaseType newStringersGapSecondary) {
		if (newStringersGapSecondary != stringersGapSecondary) {
			NotificationChain msgs = null;
			if (stringersGapSecondary != null)
				msgs = ((InternalEObject) stringersGapSecondary).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_SECONDARY,
						null, msgs);
			if (newStringersGapSecondary != null)
				msgs = ((InternalEObject) newStringersGapSecondary).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_SECONDARY,
						null, msgs);
			msgs = basicSetStringersGapSecondary(newStringersGapSecondary, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_SECONDARY,
					newStringersGapSecondary, newStringersGapSecondary));
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
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_FRONT:
			return basicSetFramesGapFront(null, msgs);
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_REAR:
			return basicSetFramesGapRear(null, msgs);
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_PRIMARY:
			return basicSetStringersGapPrimary(null, msgs);
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_SECONDARY:
			return basicSetStringersGapSecondary(null, msgs);
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
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__NAME:
			return getName();
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_FRONT:
			return getFramesGapFront();
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_REAR:
			return getFramesGapRear();
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_PRIMARY:
			return getStringersGapPrimary();
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_SECONDARY:
			return getStringersGapSecondary();
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__UID:
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
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_FRONT:
			setFramesGapFront((IntegerBaseType) newValue);
			return;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_REAR:
			setFramesGapRear((IntegerBaseType) newValue);
			return;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_PRIMARY:
			setStringersGapPrimary((IntegerBaseType) newValue);
			return;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_SECONDARY:
			setStringersGapSecondary((IntegerBaseType) newValue);
			return;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__UID:
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
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_FRONT:
			setFramesGapFront((IntegerBaseType) null);
			return;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_REAR:
			setFramesGapRear((IntegerBaseType) null);
			return;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_PRIMARY:
			setStringersGapPrimary((IntegerBaseType) null);
			return;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_SECONDARY:
			setStringersGapSecondary((IntegerBaseType) null);
			return;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__UID:
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
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__NAME:
			return name != null;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_FRONT:
			return framesGapFront != null;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__FRAMES_GAP_REAR:
			return framesGapRear != null;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_PRIMARY:
			return stringersGapPrimary != null;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__STRINGERS_GAP_SECONDARY:
			return stringersGapSecondary != null;
		case CpacsPackage.DOOR_SURROUND_STRUCTURE_POSITION_TYPE__UID:
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

} //DoorSurroundStructurePositionTypeImpl
