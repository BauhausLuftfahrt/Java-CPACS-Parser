/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Performance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PointPerformanceType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceType#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceType#getMassFraction <em>Mass Fraction</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceType#getTypeOfPointPerformance <em>Type Of Point Performance</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceType#getConstraintSettings <em>Constraint Settings</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPointPerformanceType()
 * @model extendedMetaData="name='pointPerformanceType' kind='elementOnly'"
 * @generated
 */
public interface PointPerformanceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getPointPerformanceType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceType#getDescription <em>Description</em>}' containment reference.
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
	 * Defines at which part of the mission the point performance should be considered - after indicated segment of the mission as defined in performanceCase
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segment UID</em>' containment reference.
	 * @see #setSegmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceType_SegmentUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='segmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSegmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceType#getSegmentUID <em>Segment UID</em>}' containment reference.
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
	 * Defines at which part of the mission the point performance should be considered - at the defined  massFraction within the mission as defined in performanceCase (mCurrent/mTO)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Fraction</em>' containment reference.
	 * @see #setMassFraction(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceType_MassFraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='massFraction' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMassFraction();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceType#getMassFraction <em>Mass Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Fraction</em>' containment reference.
	 * @see #getMassFraction()
	 * @generated
	 */
	void setMassFraction(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Type Of Point Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of point performance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Point Performance</em>' containment reference.
	 * @see #setTypeOfPointPerformance(TypeOfPointPerformanceType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceType_TypeOfPointPerformance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='typeOfPointPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeOfPointPerformanceType getTypeOfPointPerformance();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceType#getTypeOfPointPerformance <em>Type Of Point Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Of Point Performance</em>' containment reference.
	 * @see #getTypeOfPointPerformance()
	 * @generated
	 */
	void setTypeOfPointPerformance(TypeOfPointPerformanceType value);

	/**
	 * Returns the value of the '<em><b>Constraint Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Settings</em>' containment reference.
	 * @see #setConstraintSettings(ConstraintSettingsPointPerformanceType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceType_ConstraintSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constraintSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintSettingsPointPerformanceType getConstraintSettings();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceType#getConstraintSettings <em>Constraint Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Settings</em>' containment reference.
	 * @see #getConstraintSettings()
	 * @generated
	 */
	void setConstraintSettings(ConstraintSettingsPointPerformanceType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getPointPerformanceType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // PointPerformanceType
