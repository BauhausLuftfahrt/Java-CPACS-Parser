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
 *   <li>{@link Cpacs.MissionSegmentType#getCreditDistance <em>Credit Distance</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getFuelMass <em>Fuel Mass</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getFuelMassFraction <em>Fuel Mass Fraction</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getEndCondition <em>End Condition</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentType#getConstraints <em>Constraints</em>}</li>
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
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Description
	 * <!-- end-model-doc -->
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
	 * Type of the mission segment (takeOff, clime, cruse, ...)
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
	 * Returns the value of the '<em><b>Credit Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication whether the distance flown during the segment is to be taken into account in the segmentBlock's distance calculation.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credit Distance</em>' containment reference.
	 * @see #setCreditDistance(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_CreditDistance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='creditDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getCreditDistance();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getCreditDistance <em>Credit Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Distance</em>' containment reference.
	 * @see #getCreditDistance()
	 * @generated
	 */
	void setCreditDistance(BooleanBaseType value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Environmental conditions. If the environmentalCondition is not provided at segment level, the conditions of the
	 *                             previous segment are inherited (this inheritance can continue until the startCondition, where the initial
	 *                             environmentalConditions are provided).
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(EnvironmentType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_Environment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environment' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvironmentType getEnvironment();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(EnvironmentType value);

	/**
	 * Returns the value of the '<em><b>Fuel Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fuel mass
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuel Mass</em>' containment reference.
	 * @see #setFuelMass(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_FuelMass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelMass' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFuelMass();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getFuelMass <em>Fuel Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Mass</em>' containment reference.
	 * @see #getFuelMass()
	 * @generated
	 */
	void setFuelMass(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Fuel Mass Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Mass Fraction</em>' containment reference.
	 * @see #setFuelMassFraction(FuelMassFractionType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_FuelMassFraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelMassFraction' namespace='##targetNamespace'"
	 * @generated
	 */
	FuelMassFractionType getFuelMassFraction();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getFuelMassFraction <em>Fuel Mass Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Mass Fraction</em>' containment reference.
	 * @see #getFuelMassFraction()
	 * @generated
	 */
	void setFuelMassFraction(FuelMassFractionType value);

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
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(ConstraintsType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentType_Constraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintsType getConstraints();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentType#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(ConstraintsType value);

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
