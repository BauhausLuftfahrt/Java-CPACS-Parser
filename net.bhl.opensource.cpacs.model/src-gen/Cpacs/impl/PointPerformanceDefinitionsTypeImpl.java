/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PointPerformanceDefinitionType;
import Cpacs.PointPerformanceDefinitionsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Performance Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PointPerformanceDefinitionsTypeImpl#getPointPerformanceDefinition <em>Point Performance Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointPerformanceDefinitionsTypeImpl extends ComplexBaseTypeImpl
		implements PointPerformanceDefinitionsType {
	/**
	 * The cached value of the '{@link #getPointPerformanceDefinition() <em>Point Performance Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointPerformanceDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<PointPerformanceDefinitionType> pointPerformanceDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointPerformanceDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPointPerformanceDefinitionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PointPerformanceDefinitionType> getPointPerformanceDefinition() {
		if (pointPerformanceDefinition == null) {
			pointPerformanceDefinition = new EObjectContainmentEList<PointPerformanceDefinitionType>(
					PointPerformanceDefinitionType.class, this,
					CpacsPackage.POINT_PERFORMANCE_DEFINITIONS_TYPE__POINT_PERFORMANCE_DEFINITION);
		}
		return pointPerformanceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.POINT_PERFORMANCE_DEFINITIONS_TYPE__POINT_PERFORMANCE_DEFINITION:
			return ((InternalEList<?>) getPointPerformanceDefinition()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.POINT_PERFORMANCE_DEFINITIONS_TYPE__POINT_PERFORMANCE_DEFINITION:
			return getPointPerformanceDefinition();
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
		case CpacsPackage.POINT_PERFORMANCE_DEFINITIONS_TYPE__POINT_PERFORMANCE_DEFINITION:
			getPointPerformanceDefinition().clear();
			getPointPerformanceDefinition().addAll((Collection<? extends PointPerformanceDefinitionType>) newValue);
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
		case CpacsPackage.POINT_PERFORMANCE_DEFINITIONS_TYPE__POINT_PERFORMANCE_DEFINITION:
			getPointPerformanceDefinition().clear();
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
		case CpacsPackage.POINT_PERFORMANCE_DEFINITIONS_TYPE__POINT_PERFORMANCE_DEFINITION:
			return pointPerformanceDefinition != null && !pointPerformanceDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PointPerformanceDefinitionsTypeImpl
