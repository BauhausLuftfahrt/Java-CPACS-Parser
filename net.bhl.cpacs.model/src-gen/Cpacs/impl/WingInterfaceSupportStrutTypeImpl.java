/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.WingInterfaceSupportStrutType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wing Interface Support Strut Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingInterfaceSupportStrutTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceSupportStrutTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceSupportStrutTypeImpl#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceSupportStrutTypeImpl#getWingAttachmentPinUID <em>Wing Attachment Pin UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceSupportStrutTypeImpl#getFuselageAttachmentFrameUID <em>Fuselage Attachment Frame UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceSupportStrutTypeImpl#getFuselageAttachmentStringerUID <em>Fuselage Attachment Stringer UID</em>}</li>
 *   <li>{@link Cpacs.impl.WingInterfaceSupportStrutTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingInterfaceSupportStrutTypeImpl extends ComplexBaseTypeImpl implements WingInterfaceSupportStrutType {
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
	 * The cached value of the '{@link #getStructuralElementUID() <em>Structural Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType structuralElementUID;

	/**
	 * The cached value of the '{@link #getWingAttachmentPinUID() <em>Wing Attachment Pin UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingAttachmentPinUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType wingAttachmentPinUID;

	/**
	 * The cached value of the '{@link #getFuselageAttachmentFrameUID() <em>Fuselage Attachment Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageAttachmentFrameUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fuselageAttachmentFrameUID;

	/**
	 * The cached value of the '{@link #getFuselageAttachmentStringerUID() <em>Fuselage Attachment Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageAttachmentStringerUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType fuselageAttachmentStringerUID;

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
	protected WingInterfaceSupportStrutTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingInterfaceSupportStrutType();
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
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__NAME,
					newName, newName));
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
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__DESCRIPTION, null,
						msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__DESCRIPTION, null,
						msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__DESCRIPTION, newDescription, newDescription));
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
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__STRUCTURAL_ELEMENT_UID, oldStructuralElementUID,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__STRUCTURAL_ELEMENT_UID,
						null, msgs);
			if (newStructuralElementUID != null)
				msgs = ((InternalEObject) newStructuralElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__STRUCTURAL_ELEMENT_UID,
						null, msgs);
			msgs = basicSetStructuralElementUID(newStructuralElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__STRUCTURAL_ELEMENT_UID, newStructuralElementUID,
					newStructuralElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getWingAttachmentPinUID() {
		return wingAttachmentPinUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWingAttachmentPinUID(StringUIDBaseType newWingAttachmentPinUID,
			NotificationChain msgs) {
		StringUIDBaseType oldWingAttachmentPinUID = wingAttachmentPinUID;
		wingAttachmentPinUID = newWingAttachmentPinUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__WING_ATTACHMENT_PIN_UID, oldWingAttachmentPinUID,
					newWingAttachmentPinUID);
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
	public void setWingAttachmentPinUID(StringUIDBaseType newWingAttachmentPinUID) {
		if (newWingAttachmentPinUID != wingAttachmentPinUID) {
			NotificationChain msgs = null;
			if (wingAttachmentPinUID != null)
				msgs = ((InternalEObject) wingAttachmentPinUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__WING_ATTACHMENT_PIN_UID, null, msgs);
			if (newWingAttachmentPinUID != null)
				msgs = ((InternalEObject) newWingAttachmentPinUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__WING_ATTACHMENT_PIN_UID, null, msgs);
			msgs = basicSetWingAttachmentPinUID(newWingAttachmentPinUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__WING_ATTACHMENT_PIN_UID, newWingAttachmentPinUID,
					newWingAttachmentPinUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFuselageAttachmentFrameUID() {
		return fuselageAttachmentFrameUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuselageAttachmentFrameUID(StringUIDBaseType newFuselageAttachmentFrameUID,
			NotificationChain msgs) {
		StringUIDBaseType oldFuselageAttachmentFrameUID = fuselageAttachmentFrameUID;
		fuselageAttachmentFrameUID = newFuselageAttachmentFrameUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_FRAME_UID,
					oldFuselageAttachmentFrameUID, newFuselageAttachmentFrameUID);
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
	public void setFuselageAttachmentFrameUID(StringUIDBaseType newFuselageAttachmentFrameUID) {
		if (newFuselageAttachmentFrameUID != fuselageAttachmentFrameUID) {
			NotificationChain msgs = null;
			if (fuselageAttachmentFrameUID != null)
				msgs = ((InternalEObject) fuselageAttachmentFrameUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_FRAME_UID,
						null, msgs);
			if (newFuselageAttachmentFrameUID != null)
				msgs = ((InternalEObject) newFuselageAttachmentFrameUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_FRAME_UID,
						null, msgs);
			msgs = basicSetFuselageAttachmentFrameUID(newFuselageAttachmentFrameUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_FRAME_UID,
					newFuselageAttachmentFrameUID, newFuselageAttachmentFrameUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getFuselageAttachmentStringerUID() {
		return fuselageAttachmentStringerUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuselageAttachmentStringerUID(StringUIDBaseType newFuselageAttachmentStringerUID,
			NotificationChain msgs) {
		StringUIDBaseType oldFuselageAttachmentStringerUID = fuselageAttachmentStringerUID;
		fuselageAttachmentStringerUID = newFuselageAttachmentStringerUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_STRINGER_UID,
					oldFuselageAttachmentStringerUID, newFuselageAttachmentStringerUID);
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
	public void setFuselageAttachmentStringerUID(StringUIDBaseType newFuselageAttachmentStringerUID) {
		if (newFuselageAttachmentStringerUID != fuselageAttachmentStringerUID) {
			NotificationChain msgs = null;
			if (fuselageAttachmentStringerUID != null)
				msgs = ((InternalEObject) fuselageAttachmentStringerUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_STRINGER_UID,
						null, msgs);
			if (newFuselageAttachmentStringerUID != null)
				msgs = ((InternalEObject) newFuselageAttachmentStringerUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_STRINGER_UID,
						null, msgs);
			msgs = basicSetFuselageAttachmentStringerUID(newFuselageAttachmentStringerUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_STRINGER_UID,
					newFuselageAttachmentStringerUID, newFuselageAttachmentStringerUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__STRUCTURAL_ELEMENT_UID:
			return basicSetStructuralElementUID(null, msgs);
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__WING_ATTACHMENT_PIN_UID:
			return basicSetWingAttachmentPinUID(null, msgs);
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_FRAME_UID:
			return basicSetFuselageAttachmentFrameUID(null, msgs);
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_STRINGER_UID:
			return basicSetFuselageAttachmentStringerUID(null, msgs);
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
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__NAME:
			return getName();
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__STRUCTURAL_ELEMENT_UID:
			return getStructuralElementUID();
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__WING_ATTACHMENT_PIN_UID:
			return getWingAttachmentPinUID();
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_FRAME_UID:
			return getFuselageAttachmentFrameUID();
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_STRINGER_UID:
			return getFuselageAttachmentStringerUID();
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__UID:
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
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__WING_ATTACHMENT_PIN_UID:
			setWingAttachmentPinUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_FRAME_UID:
			setFuselageAttachmentFrameUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_STRINGER_UID:
			setFuselageAttachmentStringerUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__UID:
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
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__STRUCTURAL_ELEMENT_UID:
			setStructuralElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__WING_ATTACHMENT_PIN_UID:
			setWingAttachmentPinUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_FRAME_UID:
			setFuselageAttachmentFrameUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_STRINGER_UID:
			setFuselageAttachmentStringerUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__UID:
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
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__NAME:
			return name != null;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__STRUCTURAL_ELEMENT_UID:
			return structuralElementUID != null;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__WING_ATTACHMENT_PIN_UID:
			return wingAttachmentPinUID != null;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_FRAME_UID:
			return fuselageAttachmentFrameUID != null;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__FUSELAGE_ATTACHMENT_STRINGER_UID:
			return fuselageAttachmentStringerUID != null;
		case CpacsPackage.WING_INTERFACE_SUPPORT_STRUT_TYPE__UID:
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

} //WingInterfaceSupportStrutTypeImpl
