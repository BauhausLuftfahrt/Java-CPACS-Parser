/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuels Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuelsType#getFuel <em>Fuel</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuelsType()
 * @model extendedMetaData="name='fuelsType' kind='elementOnly'"
 * @generated
 */
public interface FuelsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuel</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FuelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFuelsType_Fuel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuelType> getFuel();

} // FuelsType
