/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weight And Balance Fuel In Tank Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WeightAndBalanceFuelInTankType#getTankUID <em>Tank UID</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalanceFuelInTankType#getFuelUID <em>Fuel UID</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalanceFuelInTankType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalanceFuelInTankType#getCoG <em>Co G</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalanceFuelInTankType#getMassInertia <em>Mass Inertia</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalanceFuelInTankType#getTankFillLevel <em>Tank Fill Level</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelInTankType()
 * @model extendedMetaData="name='weightAndBalanceFuelInTankType' kind='elementOnly'"
 * @generated
 */
public interface WeightAndBalanceFuelInTankType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Tank UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tank UID</em>' containment reference.
	 * @see #setTankUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelInTankType_TankUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tankUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getTankUID();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalanceFuelInTankType#getTankUID <em>Tank UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tank UID</em>' containment reference.
	 * @see #getTankUID()
	 * @generated
	 */
	void setTankUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Fuel UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel UID</em>' containment reference.
	 * @see #setFuelUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelInTankType_FuelUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFuelUID();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalanceFuelInTankType#getFuelUID <em>Fuel UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel UID</em>' containment reference.
	 * @see #getFuelUID()
	 * @generated
	 */
	void setFuelUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelInTankType_Mass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalanceFuelInTankType#getMass <em>Mass</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelInTankType_CoG()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coG' namespace='##targetNamespace'"
	 * @generated
	 */
	PointListXYZVectorType getCoG();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalanceFuelInTankType#getCoG <em>Co G</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelInTankType_MassInertia()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massInertia' namespace='##targetNamespace'"
	 * @generated
	 */
	MassInertiaVectorType getMassInertia();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalanceFuelInTankType#getMassInertia <em>Mass Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Inertia</em>' containment reference.
	 * @see #getMassInertia()
	 * @generated
	 */
	void setMassInertia(MassInertiaVectorType value);

	/**
	 * Returns the value of the '<em><b>Tank Fill Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ranges from 0 for empty tank to 1
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tank Fill Level</em>' containment reference.
	 * @see #setTankFillLevel(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceFuelInTankType_TankFillLevel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tankFillLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getTankFillLevel();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalanceFuelInTankType#getTankFillLevel <em>Tank Fill Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tank Fill Level</em>' containment reference.
	 * @see #getTankFillLevel()
	 * @generated
	 */
	void setTankFillLevel(StringVectorBaseType value);

} // WeightAndBalanceFuelInTankType
