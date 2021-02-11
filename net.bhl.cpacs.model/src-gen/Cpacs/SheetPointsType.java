/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet Points Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SheetPointsType#getSheetPointUID <em>Sheet Point UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSheetPointsType()
 * @model extendedMetaData="name='sheetPointsType' kind='elementOnly'"
 * @generated
 */
public interface SheetPointsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sheet Point UID</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.StringUIDBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Point UID</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSheetPointsType_SheetPointUID()
	 * @model containment="true" lower="3"
	 *        extendedMetaData="kind='element' name='sheetPointUID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StringUIDBaseType> getSheetPointUID();

} // SheetPointsType
