/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Requirement Configurations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PerformanceRequirementConfigurationsType#getDefaultConfigurationUID <em>Default Configuration UID</em>}</li>
 *   <li>{@link Cpacs.PerformanceRequirementConfigurationsType#getSpecificConfigurationUIDs <em>Specific Configuration UI Ds</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPerformanceRequirementConfigurationsType()
 * @model extendedMetaData="name='performanceRequirementConfigurationsType' kind='elementOnly'"
 * @generated
 */
public interface PerformanceRequirementConfigurationsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Default Configuration UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Default configuration uID
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Configuration UID</em>' containment reference.
	 * @see #setDefaultConfigurationUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPerformanceRequirementConfigurationsType_DefaultConfigurationUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='defaultConfigurationUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getDefaultConfigurationUID();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceRequirementConfigurationsType#getDefaultConfigurationUID <em>Default Configuration UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Configuration UID</em>' containment reference.
	 * @see #getDefaultConfigurationUID()
	 * @generated
	 */
	void setDefaultConfigurationUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Specific Configuration UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Configuration UI Ds</em>' containment reference.
	 * @see #setSpecificConfigurationUIDs(SpecificConfigurationUIDsType)
	 * @see Cpacs.CpacsPackage#getPerformanceRequirementConfigurationsType_SpecificConfigurationUIDs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specificConfigurationUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificConfigurationUIDsType getSpecificConfigurationUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceRequirementConfigurationsType#getSpecificConfigurationUIDs <em>Specific Configuration UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Configuration UI Ds</em>' containment reference.
	 * @see #getSpecificConfigurationUIDs()
	 * @generated
	 */
	void setSpecificConfigurationUIDs(SpecificConfigurationUIDsType value);

} // PerformanceRequirementConfigurationsType
