/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vtp Frame Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.VtpFrameDefType#getVtpFrameUID <em>Vtp Frame UID</em>}</li>
 *   <li>{@link Cpacs.VtpFrameDefType#getVtpFramePlus1 <em>Vtp Frame Plus1</em>}</li>
 *   <li>{@link Cpacs.VtpFrameDefType#getVtpFrameSheetElemUID <em>Vtp Frame Sheet Elem UID</em>}</li>
 *   <li>{@link Cpacs.VtpFrameDefType#getVtpFrameReinfBaseStructElemUID <em>Vtp Frame Reinf Base Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.VtpFrameDefType#getVtpFrameReinfHorizStructElemUID <em>Vtp Frame Reinf Horiz Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.VtpFrameDefType#getVtpFrameReinfRadialStructElemUID <em>Vtp Frame Reinf Radial Struct Elem UID</em>}</li>
 *   <li>{@link Cpacs.VtpFrameDefType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getVtpFrameDefType()
 * @model extendedMetaData="name='vtpFrameDefType' kind='elementOnly'"
 * @generated
 */
public interface VtpFrameDefType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Vtp Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the fuselage frame at this VTP
	 *                                 attachment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Frame UID</em>' containment reference.
	 * @see #setVtpFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getVtpFrameDefType_VtpFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vtpFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVtpFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.VtpFrameDefType#getVtpFrameUID <em>Vtp Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Frame UID</em>' containment reference.
	 * @see #getVtpFrameUID()
	 * @generated
	 */
	void setVtpFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Vtp Frame Plus1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag for option for VTP attachment between
	 *                                 defined FrameUID and the next one
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Frame Plus1</em>' containment reference.
	 * @see #setVtpFramePlus1(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getVtpFrameDefType_VtpFramePlus1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vtpFramePlus1' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getVtpFramePlus1();

	/**
	 * Sets the value of the '{@link Cpacs.VtpFrameDefType#getVtpFramePlus1 <em>Vtp Frame Plus1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Frame Plus1</em>' containment reference.
	 * @see #getVtpFramePlus1()
	 * @generated
	 */
	void setVtpFramePlus1(BooleanBaseType value);

	/**
	 * Returns the value of the '<em><b>Vtp Frame Sheet Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of panel element at VTP attachment (shell
	 *                                 elements)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Frame Sheet Elem UID</em>' containment reference.
	 * @see #setVtpFrameSheetElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getVtpFrameDefType_VtpFrameSheetElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vtpFrameSheetElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVtpFrameSheetElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.VtpFrameDefType#getVtpFrameSheetElemUID <em>Vtp Frame Sheet Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Frame Sheet Elem UID</em>' containment reference.
	 * @see #getVtpFrameSheetElemUID()
	 * @generated
	 */
	void setVtpFrameSheetElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Vtp Frame Reinf Base Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural element at VTP attachment
	 *                                 (base, beams)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Frame Reinf Base Struct Elem UID</em>' containment reference.
	 * @see #setVtpFrameReinfBaseStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getVtpFrameDefType_VtpFrameReinfBaseStructElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vtpFrameReinfBaseStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVtpFrameReinfBaseStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.VtpFrameDefType#getVtpFrameReinfBaseStructElemUID <em>Vtp Frame Reinf Base Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Frame Reinf Base Struct Elem UID</em>' containment reference.
	 * @see #getVtpFrameReinfBaseStructElemUID()
	 * @generated
	 */
	void setVtpFrameReinfBaseStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Vtp Frame Reinf Horiz Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural element at VTP attachment
	 *                                 (horizontal, beams)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Frame Reinf Horiz Struct Elem UID</em>' containment reference.
	 * @see #setVtpFrameReinfHorizStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getVtpFrameDefType_VtpFrameReinfHorizStructElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vtpFrameReinfHorizStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVtpFrameReinfHorizStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.VtpFrameDefType#getVtpFrameReinfHorizStructElemUID <em>Vtp Frame Reinf Horiz Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Frame Reinf Horiz Struct Elem UID</em>' containment reference.
	 * @see #getVtpFrameReinfHorizStructElemUID()
	 * @generated
	 */
	void setVtpFrameReinfHorizStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Vtp Frame Reinf Radial Struct Elem UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural element at VTP attachment
	 *                                 (radial, beams)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vtp Frame Reinf Radial Struct Elem UID</em>' containment reference.
	 * @see #setVtpFrameReinfRadialStructElemUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getVtpFrameDefType_VtpFrameReinfRadialStructElemUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vtpFrameReinfRadialStructElemUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getVtpFrameReinfRadialStructElemUID();

	/**
	 * Sets the value of the '{@link Cpacs.VtpFrameDefType#getVtpFrameReinfRadialStructElemUID <em>Vtp Frame Reinf Radial Struct Elem UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vtp Frame Reinf Radial Struct Elem UID</em>' containment reference.
	 * @see #getVtpFrameReinfRadialStructElemUID()
	 * @generated
	 */
	void setVtpFrameReinfRadialStructElemUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getVtpFrameDefType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.VtpFrameDefType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // VtpFrameDefType
