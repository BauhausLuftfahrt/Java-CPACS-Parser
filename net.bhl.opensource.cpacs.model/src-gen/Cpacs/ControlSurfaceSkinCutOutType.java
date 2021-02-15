/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Skin Cut Out Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceSkinCutOutType#getXsiInnerBorder <em>Xsi Inner Border</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceSkinCutOutType#getXsiOuterBorder <em>Xsi Outer Border</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceSkinCutOutType#getSparUID <em>Spar UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceSkinCutOutType()
 * @model extendedMetaData="name='controlSurfaceSkinCutOutType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceSkinCutOutType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Xsi Inner Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Xsi value of the inner border, where the cut
	 *                                     out begins.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi Inner Border</em>' containment reference.
	 * @see #setXsiInnerBorder(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceSkinCutOutType_XsiInnerBorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xsiInnerBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsiInnerBorder();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceSkinCutOutType#getXsiInnerBorder <em>Xsi Inner Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi Inner Border</em>' containment reference.
	 * @see #getXsiInnerBorder()
	 * @generated
	 */
	void setXsiInnerBorder(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Xsi Outer Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Xsi value of the outer border, where the cut
	 *                                     out begins.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi Outer Border</em>' containment reference.
	 * @see #setXsiOuterBorder(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceSkinCutOutType_XsiOuterBorder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xsiOuterBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsiOuterBorder();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceSkinCutOutType#getXsiOuterBorder <em>Xsi Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi Outer Border</em>' containment reference.
	 * @see #getXsiOuterBorder()
	 * @generated
	 */
	void setXsiOuterBorder(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Spar UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a spar, defining the skin cut
	 *                                 out.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spar UID</em>' containment reference.
	 * @see #setSparUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceSkinCutOutType_SparUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sparUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSparUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceSkinCutOutType#getSparUID <em>Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spar UID</em>' containment reference.
	 * @see #getSparUID()
	 * @generated
	 */
	void setSparUID(StringUIDBaseType value);

} // ControlSurfaceSkinCutOutType
