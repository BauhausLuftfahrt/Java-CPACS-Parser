/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PointPerformanceType;
import Cpacs.PointPerformancesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Performances Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PointPerformancesTypeImpl#getPointPerformance <em>Point Performance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointPerformancesTypeImpl extends ComplexBaseTypeImpl implements PointPerformancesType {
	/**
	 * The cached value of the '{@link #getPointPerformance() <em>Point Performance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointPerformance()
	 * @generated
	 * @ordered
	 */
	protected EList<PointPerformanceType> pointPerformance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointPerformancesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPointPerformancesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PointPerformanceType> getPointPerformance() {
		if (pointPerformance == null) {
			pointPerformance = new EObjectContainmentEList<PointPerformanceType>(PointPerformanceType.class, this,
					CpacsPackage.POINT_PERFORMANCES_TYPE__POINT_PERFORMANCE);
		}
		return pointPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.POINT_PERFORMANCES_TYPE__POINT_PERFORMANCE:
			return ((InternalEList<?>) getPointPerformance()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.POINT_PERFORMANCES_TYPE__POINT_PERFORMANCE:
			return getPointPerformance();
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
		case CpacsPackage.POINT_PERFORMANCES_TYPE__POINT_PERFORMANCE:
			getPointPerformance().clear();
			getPointPerformance().addAll((Collection<? extends PointPerformanceType>) newValue);
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
		case CpacsPackage.POINT_PERFORMANCES_TYPE__POINT_PERFORMANCE:
			getPointPerformance().clear();
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
		case CpacsPackage.POINT_PERFORMANCES_TYPE__POINT_PERFORMANCE:
			return pointPerformance != null && !pointPerformance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PointPerformancesTypeImpl
