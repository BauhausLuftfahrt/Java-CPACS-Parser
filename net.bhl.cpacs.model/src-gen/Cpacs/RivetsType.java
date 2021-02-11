/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rivets Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RivetsType#getRivet <em>Rivet</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRivetsType()
 * @model extendedMetaData="name='rivetsType' kind='elementOnly'"
 * @generated
 */
public interface RivetsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rivet</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.RivetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rivet</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRivetsType_Rivet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rivet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RivetType> getRivet();

} // RivetsType
