/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Wing Attachment Spars Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingWingAttachmentSparsType#getFromSparUID <em>From Spar UID</em>}</li>
 *   <li>{@link Cpacs.WingWingAttachmentSparsType#getToSparUID <em>To Spar UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingWingAttachmentSparsType()
 * @model extendedMetaData="name='wingWingAttachmentSparsType' kind='elementOnly'"
 * @generated
 */
public interface WingWingAttachmentSparsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>From Spar UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spar uID of the CURRENT componentSegment.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Spar UID</em>' containment reference.
	 * @see #setFromSparUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingWingAttachmentSparsType_FromSparUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromSparUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFromSparUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingWingAttachmentSparsType#getFromSparUID <em>From Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Spar UID</em>' containment reference.
	 * @see #getFromSparUID()
	 * @generated
	 */
	void setFromSparUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>To Spar UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spar uID of the second componentSegment.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Spar UID</em>' containment reference.
	 * @see #setToSparUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingWingAttachmentSparsType_ToSparUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toSparUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getToSparUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingWingAttachmentSparsType#getToSparUID <em>To Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Spar UID</em>' containment reference.
	 * @see #getToSparUID()
	 * @generated
	 */
	void setToSparUID(StringUIDBaseType value);

} // WingWingAttachmentSparsType
