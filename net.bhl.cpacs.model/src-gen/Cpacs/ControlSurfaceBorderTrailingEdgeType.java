/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Border Trailing Edge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceBorderTrailingEdgeType#getEtaLE <em>Eta LE</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderTrailingEdgeType#getEtaTE <em>Eta TE</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderTrailingEdgeType#getXsiLE <em>Xsi LE</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderTrailingEdgeType#getInnerShape <em>Inner Shape</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderTrailingEdgeType#getLeadingEdgeShape <em>Leading Edge Shape</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderTrailingEdgeType#getAirfoil <em>Airfoil</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceBorderTrailingEdgeType()
 * @model extendedMetaData="name='controlSurfaceBorderTrailingEdgeType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceBorderTrailingEdgeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Eta LE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise inner/outer position of the
	 *                                 leading edge of the control surface. Reference is eta/xsi from
	 *                                 the parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta LE</em>' containment reference.
	 * @see #setEtaLE(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderTrailingEdgeType_EtaLE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='etaLE' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEtaLE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderTrailingEdgeType#getEtaLE <em>Eta LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta LE</em>' containment reference.
	 * @see #getEtaLE()
	 * @generated
	 */
	void setEtaLE(EtaIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Eta TE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise inner/outer position of the
	 *                                 trailing edge of the control surface. Reference is eta/xsi from
	 *                                 the parent. Defaults to 'etaLE'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta TE</em>' containment reference.
	 * @see #setEtaTE(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderTrailingEdgeType_EtaTE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='etaTE' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEtaTE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderTrailingEdgeType#getEtaTE <em>Eta TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta TE</em>' containment reference.
	 * @see #getEtaTE()
	 * @generated
	 */
	void setEtaTE(EtaIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Xsi LE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise inner/outer position of the
	 *                                 leading edge of the control surface. Reference is eta/xsi from
	 *                                 the parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi LE</em>' containment reference.
	 * @see #setXsiLE(XsiIsoLineType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderTrailingEdgeType_XsiLE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xsiLE' namespace='##targetNamespace'"
	 * @generated
	 */
	XsiIsoLineType getXsiLE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderTrailingEdgeType#getXsiLE <em>Xsi LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi LE</em>' containment reference.
	 * @see #getXsiLE()
	 * @generated
	 */
	void setXsiLE(XsiIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Inner Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Shape</em>' containment reference.
	 * @see #setInnerShape(LeadingEdgeHollowType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderTrailingEdgeType_InnerShape()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='innerShape' namespace='##targetNamespace'"
	 * @generated
	 */
	LeadingEdgeHollowType getInnerShape();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderTrailingEdgeType#getInnerShape <em>Inner Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Shape</em>' containment reference.
	 * @see #getInnerShape()
	 * @generated
	 */
	void setInnerShape(LeadingEdgeHollowType value);

	/**
	 * Returns the value of the '<em><b>Leading Edge Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leading Edge Shape</em>' containment reference.
	 * @see #setLeadingEdgeShape(LeadingEdgeShapeType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderTrailingEdgeType_LeadingEdgeShape()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='leadingEdgeShape' namespace='##targetNamespace'"
	 * @generated
	 */
	LeadingEdgeShapeType getLeadingEdgeShape();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderTrailingEdgeType#getLeadingEdgeShape <em>Leading Edge Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leading Edge Shape</em>' containment reference.
	 * @see #getLeadingEdgeShape()
	 * @generated
	 */
	void setLeadingEdgeShape(LeadingEdgeShapeType value);

	/**
	 * Returns the value of the '<em><b>Airfoil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airfoil</em>' containment reference.
	 * @see #setAirfoil(ContourReferenceType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderTrailingEdgeType_Airfoil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airfoil' namespace='##targetNamespace'"
	 * @generated
	 */
	ContourReferenceType getAirfoil();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderTrailingEdgeType#getAirfoil <em>Airfoil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airfoil</em>' containment reference.
	 * @see #getAirfoil()
	 * @generated
	 */
	void setAirfoil(ContourReferenceType value);

} // ControlSurfaceBorderTrailingEdgeType
