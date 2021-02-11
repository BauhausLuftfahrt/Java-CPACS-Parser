/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.CruiseRollerType;
import Cpacs.CruiseRollersType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cruise Rollers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CruiseRollersTypeImpl#getCruiseRoller <em>Cruise Roller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CruiseRollersTypeImpl extends ComplexBaseTypeImpl implements CruiseRollersType {
	/**
	 * The cached value of the '{@link #getCruiseRoller() <em>Cruise Roller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCruiseRoller()
	 * @generated
	 * @ordered
	 */
	protected EList<CruiseRollerType> cruiseRoller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CruiseRollersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCruiseRollersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CruiseRollerType> getCruiseRoller() {
		if (cruiseRoller == null) {
			cruiseRoller = new EObjectContainmentEList<CruiseRollerType>(CruiseRollerType.class, this,
					CpacsPackage.CRUISE_ROLLERS_TYPE__CRUISE_ROLLER);
		}
		return cruiseRoller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CRUISE_ROLLERS_TYPE__CRUISE_ROLLER:
			return ((InternalEList<?>) getCruiseRoller()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CRUISE_ROLLERS_TYPE__CRUISE_ROLLER:
			return getCruiseRoller();
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
		case CpacsPackage.CRUISE_ROLLERS_TYPE__CRUISE_ROLLER:
			getCruiseRoller().clear();
			getCruiseRoller().addAll((Collection<? extends CruiseRollerType>) newValue);
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
		case CpacsPackage.CRUISE_ROLLERS_TYPE__CRUISE_ROLLER:
			getCruiseRoller().clear();
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
		case CpacsPackage.CRUISE_ROLLERS_TYPE__CRUISE_ROLLER:
			return cruiseRoller != null && !cruiseRoller.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CruiseRollersTypeImpl
