/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chordwise Part Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ChordwisePartType#getInnerBorderToSegmentXsi <em>Inner Border To Segment Xsi</em>}</li>
 *   <li>{@link Cpacs.ChordwisePartType#getOuterBorderToSegmentXsi <em>Outer Border To Segment Xsi</em>}</li>
 *   <li>{@link Cpacs.ChordwisePartType#getCoefficients <em>Coefficients</em>}</li>
 *   <li>{@link Cpacs.ChordwisePartType#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getChordwisePartType()
 * @model extendedMetaData="name='chordwisePartType' kind='elementOnly'"
 * @generated
 */
public interface ChordwisePartType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Inner Border To Segment Xsi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                Chordwise coordinate xsi in the segment coordinate system to define the end position of the chordwisePart at the inner eta border
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner Border To Segment Xsi</em>' containment reference.
	 * @see #setInnerBorderToSegmentXsi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getChordwisePartType_InnerBorderToSegmentXsi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='innerBorderToSegmentXsi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getInnerBorderToSegmentXsi();

	/**
	 * Sets the value of the '{@link Cpacs.ChordwisePartType#getInnerBorderToSegmentXsi <em>Inner Border To Segment Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Border To Segment Xsi</em>' containment reference.
	 * @see #getInnerBorderToSegmentXsi()
	 * @generated
	 */
	void setInnerBorderToSegmentXsi(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Outer Border To Segment Xsi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                Chordwise coordinate xsi in the segment coordinate system to define the end position of the chordwisePart at the outer eta border
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outer Border To Segment Xsi</em>' containment reference.
	 * @see #setOuterBorderToSegmentXsi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getChordwisePartType_OuterBorderToSegmentXsi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outerBorderToSegmentXsi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOuterBorderToSegmentXsi();

	/**
	 * Sets the value of the '{@link Cpacs.ChordwisePartType#getOuterBorderToSegmentXsi <em>Outer Border To Segment Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Border To Segment Xsi</em>' containment reference.
	 * @see #getOuterBorderToSegmentXsi()
	 * @generated
	 */
	void setOuterBorderToSegmentXsi(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficients</em>' containment reference.
	 * @see #setCoefficients(AeroCaseCoefficientsType)
	 * @see Cpacs.CpacsPackage#getChordwisePartType_Coefficients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroCaseCoefficientsType getCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.ChordwisePartType#getCoefficients <em>Coefficients</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getChordwisePartType_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	CoefficientReferenceType getReference();

	/**
	 * Sets the value of the '{@link Cpacs.ChordwisePartType#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(CoefficientReferenceType value);

} // ChordwisePartType
