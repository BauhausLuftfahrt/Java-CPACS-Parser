/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFuselage Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MFuselageStructureType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MFuselageStructureType#getMSkinPanels <em>MSkin Panels</em>}</li>
 *   <li>{@link Cpacs.MFuselageStructureType#getMBulkheads <em>MBulkheads</em>}</li>
 *   <li>{@link Cpacs.MFuselageStructureType#getMWalls <em>MWalls</em>}</li>
 *   <li>{@link Cpacs.MFuselageStructureType#getMDoors <em>MDoors</em>}</li>
 *   <li>{@link Cpacs.MFuselageStructureType#getMWindows <em>MWindows</em>}</li>
 *   <li>{@link Cpacs.MFuselageStructureType#getMCabinFloors <em>MCabin Floors</em>}</li>
 *   <li>{@link Cpacs.MFuselageStructureType#getMCargoFloors <em>MCargo Floors</em>}</li>
 *   <li>{@link Cpacs.MFuselageStructureType#getMSpecialStructures <em>MSpecial Structures</em>}</li>
 *   <li>{@link Cpacs.MFuselageStructureType#getMBellyFairings <em>MBelly Fairings</em>}</li>
 *   <li>{@link Cpacs.MFuselageStructureType#getMStringers <em>MStringers</em>}</li>
 *   <li>{@link Cpacs.MFuselageStructureType#getMFrames <em>MFrames</em>}</li>
 *   <li>{@link Cpacs.MFuselageStructureType#getMMiscellaneous <em>MMiscellaneous</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMFuselageStructureType()
 * @model extendedMetaData="name='mFuselageStructureType' kind='elementOnly'"
 * @generated
 */
public interface MFuselageStructureType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fuselage structure mass description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MSkin Panels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSkin Panels</em>' containment reference.
	 * @see #setMSkinPanels(MSkinPanelsType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MSkinPanels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSkinPanels' namespace='##targetNamespace'"
	 * @generated
	 */
	MSkinPanelsType getMSkinPanels();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMSkinPanels <em>MSkin Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSkin Panels</em>' containment reference.
	 * @see #getMSkinPanels()
	 * @generated
	 */
	void setMSkinPanels(MSkinPanelsType value);

	/**
	 * Returns the value of the '<em><b>MBulkheads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBulkheads</em>' containment reference.
	 * @see #setMBulkheads(MBulkheadsType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MBulkheads()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mBulkheads' namespace='##targetNamespace'"
	 * @generated
	 */
	MBulkheadsType getMBulkheads();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMBulkheads <em>MBulkheads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MBulkheads</em>' containment reference.
	 * @see #getMBulkheads()
	 * @generated
	 */
	void setMBulkheads(MBulkheadsType value);

	/**
	 * Returns the value of the '<em><b>MWalls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWalls</em>' containment reference.
	 * @see #setMWalls(MWallsType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MWalls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mWalls' namespace='##targetNamespace'"
	 * @generated
	 */
	MWallsType getMWalls();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMWalls <em>MWalls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MWalls</em>' containment reference.
	 * @see #getMWalls()
	 * @generated
	 */
	void setMWalls(MWallsType value);

	/**
	 * Returns the value of the '<em><b>MDoors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDoors</em>' containment reference.
	 * @see #setMDoors(MDoorsType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MDoors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mDoors' namespace='##targetNamespace'"
	 * @generated
	 */
	MDoorsType getMDoors();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMDoors <em>MDoors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDoors</em>' containment reference.
	 * @see #getMDoors()
	 * @generated
	 */
	void setMDoors(MDoorsType value);

	/**
	 * Returns the value of the '<em><b>MWindows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWindows</em>' containment reference.
	 * @see #setMWindows(MWindowsType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MWindows()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mWindows' namespace='##targetNamespace'"
	 * @generated
	 */
	MWindowsType getMWindows();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMWindows <em>MWindows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MWindows</em>' containment reference.
	 * @see #getMWindows()
	 * @generated
	 */
	void setMWindows(MWindowsType value);

	/**
	 * Returns the value of the '<em><b>MCabin Floors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCabin Floors</em>' containment reference.
	 * @see #setMCabinFloors(MCabinFloorsType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MCabinFloors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCabinFloors' namespace='##targetNamespace'"
	 * @generated
	 */
	MCabinFloorsType getMCabinFloors();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMCabinFloors <em>MCabin Floors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCabin Floors</em>' containment reference.
	 * @see #getMCabinFloors()
	 * @generated
	 */
	void setMCabinFloors(MCabinFloorsType value);

	/**
	 * Returns the value of the '<em><b>MCargo Floors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCargo Floors</em>' containment reference.
	 * @see #setMCargoFloors(MCargoFloorsType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MCargoFloors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCargoFloors' namespace='##targetNamespace'"
	 * @generated
	 */
	MCargoFloorsType getMCargoFloors();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMCargoFloors <em>MCargo Floors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCargo Floors</em>' containment reference.
	 * @see #getMCargoFloors()
	 * @generated
	 */
	void setMCargoFloors(MCargoFloorsType value);

	/**
	 * Returns the value of the '<em><b>MSpecial Structures</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSpecial Structures</em>' containment reference.
	 * @see #setMSpecialStructures(MSpecialStructuresType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MSpecialStructures()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSpecialStructures' namespace='##targetNamespace'"
	 * @generated
	 */
	MSpecialStructuresType getMSpecialStructures();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMSpecialStructures <em>MSpecial Structures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSpecial Structures</em>' containment reference.
	 * @see #getMSpecialStructures()
	 * @generated
	 */
	void setMSpecialStructures(MSpecialStructuresType value);

	/**
	 * Returns the value of the '<em><b>MBelly Fairings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBelly Fairings</em>' containment reference.
	 * @see #setMBellyFairings(MBellyFairingsType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MBellyFairings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mBellyFairings' namespace='##targetNamespace'"
	 * @generated
	 */
	MBellyFairingsType getMBellyFairings();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMBellyFairings <em>MBelly Fairings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MBelly Fairings</em>' containment reference.
	 * @see #getMBellyFairings()
	 * @generated
	 */
	void setMBellyFairings(MBellyFairingsType value);

	/**
	 * Returns the value of the '<em><b>MStringers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MStringers</em>' containment reference.
	 * @see #setMStringers(MStringersType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MStringers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mStringers' namespace='##targetNamespace'"
	 * @generated
	 */
	MStringersType getMStringers();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMStringers <em>MStringers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MStringers</em>' containment reference.
	 * @see #getMStringers()
	 * @generated
	 */
	void setMStringers(MStringersType value);

	/**
	 * Returns the value of the '<em><b>MFrames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFrames</em>' containment reference.
	 * @see #setMFrames(MFramesType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MFrames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFrames' namespace='##targetNamespace'"
	 * @generated
	 */
	MFramesType getMFrames();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMFrames <em>MFrames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFrames</em>' containment reference.
	 * @see #getMFrames()
	 * @generated
	 */
	void setMFrames(MFramesType value);

	/**
	 * Returns the value of the '<em><b>MMiscellaneous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMiscellaneous</em>' containment reference.
	 * @see #setMMiscellaneous(SingleGenericMassType)
	 * @see Cpacs.CpacsPackage#getMFuselageStructureType_MMiscellaneous()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mMiscellaneous' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleGenericMassType getMMiscellaneous();

	/**
	 * Sets the value of the '{@link Cpacs.MFuselageStructureType#getMMiscellaneous <em>MMiscellaneous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMiscellaneous</em>' containment reference.
	 * @see #getMMiscellaneous()
	 * @generated
	 */
	void setMMiscellaneous(SingleGenericMassType value);

} // MFuselageStructureType
