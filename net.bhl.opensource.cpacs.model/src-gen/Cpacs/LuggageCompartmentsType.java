/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Luggage Compartments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LuggageCompartmentsType#getLuggageCompartment <em>Luggage Compartment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLuggageCompartmentsType()
 * @model extendedMetaData="name='luggageCompartmentsType' kind='elementOnly'"
 * @generated
 */
public interface LuggageCompartmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Luggage Compartment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckComponentBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Luggage compartment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Luggage Compartment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLuggageCompartmentsType_LuggageCompartment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='luggageCompartment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckComponentBaseType> getLuggageCompartment();

} // LuggageCompartmentsType
