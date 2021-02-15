/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabin Spaces Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CabinSpacesType#getSpace <em>Space</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCabinSpacesType()
 * @model extendedMetaData="name='cabinSpacesType' kind='elementOnly'"
 * @generated
 */
public interface CabinSpacesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Space</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CabinSpaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCabinSpacesType_Space()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='space' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CabinSpaceType> getSpace();

} // CabinSpacesType
