/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PlasticityCurvePointType;
import Cpacs.PlasticityCurvePointsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plasticity Curve Points Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PlasticityCurvePointsTypeImpl#getPlasticityCurvePoint <em>Plasticity Curve Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlasticityCurvePointsTypeImpl extends MinimalEObjectImpl.Container implements PlasticityCurvePointsType {
	/**
	 * The cached value of the '{@link #getPlasticityCurvePoint() <em>Plasticity Curve Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticityCurvePoint()
	 * @generated
	 * @ordered
	 */
	protected EList<PlasticityCurvePointType> plasticityCurvePoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlasticityCurvePointsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPlasticityCurvePointsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PlasticityCurvePointType> getPlasticityCurvePoint() {
		if (plasticityCurvePoint == null) {
			plasticityCurvePoint = new EObjectContainmentEList<PlasticityCurvePointType>(PlasticityCurvePointType.class,
					this, CpacsPackage.PLASTICITY_CURVE_POINTS_TYPE__PLASTICITY_CURVE_POINT);
		}
		return plasticityCurvePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PLASTICITY_CURVE_POINTS_TYPE__PLASTICITY_CURVE_POINT:
			return ((InternalEList<?>) getPlasticityCurvePoint()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.PLASTICITY_CURVE_POINTS_TYPE__PLASTICITY_CURVE_POINT:
			return getPlasticityCurvePoint();
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
		case CpacsPackage.PLASTICITY_CURVE_POINTS_TYPE__PLASTICITY_CURVE_POINT:
			getPlasticityCurvePoint().clear();
			getPlasticityCurvePoint().addAll((Collection<? extends PlasticityCurvePointType>) newValue);
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
		case CpacsPackage.PLASTICITY_CURVE_POINTS_TYPE__PLASTICITY_CURVE_POINT:
			getPlasticityCurvePoint().clear();
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
		case CpacsPackage.PLASTICITY_CURVE_POINTS_TYPE__PLASTICITY_CURVE_POINT:
			return plasticityCurvePoint != null && !plasticityCurvePoint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PlasticityCurvePointsTypeImpl
