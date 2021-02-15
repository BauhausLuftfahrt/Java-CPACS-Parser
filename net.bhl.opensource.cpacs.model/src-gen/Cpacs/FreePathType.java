/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FreePathType#getPositive <em>Positive</em>}</li>
 *   <li>{@link Cpacs.FreePathType#getNegative <em>Negative</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFreePathType()
 * @model extendedMetaData="name='freePathType' kind='elementOnly'"
 * @generated
 */
public interface FreePathType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Positive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive</em>' containment reference.
	 * @see #setPositive(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFreePathType_Positive()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positive' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositive();

	/**
	 * Sets the value of the '{@link Cpacs.FreePathType#getPositive <em>Positive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive</em>' containment reference.
	 * @see #getPositive()
	 * @generated
	 */
	void setPositive(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Negative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative</em>' containment reference.
	 * @see #setNegative(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFreePathType_Negative()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='negative' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNegative();

	/**
	 * Sets the value of the '{@link Cpacs.FreePathType#getNegative <em>Negative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative</em>' containment reference.
	 * @see #getNegative()
	 * @generated
	 */
	void setNegative(DoubleBaseType value);

} // FreePathType
