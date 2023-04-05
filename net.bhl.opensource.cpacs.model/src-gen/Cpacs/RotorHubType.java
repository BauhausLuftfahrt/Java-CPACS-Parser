/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotor Hub Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorHubType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.RotorHubType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.RotorHubType#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.RotorHubType#getRotorBladeAttachments <em>Rotor Blade Attachments</em>}</li>
 *   <li>{@link Cpacs.RotorHubType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorHubType()
 * @model extendedMetaData="name='rotorHubType' kind='elementOnly'"
 * @generated
 */
public interface RotorHubType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the rotor hub.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRotorHubType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubType#getName <em>Name</em>}' containment reference.
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
	 * Description of the rotor hub.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRotorHubType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Cpacs.TypeType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotor head type. Possible values: "semiRigid",
	 *                                 "rigid", "articulated", "hingeless"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Cpacs.TypeType2
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType2)
	 * @see Cpacs.CpacsPackage#getRotorHubType_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType2 getType();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Cpacs.TypeType2
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType2 value);

	/**
	 * Unsets the value of the '{@link Cpacs.RotorHubType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType2)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link Cpacs.RotorHubType#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType2)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Rotor Blade Attachments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotor blade attachments are used to define how
	 *                                 many rotor blades are attached at which azimuth positions of the
	 *                                 rotor hub and the used hinges.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotor Blade Attachments</em>' containment reference.
	 * @see #setRotorBladeAttachments(RotorBladeAttachmentsType)
	 * @see Cpacs.CpacsPackage#getRotorHubType_RotorBladeAttachments()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotorBladeAttachments' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorBladeAttachmentsType getRotorBladeAttachments();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubType#getRotorBladeAttachments <em>Rotor Blade Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotor Blade Attachments</em>' containment reference.
	 * @see #getRotorBladeAttachments()
	 * @generated
	 */
	void setRotorBladeAttachments(RotorBladeAttachmentsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getRotorHubType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.RotorHubType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // RotorHubType
