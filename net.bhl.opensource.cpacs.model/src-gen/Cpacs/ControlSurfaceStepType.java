/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceStepType#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceStepType#getInnerHingeTranslation <em>Inner Hinge Translation</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceStepType#getOuterHingeTranslation <em>Outer Hinge Translation</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceStepType#getHingeLineRotation <em>Hinge Line Rotation</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceStepType()
 * @model extendedMetaData="name='controlSurfaceStepType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceStepType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The control parameter links a generic floating point value to
	 *                             a certain status of a control device (e.g. control surface, landing gear, suction
	 *                             system, brake parachute, ...). See the documentation of the global CPACS-Element for
	 *                             further information.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameter</em>' containment reference.
	 * @see #setControlParameter(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceStepType_ControlParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getControlParameter();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceStepType#getControlParameter <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameter</em>' containment reference.
	 * @see #getControlParameter()
	 * @generated
	 */
	void setControlParameter(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Inner Hinge Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Translation of the inner hinge line point
	 *                                 within the hinge line coordinate system. Defaults to zero. Not
	 *                                 allowed for spoilers!
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inner Hinge Translation</em>' containment reference.
	 * @see #setInnerHingeTranslation(PointType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceStepType_InnerHingeTranslation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='innerHingeTranslation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getInnerHingeTranslation();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceStepType#getInnerHingeTranslation <em>Inner Hinge Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Hinge Translation</em>' containment reference.
	 * @see #getInnerHingeTranslation()
	 * @generated
	 */
	void setInnerHingeTranslation(PointType value);

	/**
	 * Returns the value of the '<em><b>Outer Hinge Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Translation of the outer hinge line point
	 *                                 within the hinge line coordinate system. Defaults to the values
	 *                                 of the inner hinge line point. Not allowed for spoilers!
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outer Hinge Translation</em>' containment reference.
	 * @see #setOuterHingeTranslation(PointXZType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceStepType_OuterHingeTranslation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outerHingeTranslation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXZType getOuterHingeTranslation();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceStepType#getOuterHingeTranslation <em>Outer Hinge Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Hinge Translation</em>' containment reference.
	 * @see #getOuterHingeTranslation()
	 * @generated
	 */
	void setOuterHingeTranslation(PointXZType value);

	/**
	 * Returns the value of the '<em><b>Hinge Line Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Positive rotation around the hinge line,
	 *                                 heading from the inner to the outer border. Defaults to zero.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hinge Line Rotation</em>' containment reference.
	 * @see #setHingeLineRotation(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceStepType_HingeLineRotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hingeLineRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHingeLineRotation();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceStepType#getHingeLineRotation <em>Hinge Line Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinge Line Rotation</em>' containment reference.
	 * @see #getHingeLineRotation()
	 * @generated
	 */
	void setHingeLineRotation(DoubleBaseType value);

} // ControlSurfaceStepType
