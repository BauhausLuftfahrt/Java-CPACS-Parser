/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Position Safety Margins Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearPositionSafetyMarginsType#getTakeOff <em>Take Off</em>}</li>
 *   <li>{@link Cpacs.LandingGearPositionSafetyMarginsType#getTouchDown <em>Touch Down</em>}</li>
 *   <li>{@link Cpacs.LandingGearPositionSafetyMarginsType#getTurnOver <em>Turn Over</em>}</li>
 *   <li>{@link Cpacs.LandingGearPositionSafetyMarginsType#getRollAngle <em>Roll Angle</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearPositionSafetyMarginsType()
 * @model extendedMetaData="name='landingGearPositionSafetyMarginsType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearPositionSafetyMarginsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Take Off</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Safety margin for landing gear x position
	 *                                 regarding tail clearance at takeoff pitch angle
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Take Off</em>' containment reference.
	 * @see #setTakeOff(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearPositionSafetyMarginsType_TakeOff()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='takeOff' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTakeOff();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearPositionSafetyMarginsType#getTakeOff <em>Take Off</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Take Off</em>' containment reference.
	 * @see #getTakeOff()
	 * @generated
	 */
	void setTakeOff(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Touch Down</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Safety margin for landing gear x position to
	 *                                 avoid tail dropping down during touchDown and ground maneuvering
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Touch Down</em>' containment reference.
	 * @see #setTouchDown(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearPositionSafetyMarginsType_TouchDown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='touchDown' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTouchDown();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearPositionSafetyMarginsType#getTouchDown <em>Touch Down</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touch Down</em>' containment reference.
	 * @see #getTouchDown()
	 * @generated
	 */
	void setTouchDown(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Turn Over</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Safety margin for landing gear y position to
	 *                                 avoid wing tip dropping down during ground maneuvering
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Turn Over</em>' containment reference.
	 * @see #setTurnOver(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearPositionSafetyMarginsType_TurnOver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='turnOver' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTurnOver();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearPositionSafetyMarginsType#getTurnOver <em>Turn Over</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn Over</em>' containment reference.
	 * @see #getTurnOver()
	 * @generated
	 */
	void setTurnOver(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Roll Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Safety margin for landing gear y position
	 *                                 regarding wingtip or engine nacelle clearance at a certein roll
	 *                                 angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Angle</em>' containment reference.
	 * @see #setRollAngle(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearPositionSafetyMarginsType_RollAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRollAngle();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearPositionSafetyMarginsType#getRollAngle <em>Roll Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Angle</em>' containment reference.
	 * @see #getRollAngle()
	 * @generated
	 */
	void setRollAngle(DoubleBaseType value);

} // LandingGearPositionSafetyMarginsType
