/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Functions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlFunctionsType#getControlFunction <em>Control Function</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlFunctionsType()
 * @model extendedMetaData="name='controlFunctionsType' kind='elementOnly'"
 * @generated
 */
public interface ControlFunctionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Function</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControlFunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Function</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControlFunctionsType_ControlFunction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlFunctionType> getControlFunction();

} // ControlFunctionsType
