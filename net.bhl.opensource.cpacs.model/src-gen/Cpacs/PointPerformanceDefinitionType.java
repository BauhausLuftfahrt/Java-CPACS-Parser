/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Performance Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PointPerformanceDefinitionType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceDefinitionType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceDefinitionType#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceDefinitionType#getMassFraction <em>Mass Fraction</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceDefinitionType#getFuelFraction <em>Fuel Fraction</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceDefinitionType#getTypeOfPointPerformance <em>Type Of Point Performance</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceDefinitionType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceDefinitionType#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceDefinitionType#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceDefinitionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionType()
 * @model extendedMetaData="name='pointPerformanceDefinitionType' kind='elementOnly'"
 * @generated
 */
public interface PointPerformanceDefinitionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceDefinitionType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceDefinitionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Segment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Defines at which part of the mission
	 *                                     the point performance should be
	 *                                     considered - after indicated segment
	 *                                     of the mission as defined in
	 *                                     performanceCase
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segment UID</em>' containment reference.
	 * @see #setSegmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionType_SegmentUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='segmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSegmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceDefinitionType#getSegmentUID <em>Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment UID</em>' containment reference.
	 * @see #getSegmentUID()
	 * @generated
	 */
	void setSegmentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Mass Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Defines at which part of the mission
	 *                                     the point performance should be
	 *                                     considered - at the defined
	 *                                     massFraction within the mission as
	 *                                     defined in performanceCase
	 *                                     (mCurrent/mTO)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Fraction</em>' containment reference.
	 * @see #setMassFraction(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionType_MassFraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='massFraction' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMassFraction();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceDefinitionType#getMassFraction <em>Mass Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Fraction</em>' containment reference.
	 * @see #getMassFraction()
	 * @generated
	 */
	void setMassFraction(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Fuel Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Defines at which part of the mission
	 *                                     the point performance should be
	 *                                     considered - at the defined
	 *                                     fuelFraction within the mission as
	 *                                     defined in performanceCase
	 *                                     (mFuelCurrent/mFuelTO)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuel Fraction</em>' containment reference.
	 * @see #setFuelFraction(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionType_FuelFraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelFraction' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFuelFraction();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceDefinitionType#getFuelFraction <em>Fuel Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Fraction</em>' containment reference.
	 * @see #getFuelFraction()
	 * @generated
	 */
	void setFuelFraction(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Type Of Point Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Indicates the type of point performance
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Point Performance</em>' containment reference.
	 * @see #setTypeOfPointPerformance(TypeOfPointPerformanceType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionType_TypeOfPointPerformance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='typeOfPointPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeOfPointPerformanceType getTypeOfPointPerformance();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceDefinitionType#getTypeOfPointPerformance <em>Type Of Point Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Point Performance</em>' containment reference.
	 * @see #getTypeOfPointPerformance()
	 * @generated
	 */
	void setTypeOfPointPerformance(TypeOfPointPerformanceType value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(PointPerformanceConstraintsType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionType_Constraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraints' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPerformanceConstraintsType getConstraints();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceDefinitionType#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(PointPerformanceConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(PointPerformanceRequirementsType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionType_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	PointPerformanceRequirementsType getRequirements();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceDefinitionType#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(PointPerformanceRequirementsType value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(EnvironmentType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionType_Environment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environment' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvironmentType getEnvironment();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceDefinitionType#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(EnvironmentType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getPointPerformanceDefinitionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceDefinitionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // PointPerformanceDefinitionType
