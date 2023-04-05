/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.FlyingQualitiesCaseType;
import Cpacs.FlyingQualitiesCasesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flying Qualities Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.FlyingQualitiesCasesTypeImpl#getFlyingQualitiesCase <em>Flying Qualities Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlyingQualitiesCasesTypeImpl extends ComplexBaseTypeImpl implements FlyingQualitiesCasesType {
	/**
	 * The cached value of the '{@link #getFlyingQualitiesCase() <em>Flying Qualities Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlyingQualitiesCase()
	 * @generated
	 * @ordered
	 */
	protected EList<FlyingQualitiesCaseType> flyingQualitiesCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlyingQualitiesCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getFlyingQualitiesCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FlyingQualitiesCaseType> getFlyingQualitiesCase() {
		if (flyingQualitiesCase == null) {
			flyingQualitiesCase = new EObjectContainmentEList<FlyingQualitiesCaseType>(FlyingQualitiesCaseType.class,
					this, CpacsPackage.FLYING_QUALITIES_CASES_TYPE__FLYING_QUALITIES_CASE);
		}
		return flyingQualitiesCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.FLYING_QUALITIES_CASES_TYPE__FLYING_QUALITIES_CASE:
			return ((InternalEList<?>) getFlyingQualitiesCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.FLYING_QUALITIES_CASES_TYPE__FLYING_QUALITIES_CASE:
			return getFlyingQualitiesCase();
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
		case CpacsPackage.FLYING_QUALITIES_CASES_TYPE__FLYING_QUALITIES_CASE:
			getFlyingQualitiesCase().clear();
			getFlyingQualitiesCase().addAll((Collection<? extends FlyingQualitiesCaseType>) newValue);
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
		case CpacsPackage.FLYING_QUALITIES_CASES_TYPE__FLYING_QUALITIES_CASE:
			getFlyingQualitiesCase().clear();
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
		case CpacsPackage.FLYING_QUALITIES_CASES_TYPE__FLYING_QUALITIES_CASE:
			return flyingQualitiesCase != null && !flyingQualitiesCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlyingQualitiesCasesTypeImpl
