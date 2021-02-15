/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tangent Links Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TangentLinksType#getTangentLink <em>Tangent Link</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTangentLinksType()
 * @model extendedMetaData="name='tangentLinksType' kind='elementOnly'"
 * @generated
 */
public interface TangentLinksType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Tangent Link</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StrutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tangent Link</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTangentLinksType_TangentLink()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tangentLink' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StrutType> getTangentLink();

} // TangentLinksType
