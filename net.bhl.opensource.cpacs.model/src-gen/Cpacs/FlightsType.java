/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flights Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightsType#getFlight <em>Flight</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightsType()
 * @model extendedMetaData="name='flightsType' kind='elementOnly'"
 * @generated
 */
public interface FlightsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Flight</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FlightType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFlightsType_Flight()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flight' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FlightType> getFlight();

} // FlightsType
