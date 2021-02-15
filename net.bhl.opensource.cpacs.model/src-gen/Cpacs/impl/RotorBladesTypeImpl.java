/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.RotorBladesType;
import Cpacs.WingType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotor Blades Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.RotorBladesTypeImpl#getRotorBlade <em>Rotor Blade</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotorBladesTypeImpl extends ComplexBaseTypeImpl implements RotorBladesType {
	/**
	 * The cached value of the '{@link #getRotorBlade() <em>Rotor Blade</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotorBlade()
	 * @generated
	 * @ordered
	 */
	protected EList<WingType> rotorBlade;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RotorBladesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getRotorBladesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WingType> getRotorBlade() {
		if (rotorBlade == null) {
			rotorBlade = new EObjectContainmentEList<WingType>(WingType.class, this,
					CpacsPackage.ROTOR_BLADES_TYPE__ROTOR_BLADE);
		}
		return rotorBlade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.ROTOR_BLADES_TYPE__ROTOR_BLADE:
			return ((InternalEList<?>) getRotorBlade()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.ROTOR_BLADES_TYPE__ROTOR_BLADE:
			return getRotorBlade();
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
		case CpacsPackage.ROTOR_BLADES_TYPE__ROTOR_BLADE:
			getRotorBlade().clear();
			getRotorBlade().addAll((Collection<? extends WingType>) newValue);
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
		case CpacsPackage.ROTOR_BLADES_TYPE__ROTOR_BLADE:
			getRotorBlade().clear();
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
		case CpacsPackage.ROTOR_BLADES_TYPE__ROTOR_BLADE:
			return rotorBlade != null && !rotorBlade.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RotorBladesTypeImpl
