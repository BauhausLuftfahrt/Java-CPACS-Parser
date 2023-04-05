/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck Structural Mounts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DeckStructuralMountsType#getStructuralMount <em>Structural Mount</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDeckStructuralMountsType()
 * @model extendedMetaData="name='deckStructuralMountsType' kind='elementOnly'"
 * @generated
 */
public interface DeckStructuralMountsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Structural Mount</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckStructuralMountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Mount</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getDeckStructuralMountsType_StructuralMount()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structuralMount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckStructuralMountType> getStructuralMount();

} // DeckStructuralMountsType
