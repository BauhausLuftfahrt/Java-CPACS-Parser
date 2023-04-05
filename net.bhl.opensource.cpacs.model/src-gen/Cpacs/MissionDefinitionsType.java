/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionDefinitionsType#getMissions <em>Missions</em>}</li>
 *   <li>{@link Cpacs.MissionDefinitionsType#getSegmentBlocks <em>Segment Blocks</em>}</li>
 *   <li>{@link Cpacs.MissionDefinitionsType#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionDefinitionsType()
 * @model extendedMetaData="name='missionDefinitionsType' kind='elementOnly'"
 * @generated
 */
public interface MissionDefinitionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Missions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missions</em>' containment reference.
	 * @see #setMissions(MissionsType)
	 * @see Cpacs.CpacsPackage#getMissionDefinitionsType_Missions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='missions' namespace='##targetNamespace'"
	 * @generated
	 */
	MissionsType getMissions();

	/**
	 * Sets the value of the '{@link Cpacs.MissionDefinitionsType#getMissions <em>Missions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missions</em>' containment reference.
	 * @see #getMissions()
	 * @generated
	 */
	void setMissions(MissionsType value);

	/**
	 * Returns the value of the '<em><b>Segment Blocks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Blocks</em>' containment reference.
	 * @see #setSegmentBlocks(MissionSegmentBlocksType)
	 * @see Cpacs.CpacsPackage#getMissionDefinitionsType_SegmentBlocks()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segmentBlocks' namespace='##targetNamespace'"
	 * @generated
	 */
	MissionSegmentBlocksType getSegmentBlocks();

	/**
	 * Sets the value of the '{@link Cpacs.MissionDefinitionsType#getSegmentBlocks <em>Segment Blocks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Blocks</em>' containment reference.
	 * @see #getSegmentBlocks()
	 * @generated
	 */
	void setSegmentBlocks(MissionSegmentBlocksType value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference.
	 * @see #setSegments(MissionSegmentsType)
	 * @see Cpacs.CpacsPackage#getMissionDefinitionsType_Segments()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segments' namespace='##targetNamespace'"
	 * @generated
	 */
	MissionSegmentsType getSegments();

	/**
	 * Sets the value of the '{@link Cpacs.MissionDefinitionsType#getSegments <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' containment reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(MissionSegmentsType value);

} // MissionDefinitionsType
