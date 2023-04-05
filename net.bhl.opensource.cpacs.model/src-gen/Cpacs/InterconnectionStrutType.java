/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interconnection Strut Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.InterconnectionStrutType#getToControlSurfaceUID <em>To Control Surface UID</em>}</li>
 *   <li>{@link Cpacs.InterconnectionStrutType#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.InterconnectionStrutType#getFromAttachment <em>From Attachment</em>}</li>
 *   <li>{@link Cpacs.InterconnectionStrutType#getToAttachment <em>To Attachment</em>}</li>
 *   <li>{@link Cpacs.InterconnectionStrutType#getFreePath <em>Free Path</em>}</li>
 *   <li>{@link Cpacs.InterconnectionStrutType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getInterconnectionStrutType()
 * @model extendedMetaData="name='interconnectionStrutType' kind='elementOnly'"
 * @generated
 */
public interface InterconnectionStrutType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>To Control Surface UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uID of control surface where this flap is
	 *                                 attached to by the interconnection strut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Control Surface UID</em>' containment reference.
	 * @see #setToControlSurfaceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getInterconnectionStrutType_ToControlSurfaceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toControlSurfaceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getToControlSurfaceUID();

	/**
	 * Sets the value of the '{@link Cpacs.InterconnectionStrutType#getToControlSurfaceUID <em>To Control Surface UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Control Surface UID</em>' containment reference.
	 * @see #getToControlSurfaceUID()
	 * @generated
	 */
	void setToControlSurfaceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material settings of the strut (if strut is
	 *                                 modeled as a simple strut).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getInterconnectionStrutType_Material()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getMaterial();

	/**
	 * Sets the value of the '{@link Cpacs.InterconnectionStrutType#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>From Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the attachment on this control
	 *                                 surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Attachment</em>' containment reference.
	 * @see #setFromAttachment(InterConnectionStrutAttachmentType)
	 * @see Cpacs.CpacsPackage#getInterconnectionStrutType_FromAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	InterConnectionStrutAttachmentType getFromAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.InterconnectionStrutType#getFromAttachment <em>From Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Attachment</em>' containment reference.
	 * @see #getFromAttachment()
	 * @generated
	 */
	void setFromAttachment(InterConnectionStrutAttachmentType value);

	/**
	 * Returns the value of the '<em><b>To Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the attachment on the other
	 *                                 control surface
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Attachment</em>' containment reference.
	 * @see #setToAttachment(InterConnectionStrutAttachmentType)
	 * @see Cpacs.CpacsPackage#getInterconnectionStrutType_ToAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	InterConnectionStrutAttachmentType getToAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.InterconnectionStrutType#getToAttachment <em>To Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Attachment</em>' containment reference.
	 * @see #getToAttachment()
	 * @generated
	 */
	void setToAttachment(InterConnectionStrutAttachmentType value);

	/**
	 * Returns the value of the '<em><b>Free Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Free path in positive (tensil) and negative
	 *                                 (compression) direction before interconnection strut blocks.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Path</em>' containment reference.
	 * @see #setFreePath(FreePathType)
	 * @see Cpacs.CpacsPackage#getInterconnectionStrutType_FreePath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='freePath' namespace='##targetNamespace'"
	 * @generated
	 */
	FreePathType getFreePath();

	/**
	 * Sets the value of the '{@link Cpacs.InterconnectionStrutType#getFreePath <em>Free Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Path</em>' containment reference.
	 * @see #getFreePath()
	 * @generated
	 */
	void setFreePath(FreePathType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getInterconnectionStrutType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.InterconnectionStrutType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // InterconnectionStrutType
