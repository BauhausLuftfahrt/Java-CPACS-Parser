/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Handbook Aero Transition Region Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.HandbookAeroTransitionRegionType#getMaxReynoldsNumber <em>Max Reynolds Number</em>}</li>
 *   <li>{@link Cpacs.HandbookAeroTransitionRegionType#getLaminarFormFactor <em>Laminar Form Factor</em>}</li>
 *   <li>{@link Cpacs.HandbookAeroTransitionRegionType#getTurbulentFormFactor <em>Turbulent Form Factor</em>}</li>
 *   <li>{@link Cpacs.HandbookAeroTransitionRegionType#getPolynomialCoefficients <em>Polynomial Coefficients</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getHandbookAeroTransitionRegionType()
 * @model extendedMetaData="name='handbookAeroTransitionRegionType' kind='elementOnly'"
 * @generated
 */
public interface HandbookAeroTransitionRegionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Max Reynolds Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper limit of the RE-Region (Region ranges
	 *                                 from (including) end of previous region (or 0) to specified
	 *                                 (less than) value).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Reynolds Number</em>' containment reference.
	 * @see #setMaxReynoldsNumber(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getHandbookAeroTransitionRegionType_MaxReynoldsNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='maxReynoldsNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMaxReynoldsNumber();

	/**
	 * Sets the value of the '{@link Cpacs.HandbookAeroTransitionRegionType#getMaxReynoldsNumber <em>Max Reynolds Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Reynolds Number</em>' containment reference.
	 * @see #getMaxReynoldsNumber()
	 * @generated
	 */
	void setMaxReynoldsNumber(DoubleBaseType value);

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
	 * @see Cpacs.CpacsPackage#getHandbookAeroTransitionRegionType_LaminarFormFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='laminarFormFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLaminarFormFactor();

	/**
	 * Sets the value of the '{@link Cpacs.HandbookAeroTransitionRegionType#getLaminarFormFactor <em>Laminar Form Factor</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getHandbookAeroTransitionRegionType_TurbulentFormFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='turbulentFormFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTurbulentFormFactor();

	/**
	 * Sets the value of the '{@link Cpacs.HandbookAeroTransitionRegionType#getTurbulentFormFactor <em>Turbulent Form Factor</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getHandbookAeroTransitionRegionType_PolynomialCoefficients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='polynomialCoefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	HandbookAeroPolynomialCoefficientsType getPolynomialCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.HandbookAeroTransitionRegionType#getPolynomialCoefficients <em>Polynomial Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polynomial Coefficients</em>' containment reference.
	 * @see #getPolynomialCoefficients()
	 * @generated
	 */
	void setPolynomialCoefficients(HandbookAeroPolynomialCoefficientsType value);

} // HandbookAeroTransitionRegionType
