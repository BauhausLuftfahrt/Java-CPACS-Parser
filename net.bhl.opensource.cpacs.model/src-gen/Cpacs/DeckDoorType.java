/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck Door Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DeckDoorType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.DeckDoorType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.DeckDoorType#getPaxCapacity <em>Pax Capacity</em>}</li>
 *   <li>{@link Cpacs.DeckDoorType#getOpening <em>Opening</em>}</li>
 *   <li>{@link Cpacs.DeckDoorType#getDoorType <em>Door Type</em>}</li>
 *   <li>{@link Cpacs.DeckDoorType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDeckDoorType()
 * @model extendedMetaData="name='deckDoorType' kind='elementOnly'"
 * @generated
 */
public interface DeckDoorType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDeckDoorType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.DeckDoorType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDeckDoorType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.DeckDoorType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Pax Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of passengers this door adds to the
	 *                                 overall exit capacity limit of the aircraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pax Capacity</em>' containment reference.
	 * @see #setPaxCapacity(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getDeckDoorType_PaxCapacity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='paxCapacity' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getPaxCapacity();

	/**
	 * Sets the value of the '{@link Cpacs.DeckDoorType#getPaxCapacity <em>Pax Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pax Capacity</em>' containment reference.
	 * @see #getPaxCapacity()
	 * @generated
	 */
	void setPaxCapacity(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Opening</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opening geometry of the door
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opening</em>' containment reference.
	 * @see #setOpening(DoorOpeningType)
	 * @see Cpacs.CpacsPackage#getDeckDoorType_Opening()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='opening' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorOpeningType getOpening();

	/**
	 * Sets the value of the '{@link Cpacs.DeckDoorType#getOpening <em>Opening</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening</em>' containment reference.
	 * @see #getOpening()
	 * @generated
	 */
	void setOpening(DoorOpeningType value);

	/**
	 * Returns the value of the '<em><b>Door Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Door type (boarding, cargo, evacuation or service)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Door Type</em>' containment reference.
	 * @see #setDoorType(DoorTypeType)
	 * @see Cpacs.CpacsPackage#getDeckDoorType_DoorType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doorType' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorTypeType getDoorType();

	/**
	 * Sets the value of the '{@link Cpacs.DeckDoorType#getDoorType <em>Door Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Type</em>' containment reference.
	 * @see #getDoorType()
	 * @generated
	 */
	void setDoorType(DoorTypeType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getDeckDoorType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.DeckDoorType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // DeckDoorType
