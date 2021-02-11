/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skin Segment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SkinSegmentType#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.SkinSegmentType#getStartFrameUID <em>Start Frame UID</em>}</li>
 *   <li>{@link Cpacs.SkinSegmentType#getEndFrameUID <em>End Frame UID</em>}</li>
 *   <li>{@link Cpacs.SkinSegmentType#getStartStringerUID <em>Start Stringer UID</em>}</li>
 *   <li>{@link Cpacs.SkinSegmentType#getEndStringerUID <em>End Stringer UID</em>}</li>
 *   <li>{@link Cpacs.SkinSegmentType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSkinSegmentType()
 * @model extendedMetaData="name='skinSegmentType' kind='elementOnly'"
 * @generated
 */
public interface SkinSegmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sheet Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of sheetBasedStructuralElement used for
	 *                                 the panel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #setSheetElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getSkinSegmentType_SheetElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheetElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSheetElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.SkinSegmentType#getSheetElementUID <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #getSheetElementUID()
	 * @generated
	 */
	void setSheetElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Start Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of frame at start of the skin segment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Frame UID</em>' containment reference.
	 * @see #setStartFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getSkinSegmentType_StartFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStartFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.SkinSegmentType#getStartFrameUID <em>Start Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Frame UID</em>' containment reference.
	 * @see #getStartFrameUID()
	 * @generated
	 */
	void setStartFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>End Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of frame at end of the skin segment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Frame UID</em>' containment reference.
	 * @see #setEndFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getSkinSegmentType_EndFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='endFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getEndFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.SkinSegmentType#getEndFrameUID <em>End Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Frame UID</em>' containment reference.
	 * @see #getEndFrameUID()
	 * @generated
	 */
	void setEndFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Start Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of stringer at start of the skin segment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Stringer UID</em>' containment reference.
	 * @see #setStartStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getSkinSegmentType_StartStringerUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStartStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.SkinSegmentType#getStartStringerUID <em>Start Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Stringer UID</em>' containment reference.
	 * @see #getStartStringerUID()
	 * @generated
	 */
	void setStartStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>End Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of stringer at end of the skin segment
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Stringer UID</em>' containment reference.
	 * @see #setEndStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getSkinSegmentType_EndStringerUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getEndStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.SkinSegmentType#getEndStringerUID <em>End Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Stringer UID</em>' containment reference.
	 * @see #getEndStringerUID()
	 * @generated
	 */
	void setEndStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getSkinSegmentType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.SkinSegmentType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // SkinSegmentType
