/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CpacsType#getHeader <em>Header</em>}</li>
 *   <li>{@link Cpacs.CpacsType#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link Cpacs.CpacsType#getMissionDefinitions <em>Mission Definitions</em>}</li>
 *   <li>{@link Cpacs.CpacsType#getAirports <em>Airports</em>}</li>
 *   <li>{@link Cpacs.CpacsType#getFlights <em>Flights</em>}</li>
 *   <li>{@link Cpacs.CpacsType#getAirlines <em>Airlines</em>}</li>
 *   <li>{@link Cpacs.CpacsType#getStudies <em>Studies</em>}</li>
 *   <li>{@link Cpacs.CpacsType#getToolspecific <em>Toolspecific</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCpacsType()
 * @model extendedMetaData="name='cpacsType' kind='elementOnly'"
 * @generated
 */
public interface CpacsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(HeaderType)
	 * @see Cpacs.CpacsPackage#getCpacsType_Header()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='header' namespace='##targetNamespace'"
	 * @generated
	 */
	HeaderType getHeader();

	/**
	 * Sets the value of the '{@link Cpacs.CpacsType#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(HeaderType value);

	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicles</em>' containment reference.
	 * @see #setVehicles(VehiclesType)
	 * @see Cpacs.CpacsPackage#getCpacsType_Vehicles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vehicles' namespace='##targetNamespace'"
	 * @generated
	 */
	VehiclesType getVehicles();

	/**
	 * Sets the value of the '{@link Cpacs.CpacsType#getVehicles <em>Vehicles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicles</em>' containment reference.
	 * @see #getVehicles()
	 * @generated
	 */
	void setVehicles(VehiclesType value);

	/**
	 * Returns the value of the '<em><b>Mission Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Definitions</em>' containment reference.
	 * @see #setMissionDefinitions(MissionDefinitionsType)
	 * @see Cpacs.CpacsPackage#getCpacsType_MissionDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='missionDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	MissionDefinitionsType getMissionDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.CpacsType#getMissionDefinitions <em>Mission Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Definitions</em>' containment reference.
	 * @see #getMissionDefinitions()
	 * @generated
	 */
	void setMissionDefinitions(MissionDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Airports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airports</em>' containment reference.
	 * @see #setAirports(AirportsType)
	 * @see Cpacs.CpacsPackage#getCpacsType_Airports()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airports' namespace='##targetNamespace'"
	 * @generated
	 */
	AirportsType getAirports();

	/**
	 * Sets the value of the '{@link Cpacs.CpacsType#getAirports <em>Airports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airports</em>' containment reference.
	 * @see #getAirports()
	 * @generated
	 */
	void setAirports(AirportsType value);

	/**
	 * Returns the value of the '<em><b>Flights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flights</em>' containment reference.
	 * @see #setFlights(FlightsType)
	 * @see Cpacs.CpacsPackage#getCpacsType_Flights()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flights' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightsType getFlights();

	/**
	 * Sets the value of the '{@link Cpacs.CpacsType#getFlights <em>Flights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flights</em>' containment reference.
	 * @see #getFlights()
	 * @generated
	 */
	void setFlights(FlightsType value);

	/**
	 * Returns the value of the '<em><b>Airlines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airlines</em>' containment reference.
	 * @see #setAirlines(AirlinesType)
	 * @see Cpacs.CpacsPackage#getCpacsType_Airlines()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airlines' namespace='##targetNamespace'"
	 * @generated
	 */
	AirlinesType getAirlines();

	/**
	 * Sets the value of the '{@link Cpacs.CpacsType#getAirlines <em>Airlines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airlines</em>' containment reference.
	 * @see #getAirlines()
	 * @generated
	 */
	void setAirlines(AirlinesType value);

	/**
	 * Returns the value of the '<em><b>Studies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Studies</em>' containment reference.
	 * @see #setStudies(StudiesType)
	 * @see Cpacs.CpacsPackage#getCpacsType_Studies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='studies' namespace='##targetNamespace'"
	 * @generated
	 */
	StudiesType getStudies();

	/**
	 * Sets the value of the '{@link Cpacs.CpacsType#getStudies <em>Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Studies</em>' containment reference.
	 * @see #getStudies()
	 * @generated
	 */
	void setStudies(StudiesType value);

	/**
	 * Returns the value of the '<em><b>Toolspecific</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toolspecific</em>' containment reference.
	 * @see #setToolspecific(ToolspecificType)
	 * @see Cpacs.CpacsPackage#getCpacsType_Toolspecific()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='toolspecific' namespace='##targetNamespace'"
	 * @generated
	 */
	ToolspecificType getToolspecific();

	/**
	 * Sets the value of the '{@link Cpacs.CpacsType#getToolspecific <em>Toolspecific</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toolspecific</em>' containment reference.
	 * @see #getToolspecific()
	 * @generated
	 */
	void setToolspecific(ToolspecificType value);

} // CpacsType
