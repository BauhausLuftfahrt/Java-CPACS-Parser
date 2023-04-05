/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LoadSetType;
import Cpacs.LoadSetsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Sets Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadSetsTypeImpl#getLoadSet <em>Load Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadSetsTypeImpl extends ComplexBaseTypeImpl implements LoadSetsType {
	/**
	 * The cached value of the '{@link #getLoadSet() <em>Load Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadSet()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadSetType> loadSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadSetsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadSetsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadSetType> getLoadSet() {
		if (loadSet == null) {
			loadSet = new EObjectContainmentEList<LoadSetType>(LoadSetType.class, this,
					CpacsPackage.LOAD_SETS_TYPE__LOAD_SET);
		}
		return loadSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_SETS_TYPE__LOAD_SET:
			return ((InternalEList<?>) getLoadSet()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LOAD_SETS_TYPE__LOAD_SET:
			return getLoadSet();
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
		case CpacsPackage.LOAD_SETS_TYPE__LOAD_SET:
			getLoadSet().clear();
			getLoadSet().addAll((Collection<? extends LoadSetType>) newValue);
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
		case CpacsPackage.LOAD_SETS_TYPE__LOAD_SET:
			getLoadSet().clear();
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
		case CpacsPackage.LOAD_SETS_TYPE__LOAD_SET:
			return loadSet != null && !loadSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadSetsTypeImpl
