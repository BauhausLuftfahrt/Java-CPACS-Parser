/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Mount Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StructuralMountType#getBlockedDOF <em>Blocked DOF</em>}</li>
 *   <li>{@link Cpacs.StructuralMountType#getTakeOnlyEndPoints <em>Take Only End Points</em>}</li>
 *   <li>{@link Cpacs.StructuralMountType#getFromStructureUID <em>From Structure UID</em>}</li>
 *   <li>{@link Cpacs.StructuralMountType#getFromStructureCounter <em>From Structure Counter</em>}</li>
 *   <li>{@link Cpacs.StructuralMountType#getToStructureUID <em>To Structure UID</em>}</li>
 *   <li>{@link Cpacs.StructuralMountType#getToStructureCounter <em>To Structure Counter</em>}</li>
 *   <li>{@link Cpacs.StructuralMountType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStructuralMountType()
 * @model extendedMetaData="name='structuralMountType' kind='elementOnly'"
 * @generated
 */
public interface StructuralMountType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Blocked DOF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocked DOF</em>' containment reference.
	 * @see #setBlockedDOF(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getStructuralMountType_BlockedDOF()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='blockedDOF' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getBlockedDOF();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralMountType#getBlockedDOF <em>Blocked DOF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked DOF</em>' containment reference.
	 * @see #getBlockedDOF()
	 * @generated
	 */
	void setBlockedDOF(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Take Only End Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this value is set to true then only the end points of the intersection shall be included as nodes in the model.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Take Only End Points</em>' containment reference.
	 * @see #setTakeOnlyEndPoints(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getStructuralMountType_TakeOnlyEndPoints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='takeOnlyEndPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getTakeOnlyEndPoints();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralMountType#getTakeOnlyEndPoints <em>Take Only End Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Take Only End Points</em>' containment reference.
	 * @see #getTakeOnlyEndPoints()
	 * @generated
	 */
	void setTakeOnlyEndPoints(BooleanBaseType value);

	/**
	 * Returns the value of the '<em><b>From Structure UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UID for the first connection UID may include for wings: skin, sparUID, ribDefinitionUID, ribNumber, stringerUID, stingerNumber, and for fuselages: skinSegmentUID, frameUID, stringerUID, crossBeamUID, crossBeamStrutUID, longFloorBeamUID.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Structure UID</em>' containment reference.
	 * @see #setFromStructureUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getStructuralMountType_FromStructureUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromStructureUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFromStructureUID();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralMountType#getFromStructureUID <em>From Structure UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Structure UID</em>' containment reference.
	 * @see #getFromStructureUID()
	 * @generated
	 */
	void setFromStructureUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>From Structure Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional counter to specify numbered items, e.g. ribs in a ribSet.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Structure Counter</em>' containment reference.
	 * @see #setFromStructureCounter(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getStructuralMountType_FromStructureCounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fromStructureCounter' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getFromStructureCounter();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralMountType#getFromStructureCounter <em>From Structure Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Structure Counter</em>' containment reference.
	 * @see #getFromStructureCounter()
	 * @generated
	 */
	void setFromStructureCounter(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>To Structure UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UID for the second connection UID may include for wings: skin, sparUID, ribDefinitionUID, ribNumber, stringerUID, stingerNumber, and for fuselages: skinSegmentUID, frameUID, stringerUID, crossBeamUID, crossBeamStrutUID, longFloorBeamUID.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Structure UID</em>' containment reference.
	 * @see #setToStructureUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getStructuralMountType_ToStructureUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toStructureUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getToStructureUID();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralMountType#getToStructureUID <em>To Structure UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Structure UID</em>' containment reference.
	 * @see #getToStructureUID()
	 * @generated
	 */
	void setToStructureUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>To Structure Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional counter to specify numbered items, e.g. ribs in a ribSet.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Structure Counter</em>' containment reference.
	 * @see #setToStructureCounter(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getStructuralMountType_ToStructureCounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='toStructureCounter' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getToStructureCounter();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralMountType#getToStructureCounter <em>To Structure Counter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Structure Counter</em>' containment reference.
	 * @see #getToStructureCounter()
	 * @generated
	 */
	void setToStructureCounter(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getStructuralMountType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.StructuralMountType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // StructuralMountType
