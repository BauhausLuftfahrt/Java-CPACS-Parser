/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seat Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SeatElementsType#getSeatElement <em>Seat Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSeatElementsType()
 * @model extendedMetaData="name='seatElementsType' kind='elementOnly'"
 * @generated
 */
public interface SeatElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Seat Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SeatElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seat element for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seat Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSeatElementsType_SeatElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='seatElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SeatElementType> getSeatElement();

} // SeatElementsType
