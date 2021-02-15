/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlyingQualitiesType;
import Cpacs.FqCaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flying Qualities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlyingQualitiesTypeImpl#getFqCase <em>Fq Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlyingQualitiesTypeImpl extends ComplexBaseTypeImpl implements FlyingQualitiesType {
	/**
	 * The cached value of the '{@link #getFqCase() <em>Fq Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqCase()
	 * @generated
	 * @ordered
	 */
	protected EList<FqCaseType> fqCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlyingQualitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlyingQualitiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FqCaseType> getFqCase() {
		if (fqCase == null) {
			fqCase = new EObjectContainmentEList<FqCaseType>(FqCaseType.class, this,
					CpacsPackage.FLYING_QUALITIES_TYPE__FQ_CASE);
		}
		return fqCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLYING_QUALITIES_TYPE__FQ_CASE:
			return ((InternalEList<?>) getFqCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FLYING_QUALITIES_TYPE__FQ_CASE:
			return getFqCase();
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
		case CpacsPackage.FLYING_QUALITIES_TYPE__FQ_CASE:
			getFqCase().clear();
			getFqCase().addAll((Collection<? extends FqCaseType>) newValue);
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
		case CpacsPackage.FLYING_QUALITIES_TYPE__FQ_CASE:
			getFqCase().clear();
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
		case CpacsPackage.FLYING_QUALITIES_TYPE__FQ_CASE:
			return fqCase != null && !fqCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlyingQualitiesTypeImpl
