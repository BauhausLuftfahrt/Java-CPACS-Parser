/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StructuralElementsType#getSheetBasedStructuralElements <em>Sheet Based Structural Elements</em>}</li>
 *   <li>{@link Cpacs.StructuralElementsType#getProfileBasedStructuralElements <em>Profile Based Structural Elements</em>}</li>
 *   <li>{@link Cpacs.StructuralElementsType#getStructuralWallElements <em>Structural Wall Elements</em>}</li>
 *   <li>{@link Cpacs.StructuralElementsType#getPressureBulkheads <em>Pressure Bulkheads</em>}</li>
 *   <li>{@link Cpacs.StructuralElementsType#getWindows <em>Windows</em>}</li>
 *   <li>{@link Cpacs.StructuralElementsType#getDoors <em>Doors</em>}</li>
 *   <li>{@link Cpacs.StructuralElementsType#getDoorSurroundStructures <em>Door Surround Structures</em>}</li>
 *   <li>{@link Cpacs.StructuralElementsType#getSeatModules <em>Seat Modules</em>}</li>
 *   <li>{@link Cpacs.StructuralElementsType#getRivets <em>Rivets</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStructuralElementsType()
 * @model extendedMetaData="name='structuralElementsType' kind='elementOnly'"
 * @generated
 */
public interface StructuralElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sheet Based Structural Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sheet Based Structural Elements</em>' containment reference.
	 * @see #setSheetBasedStructuralElements(SheetBasedStructuralElementsType)
	 * @see Cpacs.CpacsPackage#getStructuralElementsType_SheetBasedStructuralElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sheetBasedStructuralElements' namespace='##targetNamespace'"
	 * @generated
	 */
	SheetBasedStructuralElementsType getSheetBasedStructuralElements();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralElementsType#getSheetBasedStructuralElements <em>Sheet Based Structural Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Based Structural Elements</em>' containment reference.
	 * @see #getSheetBasedStructuralElements()
	 * @generated
	 */
	void setSheetBasedStructuralElements(SheetBasedStructuralElementsType value);

	/**
	 * Returns the value of the '<em><b>Profile Based Structural Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Based Structural Elements</em>' containment reference.
	 * @see #setProfileBasedStructuralElements(ProfileBasedStructuralElementsType)
	 * @see Cpacs.CpacsPackage#getStructuralElementsType_ProfileBasedStructuralElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profileBasedStructuralElements' namespace='##targetNamespace'"
	 * @generated
	 */
	ProfileBasedStructuralElementsType getProfileBasedStructuralElements();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralElementsType#getProfileBasedStructuralElements <em>Profile Based Structural Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Based Structural Elements</em>' containment reference.
	 * @see #getProfileBasedStructuralElements()
	 * @generated
	 */
	void setProfileBasedStructuralElements(ProfileBasedStructuralElementsType value);

	/**
	 * Returns the value of the '<em><b>Structural Wall Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Wall Elements</em>' containment reference.
	 * @see #setStructuralWallElements(StructuralWallElementsType)
	 * @see Cpacs.CpacsPackage#getStructuralElementsType_StructuralWallElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralWallElements' namespace='##targetNamespace'"
	 * @generated
	 */
	StructuralWallElementsType getStructuralWallElements();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralElementsType#getStructuralWallElements <em>Structural Wall Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Wall Elements</em>' containment reference.
	 * @see #getStructuralWallElements()
	 * @generated
	 */
	void setStructuralWallElements(StructuralWallElementsType value);

	/**
	 * Returns the value of the '<em><b>Pressure Bulkheads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Bulkheads</em>' containment reference.
	 * @see #setPressureBulkheads(PressureBulkheadsType)
	 * @see Cpacs.CpacsPackage#getStructuralElementsType_PressureBulkheads()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pressureBulkheads' namespace='##targetNamespace'"
	 * @generated
	 */
	PressureBulkheadsType getPressureBulkheads();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralElementsType#getPressureBulkheads <em>Pressure Bulkheads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Bulkheads</em>' containment reference.
	 * @see #getPressureBulkheads()
	 * @generated
	 */
	void setPressureBulkheads(PressureBulkheadsType value);

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' containment reference.
	 * @see #setWindows(WindowsType)
	 * @see Cpacs.CpacsPackage#getStructuralElementsType_Windows()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='windows' namespace='##targetNamespace'"
	 * @generated
	 */
	WindowsType getWindows();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralElementsType#getWindows <em>Windows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Windows</em>' containment reference.
	 * @see #getWindows()
	 * @generated
	 */
	void setWindows(WindowsType value);

	/**
	 * Returns the value of the '<em><b>Doors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors</em>' containment reference.
	 * @see #setDoors(DoorsType)
	 * @see Cpacs.CpacsPackage#getStructuralElementsType_Doors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doors' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorsType getDoors();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralElementsType#getDoors <em>Doors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doors</em>' containment reference.
	 * @see #getDoors()
	 * @generated
	 */
	void setDoors(DoorsType value);

	/**
	 * Returns the value of the '<em><b>Door Surround Structures</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Surround Structures</em>' containment reference.
	 * @see #setDoorSurroundStructures(DoorSurroundStructuresAssemblyType)
	 * @see Cpacs.CpacsPackage#getStructuralElementsType_DoorSurroundStructures()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doorSurroundStructures' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorSurroundStructuresAssemblyType getDoorSurroundStructures();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralElementsType#getDoorSurroundStructures <em>Door Surround Structures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Surround Structures</em>' containment reference.
	 * @see #getDoorSurroundStructures()
	 * @generated
	 */
	void setDoorSurroundStructures(DoorSurroundStructuresAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Seat Modules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seat elements (Deprecation warning: This element will soon be removed from the official CPACS. Use the new seat modules located at cpacs/vehicles/deckElements!)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seat Modules</em>' containment reference.
	 * @see #setSeatModules(SeatModulesType)
	 * @see Cpacs.CpacsPackage#getStructuralElementsType_SeatModules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seatModules' namespace='##targetNamespace'"
	 * @generated
	 */
	SeatModulesType getSeatModules();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralElementsType#getSeatModules <em>Seat Modules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Modules</em>' containment reference.
	 * @see #getSeatModules()
	 * @generated
	 */
	void setSeatModules(SeatModulesType value);

	/**
	 * Returns the value of the '<em><b>Rivets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rivets</em>' containment reference.
	 * @see #setRivets(RivetsType)
	 * @see Cpacs.CpacsPackage#getStructuralElementsType_Rivets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rivets' namespace='##targetNamespace'"
	 * @generated
	 */
	RivetsType getRivets();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralElementsType#getRivets <em>Rivets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rivets</em>' containment reference.
	 * @see #getRivets()
	 * @generated
	 */
	void setRivets(RivetsType value);

} // StructuralElementsType
