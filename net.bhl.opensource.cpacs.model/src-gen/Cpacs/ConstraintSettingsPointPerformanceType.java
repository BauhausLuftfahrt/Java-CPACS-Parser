/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Settings Point Performance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getCAS <em>CAS</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getThrustSetting <em>Thrust Setting</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getClimbAngle <em>Climb Angle</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getRateOfClimb <em>Rate Of Climb</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getRateOfTurn <em>Rate Of Turn</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getRateOfDescent <em>Rate Of Descent</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getDescentAngle <em>Descent Angle</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getLoadFactor <em>Load Factor</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getDuration <em>Duration</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsPointPerformanceType#getDeltaTemperatureISA <em>Delta Temperature ISA</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType()
 * @model extendedMetaData="name='constraintSettingsPointPerformanceType' kind='elementOnly'"
 * @generated
 */
public interface ConstraintSettingsPointPerformanceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>CAS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calibrated airspeed within the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CAS</em>' containment reference.
	 * @see #setCAS(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_CAS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CAS' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getCAS();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getCAS <em>CAS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CAS</em>' containment reference.
	 * @see #getCAS()
	 * @generated
	 */
	void setCAS(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mach number within the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_MachNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Thrust Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Thrust setting for derated engine as fraction of max. Thrust (e.g.: for powered descents, deceleration not at IDLE, manoevres).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thrust Setting</em>' containment reference.
	 * @see #setThrustSetting(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_ThrustSetting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thrustSetting' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getThrustSetting();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getThrustSetting <em>Thrust Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrust Setting</em>' containment reference.
	 * @see #getThrustSetting()
	 * @generated
	 */
	void setThrustSetting(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Climb Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Climb angle within the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Climb Angle</em>' containment reference.
	 * @see #setClimbAngle(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_ClimbAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='climbAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getClimbAngle();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getClimbAngle <em>Climb Angle</em>}' containment reference.
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
	 * Climb angle within the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Of Climb</em>' containment reference.
	 * @see #setRateOfClimb(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_RateOfClimb()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateOfClimb' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getRateOfClimb();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getRateOfClimb <em>Rate Of Climb</em>}' containment reference.
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
	 * Rate of turn within the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Of Turn</em>' containment reference.
	 * @see #setRateOfTurn(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_RateOfTurn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateOfTurn' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getRateOfTurn();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getRateOfTurn <em>Rate Of Turn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Of Turn</em>' containment reference.
	 * @see #getRateOfTurn()
	 * @generated
	 */
	void setRateOfTurn(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Rate Of Descent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rate of descent within the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Of Descent</em>' containment reference.
	 * @see #setRateOfDescent(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_RateOfDescent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateOfDescent' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getRateOfDescent();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getRateOfDescent <em>Rate Of Descent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Of Descent</em>' containment reference.
	 * @see #getRateOfDescent()
	 * @generated
	 */
	void setRateOfDescent(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rate of velocity within the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acceleration</em>' containment reference.
	 * @see #setAcceleration(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_Acceleration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='acceleration' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getAcceleration();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getAcceleration <em>Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceleration</em>' containment reference.
	 * @see #getAcceleration()
	 * @generated
	 */
	void setAcceleration(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Descent Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Descent angle within the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Descent Angle</em>' containment reference.
	 * @see #setDescentAngle(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_DescentAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='descentAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getDescentAngle();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getDescentAngle <em>Descent Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descent Angle</em>' containment reference.
	 * @see #getDescentAngle()
	 * @generated
	 */
	void setDescentAngle(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Load Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Load factor experienced during segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Factor</em>' containment reference.
	 * @see #setLoadFactor(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_LoadFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getLoadFactor();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getLoadFactor <em>Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Factor</em>' containment reference.
	 * @see #getLoadFactor()
	 * @generated
	 */
	void setLoadFactor(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duration of the condition. [for pointPerformance constraints]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getDuration();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getDuration <em>Duration</em>}' containment reference.
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
	 * Angle of attack [for pointPerformance constraints]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_AngleOfAttack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Temperature ISA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delta in temperature compared to standard ISA conditions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Temperature ISA</em>' containment reference.
	 * @see #setDeltaTemperatureISA(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsPointPerformanceType_DeltaTemperatureISA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaTemperatureISA' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getDeltaTemperatureISA();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsPointPerformanceType#getDeltaTemperatureISA <em>Delta Temperature ISA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Temperature ISA</em>' containment reference.
	 * @see #getDeltaTemperatureISA()
	 * @generated
	 */
	void setDeltaTemperatureISA(DoubleConstraintBaseType value);

} // ConstraintSettingsPointPerformanceType
