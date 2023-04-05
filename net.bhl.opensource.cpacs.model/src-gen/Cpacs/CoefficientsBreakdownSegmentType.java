/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coefficients Breakdown Segment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CoefficientsBreakdownSegmentType#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownSegmentType#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownSegmentType#getStrips <em>Strips</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownSegmentType#getRemainingContributions <em>Remaining Contributions</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownSegmentType()
 * @model extendedMetaData="name='coefficientsBreakdownSegmentType' kind='elementOnly'"
 * @generated
 */
public interface CoefficientsBreakdownSegmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Segment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference to a wing segment uID
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Segment UID</em>' containment reference.
	 * @see #setSegmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownSegmentType_SegmentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSegmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownSegmentType#getSegmentUID <em>Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment UID</em>' containment reference.
	 * @see #getSegmentUID()
	 * @generated
	 */
	void setSegmentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficients</em>' containment reference.
	 * @see #setCoefficients(AeroCaseCoefficientsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownSegmentType_Coefficients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroCaseCoefficientsType getCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownSegmentType#getCoefficients <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficients</em>' containment reference.
	 * @see #getCoefficients()
	 * @generated
	 */
	void setCoefficients(AeroCaseCoefficientsType value);

	/**
	 * Returns the value of the '<em><b>Strips</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strips</em>' containment reference.
	 * @see #setStrips(CoefficientsBreakdownStripsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownSegmentType_Strips()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='strips' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientsBreakdownStripsType getStrips();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownSegmentType#getStrips <em>Strips</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strips</em>' containment reference.
	 * @see #getStrips()
	 * @generated
	 */
	void setStrips(CoefficientsBreakdownStripsType value);

	/**
	 * Returns the value of the '<em><b>Remaining Contributions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Contributions</em>' containment reference.
	 * @see #setRemainingContributions(RemainingContributionsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownSegmentType_RemainingContributions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remainingContributions' namespace='##targetNamespace'"
	 * @generated
	 */
	RemainingContributionsType getRemainingContributions();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownSegmentType#getRemainingContributions <em>Remaining Contributions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Contributions</em>' containment reference.
	 * @see #getRemainingContributions()
	 * @generated
	 */
	void setRemainingContributions(RemainingContributionsType value);

} // CoefficientsBreakdownSegmentType
