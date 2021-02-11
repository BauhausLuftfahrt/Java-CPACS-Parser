/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SpecificPerformanceMapType;
import Cpacs.SpecificPerformanceMapsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Performance Maps Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SpecificPerformanceMapsTypeImpl#getSpecificPerformanceMap <em>Specific Performance Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificPerformanceMapsTypeImpl extends ComplexBaseTypeImpl implements SpecificPerformanceMapsType {
	/**
	 * The cached value of the '{@link #getSpecificPerformanceMap() <em>Specific Performance Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificPerformanceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificPerformanceMapType> specificPerformanceMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificPerformanceMapsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSpecificPerformanceMapsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecificPerformanceMapType> getSpecificPerformanceMap() {
		if (specificPerformanceMap == null) {
			specificPerformanceMap = new EObjectContainmentEList<SpecificPerformanceMapType>(
					SpecificPerformanceMapType.class, this,
					CpacsPackage.SPECIFIC_PERFORMANCE_MAPS_TYPE__SPECIFIC_PERFORMANCE_MAP);
		}
		return specificPerformanceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAPS_TYPE__SPECIFIC_PERFORMANCE_MAP:
			return ((InternalEList<?>) getSpecificPerformanceMap()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAPS_TYPE__SPECIFIC_PERFORMANCE_MAP:
			return getSpecificPerformanceMap();
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
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAPS_TYPE__SPECIFIC_PERFORMANCE_MAP:
			getSpecificPerformanceMap().clear();
			getSpecificPerformanceMap().addAll((Collection<? extends SpecificPerformanceMapType>) newValue);
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
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAPS_TYPE__SPECIFIC_PERFORMANCE_MAP:
			getSpecificPerformanceMap().clear();
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
		case CpacsPackage.SPECIFIC_PERFORMANCE_MAPS_TYPE__SPECIFIC_PERFORMANCE_MAP:
			return specificPerformanceMap != null && !specificPerformanceMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificPerformanceMapsTypeImpl
