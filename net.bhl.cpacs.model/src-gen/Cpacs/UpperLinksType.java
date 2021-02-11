/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Upper Links Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.UpperLinksType#getUpperLink <em>Upper Link</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getUpperLinksType()
 * @model extendedMetaData="name='upperLinksType' kind='elementOnly'"
 * @generated
 */
public interface UpperLinksType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Upper Link</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StrutType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Link</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getUpperLinksType_UpperLink()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='upperLink' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StrutType> getUpperLink();

} // UpperLinksType
