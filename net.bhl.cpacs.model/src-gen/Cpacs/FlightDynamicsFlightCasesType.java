/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Dynamics Flight Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightDynamicsFlightCasesType#getFlightCase <em>Flight Case</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCasesType()
 * @model extendedMetaData="name='flightDynamicsFlightCasesType' kind='elementOnly'"
 * @generated
 */
public interface FlightDynamicsFlightCasesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Flight Case</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FlightDynamicsFlightCaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Case</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFlightDynamicsFlightCasesType_FlightCase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flightCase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FlightDynamicsFlightCaseType> getFlightCase();

} // FlightDynamicsFlightCasesType
