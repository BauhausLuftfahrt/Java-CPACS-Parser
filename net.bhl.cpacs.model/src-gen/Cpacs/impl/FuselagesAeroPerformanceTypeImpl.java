/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FuselageAeroPerformanceType;
import Cpacs.FuselagesAeroPerformanceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuselages Aero Performance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FuselagesAeroPerformanceTypeImpl#getFuselageAeroPerformance <em>Fuselage Aero Performance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuselagesAeroPerformanceTypeImpl extends ComplexBaseTypeImpl implements FuselagesAeroPerformanceType {
	/**
	 * The cached value of the '{@link #getFuselageAeroPerformance() <em>Fuselage Aero Performance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuselageAeroPerformance()
	 * @generated
	 * @ordered
	 */
	protected EList<FuselageAeroPerformanceType> fuselageAeroPerformance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuselagesAeroPerformanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFuselagesAeroPerformanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FuselageAeroPerformanceType> getFuselageAeroPerformance() {
		if (fuselageAeroPerformance == null) {
			fuselageAeroPerformance = new EObjectContainmentEList<FuselageAeroPerformanceType>(
					FuselageAeroPerformanceType.class, this,
					CpacsPackage.FUSELAGES_AERO_PERFORMANCE_TYPE__FUSELAGE_AERO_PERFORMANCE);
		}
		return fuselageAeroPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FUSELAGES_AERO_PERFORMANCE_TYPE__FUSELAGE_AERO_PERFORMANCE:
			return ((InternalEList<?>) getFuselageAeroPerformance()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FUSELAGES_AERO_PERFORMANCE_TYPE__FUSELAGE_AERO_PERFORMANCE:
			return getFuselageAeroPerformance();
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
		case CpacsPackage.FUSELAGES_AERO_PERFORMANCE_TYPE__FUSELAGE_AERO_PERFORMANCE:
			getFuselageAeroPerformance().clear();
			getFuselageAeroPerformance().addAll((Collection<? extends FuselageAeroPerformanceType>) newValue);
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
		case CpacsPackage.FUSELAGES_AERO_PERFORMANCE_TYPE__FUSELAGE_AERO_PERFORMANCE:
			getFuselageAeroPerformance().clear();
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
		case CpacsPackage.FUSELAGES_AERO_PERFORMANCE_TYPE__FUSELAGE_AERO_PERFORMANCE:
			return fuselageAeroPerformance != null && !fuselageAeroPerformance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FuselagesAeroPerformanceTypeImpl
