/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.GearDeflectionVectorType;
import Cpacs.StringUIDBaseType;
import Cpacs.StringVectorBaseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gear Deflection Vector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.GearDeflectionVectorTypeImpl#getGearUID <em>Gear UID</em>}</li>
 *   <li>{@link Cpacs.impl.GearDeflectionVectorTypeImpl#getControlParameters <em>Control Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GearDeflectionVectorTypeImpl extends ComplexBaseTypeImpl implements GearDeflectionVectorType {
	/**
	 * The cached value of the '{@link #getGearUID() <em>Gear UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGearUID()
	 * @generated
	 * @ordered
	 */
	protected StringUIDBaseType gearUID;

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
	protected GearDeflectionVectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getGearDeflectionVectorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringUIDBaseType getGearUID() {
		return gearUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGearUID(StringUIDBaseType newGearUID, NotificationChain msgs) {
		StringUIDBaseType oldGearUID = gearUID;
		gearUID = newGearUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__GEAR_UID, oldGearUID, newGearUID);
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
	public void setGearUID(StringUIDBaseType newGearUID) {
		if (newGearUID != gearUID) {
			NotificationChain msgs = null;
			if (gearUID != null)
				msgs = ((InternalEObject) gearUID).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__GEAR_UID, null, msgs);
			if (newGearUID != null)
				msgs = ((InternalEObject) newGearUID).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__GEAR_UID, null, msgs);
			msgs = basicSetGearUID(newGearUID, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__GEAR_UID,
					newGearUID, newGearUID));
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
					CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS, oldControlParameters,
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
				msgs = ((InternalEObject) controlParameters).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS, null,
						msgs);
			if (newControlParameters != null)
				msgs = ((InternalEObject) newControlParameters).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS, null,
						msgs);
			msgs = basicSetControlParameters(newControlParameters, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS, newControlParameters,
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
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__GEAR_UID:
			return basicSetGearUID(null, msgs);
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS:
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
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__GEAR_UID:
			return getGearUID();
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS:
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
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__GEAR_UID:
			setGearUID((StringUIDBaseType) newValue);
			return;
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS:
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
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__GEAR_UID:
			setGearUID((StringUIDBaseType) null);
			return;
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS:
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
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__GEAR_UID:
			return gearUID != null;
		case CpacsPackage.GEAR_DEFLECTION_VECTOR_TYPE__CONTROL_PARAMETERS:
			return controlParameters != null;
		}
		return super.eIsSet(featureID);
	}

} //GearDeflectionVectorTypeImpl
