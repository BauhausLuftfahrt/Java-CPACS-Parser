/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Performance Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PointPerformanceConstraintsType#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceConstraintsType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceConstraintsType#getClimbAngle <em>Climb Angle</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceConstraintsType#getRateOfClimb <em>Rate Of Climb</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceConstraintsType#getRateOfTurn <em>Rate Of Turn</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceConstraintsType#getThrustSetting <em>Thrust Setting</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceConstraintsType#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceConstraintsType#getDuration <em>Duration</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceConstraintsType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceConstraintsType#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPointPerformanceConstraintsType()
 * @model extendedMetaData="name='pointPerformanceConstraintsType' kind='elementOnly'"
 * @generated
 */
public interface PointPerformanceConstraintsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Calibrated Air Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Calibrated airspeed [m/s]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calibrated Air Speed</em>' containment reference.
	 * @see #setCalibratedAirSpeed(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceConstraintsType_CalibratedAirSpeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calibratedAirSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getCalibratedAirSpeed();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceConstraintsType#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibrated Air Speed</em>' containment reference.
	 * @see #getCalibratedAirSpeed()
	 * @generated
	 */
	void setCalibratedAirSpeed(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Mach number [-]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceConstraintsType_MachNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceConstraintsType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Climb Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Climb angle [deg]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Climb Angle</em>' containment reference.
	 * @see #setClimbAngle(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceConstraintsType_ClimbAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='climbAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getClimbAngle();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceConstraintsType#getClimbAngle <em>Climb Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Climb Angle</em>' containment reference.
	 * @see #getClimbAngle()
	 * @generated
	 */
	void setClimbAngle(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Rate Of Climb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Rate of climb [m/s]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Of Climb</em>' containment reference.
	 * @see #setRateOfClimb(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceConstraintsType_RateOfClimb()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateOfClimb' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getRateOfClimb();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceConstraintsType#getRateOfClimb <em>Rate Of Climb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Of Climb</em>' containment reference.
	 * @see #getRateOfClimb()
	 * @generated
	 */
	void setRateOfClimb(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Rate Of Turn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Rate of turn [deg/s]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Of Turn</em>' containment reference.
	 * @see #setRateOfTurn(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceConstraintsType_RateOfTurn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateOfTurn' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getRateOfTurn();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceConstraintsType#getRateOfTurn <em>Rate Of Turn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Of Turn</em>' containment reference.
	 * @see #getRateOfTurn()
	 * @generated
	 */
	void setRateOfTurn(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Thrust Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Thrust setting for derated engine as fraction of max. thrust (e.g.: for powered descents, deceleration not at IDLE, manoevres)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thrust Setting</em>' containment reference.
	 * @see #setThrustSetting(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceConstraintsType_ThrustSetting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thrustSetting' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getThrustSetting();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceConstraintsType#getThrustSetting <em>Thrust Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrust Setting</em>' containment reference.
	 * @see #getThrustSetting()
	 * @generated
	 */
	void setThrustSetting(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Rate of velocity [m/s^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acceleration</em>' containment reference.
	 * @see #setAcceleration(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceConstraintsType_Acceleration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='acceleration' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getAcceleration();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceConstraintsType#getAcceleration <em>Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceleration</em>' containment reference.
	 * @see #getAcceleration()
	 * @generated
	 */
	void setAcceleration(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Duration [s]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceConstraintsType_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getDuration();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceConstraintsType#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Attack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Angle of attack [deg]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceConstraintsType_AngleOfAttack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceConstraintsType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Constant altitude [m]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceConstraintsType_Altitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceConstraintsType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(DoubleConstraintBaseType value);

} // PointPerformanceConstraintsType
