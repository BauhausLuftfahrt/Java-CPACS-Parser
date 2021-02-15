/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Strut Wing Fuselage Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MainStrutWingFuselageAttachmentType#getMainStrutWingAttachmentPinUID <em>Main Strut Wing Attachment Pin UID</em>}</li>
 *   <li>{@link Cpacs.MainStrutWingFuselageAttachmentType#getFuselageAttachmentFrameUID <em>Fuselage Attachment Frame UID</em>}</li>
 *   <li>{@link Cpacs.MainStrutWingFuselageAttachmentType#getFuselageAttachmentStringerUID <em>Fuselage Attachment Stringer UID</em>}</li>
 *   <li>{@link Cpacs.MainStrutWingFuselageAttachmentType#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.MainStrutWingFuselageAttachmentType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMainStrutWingFuselageAttachmentType()
 * @model extendedMetaData="name='mainStrutWingFuselageAttachmentType' kind='elementOnly'"
 * @generated
 */
public interface MainStrutWingFuselageAttachmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Main Strut Wing Attachment Pin UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Strut Wing Attachment Pin UID</em>' containment reference.
	 * @see #setMainStrutWingAttachmentPinUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMainStrutWingFuselageAttachmentType_MainStrutWingAttachmentPinUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mainStrutWingAttachmentPinUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMainStrutWingAttachmentPinUID();

	/**
	 * Sets the value of the '{@link Cpacs.MainStrutWingFuselageAttachmentType#getMainStrutWingAttachmentPinUID <em>Main Strut Wing Attachment Pin UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Strut Wing Attachment Pin UID</em>' containment reference.
	 * @see #getMainStrutWingAttachmentPinUID()
	 * @generated
	 */
	void setMainStrutWingAttachmentPinUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Fuselage Attachment Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselage Attachment Frame UID</em>' containment reference.
	 * @see #setFuselageAttachmentFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMainStrutWingFuselageAttachmentType_FuselageAttachmentFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuselageAttachmentFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFuselageAttachmentFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.MainStrutWingFuselageAttachmentType#getFuselageAttachmentFrameUID <em>Fuselage Attachment Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselage Attachment Frame UID</em>' containment reference.
	 * @see #getFuselageAttachmentFrameUID()
	 * @generated
	 */
	void setFuselageAttachmentFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Fuselage Attachment Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselage Attachment Stringer UID</em>' containment reference.
	 * @see #setFuselageAttachmentStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMainStrutWingFuselageAttachmentType_FuselageAttachmentStringerUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuselageAttachmentStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFuselageAttachmentStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.MainStrutWingFuselageAttachmentType#getFuselageAttachmentStringerUID <em>Fuselage Attachment Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselage Attachment Stringer UID</em>' containment reference.
	 * @see #getFuselageAttachmentStringerUID()
	 * @generated
	 */
	void setFuselageAttachmentStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Structural Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * reference to the structural element that comprises this connection. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #setStructuralElementUID(StringBaseType)
	 * @see Cpacs.CpacsPackage#getMainStrutWingFuselageAttachmentType_StructuralElementUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getStructuralElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.MainStrutWingFuselageAttachmentType#getStructuralElementUID <em>Structural Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #getStructuralElementUID()
	 * @generated
	 */
	void setStructuralElementUID(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getMainStrutWingFuselageAttachmentType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.MainStrutWingFuselageAttachmentType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // MainStrutWingFuselageAttachmentType
