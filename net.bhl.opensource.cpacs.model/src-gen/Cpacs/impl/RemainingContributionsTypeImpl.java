/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.RemainingContributionType;
import Cpacs.RemainingContributionsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remaining Contributions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RemainingContributionsTypeImpl#getRemainingContribution <em>Remaining Contribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemainingContributionsTypeImpl extends ComplexBaseTypeImpl implements RemainingContributionsType {
	/**
	 * The cached value of the '{@link #getRemainingContribution() <em>Remaining Contribution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingContribution()
	 * @generated
	 * @ordered
	 */
	protected EList<RemainingContributionType> remainingContribution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemainingContributionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRemainingContributionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RemainingContributionType> getRemainingContribution() {
		if (remainingContribution == null) {
			remainingContribution = new EObjectContainmentEList<RemainingContributionType>(
					RemainingContributionType.class, this,
					CpacsPackage.REMAINING_CONTRIBUTIONS_TYPE__REMAINING_CONTRIBUTION);
		}
		return remainingContribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.REMAINING_CONTRIBUTIONS_TYPE__REMAINING_CONTRIBUTION:
			return ((InternalEList<?>) getRemainingContribution()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.REMAINING_CONTRIBUTIONS_TYPE__REMAINING_CONTRIBUTION:
			return getRemainingContribution();
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
		case CpacsPackage.REMAINING_CONTRIBUTIONS_TYPE__REMAINING_CONTRIBUTION:
			getRemainingContribution().clear();
			getRemainingContribution().addAll((Collection<? extends RemainingContributionType>) newValue);
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
		case CpacsPackage.REMAINING_CONTRIBUTIONS_TYPE__REMAINING_CONTRIBUTION:
			getRemainingContribution().clear();
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
		case CpacsPackage.REMAINING_CONTRIBUTIONS_TYPE__REMAINING_CONTRIBUTION:
			return remainingContribution != null && !remainingContribution.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RemainingContributionsTypeImpl
