/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostSystemsType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostSystemsType#getAuxilaryPowerUnits <em>Auxilary Power Units</em>}</li>
 *   <li>{@link Cpacs.CostSystemsType#getHydraulicSystems <em>Hydraulic Systems</em>}</li>
 *   <li>{@link Cpacs.CostSystemsType#getAirConditioningSystems <em>Air Conditioning Systems</em>}</li>
 *   <li>{@link Cpacs.CostSystemsType#getDeIcingSystems <em>De Icing Systems</em>}</li>
 *   <li>{@link Cpacs.CostSystemsType#getFireProtectionSystems <em>Fire Protection Systems</em>}</li>
 *   <li>{@link Cpacs.CostSystemsType#getFlightControlSystems <em>Flight Control Systems</em>}</li>
 *   <li>{@link Cpacs.CostSystemsType#getInstrumentSystems <em>Instrument Systems</em>}</li>
 *   <li>{@link Cpacs.CostSystemsType#getAutomaticFlightSystems <em>Automatic Flight Systems</em>}</li>
 *   <li>{@link Cpacs.CostSystemsType#getNavigationSystems <em>Navigation Systems</em>}</li>
 *   <li>{@link Cpacs.CostSystemsType#getCommunicationSystems <em>Communication Systems</em>}</li>
 *   <li>{@link Cpacs.CostSystemsType#getElectricalSystems <em>Electrical Systems</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostSystemsType()
 * @model extendedMetaData="name='costSystemsType' kind='elementOnly'"
 * @generated
 */
public interface CostSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostSystemsType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostSystemsType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Auxilary Power Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxilary Power Units</em>' containment reference.
	 * @see #setAuxilaryPowerUnits(CostAuxilaryPowerUnitsType)
	 * @see Cpacs.CpacsPackage#getCostSystemsType_AuxilaryPowerUnits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='auxilaryPowerUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	CostAuxilaryPowerUnitsType getAuxilaryPowerUnits();

	/**
	 * Sets the value of the '{@link Cpacs.CostSystemsType#getAuxilaryPowerUnits <em>Auxilary Power Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auxilary Power Units</em>' containment reference.
	 * @see #getAuxilaryPowerUnits()
	 * @generated
	 */
	void setAuxilaryPowerUnits(CostAuxilaryPowerUnitsType value);

	/**
	 * Returns the value of the '<em><b>Hydraulic Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydraulic Systems</em>' containment reference.
	 * @see #setHydraulicSystems(CostHydraulicSystemsType)
	 * @see Cpacs.CpacsPackage#getCostSystemsType_HydraulicSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hydraulicSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostHydraulicSystemsType getHydraulicSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostSystemsType#getHydraulicSystems <em>Hydraulic Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydraulic Systems</em>' containment reference.
	 * @see #getHydraulicSystems()
	 * @generated
	 */
	void setHydraulicSystems(CostHydraulicSystemsType value);

	/**
	 * Returns the value of the '<em><b>Air Conditioning Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Air Conditioning Systems</em>' containment reference.
	 * @see #setAirConditioningSystems(CostAirConditioningSystemsType)
	 * @see Cpacs.CpacsPackage#getCostSystemsType_AirConditioningSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airConditioningSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostAirConditioningSystemsType getAirConditioningSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostSystemsType#getAirConditioningSystems <em>Air Conditioning Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Conditioning Systems</em>' containment reference.
	 * @see #getAirConditioningSystems()
	 * @generated
	 */
	void setAirConditioningSystems(CostAirConditioningSystemsType value);

	/**
	 * Returns the value of the '<em><b>De Icing Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>De Icing Systems</em>' containment reference.
	 * @see #setDeIcingSystems(CostDeIcingSystemsType)
	 * @see Cpacs.CpacsPackage#getCostSystemsType_DeIcingSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deIcingSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostDeIcingSystemsType getDeIcingSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostSystemsType#getDeIcingSystems <em>De Icing Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>De Icing Systems</em>' containment reference.
	 * @see #getDeIcingSystems()
	 * @generated
	 */
	void setDeIcingSystems(CostDeIcingSystemsType value);

	/**
	 * Returns the value of the '<em><b>Fire Protection Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fire Protection Systems</em>' containment reference.
	 * @see #setFireProtectionSystems(CostFireProtectionSystemsType)
	 * @see Cpacs.CpacsPackage#getCostSystemsType_FireProtectionSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fireProtectionSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostFireProtectionSystemsType getFireProtectionSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostSystemsType#getFireProtectionSystems <em>Fire Protection Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fire Protection Systems</em>' containment reference.
	 * @see #getFireProtectionSystems()
	 * @generated
	 */
	void setFireProtectionSystems(CostFireProtectionSystemsType value);

	/**
	 * Returns the value of the '<em><b>Flight Control Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Control Systems</em>' containment reference.
	 * @see #setFlightControlSystems(CostFlightControlSystemsType)
	 * @see Cpacs.CpacsPackage#getCostSystemsType_FlightControlSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightControlSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostFlightControlSystemsType getFlightControlSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostSystemsType#getFlightControlSystems <em>Flight Control Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Control Systems</em>' containment reference.
	 * @see #getFlightControlSystems()
	 * @generated
	 */
	void setFlightControlSystems(CostFlightControlSystemsType value);

	/**
	 * Returns the value of the '<em><b>Instrument Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrument Systems</em>' containment reference.
	 * @see #setInstrumentSystems(CostInstrumentSystemsType)
	 * @see Cpacs.CpacsPackage#getCostSystemsType_InstrumentSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instrumentSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostInstrumentSystemsType getInstrumentSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostSystemsType#getInstrumentSystems <em>Instrument Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instrument Systems</em>' containment reference.
	 * @see #getInstrumentSystems()
	 * @generated
	 */
	void setInstrumentSystems(CostInstrumentSystemsType value);

	/**
	 * Returns the value of the '<em><b>Automatic Flight Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Flight Systems</em>' containment reference.
	 * @see #setAutomaticFlightSystems(CostAutomaticFlightSystemsType)
	 * @see Cpacs.CpacsPackage#getCostSystemsType_AutomaticFlightSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='automaticFlightSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostAutomaticFlightSystemsType getAutomaticFlightSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostSystemsType#getAutomaticFlightSystems <em>Automatic Flight Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Flight Systems</em>' containment reference.
	 * @see #getAutomaticFlightSystems()
	 * @generated
	 */
	void setAutomaticFlightSystems(CostAutomaticFlightSystemsType value);

	/**
	 * Returns the value of the '<em><b>Navigation Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Systems</em>' containment reference.
	 * @see #setNavigationSystems(CostNavigationSystemsType)
	 * @see Cpacs.CpacsPackage#getCostSystemsType_NavigationSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='navigationSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostNavigationSystemsType getNavigationSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostSystemsType#getNavigationSystems <em>Navigation Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Systems</em>' containment reference.
	 * @see #getNavigationSystems()
	 * @generated
	 */
	void setNavigationSystems(CostNavigationSystemsType value);

	/**
	 * Returns the value of the '<em><b>Communication Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Systems</em>' containment reference.
	 * @see #setCommunicationSystems(CostCommunicationSystemsType)
	 * @see Cpacs.CpacsPackage#getCostSystemsType_CommunicationSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='communicationSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostCommunicationSystemsType getCommunicationSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostSystemsType#getCommunicationSystems <em>Communication Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Systems</em>' containment reference.
	 * @see #getCommunicationSystems()
	 * @generated
	 */
	void setCommunicationSystems(CostCommunicationSystemsType value);

	/**
	 * Returns the value of the '<em><b>Electrical Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Systems</em>' containment reference.
	 * @see #setElectricalSystems(CostElectricalSystemsType)
	 * @see Cpacs.CpacsPackage#getCostSystemsType_ElectricalSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='electricalSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	CostElectricalSystemsType getElectricalSystems();

	/**
	 * Sets the value of the '{@link Cpacs.CostSystemsType#getElectricalSystems <em>Electrical Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electrical Systems</em>' containment reference.
	 * @see #getElectricalSystems()
	 * @generated
	 */
	void setElectricalSystems(CostElectricalSystemsType value);

} // CostSystemsType
