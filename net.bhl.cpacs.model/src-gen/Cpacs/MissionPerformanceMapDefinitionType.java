/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Performance Map Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionPerformanceMapDefinitionType#getDefaultPerformanceMapUID <em>Default Performance Map UID</em>}</li>
 *   <li>{@link Cpacs.MissionPerformanceMapDefinitionType#getSpecificPerformanceMaps <em>Specific Performance Maps</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionPerformanceMapDefinitionType()
 * @model extendedMetaData="name='missionPerformanceMapDefinitionType' kind='elementOnly'"
 * @generated
 */
public interface MissionPerformanceMapDefinitionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Default Performance Map UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default performance map which is used if no other performance map
	 *                             is assigned through the specificPerformanceMap node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Performance Map UID</em>' containment reference.
	 * @see #setDefaultPerformanceMapUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMissionPerformanceMapDefinitionType_DefaultPerformanceMapUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='defaultPerformanceMapUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getDefaultPerformanceMapUID();

	/**
	 * Sets the value of the '{@link Cpacs.MissionPerformanceMapDefinitionType#getDefaultPerformanceMapUID <em>Default Performance Map UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Performance Map UID</em>' containment reference.
	 * @see #getDefaultPerformanceMapUID()
	 * @generated
	 */
	void setDefaultPerformanceMapUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Specific Performance Maps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of specific performance maps used on dedicated mission segments
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Performance Maps</em>' containment reference.
	 * @see #setSpecificPerformanceMaps(SpecificPerformanceMapsType)
	 * @see Cpacs.CpacsPackage#getMissionPerformanceMapDefinitionType_SpecificPerformanceMaps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specificPerformanceMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificPerformanceMapsType getSpecificPerformanceMaps();

	/**
	 * Sets the value of the '{@link Cpacs.MissionPerformanceMapDefinitionType#getSpecificPerformanceMaps <em>Specific Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Performance Maps</em>' containment reference.
	 * @see #getSpecificPerformanceMaps()
	 * @generated
	 */
	void setSpecificPerformanceMaps(SpecificPerformanceMapsType value);

} // MissionPerformanceMapDefinitionType
