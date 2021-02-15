/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certification Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CertificationCasesType#getCertificationCase <em>Certification Case</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCertificationCasesType()
 * @model extendedMetaData="name='certificationCasesType' kind='elementOnly'"
 * @generated
 */
public interface CertificationCasesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Certification Case</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WeightAndBalanceCaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certification Case</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCertificationCasesType_CertificationCase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='certificationCase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WeightAndBalanceCaseType> getCertificationCase();

} // CertificationCasesType
