/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tailplane Attachment Area Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TailplaneAttachmentAreaType#getTailplaneAttachmentType <em>Tailplane Attachment Type</em>}</li>
 *   <li>{@link Cpacs.TailplaneAttachmentAreaType#getVtpInterfaceDefinitions <em>Vtp Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.TailplaneAttachmentAreaType#getHtpInterfaceDefinitions <em>Htp Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.TailplaneAttachmentAreaType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTailplaneAttachmentAreaType()
 * @model extendedMetaData="name='tailplaneAttachmentAreaType' kind='elementOnly'"
 * @generated
 */
public interface TailplaneAttachmentAreaType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Tailplane Attachment Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * type of tailplane attachment: Currently
	 *                                 restricted to
	 *                                 'Type1' and 'Type2' (see documentation)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tailplane Attachment Type</em>' containment reference.
	 * @see #setTailplaneAttachmentType(TailplaneAttachmentTypeType)
	 * @see Cpacs.CpacsPackage#getTailplaneAttachmentAreaType_TailplaneAttachmentType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tailplaneAttachmentType' namespace='##targetNamespace'"
	 * @generated
	 */
	TailplaneAttachmentTypeType getTailplaneAttachmentType();

	/**
	 * Sets the value of the '{@link Cpacs.TailplaneAttachmentAreaType#getTailplaneAttachmentType <em>Tailplane Attachment Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tailplane Attachment Type</em>' containment reference.
	 * @see #getTailplaneAttachmentType()
	 * @generated
	 */
	void setTailplaneAttachmentType(TailplaneAttachmentTypeType value);

	/**
	 * Returns the value of the '<em><b>Vtp Interface Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definitions of VTP interface
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Interface Definitions</em>' containment reference.
	 * @see #setVtpInterfaceDefinitions(VtpInterfaceDefType)
	 * @see Cpacs.CpacsPackage#getTailplaneAttachmentAreaType_VtpInterfaceDefinitions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vtpInterfaceDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	VtpInterfaceDefType getVtpInterfaceDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.TailplaneAttachmentAreaType#getVtpInterfaceDefinitions <em>Vtp Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Interface Definitions</em>' containment reference.
	 * @see #getVtpInterfaceDefinitions()
	 * @generated
	 */
	void setVtpInterfaceDefinitions(VtpInterfaceDefType value);

	/**
	 * Returns the value of the '<em><b>Htp Interface Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definitions of VTP interface
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Interface Definitions</em>' containment reference.
	 * @see #setHtpInterfaceDefinitions(HtpInterfaceDefType)
	 * @see Cpacs.CpacsPackage#getTailplaneAttachmentAreaType_HtpInterfaceDefinitions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpInterfaceDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	HtpInterfaceDefType getHtpInterfaceDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.TailplaneAttachmentAreaType#getHtpInterfaceDefinitions <em>Htp Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Interface Definitions</em>' containment reference.
	 * @see #getHtpInterfaceDefinitions()
	 * @generated
	 */
	void setHtpInterfaceDefinitions(HtpInterfaceDefType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getTailplaneAttachmentAreaType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.TailplaneAttachmentAreaType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // TailplaneAttachmentAreaType
