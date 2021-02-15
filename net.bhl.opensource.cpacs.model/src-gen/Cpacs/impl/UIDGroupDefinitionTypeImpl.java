/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.UIDGroupDefinitionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UID Group Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.UIDGroupDefinitionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.UIDGroupDefinitionTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.UIDGroupDefinitionTypeImpl#getStructuralMemberUID <em>Structural Member UID</em>}</li>
 *   <li>{@link Cpacs.impl.UIDGroupDefinitionTypeImpl#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.UIDGroupDefinitionTypeImpl#getEntityUID <em>Entity UID</em>}</li>
 *   <li>{@link Cpacs.impl.UIDGroupDefinitionTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UIDGroupDefinitionTypeImpl extends ComplexBaseTypeImpl implements UIDGroupDefinitionType {
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
	 * The cached value of the '{@link #getStructuralMemberUID() <em>Structural Member UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralMemberUID()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> structuralMemberUID;

	/**
	 * The cached value of the '{@link #getStructuralElementUID() <em>Structural Element UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralElementUID()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> structuralElementUID;

	/**
	 * The cached value of the '{@link #getEntityUID() <em>Entity UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityUID()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> entityUID;

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
	protected UIDGroupDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getUIDGroupDefinitionType();
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
					CpacsPackage.UID_GROUP_DEFINITION_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UID_GROUP_DEFINITION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UID_GROUP_DEFINITION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.UID_GROUP_DEFINITION_TYPE__NAME, newName,
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
					CpacsPackage.UID_GROUP_DEFINITION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UID_GROUP_DEFINITION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.UID_GROUP_DEFINITION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.UID_GROUP_DEFINITION_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getStructuralMemberUID() {
		if (structuralMemberUID == null) {
			structuralMemberUID = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.UID_GROUP_DEFINITION_TYPE__STRUCTURAL_MEMBER_UID);
		}
		return structuralMemberUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getStructuralElementUID() {
		if (structuralElementUID == null) {
			structuralElementUID = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.UID_GROUP_DEFINITION_TYPE__STRUCTURAL_ELEMENT_UID);
		}
		return structuralElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getEntityUID() {
		if (entityUID == null) {
			entityUID = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.UID_GROUP_DEFINITION_TYPE__ENTITY_UID);
		}
		return entityUID;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.UID_GROUP_DEFINITION_TYPE__UID, oldUID,
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
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__STRUCTURAL_MEMBER_UID:
			return ((InternalEList<?>) getStructuralMemberUID()).basicRemove(otherEnd, msgs);
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return ((InternalEList<?>) getStructuralElementUID()).basicRemove(otherEnd, msgs);
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__ENTITY_UID:
			return ((InternalEList<?>) getEntityUID()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__NAME:
			return getName();
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__STRUCTURAL_MEMBER_UID:
			return getStructuralMemberUID();
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return getStructuralElementUID();
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__ENTITY_UID:
			return getEntityUID();
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__UID:
			return getUID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__STRUCTURAL_MEMBER_UID:
			getStructuralMemberUID().clear();
			getStructuralMemberUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
			return;
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__STRUCTURAL_ELEMENT_UID:
			getStructuralElementUID().clear();
			getStructuralElementUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
			return;
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__ENTITY_UID:
			getEntityUID().clear();
			getEntityUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
			return;
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__UID:
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
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__STRUCTURAL_MEMBER_UID:
			getStructuralMemberUID().clear();
			return;
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__STRUCTURAL_ELEMENT_UID:
			getStructuralElementUID().clear();
			return;
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__ENTITY_UID:
			getEntityUID().clear();
			return;
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__UID:
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
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__NAME:
			return name != null;
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__STRUCTURAL_MEMBER_UID:
			return structuralMemberUID != null && !structuralMemberUID.isEmpty();
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__STRUCTURAL_ELEMENT_UID:
			return structuralElementUID != null && !structuralElementUID.isEmpty();
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__ENTITY_UID:
			return entityUID != null && !entityUID.isEmpty();
		case CpacsPackage.UID_GROUP_DEFINITION_TYPE__UID:
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

} //UIDGroupDefinitionTypeImpl
