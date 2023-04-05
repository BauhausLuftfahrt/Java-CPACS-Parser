/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coefficients Breakdown Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CoefficientsBreakdownType#getWings <em>Wings</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownType#getOtherComponents <em>Other Components</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownType#getRemainingContributions <em>Remaining Contributions</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownType#getOtherComponents1 <em>Other Components1</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownType#getRemainingContributions1 <em>Remaining Contributions1</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownType()
 * @model extendedMetaData="name='coefficientsBreakdownType' kind='elementOnly'"
 * @generated
 */
public interface CoefficientsBreakdownType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wings</em>' containment reference.
	 * @see #setWings(CoefficientsBreakdownWingsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownType_Wings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wings' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsBreakdownWingsType getWings();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownType#getWings <em>Wings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wings</em>' containment reference.
	 * @see #getWings()
	 * @generated
	 */
	void setWings(CoefficientsBreakdownWingsType value);

	/**
	 * Returns the value of the '<em><b>Other Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Components</em>' containment reference.
	 * @see #setOtherComponents(CoefficientsBreakdownComponentsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownType_OtherComponents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherComponents' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsBreakdownComponentsType getOtherComponents();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownType#getOtherComponents <em>Other Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Components</em>' containment reference.
	 * @see #getOtherComponents()
	 * @generated
	 */
	void setOtherComponents(CoefficientsBreakdownComponentsType value);

	/**
	 * Returns the value of the '<em><b>Remaining Contributions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Contributions</em>' containment reference.
	 * @see #setRemainingContributions(RemainingContributionsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownType_RemainingContributions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remainingContributions' namespace='##targetNamespace'"
	 * @generated
	 */
	RemainingContributionsType getRemainingContributions();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownType#getRemainingContributions <em>Remaining Contributions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Contributions</em>' containment reference.
	 * @see #getRemainingContributions()
	 * @generated
	 */
	void setRemainingContributions(RemainingContributionsType value);

	/**
	 * Returns the value of the '<em><b>Other Components1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Components1</em>' containment reference.
	 * @see #setOtherComponents1(CoefficientsBreakdownComponentsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownType_OtherComponents1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherComponents' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsBreakdownComponentsType getOtherComponents1();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownType#getOtherComponents1 <em>Other Components1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Components1</em>' containment reference.
	 * @see #getOtherComponents1()
	 * @generated
	 */
	void setOtherComponents1(CoefficientsBreakdownComponentsType value);

	/**
	 * Returns the value of the '<em><b>Remaining Contributions1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Contributions1</em>' containment reference.
	 * @see #setRemainingContributions1(RemainingContributionsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownType_RemainingContributions1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remainingContributions' namespace='##targetNamespace'"
	 * @generated
	 */
	RemainingContributionsType getRemainingContributions1();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownType#getRemainingContributions1 <em>Remaining Contributions1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Contributions1</em>' containment reference.
	 * @see #getRemainingContributions1()
	 * @generated
	 */
	void setRemainingContributions1(RemainingContributionsType value);

} // CoefficientsBreakdownType
