/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Wing Attachments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingWingAttachmentsType#getWingWingAttachment <em>Wing Wing Attachment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingWingAttachmentsType()
 * @model extendedMetaData="name='wingWingAttachmentsType' kind='elementOnly'"
 * @generated
 */
public interface WingWingAttachmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing Wing Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingWingAttachmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Wing Attachment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingWingAttachmentsType_WingWingAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingWingAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingWingAttachmentType> getWingWingAttachment();

} // WingWingAttachmentsType
