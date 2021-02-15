/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weight And Balance Fuel In Tanks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WeightAndBalanceFuelInTanksType#getFuelInTank <em>Fuel In Tank</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelInTanksType()
 * @model extendedMetaData="name='weightAndBalanceFuelInTanksType' kind='elementOnly'"
 * @generated
 */
public interface WeightAndBalanceFuelInTanksType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuel In Tank</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WeightAndBalanceFuelInTankType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel In Tank</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelInTanksType_FuelInTank()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuelInTank' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WeightAndBalanceFuelInTankType> getFuelInTank();

} // WeightAndBalanceFuelInTanksType
