/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlElementsType#getControlElement <em>Control Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlElementsType()
 * @model extendedMetaData="name='controlElementsType' kind='elementOnly'"
 * @generated
 */
public interface ControlElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControlElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControlElementsType_ControlElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlElementType> getControlElement();

} // ControlElementsType
