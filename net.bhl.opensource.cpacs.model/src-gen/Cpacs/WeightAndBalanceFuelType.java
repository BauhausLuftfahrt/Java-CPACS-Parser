/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weight And Balance Fuel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WeightAndBalanceFuelType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalanceFuelType#getCoG <em>Co G</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalanceFuelType#getMassInertia <em>Mass Inertia</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalanceFuelType#getFuelInTanks <em>Fuel In Tanks</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelType()
 * @model extendedMetaData="name='weightAndBalanceFuelType' kind='elementOnly'"
 * @generated
 */
public interface WeightAndBalanceFuelType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelType_Mass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalanceFuelType#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Co G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Co G</em>' containment reference.
	 * @see #setCoG(PointListXYZVectorType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelType_CoG()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coG' namespace='##targetNamespace'"
	 * @generated
	 */
	PointListXYZVectorType getCoG();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalanceFuelType#getCoG <em>Co G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Co G</em>' containment reference.
	 * @see #getCoG()
	 * @generated
	 */
	void setCoG(PointListXYZVectorType value);

	/**
	 * Returns the value of the '<em><b>Mass Inertia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Inertia</em>' containment reference.
	 * @see #setMassInertia(MassInertiaVectorType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelType_MassInertia()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massInertia' namespace='##targetNamespace'"
	 * @generated
	 */
	MassInertiaVectorType getMassInertia();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalanceFuelType#getMassInertia <em>Mass Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Inertia</em>' containment reference.
	 * @see #getMassInertia()
	 * @generated
	 */
	void setMassInertia(MassInertiaVectorType value);

	/**
	 * Returns the value of the '<em><b>Fuel In Tanks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel In Tanks</em>' containment reference.
	 * @see #setFuelInTanks(WeightAndBalanceFuelInTanksType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelType_FuelInTanks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelInTanks' namespace='##targetNamespace'"
	 * @generated
	 */
	WeightAndBalanceFuelInTanksType getFuelInTanks();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalanceFuelType#getFuelInTanks <em>Fuel In Tanks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel In Tanks</em>' containment reference.
	 * @see #getFuelInTanks()
	 * @generated
	 */
	void setFuelInTanks(WeightAndBalanceFuelInTanksType value);

} // WeightAndBalanceFuelType
