/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Interface Support Strut Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingInterfaceSupportStrutType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceSupportStrutType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceSupportStrutType#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceSupportStrutType#getWingAttachmentPinUID <em>Wing Attachment Pin UID</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceSupportStrutType#getFuselageAttachmentFrameUID <em>Fuselage Attachment Frame UID</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceSupportStrutType#getFuselageAttachmentStringerUID <em>Fuselage Attachment Stringer UID</em>}</li>
 *   <li>{@link Cpacs.WingInterfaceSupportStrutType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingInterfaceSupportStrutType()
 * @model extendedMetaData="name='wingInterfaceSupportStrutType' kind='elementOnly'"
 * @generated
 */
public interface WingInterfaceSupportStrutType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of support strut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingInterfaceSupportStrutType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceSupportStrutType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type description: lateral or longitudinal
	 *                                 support strut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getWingInterfaceSupportStrutType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceSupportStrutType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Structural Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #setStructuralElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingInterfaceSupportStrutType_StructuralElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structuralElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceSupportStrutType#getStructuralElementUID <em>Structural Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #getStructuralElementUID()
	 * @generated
	 */
	void setStructuralElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Wing Attachment Pin UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Attachment Pin UID</em>' containment reference.
	 * @see #setWingAttachmentPinUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingInterfaceSupportStrutType_WingAttachmentPinUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingAttachmentPinUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWingAttachmentPinUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceSupportStrutType#getWingAttachmentPinUID <em>Wing Attachment Pin UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Attachment Pin UID</em>' containment reference.
	 * @see #getWingAttachmentPinUID()
	 * @generated
	 */
	void setWingAttachmentPinUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Fuselage Attachment Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselage Attachment Frame UID</em>' containment reference.
	 * @see #setFuselageAttachmentFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingInterfaceSupportStrutType_FuselageAttachmentFrameUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuselageAttachmentFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFuselageAttachmentFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceSupportStrutType#getFuselageAttachmentFrameUID <em>Fuselage Attachment Frame UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getWingInterfaceSupportStrutType_FuselageAttachmentStringerUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuselageAttachmentStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFuselageAttachmentStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceSupportStrutType#getFuselageAttachmentStringerUID <em>Fuselage Attachment Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselage Attachment Stringer UID</em>' containment reference.
	 * @see #getFuselageAttachmentStringerUID()
	 * @generated
	 */
	void setFuselageAttachmentStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getWingInterfaceSupportStrutType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingInterfaceSupportStrutType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // WingInterfaceSupportStrutType
