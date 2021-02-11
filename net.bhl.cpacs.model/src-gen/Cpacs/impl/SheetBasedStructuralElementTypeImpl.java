/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.MaterialDefinitionType;
import Cpacs.SheetBasedStructuralElementType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheet Based Structural Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SheetBasedStructuralElementTypeImpl#getMaterialDefinition <em>Material Definition</em>}</li>
 *   <li>{@link Cpacs.impl.SheetBasedStructuralElementTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SheetBasedStructuralElementTypeImpl extends ComplexBaseTypeImpl
		implements SheetBasedStructuralElementType {
	/**
	 * The cached value of the '{@link #getMaterialDefinition() <em>Material Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialDefinition()
	 * @generated
	 * @ordered
	 */
	protected MaterialDefinitionType materialDefinition;

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
	protected SheetBasedStructuralElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSheetBasedStructuralElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialDefinitionType getMaterialDefinition() {
		return materialDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaterialDefinition(MaterialDefinitionType newMaterialDefinition,
			NotificationChain msgs) {
		MaterialDefinitionType oldMaterialDefinition = materialDefinition;
		materialDefinition = newMaterialDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__MATERIAL_DEFINITION, oldMaterialDefinition,
					newMaterialDefinition);
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
	public void setMaterialDefinition(MaterialDefinitionType newMaterialDefinition) {
		if (newMaterialDefinition != materialDefinition) {
			NotificationChain msgs = null;
			if (materialDefinition != null)
				msgs = ((InternalEObject) materialDefinition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__MATERIAL_DEFINITION,
						null, msgs);
			if (newMaterialDefinition != null)
				msgs = ((InternalEObject) newMaterialDefinition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__MATERIAL_DEFINITION,
						null, msgs);
			msgs = basicSetMaterialDefinition(newMaterialDefinition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__MATERIAL_DEFINITION, newMaterialDefinition,
					newMaterialDefinition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__UID,
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
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__MATERIAL_DEFINITION:
			return basicSetMaterialDefinition(null, msgs);
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
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__MATERIAL_DEFINITION:
			return getMaterialDefinition();
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__UID:
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
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__MATERIAL_DEFINITION:
			setMaterialDefinition((MaterialDefinitionType) newValue);
			return;
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__UID:
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
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__MATERIAL_DEFINITION:
			setMaterialDefinition((MaterialDefinitionType) null);
			return;
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__UID:
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
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__MATERIAL_DEFINITION:
			return materialDefinition != null;
		case CpacsPackage.SHEET_BASED_STRUCTURAL_ELEMENT_TYPE__UID:
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

} //SheetBasedStructuralElementTypeImpl
