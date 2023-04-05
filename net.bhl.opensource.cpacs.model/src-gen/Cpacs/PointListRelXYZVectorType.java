/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point List Rel XYZ Vector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PointListRelXYZVectorType#getRX <em>RX</em>}</li>
 *   <li>{@link Cpacs.PointListRelXYZVectorType#getRY <em>RY</em>}</li>
 *   <li>{@link Cpacs.PointListRelXYZVectorType#getRZ <em>RZ</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPointListRelXYZVectorType()
 * @model extendedMetaData="name='pointListRelXYZVectorType' kind='elementOnly'"
 * @generated
 */
public interface PointListRelXYZVectorType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>RX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector of rX coordinates. Relative
	 *                                 circumferential coordinate on wing, fuselage or nacelle profile
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RX</em>' containment reference.
	 * @see #setRX(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getPointListRelXYZVectorType_RX()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rX' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getRX();

	/**
	 * Sets the value of the '{@link Cpacs.PointListRelXYZVectorType#getRX <em>RX</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RX</em>' containment reference.
	 * @see #getRX()
	 * @generated
	 */
	void setRX(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>RY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector of rY coordinates. Relative span
	 *                                 coordinate along a segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RY</em>' containment reference.
	 * @see #setRY(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getPointListRelXYZVectorType_RY()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rY' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getRY();

	/**
	 * Sets the value of the '{@link Cpacs.PointListRelXYZVectorType#getRY <em>RY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RY</em>' containment reference.
	 * @see #getRY()
	 * @generated
	 */
	void setRY(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>RZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector of rZ coordinates. Relative coordinate
	 *                                 normal to the linear strake (normalised with chordlength /
	 *                                 diameter c*)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RZ</em>' containment reference.
	 * @see #setRZ(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getPointListRelXYZVectorType_RZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rZ' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getRZ();

	/**
	 * Sets the value of the '{@link Cpacs.PointListRelXYZVectorType#getRZ <em>RZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RZ</em>' containment reference.
	 * @see #getRZ()
	 * @generated
	 */
	void setRZ(StringVectorBaseType value);

} // PointListRelXYZVectorType
