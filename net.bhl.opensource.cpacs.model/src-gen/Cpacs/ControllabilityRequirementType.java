/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controllability Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControllabilityRequirementType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.ControllabilityRequirementType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.ControllabilityRequirementType#getPointPerformanceUID <em>Point Performance UID</em>}</li>
 *   <li>{@link Cpacs.ControllabilityRequirementType#getWeightAndBalanceUID <em>Weight And Balance UID</em>}</li>
 *   <li>{@link Cpacs.ControllabilityRequirementType#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link Cpacs.ControllabilityRequirementType#getPerformanceMaps <em>Performance Maps</em>}</li>
 *   <li>{@link Cpacs.ControllabilityRequirementType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControllabilityRequirementType()
 * @model extendedMetaData="name='controllabilityRequirementType' kind='elementOnly'"
 * @generated
 */
public interface ControllabilityRequirementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getControllabilityRequirementType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.ControllabilityRequirementType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getControllabilityRequirementType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.ControllabilityRequirementType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Point Performance UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of point performance definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Performance UID</em>' containment reference.
	 * @see #setPointPerformanceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getControllabilityRequirementType_PointPerformanceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pointPerformanceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getPointPerformanceUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControllabilityRequirementType#getPointPerformanceUID <em>Point Performance UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Performance UID</em>' containment reference.
	 * @see #getPointPerformanceUID()
	 * @generated
	 */
	void setPointPerformanceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Weight And Balance UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of weight and balance description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight And Balance UID</em>' containment reference.
	 * @see #setWeightAndBalanceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getControllabilityRequirementType_WeightAndBalanceUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weightAndBalanceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWeightAndBalanceUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControllabilityRequirementType#getWeightAndBalanceUID <em>Weight And Balance UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight And Balance UID</em>' containment reference.
	 * @see #getWeightAndBalanceUID()
	 * @generated
	 */
	void setWeightAndBalanceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference.
	 * @see #setConfigurations(PerformanceRequirementConfigurationsType)
	 * @see Cpacs.CpacsPackage#getControllabilityRequirementType_Configurations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configurations' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceRequirementConfigurationsType getConfigurations();

	/**
	 * Sets the value of the '{@link Cpacs.ControllabilityRequirementType#getConfigurations <em>Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations</em>' containment reference.
	 * @see #getConfigurations()
	 * @generated
	 */
	void setConfigurations(PerformanceRequirementConfigurationsType value);

	/**
	 * Returns the value of the '<em><b>Performance Maps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Maps</em>' containment reference.
	 * @see #setPerformanceMaps(PerformanceMapSelectionType)
	 * @see Cpacs.CpacsPackage#getControllabilityRequirementType_PerformanceMaps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performanceMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceMapSelectionType getPerformanceMaps();

	/**
	 * Sets the value of the '{@link Cpacs.ControllabilityRequirementType#getPerformanceMaps <em>Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Maps</em>' containment reference.
	 * @see #getPerformanceMaps()
	 * @generated
	 */
	void setPerformanceMaps(PerformanceMapSelectionType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getControllabilityRequirementType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControllabilityRequirementType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // ControllabilityRequirementType
