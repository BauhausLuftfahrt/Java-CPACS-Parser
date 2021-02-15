/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spar Cells Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SparCellsType#getSparCell <em>Spar Cell</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSparCellsType()
 * @model extendedMetaData="name='sparCellsType' kind='elementOnly'"
 * @generated
 */
public interface SparCellsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Spar Cell</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.SparCellType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spar Cell</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSparCellsType_SparCell()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sparCell' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SparCellType> getSparCell();

} // SparCellsType
