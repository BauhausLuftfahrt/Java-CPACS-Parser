/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CrashLoadCasesType;
import Cpacs.CrashLoadcaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crash Load Cases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CrashLoadCasesTypeImpl#getCrashLoadCase <em>Crash Load Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrashLoadCasesTypeImpl extends ComplexBaseTypeImpl implements CrashLoadCasesType {
	/**
	 * The cached value of the '{@link #getCrashLoadCase() <em>Crash Load Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrashLoadCase()
	 * @generated
	 * @ordered
	 */
	protected EList<CrashLoadcaseType> crashLoadCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrashLoadCasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCrashLoadCasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrashLoadcaseType> getCrashLoadCase() {
		if (crashLoadCase == null) {
			crashLoadCase = new EObjectContainmentEList<CrashLoadcaseType>(CrashLoadcaseType.class, this,
					CpacsPackage.CRASH_LOAD_CASES_TYPE__CRASH_LOAD_CASE);
		}
		return crashLoadCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CRASH_LOAD_CASES_TYPE__CRASH_LOAD_CASE:
			return ((InternalEList<?>) getCrashLoadCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CRASH_LOAD_CASES_TYPE__CRASH_LOAD_CASE:
			return getCrashLoadCase();
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
		case CpacsPackage.CRASH_LOAD_CASES_TYPE__CRASH_LOAD_CASE:
			getCrashLoadCase().clear();
			getCrashLoadCase().addAll((Collection<? extends CrashLoadcaseType>) newValue);
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
		case CpacsPackage.CRASH_LOAD_CASES_TYPE__CRASH_LOAD_CASE:
			getCrashLoadCase().clear();
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
		case CpacsPackage.CRASH_LOAD_CASES_TYPE__CRASH_LOAD_CASE:
			return crashLoadCase != null && !crashLoadCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CrashLoadCasesTypeImpl
