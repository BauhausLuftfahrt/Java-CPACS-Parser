/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Start Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionStartConditionType#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}</li>
 *   <li>{@link Cpacs.MissionStartConditionType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.MissionStartConditionType#getPositionXYZ <em>Position XYZ</em>}</li>
 *   <li>{@link Cpacs.MissionStartConditionType#getPositionGeo <em>Position Geo</em>}</li>
 *   <li>{@link Cpacs.MissionStartConditionType#getRunway <em>Runway</em>}</li>
 *   <li>{@link Cpacs.MissionStartConditionType#getHeading <em>Heading</em>}</li>
 *   <li>{@link Cpacs.MissionStartConditionType#getStartTimeUTC <em>Start Time UTC</em>}</li>
 *   <li>{@link Cpacs.MissionStartConditionType#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionStartConditionType()
 * @model extendedMetaData="name='missionStartConditionType' kind='elementOnly'"
 * @generated
 */
public interface MissionStartConditionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Calibrated Air Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calibrated airspeed at the start of the mission [m/s]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calibrated Air Speed</em>' containment reference.
	 * @see #setCalibratedAirSpeed(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_CalibratedAirSpeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calibratedAirSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCalibratedAirSpeed();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibrated Air Speed</em>' containment reference.
	 * @see #getCalibratedAirSpeed()
	 * @generated
	 */
	void setCalibratedAirSpeed(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mach number at the start of the mission
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_MachNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Position XYZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Global coordinate at the start of the mission in xyz coordinates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position XYZ</em>' containment reference.
	 * @see #setPositionXYZ(PointXYZType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_PositionXYZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionXYZ' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getPositionXYZ();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getPositionXYZ <em>Position XYZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position XYZ</em>' containment reference.
	 * @see #getPositionXYZ()
	 * @generated
	 */
	void setPositionXYZ(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Position Geo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Global coordinate at the start of the mission in geographic coordinates (longitude, latitude, altitude)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Geo</em>' containment reference.
	 * @see #setPositionGeo(GeographicPointType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_PositionGeo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionGeo' namespace='##targetNamespace'"
	 * @generated
	 */
	GeographicPointType getPositionGeo();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getPositionGeo <em>Position Geo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Geo</em>' containment reference.
	 * @see #getPositionGeo()
	 * @generated
	 */
	void setPositionGeo(GeographicPointType value);

	/**
	 * Returns the value of the '<em><b>Runway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     UID of the runway at which the
	 *                                     mission starts
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runway</em>' containment reference.
	 * @see #setRunway(MissionStartRunwayType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_Runway()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='runway' namespace='##targetNamespace'"
	 * @generated
	 */
	MissionStartRunwayType getRunway();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getRunway <em>Runway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runway</em>' containment reference.
	 * @see #getRunway()
	 * @generated
	 */
	void setRunway(MissionStartRunwayType value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Flight heading at the start of the mission, in compassAngle with reference to true North
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heading</em>' containment reference.
	 * @see #setHeading(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_Heading()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHeading();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getHeading <em>Heading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' containment reference.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Start Time UTC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UTC time at start of mission
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time UTC</em>' containment reference.
	 * @see #setStartTimeUTC(TimeBaseType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_StartTimeUTC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startTimeUTC' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeBaseType getStartTimeUTC();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getStartTimeUTC <em>Start Time UTC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time UTC</em>' containment reference.
	 * @see #getStartTimeUTC()
	 * @generated
	 */
	void setStartTimeUTC(TimeBaseType value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(EnvironmentType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_Environment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='environment' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvironmentType getEnvironment();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(EnvironmentType value);

} // MissionStartConditionType
