/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFurnishing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MFurnishingType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMInsulations <em>MInsulations</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMLinings <em>MLinings</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMCrewSeats <em>MCrew Seats</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMPartStowDoors <em>MPart Stow Doors</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMLavatories <em>MLavatories</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMOverheadBins <em>MOverhead Bins</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMFloorCoverings <em>MFloor Coverings</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMCargoLinings <em>MCargo Linings</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMCargoLoadings <em>MCargo Loadings</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMEmergencyOxygenSystems <em>MEmergency Oxygen Systems</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMCockpitLightings <em>MCockpit Lightings</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMCabinLightings <em>MCabin Lightings</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMExtLightings <em>MExt Lightings</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMWasteWaterSystems <em>MWaste Water Systems</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMFreshWaterSystems <em>MFresh Water Systems</em>}</li>
 *   <li>{@link Cpacs.MFurnishingType#getMVacuumWasteSystems <em>MVacuum Waste Systems</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMFurnishingType()
 * @model extendedMetaData="name='mFurnishingType' kind='elementOnly'"
 * @generated
 */
public interface MFurnishingType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Furnishing mass description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MInsulations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MInsulations</em>' containment reference.
	 * @see #setMInsulations(MInsulationsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MInsulations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mInsulations' namespace='##targetNamespace'"
	 * @generated
	 */
	MInsulationsType getMInsulations();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMInsulations <em>MInsulations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MInsulations</em>' containment reference.
	 * @see #getMInsulations()
	 * @generated
	 */
	void setMInsulations(MInsulationsType value);

	/**
	 * Returns the value of the '<em><b>MLinings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLinings</em>' containment reference.
	 * @see #setMLinings(MLiningsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MLinings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mLinings' namespace='##targetNamespace'"
	 * @generated
	 */
	MLiningsType getMLinings();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMLinings <em>MLinings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MLinings</em>' containment reference.
	 * @see #getMLinings()
	 * @generated
	 */
	void setMLinings(MLiningsType value);

	/**
	 * Returns the value of the '<em><b>MCrew Seats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCrew Seats</em>' containment reference.
	 * @see #setMCrewSeats(MCrewSeatsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MCrewSeats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCrewSeats' namespace='##targetNamespace'"
	 * @generated
	 */
	MCrewSeatsType getMCrewSeats();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMCrewSeats <em>MCrew Seats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCrew Seats</em>' containment reference.
	 * @see #getMCrewSeats()
	 * @generated
	 */
	void setMCrewSeats(MCrewSeatsType value);

	/**
	 * Returns the value of the '<em><b>MPart Stow Doors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPart Stow Doors</em>' containment reference.
	 * @see #setMPartStowDoors(MPartStowDoorsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MPartStowDoors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mPartStowDoors' namespace='##targetNamespace'"
	 * @generated
	 */
	MPartStowDoorsType getMPartStowDoors();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMPartStowDoors <em>MPart Stow Doors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPart Stow Doors</em>' containment reference.
	 * @see #getMPartStowDoors()
	 * @generated
	 */
	void setMPartStowDoors(MPartStowDoorsType value);

	/**
	 * Returns the value of the '<em><b>MLavatories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLavatories</em>' containment reference.
	 * @see #setMLavatories(MLavatoriesType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MLavatories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mLavatories' namespace='##targetNamespace'"
	 * @generated
	 */
	MLavatoriesType getMLavatories();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMLavatories <em>MLavatories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MLavatories</em>' containment reference.
	 * @see #getMLavatories()
	 * @generated
	 */
	void setMLavatories(MLavatoriesType value);

	/**
	 * Returns the value of the '<em><b>MOverhead Bins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MOverhead Bins</em>' containment reference.
	 * @see #setMOverheadBins(MOverheadBinsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MOverheadBins()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mOverheadBins' namespace='##targetNamespace'"
	 * @generated
	 */
	MOverheadBinsType getMOverheadBins();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMOverheadBins <em>MOverhead Bins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MOverhead Bins</em>' containment reference.
	 * @see #getMOverheadBins()
	 * @generated
	 */
	void setMOverheadBins(MOverheadBinsType value);

	/**
	 * Returns the value of the '<em><b>MFloor Coverings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFloor Coverings</em>' containment reference.
	 * @see #setMFloorCoverings(MFloorCoveringsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MFloorCoverings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFloorCoverings' namespace='##targetNamespace'"
	 * @generated
	 */
	MFloorCoveringsType getMFloorCoverings();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMFloorCoverings <em>MFloor Coverings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFloor Coverings</em>' containment reference.
	 * @see #getMFloorCoverings()
	 * @generated
	 */
	void setMFloorCoverings(MFloorCoveringsType value);

	/**
	 * Returns the value of the '<em><b>MCargo Linings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCargo Linings</em>' containment reference.
	 * @see #setMCargoLinings(MCargoLiningsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MCargoLinings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCargoLinings' namespace='##targetNamespace'"
	 * @generated
	 */
	MCargoLiningsType getMCargoLinings();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMCargoLinings <em>MCargo Linings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCargo Linings</em>' containment reference.
	 * @see #getMCargoLinings()
	 * @generated
	 */
	void setMCargoLinings(MCargoLiningsType value);

	/**
	 * Returns the value of the '<em><b>MCargo Loadings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCargo Loadings</em>' containment reference.
	 * @see #setMCargoLoadings(MCargoLoadingsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MCargoLoadings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCargoLoadings' namespace='##targetNamespace'"
	 * @generated
	 */
	MCargoLoadingsType getMCargoLoadings();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMCargoLoadings <em>MCargo Loadings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCargo Loadings</em>' containment reference.
	 * @see #getMCargoLoadings()
	 * @generated
	 */
	void setMCargoLoadings(MCargoLoadingsType value);

	/**
	 * Returns the value of the '<em><b>MEmergency Oxygen Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEmergency Oxygen Systems</em>' containment reference.
	 * @see #setMEmergencyOxygenSystems(MEmergencyOxygenSystemsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MEmergencyOxygenSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mEmergencyOxygenSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	MEmergencyOxygenSystemsType getMEmergencyOxygenSystems();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMEmergencyOxygenSystems <em>MEmergency Oxygen Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEmergency Oxygen Systems</em>' containment reference.
	 * @see #getMEmergencyOxygenSystems()
	 * @generated
	 */
	void setMEmergencyOxygenSystems(MEmergencyOxygenSystemsType value);

	/**
	 * Returns the value of the '<em><b>MCockpit Lightings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCockpit Lightings</em>' containment reference.
	 * @see #setMCockpitLightings(MCockpitLightingsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MCockpitLightings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCockpitLightings' namespace='##targetNamespace'"
	 * @generated
	 */
	MCockpitLightingsType getMCockpitLightings();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMCockpitLightings <em>MCockpit Lightings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCockpit Lightings</em>' containment reference.
	 * @see #getMCockpitLightings()
	 * @generated
	 */
	void setMCockpitLightings(MCockpitLightingsType value);

	/**
	 * Returns the value of the '<em><b>MCabin Lightings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCabin Lightings</em>' containment reference.
	 * @see #setMCabinLightings(MCabinLightingsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MCabinLightings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCabinLightings' namespace='##targetNamespace'"
	 * @generated
	 */
	MCabinLightingsType getMCabinLightings();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMCabinLightings <em>MCabin Lightings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCabin Lightings</em>' containment reference.
	 * @see #getMCabinLightings()
	 * @generated
	 */
	void setMCabinLightings(MCabinLightingsType value);

	/**
	 * Returns the value of the '<em><b>MExt Lightings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MExt Lightings</em>' containment reference.
	 * @see #setMExtLightings(MExtLightingsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MExtLightings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mExtLightings' namespace='##targetNamespace'"
	 * @generated
	 */
	MExtLightingsType getMExtLightings();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMExtLightings <em>MExt Lightings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MExt Lightings</em>' containment reference.
	 * @see #getMExtLightings()
	 * @generated
	 */
	void setMExtLightings(MExtLightingsType value);

	/**
	 * Returns the value of the '<em><b>MWaste Water Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWaste Water Systems</em>' containment reference.
	 * @see #setMWasteWaterSystems(MWasteWaterSystemsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MWasteWaterSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mWasteWaterSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	MWasteWaterSystemsType getMWasteWaterSystems();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMWasteWaterSystems <em>MWaste Water Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MWaste Water Systems</em>' containment reference.
	 * @see #getMWasteWaterSystems()
	 * @generated
	 */
	void setMWasteWaterSystems(MWasteWaterSystemsType value);

	/**
	 * Returns the value of the '<em><b>MFresh Water Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFresh Water Systems</em>' containment reference.
	 * @see #setMFreshWaterSystems(MFreshWaterSystemsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MFreshWaterSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFreshWaterSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	MFreshWaterSystemsType getMFreshWaterSystems();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMFreshWaterSystems <em>MFresh Water Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFresh Water Systems</em>' containment reference.
	 * @see #getMFreshWaterSystems()
	 * @generated
	 */
	void setMFreshWaterSystems(MFreshWaterSystemsType value);

	/**
	 * Returns the value of the '<em><b>MVacuum Waste Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MVacuum Waste Systems</em>' containment reference.
	 * @see #setMVacuumWasteSystems(MVacuumWasteSystemsType)
	 * @see Cpacs.CpacsPackage#getMFurnishingType_MVacuumWasteSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mVacuumWasteSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	MVacuumWasteSystemsType getMVacuumWasteSystems();

	/**
	 * Sets the value of the '{@link Cpacs.MFurnishingType#getMVacuumWasteSystems <em>MVacuum Waste Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MVacuum Waste Systems</em>' containment reference.
	 * @see #getMVacuumWasteSystems()
	 * @generated
	 */
	void setMVacuumWasteSystems(MVacuumWasteSystemsType value);

} // MFurnishingType
