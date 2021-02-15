/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Damping Derivatives Rates Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DampingDerivativesRatesArrayType#getPositiveRates <em>Positive Rates</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesRatesArrayType#getNegativeRates <em>Negative Rates</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesRatesArrayType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDampingDerivativesRatesArrayType()
 * @model extendedMetaData="name='dampingDerivativesRatesArrayType' kind='elementOnly'"
 * @generated
 */
public interface DampingDerivativesRatesArrayType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Positive Rates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Rates</em>' containment reference.
	 * @see #setPositiveRates(DampingDerivativesType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesRatesArrayType_PositiveRates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positiveRates' namespace='##targetNamespace'"
	 * @generated
	 */
	DampingDerivativesType getPositiveRates();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesRatesArrayType#getPositiveRates <em>Positive Rates</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getDampingDerivativesRatesArrayType_NegativeRates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='negativeRates' namespace='##targetNamespace'"
	 * @generated
	 */
	DampingDerivativesType getNegativeRates();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesRatesArrayType#getNegativeRates <em>Negative Rates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative Rates</em>' containment reference.
	 * @see #getNegativeRates()
	 * @generated
	 */
	void setNegativeRates(DampingDerivativesType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesRatesArrayType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesRatesArrayType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // DampingDerivativesRatesArrayType
