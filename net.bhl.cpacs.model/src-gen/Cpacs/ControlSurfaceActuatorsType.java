/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Actuators Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceActuatorsType#getActuator <em>Actuator</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceActuatorsType()
 * @model extendedMetaData="name='controlSurfaceActuatorsType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceActuatorsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControlSurfaceActuatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControlSurfaceActuatorsType_Actuator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actuator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlSurfaceActuatorType> getActuator();

} // ControlSurfaceActuatorsType
