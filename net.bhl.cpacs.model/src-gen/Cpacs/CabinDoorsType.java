/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabin Doors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CabinDoorsType#getDoor <em>Door</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCabinDoorsType()
 * @model extendedMetaData="name='cabinDoorsType' kind='elementOnly'"
 * @generated
 */
public interface CabinDoorsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Door</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CabinDoorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCabinDoorsType_Door()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='door' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CabinDoorType> getDoor();

} // CabinDoorsType
