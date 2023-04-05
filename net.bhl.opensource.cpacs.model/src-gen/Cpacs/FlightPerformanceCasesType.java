/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Performance Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPerformanceCasesType#getFlightPerformanceCase <em>Flight Performance Case</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPerformanceCasesType()
 * @model extendedMetaData="name='flightPerformanceCasesType' kind='elementOnly'"
 * @generated
 */
public interface FlightPerformanceCasesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Flight Performance Case</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FlightPerformanceCaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Performance Case</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFlightPerformanceCasesType_FlightPerformanceCase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flightPerformanceCase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FlightPerformanceCaseType> getFlightPerformanceCase();

} // FlightPerformanceCasesType
