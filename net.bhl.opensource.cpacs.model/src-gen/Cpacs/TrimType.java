/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trim Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrimType#getTrimCase <em>Trim Case</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrimType()
 * @model extendedMetaData="name='trimType' kind='elementOnly'"
 * @generated
 */
public interface TrimType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Trim Case</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.TrimCaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim Case</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTrimType_TrimCase()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='trimCase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TrimCaseType> getTrimCase();

} // TrimType
