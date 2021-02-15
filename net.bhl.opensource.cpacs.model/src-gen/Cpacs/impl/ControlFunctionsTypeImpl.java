/**
 */
package Cpacs.impl;

import Cpacs.ControlFunctionType;
import Cpacs.ControlFunctionsType;
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
 * An implementation of the model object '<em><b>Control Functions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlFunctionsTypeImpl#getControlFunction <em>Control Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlFunctionsTypeImpl extends ComplexBaseTypeImpl implements ControlFunctionsType {
	/**
	 * The cached value of the '{@link #getControlFunction() <em>Control Function</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFunction()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlFunctionType> controlFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFunctionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlFunctionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlFunctionType> getControlFunction() {
		if (controlFunction == null) {
			controlFunction = new EObjectContainmentEList<ControlFunctionType>(ControlFunctionType.class, this,
					CpacsPackage.CONTROL_FUNCTIONS_TYPE__CONTROL_FUNCTION);
		}
		return controlFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_FUNCTIONS_TYPE__CONTROL_FUNCTION:
			return ((InternalEList<?>) getControlFunction()).basicRemove(otherEnd, msgs);
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
		case CpacsPackage.CONTROL_FUNCTIONS_TYPE__CONTROL_FUNCTION:
			return getControlFunction();
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
		case CpacsPackage.CONTROL_FUNCTIONS_TYPE__CONTROL_FUNCTION:
			getControlFunction().clear();
			getControlFunction().addAll((Collection<? extends ControlFunctionType>) newValue);
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
		case CpacsPackage.CONTROL_FUNCTIONS_TYPE__CONTROL_FUNCTION:
			getControlFunction().clear();
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
		case CpacsPackage.CONTROL_FUNCTIONS_TYPE__CONTROL_FUNCTION:
			return controlFunction != null && !controlFunction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlFunctionsTypeImpl
