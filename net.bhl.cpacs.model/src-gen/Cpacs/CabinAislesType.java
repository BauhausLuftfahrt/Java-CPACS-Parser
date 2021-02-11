/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabin Aisles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CabinAislesType#getAisle <em>Aisle</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCabinAislesType()
 * @model extendedMetaData="name='cabinAislesType' kind='elementOnly'"
 * @generated
 */
public interface CabinAislesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Aisle</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CabinAisleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aisle</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCabinAislesType_Aisle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aisle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CabinAisleType> getAisle();

} // CabinAislesType
