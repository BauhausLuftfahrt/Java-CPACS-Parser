/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Cells Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingCellsType#getCell <em>Cell</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingCellsType()
 * @model extendedMetaData="name='wingCellsType' kind='elementOnly'"
 * @generated
 */
public interface WingCellsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cell</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingCellType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingCellsType_Cell()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cell' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingCellType> getCell();

} // WingCellsType
