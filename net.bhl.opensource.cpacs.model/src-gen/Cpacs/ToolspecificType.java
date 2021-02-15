/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toolspecific Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ToolspecificType#getTool <em>Tool</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getToolspecificType()
 * @model extendedMetaData="name='toolspecificType' kind='elementOnly'"
 * @generated
 */
public interface ToolspecificType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Tool</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ToolType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getToolspecificType_Tool()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tool' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ToolType> getTool();

} // ToolspecificType
