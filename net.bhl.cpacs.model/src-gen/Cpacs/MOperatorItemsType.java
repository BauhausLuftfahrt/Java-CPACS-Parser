/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MOperator Items Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MOperatorItemsType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MOperatorItemsType#getMDocumentsTools <em>MDocuments Tools</em>}</li>
 *   <li>{@link Cpacs.MOperatorItemsType#getMFixedGalleys <em>MFixed Galleys</em>}</li>
 *   <li>{@link Cpacs.MOperatorItemsType#getMSeats <em>MSeats</em>}</li>
 *   <li>{@link Cpacs.MOperatorItemsType#getMIFEs <em>MIF Es</em>}</li>
 *   <li>{@link Cpacs.MOperatorItemsType#getMEmergencyEquipments <em>MEmergency Equipments</em>}</li>
 *   <li>{@link Cpacs.MOperatorItemsType#getMCaterings <em>MCaterings</em>}</li>
 *   <li>{@link Cpacs.MOperatorItemsType#getMCrewMembers <em>MCrew Members</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMOperatorItemsType()
 * @model extendedMetaData="name='mOperatorItemsType' kind='elementOnly'"
 * @generated
 */
public interface MOperatorItemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operator items mass description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMOperatorItemsType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MOperatorItemsType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MDocuments Tools</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MDocuments Tools</em>' containment reference.
	 * @see #setMDocumentsTools(MDocumentsToolsType)
	 * @see Cpacs.CpacsPackage#getMOperatorItemsType_MDocumentsTools()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mDocumentsTools' namespace='##targetNamespace'"
	 * @generated
	 */
	MDocumentsToolsType getMDocumentsTools();

	/**
	 * Sets the value of the '{@link Cpacs.MOperatorItemsType#getMDocumentsTools <em>MDocuments Tools</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDocuments Tools</em>' containment reference.
	 * @see #getMDocumentsTools()
	 * @generated
	 */
	void setMDocumentsTools(MDocumentsToolsType value);

	/**
	 * Returns the value of the '<em><b>MFixed Galleys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFixed Galleys</em>' containment reference.
	 * @see #setMFixedGalleys(MFixedGalleysType)
	 * @see Cpacs.CpacsPackage#getMOperatorItemsType_MFixedGalleys()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFixedGalleys' namespace='##targetNamespace'"
	 * @generated
	 */
	MFixedGalleysType getMFixedGalleys();

	/**
	 * Sets the value of the '{@link Cpacs.MOperatorItemsType#getMFixedGalleys <em>MFixed Galleys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFixed Galleys</em>' containment reference.
	 * @see #getMFixedGalleys()
	 * @generated
	 */
	void setMFixedGalleys(MFixedGalleysType value);

	/**
	 * Returns the value of the '<em><b>MSeats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSeats</em>' containment reference.
	 * @see #setMSeats(MSeatsType)
	 * @see Cpacs.CpacsPackage#getMOperatorItemsType_MSeats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mSeats' namespace='##targetNamespace'"
	 * @generated
	 */
	MSeatsType getMSeats();

	/**
	 * Sets the value of the '{@link Cpacs.MOperatorItemsType#getMSeats <em>MSeats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSeats</em>' containment reference.
	 * @see #getMSeats()
	 * @generated
	 */
	void setMSeats(MSeatsType value);

	/**
	 * Returns the value of the '<em><b>MIF Es</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MIF Es</em>' containment reference.
	 * @see #setMIFEs(MIFESystemsType)
	 * @see Cpacs.CpacsPackage#getMOperatorItemsType_MIFEs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mIFEs' namespace='##targetNamespace'"
	 * @generated
	 */
	MIFESystemsType getMIFEs();

	/**
	 * Sets the value of the '{@link Cpacs.MOperatorItemsType#getMIFEs <em>MIF Es</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MIF Es</em>' containment reference.
	 * @see #getMIFEs()
	 * @generated
	 */
	void setMIFEs(MIFESystemsType value);

	/**
	 * Returns the value of the '<em><b>MEmergency Equipments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MEmergency Equipments</em>' containment reference.
	 * @see #setMEmergencyEquipments(MEmergencyEquipmentsType)
	 * @see Cpacs.CpacsPackage#getMOperatorItemsType_MEmergencyEquipments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mEmergencyEquipments' namespace='##targetNamespace'"
	 * @generated
	 */
	MEmergencyEquipmentsType getMEmergencyEquipments();

	/**
	 * Sets the value of the '{@link Cpacs.MOperatorItemsType#getMEmergencyEquipments <em>MEmergency Equipments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MEmergency Equipments</em>' containment reference.
	 * @see #getMEmergencyEquipments()
	 * @generated
	 */
	void setMEmergencyEquipments(MEmergencyEquipmentsType value);

	/**
	 * Returns the value of the '<em><b>MCaterings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCaterings</em>' containment reference.
	 * @see #setMCaterings(MCateringsType)
	 * @see Cpacs.CpacsPackage#getMOperatorItemsType_MCaterings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCaterings' namespace='##targetNamespace'"
	 * @generated
	 */
	MCateringsType getMCaterings();

	/**
	 * Sets the value of the '{@link Cpacs.MOperatorItemsType#getMCaterings <em>MCaterings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCaterings</em>' containment reference.
	 * @see #getMCaterings()
	 * @generated
	 */
	void setMCaterings(MCateringsType value);

	/**
	 * Returns the value of the '<em><b>MCrew Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCrew Members</em>' containment reference.
	 * @see #setMCrewMembers(MCrewMembersType)
	 * @see Cpacs.CpacsPackage#getMOperatorItemsType_MCrewMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCrewMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	MCrewMembersType getMCrewMembers();

	/**
	 * Sets the value of the '{@link Cpacs.MOperatorItemsType#getMCrewMembers <em>MCrew Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCrew Members</em>' containment reference.
	 * @see #getMCrewMembers()
	 * @generated
	 */
	void setMCrewMembers(MCrewMembersType value);

} // MOperatorItemsType
