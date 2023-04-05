/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckStructuralMountType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deck Structural Mount Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DeckStructuralMountTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.DeckStructuralMountTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.DeckStructuralMountTypeImpl#getComponentUID <em>Component UID</em>}</li>
 *   <li>{@link Cpacs.impl.DeckStructuralMountTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeckStructuralMountTypeImpl extends ComplexBaseTypeImpl implements DeckStructuralMountType {
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
	 * The cached value of the '{@link #getComponentUID() <em>Component UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType componentUID;

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
	protected DeckStructuralMountTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDeckStructuralMountType();
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
					CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__NAME,
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
					CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getComponentUID() {
		return componentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentUID(StringUIDBaseType newComponentUID, NotificationChain msgs) {
		StringUIDBaseType oldComponentUID = componentUID;
		componentUID = newComponentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__COMPONENT_UID, oldComponentUID, newComponentUID);
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
	public void setComponentUID(StringUIDBaseType newComponentUID) {
		if (newComponentUID != componentUID) {
			NotificationChain msgs = null;
			if (componentUID != null)
				msgs = ((InternalEObject) componentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__COMPONENT_UID, null, msgs);
			if (newComponentUID != null)
				msgs = ((InternalEObject) newComponentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__COMPONENT_UID, null, msgs);
			msgs = basicSetComponentUID(newComponentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__COMPONENT_UID, newComponentUID, newComponentUID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__UID, oldUID,
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
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__COMPONENT_UID:
			return basicSetComponentUID(null, msgs);
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
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__NAME:
			return getName();
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__COMPONENT_UID:
			return getComponentUID();
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__UID:
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
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__COMPONENT_UID:
			setComponentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__UID:
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
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__COMPONENT_UID:
			setComponentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__UID:
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
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__NAME:
			return name != null;
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__COMPONENT_UID:
			return componentUID != null;
		case CpacsPackage.DECK_STRUCTURAL_MOUNT_TYPE__UID:
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

} //DeckStructuralMountTypeImpl
