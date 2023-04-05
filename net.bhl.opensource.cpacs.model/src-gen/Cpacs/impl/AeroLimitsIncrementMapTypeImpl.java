/**
 */
package Cpacs.impl;

import Cpacs.AeroLimitsIncrementMapType;
import Cpacs.CpacsPackage;
import Cpacs.DoubleVectorBaseType;
import Cpacs.OperationLimitIncrementsType;
import Cpacs.StringUIDBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aero Limits Increment Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.AeroLimitsIncrementMapTypeImpl#getControlDeviceUID <em>Control Device UID</em>}</li>
 *   <li>{@link Cpacs.impl.AeroLimitsIncrementMapTypeImpl#getControlParameters <em>Control Parameters</em>}</li>
 *   <li>{@link Cpacs.impl.AeroLimitsIncrementMapTypeImpl#getControlDistributorUID <em>Control Distributor UID</em>}</li>
 *   <li>{@link Cpacs.impl.AeroLimitsIncrementMapTypeImpl#getCommandInputs <em>Command Inputs</em>}</li>
 *   <li>{@link Cpacs.impl.AeroLimitsIncrementMapTypeImpl#getAeroPerformanceIncrementMapUID <em>Aero Performance Increment Map UID</em>}</li>
 *   <li>{@link Cpacs.impl.AeroLimitsIncrementMapTypeImpl#getOperationLimitIncrements <em>Operation Limit Increments</em>}</li>
 *   <li>{@link Cpacs.impl.AeroLimitsIncrementMapTypeImpl#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AeroLimitsIncrementMapTypeImpl extends ComplexBaseTypeImpl implements AeroLimitsIncrementMapType {
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
	 * The cached value of the '{@link #getControlParameters() <em>Control Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlParameters()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType controlParameters;

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
	 * The cached value of the '{@link #getCommandInputs() <em>Command Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandInputs()
	 * @generated
	 * @ordered
	 */
	protected DoubleVectorBaseType commandInputs;

	/**
	 * The cached value of the '{@link #getAeroPerformanceIncrementMapUID() <em>Aero Performance Increment Map UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAeroPerformanceIncrementMapUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType aeroPerformanceIncrementMapUID;

	/**
	 * The cached value of the '{@link #getOperationLimitIncrements() <em>Operation Limit Increments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationLimitIncrements()
	 * @generated
	 * @ordered
	 */
	protected OperationLimitIncrementsType operationLimitIncrements;

	/**
	 * The default value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUID() <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUID()
	 * @generated
	 * @ordered
	 */
	protected String uID = UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AeroLimitsIncrementMapTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getAeroLimitsIncrementMapType();
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
					CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID, oldControlDeviceUID,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID, null,
						msgs);
			if (newControlDeviceUID != null)
				msgs = ((InternalEObject) newControlDeviceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID, null,
						msgs);
			msgs = basicSetControlDeviceUID(newControlDeviceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID, newControlDeviceUID,
					newControlDeviceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getControlParameters() {
		return controlParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlParameters(DoubleVectorBaseType newControlParameters,
			NotificationChain msgs) {
		DoubleVectorBaseType oldControlParameters = controlParameters;
		controlParameters = newControlParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS, oldControlParameters,
					newControlParameters);
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
	public void setControlParameters(DoubleVectorBaseType newControlParameters) {
		if (newControlParameters != controlParameters) {
			NotificationChain msgs = null;
			if (controlParameters != null)
				msgs = ((InternalEObject) controlParameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS, null,
						msgs);
			if (newControlParameters != null)
				msgs = ((InternalEObject) newControlParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS, null,
						msgs);
			msgs = basicSetControlParameters(newControlParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS, newControlParameters,
					newControlParameters));
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
					CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID, oldControlDistributorUID,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID,
						null, msgs);
			if (newControlDistributorUID != null)
				msgs = ((InternalEObject) newControlDistributorUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID,
						null, msgs);
			msgs = basicSetControlDistributorUID(newControlDistributorUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID, newControlDistributorUID,
					newControlDistributorUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleVectorBaseType getCommandInputs() {
		return commandInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommandInputs(DoubleVectorBaseType newCommandInputs, NotificationChain msgs) {
		DoubleVectorBaseType oldCommandInputs = commandInputs;
		commandInputs = newCommandInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__COMMAND_INPUTS, oldCommandInputs, newCommandInputs);
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
	public void setCommandInputs(DoubleVectorBaseType newCommandInputs) {
		if (newCommandInputs != commandInputs) {
			NotificationChain msgs = null;
			if (commandInputs != null)
				msgs = ((InternalEObject) commandInputs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__COMMAND_INPUTS, null,
						msgs);
			if (newCommandInputs != null)
				msgs = ((InternalEObject) newCommandInputs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__COMMAND_INPUTS, null,
						msgs);
			msgs = basicSetCommandInputs(newCommandInputs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__COMMAND_INPUTS, newCommandInputs, newCommandInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getAeroPerformanceIncrementMapUID() {
		return aeroPerformanceIncrementMapUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAeroPerformanceIncrementMapUID(StringUIDBaseType newAeroPerformanceIncrementMapUID,
			NotificationChain msgs) {
		StringUIDBaseType oldAeroPerformanceIncrementMapUID = aeroPerformanceIncrementMapUID;
		aeroPerformanceIncrementMapUID = newAeroPerformanceIncrementMapUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__AERO_PERFORMANCE_INCREMENT_MAP_UID,
					oldAeroPerformanceIncrementMapUID, newAeroPerformanceIncrementMapUID);
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
	public void setAeroPerformanceIncrementMapUID(StringUIDBaseType newAeroPerformanceIncrementMapUID) {
		if (newAeroPerformanceIncrementMapUID != aeroPerformanceIncrementMapUID) {
			NotificationChain msgs = null;
			if (aeroPerformanceIncrementMapUID != null)
				msgs = ((InternalEObject) aeroPerformanceIncrementMapUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__AERO_PERFORMANCE_INCREMENT_MAP_UID,
						null, msgs);
			if (newAeroPerformanceIncrementMapUID != null)
				msgs = ((InternalEObject) newAeroPerformanceIncrementMapUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__AERO_PERFORMANCE_INCREMENT_MAP_UID,
						null, msgs);
			msgs = basicSetAeroPerformanceIncrementMapUID(newAeroPerformanceIncrementMapUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__AERO_PERFORMANCE_INCREMENT_MAP_UID,
					newAeroPerformanceIncrementMapUID, newAeroPerformanceIncrementMapUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationLimitIncrementsType getOperationLimitIncrements() {
		return operationLimitIncrements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationLimitIncrements(OperationLimitIncrementsType newOperationLimitIncrements,
			NotificationChain msgs) {
		OperationLimitIncrementsType oldOperationLimitIncrements = operationLimitIncrements;
		operationLimitIncrements = newOperationLimitIncrements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__OPERATION_LIMIT_INCREMENTS,
					oldOperationLimitIncrements, newOperationLimitIncrements);
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
	public void setOperationLimitIncrements(OperationLimitIncrementsType newOperationLimitIncrements) {
		if (newOperationLimitIncrements != operationLimitIncrements) {
			NotificationChain msgs = null;
			if (operationLimitIncrements != null)
				msgs = ((InternalEObject) operationLimitIncrements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__OPERATION_LIMIT_INCREMENTS, null, msgs);
			if (newOperationLimitIncrements != null)
				msgs = ((InternalEObject) newOperationLimitIncrements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__OPERATION_LIMIT_INCREMENTS, null, msgs);
			msgs = basicSetOperationLimitIncrements(newOperationLimitIncrements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__OPERATION_LIMIT_INCREMENTS,
					newOperationLimitIncrements, newOperationLimitIncrements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUID() {
		return uID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUID(String newUID) {
		String oldUID = uID;
		uID = newUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__UID,
					oldUID, uID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID:
			return basicSetControlDeviceUID(null, msgs);
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS:
			return basicSetControlParameters(null, msgs);
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID:
			return basicSetControlDistributorUID(null, msgs);
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__COMMAND_INPUTS:
			return basicSetCommandInputs(null, msgs);
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__AERO_PERFORMANCE_INCREMENT_MAP_UID:
			return basicSetAeroPerformanceIncrementMapUID(null, msgs);
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__OPERATION_LIMIT_INCREMENTS:
			return basicSetOperationLimitIncrements(null, msgs);
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
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID:
			return getControlDeviceUID();
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS:
			return getControlParameters();
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID:
			return getControlDistributorUID();
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__COMMAND_INPUTS:
			return getCommandInputs();
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__AERO_PERFORMANCE_INCREMENT_MAP_UID:
			return getAeroPerformanceIncrementMapUID();
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__OPERATION_LIMIT_INCREMENTS:
			return getOperationLimitIncrements();
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__UID:
			return getUID();
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
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID:
			setControlDeviceUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS:
			setControlParameters((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID:
			setControlDistributorUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__COMMAND_INPUTS:
			setCommandInputs((DoubleVectorBaseType) newValue);
			return;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__AERO_PERFORMANCE_INCREMENT_MAP_UID:
			setAeroPerformanceIncrementMapUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__OPERATION_LIMIT_INCREMENTS:
			setOperationLimitIncrements((OperationLimitIncrementsType) newValue);
			return;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__UID:
			setUID((String) newValue);
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
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID:
			setControlDeviceUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS:
			setControlParameters((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID:
			setControlDistributorUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__COMMAND_INPUTS:
			setCommandInputs((DoubleVectorBaseType) null);
			return;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__AERO_PERFORMANCE_INCREMENT_MAP_UID:
			setAeroPerformanceIncrementMapUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__OPERATION_LIMIT_INCREMENTS:
			setOperationLimitIncrements((OperationLimitIncrementsType) null);
			return;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__UID:
			setUID(UID_EDEFAULT);
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
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DEVICE_UID:
			return controlDeviceUID != null;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_PARAMETERS:
			return controlParameters != null;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__CONTROL_DISTRIBUTOR_UID:
			return controlDistributorUID != null;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__COMMAND_INPUTS:
			return commandInputs != null;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__AERO_PERFORMANCE_INCREMENT_MAP_UID:
			return aeroPerformanceIncrementMapUID != null;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__OPERATION_LIMIT_INCREMENTS:
			return operationLimitIncrements != null;
		case CpacsPackage.AERO_LIMITS_INCREMENT_MAP_TYPE__UID:
			return UID_EDEFAULT == null ? uID != null : !UID_EDEFAULT.equals(uID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uID: ");
		result.append(uID);
		result.append(')');
		return result.toString();
	}

} //AeroLimitsIncrementMapTypeImpl
