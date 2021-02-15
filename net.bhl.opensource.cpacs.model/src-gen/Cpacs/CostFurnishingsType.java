/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Furnishings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostFurnishingsType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostFurnishingsType#getFurnishingElements <em>Furnishing Elements</em>}</li>
 *   <li>{@link Cpacs.CostFurnishingsType#getFixedEmergencyOxygenSystems <em>Fixed Emergency Oxygen Systems</em>}</li>
 *   <li>{@link Cpacs.CostFurnishingsType#getLightingSystems <em>Lighting Systems</em>}</li>
 *   <li>{@link Cpacs.CostFurnishingsType#getWaterInstallationSystems <em>Water Installation Systems</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostFurnishingsType()
 * @model extendedMetaData="name='costFurnishingsType' kind='elementOnly'"
 * @generated
 */
public interface CostFurnishingsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostFurnishingsType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostFurnishingsType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Furnishing Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Furnishing Elements</em>' containment reference.
	 * @see #setFurnishingElements(CostFurnishingElementsType)
	 * @see Cpacs.CpacsPackage#getCostFurnishingsType_FurnishingElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='furnishingElements' namespace='##targetNamespace'"
	 * @generated
	 */
	CostFurnishingElementsType getFurnishingElements();

	/**
	 * Sets the value of the '{@link Cpacs.CostFurnishingsType#getFurnishingElements <em>Furnishing Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Furnishing Elements</em>' containment reference.
	 * @see #getFurnishingElements()
	 * @generated
	 */
	void setFurnishingElements(CostFurnishingElementsType value);

	/**
	 * Returns the value of the '<em><b>Fixed Emergency Oxygen Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Emergency Oxygen Systems</em>' containment reference.
	 * @see #setFixedEmergencyOxygenSystems(CostFixedEmergencyOxygenSystemsType)
	 * @see Cpacs.CpacsPackage#getCostFurnishingsType_FixedEmergencyOxygenSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedEmergencyOxygenSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostFixedEmergencyOxygenSystemsType getFixedEmergencyOxygenSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostFurnishingsType#getFixedEmergencyOxygenSystems <em>Fixed Emergency Oxygen Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Emergency Oxygen Systems</em>' containment reference.
	 * @see #getFixedEmergencyOxygenSystems()
	 * @generated
	 */
	void setFixedEmergencyOxygenSystems(CostFixedEmergencyOxygenSystemsType value);

	/**
	 * Returns the value of the '<em><b>Lighting Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lighting Systems</em>' containment reference.
	 * @see #setLightingSystems(CostLightingSystemsType)
	 * @see Cpacs.CpacsPackage#getCostFurnishingsType_LightingSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lightingSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostLightingSystemsType getLightingSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostFurnishingsType#getLightingSystems <em>Lighting Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lighting Systems</em>' containment reference.
	 * @see #getLightingSystems()
	 * @generated
	 */
	void setLightingSystems(CostLightingSystemsType value);

	/**
	 * Returns the value of the '<em><b>Water Installation Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Installation Systems</em>' containment reference.
	 * @see #setWaterInstallationSystems(CostWaterInstallationSystemsType)
	 * @see Cpacs.CpacsPackage#getCostFurnishingsType_WaterInstallationSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='waterInstallationSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostWaterInstallationSystemsType getWaterInstallationSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostFurnishingsType#getWaterInstallationSystems <em>Water Installation Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Installation Systems</em>' containment reference.
	 * @see #getWaterInstallationSystems()
	 * @generated
	 */
	void setWaterInstallationSystems(CostWaterInstallationSystemsType value);

} // CostFurnishingsType
