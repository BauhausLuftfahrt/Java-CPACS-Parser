/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Ribs Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingRibsDefinitionsType#getRibsDefinition <em>Ribs Definition</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingRibsDefinitionsType()
 * @model extendedMetaData="name='wingRibsDefinitionsType' kind='elementOnly'"
 * @generated
 */
public interface WingRibsDefinitionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Ribs Definition</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingRibsDefinitionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ribs Definition</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingRibsDefinitionsType_RibsDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ribsDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingRibsDefinitionType> getRibsDefinition();

} // WingRibsDefinitionsType
