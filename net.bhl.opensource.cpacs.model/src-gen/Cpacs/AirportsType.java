/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airports Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AirportsType#getAirport <em>Airport</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAirportsType()
 * @model extendedMetaData="name='airportsType' kind='elementOnly'"
 * @generated
 */
public interface AirportsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Airport</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AirportType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airport</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAirportsType_Airport()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='airport' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AirportType> getAirport();

} // AirportsType
