/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Actuator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceActuatorType#getActuatorUID <em>Actuator UID</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceActuatorType#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceActuatorType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceActuatorType()
 * @model extendedMetaData="name='controlSurfaceActuatorType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceActuatorType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Actuator UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the actuator (actuator definition
	 *                                 currently not available in CPCAS, status 1.6).
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuator UID</em>' containment reference.
	 * @see #setActuatorUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceActuatorType_ActuatorUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actuatorUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getActuatorUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceActuatorType#getActuatorUID <em>Actuator UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator UID</em>' containment reference.
	 * @see #getActuatorUID()
	 * @generated
	 */
	void setActuatorUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment</em>' containment reference.
	 * @see #setAttachment(ActuatorAttachmentType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceActuatorType_Attachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='attachment' namespace='##targetNamespace'"
	 * @generated
	 */
	ActuatorAttachmentType getAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceActuatorType#getAttachment <em>Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' containment reference.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(ActuatorAttachmentType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getControlSurfaceActuatorType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceActuatorType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // ControlSurfaceActuatorType
