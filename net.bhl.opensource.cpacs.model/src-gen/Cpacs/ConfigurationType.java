/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ConfigurationType#getConfigurationUID <em>Configuration UID</em>}</li>
 *   <li>{@link Cpacs.ConfigurationType#getControlElements <em>Control Elements</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getConfigurationType()
 * @model extendedMetaData="name='configurationType' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Configuration UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference to the aircraft configuration node (aircraft/model/configurations/configuration)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration UID</em>' containment reference.
	 * @see #setConfigurationUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getConfigurationType_ConfigurationUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configurationUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getConfigurationUID();

	/**
	 * Sets the value of the '{@link Cpacs.ConfigurationType#getConfigurationUID <em>Configuration UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration UID</em>' containment reference.
	 * @see #getConfigurationUID()
	 * @generated
	 */
	void setConfigurationUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 State description of the control elements
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Elements</em>' containment reference.
	 * @see #setControlElements(AircraftControlElementsType)
	 * @see Cpacs.CpacsPackage#getConfigurationType_ControlElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlElements' namespace='##targetNamespace'"
	 * @generated
	 */
	AircraftControlElementsType getControlElements();

	/**
	 * Sets the value of the '{@link Cpacs.ConfigurationType#getControlElements <em>Control Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Elements</em>' containment reference.
	 * @see #getControlElements()
	 * @generated
	 */
	void setControlElements(AircraftControlElementsType value);

} // ConfigurationType
