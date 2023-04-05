/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPower Units Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MPowerUnitsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MPowerUnitsType#getMEngines <em>MEngines</em>}</li>
 *   <li>{@link Cpacs.MPowerUnitsType#getMBleedAirSystem <em>MBleed Air System</em>}</li>
 *   <li>{@link Cpacs.MPowerUnitsType#getMEngineControl <em>MEngine Control</em>}</li>
 *   <li>{@link Cpacs.MPowerUnitsType#getMFuelSystem <em>MFuel System</em>}</li>
 *   <li>{@link Cpacs.MPowerUnitsType#getMInterGasSystem <em>MInter Gas System</em>}</li>
 *   <li>{@link Cpacs.MPowerUnitsType#getMMiscellaneous <em>MMiscellaneous</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMPowerUnitsType()
 * @model extendedMetaData="name='mPowerUnitsType' kind='elementOnly'"
 * @generated
 */
public interface MPowerUnitsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Power units mass description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMPowerUnitsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MPowerUnitsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MEngines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEngines</em>' containment reference.
	 * @see #setMEngines(MEquippedEnginesType)
	 * @see Cpacs.CpacsPackage#getMPowerUnitsType_MEngines()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mEngines' namespace='##targetNamespace'"
	 * @generated
	 */
	MEquippedEnginesType getMEngines();

	/**
	 * Sets the value of the '{@link Cpacs.MPowerUnitsType#getMEngines <em>MEngines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEngines</em>' containment reference.
	 * @see #getMEngines()
	 * @generated
	 */
	void setMEngines(MEquippedEnginesType value);

	/**
	 * Returns the value of the '<em><b>MBleed Air System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MBleed Air System</em>' containment reference.
	 * @see #setMBleedAirSystem(MBleedAirSystemType)
	 * @see Cpacs.CpacsPackage#getMPowerUnitsType_MBleedAirSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mBleedAirSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	MBleedAirSystemType getMBleedAirSystem();

	/**
	 * Sets the value of the '{@link Cpacs.MPowerUnitsType#getMBleedAirSystem <em>MBleed Air System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MBleed Air System</em>' containment reference.
	 * @see #getMBleedAirSystem()
	 * @generated
	 */
	void setMBleedAirSystem(MBleedAirSystemType value);

	/**
	 * Returns the value of the '<em><b>MEngine Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEngine Control</em>' containment reference.
	 * @see #setMEngineControl(MEngineControlType)
	 * @see Cpacs.CpacsPackage#getMPowerUnitsType_MEngineControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mEngineControl' namespace='##targetNamespace'"
	 * @generated
	 */
	MEngineControlType getMEngineControl();

	/**
	 * Sets the value of the '{@link Cpacs.MPowerUnitsType#getMEngineControl <em>MEngine Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEngine Control</em>' containment reference.
	 * @see #getMEngineControl()
	 * @generated
	 */
	void setMEngineControl(MEngineControlType value);

	/**
	 * Returns the value of the '<em><b>MFuel System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFuel System</em>' containment reference.
	 * @see #setMFuelSystem(MFuelSystemType)
	 * @see Cpacs.CpacsPackage#getMPowerUnitsType_MFuelSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFuelSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	MFuelSystemType getMFuelSystem();

	/**
	 * Sets the value of the '{@link Cpacs.MPowerUnitsType#getMFuelSystem <em>MFuel System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFuel System</em>' containment reference.
	 * @see #getMFuelSystem()
	 * @generated
	 */
	void setMFuelSystem(MFuelSystemType value);

	/**
	 * Returns the value of the '<em><b>MInter Gas System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MInter Gas System</em>' containment reference.
	 * @see #setMInterGasSystem(MInterGasSystemType)
	 * @see Cpacs.CpacsPackage#getMPowerUnitsType_MInterGasSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mInterGasSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	MInterGasSystemType getMInterGasSystem();

	/**
	 * Sets the value of the '{@link Cpacs.MPowerUnitsType#getMInterGasSystem <em>MInter Gas System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MInter Gas System</em>' containment reference.
	 * @see #getMInterGasSystem()
	 * @generated
	 */
	void setMInterGasSystem(MInterGasSystemType value);

	/**
	 * Returns the value of the '<em><b>MMiscellaneous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMiscellaneous</em>' containment reference.
	 * @see #setMMiscellaneous(SingleGenericMassType)
	 * @see Cpacs.CpacsPackage#getMPowerUnitsType_MMiscellaneous()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mMiscellaneous' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleGenericMassType getMMiscellaneous();

	/**
	 * Sets the value of the '{@link Cpacs.MPowerUnitsType#getMMiscellaneous <em>MMiscellaneous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMiscellaneous</em>' containment reference.
	 * @see #getMMiscellaneous()
	 * @generated
	 */
	void setMMiscellaneous(SingleGenericMassType value);

} // MPowerUnitsType
