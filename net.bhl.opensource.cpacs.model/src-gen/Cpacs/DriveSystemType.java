/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drive System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DriveSystemType#getTransmissions <em>Transmissions</em>}</li>
 *   <li>{@link Cpacs.DriveSystemType#getShafts <em>Shafts</em>}</li>
 *   <li>{@link Cpacs.DriveSystemType#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDriveSystemType()
 * @model extendedMetaData="name='driveSystemType' kind='elementOnly'"
 * @generated
 */
public interface DriveSystemType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Transmissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmissions</em>' containment reference.
	 * @see #setTransmissions(TransmissionsType)
	 * @see Cpacs.CpacsPackage#getDriveSystemType_Transmissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transmissions' namespace='##targetNamespace'"
	 * @generated
	 */
	TransmissionsType getTransmissions();

	/**
	 * Sets the value of the '{@link Cpacs.DriveSystemType#getTransmissions <em>Transmissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmissions</em>' containment reference.
	 * @see #getTransmissions()
	 * @generated
	 */
	void setTransmissions(TransmissionsType value);

	/**
	 * Returns the value of the '<em><b>Shafts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shafts</em>' containment reference.
	 * @see #setShafts(ShaftsType)
	 * @see Cpacs.CpacsPackage#getDriveSystemType_Shafts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shafts' namespace='##targetNamespace'"
	 * @generated
	 */
	ShaftsType getShafts();

	/**
	 * Sets the value of the '{@link Cpacs.DriveSystemType#getShafts <em>Shafts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shafts</em>' containment reference.
	 * @see #getShafts()
	 * @generated
	 */
	void setShafts(ShaftsType value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference.
	 * @see #setStates(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDriveSystemType_States()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='states' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getStates();

	/**
	 * Sets the value of the '{@link Cpacs.DriveSystemType#getStates <em>States</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>States</em>' containment reference.
	 * @see #getStates()
	 * @generated
	 */
	void setStates(StringBaseType value);

} // DriveSystemType
