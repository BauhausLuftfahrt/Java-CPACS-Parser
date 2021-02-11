/**
 */
package Cpacs.impl;

import Cpacs.CommandCaseCommandType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Case Command Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.CommandCaseCommandTypeImpl#getControlDistributorUID <em>Control Distributor UID</em>}</li>
 *   <li>{@link Cpacs.impl.CommandCaseCommandTypeImpl#getControlFunctionUID <em>Control Function UID</em>}</li>
 *   <li>{@link Cpacs.impl.CommandCaseCommandTypeImpl#getGain <em>Gain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandCaseCommandTypeImpl extends ComplexBaseTypeImpl implements CommandCaseCommandType {
	/**
	 * The cached value of the '{@link #getControlDistributorUID() <em>Control Distributor UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlDistributorUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType controlDistributorUID;

	/**
	 * The cached value of the '{@link #getControlFunctionUID() <em>Control Function UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFunctionUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType controlFunctionUID;

	/**
	 * The cached value of the '{@link #getGain() <em>Gain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGain()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType gain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandCaseCommandTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getCommandCaseCommandType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getControlDistributorUID() {
		return controlDistributorUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlDistributorUID(StringUIDBaseType newControlDistributorUID,
			NotificationChain msgs) {
		StringUIDBaseType oldControlDistributorUID = controlDistributorUID;
		controlDistributorUID = newControlDistributorUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_DISTRIBUTOR_UID, oldControlDistributorUID,
					newControlDistributorUID);
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
	public void setControlDistributorUID(StringUIDBaseType newControlDistributorUID) {
		if (newControlDistributorUID != controlDistributorUID) {
			NotificationChain msgs = null;
			if (controlDistributorUID != null)
				msgs = ((InternalEObject) controlDistributorUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_DISTRIBUTOR_UID, null,
						msgs);
			if (newControlDistributorUID != null)
				msgs = ((InternalEObject) newControlDistributorUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_DISTRIBUTOR_UID, null,
						msgs);
			msgs = basicSetControlDistributorUID(newControlDistributorUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_DISTRIBUTOR_UID, newControlDistributorUID,
					newControlDistributorUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getControlFunctionUID() {
		return controlFunctionUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlFunctionUID(StringUIDBaseType newControlFunctionUID,
			NotificationChain msgs) {
		StringUIDBaseType oldControlFunctionUID = controlFunctionUID;
		controlFunctionUID = newControlFunctionUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_FUNCTION_UID, oldControlFunctionUID,
					newControlFunctionUID);
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
	public void setControlFunctionUID(StringUIDBaseType newControlFunctionUID) {
		if (newControlFunctionUID != controlFunctionUID) {
			NotificationChain msgs = null;
			if (controlFunctionUID != null)
				msgs = ((InternalEObject) controlFunctionUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_FUNCTION_UID, null,
						msgs);
			if (newControlFunctionUID != null)
				msgs = ((InternalEObject) newControlFunctionUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_FUNCTION_UID, null,
						msgs);
			msgs = basicSetControlFunctionUID(newControlFunctionUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_FUNCTION_UID, newControlFunctionUID,
					newControlFunctionUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getGain() {
		return gain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGain(DoubleBaseType newGain, NotificationChain msgs) {
		DoubleBaseType oldGain = gain;
		gain = newGain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.COMMAND_CASE_COMMAND_TYPE__GAIN, oldGain, newGain);
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
	public void setGain(DoubleBaseType newGain) {
		if (newGain != gain) {
			NotificationChain msgs = null;
			if (gain != null)
				msgs = ((InternalEObject) gain).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASE_COMMAND_TYPE__GAIN, null, msgs);
			if (newGain != null)
				msgs = ((InternalEObject) newGain).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.COMMAND_CASE_COMMAND_TYPE__GAIN, null, msgs);
			msgs = basicSetGain(newGain, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.COMMAND_CASE_COMMAND_TYPE__GAIN, newGain,
					newGain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_DISTRIBUTOR_UID:
			return basicSetControlDistributorUID(null, msgs);
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_FUNCTION_UID:
			return basicSetControlFunctionUID(null, msgs);
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__GAIN:
			return basicSetGain(null, msgs);
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
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_DISTRIBUTOR_UID:
			return getControlDistributorUID();
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_FUNCTION_UID:
			return getControlFunctionUID();
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__GAIN:
			return getGain();
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
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_DISTRIBUTOR_UID:
			setControlDistributorUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_FUNCTION_UID:
			setControlFunctionUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__GAIN:
			setGain((DoubleBaseType) newValue);
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
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_DISTRIBUTOR_UID:
			setControlDistributorUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_FUNCTION_UID:
			setControlFunctionUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__GAIN:
			setGain((DoubleBaseType) null);
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
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_DISTRIBUTOR_UID:
			return controlDistributorUID != null;
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__CONTROL_FUNCTION_UID:
			return controlFunctionUID != null;
		case CpacsPackage.COMMAND_CASE_COMMAND_TYPE__GAIN:
			return gain != null;
		}
		return super.eIsSet(featureID);
	}

} //CommandCaseCommandTypeImpl
