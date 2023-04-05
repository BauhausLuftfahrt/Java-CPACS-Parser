/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Luggage Compartment Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LuggageCompartmentElementsType#getLuggageCompartmentElement <em>Luggage Compartment Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLuggageCompartmentElementsType()
 * @model extendedMetaData="name='luggageCompartmentElementsType' kind='elementOnly'"
 * @generated
 */
public interface LuggageCompartmentElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Luggage Compartment Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckElementBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Luggage compartment element for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Luggage Compartment Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLuggageCompartmentElementsType_LuggageCompartmentElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='luggageCompartmentElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckElementBaseType> getLuggageCompartmentElement();

} // LuggageCompartmentElementsType
