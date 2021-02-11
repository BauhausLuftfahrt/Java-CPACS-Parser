/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floor Panel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FloorPanelType#getStartX <em>Start X</em>}</li>
 *   <li>{@link Cpacs.FloorPanelType#getEndX <em>End X</em>}</li>
 *   <li>{@link Cpacs.FloorPanelType#getLongFloorBeam1UID <em>Long Floor Beam1 UID</em>}</li>
 *   <li>{@link Cpacs.FloorPanelType#getLongFloorBeam2UID <em>Long Floor Beam2 UID</em>}</li>
 *   <li>{@link Cpacs.FloorPanelType#getSheetElementUID <em>Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.FloorPanelType#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link Cpacs.FloorPanelType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFloorPanelType()
 * @model extendedMetaData="name='floorPanelType' kind='elementOnly'"
 * @generated
 */
public interface FloorPanelType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Start X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x coordinate of the begin of the floor panel
	 *                                 (absolute value)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start X</em>' containment reference.
	 * @see #setStartX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFloorPanelType_StartX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getStartX();

	/**
	 * Sets the value of the '{@link Cpacs.FloorPanelType#getStartX <em>Start X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start X</em>' containment reference.
	 * @see #getStartX()
	 * @generated
	 */
	void setStartX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>End X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * x coordinate of the end of the floor panel
	 *                                 (absolute value)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End X</em>' containment reference.
	 * @see #setEndX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFloorPanelType_EndX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='endX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEndX();

	/**
	 * Sets the value of the '{@link Cpacs.FloorPanelType#getEndX <em>End X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End X</em>' containment reference.
	 * @see #getEndX()
	 * @generated
	 */
	void setEndX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Long Floor Beam1 UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the first long. floor beam to be
	 *                                 connected to the floor panel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Long Floor Beam1 UID</em>' containment reference.
	 * @see #setLongFloorBeam1UID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFloorPanelType_LongFloorBeam1UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='longFloorBeam1UID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getLongFloorBeam1UID();

	/**
	 * Sets the value of the '{@link Cpacs.FloorPanelType#getLongFloorBeam1UID <em>Long Floor Beam1 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Floor Beam1 UID</em>' containment reference.
	 * @see #getLongFloorBeam1UID()
	 * @generated
	 */
	void setLongFloorBeam1UID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Long Floor Beam2 UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the second long. floor beam to be
	 *                                 connected to the floor panel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Long Floor Beam2 UID</em>' containment reference.
	 * @see #setLongFloorBeam2UID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFloorPanelType_LongFloorBeam2UID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='longFloorBeam2UID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getLongFloorBeam2UID();

	/**
	 * Sets the value of the '{@link Cpacs.FloorPanelType#getLongFloorBeam2UID <em>Long Floor Beam2 UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Floor Beam2 UID</em>' containment reference.
	 * @see #getLongFloorBeam2UID()
	 * @generated
	 */
	void setLongFloorBeam2UID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Sheet Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of structural sheet element used for the
	 *                                 floor panel
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #setSheetElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFloorPanelType_SheetElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sheetElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSheetElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.FloorPanelType#getSheetElementUID <em>Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sheet Element UID</em>' containment reference.
	 * @see #getSheetElementUID()
	 * @generated
	 */
	void setSheetElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' containment reference.
	 * @see #setAlignment(AlignmentFloorPanelType)
	 * @see Cpacs.CpacsPackage#getFloorPanelType_Alignment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alignment' namespace='##targetNamespace'"
	 * @generated
	 */
	AlignmentFloorPanelType getAlignment();

	/**
	 * Sets the value of the '{@link Cpacs.FloorPanelType#getAlignment <em>Alignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' containment reference.
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(AlignmentFloorPanelType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFloorPanelType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FloorPanelType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FloorPanelType
