/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Performance Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPerformanceRequirementType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceRequirementType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceRequirementType#getRequirementClassification <em>Requirement Classification</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceRequirementType#getWeightAndBalanceUID <em>Weight And Balance UID</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceRequirementType#getMissionUID <em>Mission UID</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceRequirementType#getPointPerformanceUIDs <em>Point Performance UI Ds</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceRequirementType#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceRequirementType#getPerformanceMaps <em>Performance Maps</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceRequirementType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPerformanceRequirementType()
 * @model extendedMetaData="name='flightPerformanceRequirementType' kind='elementOnly'"
 * @generated
 */
public interface FlightPerformanceRequirementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the performance case
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceRequirementType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceRequirementType#getName <em>Name</em>}' containment reference.
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
	 * Description of the performance case
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceRequirementType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceRequirementType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Requirement Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Classification</em>' containment reference.
	 * @see #setRequirementClassification(RequirementClassificationType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceRequirementType_RequirementClassification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirementClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementClassificationType getRequirementClassification();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceRequirementType#getRequirementClassification <em>Requirement Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement Classification</em>' containment reference.
	 * @see #getRequirementClassification()
	 * @generated
	 */
	void setRequirementClassification(RequirementClassificationType value);

	/**
	 * Returns the value of the '<em><b>Weight And Balance UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the considered weightAndBalance case
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight And Balance UID</em>' containment reference.
	 * @see #setWeightAndBalanceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceRequirementType_WeightAndBalanceUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weightAndBalanceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWeightAndBalanceUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceRequirementType#getWeightAndBalanceUID <em>Weight And Balance UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight And Balance UID</em>' containment reference.
	 * @see #getWeightAndBalanceUID()
	 * @generated
	 */
	void setWeightAndBalanceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Mission UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UID of the mission to be flown
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mission UID</em>' containment reference.
	 * @see #setMissionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceRequirementType_MissionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='missionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMissionUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceRequirementType#getMissionUID <em>Mission UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission UID</em>' containment reference.
	 * @see #getMissionUID()
	 * @generated
	 */
	void setMissionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Point Performance UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of point performance uIDs constraining the mission
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Performance UI Ds</em>' containment reference.
	 * @see #setPointPerformanceUIDs(UIDSequenceType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceRequirementType_PointPerformanceUIDs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointPerformanceUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	UIDSequenceType getPointPerformanceUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceRequirementType#getPointPerformanceUIDs <em>Point Performance UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Performance UI Ds</em>' containment reference.
	 * @see #getPointPerformanceUIDs()
	 * @generated
	 */
	void setPointPerformanceUIDs(UIDSequenceType value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference.
	 * @see #setConfigurations(PerformanceRequirementConfigurationsType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceRequirementType_Configurations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configurations' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceRequirementConfigurationsType getConfigurations();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceRequirementType#getConfigurations <em>Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations</em>' containment reference.
	 * @see #getConfigurations()
	 * @generated
	 */
	void setConfigurations(PerformanceRequirementConfigurationsType value);

	/**
	 * Returns the value of the '<em><b>Performance Maps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Maps</em>' containment reference.
	 * @see #setPerformanceMaps(PerformanceMapSelectionType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceRequirementType_PerformanceMaps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performanceMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceMapSelectionType getPerformanceMaps();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceRequirementType#getPerformanceMaps <em>Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Maps</em>' containment reference.
	 * @see #getPerformanceMaps()
	 * @generated
	 */
	void setPerformanceMaps(PerformanceMapSelectionType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceRequirementType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceRequirementType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FlightPerformanceRequirementType
