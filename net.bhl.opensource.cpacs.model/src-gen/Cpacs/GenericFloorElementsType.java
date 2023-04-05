/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Floor Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GenericFloorElementsType#getGenericFloorElement <em>Generic Floor Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGenericFloorElementsType()
 * @model extendedMetaData="name='genericFloorElementsType' kind='elementOnly'"
 * @generated
 */
public interface GenericFloorElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Generic Floor Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckElementBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generic floor element for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generic Floor Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGenericFloorElementsType_GenericFloorElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='genericFloorElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckElementBaseType> getGenericFloorElement();

} // GenericFloorElementsType
