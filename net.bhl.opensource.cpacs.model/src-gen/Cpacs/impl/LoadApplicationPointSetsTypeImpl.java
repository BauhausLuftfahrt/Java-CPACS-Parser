/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.LoadApplicationPointSetType;
import Cpacs.LoadApplicationPointSetsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Application Point Sets Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LoadApplicationPointSetsTypeImpl#getLoadApplicationPointSet <em>Load Application Point Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadApplicationPointSetsTypeImpl extends ComplexBaseTypeImpl implements LoadApplicationPointSetsType {
	/**
	 * The cached value of the '{@link #getLoadApplicationPointSet() <em>Load Application Point Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadApplicationPointSet()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadApplicationPointSetType> loadApplicationPointSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadApplicationPointSetsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLoadApplicationPointSetsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LoadApplicationPointSetType> getLoadApplicationPointSet() {
		if (loadApplicationPointSet == null) {
			loadApplicationPointSet = new EObjectContainmentEList<LoadApplicationPointSetType>(
					LoadApplicationPointSetType.class, this,
					CpacsPackage.LOAD_APPLICATION_POINT_SETS_TYPE__LOAD_APPLICATION_POINT_SET);
		}
		return loadApplicationPointSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LOAD_APPLICATION_POINT_SETS_TYPE__LOAD_APPLICATION_POINT_SET:
			return ((InternalEList<?>) getLoadApplicationPointSet()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.LOAD_APPLICATION_POINT_SETS_TYPE__LOAD_APPLICATION_POINT_SET:
			return getLoadApplicationPointSet();
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
		case CpacsPackage.LOAD_APPLICATION_POINT_SETS_TYPE__LOAD_APPLICATION_POINT_SET:
			getLoadApplicationPointSet().clear();
			getLoadApplicationPointSet().addAll((Collection<? extends LoadApplicationPointSetType>) newValue);
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
		case CpacsPackage.LOAD_APPLICATION_POINT_SETS_TYPE__LOAD_APPLICATION_POINT_SET:
			getLoadApplicationPointSet().clear();
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
		case CpacsPackage.LOAD_APPLICATION_POINT_SETS_TYPE__LOAD_APPLICATION_POINT_SET:
			return loadApplicationPointSet != null && !loadApplicationPointSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadApplicationPointSetsTypeImpl
