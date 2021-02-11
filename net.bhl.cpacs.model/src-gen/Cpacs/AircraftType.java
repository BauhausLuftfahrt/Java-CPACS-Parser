/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aircraft Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AircraftType#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAircraftType()
 * @model extendedMetaData="name='aircraftType' kind='elementOnly'"
 * @generated
 */
public interface AircraftType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AircraftModelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAircraftType_Model()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='model' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AircraftModelType> getModel();

} // AircraftType
