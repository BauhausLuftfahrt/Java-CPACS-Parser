/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabin Seat Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CabinSeatElementsType#getSeatElement <em>Seat Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCabinSeatElementsType()
 * @model extendedMetaData="name='cabinSeatElementsType' kind='elementOnly'"
 * @generated
 */
public interface CabinSeatElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Seat Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CabinSeatElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCabinSeatElementsType_SeatElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='seatElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CabinSeatElementType> getSeatElement();

} // CabinSeatElementsType
