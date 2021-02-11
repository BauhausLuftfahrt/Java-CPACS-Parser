/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Segment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionSegmentType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getSegmentType <em>Segment Type</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getMassFraction <em>Mass Fraction</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getEndCondition <em>End Condition</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getConstraintSettings <em>Constraint Settings</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionSegmentType()
 * @model extendedMetaData="name='missionSegmentType' kind='elementOnly'"
 * @generated
 */
public interface MissionSegmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Segment Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of mission segment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segment Type</em>' containment reference.
	 * @see #setSegmentType(SegmentTypeType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_SegmentType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segmentType' namespace='##targetNamespace'"
	 * @generated
	 */
	SegmentTypeType getSegmentType();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getSegmentType <em>Segment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment Type</em>' containment reference.
	 * @see #getSegmentType()
	 * @generated
	 */
	void setSegmentType(SegmentTypeType value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_Mass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Mass Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Fraction</em>' containment reference.
	 * @see #setMassFraction(MassFractionType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_MassFraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='massFraction' namespace='##targetNamespace'"
	 * @generated
	 */
	MassFractionType getMassFraction();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getMassFraction <em>Mass Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Fraction</em>' containment reference.
	 * @see #getMassFraction()
	 * @generated
	 */
	void setMassFraction(MassFractionType value);

	/**
	 * Returns the value of the '<em><b>End Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Condition</em>' containment reference.
	 * @see #setEndCondition(MissionSegmentEndConditionType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_EndCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	MissionSegmentEndConditionType getEndCondition();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getEndCondition <em>End Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Condition</em>' containment reference.
	 * @see #getEndCondition()
	 * @generated
	 */
	void setEndCondition(MissionSegmentEndConditionType value);

	/**
	 * Returns the value of the '<em><b>Constraint Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Settings</em>' containment reference.
	 * @see #setConstraintSettings(ConstraintSettingsType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_ConstraintSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraintSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintSettingsType getConstraintSettings();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getConstraintSettings <em>Constraint Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Settings</em>' containment reference.
	 * @see #getConstraintSettings()
	 * @generated
	 */
	void setConstraintSettings(ConstraintSettingsType value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(StringBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_Configuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configuration' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getConfiguration();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // MissionSegmentType
