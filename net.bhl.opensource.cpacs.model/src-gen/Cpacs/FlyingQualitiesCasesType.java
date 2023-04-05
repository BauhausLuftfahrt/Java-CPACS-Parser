/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flying Qualities Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlyingQualitiesCasesType#getFlyingQualitiesCase <em>Flying Qualities Case</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlyingQualitiesCasesType()
 * @model extendedMetaData="name='flyingQualitiesCasesType' kind='elementOnly'"
 * @generated
 */
public interface FlyingQualitiesCasesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Flying Qualities Case</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FlyingQualitiesCaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flying Qualities Case</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFlyingQualitiesCasesType_FlyingQualitiesCase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flyingQualitiesCase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FlyingQualitiesCaseType> getFlyingQualitiesCase();

} // FlyingQualitiesCasesType
