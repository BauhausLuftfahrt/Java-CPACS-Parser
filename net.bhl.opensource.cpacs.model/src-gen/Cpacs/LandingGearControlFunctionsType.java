/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Control Functions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearControlFunctionsType#getExtensionPath <em>Extension Path</em>}</li>
 *   <li>{@link Cpacs.LandingGearControlFunctionsType#getSteeringPath <em>Steering Path</em>}</li>
 *   <li>{@link Cpacs.LandingGearControlFunctionsType#getBrakingState <em>Braking State</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearControlFunctionsType()
 * @model extendedMetaData="name='landingGearControlFunctionsType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearControlFunctionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension path
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Path</em>' containment reference.
	 * @see #setExtensionPath(LandingGearExtensionFunctionType)
	 * @see Cpacs.CpacsPackage#getLandingGearControlFunctionsType_ExtensionPath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extensionPath' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingGearExtensionFunctionType getExtensionPath();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearControlFunctionsType#getExtensionPath <em>Extension Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Path</em>' containment reference.
	 * @see #getExtensionPath()
	 * @generated
	 */
	void setExtensionPath(LandingGearExtensionFunctionType value);

	/**
	 * Returns the value of the '<em><b>Steering Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Steering path
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steering Path</em>' containment reference.
	 * @see #setSteeringPath(LandingGearSteeringFunctionType)
	 * @see Cpacs.CpacsPackage#getLandingGearControlFunctionsType_SteeringPath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='steeringPath' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingGearSteeringFunctionType getSteeringPath();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearControlFunctionsType#getSteeringPath <em>Steering Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steering Path</em>' containment reference.
	 * @see #getSteeringPath()
	 * @generated
	 */
	void setSteeringPath(LandingGearSteeringFunctionType value);

	/**
	 * Returns the value of the '<em><b>Braking State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Braking state
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Braking State</em>' containment reference.
	 * @see #setBrakingState(LandingGearBrakingStateType)
	 * @see Cpacs.CpacsPackage#getLandingGearControlFunctionsType_BrakingState()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='brakingState' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingGearBrakingStateType getBrakingState();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearControlFunctionsType#getBrakingState <em>Braking State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Braking State</em>' containment reference.
	 * @see #getBrakingState()
	 * @generated
	 */
	void setBrakingState(LandingGearBrakingStateType value);

} // LandingGearControlFunctionsType
