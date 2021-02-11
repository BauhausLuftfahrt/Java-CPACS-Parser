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
 *   <li>{@link Cpacs.MissionSegmentBlockType#getSegmentBlockConstraints <em>Segment Block Constraints</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getSegmentDirection <em>Segment Direction</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getSegmentUIDSequence <em>Segment UID Sequence</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getVariableSegments <em>Variable Segments</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getFuelPlanningType <em>Fuel Planning Type</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionSegmentBlockType()
 * @model extendedMetaData="name='missionSegmentBlockType' kind='elementOnly'"
 * @generated
 */
public interface MissionSegmentBlockType extends ComplexBaseType {
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
	 * either 'outbound' or 'inbound', only needed for radiusOfAction kind of missions
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
	 * Returns the value of the '<em><b>Segment UID Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment UID Sequence</em>' containment reference.
	 * @see #setSegmentUIDSequence(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlockType_SegmentUIDSequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segmentUIDSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getSegmentUIDSequence();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentBlockType#getSegmentUIDSequence <em>Segment UID Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment UID Sequence</em>' containment reference.
	 * @see #getSegmentUIDSequence()
	 * @generated
	 */
	void setSegmentUIDSequence(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Variable Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *   list of segments that are allowed to be varied within a mission optimisation.
	 *                                 
	 *   <ddue:para xmlns:ddue="http://ddue.schemas.microsoft.com/authoring/2003/5">This concept needs to be practically tested. Does it suffice to mention (a list of) segments that are free to change to fit the overall block constraints? What happens if a segment is variable, though it has some constraints? When to define a segment as variable (climb until endPosition z, then endPosition x should be left free. Is the segment then variable? Probably not.). Somehow the 'free' segment should be in between fully defined segments (i.e.: a cruise+descent in between endPosition z == ICA and endPosition z == 0 for landing to define max range. How to define this exactly?)</ddue:para>
	 *                               
	 * 
	 * <!-- end-model-doc -->
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
	 * Entry for defining which type of mass the segment fuel mass should be added.
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
