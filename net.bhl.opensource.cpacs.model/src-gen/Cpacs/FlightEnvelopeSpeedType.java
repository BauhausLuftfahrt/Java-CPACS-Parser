/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Envelope Speed Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightEnvelopeSpeedType#getSpeedName <em>Speed Name</em>}</li>
 *   <li>{@link Cpacs.FlightEnvelopeSpeedType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.FlightEnvelopeSpeedType#getTrueAirSpeed <em>True Air Speed</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightEnvelopeSpeedType()
 * @model extendedMetaData="name='flightEnvelopeSpeedType' kind='elementOnly'"
 * @generated
 */
public interface FlightEnvelopeSpeedType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Speed Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Name</em>' containment reference.
	 * @see #setSpeedName(SpeedDesignatorsType)
	 * @see Cpacs.CpacsPackage#getFlightEnvelopeSpeedType_SpeedName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='speedName' namespace='##targetNamespace'"
	 * @generated
	 */
	SpeedDesignatorsType getSpeedName();

	/**
	 * Sets the value of the '{@link Cpacs.FlightEnvelopeSpeedType#getSpeedName <em>Speed Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Name</em>' containment reference.
	 * @see #getSpeedName()
	 * @generated
	 */
	void setSpeedName(SpeedDesignatorsType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Vector with altitudes
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightEnvelopeSpeedType_Altitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.FlightEnvelopeSpeedType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>True Air Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Vector with True Airspeeds
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>True Air Speed</em>' containment reference.
	 * @see #setTrueAirSpeed(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightEnvelopeSpeedType_TrueAirSpeed()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='trueAirSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getTrueAirSpeed();

	/**
	 * Sets the value of the '{@link Cpacs.FlightEnvelopeSpeedType#getTrueAirSpeed <em>True Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Air Speed</em>' containment reference.
	 * @see #getTrueAirSpeed()
	 * @generated
	 */
	void setTrueAirSpeed(DoubleVectorBaseType value);

} // FlightEnvelopeSpeedType
