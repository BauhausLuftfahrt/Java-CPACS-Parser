/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Border Leading Edge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getEtaLE <em>Eta LE</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getEtaTE <em>Eta TE</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getXsiTE <em>Xsi TE</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getXsiTEUpper <em>Xsi TE Upper</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getXsiTELower <em>Xsi TE Lower</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getInnerShape <em>Inner Shape</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getLeadingEdgeShape <em>Leading Edge Shape</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getAirfoil <em>Airfoil</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceBorderLeadingEdgeType()
 * @model extendedMetaData="name='controlSurfaceBorderLeadingEdgeType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceBorderLeadingEdgeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Eta LE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative spanwise inner/outer position of the
	 *                                 leading edge of the control surface.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta LE</em>' containment reference.
	 * @see #setEtaLE(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderLeadingEdgeType_EtaLE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='etaLE' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEtaLE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getEtaLE <em>Eta LE</em>}' containment reference.
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
	 *                                 trailing edge of the control surface. Defaults to 'etaLE'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta TE</em>' containment reference.
	 * @see #setEtaTE(EtaIsoLineType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderLeadingEdgeType_EtaTE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='etaTE' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEtaTE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getEtaTE <em>Eta TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta TE</em>' containment reference.
	 * @see #getEtaTE()
	 * @generated
	 */
	void setEtaTE(EtaIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Xsi TE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise inner/outer position of
	 *                                     the trailing edge of the control surface. Reference is eta/xsi
	 *                                     from the parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi TE</em>' containment reference.
	 * @see #setXsiTE(XsiIsoLineType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderLeadingEdgeType_XsiTE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xsiTE' namespace='##targetNamespace'"
	 * @generated
	 */
	XsiIsoLineType getXsiTE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getXsiTE <em>Xsi TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi TE</em>' containment reference.
	 * @see #getXsiTE()
	 * @generated
	 */
	void setXsiTE(XsiIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Xsi TE Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsi TE Upper</em>' containment reference.
	 * @see #setXsiTEUpper(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderLeadingEdgeType_XsiTEUpper()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xsiTEUpper' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsiTEUpper();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getXsiTEUpper <em>Xsi TE Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi TE Upper</em>' containment reference.
	 * @see #getXsiTEUpper()
	 * @generated
	 */
	void setXsiTEUpper(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Xsi TE Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xsi TE Lower</em>' containment reference.
	 * @see #setXsiTELower(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderLeadingEdgeType_XsiTELower()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xsiTELower' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsiTELower();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getXsiTELower <em>Xsi TE Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi TE Lower</em>' containment reference.
	 * @see #getXsiTELower()
	 * @generated
	 */
	void setXsiTELower(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Inner Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Shape</em>' containment reference.
	 * @see #setInnerShape(LeadingEdgeHollowType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderLeadingEdgeType_InnerShape()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='innerShape' namespace='##targetNamespace'"
	 * @generated
	 */
	LeadingEdgeHollowType getInnerShape();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getInnerShape <em>Inner Shape</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderLeadingEdgeType_LeadingEdgeShape()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='leadingEdgeShape' namespace='##targetNamespace'"
	 * @generated
	 */
	LeadingEdgeShapeType getLeadingEdgeShape();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getLeadingEdgeShape <em>Leading Edge Shape</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderLeadingEdgeType_Airfoil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airfoil' namespace='##targetNamespace'"
	 * @generated
	 */
	ContourReferenceType getAirfoil();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderLeadingEdgeType#getAirfoil <em>Airfoil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airfoil</em>' containment reference.
	 * @see #getAirfoil()
	 * @generated
	 */
	void setAirfoil(ContourReferenceType value);

} // ControlSurfaceBorderLeadingEdgeType
