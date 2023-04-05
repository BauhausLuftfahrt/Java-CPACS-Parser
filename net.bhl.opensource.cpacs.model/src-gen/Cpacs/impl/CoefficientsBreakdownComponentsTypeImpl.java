/**
 */
package Cpacs.impl;

import Cpacs.CoefficientsBreakdownComponentType;
import Cpacs.CoefficientsBreakdownComponentsType;
import Cpacs.CpacsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coefficients Breakdown Components Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownComponentsTypeImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoefficientsBreakdownComponentsTypeImpl extends ComplexBaseTypeImpl
		implements CoefficientsBreakdownComponentsType {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<CoefficientsBreakdownComponentType> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoefficientsBreakdownComponentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCoefficientsBreakdownComponentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoefficientsBreakdownComponentType> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<CoefficientsBreakdownComponentType>(
					CoefficientsBreakdownComponentType.class, this,
					CpacsPackage.COEFFICIENTS_BREAKDOWN_COMPONENTS_TYPE__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_COMPONENTS_TYPE__COMPONENT:
			return ((InternalEList<?>) getComponent()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_COMPONENTS_TYPE__COMPONENT:
			return getComponent();
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_COMPONENTS_TYPE__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends CoefficientsBreakdownComponentType>) newValue);
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_COMPONENTS_TYPE__COMPONENT:
			getComponent().clear();
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_COMPONENTS_TYPE__COMPONENT:
			return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoefficientsBreakdownComponentsTypeImpl
