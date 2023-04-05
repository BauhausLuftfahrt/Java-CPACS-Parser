/**
 */
package Cpacs.impl;

import Cpacs.CpacsPackage;
import Cpacs.DoubleBaseType;
import Cpacs.LandingGearSteeringFunctionStepType;
import Cpacs.StepTypeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Landing Gear Steering Function Step Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.impl.LandingGearSteeringFunctionStepTypeImpl#getStepType <em>Step Type</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearSteeringFunctionStepTypeImpl#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link Cpacs.impl.LandingGearSteeringFunctionStepTypeImpl#getSteeringAngle <em>Steering Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LandingGearSteeringFunctionStepTypeImpl extends MinimalEObjectImpl.Container
		implements LandingGearSteeringFunctionStepType {
	/**
	 * The default value of the '{@link #getStepType() <em>Step Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepType()
	 * @generated
	 * @ordered
	 */
	protected static final StepTypeType STEP_TYPE_EDEFAULT = StepTypeType.CENTERED;

	/**
	 * The cached value of the '{@link #getStepType() <em>Step Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepType()
	 * @generated
	 * @ordered
	 */
	protected StepTypeType stepType = STEP_TYPE_EDEFAULT;

	/**
	 * This is true if the Step Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepTypeESet;

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
	 * The cached value of the '{@link #getSteeringAngle() <em>Steering Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteeringAngle()
	 * @generated
	 * @ordered
	 */
	protected DoubleBaseType steeringAngle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LandingGearSteeringFunctionStepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpacsPackage.eINSTANCE.getLandingGearSteeringFunctionStepType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepTypeType getStepType() {
		return stepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStepType(StepTypeType newStepType) {
		StepTypeType oldStepType = stepType;
		stepType = newStepType == null ? STEP_TYPE_EDEFAULT : newStepType;
		boolean oldStepTypeESet = stepTypeESet;
		stepTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEP_TYPE, oldStepType, stepType,
					!oldStepTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStepType() {
		StepTypeType oldStepType = stepType;
		boolean oldStepTypeESet = stepTypeESet;
		stepType = STEP_TYPE_EDEFAULT;
		stepTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEP_TYPE, oldStepType, STEP_TYPE_EDEFAULT,
					oldStepTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStepType() {
		return stepTypeESet;
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
					CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__CONTROL_PARAMETER, oldControlParameter,
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
				msgs = ((InternalEObject) controlParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__CONTROL_PARAMETER, null, msgs);
			if (newControlParameter != null)
				msgs = ((InternalEObject) newControlParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__CONTROL_PARAMETER, null, msgs);
			msgs = basicSetControlParameter(newControlParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__CONTROL_PARAMETER, newControlParameter,
					newControlParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoubleBaseType getSteeringAngle() {
		return steeringAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSteeringAngle(DoubleBaseType newSteeringAngle, NotificationChain msgs) {
		DoubleBaseType oldSteeringAngle = steeringAngle;
		steeringAngle = newSteeringAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEERING_ANGLE, oldSteeringAngle,
					newSteeringAngle);
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
	public void setSteeringAngle(DoubleBaseType newSteeringAngle) {
		if (newSteeringAngle != steeringAngle) {
			NotificationChain msgs = null;
			if (steeringAngle != null)
				msgs = ((InternalEObject) steeringAngle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEERING_ANGLE,
						null, msgs);
			if (newSteeringAngle != null)
				msgs = ((InternalEObject) newSteeringAngle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEERING_ANGLE,
						null, msgs);
			msgs = basicSetSteeringAngle(newSteeringAngle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEERING_ANGLE, newSteeringAngle,
					newSteeringAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__CONTROL_PARAMETER:
			return basicSetControlParameter(null, msgs);
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEERING_ANGLE:
			return basicSetSteeringAngle(null, msgs);
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
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEP_TYPE:
			return getStepType();
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__CONTROL_PARAMETER:
			return getControlParameter();
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEERING_ANGLE:
			return getSteeringAngle();
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
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEP_TYPE:
			setStepType((StepTypeType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__CONTROL_PARAMETER:
			setControlParameter((DoubleBaseType) newValue);
			return;
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEERING_ANGLE:
			setSteeringAngle((DoubleBaseType) newValue);
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
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEP_TYPE:
			unsetStepType();
			return;
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__CONTROL_PARAMETER:
			setControlParameter((DoubleBaseType) null);
			return;
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEERING_ANGLE:
			setSteeringAngle((DoubleBaseType) null);
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
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEP_TYPE:
			return isSetStepType();
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__CONTROL_PARAMETER:
			return controlParameter != null;
		case CpacsPackage.LANDING_GEAR_STEERING_FUNCTION_STEP_TYPE__STEERING_ANGLE:
			return steeringAngle != null;
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
		result.append(" (stepType: ");
		if (stepTypeESet)
			result.append(stepType);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LandingGearSteeringFunctionStepTypeImpl
