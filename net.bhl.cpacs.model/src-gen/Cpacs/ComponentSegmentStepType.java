/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Segment Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ComponentSegmentStepType#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentStepType#getHingeTranslation <em>Hinge Translation</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentStepType#getHingeLineRotation <em>Hinge Line Rotation</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getComponentSegmentStepType()
 * @model extendedMetaData="name='componentSegmentStepType' kind='elementOnly'"
 * @generated
 */
public interface ComponentSegmentStepType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The control parameter is used to reference the 
	 *                                 state of a control device, e.g. in the load
	 *                                 case description. Can have any value and is NOT limited to the
	 *                                 range of -1 to 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameter</em>' containment reference.
	 * @see #setControlParameter(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentStepType_ControlParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getControlParameter();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentStepType#getControlParameter <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameter</em>' containment reference.
	 * @see #getControlParameter()
	 * @generated
	 */
	void setControlParameter(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Hinge Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Translation along the x-, y- and z-Coordinate
	 *                                 of the rotated hinge coordinate system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hinge Translation</em>' containment reference.
	 * @see #setHingeTranslation(PointXYZType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentStepType_HingeTranslation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hingeTranslation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getHingeTranslation();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentStepType#getHingeTranslation <em>Hinge Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinge Translation</em>' containment reference.
	 * @see #getHingeTranslation()
	 * @generated
	 */
	void setHingeTranslation(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Hinge Line Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotation around the hinge line.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hinge Line Rotation</em>' containment reference.
	 * @see #setHingeLineRotation(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentStepType_HingeLineRotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hingeLineRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHingeLineRotation();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentStepType#getHingeLineRotation <em>Hinge Line Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinge Line Rotation</em>' containment reference.
	 * @see #getHingeLineRotation()
	 * @generated
	 */
	void setHingeLineRotation(DoubleBaseType value);

} // ComponentSegmentStepType
