/**
 */
package Cpacs.impl;

import Cpacs.AeroPerformanceControlElementType;
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
 * An implementation of the model object '<em><b>Aero Performance Control Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroPerformanceControlElementTypeImpl#getControlDeviceUID <em>Control Device UID</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceControlElementTypeImpl#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceControlElementTypeImpl#getControlDistributorUID <em>Control Distributor UID</em>}</li>
 *   <li>{@link Cpacs.impl.AeroPerformanceControlElementTypeImpl#getCommandInput <em>Command Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroPerformanceControlElementTypeImpl extends ComplexBaseTypeImpl
		implements AeroPerformanceControlElementType {
	/**
	 * The cached value of the '{@link #getControlDeviceUID() <em>Control Device UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlDeviceUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType controlDeviceUID;

	/**
	 * The cached value of the '{@link #getControlParameter() <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlParameter()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType controlParameter;

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
	 * The cached value of the '{@link #getCommandInput() <em>Command Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandInput()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType commandInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroPerformanceControlElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroPerformanceControlElementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getControlDeviceUID() {
		return controlDeviceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlDeviceUID(StringUIDBaseType newControlDeviceUID, NotificationChain msgs) {
		StringUIDBaseType oldControlDeviceUID = controlDeviceUID;
		controlDeviceUID = newControlDeviceUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID, oldControlDeviceUID,
					newControlDeviceUID);
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
	public void setControlDeviceUID(StringUIDBaseType newControlDeviceUID) {
		if (newControlDeviceUID != controlDeviceUID) {
			NotificationChain msgs = null;
			if (controlDeviceUID != null)
				msgs = ((InternalEObject) controlDeviceUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID,
						null, msgs);
			if (newControlDeviceUID != null)
				msgs = ((InternalEObject) newControlDeviceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID,
						null, msgs);
			msgs = basicSetControlDeviceUID(newControlDeviceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID, newControlDeviceUID,
					newControlDeviceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getControlParameter() {
		return controlParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlParameter(DoubleBaseType newControlParameter, NotificationChain msgs) {
		DoubleBaseType oldControlParameter = controlParameter;
		controlParameter = newControlParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_PARAMETER, oldControlParameter,
					newControlParameter);
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
	public void setControlParameter(DoubleBaseType newControlParameter) {
		if (newControlParameter != controlParameter) {
			NotificationChain msgs = null;
			if (controlParameter != null)
				msgs = ((InternalEObject) controlParameter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_PARAMETER,
						null, msgs);
			if (newControlParameter != null)
				msgs = ((InternalEObject) newControlParameter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_PARAMETER,
						null, msgs);
			msgs = basicSetControlParameter(newControlParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_PARAMETER, newControlParameter,
					newControlParameter));
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
					CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DISTRIBUTOR_UID,
					oldControlDistributorUID, newControlDistributorUID);
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
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DISTRIBUTOR_UID,
						null, msgs);
			if (newControlDistributorUID != null)
				msgs = ((InternalEObject) newControlDistributorUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DISTRIBUTOR_UID,
						null, msgs);
			msgs = basicSetControlDistributorUID(newControlDistributorUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DISTRIBUTOR_UID,
					newControlDistributorUID, newControlDistributorUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getCommandInput() {
		return commandInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandInput(DoubleBaseType newCommandInput, NotificationChain msgs) {
		DoubleBaseType oldCommandInput = commandInput;
		commandInput = newCommandInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__COMMAND_INPUT, oldCommandInput,
					newCommandInput);
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
	public void setCommandInput(DoubleBaseType newCommandInput) {
		if (newCommandInput != commandInput) {
			NotificationChain msgs = null;
			if (commandInput != null)
				msgs = ((InternalEObject) commandInput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__COMMAND_INPUT,
						null, msgs);
			if (newCommandInput != null)
				msgs = ((InternalEObject) newCommandInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__COMMAND_INPUT,
						null, msgs);
			msgs = basicSetCommandInput(newCommandInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__COMMAND_INPUT, newCommandInput,
					newCommandInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID:
			return basicSetControlDeviceUID(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_PARAMETER:
			return basicSetControlParameter(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DISTRIBUTOR_UID:
			return basicSetControlDistributorUID(null, msgs);
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__COMMAND_INPUT:
			return basicSetCommandInput(null, msgs);
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
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID:
			return getControlDeviceUID();
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_PARAMETER:
			return getControlParameter();
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DISTRIBUTOR_UID:
			return getControlDistributorUID();
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__COMMAND_INPUT:
			return getCommandInput();
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
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID:
			setControlDeviceUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_PARAMETER:
			setControlParameter((DoubleBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DISTRIBUTOR_UID:
			setControlDistributorUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__COMMAND_INPUT:
			setCommandInput((DoubleBaseType) newValue);
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
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID:
			setControlDeviceUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_PARAMETER:
			setControlParameter((DoubleBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DISTRIBUTOR_UID:
			setControlDistributorUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__COMMAND_INPUT:
			setCommandInput((DoubleBaseType) null);
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
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID:
			return controlDeviceUID != null;
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_PARAMETER:
			return controlParameter != null;
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__CONTROL_DISTRIBUTOR_UID:
			return controlDistributorUID != null;
		case CpacsPackage.AERO_PERFORMANCE_CONTROL_ELEMENT_TYPE__COMMAND_INPUT:
			return commandInput != null;
		}
		return super.eIsSet(featureID);
	}

} //AeroPerformanceControlElementTypeImpl
