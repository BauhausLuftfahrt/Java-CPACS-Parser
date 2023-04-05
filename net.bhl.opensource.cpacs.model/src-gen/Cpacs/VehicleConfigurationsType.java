/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Configurations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.VehicleConfigurationsType#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getVehicleConfigurationsType()
 * @model extendedMetaData="name='vehicleConfigurationsType' kind='elementOnly'"
 * @generated
 */
public interface VehicleConfigurationsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.VehicleConfigurationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getVehicleConfigurationsType_Configuration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='configuration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VehicleConfigurationType> getConfiguration();

} // VehicleConfigurationsType
