/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GearComponentsType;
import Cpacs.NoseGearGlobalType;
import Cpacs.NoseGearType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.SymmetryType11;
import Cpacs.TransformationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nose Gear Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.NoseGearTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.NoseGearTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.NoseGearTypeImpl#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.impl.NoseGearTypeImpl#getFuselageAttachment <em>Fuselage Attachment</em>}</li>
 *   <li>{@link Cpacs.impl.NoseGearTypeImpl#getGlobal <em>Global</em>}</li>
 *   <li>{@link Cpacs.impl.NoseGearTypeImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link Cpacs.impl.NoseGearTypeImpl#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.impl.NoseGearTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoseGearTypeImpl extends ComplexBaseTypeImpl implements NoseGearType {
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
	 * The cached value of the '{@link #getParentUID() <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType parentUID;

	/**
	 * The cached value of the '{@link #getFuselageAttachment() <em>Fuselage Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageAttachment()
	 * @generated
	 * @ordered
	 */
	protected TransformationType fuselageAttachment;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected NoseGearGlobalType global;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected GearComponentsType components;

	/**
	 * The default value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected static final SymmetryType11 SYMMETRY_EDEFAULT = SymmetryType11.XY_PLANE;

	/**
	 * The cached value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected SymmetryType11 symmetry = SYMMETRY_EDEFAULT;

	/**
	 * This is true if the Symmetry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean symmetryESet;

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
	protected NoseGearTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getNoseGearType();
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
					CpacsPackage.NOSE_GEAR_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_TYPE__NAME, newName, newName));
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
					CpacsPackage.NOSE_GEAR_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getParentUID() {
		return parentUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentUID(StringUIDBaseType newParentUID, NotificationChain msgs) {
		StringUIDBaseType oldParentUID = parentUID;
		parentUID = newParentUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOSE_GEAR_TYPE__PARENT_UID, oldParentUID, newParentUID);
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
	public void setParentUID(StringUIDBaseType newParentUID) {
		if (newParentUID != parentUID) {
			NotificationChain msgs = null;
			if (parentUID != null)
				msgs = ((InternalEObject) parentUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_TYPE__PARENT_UID, null, msgs);
			if (newParentUID != null)
				msgs = ((InternalEObject) newParentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_TYPE__PARENT_UID, null, msgs);
			msgs = basicSetParentUID(newParentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_TYPE__PARENT_UID, newParentUID,
					newParentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationType getFuselageAttachment() {
		return fuselageAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuselageAttachment(TransformationType newFuselageAttachment,
			NotificationChain msgs) {
		TransformationType oldFuselageAttachment = fuselageAttachment;
		fuselageAttachment = newFuselageAttachment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOSE_GEAR_TYPE__FUSELAGE_ATTACHMENT, oldFuselageAttachment, newFuselageAttachment);
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
	public void setFuselageAttachment(TransformationType newFuselageAttachment) {
		if (newFuselageAttachment != fuselageAttachment) {
			NotificationChain msgs = null;
			if (fuselageAttachment != null)
				msgs = ((InternalEObject) fuselageAttachment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_TYPE__FUSELAGE_ATTACHMENT, null, msgs);
			if (newFuselageAttachment != null)
				msgs = ((InternalEObject) newFuselageAttachment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_TYPE__FUSELAGE_ATTACHMENT, null, msgs);
			msgs = basicSetFuselageAttachment(newFuselageAttachment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_TYPE__FUSELAGE_ATTACHMENT,
					newFuselageAttachment, newFuselageAttachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoseGearGlobalType getGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobal(NoseGearGlobalType newGlobal, NotificationChain msgs) {
		NoseGearGlobalType oldGlobal = global;
		global = newGlobal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOSE_GEAR_TYPE__GLOBAL, oldGlobal, newGlobal);
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
	public void setGlobal(NoseGearGlobalType newGlobal) {
		if (newGlobal != global) {
			NotificationChain msgs = null;
			if (global != null)
				msgs = ((InternalEObject) global).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_TYPE__GLOBAL, null, msgs);
			if (newGlobal != null)
				msgs = ((InternalEObject) newGlobal).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_TYPE__GLOBAL, null, msgs);
			msgs = basicSetGlobal(newGlobal, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_TYPE__GLOBAL, newGlobal,
					newGlobal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GearComponentsType getComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponents(GearComponentsType newComponents, NotificationChain msgs) {
		GearComponentsType oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.NOSE_GEAR_TYPE__COMPONENTS, oldComponents, newComponents);
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
	public void setComponents(GearComponentsType newComponents) {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject) components).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_TYPE__COMPONENTS, null, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject) newComponents).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.NOSE_GEAR_TYPE__COMPONENTS, null, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_TYPE__COMPONENTS,
					newComponents, newComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymmetryType11 getSymmetry() {
		return symmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymmetry(SymmetryType11 newSymmetry) {
		SymmetryType11 oldSymmetry = symmetry;
		symmetry = newSymmetry == null ? SYMMETRY_EDEFAULT : newSymmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_TYPE__SYMMETRY, oldSymmetry,
					symmetry, !oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSymmetry() {
		SymmetryType11 oldSymmetry = symmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetry = SYMMETRY_EDEFAULT;
		symmetryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CpacsPackage.NOSE_GEAR_TYPE__SYMMETRY, oldSymmetry,
					SYMMETRY_EDEFAULT, oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSymmetry() {
		return symmetryESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.NOSE_GEAR_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.NOSE_GEAR_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.NOSE_GEAR_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.NOSE_GEAR_TYPE__PARENT_UID:
			return basicSetParentUID(null, msgs);
		case CpacsPackage.NOSE_GEAR_TYPE__FUSELAGE_ATTACHMENT:
			return basicSetFuselageAttachment(null, msgs);
		case CpacsPackage.NOSE_GEAR_TYPE__GLOBAL:
			return basicSetGlobal(null, msgs);
		case CpacsPackage.NOSE_GEAR_TYPE__COMPONENTS:
			return basicSetComponents(null, msgs);
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
		case CpacsPackage.NOSE_GEAR_TYPE__NAME:
			return getName();
		case CpacsPackage.NOSE_GEAR_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.NOSE_GEAR_TYPE__PARENT_UID:
			return getParentUID();
		case CpacsPackage.NOSE_GEAR_TYPE__FUSELAGE_ATTACHMENT:
			return getFuselageAttachment();
		case CpacsPackage.NOSE_GEAR_TYPE__GLOBAL:
			return getGlobal();
		case CpacsPackage.NOSE_GEAR_TYPE__COMPONENTS:
			return getComponents();
		case CpacsPackage.NOSE_GEAR_TYPE__SYMMETRY:
			return getSymmetry();
		case CpacsPackage.NOSE_GEAR_TYPE__UID:
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
		case CpacsPackage.NOSE_GEAR_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__FUSELAGE_ATTACHMENT:
			setFuselageAttachment((TransformationType) newValue);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__GLOBAL:
			setGlobal((NoseGearGlobalType) newValue);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__COMPONENTS:
			setComponents((GearComponentsType) newValue);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__SYMMETRY:
			setSymmetry((SymmetryType11) newValue);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__UID:
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
		case CpacsPackage.NOSE_GEAR_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__FUSELAGE_ATTACHMENT:
			setFuselageAttachment((TransformationType) null);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__GLOBAL:
			setGlobal((NoseGearGlobalType) null);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__COMPONENTS:
			setComponents((GearComponentsType) null);
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__SYMMETRY:
			unsetSymmetry();
			return;
		case CpacsPackage.NOSE_GEAR_TYPE__UID:
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
		case CpacsPackage.NOSE_GEAR_TYPE__NAME:
			return name != null;
		case CpacsPackage.NOSE_GEAR_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.NOSE_GEAR_TYPE__PARENT_UID:
			return parentUID != null;
		case CpacsPackage.NOSE_GEAR_TYPE__FUSELAGE_ATTACHMENT:
			return fuselageAttachment != null;
		case CpacsPackage.NOSE_GEAR_TYPE__GLOBAL:
			return global != null;
		case CpacsPackage.NOSE_GEAR_TYPE__COMPONENTS:
			return components != null;
		case CpacsPackage.NOSE_GEAR_TYPE__SYMMETRY:
			return isSetSymmetry();
		case CpacsPackage.NOSE_GEAR_TYPE__UID:
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
		result.append(" (symmetry: ");
		if (symmetryESet)
			result.append(symmetry);
		else
			result.append("<unset>");
		result.append(", uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //NoseGearTypeImpl
