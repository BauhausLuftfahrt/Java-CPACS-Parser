/**
 */
package Cpacs.impl;

import Cpacs.ControlInputType;
import Cpacs.ControlInputsType;
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
 * An implementation of the model object '<em><b>Control Inputs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlInputsTypeImpl#getControlInput <em>Control Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlInputsTypeImpl extends ComplexBaseTypeImpl implements ControlInputsType {
	/**
	 * The cached value of the '{@link #getControlInput() <em>Control Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlInput()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlInputType> controlInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlInputsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlInputsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlInputType> getControlInput() {
		if (controlInput == null) {
			controlInput = new EObjectContainmentEList<ControlInputType>(ControlInputType.class, this,
					CpacsPackage.CONTROL_INPUTS_TYPE__CONTROL_INPUT);
		}
		return controlInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_INPUTS_TYPE__CONTROL_INPUT:
			return ((InternalEList<?>) getControlInput()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CONTROL_INPUTS_TYPE__CONTROL_INPUT:
			return getControlInput();
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
		case CpacsPackage.CONTROL_INPUTS_TYPE__CONTROL_INPUT:
			getControlInput().clear();
			getControlInput().addAll((Collection<? extends ControlInputType>) newValue);
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
		case CpacsPackage.CONTROL_INPUTS_TYPE__CONTROL_INPUT:
			getControlInput().clear();
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
		case CpacsPackage.CONTROL_INPUTS_TYPE__CONTROL_INPUT:
			return controlInput != null && !controlInput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlInputsTypeImpl
