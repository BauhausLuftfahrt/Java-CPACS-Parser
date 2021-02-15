/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sheet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SheetType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.SheetType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.SheetType#getFromPointUID <em>From Point UID</em>}</li>
 *   <li>{@link Cpacs.SheetType#getContinuityAtP1 <em>Continuity At P1</em>}</li>
 *   <li>{@link Cpacs.SheetType#getOrientationAtP1 <em>Orientation At P1</em>}</li>
 *   <li>{@link Cpacs.SheetType#getToPointUID <em>To Point UID</em>}</li>
 *   <li>{@link Cpacs.SheetType#getContinuityAtP2 <em>Continuity At P2</em>}</li>
 *   <li>{@link Cpacs.SheetType#getOrientationAtP2 <em>Orientation At P2</em>}</li>
 *   <li>{@link Cpacs.SheetType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSheetType()
 * @model extendedMetaData="name='sheetType' kind='elementOnly'"
 * @generated
 */
public interface SheetType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of sheet within the profile definition
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getSheetType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.SheetType#getName <em>Name</em>}' containment reference.
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
	 * Description of sheet within the profile
	 *                                 definition
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getSheetType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.SheetType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>From Point UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Point from which the sheet definition starts
	 *                                 start
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Point UID</em>' containment reference.
	 * @see #setFromPointUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getSheetType_FromPointUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromPointUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFromPointUID();

	/**
	 * Sets the value of the '{@link Cpacs.SheetType#getFromPointUID <em>From Point UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Point UID</em>' containment reference.
	 * @see #getFromPointUID()
	 * @generated
	 */
	void setFromPointUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Continuity At P1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuity definition for profile geometry
	 *                                 generation. 0= C0 (allows sharp edges, deafault), 1= C1 (defines
	 *                                 tangential continuity), 2= C2 (defines curvature continuity)
	 *                                 2=all
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Continuity At P1</em>' containment reference.
	 * @see #setContinuityAtP1(ContinuityAtP1Type)
	 * @see Cpacs.CpacsPackage#getSheetType_ContinuityAtP1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='continuityAtP1' namespace='##targetNamespace'"
	 * @generated
	 */
	ContinuityAtP1Type getContinuityAtP1();

	/**
	 * Sets the value of the '{@link Cpacs.SheetType#getContinuityAtP1 <em>Continuity At P1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuity At P1</em>' containment reference.
	 * @see #getContinuityAtP1()
	 * @generated
	 */
	void setContinuityAtP1(ContinuityAtP1Type value);

	/**
	 * Returns the value of the '<em><b>Orientation At P1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of an orientation vector at P1
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation At P1</em>' containment reference.
	 * @see #setOrientationAtP1(PointXYType)
	 * @see Cpacs.CpacsPackage#getSheetType_OrientationAtP1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientationAtP1' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYType getOrientationAtP1();

	/**
	 * Sets the value of the '{@link Cpacs.SheetType#getOrientationAtP1 <em>Orientation At P1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation At P1</em>' containment reference.
	 * @see #getOrientationAtP1()
	 * @generated
	 */
	void setOrientationAtP1(PointXYType value);

	/**
	 * Returns the value of the '<em><b>To Point UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Point at which the sheet definition ends
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Point UID</em>' containment reference.
	 * @see #setToPointUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getSheetType_ToPointUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toPointUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getToPointUID();

	/**
	 * Sets the value of the '{@link Cpacs.SheetType#getToPointUID <em>To Point UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Point UID</em>' containment reference.
	 * @see #getToPointUID()
	 * @generated
	 */
	void setToPointUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Continuity At P2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuity definition for profile geometry
	 *                                 generation. 0= C0 (allows sharp edges, deafault), 1= C1 (defines
	 *                                 tangential continuity), 2= C2 (defines curvature continuity)
	 *                                 2=all
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Continuity At P2</em>' containment reference.
	 * @see #setContinuityAtP2(ContinuityAtP2Type)
	 * @see Cpacs.CpacsPackage#getSheetType_ContinuityAtP2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='continuityAtP2' namespace='##targetNamespace'"
	 * @generated
	 */
	ContinuityAtP2Type getContinuityAtP2();

	/**
	 * Sets the value of the '{@link Cpacs.SheetType#getContinuityAtP2 <em>Continuity At P2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuity At P2</em>' containment reference.
	 * @see #getContinuityAtP2()
	 * @generated
	 */
	void setContinuityAtP2(ContinuityAtP2Type value);

	/**
	 * Returns the value of the '<em><b>Orientation At P2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of an orientation vector at P2
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation At P2</em>' containment reference.
	 * @see #setOrientationAtP2(PointXYType)
	 * @see Cpacs.CpacsPackage#getSheetType_OrientationAtP2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientationAtP2' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYType getOrientationAtP2();

	/**
	 * Sets the value of the '{@link Cpacs.SheetType#getOrientationAtP2 <em>Orientation At P2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation At P2</em>' containment reference.
	 * @see #getOrientationAtP2()
	 * @generated
	 */
	void setOrientationAtP2(PointXYType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getSheetType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.SheetType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // SheetType
