/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ceiling Panels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CeilingPanelsType#getCeilingPanel <em>Ceiling Panel</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCeilingPanelsType()
 * @model extendedMetaData="name='ceilingPanelsType' kind='elementOnly'"
 * @generated
 */
public interface CeilingPanelsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Ceiling Panel</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckComponentBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ceiling panel
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ceiling Panel</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCeilingPanelsType_CeilingPanel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ceilingPanel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckComponentBaseType> getCeilingPanel();

} // CeilingPanelsType
