/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.WingAeroPerformanceType;
import Cpacs.WingsAeroPerformanceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wings Aero Performance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.WingsAeroPerformanceTypeImpl#getWingAeroPerformance <em>Wing Aero Performance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WingsAeroPerformanceTypeImpl extends ComplexBaseTypeImpl implements WingsAeroPerformanceType {
	/**
	 * The cached value of the '{@link #getWingAeroPerformance() <em>Wing Aero Performance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWingAeroPerformance()
	 * @generated
	 * @ordered
	 */
	protected EList<WingAeroPerformanceType> wingAeroPerformance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WingsAeroPerformanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getWingsAeroPerformanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WingAeroPerformanceType> getWingAeroPerformance() {
		if (wingAeroPerformance == null) {
			wingAeroPerformance = new EObjectContainmentEList<WingAeroPerformanceType>(WingAeroPerformanceType.class,
					this, CpacsPackage.WINGS_AERO_PERFORMANCE_TYPE__WING_AERO_PERFORMANCE);
		}
		return wingAeroPerformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.WINGS_AERO_PERFORMANCE_TYPE__WING_AERO_PERFORMANCE:
			return ((InternalEList<?>) getWingAeroPerformance()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.WINGS_AERO_PERFORMANCE_TYPE__WING_AERO_PERFORMANCE:
			return getWingAeroPerformance();
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
		case CpacsPackage.WINGS_AERO_PERFORMANCE_TYPE__WING_AERO_PERFORMANCE:
			getWingAeroPerformance().clear();
			getWingAeroPerformance().addAll((Collection<? extends WingAeroPerformanceType>) newValue);
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
		case CpacsPackage.WINGS_AERO_PERFORMANCE_TYPE__WING_AERO_PERFORMANCE:
			getWingAeroPerformance().clear();
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
		case CpacsPackage.WINGS_AERO_PERFORMANCE_TYPE__WING_AERO_PERFORMANCE:
			return wingAeroPerformance != null && !wingAeroPerformance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WingsAeroPerformanceTypeImpl
