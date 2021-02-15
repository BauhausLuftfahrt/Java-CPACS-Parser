/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Performance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPerformanceType#getPerformanceCases <em>Performance Cases</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPerformanceType()
 * @model extendedMetaData="name='flightPerformanceType' kind='elementOnly'"
 * @generated
 */
public interface FlightPerformanceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Performance Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Cases</em>' containment reference.
	 * @see #setPerformanceCases(FlightPerformanceCasesType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceType_PerformanceCases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performanceCases' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPerformanceCasesType getPerformanceCases();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceType#getPerformanceCases <em>Performance Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Cases</em>' containment reference.
	 * @see #getPerformanceCases()
	 * @generated
	 */
	void setPerformanceCases(FlightPerformanceCasesType value);

} // FlightPerformanceType
