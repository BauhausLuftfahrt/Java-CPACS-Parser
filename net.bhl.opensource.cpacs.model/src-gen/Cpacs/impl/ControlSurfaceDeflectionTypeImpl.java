/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceDeflectionType;
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
 * An implementation of the model object '<em><b>Control Surface Deflection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceDeflectionTypeImpl#getControlSurfaceUID <em>Control Surface UID</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceDeflectionTypeImpl#getControlParameter <em>Control Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceDeflectionTypeImpl extends ComplexBaseTypeImpl implements ControlSurfaceDeflectionType {
	/**
	 * The cached value of the '{@link #getControlSurfaceUID() <em>Control Surface UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlSurfaceUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType controlSurfaceUID;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfaceDeflectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceDeflectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getControlSurfaceUID() {
		return controlSurfaceUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetControlSurfaceUID(StringUIDBaseType newControlSurfaceUID, NotificationChain msgs) {
		StringUIDBaseType oldControlSurfaceUID = controlSurfaceUID;
		controlSurfaceUID = newControlSurfaceUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_SURFACE_UID, oldControlSurfaceUID,
					newControlSurfaceUID);
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
	public void setControlSurfaceUID(StringUIDBaseType newControlSurfaceUID) {
		if (newControlSurfaceUID != controlSurfaceUID) {
			NotificationChain msgs = null;
			if (controlSurfaceUID != null)
				msgs = ((InternalEObject) controlSurfaceUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_SURFACE_UID,
						null, msgs);
			if (newControlSurfaceUID != null)
				msgs = ((InternalEObject) newControlSurfaceUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_SURFACE_UID,
						null, msgs);
			msgs = basicSetControlSurfaceUID(newControlSurfaceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_SURFACE_UID, newControlSurfaceUID,
					newControlSurfaceUID));
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
					CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_PARAMETER, oldControlParameter,
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
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_PARAMETER, null,
						msgs);
			if (newControlParameter != null)
				msgs = ((InternalEObject) newControlParameter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_PARAMETER, null,
						msgs);
			msgs = basicSetControlParameter(newControlParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_PARAMETER, newControlParameter,
					newControlParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_SURFACE_UID:
			return basicSetControlSurfaceUID(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_PARAMETER:
			return basicSetControlParameter(null, msgs);
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
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_SURFACE_UID:
			return getControlSurfaceUID();
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_PARAMETER:
			return getControlParameter();
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
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_SURFACE_UID:
			setControlSurfaceUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_PARAMETER:
			setControlParameter((DoubleBaseType) newValue);
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
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_SURFACE_UID:
			setControlSurfaceUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_PARAMETER:
			setControlParameter((DoubleBaseType) null);
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
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_SURFACE_UID:
			return controlSurfaceUID != null;
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_TYPE__CONTROL_PARAMETER:
			return controlParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceDeflectionTypeImpl
