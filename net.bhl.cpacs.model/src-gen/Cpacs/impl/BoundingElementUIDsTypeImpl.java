/**
 */
package Cpacs.impl;

import Cpacs.BoundingElementUIDsType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bounding Element UI Ds Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.BoundingElementUIDsTypeImpl#getBoundingElementUID <em>Bounding Element UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundingElementUIDsTypeImpl extends ComplexBaseTypeImpl implements BoundingElementUIDsType {
	/**
	 * The cached value of the '{@link #getBoundingElementUID() <em>Bounding Element UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundingElementUID()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> boundingElementUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundingElementUIDsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getBoundingElementUIDsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getBoundingElementUID() {
		if (boundingElementUID == null) {
			boundingElementUID = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.BOUNDING_ELEMENT_UI_DS_TYPE__BOUNDING_ELEMENT_UID);
		}
		return boundingElementUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.BOUNDING_ELEMENT_UI_DS_TYPE__BOUNDING_ELEMENT_UID:
			return ((InternalEList<?>) getBoundingElementUID()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.BOUNDING_ELEMENT_UI_DS_TYPE__BOUNDING_ELEMENT_UID:
			return getBoundingElementUID();
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
		case CpacsPackage.BOUNDING_ELEMENT_UI_DS_TYPE__BOUNDING_ELEMENT_UID:
			getBoundingElementUID().clear();
			getBoundingElementUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
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
		case CpacsPackage.BOUNDING_ELEMENT_UI_DS_TYPE__BOUNDING_ELEMENT_UID:
			getBoundingElementUID().clear();
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
		case CpacsPackage.BOUNDING_ELEMENT_UI_DS_TYPE__BOUNDING_ELEMENT_UID:
			return boundingElementUID != null && !boundingElementUID.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BoundingElementUIDsTypeImpl
