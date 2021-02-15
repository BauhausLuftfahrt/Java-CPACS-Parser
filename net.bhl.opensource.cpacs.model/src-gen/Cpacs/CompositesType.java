/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composites Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CompositesType#getComposite <em>Composite</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCompositesType()
 * @model extendedMetaData="name='compositesType' kind='elementOnly'"
 * @generated
 */
public interface CompositesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Composite</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CompositeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCompositesType_Composite()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='composite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CompositeType> getComposite();

} // CompositesType
