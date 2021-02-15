/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pylon Shackles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PylonShacklesType#getFrontAttachmentShackle <em>Front Attachment Shackle</em>}</li>
 *   <li>{@link Cpacs.PylonShacklesType#getRearAttachmentShackle <em>Rear Attachment Shackle</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPylonShacklesType()
 * @model extendedMetaData="name='pylonShacklesType' kind='elementOnly'"
 * @generated
 */
public interface PylonShacklesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Front Attachment Shackle</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PylonShackleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front Attachment Shackle</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPylonShacklesType_FrontAttachmentShackle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='frontAttachmentShackle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PylonShackleType> getFrontAttachmentShackle();

	/**
	 * Returns the value of the '<em><b>Rear Attachment Shackle</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PylonShackleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rear Attachment Shackle</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPylonShacklesType_RearAttachmentShackle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rearAttachmentShackle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PylonShackleType> getRearAttachmentShackle();

} // PylonShacklesType
