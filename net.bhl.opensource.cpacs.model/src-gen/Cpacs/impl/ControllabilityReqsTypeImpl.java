/**
 */
package Cpacs.impl;

import Cpacs.ControllabilityReqsType;
import Cpacs.ControllabilityRequirementType;
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
 * An implementation of the model object '<em><b>Controllability Reqs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControllabilityReqsTypeImpl#getControllabilityRequirement <em>Controllability Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllabilityReqsTypeImpl extends ComplexBaseTypeImpl implements ControllabilityReqsType {
	/**
	 * The cached value of the '{@link #getControllabilityRequirement() <em>Controllability Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllabilityRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<ControllabilityRequirementType> controllabilityRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllabilityReqsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControllabilityReqsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControllabilityRequirementType> getControllabilityRequirement() {
		if (controllabilityRequirement == null) {
			controllabilityRequirement = new EObjectContainmentEList<ControllabilityRequirementType>(
					ControllabilityRequirementType.class, this,
					CpacsPackage.CONTROLLABILITY_REQS_TYPE__CONTROLLABILITY_REQUIREMENT);
		}
		return controllabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROLLABILITY_REQS_TYPE__CONTROLLABILITY_REQUIREMENT:
			return ((InternalEList<?>) getControllabilityRequirement()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CONTROLLABILITY_REQS_TYPE__CONTROLLABILITY_REQUIREMENT:
			return getControllabilityRequirement();
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
		case CpacsPackage.CONTROLLABILITY_REQS_TYPE__CONTROLLABILITY_REQUIREMENT:
			getControllabilityRequirement().clear();
			getControllabilityRequirement().addAll((Collection<? extends ControllabilityRequirementType>) newValue);
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
		case CpacsPackage.CONTROLLABILITY_REQS_TYPE__CONTROLLABILITY_REQUIREMENT:
			getControllabilityRequirement().clear();
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
		case CpacsPackage.CONTROLLABILITY_REQS_TYPE__CONTROLLABILITY_REQUIREMENT:
			return controllabilityRequirement != null && !controllabilityRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControllabilityReqsTypeImpl
