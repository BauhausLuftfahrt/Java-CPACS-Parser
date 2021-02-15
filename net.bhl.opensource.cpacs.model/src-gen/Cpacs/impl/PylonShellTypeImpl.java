/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MaterialDefinitionType;
import Cpacs.PylonShellType;
import Cpacs.StringUIDBaseType;
import Cpacs.TransformationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pylon Shell Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PylonShellTypeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.impl.PylonShellTypeImpl#getStructuralProfileUID <em>Structural Profile UID</em>}</li>
 *   <li>{@link Cpacs.impl.PylonShellTypeImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.impl.PylonShellTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PylonShellTypeImpl extends ComplexBaseTypeImpl implements PylonShellType {
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
	 * The cached value of the '{@link #getStructuralProfileUID() <em>Structural Profile UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralProfileUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType structuralProfileUID;

	/**
	 * The cached value of the '{@link #getMaterial() <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterial()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType material;

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
	protected PylonShellTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPylonShellType();
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
					CpacsPackage.PYLON_SHELL_TYPE__TRANSFORMATION, oldTransformation, newTransformation);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_SHELL_TYPE__TRANSFORMATION, null, msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject) newTransformation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_SHELL_TYPE__TRANSFORMATION, null, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_SHELL_TYPE__TRANSFORMATION,
					newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getStructuralProfileUID() {
		return structuralProfileUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructuralProfileUID(StringUIDBaseType newStructuralProfileUID,
			NotificationChain msgs) {
		StringUIDBaseType oldStructuralProfileUID = structuralProfileUID;
		structuralProfileUID = newStructuralProfileUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_SHELL_TYPE__STRUCTURAL_PROFILE_UID, oldStructuralProfileUID,
					newStructuralProfileUID);
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
	public void setStructuralProfileUID(StringUIDBaseType newStructuralProfileUID) {
		if (newStructuralProfileUID != structuralProfileUID) {
			NotificationChain msgs = null;
			if (structuralProfileUID != null)
				msgs = ((InternalEObject) structuralProfileUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_SHELL_TYPE__STRUCTURAL_PROFILE_UID, null, msgs);
			if (newStructuralProfileUID != null)
				msgs = ((InternalEObject) newStructuralProfileUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_SHELL_TYPE__STRUCTURAL_PROFILE_UID, null, msgs);
			msgs = basicSetStructuralProfileUID(newStructuralProfileUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_SHELL_TYPE__STRUCTURAL_PROFILE_UID,
					newStructuralProfileUID, newStructuralProfileUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionType getMaterial() {
		return material;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterial(MaterialDefinitionType newMaterial, NotificationChain msgs) {
		MaterialDefinitionType oldMaterial = material;
		material = newMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.PYLON_SHELL_TYPE__MATERIAL, oldMaterial, newMaterial);
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
	public void setMaterial(MaterialDefinitionType newMaterial) {
		if (newMaterial != material) {
			NotificationChain msgs = null;
			if (material != null)
				msgs = ((InternalEObject) material).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_SHELL_TYPE__MATERIAL, null, msgs);
			if (newMaterial != null)
				msgs = ((InternalEObject) newMaterial).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.PYLON_SHELL_TYPE__MATERIAL, null, msgs);
			msgs = basicSetMaterial(newMaterial, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_SHELL_TYPE__MATERIAL, newMaterial,
					newMaterial));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.PYLON_SHELL_TYPE__UID, oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PYLON_SHELL_TYPE__TRANSFORMATION:
			return basicSetTransformation(null, msgs);
		case CpacsPackage.PYLON_SHELL_TYPE__STRUCTURAL_PROFILE_UID:
			return basicSetStructuralProfileUID(null, msgs);
		case CpacsPackage.PYLON_SHELL_TYPE__MATERIAL:
			return basicSetMaterial(null, msgs);
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
		case CpacsPackage.PYLON_SHELL_TYPE__TRANSFORMATION:
			return getTransformation();
		case CpacsPackage.PYLON_SHELL_TYPE__STRUCTURAL_PROFILE_UID:
			return getStructuralProfileUID();
		case CpacsPackage.PYLON_SHELL_TYPE__MATERIAL:
			return getMaterial();
		case CpacsPackage.PYLON_SHELL_TYPE__UID:
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
		case CpacsPackage.PYLON_SHELL_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) newValue);
			return;
		case CpacsPackage.PYLON_SHELL_TYPE__STRUCTURAL_PROFILE_UID:
			setStructuralProfileUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.PYLON_SHELL_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.PYLON_SHELL_TYPE__UID:
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
		case CpacsPackage.PYLON_SHELL_TYPE__TRANSFORMATION:
			setTransformation((TransformationType) null);
			return;
		case CpacsPackage.PYLON_SHELL_TYPE__STRUCTURAL_PROFILE_UID:
			setStructuralProfileUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.PYLON_SHELL_TYPE__MATERIAL:
			setMaterial((MaterialDefinitionType) null);
			return;
		case CpacsPackage.PYLON_SHELL_TYPE__UID:
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
		case CpacsPackage.PYLON_SHELL_TYPE__TRANSFORMATION:
			return transformation != null;
		case CpacsPackage.PYLON_SHELL_TYPE__STRUCTURAL_PROFILE_UID:
			return structuralProfileUID != null;
		case CpacsPackage.PYLON_SHELL_TYPE__MATERIAL:
			return material != null;
		case CpacsPackage.PYLON_SHELL_TYPE__UID:
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

} //PylonShellTypeImpl
