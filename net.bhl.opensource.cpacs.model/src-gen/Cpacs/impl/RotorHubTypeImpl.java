/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.RotorBladeAttachmentsType;
import Cpacs.RotorHubType;
import Cpacs.StringBaseType;
import Cpacs.TypeType2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotor Hub Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotorHubTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.RotorHubTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.RotorHubTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.impl.RotorHubTypeImpl#getRotorBladeAttachments <em>Rotor Blade Attachments</em>}</li>
 *   <li>{@link Cpacs.impl.RotorHubTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotorHubTypeImpl extends ComplexBaseTypeImpl implements RotorHubType {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType2 TYPE_EDEFAULT = TypeType2.SEMI_RIGID;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType2 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getRotorBladeAttachments() <em>Rotor Blade Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotorBladeAttachments()
	 * @generated
	 * @ordered
	 */
	protected RotorBladeAttachmentsType rotorBladeAttachments;

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
	protected RotorHubTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotorHubType();
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
					CpacsPackage.ROTOR_HUB_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_TYPE__NAME, newName, newName));
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
					CpacsPackage.ROTOR_HUB_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeType2 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TypeType2 newType) {
		TypeType2 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_TYPE__TYPE, oldType, type,
					!oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetType() {
		TypeType2 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CpacsPackage.ROTOR_HUB_TYPE__TYPE, oldType,
					TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RotorBladeAttachmentsType getRotorBladeAttachments() {
		return rotorBladeAttachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotorBladeAttachments(RotorBladeAttachmentsType newRotorBladeAttachments,
			NotificationChain msgs) {
		RotorBladeAttachmentsType oldRotorBladeAttachments = rotorBladeAttachments;
		rotorBladeAttachments = newRotorBladeAttachments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.ROTOR_HUB_TYPE__ROTOR_BLADE_ATTACHMENTS, oldRotorBladeAttachments,
					newRotorBladeAttachments);
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
	public void setRotorBladeAttachments(RotorBladeAttachmentsType newRotorBladeAttachments) {
		if (newRotorBladeAttachments != rotorBladeAttachments) {
			NotificationChain msgs = null;
			if (rotorBladeAttachments != null)
				msgs = ((InternalEObject) rotorBladeAttachments).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_TYPE__ROTOR_BLADE_ATTACHMENTS, null, msgs);
			if (newRotorBladeAttachments != null)
				msgs = ((InternalEObject) newRotorBladeAttachments).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.ROTOR_HUB_TYPE__ROTOR_BLADE_ATTACHMENTS, null, msgs);
			msgs = basicSetRotorBladeAttachments(newRotorBladeAttachments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_TYPE__ROTOR_BLADE_ATTACHMENTS,
					newRotorBladeAttachments, newRotorBladeAttachments));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.ROTOR_HUB_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ROTOR_HUB_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.ROTOR_HUB_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.ROTOR_HUB_TYPE__ROTOR_BLADE_ATTACHMENTS:
			return basicSetRotorBladeAttachments(null, msgs);
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
		case CpacsPackage.ROTOR_HUB_TYPE__NAME:
			return getName();
		case CpacsPackage.ROTOR_HUB_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.ROTOR_HUB_TYPE__TYPE:
			return getType();
		case CpacsPackage.ROTOR_HUB_TYPE__ROTOR_BLADE_ATTACHMENTS:
			return getRotorBladeAttachments();
		case CpacsPackage.ROTOR_HUB_TYPE__UID:
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
		case CpacsPackage.ROTOR_HUB_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_HUB_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.ROTOR_HUB_TYPE__TYPE:
			setType((TypeType2) newValue);
			return;
		case CpacsPackage.ROTOR_HUB_TYPE__ROTOR_BLADE_ATTACHMENTS:
			setRotorBladeAttachments((RotorBladeAttachmentsType) newValue);
			return;
		case CpacsPackage.ROTOR_HUB_TYPE__UID:
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
		case CpacsPackage.ROTOR_HUB_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.ROTOR_HUB_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.ROTOR_HUB_TYPE__TYPE:
			unsetType();
			return;
		case CpacsPackage.ROTOR_HUB_TYPE__ROTOR_BLADE_ATTACHMENTS:
			setRotorBladeAttachments((RotorBladeAttachmentsType) null);
			return;
		case CpacsPackage.ROTOR_HUB_TYPE__UID:
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
		case CpacsPackage.ROTOR_HUB_TYPE__NAME:
			return name != null;
		case CpacsPackage.ROTOR_HUB_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.ROTOR_HUB_TYPE__TYPE:
			return isSetType();
		case CpacsPackage.ROTOR_HUB_TYPE__ROTOR_BLADE_ATTACHMENTS:
			return rotorBladeAttachments != null;
		case CpacsPackage.ROTOR_HUB_TYPE__UID:
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
		result.append(" (type: ");
		if (typeESet)
			result.append(type);
		else
			result.append("<unset>");
		result.append(", uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //RotorHubTypeImpl
