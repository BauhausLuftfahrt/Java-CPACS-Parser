/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet List3 DType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SheetList3DType#getSheet3D <em>Sheet3 D</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSheetList3DType()
 * @model extendedMetaData="name='sheetList3DType' kind='elementOnly'"
 * @generated
 */
public interface SheetList3DType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sheet3 D</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.Sheet3DType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet3 D</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSheetList3DType_Sheet3D()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheet3D' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Sheet3DType> getSheet3D();

} // SheetList3DType
