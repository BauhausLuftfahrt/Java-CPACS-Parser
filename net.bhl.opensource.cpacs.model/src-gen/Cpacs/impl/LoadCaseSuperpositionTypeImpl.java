/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LoadCaseSuperpositionType;
import Cpacs.StringUIDBaseType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Case Superposition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadCaseSuperpositionTypeImpl#getLoadCaseUID <em>Load Case UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCaseSuperpositionTypeImpl extends ComplexBaseTypeImpl implements LoadCaseSuperpositionType {
	/**
	 * The cached value of the '{@link #getLoadCaseUID() <em>Load Case UID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadCaseUID()
	 * @generated
	 * @ordered
	 */
	protected EList<StringUIDBaseType> loadCaseUID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadCaseSuperpositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadCaseSuperpositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StringUIDBaseType> getLoadCaseUID() {
		if (loadCaseUID == null) {
			loadCaseUID = new EObjectContainmentEList<StringUIDBaseType>(StringUIDBaseType.class, this,
					CpacsPackage.LOAD_CASE_SUPERPOSITION_TYPE__LOAD_CASE_UID);
		}
		return loadCaseUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_CASE_SUPERPOSITION_TYPE__LOAD_CASE_UID:
			return ((InternalEList<?>) getLoadCaseUID()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LOAD_CASE_SUPERPOSITION_TYPE__LOAD_CASE_UID:
			return getLoadCaseUID();
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
		case CpacsPackage.LOAD_CASE_SUPERPOSITION_TYPE__LOAD_CASE_UID:
			getLoadCaseUID().clear();
			getLoadCaseUID().addAll((Collection<? extends StringUIDBaseType>) newValue);
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
		case CpacsPackage.LOAD_CASE_SUPERPOSITION_TYPE__LOAD_CASE_UID:
			getLoadCaseUID().clear();
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
		case CpacsPackage.LOAD_CASE_SUPERPOSITION_TYPE__LOAD_CASE_UID:
			return loadCaseUID != null && !loadCaseUID.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadCaseSuperpositionTypeImpl
