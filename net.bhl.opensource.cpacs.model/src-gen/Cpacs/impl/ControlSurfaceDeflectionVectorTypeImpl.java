/**
 */
package Cpacs.impl;

import Cpacs.ControlSurfaceDeflectionVectorType;
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
 * An implementation of the model object '<em><b>Control Surface Deflection Vector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.ControlSurfaceDeflectionVectorTypeImpl#getControlSurfaceUID <em>Control Surface UID</em>}</li>
 *   <li>{@link Cpacs.impl.ControlSurfaceDeflectionVectorTypeImpl#getControlParameters <em>Control Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlSurfaceDeflectionVectorTypeImpl extends ComplexBaseTypeImpl
		implements ControlSurfaceDeflectionVectorType {
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
	protected ControlSurfaceDeflectionVectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getControlSurfaceDeflectionVectorType();
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
					CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_SURFACE_UID, oldControlSurfaceUID,
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
				msgs = ((InternalEObject) controlSurfaceUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_SURFACE_UID, null, msgs);
			if (newControlSurfaceUID != null)
				msgs = ((InternalEObject) newControlSurfaceUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_SURFACE_UID, null, msgs);
			msgs = basicSetControlSurfaceUID(newControlSurfaceUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_SURFACE_UID, newControlSurfaceUID,
					newControlSurfaceUID));
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
					CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS, oldControlParameters,
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
	public void setControlParameters(StringVectorBaseType newControlParameters) {
		if (newControlParameters != controlParameters) {
			NotificationChain msgs = null;
			if (controlParameters != null)
				msgs = ((InternalEObject) controlParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS, null, msgs);
			if (newControlParameters != null)
				msgs = ((InternalEObject) newControlParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS, null, msgs);
			msgs = basicSetControlParameters(newControlParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS, newControlParameters,
					newControlParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_SURFACE_UID:
			return basicSetControlSurfaceUID(null, msgs);
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS:
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
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_SURFACE_UID:
			return getControlSurfaceUID();
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS:
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
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_SURFACE_UID:
			setControlSurfaceUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS:
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
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_SURFACE_UID:
			setControlSurfaceUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS:
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
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_SURFACE_UID:
			return controlSurfaceUID != null;
		case CpacsPackage.CONTROL_SURFACE_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS:
			return controlParameters != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlSurfaceDeflectionVectorTypeImpl
