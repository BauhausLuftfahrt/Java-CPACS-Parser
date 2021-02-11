/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet Based Structural Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SheetBasedStructuralElementsType#getSheetBasedStructuralElement <em>Sheet Based Structural Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSheetBasedStructuralElementsType()
 * @model extendedMetaData="name='sheetBasedStructuralElementsType' kind='elementOnly'"
 * @generated
 */
public interface SheetBasedStructuralElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sheet Based Structural Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SheetBasedStructuralElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Based Structural Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSheetBasedStructuralElementsType_SheetBasedStructuralElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheetBasedStructuralElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SheetBasedStructuralElementType> getSheetBasedStructuralElement();

} // SheetBasedStructuralElementsType
