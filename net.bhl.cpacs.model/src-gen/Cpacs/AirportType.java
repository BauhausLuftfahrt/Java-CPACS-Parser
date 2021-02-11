/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airport Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AirportType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.AirportType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.AirportType#getIataCode <em>Iata Code</em>}</li>
 *   <li>{@link Cpacs.AirportType#getIcaoCode <em>Icao Code</em>}</li>
 *   <li>{@link Cpacs.AirportType#getPositionNorth <em>Position North</em>}</li>
 *   <li>{@link Cpacs.AirportType#getPositionEast <em>Position East</em>}</li>
 *   <li>{@link Cpacs.AirportType#getElevation <em>Elevation</em>}</li>
 *   <li>{@link Cpacs.AirportType#getRunways <em>Runways</em>}</li>
 *   <li>{@link Cpacs.AirportType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAirportType()
 * @model extendedMetaData="name='airportType' kind='elementOnly'"
 * @generated
 */
public interface AirportType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of airport
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getAirportType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.AirportType#getName <em>Name</em>}' containment reference.
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
	 * Description of airport
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getAirportType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.AirportType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Iata Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IATA 3-letter-code
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iata Code</em>' containment reference.
	 * @see #setIataCode(StringBaseType)
	 * @see Cpacs.CpacsPackage#getAirportType_IataCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='iataCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getIataCode();

	/**
	 * Sets the value of the '{@link Cpacs.AirportType#getIataCode <em>Iata Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iata Code</em>' containment reference.
	 * @see #getIataCode()
	 * @generated
	 */
	void setIataCode(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Icao Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ICAO 4-letter-code
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icao Code</em>' containment reference.
	 * @see #setIcaoCode(StringBaseType)
	 * @see Cpacs.CpacsPackage#getAirportType_IcaoCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='icaoCode' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getIcaoCode();

	/**
	 * Sets the value of the '{@link Cpacs.AirportType#getIcaoCode <em>Icao Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icao Code</em>' containment reference.
	 * @see #getIcaoCode()
	 * @generated
	 */
	void setIcaoCode(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Position North</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position in degrees north
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position North</em>' containment reference.
	 * @see #setPositionNorth(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAirportType_PositionNorth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionNorth' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionNorth();

	/**
	 * Sets the value of the '{@link Cpacs.AirportType#getPositionNorth <em>Position North</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position North</em>' containment reference.
	 * @see #getPositionNorth()
	 * @generated
	 */
	void setPositionNorth(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Position East</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position in degrees east
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position East</em>' containment reference.
	 * @see #setPositionEast(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAirportType_PositionEast()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionEast' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionEast();

	/**
	 * Sets the value of the '{@link Cpacs.AirportType#getPositionEast <em>Position East</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position East</em>' containment reference.
	 * @see #getPositionEast()
	 * @generated
	 */
	void setPositionEast(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Elevation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Airport elevation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elevation</em>' containment reference.
	 * @see #setElevation(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAirportType_Elevation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='elevation' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getElevation();

	/**
	 * Sets the value of the '{@link Cpacs.AirportType#getElevation <em>Elevation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' containment reference.
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Runways</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runways</em>' containment reference.
	 * @see #setRunways(RunwaysType)
	 * @see Cpacs.CpacsPackage#getAirportType_Runways()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='runways' namespace='##targetNamespace'"
	 * @generated
	 */
	RunwaysType getRunways();

	/**
	 * Sets the value of the '{@link Cpacs.AirportType#getRunways <em>Runways</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runways</em>' containment reference.
	 * @see #getRunways()
	 * @generated
	 */
	void setRunways(RunwaysType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getAirportType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.AirportType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // AirportType
