/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFuel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MFuelType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MFuelType#getFuelInTank <em>Fuel In Tank</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMFuelType()
 * @model extendedMetaData="name='mFuelType' kind='elementOnly'"
 * @generated
 */
public interface MFuelType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fuel mass description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMFuelType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MFuelType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>Fuel In Tank</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.FuelInTankType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel In Tank</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMFuelType_FuelInTank()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelInTank' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuelInTankType> getFuelInTank();

} // MFuelType
