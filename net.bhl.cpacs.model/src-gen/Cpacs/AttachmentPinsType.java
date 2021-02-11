/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Pins Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AttachmentPinsType#getAttachmentPin <em>Attachment Pin</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAttachmentPinsType()
 * @model extendedMetaData="name='attachmentPinsType' kind='elementOnly'"
 * @generated
 */
public interface AttachmentPinsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Attachment Pin</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.AttachmentPinType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment Pin</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getAttachmentPinsType_AttachmentPin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='attachmentPin' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttachmentPinType> getAttachmentPin();

} // AttachmentPinsType
