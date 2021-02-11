/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotor Blade Attachments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorBladeAttachmentsType#getRotorBladeAttachment <em>Rotor Blade Attachment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorBladeAttachmentsType()
 * @model extendedMetaData="name='rotorBladeAttachmentsType' kind='elementOnly'"
 * @generated
 */
public interface RotorBladeAttachmentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rotor Blade Attachment</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.RotorBladeAttachmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotor Blade Attachment</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRotorBladeAttachmentsType_RotorBladeAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotorBladeAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RotorBladeAttachmentType> getRotorBladeAttachment();

} // RotorBladeAttachmentsType
