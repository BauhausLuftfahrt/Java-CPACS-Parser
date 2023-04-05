/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck Doors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DeckDoorsType#getDeckDoor <em>Deck Door</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDeckDoorsType()
 * @model extendedMetaData="name='deckDoorsType' kind='elementOnly'"
 * @generated
 */
public interface DeckDoorsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Deck Door</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckDoorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deck Door</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getDeckDoorsType_DeckDoor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deckDoor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckDoorType> getDeckDoor();

} // DeckDoorsType
