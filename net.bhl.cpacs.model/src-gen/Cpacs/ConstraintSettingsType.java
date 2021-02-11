/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Settings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ConstraintSettingsType#getCAS <em>CAS</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getThrustSetting <em>Thrust Setting</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getClimbAngle <em>Climb Angle</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getRateOfClimb <em>Rate Of Climb</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getRateOfTurn <em>Rate Of Turn</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getRateOfDescent <em>Rate Of Descent</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getDescentAngle <em>Descent Angle</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getLoadFactor <em>Load Factor</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getStepClimbSpecificExcessPower <em>Step Climb Specific Excess Power</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getStepClimbAltitudeDifference <em>Step Climb Altitude Difference</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getDeltaTemperatureISA <em>Delta Temperature ISA</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getPrioritySetting <em>Priority Setting</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getConstraintSettingsType()
 * @model extendedMetaData="name='constraintSettingsType' kind='elementOnly'"
 * @generated
 */
public interface ConstraintSettingsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>CAS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calibrated airspeed within the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CAS</em>' containment reference.
	 * @see #setCAS(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_CAS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CAS' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getCAS();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getCAS <em>CAS</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_MachNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getMachNumber <em>Mach Number</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_ThrustSetting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thrustSetting' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getThrustSetting();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getThrustSetting <em>Thrust Setting</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_ClimbAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='climbAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getClimbAngle();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getClimbAngle <em>Climb Angle</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_RateOfClimb()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateOfClimb' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getRateOfClimb();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getRateOfClimb <em>Rate Of Climb</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_RateOfTurn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateOfTurn' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getRateOfTurn();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getRateOfTurn <em>Rate Of Turn</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_RateOfDescent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateOfDescent' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getRateOfDescent();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getRateOfDescent <em>Rate Of Descent</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_Acceleration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='acceleration' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getAcceleration();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getAcceleration <em>Acceleration</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_DescentAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='descentAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getDescentAngle();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getDescentAngle <em>Descent Angle</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_LoadFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getLoadFactor();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getLoadFactor <em>Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Factor</em>' containment reference.
	 * @see #getLoadFactor()
	 * @generated
	 */
	void setLoadFactor(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Step Climb Specific Excess Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific excess power within the segment (e.g.: for defining minimum SEP to remain after step climbs have been performed).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step Climb Specific Excess Power</em>' containment reference.
	 * @see #setStepClimbSpecificExcessPower(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_StepClimbSpecificExcessPower()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stepClimbSpecificExcessPower' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getStepClimbSpecificExcessPower();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getStepClimbSpecificExcessPower <em>Step Climb Specific Excess Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Climb Specific Excess Power</em>' containment reference.
	 * @see #getStepClimbSpecificExcessPower()
	 * @generated
	 */
	void setStepClimbSpecificExcessPower(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Step Climb Altitude Difference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Altitude difference of each step climb.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step Climb Altitude Difference</em>' containment reference.
	 * @see #setStepClimbAltitudeDifference(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_StepClimbAltitudeDifference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stepClimbAltitudeDifference' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getStepClimbAltitudeDifference();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getStepClimbAltitudeDifference <em>Step Climb Altitude Difference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Climb Altitude Difference</em>' containment reference.
	 * @see #getStepClimbAltitudeDifference()
	 * @generated
	 */
	void setStepClimbAltitudeDifference(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constant altitude for the segment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_Altitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Temperature ISA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Delta in temperature compared to standard ISA conditions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Temperature ISA</em>' containment reference.
	 * @see #setDeltaTemperatureISA(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_DeltaTemperatureISA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaTemperatureISA' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getDeltaTemperatureISA();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getDeltaTemperatureISA <em>Delta Temperature ISA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Temperature ISA</em>' containment reference.
	 * @see #getDeltaTemperatureISA()
	 * @generated
	 */
	void setDeltaTemperatureISA(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Priority Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * priority setting indicating which constraint is preferred within the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority Setting</em>' containment reference.
	 * @see #setPrioritySetting(PrioritySettingType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_PrioritySetting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prioritySetting' namespace='##targetNamespace'"
	 * @generated
	 */
	PrioritySettingType getPrioritySetting();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getPrioritySetting <em>Priority Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Setting</em>' containment reference.
	 * @see #getPrioritySetting()
	 * @generated
	 */
	void setPrioritySetting(PrioritySettingType value);

} // ConstraintSettingsType
