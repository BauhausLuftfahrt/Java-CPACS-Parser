/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Htp Fwd Interface Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.HtpFwdInterfaceDefType#getHtpFwdReinfRelWidth <em>Htp Fwd Reinf Rel Width</em>}</li>
 *   <li>{@link Cpacs.HtpFwdInterfaceDefType#getHtpFwdPlateWidth <em>Htp Fwd Plate Width</em>}</li>
 *   <li>{@link Cpacs.HtpFwdInterfaceDefType#getHtpFwdPlateXElemUID <em>Htp Fwd Plate XElem UID</em>}</li>
 *   <li>{@link Cpacs.HtpFwdInterfaceDefType#getHtpFwdPlateZElemUID <em>Htp Fwd Plate ZElem UID</em>}</li>
 *   <li>{@link Cpacs.HtpFwdInterfaceDefType#getHtpFwdPlateZReinfStructElemUID <em>Htp Fwd Plate ZReinf Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.HtpFwdInterfaceDefType#getHtpFwdAttachmentStructElemUID <em>Htp Fwd Attachment Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.HtpFwdInterfaceDefType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getHtpFwdInterfaceDefType()
 * @model extendedMetaData="name='htpFwdInterfaceDefType' kind='elementOnly'"
 * @generated
 */
public interface HtpFwdInterfaceDefType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Htp Fwd Reinf Rel Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * relative width of reinforcement at fwd HTP
	 *                                 attachment, between 0.0 and 1.0
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Fwd Reinf Rel Width</em>' containment reference.
	 * @see #setHtpFwdReinfRelWidth(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getHtpFwdInterfaceDefType_HtpFwdReinfRelWidth()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpFwdReinfRelWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHtpFwdReinfRelWidth();

	/**
	 * Sets the value of the '{@link Cpacs.HtpFwdInterfaceDefType#getHtpFwdReinfRelWidth <em>Htp Fwd Reinf Rel Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Fwd Reinf Rel Width</em>' containment reference.
	 * @see #getHtpFwdReinfRelWidth()
	 * @generated
	 */
	void setHtpFwdReinfRelWidth(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Fwd Plate Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * relative width of plate at fwd HTP attachment
	 *                                 (only applicable for Type1 model), between 0.0 and 1.0, smaller
	 *                                 than htpPlateWidth
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Fwd Plate Width</em>' containment reference.
	 * @see #setHtpFwdPlateWidth(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getHtpFwdInterfaceDefType_HtpFwdPlateWidth()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpFwdPlateWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHtpFwdPlateWidth();

	/**
	 * Sets the value of the '{@link Cpacs.HtpFwdInterfaceDefType#getHtpFwdPlateWidth <em>Htp Fwd Plate Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Fwd Plate Width</em>' containment reference.
	 * @see #getHtpFwdPlateWidth()
	 * @generated
	 */
	void setHtpFwdPlateWidth(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Fwd Plate XElem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of panel element at HTP forward attachment
	 *                                 in x-direction (shell elements)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Fwd Plate XElem UID</em>' containment reference.
	 * @see #setHtpFwdPlateXElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getHtpFwdInterfaceDefType_HtpFwdPlateXElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpFwdPlateXElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHtpFwdPlateXElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpFwdInterfaceDefType#getHtpFwdPlateXElemUID <em>Htp Fwd Plate XElem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Fwd Plate XElem UID</em>' containment reference.
	 * @see #getHtpFwdPlateXElemUID()
	 * @generated
	 */
	void setHtpFwdPlateXElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Fwd Plate ZElem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of panel element at HTP forward attachment
	 *                                 in z-direction (shell elements)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Fwd Plate ZElem UID</em>' containment reference.
	 * @see #setHtpFwdPlateZElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getHtpFwdInterfaceDefType_HtpFwdPlateZElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpFwdPlateZElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHtpFwdPlateZElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpFwdInterfaceDefType#getHtpFwdPlateZElemUID <em>Htp Fwd Plate ZElem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Fwd Plate ZElem UID</em>' containment reference.
	 * @see #getHtpFwdPlateZElemUID()
	 * @generated
	 */
	void setHtpFwdPlateZElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Fwd Plate ZReinf Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of reinforcements for panel element at HTP
	 *                                 forward attachment in z-direction (beam elements)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Fwd Plate ZReinf Struct Elem UID</em>' containment reference.
	 * @see #setHtpFwdPlateZReinfStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getHtpFwdInterfaceDefType_HtpFwdPlateZReinfStructElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpFwdPlateZReinfStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHtpFwdPlateZReinfStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpFwdInterfaceDefType#getHtpFwdPlateZReinfStructElemUID <em>Htp Fwd Plate ZReinf Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Fwd Plate ZReinf Struct Elem UID</em>' containment reference.
	 * @see #getHtpFwdPlateZReinfStructElemUID()
	 * @generated
	 */
	void setHtpFwdPlateZReinfStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Htp Fwd Attachment Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the element to fix HTP to fuselage
	 *                                 (beam elements)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Htp Fwd Attachment Struct Elem UID</em>' containment reference.
	 * @see #setHtpFwdAttachmentStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getHtpFwdInterfaceDefType_HtpFwdAttachmentStructElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='htpFwdAttachmentStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getHtpFwdAttachmentStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpFwdInterfaceDefType#getHtpFwdAttachmentStructElemUID <em>Htp Fwd Attachment Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Htp Fwd Attachment Struct Elem UID</em>' containment reference.
	 * @see #getHtpFwdAttachmentStructElemUID()
	 * @generated
	 */
	void setHtpFwdAttachmentStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getHtpFwdInterfaceDefType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.HtpFwdInterfaceDefType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // HtpFwdInterfaceDefType
