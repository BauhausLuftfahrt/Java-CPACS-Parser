/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Fuel Tanks Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingFuelTanksType#getWingFuelTank <em>Wing Fuel Tank</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingFuelTanksType()
 * @model extendedMetaData="name='wingFuelTanksType' kind='elementOnly'"
 * @generated
 */
public interface WingFuelTanksType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing Fuel Tank</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingFuelTankType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Fuel Tank</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingFuelTanksType_WingFuelTank()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingFuelTank' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingFuelTankType> getWingFuelTank();

} // WingFuelTanksType
