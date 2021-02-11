/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Fuselage Wing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ActuatorFuselageWingType#getActuatorUID <em>Actuator UID</em>}</li>
 *   <li>{@link Cpacs.ActuatorFuselageWingType#getFuselageAttachment <em>Fuselage Attachment</em>}</li>
 *   <li>{@link Cpacs.ActuatorFuselageWingType#getWingAttachment <em>Wing Attachment</em>}</li>
 *   <li>{@link Cpacs.ActuatorFuselageWingType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getActuatorFuselageWingType()
 * @model extendedMetaData="name='actuatorFuselageWingType' kind='elementOnly'"
 * @generated
 */
public interface ActuatorFuselageWingType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Actuator UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the actuator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuator UID</em>' containment reference.
	 * @see #setActuatorUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getActuatorFuselageWingType_ActuatorUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actuatorUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getActuatorUID();

	/**
	 * Sets the value of the '{@link Cpacs.ActuatorFuselageWingType#getActuatorUID <em>Actuator UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator UID</em>' containment reference.
	 * @see #getActuatorUID()
	 * @generated
	 */
	void setActuatorUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Fuselage Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the actuator to fuselage
	 *                                 attachment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuselage Attachment</em>' containment reference.
	 * @see #setFuselageAttachment(PointXYZType)
	 * @see Cpacs.CpacsPackage#getActuatorFuselageWingType_FuselageAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuselageAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getFuselageAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.ActuatorFuselageWingType#getFuselageAttachment <em>Fuselage Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselage Attachment</em>' containment reference.
	 * @see #getFuselageAttachment()
	 * @generated
	 */
	void setFuselageAttachment(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Wing Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the actuator to wing attachment.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wing Attachment</em>' containment reference.
	 * @see #setWingAttachment(ActuatorFuselageWingAttachmentType)
	 * @see Cpacs.CpacsPackage#getActuatorFuselageWingType_WingAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	ActuatorFuselageWingAttachmentType getWingAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.ActuatorFuselageWingType#getWingAttachment <em>Wing Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Attachment</em>' containment reference.
	 * @see #getWingAttachment()
	 * @generated
	 */
	void setWingAttachment(ActuatorFuselageWingAttachmentType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getActuatorFuselageWingType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.ActuatorFuselageWingType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // ActuatorFuselageWingType
