/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlowConditionType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getReynoldsNumber <em>Reynolds Number</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getStandardAltitude <em>Standard Altitude</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getDeltaTemperature <em>Delta Temperature</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getKinematicViscosity <em>Kinematic Viscosity</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getAirspeed <em>Airspeed</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getSpeedOfSound <em>Speed Of Sound</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getReynoldsNumber1 <em>Reynolds Number1</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getStandardAltitude1 <em>Standard Altitude1</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getDeltaTemperature1 <em>Delta Temperature1</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getSpeedOfSound1 <em>Speed Of Sound1</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getAirspeed1 <em>Airspeed1</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getKinematicViscosity1 <em>Kinematic Viscosity1</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getAirspeed2 <em>Airspeed2</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getStandardAltitude2 <em>Standard Altitude2</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getDeltaTemperature2 <em>Delta Temperature2</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getKinematicViscosity2 <em>Kinematic Viscosity2</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getSpeedOfSound2 <em>Speed Of Sound2</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getTargetLiftCoefficient <em>Target Lift Coefficient</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getQuasiSteadyRotation <em>Quasi Steady Rotation</em>}</li>
 *   <li>{@link Cpacs.FlowConditionType#getControlSurfaces <em>Control Surfaces</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlowConditionType()
 * @model extendedMetaData="name='flowConditionType' kind='elementOnly'"
 * @generated
 */
public interface FlowConditionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mach Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_MachNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reynolds Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reynolds Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reynolds Number</em>' containment reference.
	 * @see #setReynoldsNumber(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_ReynoldsNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reynoldsNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getReynoldsNumber();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getReynoldsNumber <em>Reynolds Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reynolds Number</em>' containment reference.
	 * @see #getReynoldsNumber()
	 * @generated
	 */
	void setReynoldsNumber(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Standard Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard Altitude
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Altitude</em>' containment reference.
	 * @see #setStandardAltitude(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_StandardAltitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standardAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getStandardAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getStandardAltitude <em>Standard Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Altitude</em>' containment reference.
	 * @see #getStandardAltitude()
	 * @generated
	 */
	void setStandardAltitude(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temperature offset from standard
	 *                                                 atmosphere
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #setDeltaTemperature(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_DeltaTemperature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaTemperature' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaTemperature();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getDeltaTemperature <em>Delta Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #getDeltaTemperature()
	 * @generated
	 */
	void setDeltaTemperature(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Kinematic Viscosity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kinematic Viscosity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kinematic Viscosity</em>' containment reference.
	 * @see #setKinematicViscosity(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_KinematicViscosity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kinematicViscosity' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKinematicViscosity();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getKinematicViscosity <em>Kinematic Viscosity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinematic Viscosity</em>' containment reference.
	 * @see #getKinematicViscosity()
	 * @generated
	 */
	void setKinematicViscosity(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Airspeed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Airspeed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Airspeed</em>' containment reference.
	 * @see #setAirspeed(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_Airspeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airspeed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAirspeed();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getAirspeed <em>Airspeed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airspeed</em>' containment reference.
	 * @see #getAirspeed()
	 * @generated
	 */
	void setAirspeed(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Speed Of Sound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speed of Sound
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed Of Sound</em>' containment reference.
	 * @see #setSpeedOfSound(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_SpeedOfSound()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='speedOfSound' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSpeedOfSound();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getSpeedOfSound <em>Speed Of Sound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Of Sound</em>' containment reference.
	 * @see #getSpeedOfSound()
	 * @generated
	 */
	void setSpeedOfSound(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reynolds Number1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reynolds Number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reynolds Number1</em>' containment reference.
	 * @see #setReynoldsNumber1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_ReynoldsNumber1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reynoldsNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getReynoldsNumber1();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getReynoldsNumber1 <em>Reynolds Number1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reynolds Number1</em>' containment reference.
	 * @see #getReynoldsNumber1()
	 * @generated
	 */
	void setReynoldsNumber1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Standard Altitude1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard Altitude
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Altitude1</em>' containment reference.
	 * @see #setStandardAltitude1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_StandardAltitude1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standardAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getStandardAltitude1();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getStandardAltitude1 <em>Standard Altitude1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Altitude1</em>' containment reference.
	 * @see #getStandardAltitude1()
	 * @generated
	 */
	void setStandardAltitude1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Temperature1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temperature offset from standard
	 *                                                 atmosphere
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Temperature1</em>' containment reference.
	 * @see #setDeltaTemperature1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_DeltaTemperature1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaTemperature' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaTemperature1();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getDeltaTemperature1 <em>Delta Temperature1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Temperature1</em>' containment reference.
	 * @see #getDeltaTemperature1()
	 * @generated
	 */
	void setDeltaTemperature1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Speed Of Sound1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speed of Sound
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed Of Sound1</em>' containment reference.
	 * @see #setSpeedOfSound1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_SpeedOfSound1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='speedOfSound' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSpeedOfSound1();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getSpeedOfSound1 <em>Speed Of Sound1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Of Sound1</em>' containment reference.
	 * @see #getSpeedOfSound1()
	 * @generated
	 */
	void setSpeedOfSound1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Airspeed1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Airspeed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Airspeed1</em>' containment reference.
	 * @see #setAirspeed1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_Airspeed1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airspeed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAirspeed1();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getAirspeed1 <em>Airspeed1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airspeed1</em>' containment reference.
	 * @see #getAirspeed1()
	 * @generated
	 */
	void setAirspeed1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Kinematic Viscosity1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kinematic Viscosity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kinematic Viscosity1</em>' containment reference.
	 * @see #setKinematicViscosity1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_KinematicViscosity1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kinematicViscosity' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKinematicViscosity1();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getKinematicViscosity1 <em>Kinematic Viscosity1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinematic Viscosity1</em>' containment reference.
	 * @see #getKinematicViscosity1()
	 * @generated
	 */
	void setKinematicViscosity1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Airspeed2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Airspeed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Airspeed2</em>' containment reference.
	 * @see #setAirspeed2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_Airspeed2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airspeed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAirspeed2();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getAirspeed2 <em>Airspeed2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airspeed2</em>' containment reference.
	 * @see #getAirspeed2()
	 * @generated
	 */
	void setAirspeed2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Standard Altitude2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standard Altitude
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Altitude2</em>' containment reference.
	 * @see #setStandardAltitude2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_StandardAltitude2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standardAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getStandardAltitude2();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getStandardAltitude2 <em>Standard Altitude2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Altitude2</em>' containment reference.
	 * @see #getStandardAltitude2()
	 * @generated
	 */
	void setStandardAltitude2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Temperature2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temperature offset from standard
	 *                                                 atmosphere
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Temperature2</em>' containment reference.
	 * @see #setDeltaTemperature2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_DeltaTemperature2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaTemperature' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaTemperature2();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getDeltaTemperature2 <em>Delta Temperature2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Temperature2</em>' containment reference.
	 * @see #getDeltaTemperature2()
	 * @generated
	 */
	void setDeltaTemperature2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Kinematic Viscosity2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kinematic Viscosity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kinematic Viscosity2</em>' containment reference.
	 * @see #setKinematicViscosity2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_KinematicViscosity2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kinematicViscosity' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKinematicViscosity2();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getKinematicViscosity2 <em>Kinematic Viscosity2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinematic Viscosity2</em>' containment reference.
	 * @see #getKinematicViscosity2()
	 * @generated
	 */
	void setKinematicViscosity2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Speed Of Sound2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speed of Sound
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed Of Sound2</em>' containment reference.
	 * @see #setSpeedOfSound2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_SpeedOfSound2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='speedOfSound' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSpeedOfSound2();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getSpeedOfSound2 <em>Speed Of Sound2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Of Sound2</em>' containment reference.
	 * @see #getSpeedOfSound2()
	 * @generated
	 */
	void setSpeedOfSound2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Sideslip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sideslip angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #setAngleOfSideslip(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_AngleOfSideslip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfSideslip' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleOfSideslip();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getAngleOfSideslip <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #getAngleOfSideslip()
	 * @generated
	 */
	void setAngleOfSideslip(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Attack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angle of attack
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_AngleOfAttack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Target Lift Coefficient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target Lift Coefficient
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Lift Coefficient</em>' containment reference.
	 * @see #setTargetLiftCoefficient(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_TargetLiftCoefficient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetLiftCoefficient' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTargetLiftCoefficient();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getTargetLiftCoefficient <em>Target Lift Coefficient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Lift Coefficient</em>' containment reference.
	 * @see #getTargetLiftCoefficient()
	 * @generated
	 */
	void setTargetLiftCoefficient(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Quasi Steady Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quasi Steady Rotation</em>' containment reference.
	 * @see #setQuasiSteadyRotation(QuasiSteadyRotationType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_QuasiSteadyRotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quasiSteadyRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	QuasiSteadyRotationType getQuasiSteadyRotation();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getQuasiSteadyRotation <em>Quasi Steady Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quasi Steady Rotation</em>' containment reference.
	 * @see #getQuasiSteadyRotation()
	 * @generated
	 */
	void setQuasiSteadyRotation(QuasiSteadyRotationType value);

	/**
	 * Returns the value of the '<em><b>Control Surfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surfaces</em>' containment reference.
	 * @see #setControlSurfaces(ControlSurfaceDeflectionsType)
	 * @see Cpacs.CpacsPackage#getFlowConditionType_ControlSurfaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlSurfaces' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceDeflectionsType getControlSurfaces();

	/**
	 * Sets the value of the '{@link Cpacs.FlowConditionType#getControlSurfaces <em>Control Surfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surfaces</em>' containment reference.
	 * @see #getControlSurfaces()
	 * @generated
	 */
	void setControlSurfaces(ControlSurfaceDeflectionsType value);

} // FlowConditionType
