/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StateParametersType#getStateParameter <em>State Parameter</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStateParametersType()
 * @model extendedMetaData="name='stateParametersType' kind='elementOnly'"
 * @generated
 */
public interface StateParametersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>State Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StateParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Parameter</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getStateParametersType_StateParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stateParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StateParameterType> getStateParameter();

} // StateParametersType
