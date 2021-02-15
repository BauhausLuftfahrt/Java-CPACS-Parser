/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuators Fuselage Wing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ActuatorsFuselageWingType#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getActuatorsFuselageWingType()
 * @model extendedMetaData="name='actuatorsFuselageWingType' kind='elementOnly'"
 * @generated
 */
public interface ActuatorsFuselageWingType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ActuatorFuselageWingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of one actuator (e.g. trim actuator
	 *                                 of an HTP) of the attachment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuator</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getActuatorsFuselageWingType_Actuator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actuator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ActuatorFuselageWingType> getActuator();

} // ActuatorsFuselageWingType
