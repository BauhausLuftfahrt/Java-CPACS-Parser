/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Intermediate Structure Cells Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingIntermediateStructureCellsType#getCell <em>Cell</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingIntermediateStructureCellsType()
 * @model extendedMetaData="name='wingIntermediateStructureCellsType' kind='elementOnly'"
 * @generated
 */
public interface WingIntermediateStructureCellsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cell</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingIntermediateStructureCellType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingIntermediateStructureCellsType_Cell()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cell' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingIntermediateStructureCellType> getCell();

} // WingIntermediateStructureCellsType
