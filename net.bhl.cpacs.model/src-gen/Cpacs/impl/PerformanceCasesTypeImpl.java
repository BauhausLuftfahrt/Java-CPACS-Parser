/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.PerformanceCaseType;
import Cpacs.PerformanceCasesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.PerformanceCasesTypeImpl#getPerformanceCase <em>Performance Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceCasesTypeImpl extends ComplexBaseTypeImpl implements PerformanceCasesType {
	/**
	 * The cached value of the '{@link #getPerformanceCase() <em>Performance Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceCase()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformanceCaseType> performanceCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getPerformanceCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PerformanceCaseType> getPerformanceCase() {
		if (performanceCase == null) {
			performanceCase = new EObjectContainmentEList<PerformanceCaseType>(PerformanceCaseType.class, this,
					CpacsPackage.PERFORMANCE_CASES_TYPE__PERFORMANCE_CASE);
		}
		return performanceCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.PERFORMANCE_CASES_TYPE__PERFORMANCE_CASE:
			return ((InternalEList<?>) getPerformanceCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.PERFORMANCE_CASES_TYPE__PERFORMANCE_CASE:
			return getPerformanceCase();
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
		case CpacsPackage.PERFORMANCE_CASES_TYPE__PERFORMANCE_CASE:
			getPerformanceCase().clear();
			getPerformanceCase().addAll((Collection<? extends PerformanceCaseType>) newValue);
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
		case CpacsPackage.PERFORMANCE_CASES_TYPE__PERFORMANCE_CASE:
			getPerformanceCase().clear();
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
		case CpacsPackage.PERFORMANCE_CASES_TYPE__PERFORMANCE_CASE:
			return performanceCase != null && !performanceCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PerformanceCasesTypeImpl
