/**
 */
package Cpacs.impl;

import Cpacs.ControlFunctionsType;
import Cpacs.ControlLawModeType;
import Cpacs.CpacsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Law Mode Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlLawModeTypeImpl#getControlFunctions <em>Control Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlLawModeTypeImpl extends ComplexBaseTypeImpl implements ControlLawModeType {
	/**
	 * The cached value of the '{@link #getControlFunctions() <em>Control Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFunctions()
	 * @generated
	 * @ordered
	 */
	protected ControlFunctionsType controlFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlLawModeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlLawModeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlFunctionsType getControlFunctions() {
		return controlFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlFunctions(ControlFunctionsType newControlFunctions,
			NotificationChain msgs) {
		ControlFunctionsType oldControlFunctions = controlFunctions;
		controlFunctions = newControlFunctions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_LAW_MODE_TYPE__CONTROL_FUNCTIONS, oldControlFunctions, newControlFunctions);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlFunctions(ControlFunctionsType newControlFunctions) {
		if (newControlFunctions != controlFunctions) {
			NotificationChain msgs = null;
			if (controlFunctions != null)
				msgs = ((InternalEObject) controlFunctions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_LAW_MODE_TYPE__CONTROL_FUNCTIONS, null, msgs);
			if (newControlFunctions != null)
				msgs = ((InternalEObject) newControlFunctions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_LAW_MODE_TYPE__CONTROL_FUNCTIONS, null, msgs);
			msgs = basicSetControlFunctions(newControlFunctions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_LAW_MODE_TYPE__CONTROL_FUNCTIONS,
					newControlFunctions, newControlFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_LAW_MODE_TYPE__CONTROL_FUNCTIONS:
			return basicSetControlFunctions(null, msgs);
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
		case CpacsPackage.CONTROL_LAW_MODE_TYPE__CONTROL_FUNCTIONS:
			return getControlFunctions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CpacsPackage.CONTROL_LAW_MODE_TYPE__CONTROL_FUNCTIONS:
			setControlFunctions((ControlFunctionsType) newValue);
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
		case CpacsPackage.CONTROL_LAW_MODE_TYPE__CONTROL_FUNCTIONS:
			setControlFunctions((ControlFunctionsType) null);
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
		case CpacsPackage.CONTROL_LAW_MODE_TYPE__CONTROL_FUNCTIONS:
			return controlFunctions != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlLawModeTypeImpl
