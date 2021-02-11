/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Wing Attachments Spars Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingWingAttachmentsSparsType#getSparAttachment <em>Spar Attachment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingWingAttachmentsSparsType()
 * @model extendedMetaData="name='wingWingAttachmentsSparsType' kind='elementOnly'"
 * @generated
 */
public interface WingWingAttachmentsSparsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Spar Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingWingAttachmentSparsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spar Attachment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingWingAttachmentsSparsType_SparAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sparAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingWingAttachmentSparsType> getSparAttachment();

} // WingWingAttachmentsSparsType
