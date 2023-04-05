/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cargo Containers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CargoContainersType#getCargoContainer <em>Cargo Container</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCargoContainersType()
 * @model extendedMetaData="name='cargoContainersType' kind='elementOnly'"
 * @generated
 */
public interface CargoContainersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cargo Container</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CargoContainerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargo Container</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCargoContainersType_CargoContainer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cargoContainer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CargoContainerType> getCargoContainer();

} // CargoContainersType
