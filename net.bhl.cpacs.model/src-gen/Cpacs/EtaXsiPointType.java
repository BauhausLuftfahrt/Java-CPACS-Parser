/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eta Xsi Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EtaXsiPointType#getEta <em>Eta</em>}</li>
 *   <li>{@link Cpacs.EtaXsiPointType#getXsi <em>Xsi</em>}</li>
 *   <li>{@link Cpacs.EtaXsiPointType#getReferenceUID <em>Reference UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEtaXsiPointType()
 * @model extendedMetaData="name='etaXsiPointType' kind='elementOnly'"
 * @generated
 */
public interface EtaXsiPointType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Eta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise position. Eta refers to the segment or componentSegment depending on the referenced uID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta</em>' containment reference.
	 * @see #setEta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEtaXsiPointType_Eta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEta();

	/**
	 * Sets the value of the '{@link Cpacs.EtaXsiPointType#getEta <em>Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' containment reference.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Xsi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise position. Xsi refers to the segment or componentSegment depending on the referenced uID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi</em>' containment reference.
	 * @see #setXsi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEtaXsiPointType_Xsi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xsi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsi();

	/**
	 * Sets the value of the '{@link Cpacs.EtaXsiPointType#getXsi <em>Xsi</em>}' containment reference.
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
	 *                             If it points to a segment, then the eta-xsi values are considered to be in segment
	 *                             eta-xsi coordinates; if it points to a componentSegment,
	 *                             then componentSegment eta-xsi coordinates are used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference UID</em>' containment reference.
	 * @see #setReferenceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getEtaXsiPointType_ReferenceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getReferenceUID();

	/**
	 * Sets the value of the '{@link Cpacs.EtaXsiPointType#getReferenceUID <em>Reference UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference UID</em>' containment reference.
	 * @see #getReferenceUID()
	 * @generated
	 */
	void setReferenceUID(StringUIDBaseType value);

} // EtaXsiPointType
