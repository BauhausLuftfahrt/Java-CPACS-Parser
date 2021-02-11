/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.TransmissionShaftInputType;
import Cpacs.TransmissionShaftInputsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission Shaft Inputs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.TransmissionShaftInputsTypeImpl#getShaftInput <em>Shaft Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransmissionShaftInputsTypeImpl extends ComplexBaseTypeImpl implements TransmissionShaftInputsType {
	/**
	 * The cached value of the '{@link #getShaftInput() <em>Shaft Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShaftInput()
	 * @generated
	 * @ordered
	 */
	protected EList<TransmissionShaftInputType> shaftInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionShaftInputsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getTransmissionShaftInputsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TransmissionShaftInputType> getShaftInput() {
		if (shaftInput == null) {
			shaftInput = new EObjectContainmentEList<TransmissionShaftInputType>(TransmissionShaftInputType.class, this,
					CpacsPackage.TRANSMISSION_SHAFT_INPUTS_TYPE__SHAFT_INPUT);
		}
		return shaftInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.TRANSMISSION_SHAFT_INPUTS_TYPE__SHAFT_INPUT:
			return ((InternalEList<?>) getShaftInput()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.TRANSMISSION_SHAFT_INPUTS_TYPE__SHAFT_INPUT:
			return getShaftInput();
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
		case CpacsPackage.TRANSMISSION_SHAFT_INPUTS_TYPE__SHAFT_INPUT:
			getShaftInput().clear();
			getShaftInput().addAll((Collection<? extends TransmissionShaftInputType>) newValue);
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
		case CpacsPackage.TRANSMISSION_SHAFT_INPUTS_TYPE__SHAFT_INPUT:
			getShaftInput().clear();
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
		case CpacsPackage.TRANSMISSION_SHAFT_INPUTS_TYPE__SHAFT_INPUT:
			return shaftInput != null && !shaftInput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransmissionShaftInputsTypeImpl
