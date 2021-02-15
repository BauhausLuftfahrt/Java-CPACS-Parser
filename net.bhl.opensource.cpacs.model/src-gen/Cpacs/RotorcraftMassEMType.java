/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotorcraft Mass EM Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorcraftMassEMType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.RotorcraftMassEMType#getMStructure <em>MStructure</em>}</li>
 *   <li>{@link Cpacs.RotorcraftMassEMType#getMPropulsion <em>MPropulsion</em>}</li>
 *   <li>{@link Cpacs.RotorcraftMassEMType#getMSystemsAndEquipment <em>MSystems And Equipment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorcraftMassEMType()
 * @model extendedMetaData="name='rotorcraftMassEMType' kind='elementOnly'"
 * @generated
 */
public interface RotorcraftMassEMType extends ComplexBaseType {
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
	 * @see Cpacs.CpacsPackage#getRotorcraftMassEMType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftMassEMType#getMassDescription <em>Mass Description</em>}' containment reference.
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
	 * @see #setMStructure(RotorcraftMassGroupLevel1Type)
	 * @see Cpacs.CpacsPackage#getRotorcraftMassEMType_MStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorcraftMassGroupLevel1Type getMStructure();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftMassEMType#getMStructure <em>MStructure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MStructure</em>' containment reference.
	 * @see #getMStructure()
	 * @generated
	 */
	void setMStructure(RotorcraftMassGroupLevel1Type value);

	/**
	 * Returns the value of the '<em><b>MPropulsion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPropulsion</em>' containment reference.
	 * @see #setMPropulsion(RotorcraftMassGroupLevel1Type)
	 * @see Cpacs.CpacsPackage#getRotorcraftMassEMType_MPropulsion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mPropulsion' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorcraftMassGroupLevel1Type getMPropulsion();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftMassEMType#getMPropulsion <em>MPropulsion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPropulsion</em>' containment reference.
	 * @see #getMPropulsion()
	 * @generated
	 */
	void setMPropulsion(RotorcraftMassGroupLevel1Type value);

	/**
	 * Returns the value of the '<em><b>MSystems And Equipment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSystems And Equipment</em>' containment reference.
	 * @see #setMSystemsAndEquipment(RotorcraftMassGroupLevel1Type)
	 * @see Cpacs.CpacsPackage#getRotorcraftMassEMType_MSystemsAndEquipment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSystemsAndEquipment' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorcraftMassGroupLevel1Type getMSystemsAndEquipment();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftMassEMType#getMSystemsAndEquipment <em>MSystems And Equipment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSystems And Equipment</em>' containment reference.
	 * @see #getMSystemsAndEquipment()
	 * @generated
	 */
	void setMSystemsAndEquipment(RotorcraftMassGroupLevel1Type value);

} // RotorcraftMassEMType
