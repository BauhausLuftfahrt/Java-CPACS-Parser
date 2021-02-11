/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission Shaft Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TransmissionShaftInputType#getNominalRotationsPerMinute <em>Nominal Rotations Per Minute</em>}</li>
 *   <li>{@link Cpacs.TransmissionShaftInputType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTransmissionShaftInputType()
 * @model extendedMetaData="name='transmissionShaftInputType' kind='elementOnly'"
 * @generated
 */
public interface TransmissionShaftInputType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Nominal Rotations Per Minute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nominal Rotations Per Minute</em>' containment reference.
	 * @see #setNominalRotationsPerMinute(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTransmissionShaftInputType_NominalRotationsPerMinute()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nominalRotationsPerMinute' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNominalRotationsPerMinute();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionShaftInputType#getNominalRotationsPerMinute <em>Nominal Rotations Per Minute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nominal Rotations Per Minute</em>' containment reference.
	 * @see #getNominalRotationsPerMinute()
	 * @generated
	 */
	void setNominalRotationsPerMinute(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getTransmissionShaftInputType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.TransmissionShaftInputType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // TransmissionShaftInputType
