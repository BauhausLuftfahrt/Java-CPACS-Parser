/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Wing Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingWingAttachmentType#getToComponentSegmentUID <em>To Component Segment UID</em>}</li>
 *   <li>{@link Cpacs.WingWingAttachmentType#getElements <em>Elements</em>}</li>
 *   <li>{@link Cpacs.WingWingAttachmentType#getSparAttachments <em>Spar Attachments</em>}</li>
 *   <li>{@link Cpacs.WingWingAttachmentType#getUpperShellAttachment <em>Upper Shell Attachment</em>}</li>
 *   <li>{@link Cpacs.WingWingAttachmentType#getLowerShellAttachment <em>Lower Shell Attachment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingWingAttachmentType()
 * @model extendedMetaData="name='wingWingAttachmentType' kind='elementOnly'"
 * @generated
 */
public interface WingWingAttachmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>To Component Segment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the componentSegment, that is connected
	 *                                 with the current one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Component Segment UID</em>' containment reference.
	 * @see #setToComponentSegmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingWingAttachmentType_ToComponentSegmentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toComponentSegmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getToComponentSegmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingWingAttachmentType#getToComponentSegmentUID <em>To Component Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Component Segment UID</em>' containment reference.
	 * @see #getToComponentSegmentUID()
	 * @generated
	 */
	void setToComponentSegmentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference.
	 * @see #setElements(WingWingAttachmentElementsType)
	 * @see Cpacs.CpacsPackage#getWingWingAttachmentType_Elements()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='elements' namespace='##targetNamespace'"
	 * @generated
	 */
	WingWingAttachmentElementsType getElements();

	/**
	 * Sets the value of the '{@link Cpacs.WingWingAttachmentType#getElements <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' containment reference.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(WingWingAttachmentElementsType value);

	/**
	 * Returns the value of the '<em><b>Spar Attachments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spar Attachments</em>' containment reference.
	 * @see #setSparAttachments(WingWingAttachmentsSparsType)
	 * @see Cpacs.CpacsPackage#getWingWingAttachmentType_SparAttachments()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sparAttachments' namespace='##targetNamespace'"
	 * @generated
	 */
	WingWingAttachmentsSparsType getSparAttachments();

	/**
	 * Sets the value of the '{@link Cpacs.WingWingAttachmentType#getSparAttachments <em>Spar Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spar Attachments</em>' containment reference.
	 * @see #getSparAttachments()
	 * @generated
	 */
	void setSparAttachments(WingWingAttachmentsSparsType value);

	/**
	 * Returns the value of the '<em><b>Upper Shell Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines if the upper shell of the current
	 *                                 componentSegment is structurally connected to the upper or lower
	 *                                 shell of the second componentSegment. Can have the values
	 *                                 'upperShell' or 'lowerShell'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Shell Attachment</em>' containment reference.
	 * @see #setUpperShellAttachment(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingWingAttachmentType_UpperShellAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='upperShellAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getUpperShellAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.WingWingAttachmentType#getUpperShellAttachment <em>Upper Shell Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Shell Attachment</em>' containment reference.
	 * @see #getUpperShellAttachment()
	 * @generated
	 */
	void setUpperShellAttachment(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Lower Shell Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines if the lower shell of the current
	 *                                 componentSegment is structurally connected to the upper or lower
	 *                                 shell of the second componentSegment. Can have the values
	 *                                 'upperShell' or 'lowerShell'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Shell Attachment</em>' containment reference.
	 * @see #setLowerShellAttachment(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingWingAttachmentType_LowerShellAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lowerShellAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getLowerShellAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.WingWingAttachmentType#getLowerShellAttachment <em>Lower Shell Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Shell Attachment</em>' containment reference.
	 * @see #getLowerShellAttachment()
	 * @generated
	 */
	void setLowerShellAttachment(StringUIDBaseType value);

} // WingWingAttachmentType
