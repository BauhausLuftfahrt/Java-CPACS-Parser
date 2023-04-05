/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Opening Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DoorOpeningType#getCutOutUID <em>Cut Out UID</em>}</li>
 *   <li>{@link Cpacs.DoorOpeningType#getDoorOpeningLegacy <em>Door Opening Legacy</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDoorOpeningType()
 * @model extendedMetaData="name='doorOpeningType' kind='elementOnly'"
 * @generated
 */
public interface DoorOpeningType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cut Out UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cut Out UID</em>' containment reference.
	 * @see #setCutOutUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getDoorOpeningType_CutOutUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cutOutUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getCutOutUID();

	/**
	 * Sets the value of the '{@link Cpacs.DoorOpeningType#getCutOutUID <em>Cut Out UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Out UID</em>' containment reference.
	 * @see #getCutOutUID()
	 * @generated
	 */
	void setCutOutUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Door Opening Legacy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Opening Legacy</em>' containment reference.
	 * @see #setDoorOpeningLegacy(DoorOpeningLegacyType)
	 * @see Cpacs.CpacsPackage#getDoorOpeningType_DoorOpeningLegacy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doorOpeningLegacy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorOpeningLegacyType getDoorOpeningLegacy();

	/**
	 * Sets the value of the '{@link Cpacs.DoorOpeningType#getDoorOpeningLegacy <em>Door Opening Legacy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Opening Legacy</em>' containment reference.
	 * @see #getDoorOpeningLegacy()
	 * @generated
	 */
	void setDoorOpeningLegacy(DoorOpeningLegacyType value);

} // DoorOpeningType
