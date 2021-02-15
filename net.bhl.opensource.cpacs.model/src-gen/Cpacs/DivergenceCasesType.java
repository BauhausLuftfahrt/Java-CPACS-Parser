/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Divergence Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DivergenceCasesType#getCase <em>Case</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDivergenceCasesType()
 * @model extendedMetaData="name='divergenceCasesType' kind='elementOnly'"
 * @generated
 */
public interface DivergenceCasesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Case</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DivergenceCaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getDivergenceCasesType_Case()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='case' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DivergenceCaseType> getCase();

} // DivergenceCasesType
