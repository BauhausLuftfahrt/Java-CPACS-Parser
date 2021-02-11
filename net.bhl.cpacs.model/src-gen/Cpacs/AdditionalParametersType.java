/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AdditionalParametersType#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAdditionalParametersType()
 * @model extendedMetaData="name='additionalParametersType' kind='elementOnly'"
 * @generated
 */
public interface AdditionalParametersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AdditionalParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAdditionalParametersType_Parameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AdditionalParameterType> getParameter();

} // AdditionalParametersType
