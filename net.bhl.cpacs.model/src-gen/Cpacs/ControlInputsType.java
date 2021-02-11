/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Inputs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlInputsType#getControlInput <em>Control Input</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlInputsType()
 * @model extendedMetaData="name='controlInputsType' kind='elementOnly'"
 * @generated
 */
public interface ControlInputsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Input</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControlInputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Input</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControlInputsType_ControlInput()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlInput' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlInputType> getControlInput();

} // ControlInputsType
