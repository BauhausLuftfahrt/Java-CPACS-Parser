/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recurring Cost Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RecurringCostType#getProductionQuantity <em>Production Quantity</em>}</li>
 *   <li>{@link Cpacs.RecurringCostType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.RecurringCostType#getComponents <em>Components</em>}</li>
 *   <li>{@link Cpacs.RecurringCostType#getPowerUnits <em>Power Units</em>}</li>
 *   <li>{@link Cpacs.RecurringCostType#getSystems <em>Systems</em>}</li>
 *   <li>{@link Cpacs.RecurringCostType#getFurnishings <em>Furnishings</em>}</li>
 *   <li>{@link Cpacs.RecurringCostType#getOperatorItems <em>Operator Items</em>}</li>
 *   <li>{@link Cpacs.RecurringCostType#getFinalAssembly <em>Final Assembly</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRecurringCostType()
 * @model extendedMetaData="name='recurringCostType' kind='elementOnly'"
 * @generated
 */
public interface RecurringCostType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Production Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Quantity</em>' containment reference.
	 * @see #setProductionQuantity(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getRecurringCostType_ProductionQuantity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='productionQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getProductionQuantity();

	/**
	 * Sets the value of the '{@link Cpacs.RecurringCostType#getProductionQuantity <em>Production Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Quantity</em>' containment reference.
	 * @see #getProductionQuantity()
	 * @generated
	 */
	void setProductionQuantity(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getRecurringCostType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.RecurringCostType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference.
	 * @see #setComponents(CostComponentsType)
	 * @see Cpacs.CpacsPackage#getRecurringCostType_Components()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='components' namespace='##targetNamespace'"
	 * @generated
	 */
	CostComponentsType getComponents();

	/**
	 * Sets the value of the '{@link Cpacs.RecurringCostType#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(CostComponentsType value);

	/**
	 * Returns the value of the '<em><b>Power Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Units</em>' containment reference.
	 * @see #setPowerUnits(CostPowerUnitsType)
	 * @see Cpacs.CpacsPackage#getRecurringCostType_PowerUnits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='powerUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	CostPowerUnitsType getPowerUnits();

	/**
	 * Sets the value of the '{@link Cpacs.RecurringCostType#getPowerUnits <em>Power Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Units</em>' containment reference.
	 * @see #getPowerUnits()
	 * @generated
	 */
	void setPowerUnits(CostPowerUnitsType value);

	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference.
	 * @see #setSystems(CostSystemsType)
	 * @see Cpacs.CpacsPackage#getRecurringCostType_Systems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='systems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostSystemsType getSystems();

	/**
	 * Sets the value of the '{@link Cpacs.RecurringCostType#getSystems <em>Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systems</em>' containment reference.
	 * @see #getSystems()
	 * @generated
	 */
	void setSystems(CostSystemsType value);

	/**
	 * Returns the value of the '<em><b>Furnishings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Furnishings</em>' containment reference.
	 * @see #setFurnishings(CostFurnishingsType)
	 * @see Cpacs.CpacsPackage#getRecurringCostType_Furnishings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='furnishings' namespace='##targetNamespace'"
	 * @generated
	 */
	CostFurnishingsType getFurnishings();

	/**
	 * Sets the value of the '{@link Cpacs.RecurringCostType#getFurnishings <em>Furnishings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Furnishings</em>' containment reference.
	 * @see #getFurnishings()
	 * @generated
	 */
	void setFurnishings(CostFurnishingsType value);

	/**
	 * Returns the value of the '<em><b>Operator Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator Items</em>' containment reference.
	 * @see #setOperatorItems(GenericCostType)
	 * @see Cpacs.CpacsPackage#getRecurringCostType_OperatorItems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operatorItems' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getOperatorItems();

	/**
	 * Sets the value of the '{@link Cpacs.RecurringCostType#getOperatorItems <em>Operator Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Items</em>' containment reference.
	 * @see #getOperatorItems()
	 * @generated
	 */
	void setOperatorItems(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Final Assembly</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Assembly</em>' containment reference.
	 * @see #setFinalAssembly(GenericCostType)
	 * @see Cpacs.CpacsPackage#getRecurringCostType_FinalAssembly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='finalAssembly' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getFinalAssembly();

	/**
	 * Sets the value of the '{@link Cpacs.RecurringCostType#getFinalAssembly <em>Final Assembly</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Assembly</em>' containment reference.
	 * @see #getFinalAssembly()
	 * @generated
	 */
	void setFinalAssembly(GenericCostType value);

} // RecurringCostType
