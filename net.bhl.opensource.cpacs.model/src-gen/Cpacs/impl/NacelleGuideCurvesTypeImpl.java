/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.NacelleGuideCurveType;
import Cpacs.NacelleGuideCurvesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nacelle Guide Curves Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.NacelleGuideCurvesTypeImpl#getNacelleGuideCurve <em>Nacelle Guide Curve</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NacelleGuideCurvesTypeImpl extends ComplexBaseTypeImpl implements NacelleGuideCurvesType {
	/**
	 * The cached value of the '{@link #getNacelleGuideCurve() <em>Nacelle Guide Curve</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNacelleGuideCurve()
	 * @generated
	 * @ordered
	 */
	protected EList<NacelleGuideCurveType> nacelleGuideCurve;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NacelleGuideCurvesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getNacelleGuideCurvesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NacelleGuideCurveType> getNacelleGuideCurve() {
		if (nacelleGuideCurve == null) {
			nacelleGuideCurve = new EObjectContainmentEList<NacelleGuideCurveType>(NacelleGuideCurveType.class, this,
					CpacsPackage.NACELLE_GUIDE_CURVES_TYPE__NACELLE_GUIDE_CURVE);
		}
		return nacelleGuideCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.NACELLE_GUIDE_CURVES_TYPE__NACELLE_GUIDE_CURVE:
			return ((InternalEList<?>) getNacelleGuideCurve()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.NACELLE_GUIDE_CURVES_TYPE__NACELLE_GUIDE_CURVE:
			return getNacelleGuideCurve();
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
		case CpacsPackage.NACELLE_GUIDE_CURVES_TYPE__NACELLE_GUIDE_CURVE:
			getNacelleGuideCurve().clear();
			getNacelleGuideCurve().addAll((Collection<? extends NacelleGuideCurveType>) newValue);
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
		case CpacsPackage.NACELLE_GUIDE_CURVES_TYPE__NACELLE_GUIDE_CURVE:
			getNacelleGuideCurve().clear();
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
		case CpacsPackage.NACELLE_GUIDE_CURVES_TYPE__NACELLE_GUIDE_CURVE:
			return nacelleGuideCurve != null && !nacelleGuideCurve.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NacelleGuideCurvesTypeImpl
