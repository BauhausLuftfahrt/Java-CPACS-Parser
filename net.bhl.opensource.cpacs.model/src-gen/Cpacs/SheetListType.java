/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SheetListType#getSheet <em>Sheet</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSheetListType()
 * @model extendedMetaData="name='sheetListType' kind='elementOnly'"
 * @generated
 */
public interface SheetListType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sheet</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SheetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSheetListType_Sheet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SheetType> getSheet();

} // SheetListType
