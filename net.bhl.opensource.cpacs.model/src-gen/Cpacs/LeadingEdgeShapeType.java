/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leading Edge Shape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LeadingEdgeShapeType#getRelHeightLE <em>Rel Height LE</em>}</li>
 *   <li>{@link Cpacs.LeadingEdgeShapeType#getXsiUpperSkin <em>Xsi Upper Skin</em>}</li>
 *   <li>{@link Cpacs.LeadingEdgeShapeType#getXsiLowerSkin <em>Xsi Lower Skin</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLeadingEdgeShapeType()
 * @model extendedMetaData="name='leadingEdgeShapeType' kind='elementOnly'"
 * @generated
 */
public interface LeadingEdgeShapeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rel Height LE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative height of the leading edge of the TED,
	 *                                 based on the airfoil height of the parent at this position.
	 *                                 Optional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Height LE</em>' containment reference.
	 * @see #setRelHeightLE(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLeadingEdgeShapeType_RelHeightLE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relHeightLE' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRelHeightLE();

	/**
	 * Sets the value of the '{@link Cpacs.LeadingEdgeShapeType#getRelHeightLE <em>Rel Height LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Height LE</em>' containment reference.
	 * @see #getRelHeightLE()
	 * @generated
	 */
	void setRelHeightLE(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Xsi Upper Skin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise upper skin position, of the
	 *                                 border, where the airfoil of the TED is equivalent of the
	 *                                 airfoil from the parent. Measured from the rear to the front (0
	 *                                 = TED trailing edge; 1 = TED leading edge). Values form the
	 *                                 outer border default to the value of the inner border. Optional.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi Upper Skin</em>' containment reference.
	 * @see #setXsiUpperSkin(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLeadingEdgeShapeType_XsiUpperSkin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xsiUpperSkin' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsiUpperSkin();

	/**
	 * Sets the value of the '{@link Cpacs.LeadingEdgeShapeType#getXsiUpperSkin <em>Xsi Upper Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi Upper Skin</em>' containment reference.
	 * @see #getXsiUpperSkin()
	 * @generated
	 */
	void setXsiUpperSkin(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Xsi Lower Skin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise lower skin position, of the
	 *                                 border, where the airfoil of the TED is equivalent of the
	 *                                 airfoil from the parent. Measured from the rear to the front (0
	 *                                 = TED trailing edge; 1 = TED leading edge). Values form the
	 *                                 outer border default to the value of the inner border. Optional.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi Lower Skin</em>' containment reference.
	 * @see #setXsiLowerSkin(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLeadingEdgeShapeType_XsiLowerSkin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xsiLowerSkin' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsiLowerSkin();

	/**
	 * Sets the value of the '{@link Cpacs.LeadingEdgeShapeType#getXsiLowerSkin <em>Xsi Lower Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi Lower Skin</em>' containment reference.
	 * @see #getXsiLowerSkin()
	 * @generated
	 */
	void setXsiLowerSkin(DoubleBaseType value);

} // LeadingEdgeShapeType
