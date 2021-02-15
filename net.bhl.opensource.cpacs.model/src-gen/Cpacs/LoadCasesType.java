/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCasesType#getCrashLoadCases <em>Crash Load Cases</em>}</li>
 *   <li>{@link Cpacs.LoadCasesType#getFlightLoadCases <em>Flight Load Cases</em>}</li>
 *   <li>{@link Cpacs.LoadCasesType#getGroundLoadCases <em>Ground Load Cases</em>}</li>
 *   <li>{@link Cpacs.LoadCasesType#getAeroDataSetsForLoads <em>Aero Data Sets For Loads</em>}</li>
 *   <li>{@link Cpacs.LoadCasesType#getLoadsEnvelope <em>Loads Envelope</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCasesType()
 * @model extendedMetaData="name='loadCasesType' kind='elementOnly'"
 * @generated
 */
public interface LoadCasesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Crash Load Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crash Load Cases</em>' containment reference.
	 * @see #setCrashLoadCases(CrashLoadCasesType)
	 * @see Cpacs.CpacsPackage#getLoadCasesType_CrashLoadCases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crashLoadCases' namespace='##targetNamespace'"
	 * @generated
	 */
	CrashLoadCasesType getCrashLoadCases();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCasesType#getCrashLoadCases <em>Crash Load Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crash Load Cases</em>' containment reference.
	 * @see #getCrashLoadCases()
	 * @generated
	 */
	void setCrashLoadCases(CrashLoadCasesType value);

	/**
	 * Returns the value of the '<em><b>Flight Load Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Load Cases</em>' containment reference.
	 * @see #setFlightLoadCases(FlightLoadCasesType)
	 * @see Cpacs.CpacsPackage#getLoadCasesType_FlightLoadCases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightLoadCases' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightLoadCasesType getFlightLoadCases();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCasesType#getFlightLoadCases <em>Flight Load Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Load Cases</em>' containment reference.
	 * @see #getFlightLoadCases()
	 * @generated
	 */
	void setFlightLoadCases(FlightLoadCasesType value);

	/**
	 * Returns the value of the '<em><b>Ground Load Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Load Cases</em>' containment reference.
	 * @see #setGroundLoadCases(GroundLoadCasesType)
	 * @see Cpacs.CpacsPackage#getLoadCasesType_GroundLoadCases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groundLoadCases' namespace='##targetNamespace'"
	 * @generated
	 */
	GroundLoadCasesType getGroundLoadCases();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCasesType#getGroundLoadCases <em>Ground Load Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Load Cases</em>' containment reference.
	 * @see #getGroundLoadCases()
	 * @generated
	 */
	void setGroundLoadCases(GroundLoadCasesType value);

	/**
	 * Returns the value of the '<em><b>Aero Data Sets For Loads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aero Data Sets For Loads</em>' containment reference.
	 * @see #setAeroDataSetsForLoads(AeroDataSetsForLoadsType)
	 * @see Cpacs.CpacsPackage#getLoadCasesType_AeroDataSetsForLoads()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aeroDataSetsForLoads' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroDataSetsForLoadsType getAeroDataSetsForLoads();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCasesType#getAeroDataSetsForLoads <em>Aero Data Sets For Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Data Sets For Loads</em>' containment reference.
	 * @see #getAeroDataSetsForLoads()
	 * @generated
	 */
	void setAeroDataSetsForLoads(AeroDataSetsForLoadsType value);

	/**
	 * Returns the value of the '<em><b>Loads Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loads Envelope</em>' containment reference.
	 * @see #setLoadsEnvelope(LoadsEnvelopeType)
	 * @see Cpacs.CpacsPackage#getLoadCasesType_LoadsEnvelope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadsEnvelope' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadsEnvelopeType getLoadsEnvelope();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCasesType#getLoadsEnvelope <em>Loads Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loads Envelope</em>' containment reference.
	 * @see #getLoadsEnvelope()
	 * @generated
	 */
	void setLoadsEnvelope(LoadsEnvelopeType value);

} // LoadCasesType
