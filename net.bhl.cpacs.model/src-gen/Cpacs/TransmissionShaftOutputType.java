/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Shaft Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TransmissionShaftOutputType#getNominalRotationsPerMinute <em>Nominal Rotations Per Minute</em>}</li>
 *   <li>{@link Cpacs.TransmissionShaftOutputType#getGearRatio <em>Gear Ratio</em>}</li>
 *   <li>{@link Cpacs.TransmissionShaftOutputType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTransmissionShaftOutputType()
 * @model extendedMetaData="name='transmissionShaftOutputType' kind='elementOnly'"
 * @generated
 */
public interface TransmissionShaftOutputType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Nominal Rotations Per Minute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Rotations Per Minute</em>' containment reference.
	 * @see #setNominalRotationsPerMinute(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTransmissionShaftOutputType_NominalRotationsPerMinute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nominalRotationsPerMinute' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNominalRotationsPerMinute();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionShaftOutputType#getNominalRotationsPerMinute <em>Nominal Rotations Per Minute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Rotations Per Minute</em>' containment reference.
	 * @see #getNominalRotationsPerMinute()
	 * @generated
	 */
	void setNominalRotationsPerMinute(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Gear Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gear Ratio</em>' containment reference.
	 * @see #setGearRatio(TransmissionGearRatioType)
	 * @see Cpacs.CpacsPackage#getTransmissionShaftOutputType_GearRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gearRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	TransmissionGearRatioType getGearRatio();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionShaftOutputType#getGearRatio <em>Gear Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gear Ratio</em>' containment reference.
	 * @see #getGearRatio()
	 * @generated
	 */
	void setGearRatio(TransmissionGearRatioType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getTransmissionShaftOutputType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionShaftOutputType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // TransmissionShaftOutputType
