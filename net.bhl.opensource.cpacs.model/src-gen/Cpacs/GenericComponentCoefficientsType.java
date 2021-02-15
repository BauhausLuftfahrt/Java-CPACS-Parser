/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Component Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GenericComponentCoefficientsType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.GenericComponentCoefficientsType#getCoefficients <em>Coefficients</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGenericComponentCoefficientsType()
 * @model extendedMetaData="name='genericComponentCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface GenericComponentCoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Parent UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent UID</em>' containment reference.
	 * @see #setParentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getGenericComponentCoefficientsType_ParentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.GenericComponentCoefficientsType#getParentUID <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent UID</em>' containment reference.
	 * @see #getParentUID()
	 * @generated
	 */
	void setParentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficients</em>' containment reference.
	 * @see #setCoefficients(CoefficientsType)
	 * @see Cpacs.CpacsPackage#getGenericComponentCoefficientsType_Coefficients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsType getCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.GenericComponentCoefficientsType#getCoefficients <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficients</em>' containment reference.
	 * @see #getCoefficients()
	 * @generated
	 */
	void setCoefficients(CoefficientsType value);

} // GenericComponentCoefficientsType
