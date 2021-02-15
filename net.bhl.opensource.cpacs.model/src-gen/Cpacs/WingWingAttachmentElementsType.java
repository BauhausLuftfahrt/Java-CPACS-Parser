/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Wing Attachment Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingWingAttachmentElementsType#getFromElementUID <em>From Element UID</em>}</li>
 *   <li>{@link Cpacs.WingWingAttachmentElementsType#getToElementUID <em>To Element UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingWingAttachmentElementsType()
 * @model extendedMetaData="name='wingWingAttachmentElementsType' kind='elementOnly'"
 * @generated
 */
public interface WingWingAttachmentElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>From Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element uID of the element of the CURRENT
	 *                                 componentSegment where the structural connection is placed.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Element UID</em>' containment reference.
	 * @see #setFromElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingWingAttachmentElementsType_FromElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFromElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingWingAttachmentElementsType#getFromElementUID <em>From Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Element UID</em>' containment reference.
	 * @see #getFromElementUID()
	 * @generated
	 */
	void setFromElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>To Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element uID of the element of the second
	 *                                 componentSegment where the structural connection is placed.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Element UID</em>' containment reference.
	 * @see #setToElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingWingAttachmentElementsType_ToElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getToElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingWingAttachmentElementsType#getToElementUID <em>To Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element UID</em>' containment reference.
	 * @see #getToElementUID()
	 * @generated
	 */
	void setToElementUID(StringUIDBaseType value);

} // WingWingAttachmentElementsType
