/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ceiling Panel Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CeilingPanelElementsType#getCeilingPanelElement <em>Ceiling Panel Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCeilingPanelElementsType()
 * @model extendedMetaData="name='ceilingPanelElementsType' kind='elementOnly'"
 * @generated
 */
public interface CeilingPanelElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Ceiling Panel Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckElementBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ceiling panel element for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ceiling Panel Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCeilingPanelElementsType_CeilingPanelElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ceilingPanelElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckElementBaseType> getCeilingPanelElement();

} // CeilingPanelElementsType
