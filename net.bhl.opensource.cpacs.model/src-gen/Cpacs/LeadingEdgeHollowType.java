/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leading Edge Hollow Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LeadingEdgeHollowType#getRelHeightTE <em>Rel Height TE</em>}</li>
 *   <li>{@link Cpacs.LeadingEdgeHollowType#getXsiTE <em>Xsi TE</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLeadingEdgeHollowType()
 * @model extendedMetaData="name='leadingEdgeHollowType' kind='elementOnly'"
 * @generated
 */
public interface LeadingEdgeHollowType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rel Height TE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative height of the most forward point of
	 *                                 the LED's rear part, based on the airfoil height of the parent
	 *                                 at this position. Optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Height TE</em>' containment reference.
	 * @see #setRelHeightTE(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLeadingEdgeHollowType_RelHeightTE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relHeightTE' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRelHeightTE();

	/**
	 * Sets the value of the '{@link Cpacs.LeadingEdgeHollowType#getRelHeightTE <em>Rel Height TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Height TE</em>' containment reference.
	 * @see #getRelHeightTE()
	 * @generated
	 */
	void setRelHeightTE(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Xsi TE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise position of the most
	 *                                 forward point of the LED's rear part, based on the chord of the
	 *                                 parent at this position. Optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi TE</em>' containment reference.
	 * @see #setXsiTE(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLeadingEdgeHollowType_XsiTE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xsiTE' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsiTE();

	/**
	 * Sets the value of the '{@link Cpacs.LeadingEdgeHollowType#getXsiTE <em>Xsi TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi TE</em>' containment reference.
	 * @see #getXsiTE()
	 * @generated
	 */
	void setXsiTE(DoubleBaseType value);

} // LeadingEdgeHollowType
