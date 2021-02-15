/**
 */
package Cpacs.impl;

import Cpacs.AeroPerformanceMapRCType;
import Cpacs.AeroPerformanceMapsRCType;
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
 * An implementation of the model object '<em><b>Aero Performance Maps RC Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroPerformanceMapsRCTypeImpl#getAeroPerformanceMap <em>Aero Performance Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroPerformanceMapsRCTypeImpl extends ComplexBaseTypeImpl implements AeroPerformanceMapsRCType {
	/**
	 * The cached value of the '{@link #getAeroPerformanceMap() <em>Aero Performance Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroPerformanceMap()
	 * @generated
	 * @ordered
	 */
	protected EList<AeroPerformanceMapRCType> aeroPerformanceMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroPerformanceMapsRCTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroPerformanceMapsRCType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AeroPerformanceMapRCType> getAeroPerformanceMap() {
		if (aeroPerformanceMap == null) {
			aeroPerformanceMap = new EObjectContainmentEList<AeroPerformanceMapRCType>(AeroPerformanceMapRCType.class,
					this, CpacsPackage.AERO_PERFORMANCE_MAPS_RC_TYPE__AERO_PERFORMANCE_MAP);
		}
		return aeroPerformanceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_PERFORMANCE_MAPS_RC_TYPE__AERO_PERFORMANCE_MAP:
			return ((InternalEList<?>) getAeroPerformanceMap()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.AERO_PERFORMANCE_MAPS_RC_TYPE__AERO_PERFORMANCE_MAP:
			return getAeroPerformanceMap();
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
		case CpacsPackage.AERO_PERFORMANCE_MAPS_RC_TYPE__AERO_PERFORMANCE_MAP:
			getAeroPerformanceMap().clear();
			getAeroPerformanceMap().addAll((Collection<? extends AeroPerformanceMapRCType>) newValue);
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
		case CpacsPackage.AERO_PERFORMANCE_MAPS_RC_TYPE__AERO_PERFORMANCE_MAP:
			getAeroPerformanceMap().clear();
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
		case CpacsPackage.AERO_PERFORMANCE_MAPS_RC_TYPE__AERO_PERFORMANCE_MAP:
			return aeroPerformanceMap != null && !aeroPerformanceMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AeroPerformanceMapsRCTypeImpl
