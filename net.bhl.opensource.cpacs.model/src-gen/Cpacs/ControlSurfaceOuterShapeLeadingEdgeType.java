/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Outer Shape Leading Edge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceOuterShapeLeadingEdgeType#getInnerBorder <em>Inner Border</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceOuterShapeLeadingEdgeType#getOuterBorder <em>Outer Border</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceOuterShapeLeadingEdgeType#getIntermediateAirfoils <em>Intermediate Airfoils</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceOuterShapeLeadingEdgeType()
 * @model extendedMetaData="name='controlSurfaceOuterShapeLeadingEdgeType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceOuterShapeLeadingEdgeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Inner Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Border</em>' containment reference.
	 * @see #setInnerBorder(ControlSurfaceBorderLeadingEdgeType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceOuterShapeLeadingEdgeType_InnerBorder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='innerBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceBorderLeadingEdgeType getInnerBorder();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceOuterShapeLeadingEdgeType#getInnerBorder <em>Inner Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Border</em>' containment reference.
	 * @see #getInnerBorder()
	 * @generated
	 */
	void setInnerBorder(ControlSurfaceBorderLeadingEdgeType value);

	/**
	 * Returns the value of the '<em><b>Outer Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Border</em>' containment reference.
	 * @see #setOuterBorder(ControlSurfaceBorderLeadingEdgeType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceOuterShapeLeadingEdgeType_OuterBorder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outerBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceBorderLeadingEdgeType getOuterBorder();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceOuterShapeLeadingEdgeType#getOuterBorder <em>Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Border</em>' containment reference.
	 * @see #getOuterBorder()
	 * @generated
	 */
	void setOuterBorder(ControlSurfaceBorderLeadingEdgeType value);

	/**
	 * Returns the value of the '<em><b>Intermediate Airfoils</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Airfoils</em>' containment reference.
	 * @see #setIntermediateAirfoils(ControlSurfaceContoursType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceOuterShapeLeadingEdgeType_IntermediateAirfoils()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intermediateAirfoils' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceContoursType getIntermediateAirfoils();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceOuterShapeLeadingEdgeType#getIntermediateAirfoils <em>Intermediate Airfoils</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediate Airfoils</em>' containment reference.
	 * @see #getIntermediateAirfoils()
	 * @generated
	 */
	void setIntermediateAirfoils(ControlSurfaceContoursType value);

} // ControlSurfaceOuterShapeLeadingEdgeType
