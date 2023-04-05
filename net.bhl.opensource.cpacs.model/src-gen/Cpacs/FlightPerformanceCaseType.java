/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Performance Case Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPerformanceCaseType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceCaseType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceCaseType#getFlightPerformanceReqUID <em>Flight Performance Req UID</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceCaseType#getTakeoff <em>Takeoff</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceCaseType#getLanding <em>Landing</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceCaseType#getTurn <em>Turn</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceCaseType#getLevelFlight <em>Level Flight</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceCaseType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType()
 * @model extendedMetaData="name='flightPerformanceCaseType' kind='elementOnly'"
 * @generated
 */
public interface FlightPerformanceCaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Name
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceCaseType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceCaseType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Flight Performance Req UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 UID of flight performance requirement
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flight Performance Req UID</em>' containment reference.
	 * @see #setFlightPerformanceReqUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType_FlightPerformanceReqUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flightPerformanceReqUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFlightPerformanceReqUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceCaseType#getFlightPerformanceReqUID <em>Flight Performance Req UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Performance Req UID</em>' containment reference.
	 * @see #getFlightPerformanceReqUID()
	 * @generated
	 */
	void setFlightPerformanceReqUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Takeoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Takeoff</em>' containment reference.
	 * @see #setTakeoff(FlightPerformanceTakeoffType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType_Takeoff()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='takeoff' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPerformanceTakeoffType getTakeoff();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceCaseType#getTakeoff <em>Takeoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Takeoff</em>' containment reference.
	 * @see #getTakeoff()
	 * @generated
	 */
	void setTakeoff(FlightPerformanceTakeoffType value);

	/**
	 * Returns the value of the '<em><b>Landing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing</em>' containment reference.
	 * @see #setLanding(FlightPerformanceLandingType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType_Landing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landing' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPerformanceLandingType getLanding();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceCaseType#getLanding <em>Landing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing</em>' containment reference.
	 * @see #getLanding()
	 * @generated
	 */
	void setLanding(FlightPerformanceLandingType value);

	/**
	 * Returns the value of the '<em><b>Turn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn</em>' containment reference.
	 * @see #setTurn(FlightPerformanceTurnType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType_Turn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='turn' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPerformanceTurnType getTurn();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceCaseType#getTurn <em>Turn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn</em>' containment reference.
	 * @see #getTurn()
	 * @generated
	 */
	void setTurn(FlightPerformanceTurnType value);

	/**
	 * Returns the value of the '<em><b>Level Flight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Flight</em>' containment reference.
	 * @see #setLevelFlight(FlightPerformanceLevelType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType_LevelFlight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='levelFlight' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPerformanceLevelType getLevelFlight();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceCaseType#getLevelFlight <em>Level Flight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Flight</em>' containment reference.
	 * @see #getLevelFlight()
	 * @generated
	 */
	void setLevelFlight(FlightPerformanceLevelType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceCaseType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FlightPerformanceCaseType
