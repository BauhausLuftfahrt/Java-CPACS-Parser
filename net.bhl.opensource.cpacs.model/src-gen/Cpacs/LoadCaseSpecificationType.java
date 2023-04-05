/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Specification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseSpecificationType#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link Cpacs.LoadCaseSpecificationType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.LoadCaseSpecificationType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.LoadCaseSpecificationType#getAeroCaseUID <em>Aero Case UID</em>}</li>
 *   <li>{@link Cpacs.LoadCaseSpecificationType#getControllerDescription <em>Controller Description</em>}</li>
 *   <li>{@link Cpacs.LoadCaseSpecificationType#getLoadCaseSuperposition <em>Load Case Superposition</em>}</li>
 *   <li>{@link Cpacs.LoadCaseSpecificationType#getLoadConditions <em>Load Conditions</em>}</li>
 *   <li>{@link Cpacs.LoadCaseSpecificationType#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link Cpacs.LoadCaseSpecificationType#getWeightAndBalanceUID <em>Weight And Balance UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseSpecificationType()
 * @model extendedMetaData="name='loadCaseSpecificationType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseSpecificationType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Environment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(EnvironmentType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSpecificationType_Environment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='environment' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvironmentType getEnvironment();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSpecificationType#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(EnvironmentType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Altitude above sea level
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSpecificationType_Altitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSpecificationType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Mach number
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSpecificationType_MachNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSpecificationType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Aero Case UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 UID of the aerodynamic loads (aeroCase)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aero Case UID</em>' containment reference.
	 * @see #setAeroCaseUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSpecificationType_AeroCaseUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aeroCaseUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getAeroCaseUID();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSpecificationType#getAeroCaseUID <em>Aero Case UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Case UID</em>' containment reference.
	 * @see #getAeroCaseUID()
	 * @generated
	 */
	void setAeroCaseUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Controller Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Controller description. Note: Since there is no controller description in CPACS yet, the expected content of this string element has to be defined individually for each project.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controller Description</em>' containment reference.
	 * @see #setControllerDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSpecificationType_ControllerDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controllerDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getControllerDescription();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSpecificationType#getControllerDescription <em>Controller Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Description</em>' containment reference.
	 * @see #getControllerDescription()
	 * @generated
	 */
	void setControllerDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Load Case Superposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Case Superposition</em>' containment reference.
	 * @see #setLoadCaseSuperposition(LoadCaseSuperpositionType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSpecificationType_LoadCaseSuperposition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadCaseSuperposition' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseSuperpositionType getLoadCaseSuperposition();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSpecificationType#getLoadCaseSuperposition <em>Load Case Superposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Case Superposition</em>' containment reference.
	 * @see #getLoadCaseSuperposition()
	 * @generated
	 */
	void setLoadCaseSuperposition(LoadCaseSuperpositionType value);

	/**
	 * Returns the value of the '<em><b>Load Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Conditions</em>' containment reference.
	 * @see #setLoadConditions(FlightLoadConditionsType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSpecificationType_LoadConditions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loadConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightLoadConditionsType getLoadConditions();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSpecificationType#getLoadConditions <em>Load Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Conditions</em>' containment reference.
	 * @see #getLoadConditions()
	 * @generated
	 */
	void setLoadConditions(FlightLoadConditionsType value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(ConfigurationType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSpecificationType_Configuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configuration' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationType getConfiguration();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSpecificationType#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(ConfigurationType value);

	/**
	 * Returns the value of the '<em><b>Weight And Balance UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 UID referencing the mass state of aircraft for this load case
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight And Balance UID</em>' containment reference.
	 * @see #setWeightAndBalanceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSpecificationType_WeightAndBalanceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='weightAndBalanceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWeightAndBalanceUID();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSpecificationType#getWeightAndBalanceUID <em>Weight And Balance UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight And Balance UID</em>' containment reference.
	 * @see #getWeightAndBalanceUID()
	 * @generated
	 */
	void setWeightAndBalanceUID(StringUIDBaseType value);

} // LoadCaseSpecificationType
