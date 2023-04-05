/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Extension Function Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearExtensionFunctionStepType#getStepType <em>Step Type</em>}</li>
 *   <li>{@link Cpacs.LandingGearExtensionFunctionStepType#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link Cpacs.LandingGearExtensionFunctionStepType#getExtensionAngle <em>Extension Angle</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearExtensionFunctionStepType()
 * @model extendedMetaData="name='landingGearExtensionFunctionStepType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearExtensionFunctionStepType extends EObject {
	/**
	 * Returns the value of the '<em><b>Step Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.StepTypeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Step type (retracted or extracted)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step Type</em>' attribute.
	 * @see Cpacs.StepTypeType1
	 * @see #isSetStepType()
	 * @see #unsetStepType()
	 * @see #setStepType(StepTypeType1)
	 * @see Cpacs.CpacsPackage#getLandingGearExtensionFunctionStepType_StepType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='stepType' namespace='##targetNamespace'"
	 * @generated
	 */
	StepTypeType1 getStepType();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearExtensionFunctionStepType#getStepType <em>Step Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Type</em>' attribute.
	 * @see Cpacs.StepTypeType1
	 * @see #isSetStepType()
	 * @see #unsetStepType()
	 * @see #getStepType()
	 * @generated
	 */
	void setStepType(StepTypeType1 value);

	/**
	 * Unsets the value of the '{@link Cpacs.LandingGearExtensionFunctionStepType#getStepType <em>Step Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStepType()
	 * @see #getStepType()
	 * @see #setStepType(StepTypeType1)
	 * @generated
	 */
	void unsetStepType();

	/**
	 * Returns whether the value of the '{@link Cpacs.LandingGearExtensionFunctionStepType#getStepType <em>Step Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step Type</em>' attribute is set.
	 * @see #unsetStepType()
	 * @see #getStepType()
	 * @see #setStepType(StepTypeType1)
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
	 * @see Cpacs.CpacsPackage#getLandingGearExtensionFunctionStepType_ControlParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getControlParameter();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearExtensionFunctionStepType#getControlParameter <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameter</em>' containment reference.
	 * @see #getControlParameter()
	 * @generated
	 */
	void setControlParameter(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Extension Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension angle of the main strut [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Angle</em>' containment reference.
	 * @see #setExtensionAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearExtensionFunctionStepType_ExtensionAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='extensionAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getExtensionAngle();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearExtensionFunctionStepType#getExtensionAngle <em>Extension Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Angle</em>' containment reference.
	 * @see #getExtensionAngle()
	 * @generated
	 */
	void setExtensionAngle(DoubleBaseType value);

} // LandingGearExtensionFunctionStepType
