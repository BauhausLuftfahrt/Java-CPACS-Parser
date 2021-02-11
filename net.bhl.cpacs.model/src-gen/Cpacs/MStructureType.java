/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MStructure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MStructureType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MStructureType#getMWingsStructure <em>MWings Structure</em>}</li>
 *   <li>{@link Cpacs.MStructureType#getMFuselagesStructure <em>MFuselages Structure</em>}</li>
 *   <li>{@link Cpacs.MStructureType#getMLandingGears <em>MLanding Gears</em>}</li>
 *   <li>{@link Cpacs.MStructureType#getMPylons <em>MPylons</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMStructureType()
 * @model extendedMetaData="name='mStructureType' kind='elementOnly'"
 * @generated
 */
public interface MStructureType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structure mass description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMStructureType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MStructureType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MWings Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWings Structure</em>' containment reference.
	 * @see #setMWingsStructure(MWingsStructureType)
	 * @see Cpacs.CpacsPackage#getMStructureType_MWingsStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mWingsStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	MWingsStructureType getMWingsStructure();

	/**
	 * Sets the value of the '{@link Cpacs.MStructureType#getMWingsStructure <em>MWings Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MWings Structure</em>' containment reference.
	 * @see #getMWingsStructure()
	 * @generated
	 */
	void setMWingsStructure(MWingsStructureType value);

	/**
	 * Returns the value of the '<em><b>MFuselages Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFuselages Structure</em>' containment reference.
	 * @see #setMFuselagesStructure(MFuselagesStructureType)
	 * @see Cpacs.CpacsPackage#getMStructureType_MFuselagesStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFuselagesStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	MFuselagesStructureType getMFuselagesStructure();

	/**
	 * Sets the value of the '{@link Cpacs.MStructureType#getMFuselagesStructure <em>MFuselages Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFuselages Structure</em>' containment reference.
	 * @see #getMFuselagesStructure()
	 * @generated
	 */
	void setMFuselagesStructure(MFuselagesStructureType value);

	/**
	 * Returns the value of the '<em><b>MLanding Gears</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLanding Gears</em>' containment reference.
	 * @see #setMLandingGears(MLandingGearsType)
	 * @see Cpacs.CpacsPackage#getMStructureType_MLandingGears()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mLandingGears' namespace='##targetNamespace'"
	 * @generated
	 */
	MLandingGearsType getMLandingGears();

	/**
	 * Sets the value of the '{@link Cpacs.MStructureType#getMLandingGears <em>MLanding Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MLanding Gears</em>' containment reference.
	 * @see #getMLandingGears()
	 * @generated
	 */
	void setMLandingGears(MLandingGearsType value);

	/**
	 * Returns the value of the '<em><b>MPylons</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPylons</em>' containment reference.
	 * @see #setMPylons(MPylonsType)
	 * @see Cpacs.CpacsPackage#getMStructureType_MPylons()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mPylons' namespace='##targetNamespace'"
	 * @generated
	 */
	MPylonsType getMPylons();

	/**
	 * Sets the value of the '{@link Cpacs.MStructureType#getMPylons <em>MPylons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPylons</em>' containment reference.
	 * @see #getMPylons()
	 * @generated
	 */
	void setMPylons(MPylonsType value);

} // MStructureType
