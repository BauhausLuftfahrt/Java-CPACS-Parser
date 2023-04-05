/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearControlType#getRetractAngle <em>Retract Angle</em>}</li>
 *   <li>{@link Cpacs.LandingGearControlType#getControlFunctions <em>Control Functions</em>}</li>
 *   <li>{@link Cpacs.LandingGearControlType#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearControlType()
 * @model extendedMetaData="name='landingGearControlType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearControlType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Retract Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Retraction angle of the main landing
	 *                                 gear. Equals a rotation around the
	 *                                 global z-axis in degrees. 0 = retraction
	 *                                 to the front; 90 = retraction to the
	 *                                 left; 180 = retraction to the rear; 270
	 *                                 = retraction to the right.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retract Angle</em>' containment reference.
	 * @see #setRetractAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearControlType_RetractAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='retractAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRetractAngle();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearControlType#getRetractAngle <em>Retract Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retract Angle</em>' containment reference.
	 * @see #getRetractAngle()
	 * @generated
	 */
	void setRetractAngle(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Functions</em>' containment reference.
	 * @see #setControlFunctions(LandingGearControlFunctionsType)
	 * @see Cpacs.CpacsPackage#getLandingGearControlType_ControlFunctions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlFunctions' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingGearControlFunctionsType getControlFunctions();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearControlType#getControlFunctions <em>Control Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Functions</em>' containment reference.
	 * @see #getControlFunctions()
	 * @generated
	 */
	void setControlFunctions(LandingGearControlFunctionsType value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Distance of the center of rotation to the top of the main strut
	 *                                 for retracting and extending the landing gear. I.e., a value of
	 *                                 0 means that the landing gear will rotate around the upper end
	 *                                 of the main strut during retraction. If this value is greater
	 *                                 than 0, the center of rotation is shifted by this value above
	 *                                 the main strut end point (translation along the main strut axis).
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearControlType_Offset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offset' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOffset();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearControlType#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(DoubleBaseType value);

} // LandingGearControlType
