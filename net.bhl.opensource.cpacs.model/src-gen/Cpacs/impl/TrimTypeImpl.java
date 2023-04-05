/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.TrimCaseType;
import Cpacs.TrimType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trim Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TrimTypeImpl#getTrimCase <em>Trim Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrimTypeImpl extends ComplexBaseTypeImpl implements TrimType {
	/**
	 * The cached value of the '{@link #getTrimCase() <em>Trim Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrimCase()
	 * @generated
	 * @ordered
	 */
	protected EList<TrimCaseType> trimCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrimTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTrimType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrimCaseType> getTrimCase() {
		if (trimCase == null) {
			trimCase = new EObjectContainmentEList<TrimCaseType>(TrimCaseType.class, this,
					CpacsPackage.TRIM_TYPE__TRIM_CASE);
		}
		return trimCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRIM_TYPE__TRIM_CASE:
			return ((InternalEList<?>) getTrimCase()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.TRIM_TYPE__TRIM_CASE:
			return getTrimCase();
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
		case CpacsPackage.TRIM_TYPE__TRIM_CASE:
			getTrimCase().clear();
			getTrimCase().addAll((Collection<? extends TrimCaseType>) newValue);
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
		case CpacsPackage.TRIM_TYPE__TRIM_CASE:
			getTrimCase().clear();
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
		case CpacsPackage.TRIM_TYPE__TRIM_CASE:
			return trimCase != null && !trimCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrimTypeImpl
