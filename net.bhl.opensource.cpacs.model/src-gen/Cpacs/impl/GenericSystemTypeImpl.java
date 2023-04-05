/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericSystemType;
import Cpacs.GeometricBaseTypeType;
import Cpacs.StringBaseType;
import Cpacs.SymmetryXyXzYzType;
import Cpacs.TransformationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GenericSystemTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.impl.GenericSystemTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.impl.GenericSystemTypeImpl#getGeometricBaseType <em>Geometric Base Type</em>}</li>
 *   <li>{@link Cpacs.impl.GenericSystemTypeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.impl.GenericSystemTypeImpl#getSymmetry <em>Symmetry</em>}</li>
 *   <li>{@link Cpacs.impl.GenericSystemTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericSystemTypeImpl extends ComplexBaseTypeImpl implements GenericSystemType {
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
	 * The default value of the '{@link #getGeometricBaseType() <em>Geometric Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometricBaseType()
	 * @generated
	 * @ordered
	 */
	protected static final GeometricBaseTypeType GEOMETRIC_BASE_TYPE_EDEFAULT = GeometricBaseTypeType.CONE;

	/**
	 * The cached value of the '{@link #getGeometricBaseType() <em>Geometric Base Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometricBaseType()
	 * @generated
	 * @ordered
	 */
	protected GeometricBaseTypeType geometricBaseType = GEOMETRIC_BASE_TYPE_EDEFAULT;

	/**
	 * This is true if the Geometric Base Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geometricBaseTypeESet;

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
	protected GenericSystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGenericSystemType();
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
					CpacsPackage.GENERIC_SYSTEM_TYPE__NAME, oldName, newName);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_SYSTEM_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_SYSTEM_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_SYSTEM_TYPE__NAME, newName,
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
					CpacsPackage.GENERIC_SYSTEM_TYPE__DESCRIPTION, oldDescription, newDescription);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_SYSTEM_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_SYSTEM_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_SYSTEM_TYPE__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometricBaseTypeType getGeometricBaseType() {
		return geometricBaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeometricBaseType(GeometricBaseTypeType newGeometricBaseType) {
		GeometricBaseTypeType oldGeometricBaseType = geometricBaseType;
		geometricBaseType = newGeometricBaseType == null ? GEOMETRIC_BASE_TYPE_EDEFAULT : newGeometricBaseType;
		boolean oldGeometricBaseTypeESet = geometricBaseTypeESet;
		geometricBaseTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_SYSTEM_TYPE__GEOMETRIC_BASE_TYPE,
					oldGeometricBaseType, geometricBaseType, !oldGeometricBaseTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGeometricBaseType() {
		GeometricBaseTypeType oldGeometricBaseType = geometricBaseType;
		boolean oldGeometricBaseTypeESet = geometricBaseTypeESet;
		geometricBaseType = GEOMETRIC_BASE_TYPE_EDEFAULT;
		geometricBaseTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					CpacsPackage.GENERIC_SYSTEM_TYPE__GEOMETRIC_BASE_TYPE, oldGeometricBaseType,
					GEOMETRIC_BASE_TYPE_EDEFAULT, oldGeometricBaseTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGeometricBaseType() {
		return geometricBaseTypeESet;
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
					CpacsPackage.GENERIC_SYSTEM_TYPE__TRANSFORMATION, oldTransformation, newTransformation);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_SYSTEM_TYPE__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GENERIC_SYSTEM_TYPE__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_SYSTEM_TYPE__TRANSFORMATION,
					newTransformation, newTransformation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_SYSTEM_TYPE__SYMMETRY,
					oldSymmetry, symmetry, !oldSymmetryESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CpacsPackage.GENERIC_SYSTEM_TYPE__SYMMETRY,
					oldSymmetry, SYMMETRY_EDEFAULT, oldSymmetryESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GENERIC_SYSTEM_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GENERIC_SYSTEM_TYPE__NAME:
			return basicSetName(null, msgs);
		case CpacsPackage.GENERIC_SYSTEM_TYPE__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case CpacsPackage.GENERIC_SYSTEM_TYPE__TRANSFORMATION:
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
		case CpacsPackage.GENERIC_SYSTEM_TYPE__NAME:
			return getName();
		case CpacsPackage.GENERIC_SYSTEM_TYPE__DESCRIPTION:
			return getDescription();
		case CpacsPackage.GENERIC_SYSTEM_TYPE__GEOMETRIC_BASE_TYPE:
			return getGeometricBaseType();
		case CpacsPackage.GENERIC_SYSTEM_TYPE__TRANSFORMATION:
			return getTransformation();
		case CpacsPackage.GENERIC_SYSTEM_TYPE__SYMMETRY:
			return getSymmetry();
		case CpacsPackage.GENERIC_SYSTEM_TYPE__UID:
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
		case CpacsPackage.GENERIC_SYSTEM_TYPE__NAME:
			setName((StringBaseType) newValue);
			return;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__DESCRIPTION:
			setDescription((StringBaseType) newValue);
			return;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__GEOMETRIC_BASE_TYPE:
			setGeometricBaseType((GeometricBaseTypeType) newValue);
			return;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) newValue);
			return;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__SYMMETRY:
			setSymmetry((SymmetryXyXzYzType) newValue);
			return;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__UID:
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
		case CpacsPackage.GENERIC_SYSTEM_TYPE__NAME:
			setName((StringBaseType) null);
			return;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__DESCRIPTION:
			setDescription((StringBaseType) null);
			return;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__GEOMETRIC_BASE_TYPE:
			unsetGeometricBaseType();
			return;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) null);
			return;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__SYMMETRY:
			unsetSymmetry();
			return;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__UID:
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
		case CpacsPackage.GENERIC_SYSTEM_TYPE__NAME:
			return name != null;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__DESCRIPTION:
			return description != null;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__GEOMETRIC_BASE_TYPE:
			return isSetGeometricBaseType();
		case CpacsPackage.GENERIC_SYSTEM_TYPE__TRANSFORMATION:
			return transformation != null;
		case CpacsPackage.GENERIC_SYSTEM_TYPE__SYMMETRY:
			return isSetSymmetry();
		case CpacsPackage.GENERIC_SYSTEM_TYPE__UID:
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
		result.append(" (geometricBaseType: ");
		if (geometricBaseTypeESet)
			result.append(geometricBaseType);
		else
			result.append("<unset>");
		result.append(", symmetry: ");
		if (symmetryESet)
			result.append(symmetry);
		else
			result.append("<unset>");
		result.append(", uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //GenericSystemTypeImpl
