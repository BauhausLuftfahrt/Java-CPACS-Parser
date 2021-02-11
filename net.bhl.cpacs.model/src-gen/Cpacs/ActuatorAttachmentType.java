/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ActuatorAttachmentType#getEtaControlSurface <em>Eta Control Surface</em>}</li>
 *   <li>{@link Cpacs.ActuatorAttachmentType#getParentAttachment <em>Parent Attachment</em>}</li>
 *   <li>{@link Cpacs.ActuatorAttachmentType#getControlSurfaceAttachment <em>Control Surface Attachment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getActuatorAttachmentType()
 * @model extendedMetaData="name='actuatorAttachmentType' kind='elementOnly'"
 * @generated
 */
public interface ActuatorAttachmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Eta Control Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise position of the actuator.
	 *                                 Eta refers to the dimensions of the control surface.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta Control Surface</em>' containment reference.
	 * @see #setEtaControlSurface(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getActuatorAttachmentType_EtaControlSurface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='etaControlSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEtaControlSurface();

	/**
	 * Sets the value of the '{@link Cpacs.ActuatorAttachmentType#getEtaControlSurface <em>Eta Control Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta Control Surface</em>' containment reference.
	 * @see #getEtaControlSurface()
	 * @generated
	 */
	void setEtaControlSurface(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Parent Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Attachment</em>' containment reference.
	 * @see #setParentAttachment(ActuatorParentAttachmentType)
	 * @see Cpacs.CpacsPackage#getActuatorAttachmentType_ParentAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parentAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	ActuatorParentAttachmentType getParentAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.ActuatorAttachmentType#getParentAttachment <em>Parent Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Attachment</em>' containment reference.
	 * @see #getParentAttachment()
	 * @generated
	 */
	void setParentAttachment(ActuatorParentAttachmentType value);

	/**
	 * Returns the value of the '<em><b>Control Surface Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surface Attachment</em>' containment reference.
	 * @see #setControlSurfaceAttachment(ActuatorControlSurfaceAttachmentType)
	 * @see Cpacs.CpacsPackage#getActuatorAttachmentType_ControlSurfaceAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlSurfaceAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	ActuatorControlSurfaceAttachmentType getControlSurfaceAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.ActuatorAttachmentType#getControlSurfaceAttachment <em>Control Surface Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surface Attachment</em>' containment reference.
	 * @see #getControlSurfaceAttachment()
	 * @generated
	 */
	void setControlSurfaceAttachment(ActuatorControlSurfaceAttachmentType value);

} // ActuatorAttachmentType
