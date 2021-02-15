/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GenericComponentCoefficientsType;
import Cpacs.GenericComponentsCoefficientsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Components Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GenericComponentsCoefficientsTypeImpl#getGenericComponent <em>Generic Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericComponentsCoefficientsTypeImpl extends ComplexBaseTypeImpl
		implements GenericComponentsCoefficientsType {
	/**
	 * The cached value of the '{@link #getGenericComponent() <em>Generic Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericComponentCoefficientsType> genericComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericComponentsCoefficientsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGenericComponentsCoefficientsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericComponentCoefficientsType> getGenericComponent() {
		if (genericComponent == null) {
			genericComponent = new EObjectContainmentEList<GenericComponentCoefficientsType>(
					GenericComponentCoefficientsType.class, this,
					CpacsPackage.GENERIC_COMPONENTS_COEFFICIENTS_TYPE__GENERIC_COMPONENT);
		}
		return genericComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GENERIC_COMPONENTS_COEFFICIENTS_TYPE__GENERIC_COMPONENT:
			return ((InternalEList<?>) getGenericComponent()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GENERIC_COMPONENTS_COEFFICIENTS_TYPE__GENERIC_COMPONENT:
			return getGenericComponent();
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
		case CpacsPackage.GENERIC_COMPONENTS_COEFFICIENTS_TYPE__GENERIC_COMPONENT:
			getGenericComponent().clear();
			getGenericComponent().addAll((Collection<? extends GenericComponentCoefficientsType>) newValue);
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
		case CpacsPackage.GENERIC_COMPONENTS_COEFFICIENTS_TYPE__GENERIC_COMPONENT:
			getGenericComponent().clear();
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
		case CpacsPackage.GENERIC_COMPONENTS_COEFFICIENTS_TYPE__GENERIC_COMPONENT:
			return genericComponent != null && !genericComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenericComponentsCoefficientsTypeImpl
