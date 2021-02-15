/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pylon Attachments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PylonAttachmentsType#getFrontAttachment <em>Front Attachment</em>}</li>
 *   <li>{@link Cpacs.PylonAttachmentsType#getRearAttachment <em>Rear Attachment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPylonAttachmentsType()
 * @model extendedMetaData="name='pylonAttachmentsType' kind='elementOnly'"
 * @generated
 */
public interface PylonAttachmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Front Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PylonAttachmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front Attachment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPylonAttachmentsType_FrontAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='frontAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PylonAttachmentType> getFrontAttachment();

	/**
	 * Returns the value of the '<em><b>Rear Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PylonAttachmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rear Attachment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPylonAttachmentsType_RearAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rearAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PylonAttachmentType> getRearAttachment();

} // PylonAttachmentsType
