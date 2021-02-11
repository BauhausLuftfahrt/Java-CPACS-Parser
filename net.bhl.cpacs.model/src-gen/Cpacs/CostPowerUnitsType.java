/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Power Units Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostPowerUnitsType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostPowerUnitsType#getEquippedEngines <em>Equipped Engines</em>}</li>
 *   <li>{@link Cpacs.CostPowerUnitsType#getNacelles <em>Nacelles</em>}</li>
 *   <li>{@link Cpacs.CostPowerUnitsType#getBleedAirSystems <em>Bleed Air Systems</em>}</li>
 *   <li>{@link Cpacs.CostPowerUnitsType#getFuelSystems <em>Fuel Systems</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostPowerUnitsType()
 * @model extendedMetaData="name='costPowerUnitsType' kind='elementOnly'"
 * @generated
 */
public interface CostPowerUnitsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostPowerUnitsType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostPowerUnitsType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Equipped Engines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipped Engines</em>' containment reference.
	 * @see #setEquippedEngines(CostEquippedEnginesType)
	 * @see Cpacs.CpacsPackage#getCostPowerUnitsType_EquippedEngines()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='equippedEngines' namespace='##targetNamespace'"
	 * @generated
	 */
	CostEquippedEnginesType getEquippedEngines();

	/**
	 * Sets the value of the '{@link Cpacs.CostPowerUnitsType#getEquippedEngines <em>Equipped Engines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipped Engines</em>' containment reference.
	 * @see #getEquippedEngines()
	 * @generated
	 */
	void setEquippedEngines(CostEquippedEnginesType value);

	/**
	 * Returns the value of the '<em><b>Nacelles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nacelles</em>' containment reference.
	 * @see #setNacelles(CostNacellesType)
	 * @see Cpacs.CpacsPackage#getCostPowerUnitsType_Nacelles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nacelles' namespace='##targetNamespace'"
	 * @generated
	 */
	CostNacellesType getNacelles();

	/**
	 * Sets the value of the '{@link Cpacs.CostPowerUnitsType#getNacelles <em>Nacelles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nacelles</em>' containment reference.
	 * @see #getNacelles()
	 * @generated
	 */
	void setNacelles(CostNacellesType value);

	/**
	 * Returns the value of the '<em><b>Bleed Air Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bleed Air Systems</em>' containment reference.
	 * @see #setBleedAirSystems(CostBleedAirSystemsType)
	 * @see Cpacs.CpacsPackage#getCostPowerUnitsType_BleedAirSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bleedAirSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostBleedAirSystemsType getBleedAirSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostPowerUnitsType#getBleedAirSystems <em>Bleed Air Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bleed Air Systems</em>' containment reference.
	 * @see #getBleedAirSystems()
	 * @generated
	 */
	void setBleedAirSystems(CostBleedAirSystemsType value);

	/**
	 * Returns the value of the '<em><b>Fuel Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Systems</em>' containment reference.
	 * @see #setFuelSystems(CostFuelSystemsType)
	 * @see Cpacs.CpacsPackage#getCostPowerUnitsType_FuelSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostFuelSystemsType getFuelSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostPowerUnitsType#getFuelSystems <em>Fuel Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Systems</em>' containment reference.
	 * @see #getFuelSystems()
	 * @generated
	 */
	void setFuelSystems(CostFuelSystemsType value);

} // CostPowerUnitsType
