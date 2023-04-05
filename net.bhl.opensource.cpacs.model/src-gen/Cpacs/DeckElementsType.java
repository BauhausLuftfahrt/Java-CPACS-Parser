/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DeckElementsType#getCeilingPanelElements <em>Ceiling Panel Elements</em>}</li>
 *   <li>{@link Cpacs.DeckElementsType#getClassDividerElements <em>Class Divider Elements</em>}</li>
 *   <li>{@link Cpacs.DeckElementsType#getGalleyElements <em>Galley Elements</em>}</li>
 *   <li>{@link Cpacs.DeckElementsType#getGenericFloorElements <em>Generic Floor Elements</em>}</li>
 *   <li>{@link Cpacs.DeckElementsType#getLavatoryElements <em>Lavatory Elements</em>}</li>
 *   <li>{@link Cpacs.DeckElementsType#getLuggageCompartmentElements <em>Luggage Compartment Elements</em>}</li>
 *   <li>{@link Cpacs.DeckElementsType#getSeatElements <em>Seat Elements</em>}</li>
 *   <li>{@link Cpacs.DeckElementsType#getSidewallPanelElements <em>Sidewall Panel Elements</em>}</li>
 *   <li>{@link Cpacs.DeckElementsType#getCargoContainerElements <em>Cargo Container Elements</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDeckElementsType()
 * @model extendedMetaData="name='deckElementsType' kind='elementOnly'"
 * @generated
 */
public interface DeckElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Ceiling Panel Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ceiling panel elements for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ceiling Panel Elements</em>' containment reference.
	 * @see #setCeilingPanelElements(CeilingPanelElementsType)
	 * @see Cpacs.CpacsPackage#getDeckElementsType_CeilingPanelElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ceilingPanelElements' namespace='##targetNamespace'"
	 * @generated
	 */
	CeilingPanelElementsType getCeilingPanelElements();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementsType#getCeilingPanelElements <em>Ceiling Panel Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ceiling Panel Elements</em>' containment reference.
	 * @see #getCeilingPanelElements()
	 * @generated
	 */
	void setCeilingPanelElements(CeilingPanelElementsType value);

	/**
	 * Returns the value of the '<em><b>Class Divider Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class divider elements for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Divider Elements</em>' containment reference.
	 * @see #setClassDividerElements(ClassDividerElementsType)
	 * @see Cpacs.CpacsPackage#getDeckElementsType_ClassDividerElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classDividerElements' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassDividerElementsType getClassDividerElements();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementsType#getClassDividerElements <em>Class Divider Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Divider Elements</em>' containment reference.
	 * @see #getClassDividerElements()
	 * @generated
	 */
	void setClassDividerElements(ClassDividerElementsType value);

	/**
	 * Returns the value of the '<em><b>Galley Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Galley elements for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Galley Elements</em>' containment reference.
	 * @see #setGalleyElements(GalleyElementsType)
	 * @see Cpacs.CpacsPackage#getDeckElementsType_GalleyElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='galleyElements' namespace='##targetNamespace'"
	 * @generated
	 */
	GalleyElementsType getGalleyElements();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementsType#getGalleyElements <em>Galley Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Galley Elements</em>' containment reference.
	 * @see #getGalleyElements()
	 * @generated
	 */
	void setGalleyElements(GalleyElementsType value);

	/**
	 * Returns the value of the '<em><b>Generic Floor Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generic floor elements for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generic Floor Elements</em>' containment reference.
	 * @see #setGenericFloorElements(GenericFloorElementsType)
	 * @see Cpacs.CpacsPackage#getDeckElementsType_GenericFloorElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genericFloorElements' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericFloorElementsType getGenericFloorElements();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementsType#getGenericFloorElements <em>Generic Floor Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Floor Elements</em>' containment reference.
	 * @see #getGenericFloorElements()
	 * @generated
	 */
	void setGenericFloorElements(GenericFloorElementsType value);

	/**
	 * Returns the value of the '<em><b>Lavatory Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lavatory elements for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lavatory Elements</em>' containment reference.
	 * @see #setLavatoryElements(LavatoryElementsType)
	 * @see Cpacs.CpacsPackage#getDeckElementsType_LavatoryElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lavatoryElements' namespace='##targetNamespace'"
	 * @generated
	 */
	LavatoryElementsType getLavatoryElements();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementsType#getLavatoryElements <em>Lavatory Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lavatory Elements</em>' containment reference.
	 * @see #getLavatoryElements()
	 * @generated
	 */
	void setLavatoryElements(LavatoryElementsType value);

	/**
	 * Returns the value of the '<em><b>Luggage Compartment Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Luggage compartment elements for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Luggage Compartment Elements</em>' containment reference.
	 * @see #setLuggageCompartmentElements(LuggageCompartmentElementsType)
	 * @see Cpacs.CpacsPackage#getDeckElementsType_LuggageCompartmentElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='luggageCompartmentElements' namespace='##targetNamespace'"
	 * @generated
	 */
	LuggageCompartmentElementsType getLuggageCompartmentElements();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementsType#getLuggageCompartmentElements <em>Luggage Compartment Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luggage Compartment Elements</em>' containment reference.
	 * @see #getLuggageCompartmentElements()
	 * @generated
	 */
	void setLuggageCompartmentElements(LuggageCompartmentElementsType value);

	/**
	 * Returns the value of the '<em><b>Seat Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seat elements for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seat Elements</em>' containment reference.
	 * @see #setSeatElements(SeatElementsType)
	 * @see Cpacs.CpacsPackage#getDeckElementsType_SeatElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seatElements' namespace='##targetNamespace'"
	 * @generated
	 */
	SeatElementsType getSeatElements();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementsType#getSeatElements <em>Seat Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Elements</em>' containment reference.
	 * @see #getSeatElements()
	 * @generated
	 */
	void setSeatElements(SeatElementsType value);

	/**
	 * Returns the value of the '<em><b>Sidewall Panel Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sidewall panel elements for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sidewall Panel Elements</em>' containment reference.
	 * @see #setSidewallPanelElements(SidewallPanelElementsType)
	 * @see Cpacs.CpacsPackage#getDeckElementsType_SidewallPanelElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sidewallPanelElements' namespace='##targetNamespace'"
	 * @generated
	 */
	SidewallPanelElementsType getSidewallPanelElements();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementsType#getSidewallPanelElements <em>Sidewall Panel Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sidewall Panel Elements</em>' containment reference.
	 * @see #getSidewallPanelElements()
	 * @generated
	 */
	void setSidewallPanelElements(SidewallPanelElementsType value);

	/**
	 * Returns the value of the '<em><b>Cargo Container Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cargo container elements for use in the decks
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cargo Container Elements</em>' containment reference.
	 * @see #setCargoContainerElements(CargoContainerElementsType)
	 * @see Cpacs.CpacsPackage#getDeckElementsType_CargoContainerElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cargoContainerElements' namespace='##targetNamespace'"
	 * @generated
	 */
	CargoContainerElementsType getCargoContainerElements();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementsType#getCargoContainerElements <em>Cargo Container Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cargo Container Elements</em>' containment reference.
	 * @see #getCargoContainerElements()
	 * @generated
	 */
	void setCargoContainerElements(CargoContainerElementsType value);

} // DeckElementsType
