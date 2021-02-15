/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Surround Structures Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DoorSurroundStructuresAssemblyType#getDoorSurroundStructure <em>Door Surround Structure</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDoorSurroundStructuresAssemblyType()
 * @model extendedMetaData="name='doorSurroundStructuresAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface DoorSurroundStructuresAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Door Surround Structure</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DoorSurroundStructurePositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Surround Structure</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getDoorSurroundStructuresAssemblyType_DoorSurroundStructure()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='doorSurroundStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DoorSurroundStructurePositionType> getDoorSurroundStructure();

} // DoorSurroundStructuresAssemblyType
