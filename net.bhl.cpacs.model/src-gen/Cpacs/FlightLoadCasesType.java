/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Load Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightLoadCasesType#getFlightLoadCase <em>Flight Load Case</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightLoadCasesType()
 * @model extendedMetaData="name='flightLoadCasesType' kind='elementOnly'"
 * @generated
 */
public interface FlightLoadCasesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Flight Load Case</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FlightLoadCaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Load Case</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFlightLoadCasesType_FlightLoadCase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flightLoadCase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FlightLoadCaseType> getFlightLoadCase();

} // FlightLoadCasesType
