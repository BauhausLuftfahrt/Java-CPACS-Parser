/**
 */
package Cpacs.impl;

import Cpacs.CertificationCasesType;
import Cpacs.CpacsPackage;
import Cpacs.WeightAndBalanceCaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certification Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CertificationCasesTypeImpl#getCertificationCase <em>Certification Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificationCasesTypeImpl extends ComplexBaseTypeImpl implements CertificationCasesType {
	/**
	 * The cached value of the '{@link #getCertificationCase() <em>Certification Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificationCase()
	 * @generated
	 * @ordered
	 */
	protected EList<WeightAndBalanceCaseType> certificationCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificationCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCertificationCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeightAndBalanceCaseType> getCertificationCase() {
		if (certificationCase == null) {
			certificationCase = new EObjectContainmentEList<WeightAndBalanceCaseType>(WeightAndBalanceCaseType.class,
					this, CpacsPackage.CERTIFICATION_CASES_TYPE__CERTIFICATION_CASE);
		}
		return certificationCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CERTIFICATION_CASES_TYPE__CERTIFICATION_CASE:
			return ((InternalEList<?>) getCertificationCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CERTIFICATION_CASES_TYPE__CERTIFICATION_CASE:
			return getCertificationCase();
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
		case CpacsPackage.CERTIFICATION_CASES_TYPE__CERTIFICATION_CASE:
			getCertificationCase().clear();
			getCertificationCase().addAll((Collection<? extends WeightAndBalanceCaseType>) newValue);
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
		case CpacsPackage.CERTIFICATION_CASES_TYPE__CERTIFICATION_CASE:
			getCertificationCase().clear();
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
		case CpacsPackage.CERTIFICATION_CASES_TYPE__CERTIFICATION_CASE:
			return certificationCase != null && !certificationCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CertificationCasesTypeImpl
