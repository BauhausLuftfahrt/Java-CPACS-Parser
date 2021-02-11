/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfacePathType#getInnerHingePoint <em>Inner Hinge Point</em>}</li>
 *   <li>{@link Cpacs.ControlSurfacePathType#getOuterHingePoint <em>Outer Hinge Point</em>}</li>
 *   <li>{@link Cpacs.ControlSurfacePathType#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfacePathType()
 * @model extendedMetaData="name='controlSurfacePathType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfacePathType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Inner Hinge Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Hinge Point</em>' containment reference.
	 * @see #setInnerHingePoint(ControlSurfaceHingePointType)
	 * @see Cpacs.CpacsPackage#getControlSurfacePathType_InnerHingePoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='innerHingePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceHingePointType getInnerHingePoint();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfacePathType#getInnerHingePoint <em>Inner Hinge Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Hinge Point</em>' containment reference.
	 * @see #getInnerHingePoint()
	 * @generated
	 */
	void setInnerHingePoint(ControlSurfaceHingePointType value);

	/**
	 * Returns the value of the '<em><b>Outer Hinge Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Hinge Point</em>' containment reference.
	 * @see #setOuterHingePoint(ControlSurfaceHingePointType)
	 * @see Cpacs.CpacsPackage#getControlSurfacePathType_OuterHingePoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outerHingePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceHingePointType getOuterHingePoint();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfacePathType#getOuterHingePoint <em>Outer Hinge Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Hinge Point</em>' containment reference.
	 * @see #getOuterHingePoint()
	 * @generated
	 */
	void setOuterHingePoint(ControlSurfaceHingePointType value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference.
	 * @see #setSteps(ControlSurfaceStepsType)
	 * @see Cpacs.CpacsPackage#getControlSurfacePathType_Steps()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='steps' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceStepsType getSteps();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfacePathType#getSteps <em>Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steps</em>' containment reference.
	 * @see #getSteps()
	 * @generated
	 */
	void setSteps(ControlSurfaceStepsType value);

} // ControlSurfacePathType
