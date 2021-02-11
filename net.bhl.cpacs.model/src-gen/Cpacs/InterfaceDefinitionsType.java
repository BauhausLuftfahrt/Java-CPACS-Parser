/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.InterfaceDefinitionsType#getAutomaticInterfaceGeneration <em>Automatic Interface Generation</em>}</li>
 *   <li>{@link Cpacs.InterfaceDefinitionsType#getRivetJointAreas <em>Rivet Joint Areas</em>}</li>
 *   <li>{@link Cpacs.InterfaceDefinitionsType#getTiedInterfaces <em>Tied Interfaces</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getInterfaceDefinitionsType()
 * @model extendedMetaData="name='interfaceDefinitionsType' kind='elementOnly'"
 * @generated
 */
public interface InterfaceDefinitionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Automatic Interface Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag for automatic generation of interface
	 *                                 definitions (draft version)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatic Interface Generation</em>' containment reference.
	 * @see #setAutomaticInterfaceGeneration(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getInterfaceDefinitionsType_AutomaticInterfaceGeneration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='automaticInterfaceGeneration' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getAutomaticInterfaceGeneration();

	/**
	 * Sets the value of the '{@link Cpacs.InterfaceDefinitionsType#getAutomaticInterfaceGeneration <em>Automatic Interface Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Interface Generation</em>' containment reference.
	 * @see #getAutomaticInterfaceGeneration()
	 * @generated
	 */
	void setAutomaticInterfaceGeneration(BooleanBaseType value);

	/**
	 * Returns the value of the '<em><b>Rivet Joint Areas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rivet Joint Areas</em>' containment reference.
	 * @see #setRivetJointAreas(RivetJointAreasAssemblyType)
	 * @see Cpacs.CpacsPackage#getInterfaceDefinitionsType_RivetJointAreas()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rivetJointAreas' namespace='##targetNamespace'"
	 * @generated
	 */
	RivetJointAreasAssemblyType getRivetJointAreas();

	/**
	 * Sets the value of the '{@link Cpacs.InterfaceDefinitionsType#getRivetJointAreas <em>Rivet Joint Areas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rivet Joint Areas</em>' containment reference.
	 * @see #getRivetJointAreas()
	 * @generated
	 */
	void setRivetJointAreas(RivetJointAreasAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Tied Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tied Interfaces</em>' containment reference.
	 * @see #setTiedInterfaces(TiedInterfacesType)
	 * @see Cpacs.CpacsPackage#getInterfaceDefinitionsType_TiedInterfaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tiedInterfaces' namespace='##targetNamespace'"
	 * @generated
	 */
	TiedInterfacesType getTiedInterfaces();

	/**
	 * Sets the value of the '{@link Cpacs.InterfaceDefinitionsType#getTiedInterfaces <em>Tied Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tied Interfaces</em>' containment reference.
	 * @see #getTiedInterfaces()
	 * @generated
	 */
	void setTiedInterfaces(TiedInterfacesType value);

} // InterfaceDefinitionsType
