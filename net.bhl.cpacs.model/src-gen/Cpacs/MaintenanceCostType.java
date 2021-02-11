/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maintenance Cost Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MaintenanceCostType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.MaintenanceCostType#getAirframe <em>Airframe</em>}</li>
 *   <li>{@link Cpacs.MaintenanceCostType#getEngine <em>Engine</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMaintenanceCostType()
 * @model extendedMetaData="name='maintenanceCostType' kind='elementOnly'"
 * @generated
 */
public interface MaintenanceCostType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getMaintenanceCostType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MaintenanceCostType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Airframe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airframe</em>' containment reference.
	 * @see #setAirframe(AirframeMaintenanceCostType)
	 * @see Cpacs.CpacsPackage#getMaintenanceCostType_Airframe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airframe' namespace='##targetNamespace'"
	 * @generated
	 */
	AirframeMaintenanceCostType getAirframe();

	/**
	 * Sets the value of the '{@link Cpacs.MaintenanceCostType#getAirframe <em>Airframe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airframe</em>' containment reference.
	 * @see #getAirframe()
	 * @generated
	 */
	void setAirframe(AirframeMaintenanceCostType value);

	/**
	 * Returns the value of the '<em><b>Engine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' containment reference.
	 * @see #setEngine(GenericCostType)
	 * @see Cpacs.CpacsPackage#getMaintenanceCostType_Engine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='engine' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getEngine();

	/**
	 * Sets the value of the '{@link Cpacs.MaintenanceCostType#getEngine <em>Engine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' containment reference.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(GenericCostType value);

} // MaintenanceCostType
