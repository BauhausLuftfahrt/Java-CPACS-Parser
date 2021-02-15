/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.OperationalCaseType;
import Cpacs.OperationalCasesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.OperationalCasesTypeImpl#getOperationalCase <em>Operational Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalCasesTypeImpl extends ComplexBaseTypeImpl implements OperationalCasesType {
	/**
	 * The cached value of the '{@link #getOperationalCase() <em>Operational Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalCase()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalCaseType> operationalCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getOperationalCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalCaseType> getOperationalCase() {
		if (operationalCase == null) {
			operationalCase = new EObjectContainmentEList<OperationalCaseType>(OperationalCaseType.class, this,
					CpacsPackage.OPERATIONAL_CASES_TYPE__OPERATIONAL_CASE);
		}
		return operationalCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.OPERATIONAL_CASES_TYPE__OPERATIONAL_CASE:
			return ((InternalEList<?>) getOperationalCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.OPERATIONAL_CASES_TYPE__OPERATIONAL_CASE:
			return getOperationalCase();
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
		case CpacsPackage.OPERATIONAL_CASES_TYPE__OPERATIONAL_CASE:
			getOperationalCase().clear();
			getOperationalCase().addAll((Collection<? extends OperationalCaseType>) newValue);
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
		case CpacsPackage.OPERATIONAL_CASES_TYPE__OPERATIONAL_CASE:
			getOperationalCase().clear();
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
		case CpacsPackage.OPERATIONAL_CASES_TYPE__OPERATIONAL_CASE:
			return operationalCase != null && !operationalCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalCasesTypeImpl
