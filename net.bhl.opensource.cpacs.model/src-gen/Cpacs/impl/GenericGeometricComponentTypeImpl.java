/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericGeometricComponentType;
import Cpacs.LinkToFileType;
import Cpacs.StringBaseType;
import Cpacs.StringUIDBaseType;
import Cpacs.SymmetryXyXzYzType;
import Cpacs.TransformationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Geometric Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GenericGeometricComponentTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.GenericGeometricComponentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.GenericGeometricComponentTypeImpl#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.impl.GenericGeometricComponentTypeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.impl.GenericGeometricComponentTypeImpl#getLinkToFile <em>Link To File</em>}</li>
 *   <li>{@link Cpacs.impl.GenericGeometricComponentTypeImpl#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.impl.GenericGeometricComponentTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericGeometricComponentTypeImpl extends ComplexBaseTypeImpl implements GenericGeometricComponentType {
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
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected TransformationType transformation;

	/**
	 * The cached value of the '{@link #getLinkToFile() <em>Link To File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkToFile()
	 * @generated
	 * @ordered
	 */
	protected LinkToFileType linkToFile;

	/**
	 * The default value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected static final SymmetryXyXzYzType SYMMETRY_EDEFAULT = SymmetryXyXzYzType.NONE;

	/**
	 * The cached value of the '{@link #getSymmetry() <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymmetry()
	 * @generated
	 * @ordered
	 */
	protected SymmetryXyXzYzType symmetry = SYMMETRY_EDEFAULT;

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
	protected GenericGeometricComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGenericGeometricComponentType();
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
					CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__NAME,
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
					CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__DESCRIPTION, null,
						msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__DESCRIPTION, null,
						msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__DESCRIPTION, newDescription, newDescription));
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
					CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__PARENT_UID, oldParentUID, newParentUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__PARENT_UID, null, msgs);
			if (newParentUID != null)
				msgs = ((InternalEObject) newParentUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__PARENT_UID, null, msgs);
			msgs = basicSetParentUID(newParentUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__PARENT_UID, newParentUID, newParentUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationType getTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(TransformationType newTransformation, NotificationChain msgs) {
		TransformationType oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__TRANSFORMATION, oldTransformation,
					newTransformation);
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
	public void setTransformation(TransformationType newTransformation) {
		if (newTransformation != transformation) {
			NotificationChain msgs = null;
			if (transformation != null)
				msgs = ((InternalEObject) transformation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__TRANSFORMATION, null,
						msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__TRANSFORMATION, null,
						msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__TRANSFORMATION, newTransformation,
					newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkToFileType getLinkToFile() {
		return linkToFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkToFile(LinkToFileType newLinkToFile, NotificationChain msgs) {
		LinkToFileType oldLinkToFile = linkToFile;
		linkToFile = newLinkToFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__LINK_TO_FILE, oldLinkToFile, newLinkToFile);
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
	public void setLinkToFile(LinkToFileType newLinkToFile) {
		if (newLinkToFile != linkToFile) {
			NotificationChain msgs = null;
			if (linkToFile != null)
				msgs = ((InternalEObject) linkToFile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__LINK_TO_FILE, null,
						msgs);
			if (newLinkToFile != null)
				msgs = ((InternalEObject) newLinkToFile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__LINK_TO_FILE, null,
						msgs);
			msgs = basicSetLinkToFile(newLinkToFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__LINK_TO_FILE, newLinkToFile, newLinkToFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymmetryXyXzYzType getSymmetry() {
		return symmetry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymmetry(SymmetryXyXzYzType newSymmetry) {
		SymmetryXyXzYzType oldSymmetry = symmetry;
		symmetry = newSymmetry == null ? SYMMETRY_EDEFAULT : newSymmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__SYMMETRY, oldSymmetry, symmetry, !oldSymmetryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSymmetry() {
		SymmetryXyXzYzType oldSymmetry = symmetry;
		boolean oldSymmetryESet = symmetryESet;
		symmetry = SYMMETRY_EDEFAULT;
		symmetryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__SYMMETRY, oldSymmetry, SYMMETRY_EDEFAULT,
					oldSymmetryESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__UID,
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
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__PARENT_UID:
			return basicSetParentUID(null, msgs);
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__LINK_TO_FILE:
			return basicSetLinkToFile(null, msgs);
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
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__NAME:
			return getName();
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__PARENT_UID:
			return getParentUID();
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__TRANSFORMATION:
			return getTransformation();
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__LINK_TO_FILE:
			return getLinkToFile();
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__SYMMETRY:
			return getSymmetry();
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__UID:
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
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) newValue);
			return;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__LINK_TO_FILE:
			setLinkToFile((LinkToFileType) newValue);
			return;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__SYMMETRY:
			setSymmetry((SymmetryXyXzYzType) newValue);
			return;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__UID:
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
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__PARENT_UID:
			setParentUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) null);
			return;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__LINK_TO_FILE:
			setLinkToFile((LinkToFileType) null);
			return;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__SYMMETRY:
			unsetSymmetry();
			return;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__UID:
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
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__NAME:
			return name != null;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__PARENT_UID:
			return parentUID != null;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__TRANSFORMATION:
			return transformation != null;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__LINK_TO_FILE:
			return linkToFile != null;
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__SYMMETRY:
			return isSetSymmetry();
		case CpacsPackage.GENERIC_GEOMETRIC_COMPONENT_TYPE__UID:
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

} //GenericGeometricComponentTypeImpl
