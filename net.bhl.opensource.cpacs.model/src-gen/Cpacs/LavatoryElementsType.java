/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lavatory Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LavatoryElementsType#getLavatoryElement <em>Lavatory Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLavatoryElementsType()
 * @model extendedMetaData="name='lavatoryElementsType' kind='elementOnly'"
 * @generated
 */
public interface LavatoryElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Lavatory Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckElementBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lavatory element for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lavatory Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLavatoryElementsType_LavatoryElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lavatoryElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckElementBaseType> getLavatoryElement();

} // LavatoryElementsType
