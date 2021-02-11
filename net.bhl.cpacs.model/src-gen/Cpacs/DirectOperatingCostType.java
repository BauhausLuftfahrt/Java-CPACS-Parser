/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Operating Cost Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DirectOperatingCostType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.DirectOperatingCostType#getFuel <em>Fuel</em>}</li>
 *   <li>{@link Cpacs.DirectOperatingCostType#getCharges <em>Charges</em>}</li>
 *   <li>{@link Cpacs.DirectOperatingCostType#getMaintenance <em>Maintenance</em>}</li>
 *   <li>{@link Cpacs.DirectOperatingCostType#getCrew <em>Crew</em>}</li>
 *   <li>{@link Cpacs.DirectOperatingCostType#getDepreciation <em>Depreciation</em>}</li>
 *   <li>{@link Cpacs.DirectOperatingCostType#getInsurance <em>Insurance</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDirectOperatingCostType()
 * @model extendedMetaData="name='directOperatingCostType' kind='elementOnly'"
 * @generated
 */
public interface DirectOperatingCostType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getDirectOperatingCostType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.DirectOperatingCostType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Fuel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel</em>' containment reference.
	 * @see #setFuel(GenericCostType)
	 * @see Cpacs.CpacsPackage#getDirectOperatingCostType_Fuel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuel' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getFuel();

	/**
	 * Sets the value of the '{@link Cpacs.DirectOperatingCostType#getFuel <em>Fuel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel</em>' containment reference.
	 * @see #getFuel()
	 * @generated
	 */
	void setFuel(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Charges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charges</em>' containment reference.
	 * @see #setCharges(ChargesCostType)
	 * @see Cpacs.CpacsPackage#getDirectOperatingCostType_Charges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='charges' namespace='##targetNamespace'"
	 * @generated
	 */
	ChargesCostType getCharges();

	/**
	 * Sets the value of the '{@link Cpacs.DirectOperatingCostType#getCharges <em>Charges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charges</em>' containment reference.
	 * @see #getCharges()
	 * @generated
	 */
	void setCharges(ChargesCostType value);

	/**
	 * Returns the value of the '<em><b>Maintenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintenance</em>' containment reference.
	 * @see #setMaintenance(MaintenanceCostType)
	 * @see Cpacs.CpacsPackage#getDirectOperatingCostType_Maintenance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maintenance' namespace='##targetNamespace'"
	 * @generated
	 */
	MaintenanceCostType getMaintenance();

	/**
	 * Sets the value of the '{@link Cpacs.DirectOperatingCostType#getMaintenance <em>Maintenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintenance</em>' containment reference.
	 * @see #getMaintenance()
	 * @generated
	 */
	void setMaintenance(MaintenanceCostType value);

	/**
	 * Returns the value of the '<em><b>Crew</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crew</em>' containment reference.
	 * @see #setCrew(CrewCostType)
	 * @see Cpacs.CpacsPackage#getDirectOperatingCostType_Crew()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='crew' namespace='##targetNamespace'"
	 * @generated
	 */
	CrewCostType getCrew();

	/**
	 * Sets the value of the '{@link Cpacs.DirectOperatingCostType#getCrew <em>Crew</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crew</em>' containment reference.
	 * @see #getCrew()
	 * @generated
	 */
	void setCrew(CrewCostType value);

	/**
	 * Returns the value of the '<em><b>Depreciation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depreciation</em>' containment reference.
	 * @see #setDepreciation(GenericCostType)
	 * @see Cpacs.CpacsPackage#getDirectOperatingCostType_Depreciation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='depreciation' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getDepreciation();

	/**
	 * Sets the value of the '{@link Cpacs.DirectOperatingCostType#getDepreciation <em>Depreciation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depreciation</em>' containment reference.
	 * @see #getDepreciation()
	 * @generated
	 */
	void setDepreciation(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Insurance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance</em>' containment reference.
	 * @see #setInsurance(GenericCostType)
	 * @see Cpacs.CpacsPackage#getDirectOperatingCostType_Insurance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='insurance' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getInsurance();

	/**
	 * Sets the value of the '{@link Cpacs.DirectOperatingCostType#getInsurance <em>Insurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance</em>' containment reference.
	 * @see #getInsurance()
	 * @generated
	 */
	void setInsurance(GenericCostType value);

} // DirectOperatingCostType
