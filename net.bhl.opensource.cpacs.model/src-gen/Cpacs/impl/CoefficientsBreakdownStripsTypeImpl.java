/**
 */
package Cpacs.impl;

import Cpacs.CoefficientsBreakdownStripType;
import Cpacs.CoefficientsBreakdownStripsType;
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
 * An implementation of the model object '<em><b>Coefficients Breakdown Strips Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CoefficientsBreakdownStripsTypeImpl#getStrip <em>Strip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoefficientsBreakdownStripsTypeImpl extends ComplexBaseTypeImpl
		implements CoefficientsBreakdownStripsType {
	/**
	 * The cached value of the '{@link #getStrip() <em>Strip</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrip()
	 * @generated
	 * @ordered
	 */
	protected EList<CoefficientsBreakdownStripType> strip;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoefficientsBreakdownStripsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCoefficientsBreakdownStripsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoefficientsBreakdownStripType> getStrip() {
		if (strip == null) {
			strip = new EObjectContainmentEList<CoefficientsBreakdownStripType>(CoefficientsBreakdownStripType.class,
					this, CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIPS_TYPE__STRIP);
		}
		return strip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIPS_TYPE__STRIP:
			return ((InternalEList<?>) getStrip()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIPS_TYPE__STRIP:
			return getStrip();
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIPS_TYPE__STRIP:
			getStrip().clear();
			getStrip().addAll((Collection<? extends CoefficientsBreakdownStripType>) newValue);
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIPS_TYPE__STRIP:
			getStrip().clear();
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
		case CpacsPackage.COEFFICIENTS_BREAKDOWN_STRIPS_TYPE__STRIP:
			return strip != null && !strip.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoefficientsBreakdownStripsTypeImpl
