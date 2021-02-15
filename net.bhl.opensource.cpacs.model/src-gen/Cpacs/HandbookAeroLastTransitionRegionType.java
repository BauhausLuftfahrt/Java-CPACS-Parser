/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handbook Aero Last Transition Region Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.HandbookAeroLastTransitionRegionType#getLaminarFormFactor <em>Laminar Form Factor</em>}</li>
 *   <li>{@link Cpacs.HandbookAeroLastTransitionRegionType#getTurbulentFormFactor <em>Turbulent Form Factor</em>}</li>
 *   <li>{@link Cpacs.HandbookAeroLastTransitionRegionType#getPolynomialCoefficients <em>Polynomial Coefficients</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getHandbookAeroLastTransitionRegionType()
 * @model extendedMetaData="name='handbookAeroLastTransitionRegionType' kind='elementOnly'"
 * @generated
 */
public interface HandbookAeroLastTransitionRegionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Laminar Form Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Form Factor for the laminar wing region
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laminar Form Factor</em>' containment reference.
	 * @see #setLaminarFormFactor(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getHandbookAeroLastTransitionRegionType_LaminarFormFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='laminarFormFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLaminarFormFactor();

	/**
	 * Sets the value of the '{@link Cpacs.HandbookAeroLastTransitionRegionType#getLaminarFormFactor <em>Laminar Form Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laminar Form Factor</em>' containment reference.
	 * @see #getLaminarFormFactor()
	 * @generated
	 */
	void setLaminarFormFactor(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Turbulent Form Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Form Factor for the turbulent wing region
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Turbulent Form Factor</em>' containment reference.
	 * @see #setTurbulentFormFactor(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getHandbookAeroLastTransitionRegionType_TurbulentFormFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='turbulentFormFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTurbulentFormFactor();

	/**
	 * Sets the value of the '{@link Cpacs.HandbookAeroLastTransitionRegionType#getTurbulentFormFactor <em>Turbulent Form Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turbulent Form Factor</em>' containment reference.
	 * @see #getTurbulentFormFactor()
	 * @generated
	 */
	void setTurbulentFormFactor(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Polynomial Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polynomial Coefficients</em>' containment reference.
	 * @see #setPolynomialCoefficients(HandbookAeroPolynomialCoefficientsType)
	 * @see Cpacs.CpacsPackage#getHandbookAeroLastTransitionRegionType_PolynomialCoefficients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='polynomialCoefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	HandbookAeroPolynomialCoefficientsType getPolynomialCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.HandbookAeroLastTransitionRegionType#getPolynomialCoefficients <em>Polynomial Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polynomial Coefficients</em>' containment reference.
	 * @see #getPolynomialCoefficients()
	 * @generated
	 */
	void setPolynomialCoefficients(HandbookAeroPolynomialCoefficientsType value);

} // HandbookAeroLastTransitionRegionType
