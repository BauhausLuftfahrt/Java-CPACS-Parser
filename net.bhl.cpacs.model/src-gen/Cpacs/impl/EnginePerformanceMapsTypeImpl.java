/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.EnginePerformanceMapType;
import Cpacs.EnginePerformanceMapsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine Performance Maps Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.EnginePerformanceMapsTypeImpl#getPerformanceMap <em>Performance Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnginePerformanceMapsTypeImpl extends ComplexBaseTypeImpl implements EnginePerformanceMapsType {
	/**
	 * The cached value of the '{@link #getPerformanceMap() <em>Performance Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<EnginePerformanceMapType> performanceMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnginePerformanceMapsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getEnginePerformanceMapsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnginePerformanceMapType> getPerformanceMap() {
		if (performanceMap == null) {
			performanceMap = new EObjectContainmentEList<EnginePerformanceMapType>(EnginePerformanceMapType.class, this,
					CpacsPackage.ENGINE_PERFORMANCE_MAPS_TYPE__PERFORMANCE_MAP);
		}
		return performanceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ENGINE_PERFORMANCE_MAPS_TYPE__PERFORMANCE_MAP:
			return ((InternalEList<?>) getPerformanceMap()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.ENGINE_PERFORMANCE_MAPS_TYPE__PERFORMANCE_MAP:
			return getPerformanceMap();
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
		case CpacsPackage.ENGINE_PERFORMANCE_MAPS_TYPE__PERFORMANCE_MAP:
			getPerformanceMap().clear();
			getPerformanceMap().addAll((Collection<? extends EnginePerformanceMapType>) newValue);
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
		case CpacsPackage.ENGINE_PERFORMANCE_MAPS_TYPE__PERFORMANCE_MAP:
			getPerformanceMap().clear();
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
		case CpacsPackage.ENGINE_PERFORMANCE_MAPS_TYPE__PERFORMANCE_MAP:
			return performanceMap != null && !performanceMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnginePerformanceMapsTypeImpl
