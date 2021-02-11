/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DeckType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.DeckType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.DeckType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.DeckType#getX0 <em>X0</em>}</li>
 *   <li>{@link Cpacs.DeckType#getZ0 <em>Z0</em>}</li>
 *   <li>{@link Cpacs.DeckType#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.DeckType#getCabGeometry <em>Cab Geometry</em>}</li>
 *   <li>{@link Cpacs.DeckType#getAisles <em>Aisles</em>}</li>
 *   <li>{@link Cpacs.DeckType#getSpaces <em>Spaces</em>}</li>
 *   <li>{@link Cpacs.DeckType#getDoors <em>Doors</em>}</li>
 *   <li>{@link Cpacs.DeckType#getSeatElements <em>Seat Elements</em>}</li>
 *   <li>{@link Cpacs.DeckType#getFloorElements <em>Floor Elements</em>}</li>
 *   <li>{@link Cpacs.DeckType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDeckType()
 * @model extendedMetaData="name='deckType' kind='elementOnly'"
 * @generated
 */
public interface DeckType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the deck
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDeckType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getName <em>Name</em>}' containment reference.
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
	 * Description of the deck
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDeckType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Parent UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent UID</em>' containment reference.
	 * @see #setParentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getDeckType_ParentUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getParentUID <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent UID</em>' containment reference.
	 * @see #getParentUID()
	 * @generated
	 */
	void setParentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>X0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The starting point of the deck/cabin. In a
	 *                                 conventional aircraft like the A320, it would be the rear wall
	 *                                 of the cockpit. The coordinate is relative to the parent object
	 *                                 defined by “parentUID”, which should be the fuselage.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X0</em>' containment reference.
	 * @see #setX0(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDeckType_X0()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='x0' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getX0();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getX0 <em>X0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X0</em>' containment reference.
	 * @see #getX0()
	 * @generated
	 */
	void setX0(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Z0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The starting point of the deck/cabin. In a
	 *                                 conventional aircraft like the A320, it would be the rear wall
	 *                                 of the cockpit. The coordinate is relative to the parent object
	 *                                 defined by “parentUID”, which should be the fuselage.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z0</em>' containment reference.
	 * @see #setZ0(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDeckType_Z0()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z0' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZ0();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getZ0 <em>Z0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z0</em>' containment reference.
	 * @see #getZ0()
	 * @generated
	 */
	void setZ0(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeType7)
	 * @see Cpacs.CpacsPackage#getDeckType_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType7 getType();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType7 value);

	/**
	 * Returns the value of the '<em><b>Cab Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cab Geometry</em>' containment reference.
	 * @see #setCabGeometry(CabGeometryType)
	 * @see Cpacs.CpacsPackage#getDeckType_CabGeometry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cabGeometry' namespace='##targetNamespace'"
	 * @generated
	 */
	CabGeometryType getCabGeometry();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getCabGeometry <em>Cab Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cab Geometry</em>' containment reference.
	 * @see #getCabGeometry()
	 * @generated
	 */
	void setCabGeometry(CabGeometryType value);

	/**
	 * Returns the value of the '<em><b>Aisles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aisles</em>' containment reference.
	 * @see #setAisles(CabinAislesType)
	 * @see Cpacs.CpacsPackage#getDeckType_Aisles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aisles' namespace='##targetNamespace'"
	 * @generated
	 */
	CabinAislesType getAisles();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getAisles <em>Aisles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aisles</em>' containment reference.
	 * @see #getAisles()
	 * @generated
	 */
	void setAisles(CabinAislesType value);

	/**
	 * Returns the value of the '<em><b>Spaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spaces</em>' containment reference.
	 * @see #setSpaces(CabinSpacesType)
	 * @see Cpacs.CpacsPackage#getDeckType_Spaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spaces' namespace='##targetNamespace'"
	 * @generated
	 */
	CabinSpacesType getSpaces();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getSpaces <em>Spaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spaces</em>' containment reference.
	 * @see #getSpaces()
	 * @generated
	 */
	void setSpaces(CabinSpacesType value);

	/**
	 * Returns the value of the '<em><b>Doors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors</em>' containment reference.
	 * @see #setDoors(CabinDoorsType)
	 * @see Cpacs.CpacsPackage#getDeckType_Doors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doors' namespace='##targetNamespace'"
	 * @generated
	 */
	CabinDoorsType getDoors();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getDoors <em>Doors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doors</em>' containment reference.
	 * @see #getDoors()
	 * @generated
	 */
	void setDoors(CabinDoorsType value);

	/**
	 * Returns the value of the '<em><b>Seat Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Elements</em>' containment reference.
	 * @see #setSeatElements(CabinSeatElementsType)
	 * @see Cpacs.CpacsPackage#getDeckType_SeatElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seatElements' namespace='##targetNamespace'"
	 * @generated
	 */
	CabinSeatElementsType getSeatElements();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getSeatElements <em>Seat Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Elements</em>' containment reference.
	 * @see #getSeatElements()
	 * @generated
	 */
	void setSeatElements(CabinSeatElementsType value);

	/**
	 * Returns the value of the '<em><b>Floor Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor Elements</em>' containment reference.
	 * @see #setFloorElements(CabinFloorElementsType)
	 * @see Cpacs.CpacsPackage#getDeckType_FloorElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='floorElements' namespace='##targetNamespace'"
	 * @generated
	 */
	CabinFloorElementsType getFloorElements();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getFloorElements <em>Floor Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor Elements</em>' containment reference.
	 * @see #getFloorElements()
	 * @generated
	 */
	void setFloorElements(CabinFloorElementsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getDeckType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // DeckType
