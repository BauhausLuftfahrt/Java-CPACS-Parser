/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightType#getMissionUID <em>Mission UID</em>}</li>
 *   <li>{@link Cpacs.FlightType#getModelUID <em>Model UID</em>}</li>
 *   <li>{@link Cpacs.FlightType#getDepartureDate <em>Departure Date</em>}</li>
 *   <li>{@link Cpacs.FlightType#getDepartureTime <em>Departure Time</em>}</li>
 *   <li>{@link Cpacs.FlightType#getArrivalDate <em>Arrival Date</em>}</li>
 *   <li>{@link Cpacs.FlightType#getArrivalTime <em>Arrival Time</em>}</li>
 *   <li>{@link Cpacs.FlightType#getOperatingAirline <em>Operating Airline</em>}</li>
 *   <li>{@link Cpacs.FlightType#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link Cpacs.FlightType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightType()
 * @model extendedMetaData="name='flightType' kind='elementOnly'"
 * @generated
 */
public interface FlightType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mission UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MissionUID for the flights mission definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mission UID</em>' containment reference.
	 * @see #setMissionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFlightType_MissionUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='missionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMissionUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightType#getMissionUID <em>Mission UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission UID</em>' containment reference.
	 * @see #getMissionUID()
	 * @generated
	 */
	void setMissionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Model UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ModelUID of the aircraft appointed to perform the flight
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model UID</em>' containment reference.
	 * @see #setModelUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFlightType_ModelUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modelUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getModelUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightType#getModelUID <em>Model UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model UID</em>' containment reference.
	 * @see #getModelUID()
	 * @generated
	 */
	void setModelUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Departure Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Departure day of the flight
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Departure Date</em>' containment reference.
	 * @see #setDepartureDate(DateBaseType)
	 * @see Cpacs.CpacsPackage#getFlightType_DepartureDate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='departureDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateBaseType getDepartureDate();

	/**
	 * Sets the value of the '{@link Cpacs.FlightType#getDepartureDate <em>Departure Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Date</em>' containment reference.
	 * @see #getDepartureDate()
	 * @generated
	 */
	void setDepartureDate(DateBaseType value);

	/**
	 * Returns the value of the '<em><b>Departure Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time of departure - the time is defined as SOBT (Scheduled Off-Block Time) / STD (Scheduled Time of Departure)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Departure Time</em>' containment reference.
	 * @see #setDepartureTime(TimeBaseType)
	 * @see Cpacs.CpacsPackage#getFlightType_DepartureTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='departureTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeBaseType getDepartureTime();

	/**
	 * Sets the value of the '{@link Cpacs.FlightType#getDepartureTime <em>Departure Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departure Time</em>' containment reference.
	 * @see #getDepartureTime()
	 * @generated
	 */
	void setDepartureTime(TimeBaseType value);

	/**
	 * Returns the value of the '<em><b>Arrival Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Arrival day of the flight
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arrival Date</em>' containment reference.
	 * @see #setArrivalDate(DateBaseType)
	 * @see Cpacs.CpacsPackage#getFlightType_ArrivalDate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='arrivalDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateBaseType getArrivalDate();

	/**
	 * Sets the value of the '{@link Cpacs.FlightType#getArrivalDate <em>Arrival Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Date</em>' containment reference.
	 * @see #getArrivalDate()
	 * @generated
	 */
	void setArrivalDate(DateBaseType value);

	/**
	 * Returns the value of the '<em><b>Arrival Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time of arrival - the time is defined as SIBT (Scheduled In-Block Time) / STA (Scheduled Time of Arrival)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arrival Time</em>' containment reference.
	 * @see #setArrivalTime(TimeBaseType)
	 * @see Cpacs.CpacsPackage#getFlightType_ArrivalTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='arrivalTime' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeBaseType getArrivalTime();

	/**
	 * Sets the value of the '{@link Cpacs.FlightType#getArrivalTime <em>Arrival Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Time</em>' containment reference.
	 * @see #getArrivalTime()
	 * @generated
	 */
	void setArrivalTime(TimeBaseType value);

	/**
	 * Returns the value of the '<em><b>Operating Airline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the operating airline of a flight
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operating Airline</em>' containment reference.
	 * @see #setOperatingAirline(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFlightType_OperatingAirline()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='operatingAirline' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getOperatingAirline();

	/**
	 * Sets the value of the '{@link Cpacs.FlightType#getOperatingAirline <em>Operating Airline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Airline</em>' containment reference.
	 * @see #getOperatingAirline()
	 * @generated
	 */
	void setOperatingAirline(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' containment reference.
	 * @see #setAnalysis(FlightAnalysisType)
	 * @see Cpacs.CpacsPackage#getFlightType_Analysis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='analysis' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightAnalysisType getAnalysis();

	/**
	 * Sets the value of the '{@link Cpacs.FlightType#getAnalysis <em>Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis</em>' containment reference.
	 * @see #getAnalysis()
	 * @generated
	 */
	void setAnalysis(FlightAnalysisType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFlightType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FlightType
