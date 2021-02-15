/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GuideCurveType;
import Cpacs.GuideCurvesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guide Curves Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GuideCurvesTypeImpl#getGuideCurve <em>Guide Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuideCurvesTypeImpl extends ComplexBaseTypeImpl implements GuideCurvesType {
	/**
	 * The cached value of the '{@link #getGuideCurve() <em>Guide Curve</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideCurve()
	 * @generated
	 * @ordered
	 */
	protected EList<GuideCurveType> guideCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuideCurvesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGuideCurvesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GuideCurveType> getGuideCurve() {
		if (guideCurve == null) {
			guideCurve = new EObjectContainmentEList<GuideCurveType>(GuideCurveType.class, this,
					CpacsPackage.GUIDE_CURVES_TYPE__GUIDE_CURVE);
		}
		return guideCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GUIDE_CURVES_TYPE__GUIDE_CURVE:
			return ((InternalEList<?>) getGuideCurve()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GUIDE_CURVES_TYPE__GUIDE_CURVE:
			return getGuideCurve();
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
		case CpacsPackage.GUIDE_CURVES_TYPE__GUIDE_CURVE:
			getGuideCurve().clear();
			getGuideCurve().addAll((Collection<? extends GuideCurveType>) newValue);
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
		case CpacsPackage.GUIDE_CURVES_TYPE__GUIDE_CURVE:
			getGuideCurve().clear();
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
		case CpacsPackage.GUIDE_CURVES_TYPE__GUIDE_CURVE:
			return guideCurve != null && !guideCurve.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuideCurvesTypeImpl
