/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PlasticityCurveType;
import Cpacs.PlasticityCurvesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plasticity Curves Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PlasticityCurvesTypeImpl#getPlasticityCurve <em>Plasticity Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlasticityCurvesTypeImpl extends ComplexBaseTypeImpl implements PlasticityCurvesType {
	/**
	 * The cached value of the '{@link #getPlasticityCurve() <em>Plasticity Curve</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticityCurve()
	 * @generated
	 * @ordered
	 */
	protected EList<PlasticityCurveType> plasticityCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlasticityCurvesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPlasticityCurvesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlasticityCurveType> getPlasticityCurve() {
		if (plasticityCurve == null) {
			plasticityCurve = new EObjectContainmentEList<PlasticityCurveType>(PlasticityCurveType.class, this,
					CpacsPackage.PLASTICITY_CURVES_TYPE__PLASTICITY_CURVE);
		}
		return plasticityCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PLASTICITY_CURVES_TYPE__PLASTICITY_CURVE:
			return ((InternalEList<?>) getPlasticityCurve()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.PLASTICITY_CURVES_TYPE__PLASTICITY_CURVE:
			return getPlasticityCurve();
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
		case CpacsPackage.PLASTICITY_CURVES_TYPE__PLASTICITY_CURVE:
			getPlasticityCurve().clear();
			getPlasticityCurve().addAll((Collection<? extends PlasticityCurveType>) newValue);
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
		case CpacsPackage.PLASTICITY_CURVES_TYPE__PLASTICITY_CURVE:
			getPlasticityCurve().clear();
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
		case CpacsPackage.PLASTICITY_CURVES_TYPE__PLASTICITY_CURVE:
			return plasticityCurve != null && !plasticityCurve.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlasticityCurvesTypeImpl
