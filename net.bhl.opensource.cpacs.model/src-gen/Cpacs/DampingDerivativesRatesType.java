/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Damping Derivatives Rates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DampingDerivativesRatesType#getPositiveRates <em>Positive Rates</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesRatesType#getNegativeRates <em>Negative Rates</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDampingDerivativesRatesType()
 * @model extendedMetaData="name='dampingDerivativesRatesType' kind='elementOnly'"
 * @generated
 */
public interface DampingDerivativesRatesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Positive Rates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Rates</em>' containment reference.
	 * @see #setPositiveRates(DampingDerivativesType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesRatesType_PositiveRates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positiveRates' namespace='##targetNamespace'"
	 * @generated
	 */
	DampingDerivativesType getPositiveRates();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesRatesType#getPositiveRates <em>Positive Rates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Rates</em>' containment reference.
	 * @see #getPositiveRates()
	 * @generated
	 */
	void setPositiveRates(DampingDerivativesType value);

	/**
	 * Returns the value of the '<em><b>Negative Rates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Rates</em>' containment reference.
	 * @see #setNegativeRates(DampingDerivativesType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesRatesType_NegativeRates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='negativeRates' namespace='##targetNamespace'"
	 * @generated
	 */
	DampingDerivativesType getNegativeRates();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesRatesType#getNegativeRates <em>Negative Rates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative Rates</em>' containment reference.
	 * @see #getNegativeRates()
	 * @generated
	 */
	void setNegativeRates(DampingDerivativesType value);

} // DampingDerivativesRatesType
