/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lavatories Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LavatoriesType#getLavatory <em>Lavatory</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLavatoriesType()
 * @model extendedMetaData="name='lavatoriesType' kind='elementOnly'"
 * @generated
 */
public interface LavatoriesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Lavatory</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DeckComponent2DBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lavatory
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lavatory</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLavatoriesType_Lavatory()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lavatory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DeckComponent2DBaseType> getLavatory();

} // LavatoriesType
