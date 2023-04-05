/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Released Stores Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ReleasedStoresType#getReleasedStore <em>Released Store</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getReleasedStoresType()
 * @model extendedMetaData="name='releasedStoresType' kind='elementOnly'"
 * @generated
 */
public interface ReleasedStoresType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Released Store</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ReleasedStoreType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Released Store</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getReleasedStoresType_ReleasedStore()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='releasedStore' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReleasedStoreType> getReleasedStore();

} // ReleasedStoresType
