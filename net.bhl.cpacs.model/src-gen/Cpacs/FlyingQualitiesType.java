/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flying Qualities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlyingQualitiesType#getFqCase <em>Fq Case</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlyingQualitiesType()
 * @model extendedMetaData="name='flyingQualitiesType' kind='elementOnly'"
 * @generated
 */
public interface FlyingQualitiesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fq Case</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FqCaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fq Case</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFlyingQualitiesType_FqCase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fqCase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FqCaseType> getFqCase();

} // FlyingQualitiesType
