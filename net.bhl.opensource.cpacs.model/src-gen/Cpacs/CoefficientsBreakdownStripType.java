/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coefficients Breakdown Strip Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CoefficientsBreakdownStripType#getToSegmentEta <em>To Segment Eta</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownStripType#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownStripType#getReference <em>Reference</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownStripType#getChordwiseParts <em>Chordwise Parts</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownStripType#getRemainingContributions <em>Remaining Contributions</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownStripType()
 * @model extendedMetaData="name='coefficientsBreakdownStripType' kind='elementOnly'"
 * @generated
 */
public interface CoefficientsBreakdownStripType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>To Segment Eta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Spanwise coordinate eta in the segment coordinate system to define the end of the strip
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Segment Eta</em>' containment reference.
	 * @see #setToSegmentEta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownStripType_ToSegmentEta()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toSegmentEta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getToSegmentEta();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownStripType#getToSegmentEta <em>To Segment Eta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Segment Eta</em>' containment reference.
	 * @see #getToSegmentEta()
	 * @generated
	 */
	void setToSegmentEta(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficients</em>' containment reference.
	 * @see #setCoefficients(AeroCaseCoefficientsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownStripType_Coefficients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroCaseCoefficientsType getCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownStripType#getCoefficients <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficients</em>' containment reference.
	 * @see #getCoefficients()
	 * @generated
	 */
	void setCoefficients(AeroCaseCoefficientsType value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(CoefficientReferenceType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownStripType_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientReferenceType getReference();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownStripType#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(CoefficientReferenceType value);

	/**
	 * Returns the value of the '<em><b>Chordwise Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chordwise Parts</em>' containment reference.
	 * @see #setChordwiseParts(ChordwisePartsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownStripType_ChordwiseParts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chordwiseParts' namespace='##targetNamespace'"
	 * @generated
	 */
	ChordwisePartsType getChordwiseParts();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownStripType#getChordwiseParts <em>Chordwise Parts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chordwise Parts</em>' containment reference.
	 * @see #getChordwiseParts()
	 * @generated
	 */
	void setChordwiseParts(ChordwisePartsType value);

	/**
	 * Returns the value of the '<em><b>Remaining Contributions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Contributions</em>' containment reference.
	 * @see #setRemainingContributions(RemainingContributionsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownStripType_RemainingContributions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remainingContributions' namespace='##targetNamespace'"
	 * @generated
	 */
	RemainingContributionsType getRemainingContributions();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownStripType#getRemainingContributions <em>Remaining Contributions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Contributions</em>' containment reference.
	 * @see #getRemainingContributions()
	 * @generated
	 */
	void setRemainingContributions(RemainingContributionsType value);

} // CoefficientsBreakdownStripType
