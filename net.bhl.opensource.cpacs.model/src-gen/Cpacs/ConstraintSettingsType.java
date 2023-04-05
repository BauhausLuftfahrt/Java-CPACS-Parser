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
 *   <li>{@link Cpacs.ConstraintSettingsType#getReferenceEndConditionUID <em>Reference End Condition UID</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getEndConditionRatio <em>End Condition Ratio</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getContinuity <em>Continuity</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getClimbAngle <em>Climb Angle</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getRateOfClimb <em>Rate Of Climb</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getStepClimbSpecificExcessPower <em>Step Climb Specific Excess Power</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getStepClimbAltitudeDifference <em>Step Climb Altitude Difference</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getHeading <em>Heading</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getTurnAngle <em>Turn Angle</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getRateOfTurn <em>Rate Of Turn</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getThrustSetting <em>Thrust Setting</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getLoadFactor <em>Load Factor</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.ConstraintSettingsType#getPrioritySetting <em>Priority Setting</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getConstraintSettingsType()
 * @model extendedMetaData="name='constraintSettingsType' kind='elementOnly'"
 * @generated
 */
public interface ConstraintSettingsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Reference End Condition UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference to the uID of the segment end condition variable to which a profile of constraintSettings is provided
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference End Condition UID</em>' containment reference.
	 * @see #setReferenceEndConditionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_ReferenceEndConditionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceEndConditionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getReferenceEndConditionUID();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getReferenceEndConditionUID <em>Reference End Condition UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference End Condition UID</em>' containment reference.
	 * @see #getReferenceEndConditionUID()
	 * @generated
	 */
	void setReferenceEndConditionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>End Condition Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Vector indicating the ratios of the constraintSettings profile with respect to the provided referenceEndCondition, ranging from 0 to 1. If this vector is defined, the provided constraintSettings are expected to be vectors with the same length providing ratio-value pairs. Example: for referenceEndCondition <range><z>  (i.e.: flown distance in z direction of the segment), a vector of <CAS> and <machNumber> is provided to define a climb profile.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Condition Ratio</em>' containment reference.
	 * @see #setEndConditionRatio(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_EndConditionRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endConditionRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getEndConditionRatio();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getEndConditionRatio <em>End Condition Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Condition Ratio</em>' containment reference.
	 * @see #getEndConditionRatio()
	 * @generated
	 */
	void setEndConditionRatio(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Continuity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines how to interpret the parameter lapses within the segment: discrete steps (C0 continuity) or linear interpolation (C1 continuity)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Continuity</em>' containment reference.
	 * @see #setContinuity(ContinuityType3)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_Continuity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='continuity' namespace='##targetNamespace'"
	 * @generated
	 */
	ContinuityType3 getContinuity();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getContinuity <em>Continuity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuity</em>' containment reference.
	 * @see #getContinuity()
	 * @generated
	 */
	void setContinuity(ContinuityType3 value);

	/**
	 * Returns the value of the '<em><b>Calibrated Air Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Calibrated airspeed within the segment. If a vector is provided, a constraint profile is defined with respect to the <referenceEndCondition> using the <endConditionRatio> vector.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calibrated Air Speed</em>' containment reference.
	 * @see #setCalibratedAirSpeed(DoubleVectorConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_CalibratedAirSpeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calibratedAirSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorConstraintBaseType getCalibratedAirSpeed();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibrated Air Speed</em>' containment reference.
	 * @see #getCalibratedAirSpeed()
	 * @generated
	 */
	void setCalibratedAirSpeed(DoubleVectorConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Mach number within the segment. If a vector is provided, a constraint profile is defined with respect to the <referenceEndCondition> using the <endConditionRatio> vector.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(DoubleVectorConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_MachNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorConstraintBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(DoubleVectorConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Climb Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                Climb angle within the segment. If a vector is provided, a constraint profile is defined with respect to the <referenceEndCondition> using the <endConditionRatio> vector.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Climb Angle</em>' containment reference.
	 * @see #setClimbAngle(DoubleVectorConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_ClimbAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='climbAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorConstraintBaseType getClimbAngle();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getClimbAngle <em>Climb Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Climb Angle</em>' containment reference.
	 * @see #getClimbAngle()
	 * @generated
	 */
	void setClimbAngle(DoubleVectorConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Rate Of Climb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Rate of climb within the segment. If a vector is provided, a constraint profile is defined with respect to the <referenceEndCondition> using the <endConditionRatio> vector.
	 *                             
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
	 * Returns the value of the '<em><b>Step Climb Specific Excess Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Specific excess power within the segment
	 *                                 (e.g.: for defining minimum SEP to
	 *                                 remain after step climbs have been
	 *                                 performed).
	 *                             
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
	 * 
	 *                                 Altitude difference of each step climb
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Step Climb Altitude Difference</em>' containment reference.
	 * @see #setStepClimbAltitudeDifference(DoubleVectorConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_StepClimbAltitudeDifference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stepClimbAltitudeDifference' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorConstraintBaseType getStepClimbAltitudeDifference();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getStepClimbAltitudeDifference <em>Step Climb Altitude Difference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Climb Altitude Difference</em>' containment reference.
	 * @see #getStepClimbAltitudeDifference()
	 * @generated
	 */
	void setStepClimbAltitudeDifference(DoubleVectorConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Flight heading at the end of the segment in compassAngle with reference to true North [deg]. If a vector is provided, a constraint profile is defined with respect to the <referenceEndCondition> using the <endConditionRatio> vector.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heading</em>' containment reference.
	 * @see #setHeading(DoubleVectorConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_Heading()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorConstraintBaseType getHeading();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getHeading <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' containment reference.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(DoubleVectorConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Turn Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Total change of heading angle during segment (a full turn is 360 degrees) [deg]. If a vector is provided, a constraint profile is defined with respect to the <referenceEndCondition> using the <endConditionRatio> vector.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Turn Angle</em>' containment reference.
	 * @see #setTurnAngle(DoubleVectorConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_TurnAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='turnAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorConstraintBaseType getTurnAngle();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getTurnAngle <em>Turn Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn Angle</em>' containment reference.
	 * @see #getTurnAngle()
	 * @generated
	 */
	void setTurnAngle(DoubleVectorConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Rate Of Turn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Rate of turn within the segment [deg/s]. If a vector is provided, a constraint profile is defined with respect to the <referenceEndCondition> using the <endConditionRatio> vector.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Of Turn</em>' containment reference.
	 * @see #setRateOfTurn(DoubleVectorConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_RateOfTurn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateOfTurn' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorConstraintBaseType getRateOfTurn();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getRateOfTurn <em>Rate Of Turn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Of Turn</em>' containment reference.
	 * @see #getRateOfTurn()
	 * @generated
	 */
	void setRateOfTurn(DoubleVectorConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Thrust Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Thrust setting for derated engine as fraction of max. Thrust (e.g.: for powered descents, deceleration not at IDLE, manoevres). If a vector is provided, a constraint profile is defined with respect to the <referenceEndCondition> using the <endConditionRatio> vector.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thrust Setting</em>' containment reference.
	 * @see #setThrustSetting(DoubleVectorConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_ThrustSetting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thrustSetting' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorConstraintBaseType getThrustSetting();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getThrustSetting <em>Thrust Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrust Setting</em>' containment reference.
	 * @see #getThrustSetting()
	 * @generated
	 */
	void setThrustSetting(DoubleVectorConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Rate of velocity within the segment. If a vector is provided, a constraint profile is defined with respect to the <referenceEndCondition> using the <endConditionRatio> vector.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acceleration</em>' containment reference.
	 * @see #setAcceleration(DoubleVectorConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_Acceleration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='acceleration' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorConstraintBaseType getAcceleration();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getAcceleration <em>Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceleration</em>' containment reference.
	 * @see #getAcceleration()
	 * @generated
	 */
	void setAcceleration(DoubleVectorConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Load Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Load factor experienced during segment. If a vector is provided, a constraint profile is defined with respect to the <referenceEndCondition> using the <endConditionRatio> vector.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Factor</em>' containment reference.
	 * @see #setLoadFactor(DoubleVectorConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_LoadFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorConstraintBaseType getLoadFactor();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getLoadFactor <em>Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Factor</em>' containment reference.
	 * @see #getLoadFactor()
	 * @generated
	 */
	void setLoadFactor(DoubleVectorConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Constant altitude of the segment. If a vector is provided, a constraint profile is defined with respect to the <referenceEndCondition> using the <endConditionRatio> vector.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(DoubleVectorConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getConstraintSettingsType_Altitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorConstraintBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.ConstraintSettingsType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(DoubleVectorConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Priority Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Priority setting indicating which constraint is preferred within the segment. If a vector is provided, a constraint profile is defined with respect to the <referenceEndCondition> using the <endConditionRatio> vector.
	 *                             
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
