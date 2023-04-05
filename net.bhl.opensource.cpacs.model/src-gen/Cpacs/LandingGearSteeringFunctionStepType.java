/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Steering Function Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearSteeringFunctionStepType#getStepType <em>Step Type</em>}</li>
 *   <li>{@link Cpacs.LandingGearSteeringFunctionStepType#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link Cpacs.LandingGearSteeringFunctionStepType#getSteeringAngle <em>Steering Angle</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearSteeringFunctionStepType()
 * @model extendedMetaData="name='landingGearSteeringFunctionStepType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearSteeringFunctionStepType extends EObject {
	/**
	 * Returns the value of the '<em><b>Step Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.StepTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Step type (centered, fullBackboard or fullStarboard)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step Type</em>' attribute.
	 * @see Cpacs.StepTypeType
	 * @see #isSetStepType()
	 * @see #unsetStepType()
	 * @see #setStepType(StepTypeType)
	 * @see Cpacs.CpacsPackage#getLandingGearSteeringFunctionStepType_StepType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='stepType' namespace='##targetNamespace'"
	 * @generated
	 */
	StepTypeType getStepType();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearSteeringFunctionStepType#getStepType <em>Step Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Type</em>' attribute.
	 * @see Cpacs.StepTypeType
	 * @see #isSetStepType()
	 * @see #unsetStepType()
	 * @see #getStepType()
	 * @generated
	 */
	void setStepType(StepTypeType value);

	/**
	 * Unsets the value of the '{@link Cpacs.LandingGearSteeringFunctionStepType#getStepType <em>Step Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStepType()
	 * @see #getStepType()
	 * @see #setStepType(StepTypeType)
	 * @generated
	 */
	void unsetStepType();

	/**
	 * Returns whether the value of the '{@link Cpacs.LandingGearSteeringFunctionStepType#getStepType <em>Step Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step Type</em>' attribute is set.
	 * @see #unsetStepType()
	 * @see #getStepType()
	 * @see #setStepType(StepTypeType)
	 * @generated
	 */
	boolean isSetStepType();

	/**
	 * Returns the value of the '<em><b>Control Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control parameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameter</em>' containment reference.
	 * @see #setControlParameter(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearSteeringFunctionStepType_ControlParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getControlParameter();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearSteeringFunctionStepType#getControlParameter <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameter</em>' containment reference.
	 * @see #getControlParameter()
	 * @generated
	 */
	void setControlParameter(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Steering Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Steering angle [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steering Angle</em>' containment reference.
	 * @see #setSteeringAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearSteeringFunctionStepType_SteeringAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='steeringAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSteeringAngle();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearSteeringFunctionStepType#getSteeringAngle <em>Steering Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steering Angle</em>' containment reference.
	 * @see #getSteeringAngle()
	 * @generated
	 */
	void setSteeringAngle(DoubleBaseType value);

} // LandingGearSteeringFunctionStepType
