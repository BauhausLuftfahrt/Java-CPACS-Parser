/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CurvePointType#getEta <em>Eta</em>}</li>
 *   <li>{@link Cpacs.CurvePointType#getReferenceUID <em>Reference UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCurvePointType()
 * @model extendedMetaData="name='curvePointType' kind='elementOnly'"
 * @generated
 */
public interface CurvePointType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Eta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative position on the referenced line/curve.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta</em>' containment reference.
	 * @see #setEta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCurvePointType_Eta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEta();

	/**
	 * Sets the value of the '{@link Cpacs.CurvePointType#getEta <em>Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta</em>' containment reference.
	 * @see #getEta()
	 * @generated
	 */
	void setEta(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This reference uID determines the reference curve.
	 *                             If it points to a spar, then the eta value is considered to be a spar coordinate
	 *                             between start (eta=0) and end (eta=1) of the spar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference UID</em>' containment reference.
	 * @see #setReferenceUID(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCurvePointType_ReferenceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getReferenceUID();

	/**
	 * Sets the value of the '{@link Cpacs.CurvePointType#getReferenceUID <em>Reference UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference UID</em>' containment reference.
	 * @see #getReferenceUID()
	 * @generated
	 */
	void setReferenceUID(StringBaseType value);

} // CurvePointType
