/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blocked DOF Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.BlockedDOFType#getPositive <em>Positive</em>}</li>
 *   <li>{@link Cpacs.BlockedDOFType#getNegative <em>Negative</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getBlockedDOFType()
 * @model extendedMetaData="name='blockedDOFType' kind='elementOnly'"
 * @generated
 */
public interface BlockedDOFType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Positive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive</em>' containment reference.
	 * @see #setPositive(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getBlockedDOFType_Positive()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positive' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getPositive();

	/**
	 * Sets the value of the '{@link Cpacs.BlockedDOFType#getPositive <em>Positive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive</em>' containment reference.
	 * @see #getPositive()
	 * @generated
	 */
	void setPositive(BooleanBaseType value);

	/**
	 * Returns the value of the '<em><b>Negative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative</em>' containment reference.
	 * @see #setNegative(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getBlockedDOFType_Negative()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='negative' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getNegative();

	/**
	 * Sets the value of the '{@link Cpacs.BlockedDOFType#getNegative <em>Negative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative</em>' containment reference.
	 * @see #getNegative()
	 * @generated
	 */
	void setNegative(BooleanBaseType value);

} // BlockedDOFType
