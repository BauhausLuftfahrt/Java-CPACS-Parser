/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sidewall Panel Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SidewallPanelElementsType#getSidewallPanelElement <em>Sidewall Panel Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSidewallPanelElementsType()
 * @model extendedMetaData="name='sidewallPanelElementsType' kind='elementOnly'"
 * @generated
 */
public interface SidewallPanelElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sidewall Panel Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckElementBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sidewall panel element for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sidewall Panel Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSidewallPanelElementsType_SidewallPanelElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sidewallPanelElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckElementBaseType> getSidewallPanelElement();

} // SidewallPanelElementsType
