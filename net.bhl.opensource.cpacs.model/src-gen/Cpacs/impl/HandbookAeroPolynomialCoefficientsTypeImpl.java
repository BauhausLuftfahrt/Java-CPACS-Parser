/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.HandbookAeroPolynomialCoefficientsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handbook Aero Polynomial Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.HandbookAeroPolynomialCoefficientsTypeImpl#getPolynomialCoefficient <em>Polynomial Coefficient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HandbookAeroPolynomialCoefficientsTypeImpl extends ComplexBaseTypeImpl
		implements HandbookAeroPolynomialCoefficientsType {
	/**
	 * The cached value of the '{@link #getPolynomialCoefficient() <em>Polynomial Coefficient</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolynomialCoefficient()
	 * @generated
	 * @ordered
	 */
	protected EList<DoubleBaseType> polynomialCoefficient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandbookAeroPolynomialCoefficientsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getHandbookAeroPolynomialCoefficientsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DoubleBaseType> getPolynomialCoefficient() {
		if (polynomialCoefficient == null) {
			polynomialCoefficient = new EObjectContainmentEList<DoubleBaseType>(DoubleBaseType.class, this,
					CpacsPackage.HANDBOOK_AERO_POLYNOMIAL_COEFFICIENTS_TYPE__POLYNOMIAL_COEFFICIENT);
		}
		return polynomialCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.HANDBOOK_AERO_POLYNOMIAL_COEFFICIENTS_TYPE__POLYNOMIAL_COEFFICIENT:
			return ((InternalEList<?>) getPolynomialCoefficient()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.HANDBOOK_AERO_POLYNOMIAL_COEFFICIENTS_TYPE__POLYNOMIAL_COEFFICIENT:
			return getPolynomialCoefficient();
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
		case CpacsPackage.HANDBOOK_AERO_POLYNOMIAL_COEFFICIENTS_TYPE__POLYNOMIAL_COEFFICIENT:
			getPolynomialCoefficient().clear();
			getPolynomialCoefficient().addAll((Collection<? extends DoubleBaseType>) newValue);
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
		case CpacsPackage.HANDBOOK_AERO_POLYNOMIAL_COEFFICIENTS_TYPE__POLYNOMIAL_COEFFICIENT:
			getPolynomialCoefficient().clear();
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
		case CpacsPackage.HANDBOOK_AERO_POLYNOMIAL_COEFFICIENTS_TYPE__POLYNOMIAL_COEFFICIENT:
			return polynomialCoefficient != null && !polynomialCoefficient.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HandbookAeroPolynomialCoefficientsTypeImpl
