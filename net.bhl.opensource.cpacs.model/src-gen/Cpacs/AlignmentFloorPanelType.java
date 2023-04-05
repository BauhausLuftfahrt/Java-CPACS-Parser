/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alignment Floor Panel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AlignmentFloorPanelType#getOffset1LocY <em>Offset1 Loc Y</em>}</li>
 *   <li>{@link Cpacs.AlignmentFloorPanelType#getOffset2LocY <em>Offset2 Loc Y</em>}</li>
 *   <li>{@link Cpacs.AlignmentFloorPanelType#getOffsetLocZ <em>Offset Loc Z</em>}</li>
 *   <li>{@link Cpacs.AlignmentFloorPanelType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAlignmentFloorPanelType()
 * @model extendedMetaData="name='alignmentFloorPanelType' kind='elementOnly'"
 * @generated
 */
public interface AlignmentFloorPanelType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Offset1 Loc Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offset from seat rail 1 reference Position in
	 *                                 local y direction (in plane of panel, absolute value)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset1 Loc Y</em>' containment reference.
	 * @see #setOffset1LocY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAlignmentFloorPanelType_Offset1LocY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offset1LocY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOffset1LocY();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentFloorPanelType#getOffset1LocY <em>Offset1 Loc Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset1 Loc Y</em>' containment reference.
	 * @see #getOffset1LocY()
	 * @generated
	 */
	void setOffset1LocY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Offset2 Loc Y</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offset from seat rail 2 reference position in
	 *                                 local y direction (in plane of panel, absolute value)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset2 Loc Y</em>' containment reference.
	 * @see #setOffset2LocY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAlignmentFloorPanelType_Offset2LocY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offset2LocY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOffset2LocY();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentFloorPanelType#getOffset2LocY <em>Offset2 Loc Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset2 Loc Y</em>' containment reference.
	 * @see #getOffset2LocY()
	 * @generated
	 */
	void setOffset2LocY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Offset Loc Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offset from seat rail 1 reference position in
	 *                                 local z direction (in plane of panel, absolute value))
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset Loc Z</em>' containment reference.
	 * @see #setOffsetLocZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAlignmentFloorPanelType_OffsetLocZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offsetLocZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOffsetLocZ();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentFloorPanelType#getOffsetLocZ <em>Offset Loc Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Loc Z</em>' containment reference.
	 * @see #getOffsetLocZ()
	 * @generated
	 */
	void setOffsetLocZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getAlignmentFloorPanelType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.AlignmentFloorPanelType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // AlignmentFloorPanelType
