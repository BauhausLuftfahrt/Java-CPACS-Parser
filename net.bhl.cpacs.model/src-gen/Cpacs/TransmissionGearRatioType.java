/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Gear Ratio Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TransmissionGearRatioType#getReferenceShaftInputUID <em>Reference Shaft Input UID</em>}</li>
 *   <li>{@link Cpacs.TransmissionGearRatioType#getRatio <em>Ratio</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTransmissionGearRatioType()
 * @model extendedMetaData="name='transmissionGearRatioType' kind='elementOnly'"
 * @generated
 */
public interface TransmissionGearRatioType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Reference Shaft Input UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Shaft Input UID</em>' containment reference.
	 * @see #setReferenceShaftInputUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getTransmissionGearRatioType_ReferenceShaftInputUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceShaftInputUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getReferenceShaftInputUID();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionGearRatioType#getReferenceShaftInputUID <em>Reference Shaft Input UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Shaft Input UID</em>' containment reference.
	 * @see #getReferenceShaftInputUID()
	 * @generated
	 */
	void setReferenceShaftInputUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio</em>' containment reference.
	 * @see #setRatio(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTransmissionGearRatioType_Ratio()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ratio' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRatio();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionGearRatioType#getRatio <em>Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio</em>' containment reference.
	 * @see #getRatio()
	 * @generated
	 */
	void setRatio(DoubleBaseType value);

} // TransmissionGearRatioType
