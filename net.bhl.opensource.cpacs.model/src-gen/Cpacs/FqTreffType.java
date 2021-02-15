/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fq Treff Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FqTreffType#getTreff <em>Treff</em>}</li>
 *   <li>{@link Cpacs.FqTreffType#getTtan <em>Ttan</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFqTreffType()
 * @model extendedMetaData="name='fqTreffType' kind='elementOnly'"
 * @generated
 */
public interface FqTreffType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Treff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * effective roll time constant [s]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treff</em>' containment reference.
	 * @see #setTreff(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqTreffType_Treff()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='treff' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTreff();

	/**
	 * Sets the value of the '{@link Cpacs.FqTreffType#getTreff <em>Treff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treff</em>' containment reference.
	 * @see #getTreff()
	 * @generated
	 */
	void setTreff(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Ttan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * time where tangent of bank angle step response
	 *                                 is placed [s]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ttan</em>' containment reference.
	 * @see #setTtan(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqTreffType_Ttan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ttan' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTtan();

	/**
	 * Sets the value of the '{@link Cpacs.FqTreffType#getTtan <em>Ttan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ttan</em>' containment reference.
	 * @see #getTtan()
	 * @generated
	 */
	void setTtan(DoubleBaseType value);

} // FqTreffType
