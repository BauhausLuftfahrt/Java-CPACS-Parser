/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Load Case Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightLoadCaseType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.FlightLoadCaseType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.FlightLoadCaseType#getAeroDataSetUID <em>Aero Data Set UID</em>}</li>
 *   <li>{@link Cpacs.FlightLoadCaseType#getLoadCondition <em>Load Condition</em>}</li>
 *   <li>{@link Cpacs.FlightLoadCaseType#getState <em>State</em>}</li>
 *   <li>{@link Cpacs.FlightLoadCaseType#getAircraftSettings <em>Aircraft Settings</em>}</li>
 *   <li>{@link Cpacs.FlightLoadCaseType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.FlightLoadCaseType#getNodalLoads <em>Nodal Loads</em>}</li>
 *   <li>{@link Cpacs.FlightLoadCaseType#getCutLoads <em>Cut Loads</em>}</li>
 *   <li>{@link Cpacs.FlightLoadCaseType#getExternalAmifFile <em>External Amif File</em>}</li>
 *   <li>{@link Cpacs.FlightLoadCaseType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightLoadCaseType()
 * @model extendedMetaData="name='flightLoadCaseType' kind='elementOnly'"
 * @generated
 */
public interface FlightLoadCaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Load case name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlightLoadCaseType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadCaseType#getName <em>Name</em>}' containment reference.
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
	 * Load case description (String)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlightLoadCaseType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadCaseType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Aero Data Set UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aero Data Set UID</em>' containment reference.
	 * @see #setAeroDataSetUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFlightLoadCaseType_AeroDataSetUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aeroDataSetUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getAeroDataSetUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadCaseType#getAeroDataSetUID <em>Aero Data Set UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Data Set UID</em>' containment reference.
	 * @see #getAeroDataSetUID()
	 * @generated
	 */
	void setAeroDataSetUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Load Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Condition</em>' containment reference.
	 * @see #setLoadCondition(LoadConditionType)
	 * @see Cpacs.CpacsPackage#getFlightLoadCaseType_LoadCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadConditionType getLoadCondition();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadCaseType#getLoadCondition <em>Load Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Condition</em>' containment reference.
	 * @see #getLoadCondition()
	 * @generated
	 */
	void setLoadCondition(LoadConditionType value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(LoadCaseStateType)
	 * @see Cpacs.CpacsPackage#getFlightLoadCaseType_State()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseStateType getState();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadCaseType#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(LoadCaseStateType value);

	/**
	 * Returns the value of the '<em><b>Aircraft Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aircraft Settings</em>' containment reference.
	 * @see #setAircraftSettings(LoadCaseSettingsType)
	 * @see Cpacs.CpacsPackage#getFlightLoadCaseType_AircraftSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aircraftSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseSettingsType getAircraftSettings();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadCaseType#getAircraftSettings <em>Aircraft Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aircraft Settings</em>' containment reference.
	 * @see #getAircraftSettings()
	 * @generated
	 */
	void setAircraftSettings(LoadCaseSettingsType value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(LoadCaseMassType)
	 * @see Cpacs.CpacsPackage#getFlightLoadCaseType_Mass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseMassType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadCaseType#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(LoadCaseMassType value);

	/**
	 * Returns the value of the '<em><b>Nodal Loads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodal Loads</em>' containment reference.
	 * @see #setNodalLoads(NodalLoadsType)
	 * @see Cpacs.CpacsPackage#getFlightLoadCaseType_NodalLoads()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nodalLoads' namespace='##targetNamespace'"
	 * @generated
	 */
	NodalLoadsType getNodalLoads();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadCaseType#getNodalLoads <em>Nodal Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodal Loads</em>' containment reference.
	 * @see #getNodalLoads()
	 * @generated
	 */
	void setNodalLoads(NodalLoadsType value);

	/**
	 * Returns the value of the '<em><b>Cut Loads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Loads</em>' containment reference.
	 * @see #setCutLoads(CutLoadsType)
	 * @see Cpacs.CpacsPackage#getFlightLoadCaseType_CutLoads()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cutLoads' namespace='##targetNamespace'"
	 * @generated
	 */
	CutLoadsType getCutLoads();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadCaseType#getCutLoads <em>Cut Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Loads</em>' containment reference.
	 * @see #getCutLoads()
	 * @generated
	 */
	void setCutLoads(CutLoadsType value);

	/**
	 * Returns the value of the '<em><b>External Amif File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Amif File</em>' containment reference.
	 * @see #setExternalAmifFile(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlightLoadCaseType_ExternalAmifFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='externalAmifFile' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getExternalAmifFile();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadCaseType#getExternalAmifFile <em>External Amif File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Amif File</em>' containment reference.
	 * @see #getExternalAmifFile()
	 * @generated
	 */
	void setExternalAmifFile(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFlightLoadCaseType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightLoadCaseType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FlightLoadCaseType
