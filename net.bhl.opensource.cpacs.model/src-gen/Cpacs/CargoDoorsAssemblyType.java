/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cargo Doors Assembly Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CargoDoorsAssemblyType#getCargoDoor <em>Cargo Door</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCargoDoorsAssemblyType()
 * @model extendedMetaData="name='cargoDoorsAssemblyType' kind='elementOnly'"
 * @generated
 */
public interface CargoDoorsAssemblyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cargo Door</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.DoorAssemblyPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargo Door</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCargoDoorsAssemblyType_CargoDoor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cargoDoor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DoorAssemblyPositionType> getCargoDoor();

} // CargoDoorsAssemblyType
