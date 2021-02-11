/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Hinge Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceHingePointType#getHingeXsi <em>Hinge Xsi</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceHingePointType#getHingeRelHeight <em>Hinge Rel Height</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceHingePointType()
 * @model extendedMetaData="name='controlSurfaceHingePointType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceHingePointType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Hinge Xsi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise coordinate (xsi) of the
	 *                                 hinge line point. Reference is the parent chord.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hinge Xsi</em>' containment reference.
	 * @see #setHingeXsi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceHingePointType_HingeXsi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hingeXsi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHingeXsi();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceHingePointType#getHingeXsi <em>Hinge Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinge Xsi</em>' containment reference.
	 * @see #getHingeXsi()
	 * @generated
	 */
	void setHingeXsi(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Hinge Rel Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative height of the hinge line point.
	 *                                 Reference is the parent airfoil height.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hinge Rel Height</em>' containment reference.
	 * @see #setHingeRelHeight(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceHingePointType_HingeRelHeight()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hingeRelHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHingeRelHeight();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceHingePointType#getHingeRelHeight <em>Hinge Rel Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinge Rel Height</em>' containment reference.
	 * @see #getHingeRelHeight()
	 * @generated
	 */
	void setHingeRelHeight(DoubleBaseType value);

} // ControlSurfaceHingePointType
