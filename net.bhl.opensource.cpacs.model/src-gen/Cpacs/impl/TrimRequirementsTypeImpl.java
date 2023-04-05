/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.TrimRequirementType;
import Cpacs.TrimRequirementsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trim Requirements Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrimRequirementsTypeImpl#getTrimRequirement <em>Trim Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrimRequirementsTypeImpl extends ComplexBaseTypeImpl implements TrimRequirementsType {
	/**
	 * The cached value of the '{@link #getTrimRequirement() <em>Trim Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrimRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<TrimRequirementType> trimRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrimRequirementsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrimRequirementsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrimRequirementType> getTrimRequirement() {
		if (trimRequirement == null) {
			trimRequirement = new EObjectContainmentEList<TrimRequirementType>(TrimRequirementType.class, this,
					CpacsPackage.TRIM_REQUIREMENTS_TYPE__TRIM_REQUIREMENT);
		}
		return trimRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRIM_REQUIREMENTS_TYPE__TRIM_REQUIREMENT:
			return ((InternalEList<?>) getTrimRequirement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.TRIM_REQUIREMENTS_TYPE__TRIM_REQUIREMENT:
			return getTrimRequirement();
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
		case CpacsPackage.TRIM_REQUIREMENTS_TYPE__TRIM_REQUIREMENT:
			getTrimRequirement().clear();
			getTrimRequirement().addAll((Collection<? extends TrimRequirementType>) newValue);
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
		case CpacsPackage.TRIM_REQUIREMENTS_TYPE__TRIM_REQUIREMENT:
			getTrimRequirement().clear();
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
		case CpacsPackage.TRIM_REQUIREMENTS_TYPE__TRIM_REQUIREMENT:
			return trimRequirement != null && !trimRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrimRequirementsTypeImpl
