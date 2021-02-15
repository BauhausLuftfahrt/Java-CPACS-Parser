/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pax Doors Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PaxDoorsAssemblyType#getPaxDoor <em>Pax Door</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPaxDoorsAssemblyType()
 * @model extendedMetaData="name='paxDoorsAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface PaxDoorsAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Pax Door</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DoorAssemblyPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pax Door</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPaxDoorsAssemblyType_PaxDoor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='paxDoor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DoorAssemblyPositionType> getPaxDoor();

} // PaxDoorsAssemblyType
