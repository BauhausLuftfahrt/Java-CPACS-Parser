/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightEnvelopeType#getAtmosphericModel <em>Atmospheric Model</em>}</li>
 *   <li>{@link Cpacs.FlightEnvelopeType#getDeltaTemperature <em>Delta Temperature</em>}</li>
 *   <li>{@link Cpacs.FlightEnvelopeType#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightEnvelopeType()
 * @model extendedMetaData="name='flightEnvelopeType' kind='elementOnly'"
 * @generated
 */
public interface FlightEnvelopeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Atmospheric Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atmospheric Model</em>' containment reference.
	 * @see #setAtmosphericModel(AtmosphericModelType1)
	 * @see Cpacs.CpacsPackage#getFlightEnvelopeType_AtmosphericModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='atmosphericModel' namespace='##targetNamespace'"
	 * @generated
	 */
	AtmosphericModelType1 getAtmosphericModel();

	/**
	 * Sets the value of the '{@link Cpacs.FlightEnvelopeType#getAtmosphericModel <em>Atmospheric Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atmospheric Model</em>' containment reference.
	 * @see #getAtmosphericModel()
	 * @generated
	 */
	void setAtmosphericModel(AtmosphericModelType1 value);

	/**
	 * Returns the value of the '<em><b>Delta Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offset from temperature of the atmospheric model [K]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #setDeltaTemperature(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightEnvelopeType_DeltaTemperature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaTemperature' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaTemperature();

	/**
	 * Sets the value of the '{@link Cpacs.FlightEnvelopeType#getDeltaTemperature <em>Delta Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #getDeltaTemperature()
	 * @generated
	 */
	void setDeltaTemperature(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FlightEnvelopeSpeedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFlightEnvelopeType_Speed()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='speed' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FlightEnvelopeSpeedType> getSpeed();

} // FlightEnvelopeType
