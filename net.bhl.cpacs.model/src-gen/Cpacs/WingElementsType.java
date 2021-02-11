/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingElementsType#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingElementsType()
 * @model extendedMetaData="name='wingElementsType' kind='elementOnly'"
 * @generated
 */
public interface WingElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingElementsType_Element()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingElementType> getElement();

} // WingElementsType
