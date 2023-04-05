/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Performance Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GlobalPerformanceCasesType#getMissionDefinitions <em>Mission Definitions</em>}</li>
 *   <li>{@link Cpacs.GlobalPerformanceCasesType#getPointPerformanceDefinitions <em>Point Performance Definitions</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGlobalPerformanceCasesType()
 * @model extendedMetaData="name='globalPerformanceCasesType' kind='elementOnly'"
 * @generated
 */
public interface GlobalPerformanceCasesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mission Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Definitions</em>' containment reference.
	 * @see #setMissionDefinitions(MissionDefinitionsType)
	 * @see Cpacs.CpacsPackage#getGlobalPerformanceCasesType_MissionDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='missionDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	MissionDefinitionsType getMissionDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalPerformanceCasesType#getMissionDefinitions <em>Mission Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Definitions</em>' containment reference.
	 * @see #getMissionDefinitions()
	 * @generated
	 */
	void setMissionDefinitions(MissionDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Point Performance Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Performance Definitions</em>' containment reference.
	 * @see #setPointPerformanceDefinitions(PointPerformanceDefinitionsType)
	 * @see Cpacs.CpacsPackage#getGlobalPerformanceCasesType_PointPerformanceDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointPerformanceDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPerformanceDefinitionsType getPointPerformanceDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalPerformanceCasesType#getPointPerformanceDefinitions <em>Point Performance Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Performance Definitions</em>' containment reference.
	 * @see #getPointPerformanceDefinitions()
	 * @generated
	 */
	void setPointPerformanceDefinitions(PointPerformanceDefinitionsType value);

} // GlobalPerformanceCasesType
