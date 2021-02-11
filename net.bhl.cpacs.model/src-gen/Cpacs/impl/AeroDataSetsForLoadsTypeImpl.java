/**
 */
package Cpacs.impl;

import Cpacs.AeroDataSetForLoadsType;
import Cpacs.AeroDataSetsForLoadsType;
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
 * An implementation of the model object '<em><b>Aero Data Sets For Loads Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroDataSetsForLoadsTypeImpl#getAeroDataSetForLoads <em>Aero Data Set For Loads</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroDataSetsForLoadsTypeImpl extends ComplexBaseTypeImpl implements AeroDataSetsForLoadsType {
	/**
	 * The cached value of the '{@link #getAeroDataSetForLoads() <em>Aero Data Set For Loads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroDataSetForLoads()
	 * @generated
	 * @ordered
	 */
	protected EList<AeroDataSetForLoadsType> aeroDataSetForLoads;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroDataSetsForLoadsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroDataSetsForLoadsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AeroDataSetForLoadsType> getAeroDataSetForLoads() {
		if (aeroDataSetForLoads == null) {
			aeroDataSetForLoads = new EObjectContainmentEList<AeroDataSetForLoadsType>(AeroDataSetForLoadsType.class,
					this, CpacsPackage.AERO_DATA_SETS_FOR_LOADS_TYPE__AERO_DATA_SET_FOR_LOADS);
		}
		return aeroDataSetForLoads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_DATA_SETS_FOR_LOADS_TYPE__AERO_DATA_SET_FOR_LOADS:
			return ((InternalEList<?>) getAeroDataSetForLoads()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.AERO_DATA_SETS_FOR_LOADS_TYPE__AERO_DATA_SET_FOR_LOADS:
			return getAeroDataSetForLoads();
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
		case CpacsPackage.AERO_DATA_SETS_FOR_LOADS_TYPE__AERO_DATA_SET_FOR_LOADS:
			getAeroDataSetForLoads().clear();
			getAeroDataSetForLoads().addAll((Collection<? extends AeroDataSetForLoadsType>) newValue);
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
		case CpacsPackage.AERO_DATA_SETS_FOR_LOADS_TYPE__AERO_DATA_SET_FOR_LOADS:
			getAeroDataSetForLoads().clear();
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
		case CpacsPackage.AERO_DATA_SETS_FOR_LOADS_TYPE__AERO_DATA_SET_FOR_LOADS:
			return aeroDataSetForLoads != null && !aeroDataSetForLoads.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AeroDataSetsForLoadsTypeImpl
