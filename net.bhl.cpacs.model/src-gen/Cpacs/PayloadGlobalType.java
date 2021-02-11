/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payload Global Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PayloadGlobalType#getPaxSeats <em>Pax Seats</em>}</li>
 *   <li>{@link Cpacs.PayloadGlobalType#getCargoCapacity <em>Cargo Capacity</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPayloadGlobalType()
 * @model extendedMetaData="name='payloadGlobalType' kind='elementOnly'"
 * @generated
 */
public interface PayloadGlobalType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Pax Seats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pax Seats</em>' containment reference.
	 * @see #setPaxSeats(RequirementType)
	 * @see Cpacs.CpacsPackage#getPayloadGlobalType_PaxSeats()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paxSeats' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getPaxSeats();

	/**
	 * Sets the value of the '{@link Cpacs.PayloadGlobalType#getPaxSeats <em>Pax Seats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pax Seats</em>' containment reference.
	 * @see #getPaxSeats()
	 * @generated
	 */
	void setPaxSeats(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Cargo Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargo Capacity</em>' containment reference.
	 * @see #setCargoCapacity(RequirementType)
	 * @see Cpacs.CpacsPackage#getPayloadGlobalType_CargoCapacity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cargoCapacity' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getCargoCapacity();

	/**
	 * Sets the value of the '{@link Cpacs.PayloadGlobalType#getCargoCapacity <em>Cargo Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cargo Capacity</em>' containment reference.
	 * @see #getCargoCapacity()
	 * @generated
	 */
	void setCargoCapacity(RequirementType value);

} // PayloadGlobalType
