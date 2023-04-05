/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cargo Container Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CargoContainerElementsType#getCargoContainerElement <em>Cargo Container Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCargoContainerElementsType()
 * @model extendedMetaData="name='cargoContainerElementsType' kind='elementOnly'"
 * @generated
 */
public interface CargoContainerElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cargo Container Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CargoContainerElementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargo Container Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCargoContainerElementsType_CargoContainerElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cargoContainerElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CargoContainerElementType> getCargoContainerElement();

} // CargoContainerElementsType
