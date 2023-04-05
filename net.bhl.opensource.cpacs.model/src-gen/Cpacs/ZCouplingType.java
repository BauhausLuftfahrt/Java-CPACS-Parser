/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZCoupling Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ZCouplingType#getToControlSurfaceUID <em>To Control Surface UID</em>}</li>
 *   <li>{@link Cpacs.ZCouplingType#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.ZCouplingType#getFromAttachment <em>From Attachment</em>}</li>
 *   <li>{@link Cpacs.ZCouplingType#getToAttachment <em>To Attachment</em>}</li>
 *   <li>{@link Cpacs.ZCouplingType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getZCouplingType()
 * @model extendedMetaData="name='zCouplingType' kind='elementOnly'"
 * @generated
 */
public interface ZCouplingType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>To Control Surface UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the control surface that is
	 *                                 connected to this control surface by the z-coupling..
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Control Surface UID</em>' containment reference.
	 * @see #setToControlSurfaceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getZCouplingType_ToControlSurfaceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toControlSurfaceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getToControlSurfaceUID();

	/**
	 * Sets the value of the '{@link Cpacs.ZCouplingType#getToControlSurfaceUID <em>To Control Surface UID</em>}' containment reference.
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
	 * Material of the movable part of the
	 *                                 z-coupling.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getZCouplingType_Material()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getMaterial();

	/**
	 * Sets the value of the '{@link Cpacs.ZCouplingType#getMaterial <em>Material</em>}' containment reference.
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
	 * Definition of the attachment of the z-coupling
	 *                                 to this control surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Attachment</em>' containment reference.
	 * @see #setFromAttachment(InterConnectionStrutAttachmentType)
	 * @see Cpacs.CpacsPackage#getZCouplingType_FromAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	InterConnectionStrutAttachmentType getFromAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.ZCouplingType#getFromAttachment <em>From Attachment</em>}' containment reference.
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
	 * Definition of the attachment of the z-coupling
	 *                                 to the other control surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Attachment</em>' containment reference.
	 * @see #setToAttachment(InterConnectionStrutAttachmentType)
	 * @see Cpacs.CpacsPackage#getZCouplingType_ToAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	InterConnectionStrutAttachmentType getToAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.ZCouplingType#getToAttachment <em>To Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Attachment</em>' containment reference.
	 * @see #getToAttachment()
	 * @generated
	 */
	void setToAttachment(InterConnectionStrutAttachmentType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getZCouplingType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.ZCouplingType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // ZCouplingType
