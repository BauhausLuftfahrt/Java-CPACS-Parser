/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pylon Ribs Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PylonRibsDefinitionsType#getRibsDefinition <em>Ribs Definition</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPylonRibsDefinitionsType()
 * @model extendedMetaData="name='pylonRibsDefinitionsType' kind='elementOnly'"
 * @generated
 */
public interface PylonRibsDefinitionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Ribs Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ribs Definition</em>' containment reference.
	 * @see #setRibsDefinition(PylonRibsDefinitionType)
	 * @see Cpacs.CpacsPackage#getPylonRibsDefinitionsType_RibsDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribsDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonRibsDefinitionType getRibsDefinition();

	/**
	 * Sets the value of the '{@link Cpacs.PylonRibsDefinitionsType#getRibsDefinition <em>Ribs Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ribs Definition</em>' containment reference.
	 * @see #getRibsDefinition()
	 * @generated
	 */
	void setRibsDefinition(PylonRibsDefinitionType value);

} // PylonRibsDefinitionsType
