/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckComponent2DBaseType;
import Cpacs.DeckStructuralMountsType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.Transformation2DType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deck Component2 DBase Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.DeckComponent2DBaseTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.DeckComponent2DBaseTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.DeckComponent2DBaseTypeImpl#getDeckElementUID <em>Deck Element UID</em>}</li>
 *   <li>{@link Cpacs.impl.DeckComponent2DBaseTypeImpl#getStructuralMounts <em>Structural Mounts</em>}</li>
 *   <li>{@link Cpacs.impl.DeckComponent2DBaseTypeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.impl.DeckComponent2DBaseTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeckComponent2DBaseTypeImpl extends ComplexBaseTypeImpl implements DeckComponent2DBaseType {
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
	 * The cached value of the '{@link #getDeckElementUID() <em>Deck Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeckElementUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType deckElementUID;

	/**
	 * The cached value of the '{@link #getStructuralMounts() <em>Structural Mounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralMounts()
	 * @generated
	 * @ordered
	 */
	protected DeckStructuralMountsType structuralMounts;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected Transformation2DType transformation;

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
	protected DeckComponent2DBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getDeckComponent2DBaseType();
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
					CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__NAME,
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
					CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getDeckElementUID() {
		return deckElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeckElementUID(StringUIDBaseType newDeckElementUID, NotificationChain msgs) {
		StringUIDBaseType oldDeckElementUID = deckElementUID;
		deckElementUID = newDeckElementUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DECK_ELEMENT_UID, oldDeckElementUID, newDeckElementUID);
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
	public void setDeckElementUID(StringUIDBaseType newDeckElementUID) {
		if (newDeckElementUID != deckElementUID) {
			NotificationChain msgs = null;
			if (deckElementUID != null)
				msgs = ((InternalEObject) deckElementUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DECK_ELEMENT_UID, null, msgs);
			if (newDeckElementUID != null)
				msgs = ((InternalEObject) newDeckElementUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DECK_ELEMENT_UID, null, msgs);
			msgs = basicSetDeckElementUID(newDeckElementUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DECK_ELEMENT_UID, newDeckElementUID, newDeckElementUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeckStructuralMountsType getStructuralMounts() {
		return structuralMounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralMounts(DeckStructuralMountsType newStructuralMounts,
			NotificationChain msgs) {
		DeckStructuralMountsType oldStructuralMounts = structuralMounts;
		structuralMounts = newStructuralMounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__STRUCTURAL_MOUNTS, oldStructuralMounts,
					newStructuralMounts);
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
	public void setStructuralMounts(DeckStructuralMountsType newStructuralMounts) {
		if (newStructuralMounts != structuralMounts) {
			NotificationChain msgs = null;
			if (structuralMounts != null)
				msgs = ((InternalEObject) structuralMounts).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__STRUCTURAL_MOUNTS, null,
						msgs);
			if (newStructuralMounts != null)
				msgs = ((InternalEObject) newStructuralMounts).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__STRUCTURAL_MOUNTS, null,
						msgs);
			msgs = basicSetStructuralMounts(newStructuralMounts, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__STRUCTURAL_MOUNTS, newStructuralMounts,
					newStructuralMounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transformation2DType getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(Transformation2DType newTransformation, NotificationChain msgs) {
		Transformation2DType oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__TRANSFORMATION, oldTransformation, newTransformation);
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
	public void setTransformation(Transformation2DType newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject) transformation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__TRANSFORMATION, newTransformation, newTransformation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__UID, oldUID,
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
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DECK_ELEMENT_UID:
			return basicSetDeckElementUID(null, msgs);
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__STRUCTURAL_MOUNTS:
			return basicSetStructuralMounts(null, msgs);
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
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
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__NAME:
			return getName();
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DECK_ELEMENT_UID:
			return getDeckElementUID();
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__STRUCTURAL_MOUNTS:
			return getStructuralMounts();
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__TRANSFORMATION:
			return getTransformation();
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__UID:
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
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DECK_ELEMENT_UID:
			setDeckElementUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__STRUCTURAL_MOUNTS:
			setStructuralMounts((DeckStructuralMountsType) newValue);
			return;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__TRANSFORMATION:
			setTransformation((Transformation2DType) newValue);
			return;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__UID:
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
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DECK_ELEMENT_UID:
			setDeckElementUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__STRUCTURAL_MOUNTS:
			setStructuralMounts((DeckStructuralMountsType) null);
			return;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__TRANSFORMATION:
			setTransformation((Transformation2DType) null);
			return;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__UID:
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
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__NAME:
			return name != null;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__DECK_ELEMENT_UID:
			return deckElementUID != null;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__STRUCTURAL_MOUNTS:
			return structuralMounts != null;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__TRANSFORMATION:
			return transformation != null;
		case CpacsPackage.DECK_COMPONENT2_DBASE_TYPE__UID:
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

} //DeckComponent2DBaseTypeImpl
