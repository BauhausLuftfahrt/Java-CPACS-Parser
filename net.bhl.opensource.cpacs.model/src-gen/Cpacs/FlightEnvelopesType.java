/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Envelopes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightEnvelopesType#getFlightEnvelope <em>Flight Envelope</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightEnvelopesType()
 * @model extendedMetaData="name='flightEnvelopesType' kind='elementOnly'"
 * @generated
 */
public interface FlightEnvelopesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Flight Envelope</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FlightEnvelopeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Envelope</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFlightEnvelopesType_FlightEnvelope()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flightEnvelope' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FlightEnvelopeType> getFlightEnvelope();

} // FlightEnvelopesType
