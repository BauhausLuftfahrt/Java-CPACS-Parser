/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DecksType#getDeck <em>Deck</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDecksType()
 * @model extendedMetaData="name='decksType' kind='elementOnly'"
 * @generated
 */
public interface DecksType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Deck</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deck</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getDecksType_Deck()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deck' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckType> getDeck();

} // DecksType
