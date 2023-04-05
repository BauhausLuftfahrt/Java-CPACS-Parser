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
 *   <li>{@link Cpacs.DeckType#getFloorStructureUID <em>Floor Structure UID</em>}</li>
 *   <li>{@link Cpacs.DeckType#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.DeckType#getDeckType <em>Deck Type</em>}</li>
 *   <li>{@link Cpacs.DeckType#getCabinGeometry <em>Cabin Geometry</em>}</li>
 *   <li>{@link Cpacs.DeckType#getSeatModules <em>Seat Modules</em>}</li>
 *   <li>{@link Cpacs.DeckType#getAisles <em>Aisles</em>}</li>
 *   <li>{@link Cpacs.DeckType#getSpaces <em>Spaces</em>}</li>
 *   <li>{@link Cpacs.DeckType#getSidewallPanels <em>Sidewall Panels</em>}</li>
 *   <li>{@link Cpacs.DeckType#getLuggageCompartments <em>Luggage Compartments</em>}</li>
 *   <li>{@link Cpacs.DeckType#getCeilingPanels <em>Ceiling Panels</em>}</li>
 *   <li>{@link Cpacs.DeckType#getGalleys <em>Galleys</em>}</li>
 *   <li>{@link Cpacs.DeckType#getGenericFloorModules <em>Generic Floor Modules</em>}</li>
 *   <li>{@link Cpacs.DeckType#getLavatories <em>Lavatories</em>}</li>
 *   <li>{@link Cpacs.DeckType#getClassDividers <em>Class Dividers</em>}</li>
 *   <li>{@link Cpacs.DeckType#getCargoContainers <em>Cargo Containers</em>}</li>
 *   <li>{@link Cpacs.DeckType#getDeckDoors <em>Deck Doors</em>}</li>
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
	 * Name
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
	 * Description
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
	 * <!-- begin-model-doc -->
	 * UID of the object used as parent coordinate system (typically the fuselage uID)
	 * <!-- end-model-doc -->
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
	 * Returns the value of the '<em><b>Floor Structure UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the floor structure which supports this deck
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Floor Structure UID</em>' containment reference.
	 * @see #setFloorStructureUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getDeckType_FloorStructureUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='floorStructureUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFloorStructureUID();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getFloorStructureUID <em>Floor Structure UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor Structure UID</em>' containment reference.
	 * @see #getFloorStructureUID()
	 * @generated
	 */
	void setFloorStructureUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference point of the deck/cabin. In a
	 *                                 conventional aircraft like the A320, it would be the rear wall
	 *                                 of the cockpit. The transformation is relative to the parent object
	 *                                 defined by “parentUID”, which should be the fuselage.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(TransformationType)
	 * @see Cpacs.CpacsPackage#getDeckType_Transformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationType getTransformation();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(TransformationType value);

	/**
	 * Returns the value of the '<em><b>Deck Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deck type: passanger, VIP, cargo or livestock
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deck Type</em>' containment reference.
	 * @see #setDeckType(DeckTypeType)
	 * @see Cpacs.CpacsPackage#getDeckType_DeckType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deckType' namespace='##targetNamespace'"
	 * @generated
	 */
	DeckTypeType getDeckType();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getDeckType <em>Deck Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deck Type</em>' containment reference.
	 * @see #getDeckType()
	 * @generated
	 */
	void setDeckType(DeckTypeType value);

	/**
	 * Returns the value of the '<em><b>Cabin Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cabin Geometry</em>' containment reference.
	 * @see #setCabinGeometry(CabinGeometryType)
	 * @see Cpacs.CpacsPackage#getDeckType_CabinGeometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cabinGeometry' namespace='##targetNamespace'"
	 * @generated
	 */
	CabinGeometryType getCabinGeometry();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getCabinGeometry <em>Cabin Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cabin Geometry</em>' containment reference.
	 * @see #getCabinGeometry()
	 * @generated
	 */
	void setCabinGeometry(CabinGeometryType value);

	/**
	 * Returns the value of the '<em><b>Seat Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seat modules
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seat Modules</em>' containment reference.
	 * @see #setSeatModules(SeatModulesType)
	 * @see Cpacs.CpacsPackage#getDeckType_SeatModules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seatModules' namespace='##targetNamespace'"
	 * @generated
	 */
	SeatModulesType getSeatModules();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getSeatModules <em>Seat Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Modules</em>' containment reference.
	 * @see #getSeatModules()
	 * @generated
	 */
	void setSeatModules(SeatModulesType value);

	/**
	 * Returns the value of the '<em><b>Aisles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aisles
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Spaces
	 * <!-- end-model-doc -->
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
	 * Returns the value of the '<em><b>Sidewall Panels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sidewall panels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sidewall Panels</em>' containment reference.
	 * @see #setSidewallPanels(SidewallPanelsType)
	 * @see Cpacs.CpacsPackage#getDeckType_SidewallPanels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sidewallPanels' namespace='##targetNamespace'"
	 * @generated
	 */
	SidewallPanelsType getSidewallPanels();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getSidewallPanels <em>Sidewall Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sidewall Panels</em>' containment reference.
	 * @see #getSidewallPanels()
	 * @generated
	 */
	void setSidewallPanels(SidewallPanelsType value);

	/**
	 * Returns the value of the '<em><b>Luggage Compartments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Luggage compartments
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Luggage Compartments</em>' containment reference.
	 * @see #setLuggageCompartments(LuggageCompartmentsType)
	 * @see Cpacs.CpacsPackage#getDeckType_LuggageCompartments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='luggageCompartments' namespace='##targetNamespace'"
	 * @generated
	 */
	LuggageCompartmentsType getLuggageCompartments();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getLuggageCompartments <em>Luggage Compartments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luggage Compartments</em>' containment reference.
	 * @see #getLuggageCompartments()
	 * @generated
	 */
	void setLuggageCompartments(LuggageCompartmentsType value);

	/**
	 * Returns the value of the '<em><b>Ceiling Panels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ceiling panels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ceiling Panels</em>' containment reference.
	 * @see #setCeilingPanels(CeilingPanelsType)
	 * @see Cpacs.CpacsPackage#getDeckType_CeilingPanels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ceilingPanels' namespace='##targetNamespace'"
	 * @generated
	 */
	CeilingPanelsType getCeilingPanels();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getCeilingPanels <em>Ceiling Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling Panels</em>' containment reference.
	 * @see #getCeilingPanels()
	 * @generated
	 */
	void setCeilingPanels(CeilingPanelsType value);

	/**
	 * Returns the value of the '<em><b>Galleys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Galleys
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Galleys</em>' containment reference.
	 * @see #setGalleys(GalleysType)
	 * @see Cpacs.CpacsPackage#getDeckType_Galleys()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='galleys' namespace='##targetNamespace'"
	 * @generated
	 */
	GalleysType getGalleys();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getGalleys <em>Galleys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Galleys</em>' containment reference.
	 * @see #getGalleys()
	 * @generated
	 */
	void setGalleys(GalleysType value);

	/**
	 * Returns the value of the '<em><b>Generic Floor Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generic floor modules
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generic Floor Modules</em>' containment reference.
	 * @see #setGenericFloorModules(GenericFloorModulesType)
	 * @see Cpacs.CpacsPackage#getDeckType_GenericFloorModules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genericFloorModules' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericFloorModulesType getGenericFloorModules();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getGenericFloorModules <em>Generic Floor Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Floor Modules</em>' containment reference.
	 * @see #getGenericFloorModules()
	 * @generated
	 */
	void setGenericFloorModules(GenericFloorModulesType value);

	/**
	 * Returns the value of the '<em><b>Lavatories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lavatories
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lavatories</em>' containment reference.
	 * @see #setLavatories(LavatoriesType)
	 * @see Cpacs.CpacsPackage#getDeckType_Lavatories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lavatories' namespace='##targetNamespace'"
	 * @generated
	 */
	LavatoriesType getLavatories();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getLavatories <em>Lavatories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lavatories</em>' containment reference.
	 * @see #getLavatories()
	 * @generated
	 */
	void setLavatories(LavatoriesType value);

	/**
	 * Returns the value of the '<em><b>Class Dividers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class dividers
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Dividers</em>' containment reference.
	 * @see #setClassDividers(ClassDividersType)
	 * @see Cpacs.CpacsPackage#getDeckType_ClassDividers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classDividers' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassDividersType getClassDividers();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getClassDividers <em>Class Dividers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Dividers</em>' containment reference.
	 * @see #getClassDividers()
	 * @generated
	 */
	void setClassDividers(ClassDividersType value);

	/**
	 * Returns the value of the '<em><b>Cargo Containers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cargo containers
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cargo Containers</em>' containment reference.
	 * @see #setCargoContainers(CargoContainersType)
	 * @see Cpacs.CpacsPackage#getDeckType_CargoContainers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cargoContainers' namespace='##targetNamespace'"
	 * @generated
	 */
	CargoContainersType getCargoContainers();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getCargoContainers <em>Cargo Containers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cargo Containers</em>' containment reference.
	 * @see #getCargoContainers()
	 * @generated
	 */
	void setCargoContainers(CargoContainersType value);

	/**
	 * Returns the value of the '<em><b>Deck Doors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Doors
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deck Doors</em>' containment reference.
	 * @see #setDeckDoors(DeckDoorsType)
	 * @see Cpacs.CpacsPackage#getDeckType_DeckDoors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deckDoors' namespace='##targetNamespace'"
	 * @generated
	 */
	DeckDoorsType getDeckDoors();

	/**
	 * Sets the value of the '{@link Cpacs.DeckType#getDeckDoors <em>Deck Doors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deck Doors</em>' containment reference.
	 * @see #getDeckDoors()
	 * @generated
	 */
	void setDeckDoors(DeckDoorsType value);

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
