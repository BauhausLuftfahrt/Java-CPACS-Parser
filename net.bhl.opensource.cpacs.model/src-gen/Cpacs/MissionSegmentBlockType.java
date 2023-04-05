/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Segment Block Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getSegmentBlockConstraints <em>Segment Block Constraints</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getSegmentDirection <em>Segment Direction</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getSegmentUIDs <em>Segment UI Ds</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getVariableSegments <em>Variable Segments</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getFuelPlanningType <em>Fuel Planning Type</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getNumberOfRepetitions <em>Number Of Repetitions</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionSegmentBlockType()
 * @model extendedMetaData="name='missionSegmentBlockType' kind='elementOnly'"
 * @generated
 */
public interface MissionSegmentBlockType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlockType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentBlockType#getName <em>Name</em>}' containment reference.
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
	 * Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlockType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentBlockType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Segment Block Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Block Constraints</em>' containment reference.
	 * @see #setSegmentBlockConstraints(MissionSegmentBlockConstraintsType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlockType_SegmentBlockConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='segmentBlockConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	MissionSegmentBlockConstraintsType getSegmentBlockConstraints();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentBlockType#getSegmentBlockConstraints <em>Segment Block Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Block Constraints</em>' containment reference.
	 * @see #getSegmentBlockConstraints()
	 * @generated
	 */
	void setSegmentBlockConstraints(MissionSegmentBlockConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Segment Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Segment direction. Either 'outbound' or 'inbound'. Only needed for radiusOfAction kind of missions.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segment Direction</em>' containment reference.
	 * @see #setSegmentDirection(SegmentDirectionType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlockType_SegmentDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='segmentDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	SegmentDirectionType getSegmentDirection();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentBlockType#getSegmentDirection <em>Segment Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Direction</em>' containment reference.
	 * @see #getSegmentDirection()
	 * @generated
	 */
	void setSegmentDirection(SegmentDirectionType value);

	/**
	 * Returns the value of the '<em><b>Segment UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of segment uID's making up the segmentBlock. These should be ordered, such that the segment connections are correct.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segment UI Ds</em>' containment reference.
	 * @see #setSegmentUIDs(UIDSequenceType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlockType_SegmentUIDs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segmentUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	UIDSequenceType getSegmentUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentBlockType#getSegmentUIDs <em>Segment UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment UI Ds</em>' containment reference.
	 * @see #getSegmentUIDs()
	 * @generated
	 */
	void setSegmentUIDs(UIDSequenceType value);

	/**
	 * Returns the value of the '<em><b>Variable Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Segments</em>' containment reference.
	 * @see #setVariableSegments(VariableSegmentsType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlockType_VariableSegments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variableSegments' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableSegmentsType getVariableSegments();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentBlockType#getVariableSegments <em>Variable Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Segments</em>' containment reference.
	 * @see #getVariableSegments()
	 * @generated
	 */
	void setVariableSegments(VariableSegmentsType value);

	/**
	 * Returns the value of the '<em><b>Fuel Planning Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies to which type of mass the segment fuel mass
	 *                             should be added (blockFuel = designFuel + additionalFuel; Total fuel requirement
	 *                             = blockFuel + reserveFuel; designFuel = the fuel of the segmentBlock is part of the design mission)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuel Planning Type</em>' containment reference.
	 * @see #setFuelPlanningType(FuelPlanningTypeType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlockType_FuelPlanningType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelPlanningType' namespace='##targetNamespace'"
	 * @generated
	 */
	FuelPlanningTypeType getFuelPlanningType();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentBlockType#getFuelPlanningType <em>Fuel Planning Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Planning Type</em>' containment reference.
	 * @see #getFuelPlanningType()
	 * @generated
	 */
	void setFuelPlanningType(FuelPlanningTypeType value);

	/**
	 * Returns the value of the '<em><b>Number Of Repetitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of repetitions of this segment block, e.g. to perform repeated holding patterns
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number Of Repetitions</em>' containment reference.
	 * @see #setNumberOfRepetitions(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlockType_NumberOfRepetitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='numberOfRepetitions' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getNumberOfRepetitions();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentBlockType#getNumberOfRepetitions <em>Number Of Repetitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Repetitions</em>' containment reference.
	 * @see #getNumberOfRepetitions()
	 * @generated
	 */
	void setNumberOfRepetitions(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlockType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentBlockType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // MissionSegmentBlockType
