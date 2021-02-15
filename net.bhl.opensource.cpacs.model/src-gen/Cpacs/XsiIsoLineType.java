/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xsi Iso Line Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.XsiIsoLineType#getXsi <em>Xsi</em>}</li>
 *   <li>{@link Cpacs.XsiIsoLineType#getReferenceUID <em>Reference UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getXsiIsoLineType()
 * @model extendedMetaData="name='xsiIsoLineType' kind='elementOnly'"
 * @generated
 */
public interface XsiIsoLineType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Xsi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise position. Xsi refers to the segment or componentSegment depending on the referenced uID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi</em>' containment reference.
	 * @see #setXsi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getXsiIsoLineType_Xsi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xsi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsi();

	/**
	 * Sets the value of the '{@link Cpacs.XsiIsoLineType#getXsi <em>Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi</em>' containment reference.
	 * @see #getXsi()
	 * @generated
	 */
	void setXsi(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference uID determines the reference coordinate system.
	 *                             If it points to a segment, then the eta value is considered to be in segment
	 *                             eta coordinate; if it points to a componentSegment,
	 *                             then componentSegment eta coordinate is used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference UID</em>' containment reference.
	 * @see #setReferenceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getXsiIsoLineType_ReferenceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getReferenceUID();

	/**
	 * Sets the value of the '{@link Cpacs.XsiIsoLineType#getReferenceUID <em>Reference UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference UID</em>' containment reference.
	 * @see #getReferenceUID()
	 * @generated
	 */
	void setReferenceUID(StringUIDBaseType value);

} // XsiIsoLineType
