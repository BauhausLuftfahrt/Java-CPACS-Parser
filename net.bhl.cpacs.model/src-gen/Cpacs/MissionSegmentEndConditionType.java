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
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getCAS <em>CAS</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getPositionXYZ <em>Position XYZ</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getPositionGeo <em>Position Geo</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getRunwayUID <em>Runway UID</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getRange <em>Range</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getDuration <em>Duration</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getSpecificExcessPower <em>Specific Excess Power</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getRateOfClimb <em>Rate Of Climb</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getFlightPathAngle <em>Flight Path Angle</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getMassFraction <em>Mass Fraction</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getFuelFraction <em>Fuel Fraction</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getFuelRemaining <em>Fuel Remaining</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentEndConditionType#getFuelConsumed <em>Fuel Consumed</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType()
 * @model extendedMetaData="name='missionSegmentEndConditionType' kind='elementOnly'"
 * @generated
 */
public interface MissionSegmentEndConditionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>CAS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calibrated airspeed at the end of the segment in [m/s]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CAS</em>' containment reference.
	 * @see #setCAS(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_CAS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CAS' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getCAS();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getCAS <em>CAS</em>}' containment reference.
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
	 * Mach number at the end of the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_MachNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Position XYZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Global coordinate at the end of the segment in xyz coordinates
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
	 * Global coordinate at the end of the segment in geographic coordinates (longitude, latitude, altitude)
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
	 * Returns the value of the '<em><b>Runway UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * destination runway UID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runway UID</em>' containment reference.
	 * @see #setRunwayUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_RunwayUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='runwayUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRunwayUID();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getRunwayUID <em>Runway UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runway UID</em>' containment reference.
	 * @see #getRunwayUID()
	 * @generated
	 */
	void setRunwayUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Final orientation in segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(OrientationType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flown distance in the segment (x, y, z)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(PointConstraintType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_Range()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	PointConstraintType getRange();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(PointConstraintType value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duration of the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_Duration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='duration' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getDuration();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Specific Excess Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific excess power at the end of the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Excess Power</em>' containment reference.
	 * @see #setSpecificExcessPower(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_SpecificExcessPower()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specificExcessPower' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getSpecificExcessPower();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getSpecificExcessPower <em>Specific Excess Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Excess Power</em>' containment reference.
	 * @see #getSpecificExcessPower()
	 * @generated
	 */
	void setSpecificExcessPower(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Rate Of Climb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rate of climb ending the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate Of Climb</em>' containment reference.
	 * @see #setRateOfClimb(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_RateOfClimb()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rateOfClimb' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getRateOfClimb();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getRateOfClimb <em>Rate Of Climb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Of Climb</em>' containment reference.
	 * @see #getRateOfClimb()
	 * @generated
	 */
	void setRateOfClimb(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Flight Path Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angle of flight path ending the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flight Path Angle</em>' containment reference.
	 * @see #setFlightPathAngle(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_FlightPathAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightPathAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getFlightPathAngle();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getFlightPathAngle <em>Flight Path Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Path Angle</em>' containment reference.
	 * @see #getFlightPathAngle()
	 * @generated
	 */
	void setFlightPathAngle(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Mass Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MassFraction ending the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass Fraction</em>' containment reference.
	 * @see #setMassFraction(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_MassFraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='massFraction' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getMassFraction();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getMassFraction <em>Mass Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Fraction</em>' containment reference.
	 * @see #getMassFraction()
	 * @generated
	 */
	void setMassFraction(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Fuel Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fuel mass fraction ending the segment, as remaining fuel mass with respect to initial segment fuel mass
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuel Fraction</em>' containment reference.
	 * @see #setFuelFraction(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_FuelFraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelFraction' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getFuelFraction();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getFuelFraction <em>Fuel Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Fraction</em>' containment reference.
	 * @see #getFuelFraction()
	 * @generated
	 */
	void setFuelFraction(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Fuel Remaining</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remaining absolute fuel ending the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuel Remaining</em>' containment reference.
	 * @see #setFuelRemaining(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_FuelRemaining()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelRemaining' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getFuelRemaining();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getFuelRemaining <em>Fuel Remaining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Remaining</em>' containment reference.
	 * @see #getFuelRemaining()
	 * @generated
	 */
	void setFuelRemaining(DoubleConstraintBaseType value);

	/**
	 * Returns the value of the '<em><b>Fuel Consumed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consumed fuel mass ending the segment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuel Consumed</em>' containment reference.
	 * @see #setFuelConsumed(DoubleConstraintBaseType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentEndConditionType_FuelConsumed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelConsumed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleConstraintBaseType getFuelConsumed();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentEndConditionType#getFuelConsumed <em>Fuel Consumed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Consumed</em>' containment reference.
	 * @see #getFuelConsumed()
	 * @generated
	 */
	void setFuelConsumed(DoubleConstraintBaseType value);

} // MissionSegmentEndConditionType
