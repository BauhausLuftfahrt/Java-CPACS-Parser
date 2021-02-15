/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ParametersType#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getParametersType()
 * @model extendedMetaData="name='parametersType' kind='elementOnly'"
 * @generated
 */
public interface ParametersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getParametersType_Parameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterType> getParameter();

} // ParametersType
