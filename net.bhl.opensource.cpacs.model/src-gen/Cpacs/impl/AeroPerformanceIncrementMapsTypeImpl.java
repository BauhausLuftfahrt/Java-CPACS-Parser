/**
 */
package Cpacs.impl;

import Cpacs.AeroPerformanceIncrementMapType;
import Cpacs.AeroPerformanceIncrementMapsType;
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
 * An implementation of the model object '<em><b>Aero Performance Increment Maps Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroPerformanceIncrementMapsTypeImpl#getIncrementMap <em>Increment Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroPerformanceIncrementMapsTypeImpl extends ComplexBaseTypeImpl
		implements AeroPerformanceIncrementMapsType {
	/**
	 * The cached value of the '{@link #getIncrementMap() <em>Increment Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementMap()
	 * @generated
	 * @ordered
	 */
	protected EList<AeroPerformanceIncrementMapType> incrementMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroPerformanceIncrementMapsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroPerformanceIncrementMapsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AeroPerformanceIncrementMapType> getIncrementMap() {
		if (incrementMap == null) {
			incrementMap = new EObjectContainmentEList<AeroPerformanceIncrementMapType>(
					AeroPerformanceIncrementMapType.class, this,
					CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAPS_TYPE__INCREMENT_MAP);
		}
		return incrementMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAPS_TYPE__INCREMENT_MAP:
			return ((InternalEList<?>) getIncrementMap()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAPS_TYPE__INCREMENT_MAP:
			return getIncrementMap();
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
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAPS_TYPE__INCREMENT_MAP:
			getIncrementMap().clear();
			getIncrementMap().addAll((Collection<? extends AeroPerformanceIncrementMapType>) newValue);
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
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAPS_TYPE__INCREMENT_MAP:
			getIncrementMap().clear();
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
		case CpacsPackage.AERO_PERFORMANCE_INCREMENT_MAPS_TYPE__INCREMENT_MAP:
			return incrementMap != null && !incrementMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AeroPerformanceIncrementMapsTypeImpl
