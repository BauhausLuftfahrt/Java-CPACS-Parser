/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Border Spoiler Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceBorderSpoilerType#getEtaLE <em>Eta LE</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderSpoilerType#getEtaTE <em>Eta TE</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderSpoilerType#getXsiLE <em>Xsi LE</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderSpoilerType#getXsiTE <em>Xsi TE</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderSpoilerType#getRelHeightLE <em>Rel Height LE</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderSpoilerType#getLeadingEdgeShape <em>Leading Edge Shape</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceBorderSpoilerType#getAirfoil <em>Airfoil</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceBorderSpoilerType()
 * @model extendedMetaData="name='controlSurfaceBorderSpoilerType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceBorderSpoilerType extends ComplexBaseType {
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
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderSpoilerType_EtaLE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='etaLE' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEtaLE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderSpoilerType#getEtaLE <em>Eta LE</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderSpoilerType_EtaTE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='etaTE' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaIsoLineType getEtaTE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderSpoilerType#getEtaTE <em>Eta TE</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderSpoilerType_XsiLE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xsiLE' namespace='##targetNamespace'"
	 * @generated
	 */
	XsiIsoLineType getXsiLE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderSpoilerType#getXsiLE <em>Xsi LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi LE</em>' containment reference.
	 * @see #getXsiLE()
	 * @generated
	 */
	void setXsiLE(XsiIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Xsi TE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise inner/outer position of the
	 *                                 trailing edge of the control surface. Reference is eta/xsi from
	 *                                 the parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi TE</em>' containment reference.
	 * @see #setXsiTE(XsiIsoLineType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderSpoilerType_XsiTE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xsiTE' namespace='##targetNamespace'"
	 * @generated
	 */
	XsiIsoLineType getXsiTE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderSpoilerType#getXsiTE <em>Xsi TE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi TE</em>' containment reference.
	 * @see #getXsiTE()
	 * @generated
	 */
	void setXsiTE(XsiIsoLineType value);

	/**
	 * Returns the value of the '<em><b>Rel Height LE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the relative high of lowest point of
	 *                                     the spoiler leading edge, relative to the airfoil height of the
	 *                                     parent at this position. See picture below.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Height LE</em>' containment reference.
	 * @see #setRelHeightLE(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderSpoilerType_RelHeightLE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relHeightLE' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRelHeightLE();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderSpoilerType#getRelHeightLE <em>Rel Height LE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Height LE</em>' containment reference.
	 * @see #getRelHeightLE()
	 * @generated
	 */
	void setRelHeightLE(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Leading Edge Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leading Edge Shape</em>' containment reference.
	 * @see #setLeadingEdgeShape(LeadingEdgeShapeType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderSpoilerType_LeadingEdgeShape()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='leadingEdgeShape' namespace='##targetNamespace'"
	 * @generated
	 */
	LeadingEdgeShapeType getLeadingEdgeShape();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderSpoilerType#getLeadingEdgeShape <em>Leading Edge Shape</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getControlSurfaceBorderSpoilerType_Airfoil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airfoil' namespace='##targetNamespace'"
	 * @generated
	 */
	ContourReferenceType getAirfoil();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceBorderSpoilerType#getAirfoil <em>Airfoil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airfoil</em>' containment reference.
	 * @see #getAirfoil()
	 * @generated
	 */
	void setAirfoil(ContourReferenceType value);

} // ControlSurfaceBorderSpoilerType
