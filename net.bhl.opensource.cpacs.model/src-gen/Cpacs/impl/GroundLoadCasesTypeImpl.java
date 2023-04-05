/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GroundLoadCasesType;
import Cpacs.LoadCaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ground Load Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GroundLoadCasesTypeImpl#getGroundLoadCase <em>Ground Load Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroundLoadCasesTypeImpl extends ComplexBaseTypeImpl implements GroundLoadCasesType {
	/**
	 * The cached value of the '{@link #getGroundLoadCase() <em>Ground Load Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundLoadCase()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadCaseType> groundLoadCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundLoadCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGroundLoadCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadCaseType> getGroundLoadCase() {
		if (groundLoadCase == null) {
			groundLoadCase = new EObjectContainmentEList<LoadCaseType>(LoadCaseType.class, this,
					CpacsPackage.GROUND_LOAD_CASES_TYPE__GROUND_LOAD_CASE);
		}
		return groundLoadCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GROUND_LOAD_CASES_TYPE__GROUND_LOAD_CASE:
			return ((InternalEList<?>) getGroundLoadCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GROUND_LOAD_CASES_TYPE__GROUND_LOAD_CASE:
			return getGroundLoadCase();
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
		case CpacsPackage.GROUND_LOAD_CASES_TYPE__GROUND_LOAD_CASE:
			getGroundLoadCase().clear();
			getGroundLoadCase().addAll((Collection<? extends LoadCaseType>) newValue);
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
		case CpacsPackage.GROUND_LOAD_CASES_TYPE__GROUND_LOAD_CASE:
			getGroundLoadCase().clear();
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
		case CpacsPackage.GROUND_LOAD_CASES_TYPE__GROUND_LOAD_CASE:
			return groundLoadCase != null && !groundLoadCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroundLoadCasesTypeImpl
