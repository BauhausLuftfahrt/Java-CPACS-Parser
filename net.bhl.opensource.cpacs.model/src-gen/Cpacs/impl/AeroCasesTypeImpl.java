/**
 */
package Cpacs.impl;

import Cpacs.AeroCaseType;
import Cpacs.AeroCasesType;
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
 * An implementation of the model object '<em><b>Aero Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroCasesTypeImpl#getAeroCase <em>Aero Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroCasesTypeImpl extends ComplexBaseTypeImpl implements AeroCasesType {
	/**
	 * The cached value of the '{@link #getAeroCase() <em>Aero Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroCase()
	 * @generated
	 * @ordered
	 */
	protected EList<AeroCaseType> aeroCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AeroCaseType> getAeroCase() {
		if (aeroCase == null) {
			aeroCase = new EObjectContainmentEList<AeroCaseType>(AeroCaseType.class, this,
					CpacsPackage.AERO_CASES_TYPE__AERO_CASE);
		}
		return aeroCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_CASES_TYPE__AERO_CASE:
			return ((InternalEList<?>) getAeroCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.AERO_CASES_TYPE__AERO_CASE:
			return getAeroCase();
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
		case CpacsPackage.AERO_CASES_TYPE__AERO_CASE:
			getAeroCase().clear();
			getAeroCase().addAll((Collection<? extends AeroCaseType>) newValue);
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
		case CpacsPackage.AERO_CASES_TYPE__AERO_CASE:
			getAeroCase().clear();
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
		case CpacsPackage.AERO_CASES_TYPE__AERO_CASE:
			return aeroCase != null && !aeroCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AeroCasesTypeImpl
