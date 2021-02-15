/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSystems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MSystemsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMAuxillaryPowerUnit <em>MAuxillary Power Unit</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMHydraulicGeneration <em>MHydraulic Generation</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMHydraulicDistribution <em>MHydraulic Distribution</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMAirConditioning <em>MAir Conditioning</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMDeIcing <em>MDe Icing</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMFireProtection <em>MFire Protection</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMFlightControls <em>MFlight Controls</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMInstrumentPanel <em>MInstrument Panel</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMAutomaticFlightSystem <em>MAutomatic Flight System</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMCommunication <em>MCommunication</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMElectricalGeneration <em>MElectrical Generation</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMElectricalDistribution <em>MElectrical Distribution</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMIntegratedModularAvionics <em>MIntegrated Modular Avionics</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMMillitarySystems <em>MMillitary Systems</em>}</li>
 *   <li>{@link Cpacs.MSystemsType#getMNavigation <em>MNavigation</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMSystemsType()
 * @model extendedMetaData="name='mSystemsType' kind='elementOnly'"
 * @generated
 */
public interface MSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Systems mass description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MAuxillary Power Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAuxillary Power Unit</em>' containment reference.
	 * @see #setMAuxillaryPowerUnit(MAuxillaryPowerUnitType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MAuxillaryPowerUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mAuxillaryPowerUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	MAuxillaryPowerUnitType getMAuxillaryPowerUnit();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMAuxillaryPowerUnit <em>MAuxillary Power Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MAuxillary Power Unit</em>' containment reference.
	 * @see #getMAuxillaryPowerUnit()
	 * @generated
	 */
	void setMAuxillaryPowerUnit(MAuxillaryPowerUnitType value);

	/**
	 * Returns the value of the '<em><b>MHydraulic Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MHydraulic Generation</em>' containment reference.
	 * @see #setMHydraulicGeneration(MHydraulicGenerationType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MHydraulicGeneration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mHydraulicGeneration' namespace='##targetNamespace'"
	 * @generated
	 */
	MHydraulicGenerationType getMHydraulicGeneration();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMHydraulicGeneration <em>MHydraulic Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MHydraulic Generation</em>' containment reference.
	 * @see #getMHydraulicGeneration()
	 * @generated
	 */
	void setMHydraulicGeneration(MHydraulicGenerationType value);

	/**
	 * Returns the value of the '<em><b>MHydraulic Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MHydraulic Distribution</em>' containment reference.
	 * @see #setMHydraulicDistribution(MHydraulicDistributionType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MHydraulicDistribution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mHydraulicDistribution' namespace='##targetNamespace'"
	 * @generated
	 */
	MHydraulicDistributionType getMHydraulicDistribution();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMHydraulicDistribution <em>MHydraulic Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MHydraulic Distribution</em>' containment reference.
	 * @see #getMHydraulicDistribution()
	 * @generated
	 */
	void setMHydraulicDistribution(MHydraulicDistributionType value);

	/**
	 * Returns the value of the '<em><b>MAir Conditioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAir Conditioning</em>' containment reference.
	 * @see #setMAirConditioning(MAirConditioningType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MAirConditioning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mAirConditioning' namespace='##targetNamespace'"
	 * @generated
	 */
	MAirConditioningType getMAirConditioning();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMAirConditioning <em>MAir Conditioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MAir Conditioning</em>' containment reference.
	 * @see #getMAirConditioning()
	 * @generated
	 */
	void setMAirConditioning(MAirConditioningType value);

	/**
	 * Returns the value of the '<em><b>MDe Icing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDe Icing</em>' containment reference.
	 * @see #setMDeIcing(MDeIcingType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MDeIcing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mDeIcing' namespace='##targetNamespace'"
	 * @generated
	 */
	MDeIcingType getMDeIcing();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMDeIcing <em>MDe Icing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDe Icing</em>' containment reference.
	 * @see #getMDeIcing()
	 * @generated
	 */
	void setMDeIcing(MDeIcingType value);

	/**
	 * Returns the value of the '<em><b>MFire Protection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFire Protection</em>' containment reference.
	 * @see #setMFireProtection(MFireProtectionType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MFireProtection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFireProtection' namespace='##targetNamespace'"
	 * @generated
	 */
	MFireProtectionType getMFireProtection();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMFireProtection <em>MFire Protection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFire Protection</em>' containment reference.
	 * @see #getMFireProtection()
	 * @generated
	 */
	void setMFireProtection(MFireProtectionType value);

	/**
	 * Returns the value of the '<em><b>MFlight Controls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFlight Controls</em>' containment reference.
	 * @see #setMFlightControls(MFlightControlsType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MFlightControls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFlightControls' namespace='##targetNamespace'"
	 * @generated
	 */
	MFlightControlsType getMFlightControls();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMFlightControls <em>MFlight Controls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFlight Controls</em>' containment reference.
	 * @see #getMFlightControls()
	 * @generated
	 */
	void setMFlightControls(MFlightControlsType value);

	/**
	 * Returns the value of the '<em><b>MInstrument Panel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MInstrument Panel</em>' containment reference.
	 * @see #setMInstrumentPanel(MInstrumentPanelType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MInstrumentPanel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mInstrumentPanel' namespace='##targetNamespace'"
	 * @generated
	 */
	MInstrumentPanelType getMInstrumentPanel();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMInstrumentPanel <em>MInstrument Panel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MInstrument Panel</em>' containment reference.
	 * @see #getMInstrumentPanel()
	 * @generated
	 */
	void setMInstrumentPanel(MInstrumentPanelType value);

	/**
	 * Returns the value of the '<em><b>MAutomatic Flight System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAutomatic Flight System</em>' containment reference.
	 * @see #setMAutomaticFlightSystem(MAutomaticFlightSystemType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MAutomaticFlightSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mAutomaticFlightSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	MAutomaticFlightSystemType getMAutomaticFlightSystem();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMAutomaticFlightSystem <em>MAutomatic Flight System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MAutomatic Flight System</em>' containment reference.
	 * @see #getMAutomaticFlightSystem()
	 * @generated
	 */
	void setMAutomaticFlightSystem(MAutomaticFlightSystemType value);

	/**
	 * Returns the value of the '<em><b>MCommunication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCommunication</em>' containment reference.
	 * @see #setMCommunication(MCommunicationType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MCommunication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	MCommunicationType getMCommunication();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMCommunication <em>MCommunication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCommunication</em>' containment reference.
	 * @see #getMCommunication()
	 * @generated
	 */
	void setMCommunication(MCommunicationType value);

	/**
	 * Returns the value of the '<em><b>MElectrical Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MElectrical Generation</em>' containment reference.
	 * @see #setMElectricalGeneration(MElectricalGenerationType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MElectricalGeneration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mElectricalGeneration' namespace='##targetNamespace'"
	 * @generated
	 */
	MElectricalGenerationType getMElectricalGeneration();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMElectricalGeneration <em>MElectrical Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MElectrical Generation</em>' containment reference.
	 * @see #getMElectricalGeneration()
	 * @generated
	 */
	void setMElectricalGeneration(MElectricalGenerationType value);

	/**
	 * Returns the value of the '<em><b>MElectrical Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MElectrical Distribution</em>' containment reference.
	 * @see #setMElectricalDistribution(MElectricalDistributionType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MElectricalDistribution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mElectricalDistribution' namespace='##targetNamespace'"
	 * @generated
	 */
	MElectricalDistributionType getMElectricalDistribution();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMElectricalDistribution <em>MElectrical Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MElectrical Distribution</em>' containment reference.
	 * @see #getMElectricalDistribution()
	 * @generated
	 */
	void setMElectricalDistribution(MElectricalDistributionType value);

	/**
	 * Returns the value of the '<em><b>MIntegrated Modular Avionics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MIntegrated Modular Avionics</em>' containment reference.
	 * @see #setMIntegratedModularAvionics(MIntegratedModularAvionicsType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MIntegratedModularAvionics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mIntegratedModularAvionics' namespace='##targetNamespace'"
	 * @generated
	 */
	MIntegratedModularAvionicsType getMIntegratedModularAvionics();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMIntegratedModularAvionics <em>MIntegrated Modular Avionics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MIntegrated Modular Avionics</em>' containment reference.
	 * @see #getMIntegratedModularAvionics()
	 * @generated
	 */
	void setMIntegratedModularAvionics(MIntegratedModularAvionicsType value);

	/**
	 * Returns the value of the '<em><b>MMillitary Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMillitary Systems</em>' containment reference.
	 * @see #setMMillitarySystems(MMillitarySystemsType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MMillitarySystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mMillitarySystems' namespace='##targetNamespace'"
	 * @generated
	 */
	MMillitarySystemsType getMMillitarySystems();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMMillitarySystems <em>MMillitary Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMillitary Systems</em>' containment reference.
	 * @see #getMMillitarySystems()
	 * @generated
	 */
	void setMMillitarySystems(MMillitarySystemsType value);

	/**
	 * Returns the value of the '<em><b>MNavigation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MNavigation</em>' containment reference.
	 * @see #setMNavigation(MNavigationType)
	 * @see Cpacs.CpacsPackage#getMSystemsType_MNavigation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mNavigation' namespace='##targetNamespace'"
	 * @generated
	 */
	MNavigationType getMNavigation();

	/**
	 * Sets the value of the '{@link Cpacs.MSystemsType#getMNavigation <em>MNavigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MNavigation</em>' containment reference.
	 * @see #getMNavigation()
	 * @generated
	 */
	void setMNavigation(MNavigationType value);

} // MSystemsType
