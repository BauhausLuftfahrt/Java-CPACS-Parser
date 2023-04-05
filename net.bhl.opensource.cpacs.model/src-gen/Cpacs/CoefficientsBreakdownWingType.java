/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coefficients Breakdown Wing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CoefficientsBreakdownWingType#getWingUID <em>Wing UID</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownWingType#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownWingType#getSegments <em>Segments</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownWingType#getRemainingContributions <em>Remaining Contributions</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownWingType()
 * @model extendedMetaData="name='coefficientsBreakdownWingType' kind='elementOnly'"
 * @generated
 */
public interface CoefficientsBreakdownWingType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference to a wing uID
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wing UID</em>' containment reference.
	 * @see #setWingUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownWingType_WingUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWingUID();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownWingType#getWingUID <em>Wing UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing UID</em>' containment reference.
	 * @see #getWingUID()
	 * @generated
	 */
	void setWingUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficients</em>' containment reference.
	 * @see #setCoefficients(AeroCaseCoefficientsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownWingType_Coefficients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroCaseCoefficientsType getCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownWingType#getCoefficients <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficients</em>' containment reference.
	 * @see #getCoefficients()
	 * @generated
	 */
	void setCoefficients(AeroCaseCoefficientsType value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference.
	 * @see #setSegments(CoefficientsBreakdownWingSegmentsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownWingType_Segments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='segments' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsBreakdownWingSegmentsType getSegments();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownWingType#getSegments <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' containment reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(CoefficientsBreakdownWingSegmentsType value);

	/**
	 * Returns the value of the '<em><b>Remaining Contributions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Contributions</em>' containment reference.
	 * @see #setRemainingContributions(RemainingContributionsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownWingType_RemainingContributions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remainingContributions' namespace='##targetNamespace'"
	 * @generated
	 */
	RemainingContributionsType getRemainingContributions();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownWingType#getRemainingContributions <em>Remaining Contributions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Contributions</em>' containment reference.
	 * @see #getRemainingContributions()
	 * @generated
	 */
	void setRemainingContributions(RemainingContributionsType value);

} // CoefficientsBreakdownWingType
