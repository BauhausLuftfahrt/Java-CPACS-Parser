/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Braking State Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearBrakingStateType#getControlParameterBraked <em>Control Parameter Braked</em>}</li>
 *   <li>{@link Cpacs.LandingGearBrakingStateType#getControlParameterReleased <em>Control Parameter Released</em>}</li>
 *   <li>{@link Cpacs.LandingGearBrakingStateType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearBrakingStateType()
 * @model extendedMetaData="name='landingGearBrakingStateType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearBrakingStateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Control Parameter Braked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control parameter indicating that the brake is set
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameter Braked</em>' containment reference.
	 * @see #setControlParameterBraked(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearBrakingStateType_ControlParameterBraked()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameterBraked' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getControlParameterBraked();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBrakingStateType#getControlParameterBraked <em>Control Parameter Braked</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameter Braked</em>' containment reference.
	 * @see #getControlParameterBraked()
	 * @generated
	 */
	void setControlParameterBraked(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Parameter Released</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control parameter indicating that the brake is released
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameter Released</em>' containment reference.
	 * @see #setControlParameterReleased(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearBrakingStateType_ControlParameterReleased()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameterReleased' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getControlParameterReleased();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBrakingStateType#getControlParameterReleased <em>Control Parameter Released</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameter Released</em>' containment reference.
	 * @see #getControlParameterReleased()
	 * @generated
	 */
	void setControlParameterReleased(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getLandingGearBrakingStateType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearBrakingStateType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // LandingGearBrakingStateType
