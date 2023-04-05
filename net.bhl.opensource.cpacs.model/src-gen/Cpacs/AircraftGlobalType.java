/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aircraft Global Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AircraftGlobalType#getDesignRange <em>Design Range</em>}</li>
 *   <li>{@link Cpacs.AircraftGlobalType#getPayload <em>Payload</em>}</li>
 *   <li>{@link Cpacs.AircraftGlobalType#getAirportCompatability <em>Airport Compatability</em>}</li>
 *   <li>{@link Cpacs.AircraftGlobalType#getPerformanceTargets <em>Performance Targets</em>}</li>
 *   <li>{@link Cpacs.AircraftGlobalType#getFlightEnvelopes <em>Flight Envelopes</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAircraftGlobalType()
 * @model extendedMetaData="name='aircraftGlobalType' kind='elementOnly'"
 * @generated
 */
public interface AircraftGlobalType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Design Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 designRange equals the full payload max
	 *                                 range, i.e. point B in payload range
	 *                                 diagram
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Design Range</em>' containment reference.
	 * @see #setDesignRange(RequirementType)
	 * @see Cpacs.CpacsPackage#getAircraftGlobalType_DesignRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='designRange' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getDesignRange();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftGlobalType#getDesignRange <em>Design Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Range</em>' containment reference.
	 * @see #getDesignRange()
	 * @generated
	 */
	void setDesignRange(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference.
	 * @see #setPayload(PayloadGlobalType)
	 * @see Cpacs.CpacsPackage#getAircraftGlobalType_Payload()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='payload' namespace='##targetNamespace'"
	 * @generated
	 */
	PayloadGlobalType getPayload();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftGlobalType#getPayload <em>Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' containment reference.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(PayloadGlobalType value);

	/**
	 * Returns the value of the '<em><b>Airport Compatability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airport Compatability</em>' containment reference.
	 * @see #setAirportCompatability(AirportCompatabilityGlobalType)
	 * @see Cpacs.CpacsPackage#getAircraftGlobalType_AirportCompatability()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airportCompatability' namespace='##targetNamespace'"
	 * @generated
	 */
	AirportCompatabilityGlobalType getAirportCompatability();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftGlobalType#getAirportCompatability <em>Airport Compatability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airport Compatability</em>' containment reference.
	 * @see #getAirportCompatability()
	 * @generated
	 */
	void setAirportCompatability(AirportCompatabilityGlobalType value);

	/**
	 * Returns the value of the '<em><b>Performance Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Targets</em>' containment reference.
	 * @see #setPerformanceTargets(PerformanceTargetsGlobalType)
	 * @see Cpacs.CpacsPackage#getAircraftGlobalType_PerformanceTargets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performanceTargets' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceTargetsGlobalType getPerformanceTargets();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftGlobalType#getPerformanceTargets <em>Performance Targets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Targets</em>' containment reference.
	 * @see #getPerformanceTargets()
	 * @generated
	 */
	void setPerformanceTargets(PerformanceTargetsGlobalType value);

	/**
	 * Returns the value of the '<em><b>Flight Envelopes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Envelopes</em>' containment reference.
	 * @see #setFlightEnvelopes(FlightEnvelopesType)
	 * @see Cpacs.CpacsPackage#getAircraftGlobalType_FlightEnvelopes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightEnvelopes' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightEnvelopesType getFlightEnvelopes();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftGlobalType#getFlightEnvelopes <em>Flight Envelopes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Envelopes</em>' containment reference.
	 * @see #getFlightEnvelopes()
	 * @generated
	 */
	void setFlightEnvelopes(FlightEnvelopesType value);

} // AircraftGlobalType
