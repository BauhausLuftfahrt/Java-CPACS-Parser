/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.RotorHubHingeType;
import Cpacs.RotorHubHingesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotor Hub Hinges Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotorHubHingesTypeImpl#getHinge <em>Hinge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotorHubHingesTypeImpl extends ComplexBaseTypeImpl implements RotorHubHingesType {
	/**
	 * The cached value of the '{@link #getHinge() <em>Hinge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHinge()
	 * @generated
	 * @ordered
	 */
	protected EList<RotorHubHingeType> hinge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotorHubHingesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotorHubHingesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RotorHubHingeType> getHinge() {
		if (hinge == null) {
			hinge = new EObjectContainmentEList<RotorHubHingeType>(RotorHubHingeType.class, this,
					CpacsPackage.ROTOR_HUB_HINGES_TYPE__HINGE);
		}
		return hinge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ROTOR_HUB_HINGES_TYPE__HINGE:
			return ((InternalEList<?>) getHinge()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.ROTOR_HUB_HINGES_TYPE__HINGE:
			return getHinge();
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
		case CpacsPackage.ROTOR_HUB_HINGES_TYPE__HINGE:
			getHinge().clear();
			getHinge().addAll((Collection<? extends RotorHubHingeType>) newValue);
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
		case CpacsPackage.ROTOR_HUB_HINGES_TYPE__HINGE:
			getHinge().clear();
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
		case CpacsPackage.ROTOR_HUB_HINGES_TYPE__HINGE:
			return hinge != null && !hinge.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RotorHubHingesTypeImpl
