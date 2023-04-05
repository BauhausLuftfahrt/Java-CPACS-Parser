/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Segment End Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getPositionXYZ <em>Position XYZ</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getPositionGeo <em>Position Geo</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getRunway <em>Runway</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getMassFraction <em>Mass Fraction</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getFuelFraction <em>Fuel Fraction</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getFuelRemaining <em>Fuel Remaining</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getFuelConsumed <em>Fuel Consumed</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getPowerFraction <em>Power Fraction</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getPowerRemaining <em>Power Remaining</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getPowerConsumed <em>Power Consumed</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getHeading <em>Heading</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getTurnAngle <em>Turn Angle</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getRange <em>Range</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getDuration <em>Duration</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getEndTimeUTC <em>End Time UTC</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getSpecificExcessPower <em>Specific Excess Power</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getRateOfClimb <em>Rate Of Climb</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getFlightPathAngle <em>Flight Path Angle</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getReleasedStores <em>Released Stores</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType()
 * @model extendedMetaData="name='missionSegmentEndConditionType' kind='elementOnly'"
 * @generated
 */
public interface MissionSegmentEndConditionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Calibrated Air Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calibrated Air Speed</em>' containment reference.
	 * @see #setCalibratedAirSpeed(CalibratedAirSpeedType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_CalibratedAirSpeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calibratedAirSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	CalibratedAirSpeedType getCalibratedAirSpeed();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibrated Air Speed</em>' containment reference.
	 * @see #getCalibratedAirSpeed()
	 * @generated
	 */
	void setCalibratedAirSpeed(CalibratedAirSpeedType value);

	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(MachNumberType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_MachNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	MachNumberType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(MachNumberType value);

	/**
	 * Returns the value of the '<em><b>Position XYZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Position at the end of the segment in xyz coordinates
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position XYZ</em>' containment reference.
	 * @see #setPositionXYZ(PointConstraintType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_PositionXYZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionXYZ' namespace='##targetNamespace'"
	 * @generated
	 */
	PointConstraintType getPositionXYZ();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getPositionXYZ <em>Position XYZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position XYZ</em>' containment reference.
	 * @see #getPositionXYZ()
	 * @generated
	 */
	void setPositionXYZ(PointConstraintType value);

	/**
	 * Returns the value of the '<em><b>Position Geo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Position at the end of the segment in geo coordinates
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Geo</em>' containment reference.
	 * @see #setPositionGeo(GeographicPointConstraintType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_PositionGeo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionGeo' namespace='##targetNamespace'"
	 * @generated
	 */
	GeographicPointConstraintType getPositionGeo();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getPositionGeo <em>Position Geo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Geo</em>' containment reference.
	 * @see #getPositionGeo()
	 * @generated
	 */
	void setPositionGeo(GeographicPointConstraintType value);

	/**
	 * Returns the value of the '<em><b>Runway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runway</em>' containment reference.
	 * @see #setRunway(RunwayType1)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_Runway()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='runway' namespace='##targetNamespace'"
	 * @generated
	 */
	RunwayType1 getRunway();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getRunway <em>Runway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runway</em>' containment reference.
	 * @see #getRunway()
	 * @generated
	 */
	void setRunway(RunwayType1 value);

	/**
	 * Returns the value of the '<em><b>Mass Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Fraction</em>' containment reference.
	 * @see #setMassFraction(MassFractionType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_MassFraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='massFraction' namespace='##targetNamespace'"
	 * @generated
	 */
	MassFractionType getMassFraction();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getMassFraction <em>Mass Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Fraction</em>' containment reference.
	 * @see #getMassFraction()
	 * @generated
	 */
	void setMassFraction(MassFractionType value);

	/**
	 * Returns the value of the '<em><b>Fuel Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Fraction</em>' containment reference.
	 * @see #setFuelFraction(FuelFractionType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_FuelFraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelFraction' namespace='##targetNamespace'"
	 * @generated
	 */
	FuelFractionType getFuelFraction();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getFuelFraction <em>Fuel Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Fraction</em>' containment reference.
	 * @see #getFuelFraction()
	 * @generated
	 */
	void setFuelFraction(FuelFractionType value);

	/**
	 * Returns the value of the '<em><b>Fuel Remaining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Remaining</em>' containment reference.
	 * @see #setFuelRemaining(FuelRemainingType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_FuelRemaining()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelRemaining' namespace='##targetNamespace'"
	 * @generated
	 */
	FuelRemainingType getFuelRemaining();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getFuelRemaining <em>Fuel Remaining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Remaining</em>' containment reference.
	 * @see #getFuelRemaining()
	 * @generated
	 */
	void setFuelRemaining(FuelRemainingType value);

	/**
	 * Returns the value of the '<em><b>Fuel Consumed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Consumed</em>' containment reference.
	 * @see #setFuelConsumed(FuelConsumedType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_FuelConsumed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelConsumed' namespace='##targetNamespace'"
	 * @generated
	 */
	FuelConsumedType getFuelConsumed();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getFuelConsumed <em>Fuel Consumed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Consumed</em>' containment reference.
	 * @see #getFuelConsumed()
	 * @generated
	 */
	void setFuelConsumed(FuelConsumedType value);

	/**
	 * Returns the value of the '<em><b>Power Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Fraction</em>' containment reference.
	 * @see #setPowerFraction(PowerFractionType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_PowerFraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='powerFraction' namespace='##targetNamespace'"
	 * @generated
	 */
	PowerFractionType getPowerFraction();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getPowerFraction <em>Power Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Fraction</em>' containment reference.
	 * @see #getPowerFraction()
	 * @generated
	 */
	void setPowerFraction(PowerFractionType value);

	/**
	 * Returns the value of the '<em><b>Power Remaining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Remaining</em>' containment reference.
	 * @see #setPowerRemaining(PowerRemainingType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_PowerRemaining()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='powerRemaining' namespace='##targetNamespace'"
	 * @generated
	 */
	PowerRemainingType getPowerRemaining();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getPowerRemaining <em>Power Remaining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Remaining</em>' containment reference.
	 * @see #getPowerRemaining()
	 * @generated
	 */
	void setPowerRemaining(PowerRemainingType value);

	/**
	 * Returns the value of the '<em><b>Power Consumed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Consumed</em>' containment reference.
	 * @see #setPowerConsumed(PowerConsumedType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_PowerConsumed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='powerConsumed' namespace='##targetNamespace'"
	 * @generated
	 */
	PowerConsumedType getPowerConsumed();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getPowerConsumed <em>Power Consumed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Consumed</em>' containment reference.
	 * @see #getPowerConsumed()
	 * @generated
	 */
	void setPowerConsumed(PowerConsumedType value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' containment reference.
	 * @see #setHeading(HeadingType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_Heading()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	HeadingType getHeading();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getHeading <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' containment reference.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(HeadingType value);

	/**
	 * Returns the value of the '<em><b>Turn Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn Angle</em>' containment reference.
	 * @see #setTurnAngle(TurnAngleType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_TurnAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='turnAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	TurnAngleType getTurnAngle();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getTurnAngle <em>Turn Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn Angle</em>' containment reference.
	 * @see #getTurnAngle()
	 * @generated
	 */
	void setTurnAngle(TurnAngleType value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(RangeType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_Range()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	RangeType getRange();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(RangeType value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(DurationType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	DurationType getDuration();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(DurationType value);

	/**
	 * Returns the value of the '<em><b>End Time UTC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time UTC</em>' containment reference.
	 * @see #setEndTimeUTC(EndTimeUTCType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_EndTimeUTC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endTimeUTC' namespace='##targetNamespace'"
	 * @generated
	 */
	EndTimeUTCType getEndTimeUTC();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getEndTimeUTC <em>End Time UTC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time UTC</em>' containment reference.
	 * @see #getEndTimeUTC()
	 * @generated
	 */
	void setEndTimeUTC(EndTimeUTCType value);

	/**
	 * Returns the value of the '<em><b>Specific Excess Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Excess Power</em>' containment reference.
	 * @see #setSpecificExcessPower(SpecificExcessPowerType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_SpecificExcessPower()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specificExcessPower' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificExcessPowerType getSpecificExcessPower();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getSpecificExcessPower <em>Specific Excess Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Excess Power</em>' containment reference.
	 * @see #getSpecificExcessPower()
	 * @generated
	 */
	void setSpecificExcessPower(SpecificExcessPowerType value);

	/**
	 * Returns the value of the '<em><b>Rate Of Climb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Of Climb</em>' containment reference.
	 * @see #setRateOfClimb(RateOfClimbType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_RateOfClimb()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateOfClimb' namespace='##targetNamespace'"
	 * @generated
	 */
	RateOfClimbType getRateOfClimb();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getRateOfClimb <em>Rate Of Climb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Of Climb</em>' containment reference.
	 * @see #getRateOfClimb()
	 * @generated
	 */
	void setRateOfClimb(RateOfClimbType value);

	/**
	 * Returns the value of the '<em><b>Flight Path Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Path Angle</em>' containment reference.
	 * @see #setFlightPathAngle(FlightPathAngleType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_FlightPathAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightPathAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPathAngleType getFlightPathAngle();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getFlightPathAngle <em>Flight Path Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Path Angle</em>' containment reference.
	 * @see #getFlightPathAngle()
	 * @generated
	 */
	void setFlightPathAngle(FlightPathAngleType value);

	/**
	 * Returns the value of the '<em><b>Released Stores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of stores released in the segment. The corresponding weightAndBalance vector for retrieving the new state as well as a potential change in aerodynamicPerformanceMap (if external stores are released) should be reflected within the configuration node at model level.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Released Stores</em>' containment reference.
	 * @see #setReleasedStores(ReleasedStoresType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_ReleasedStores()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='releasedStores' namespace='##targetNamespace'"
	 * @generated
	 */
	ReleasedStoresType getReleasedStores();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getReleasedStores <em>Released Stores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Released Stores</em>' containment reference.
	 * @see #getReleasedStores()
	 * @generated
	 */
	void setReleasedStores(ReleasedStoresType value);

} // MissionSegmentEndConditionType
