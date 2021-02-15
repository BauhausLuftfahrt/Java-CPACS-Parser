/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.SubFleetType;
import Cpacs.SubFleetsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Fleets Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.SubFleetsTypeImpl#getSubFleet <em>Sub Fleet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubFleetsTypeImpl extends ComplexBaseTypeImpl implements SubFleetsType {
	/**
	 * The cached value of the '{@link #getSubFleet() <em>Sub Fleet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFleet()
	 * @generated
	 * @ordered
	 */
	protected EList<SubFleetType> subFleet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubFleetsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getSubFleetsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubFleetType> getSubFleet() {
		if (subFleet == null) {
			subFleet = new EObjectContainmentEList<SubFleetType>(SubFleetType.class, this,
					CpacsPackage.SUB_FLEETS_TYPE__SUB_FLEET);
		}
		return subFleet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.SUB_FLEETS_TYPE__SUB_FLEET:
			return ((InternalEList<?>) getSubFleet()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.SUB_FLEETS_TYPE__SUB_FLEET:
			return getSubFleet();
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
		case CpacsPackage.SUB_FLEETS_TYPE__SUB_FLEET:
			getSubFleet().clear();
			getSubFleet().addAll((Collection<? extends SubFleetType>) newValue);
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
		case CpacsPackage.SUB_FLEETS_TYPE__SUB_FLEET:
			getSubFleet().clear();
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
		case CpacsPackage.SUB_FLEETS_TYPE__SUB_FLEET:
			return subFleet != null && !subFleet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubFleetsTypeImpl
