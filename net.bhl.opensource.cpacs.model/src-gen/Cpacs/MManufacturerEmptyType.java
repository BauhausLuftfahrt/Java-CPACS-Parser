/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MManufacturer Empty Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MManufacturerEmptyType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MManufacturerEmptyType#getMStructure <em>MStructure</em>}</li>
 *   <li>{@link Cpacs.MManufacturerEmptyType#getMPowerUnits <em>MPower Units</em>}</li>
 *   <li>{@link Cpacs.MManufacturerEmptyType#getMSystems <em>MSystems</em>}</li>
 *   <li>{@link Cpacs.MManufacturerEmptyType#getMFurnishing <em>MFurnishing</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMManufacturerEmptyType()
 * @model extendedMetaData="name='mManufacturerEmptyType' kind='elementOnly'"
 * @generated
 */
public interface MManufacturerEmptyType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer empty mass description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMManufacturerEmptyType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MManufacturerEmptyType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MStructure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MStructure</em>' containment reference.
	 * @see #setMStructure(MStructureType)
	 * @see Cpacs.CpacsPackage#getMManufacturerEmptyType_MStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	MStructureType getMStructure();

	/**
	 * Sets the value of the '{@link Cpacs.MManufacturerEmptyType#getMStructure <em>MStructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MStructure</em>' containment reference.
	 * @see #getMStructure()
	 * @generated
	 */
	void setMStructure(MStructureType value);

	/**
	 * Returns the value of the '<em><b>MPower Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPower Units</em>' containment reference.
	 * @see #setMPowerUnits(MPowerUnitsType)
	 * @see Cpacs.CpacsPackage#getMManufacturerEmptyType_MPowerUnits()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mPowerUnits' namespace='##targetNamespace'"
	 * @generated
	 */
	MPowerUnitsType getMPowerUnits();

	/**
	 * Sets the value of the '{@link Cpacs.MManufacturerEmptyType#getMPowerUnits <em>MPower Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPower Units</em>' containment reference.
	 * @see #getMPowerUnits()
	 * @generated
	 */
	void setMPowerUnits(MPowerUnitsType value);

	/**
	 * Returns the value of the '<em><b>MSystems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSystems</em>' containment reference.
	 * @see #setMSystems(MSystemsType)
	 * @see Cpacs.CpacsPackage#getMManufacturerEmptyType_MSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	MSystemsType getMSystems();

	/**
	 * Sets the value of the '{@link Cpacs.MManufacturerEmptyType#getMSystems <em>MSystems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSystems</em>' containment reference.
	 * @see #getMSystems()
	 * @generated
	 */
	void setMSystems(MSystemsType value);

	/**
	 * Returns the value of the '<em><b>MFurnishing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFurnishing</em>' containment reference.
	 * @see #setMFurnishing(MFurnishingType)
	 * @see Cpacs.CpacsPackage#getMManufacturerEmptyType_MFurnishing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFurnishing' namespace='##targetNamespace'"
	 * @generated
	 */
	MFurnishingType getMFurnishing();

	/**
	 * Sets the value of the '{@link Cpacs.MManufacturerEmptyType#getMFurnishing <em>MFurnishing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFurnishing</em>' containment reference.
	 * @see #getMFurnishing()
	 * @generated
	 */
	void setMFurnishing(MFurnishingType value);

} // MManufacturerEmptyType
