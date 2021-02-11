/**
 */
package Cpacs.impl;

import Cpacs.ControlElementType;
import Cpacs.CpacsPackage;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlElementTypeImpl#getControlDeviceUID <em>Control Device UID</em>}</li>
 *   <li>{@link Cpacs.impl.ControlElementTypeImpl#getControlParameters <em>Control Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlElementTypeImpl extends ComplexBaseTypeImpl implements ControlElementType {
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
	protected StringVectorBaseType controlParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlElementType();
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
					CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID, oldControlDeviceUID, newControlDeviceUID);
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID, null, msgs);
			if (newControlDeviceUID != null)
				msgs = ((InternalEObject) newControlDeviceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID, null, msgs);
			msgs = basicSetControlDeviceUID(newControlDeviceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID,
					newControlDeviceUID, newControlDeviceUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringVectorBaseType getControlParameters() {
		return controlParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlParameters(StringVectorBaseType newControlParameters,
			NotificationChain msgs) {
		StringVectorBaseType oldControlParameters = controlParameters;
		controlParameters = newControlParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_PARAMETERS, oldControlParameters, newControlParameters);
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
	public void setControlParameters(StringVectorBaseType newControlParameters) {
		if (newControlParameters != controlParameters) {
			NotificationChain msgs = null;
			if (controlParameters != null)
				msgs = ((InternalEObject) controlParameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_PARAMETERS, null, msgs);
			if (newControlParameters != null)
				msgs = ((InternalEObject) newControlParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_PARAMETERS, null, msgs);
			msgs = basicSetControlParameters(newControlParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_PARAMETERS,
					newControlParameters, newControlParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID:
			return basicSetControlDeviceUID(null, msgs);
		case CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_PARAMETERS:
			return basicSetControlParameters(null, msgs);
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
		case CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID:
			return getControlDeviceUID();
		case CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_PARAMETERS:
			return getControlParameters();
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
		case CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID:
			setControlDeviceUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_PARAMETERS:
			setControlParameters((StringVectorBaseType) newValue);
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
		case CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID:
			setControlDeviceUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_PARAMETERS:
			setControlParameters((StringVectorBaseType) null);
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
		case CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_DEVICE_UID:
			return controlDeviceUID != null;
		case CpacsPackage.CONTROL_ELEMENT_TYPE__CONTROL_PARAMETERS:
			return controlParameters != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlElementTypeImpl
