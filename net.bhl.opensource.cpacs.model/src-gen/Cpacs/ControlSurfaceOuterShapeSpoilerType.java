/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Outer Shape Spoiler Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceOuterShapeSpoilerType#getInnerBorder <em>Inner Border</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceOuterShapeSpoilerType#getOuterBorder <em>Outer Border</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceOuterShapeSpoilerType#getIntermediateAirfoils <em>Intermediate Airfoils</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceOuterShapeSpoilerType()
 * @model extendedMetaData="name='controlSurfaceOuterShapeSpoilerType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceOuterShapeSpoilerType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Inner Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Border</em>' containment reference.
	 * @see #setInnerBorder(ControlSurfaceBorderSpoilerType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceOuterShapeSpoilerType_InnerBorder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='innerBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceBorderSpoilerType getInnerBorder();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceOuterShapeSpoilerType#getInnerBorder <em>Inner Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Border</em>' containment reference.
	 * @see #getInnerBorder()
	 * @generated
	 */
	void setInnerBorder(ControlSurfaceBorderSpoilerType value);

	/**
	 * Returns the value of the '<em><b>Outer Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Border</em>' containment reference.
	 * @see #setOuterBorder(ControlSurfaceBorderSpoilerType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceOuterShapeSpoilerType_OuterBorder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outerBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceBorderSpoilerType getOuterBorder();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceOuterShapeSpoilerType#getOuterBorder <em>Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Border</em>' containment reference.
	 * @see #getOuterBorder()
	 * @generated
	 */
	void setOuterBorder(ControlSurfaceBorderSpoilerType value);

	/**
	 * Returns the value of the '<em><b>Intermediate Airfoils</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Airfoils</em>' containment reference.
	 * @see #setIntermediateAirfoils(ControlSurfaceContoursType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceOuterShapeSpoilerType_IntermediateAirfoils()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intermediateAirfoils' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceContoursType getIntermediateAirfoils();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceOuterShapeSpoilerType#getIntermediateAirfoils <em>Intermediate Airfoils</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediate Airfoils</em>' containment reference.
	 * @see #getIntermediateAirfoils()
	 * @generated
	 */
	void setIntermediateAirfoils(ControlSurfaceContoursType value);

} // ControlSurfaceOuterShapeSpoilerType
