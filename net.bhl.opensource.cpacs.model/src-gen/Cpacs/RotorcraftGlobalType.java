/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotorcraft Global Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorcraftGlobalType#getPaxSeats <em>Pax Seats</em>}</li>
 *   <li>{@link Cpacs.RotorcraftGlobalType#getCargoCapacity <em>Cargo Capacity</em>}</li>
 *   <li>{@link Cpacs.RotorcraftGlobalType#getMachCruise <em>Mach Cruise</em>}</li>
 *   <li>{@link Cpacs.RotorcraftGlobalType#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorcraftGlobalType()
 * @model extendedMetaData="name='rotorcraftGlobalType' kind='elementOnly'"
 * @generated
 */
public interface RotorcraftGlobalType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Pax Seats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of passenger seats
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pax Seats</em>' containment reference.
	 * @see #setPaxSeats(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getRotorcraftGlobalType_PaxSeats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paxSeats' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getPaxSeats();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftGlobalType#getPaxSeats <em>Pax Seats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pax Seats</em>' containment reference.
	 * @see #getPaxSeats()
	 * @generated
	 */
	void setPaxSeats(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Cargo Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cargo transport capacity [kg]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cargo Capacity</em>' containment reference.
	 * @see #setCargoCapacity(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRotorcraftGlobalType_CargoCapacity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cargoCapacity' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCargoCapacity();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftGlobalType#getCargoCapacity <em>Cargo Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cargo Capacity</em>' containment reference.
	 * @see #getCargoCapacity()
	 * @generated
	 */
	void setCargoCapacity(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Mach Cruise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cruise Mach Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Cruise</em>' containment reference.
	 * @see #setMachCruise(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRotorcraftGlobalType_MachCruise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='machCruise' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMachCruise();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftGlobalType#getMachCruise <em>Mach Cruise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Cruise</em>' containment reference.
	 * @see #getMachCruise()
	 * @generated
	 */
	void setMachCruise(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Configuration of the rotorcraft:
	 *                                 standard(single main rotor, single tail rotor) / tandem /
	 *                                 coaxial/intermeshing / sideBySide/tiltRotor/tiltWing
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRotorcraftGlobalType_Configuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configuration' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getConfiguration();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftGlobalType#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(StringBaseType value);

} // RotorcraftGlobalType
