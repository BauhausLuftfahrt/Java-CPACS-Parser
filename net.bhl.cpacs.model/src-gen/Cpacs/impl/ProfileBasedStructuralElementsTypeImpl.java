/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.ProfileBasedStructuralElementType;
import Cpacs.ProfileBasedStructuralElementsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Based Structural Elements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ProfileBasedStructuralElementsTypeImpl#getProfileBasedStructuralElement <em>Profile Based Structural Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileBasedStructuralElementsTypeImpl extends ComplexBaseTypeImpl
		implements ProfileBasedStructuralElementsType {
	/**
	 * The cached value of the '{@link #getProfileBasedStructuralElement() <em>Profile Based Structural Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileBasedStructuralElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileBasedStructuralElementType> profileBasedStructuralElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileBasedStructuralElementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getProfileBasedStructuralElementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProfileBasedStructuralElementType> getProfileBasedStructuralElement() {
		if (profileBasedStructuralElement == null) {
			profileBasedStructuralElement = new EObjectContainmentEList<ProfileBasedStructuralElementType>(
					ProfileBasedStructuralElementType.class, this,
					CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENT);
		}
		return profileBasedStructuralElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENT:
			return ((InternalEList<?>) getProfileBasedStructuralElement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENT:
			return getProfileBasedStructuralElement();
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
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENT:
			getProfileBasedStructuralElement().clear();
			getProfileBasedStructuralElement()
					.addAll((Collection<? extends ProfileBasedStructuralElementType>) newValue);
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
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENT:
			getProfileBasedStructuralElement().clear();
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
		case CpacsPackage.PROFILE_BASED_STRUCTURAL_ELEMENTS_TYPE__PROFILE_BASED_STRUCTURAL_ELEMENT:
			return profileBasedStructuralElement != null && !profileBasedStructuralElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProfileBasedStructuralElementsTypeImpl
