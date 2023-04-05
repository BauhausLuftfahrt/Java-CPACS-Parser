/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sidewall Panels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SidewallPanelsType#getSidewallPanel <em>Sidewall Panel</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSidewallPanelsType()
 * @model extendedMetaData="name='sidewallPanelsType' kind='elementOnly'"
 * @generated
 */
public interface SidewallPanelsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sidewall Panel</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckComponentBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sidewall panel
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sidewall Panel</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSidewallPanelsType_SidewallPanel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sidewallPanel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckComponentBaseType> getSidewallPanel();

} // SidewallPanelsType
