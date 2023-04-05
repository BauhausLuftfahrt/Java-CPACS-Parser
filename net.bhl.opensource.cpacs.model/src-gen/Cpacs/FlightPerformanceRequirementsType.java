/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Performance Requirements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPerformanceRequirementsType#getFlightPerformanceRequirement <em>Flight Performance Requirement</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPerformanceRequirementsType()
 * @model extendedMetaData="name='flightPerformanceRequirementsType' kind='elementOnly'"
 * @generated
 */
public interface FlightPerformanceRequirementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Flight Performance Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FlightPerformanceRequirementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Performance Requirement</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFlightPerformanceRequirementsType_FlightPerformanceRequirement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flightPerformanceRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FlightPerformanceRequirementType> getFlightPerformanceRequirement();

} // FlightPerformanceRequirementsType
