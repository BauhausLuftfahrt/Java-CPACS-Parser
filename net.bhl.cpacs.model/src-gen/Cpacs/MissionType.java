/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.MissionType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.MissionType#getStartCondition <em>Start Condition</em>}</li>
 *   <li>{@link Cpacs.MissionType#getSegmentUIDSequence <em>Segment UID Sequence</em>}</li>
 *   <li>{@link Cpacs.MissionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionType()
 * @model extendedMetaData="name='missionType' kind='elementOnly'"
 * @generated
 */
public interface MissionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getMissionType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.MissionType#getName <em>Name</em>}' containment reference.
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
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getMissionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MissionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Start Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Condition</em>' containment reference.
	 * @see #setStartCondition(MissionStartConditionType)
	 * @see Cpacs.CpacsPackage#getMissionType_StartCondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	MissionStartConditionType getStartCondition();

	/**
	 * Sets the value of the '{@link Cpacs.MissionType#getStartCondition <em>Start Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Condition</em>' containment reference.
	 * @see #getStartCondition()
	 * @generated
	 */
	void setStartCondition(MissionStartConditionType value);

	/**
	 * Returns the value of the '<em><b>Segment UID Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment UID Sequence</em>' containment reference.
	 * @see #setSegmentUIDSequence(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getMissionType_SegmentUIDSequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segmentUIDSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getSegmentUIDSequence();

	/**
	 * Sets the value of the '{@link Cpacs.MissionType#getSegmentUIDSequence <em>Segment UID Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment UID Sequence</em>' containment reference.
	 * @see #getSegmentUIDSequence()
	 * @generated
	 */
	void setSegmentUIDSequence(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getMissionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.MissionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // MissionType
