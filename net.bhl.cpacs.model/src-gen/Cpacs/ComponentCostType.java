/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Cost Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ComponentCostType#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getComponentCostType()
 * @model extendedMetaData="name='componentCostType' kind='elementOnly'"
 * @generated
 */
public interface ComponentCostType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericCostType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getComponentCostType_Component()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericCostType> getComponent();

} // ComponentCostType
