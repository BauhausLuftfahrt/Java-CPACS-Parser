/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DeckComponent2DBaseType;
import Cpacs.GenericFloorModulesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Floor Modules Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GenericFloorModulesTypeImpl#getGenericFloorModule <em>Generic Floor Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericFloorModulesTypeImpl extends ComplexBaseTypeImpl implements GenericFloorModulesType {
	/**
	 * The cached value of the '{@link #getGenericFloorModule() <em>Generic Floor Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericFloorModule()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckComponent2DBaseType> genericFloorModule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericFloorModulesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGenericFloorModulesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeckComponent2DBaseType> getGenericFloorModule() {
		if (genericFloorModule == null) {
			genericFloorModule = new EObjectContainmentEList<DeckComponent2DBaseType>(DeckComponent2DBaseType.class,
					this, CpacsPackage.GENERIC_FLOOR_MODULES_TYPE__GENERIC_FLOOR_MODULE);
		}
		return genericFloorModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.GENERIC_FLOOR_MODULES_TYPE__GENERIC_FLOOR_MODULE:
			return ((InternalEList<?>) getGenericFloorModule()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.GENERIC_FLOOR_MODULES_TYPE__GENERIC_FLOOR_MODULE:
			return getGenericFloorModule();
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
		case CpacsPackage.GENERIC_FLOOR_MODULES_TYPE__GENERIC_FLOOR_MODULE:
			getGenericFloorModule().clear();
			getGenericFloorModule().addAll((Collection<? extends DeckComponent2DBaseType>) newValue);
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
		case CpacsPackage.GENERIC_FLOOR_MODULES_TYPE__GENERIC_FLOOR_MODULE:
			getGenericFloorModule().clear();
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
		case CpacsPackage.GENERIC_FLOOR_MODULES_TYPE__GENERIC_FLOOR_MODULE:
			return genericFloorModule != null && !genericFloorModule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenericFloorModulesTypeImpl
