/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Fuselage Attachments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingFuselageAttachmentsType#getWingFuselageAttachment <em>Wing Fuselage Attachment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingFuselageAttachmentsType()
 * @model extendedMetaData="name='wingFuselageAttachmentsType' kind='elementOnly'"
 * @generated
 */
public interface WingFuselageAttachmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing Fuselage Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingFuselageAttachmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Fuselage Attachment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getWingFuselageAttachmentsType_WingFuselageAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingFuselageAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingFuselageAttachmentType> getWingFuselageAttachment();

} // WingFuselageAttachmentsType
