/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPointType#getIndex <em>Index</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getSegmentUID <em>Segment UID</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getFlightTime <em>Flight Time</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getFlightDistance <em>Flight Distance</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getGroundDistance <em>Ground Distance</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getStaticPressure <em>Static Pressure</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getTAS <em>TAS</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getCAS <em>CAS</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getAngleOfRoll <em>Angle Of Roll</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getFuelFlow <em>Fuel Flow</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getCOFlow <em>CO Flow</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getCO2Flow <em>CO2 Flow</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getNOXFlow <em>NOX Flow</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getSootFlow <em>Soot Flow</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getHCFlow <em>HC Flow</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getSO2Flow <em>SO2 Flow</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getGearDeflections <em>Gear Deflections</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getControlSurfaceDeflections <em>Control Surface Deflections</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getThrust <em>Thrust</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getN1 <em>N1</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getRefLocation <em>Ref Location</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getCurrentLocation <em>Current Location</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link Cpacs.FlightPointType#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPointType()
 * @model extendedMetaData="name='flightPointType' kind='elementOnly'"
 * @generated
 */
public interface FlightPointType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_Index()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='index' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getIndex();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Segment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment UID</em>' containment reference.
	 * @see #setSegmentUID(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_SegmentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getSegmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getSegmentUID <em>Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment UID</em>' containment reference.
	 * @see #getSegmentUID()
	 * @generated
	 */
	void setSegmentUID(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Flight Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Time</em>' containment reference.
	 * @see #setFlightTime(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_FlightTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightTime' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFlightTime();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getFlightTime <em>Flight Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Time</em>' containment reference.
	 * @see #getFlightTime()
	 * @generated
	 */
	void setFlightTime(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Flight Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Distance</em>' containment reference.
	 * @see #setFlightDistance(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_FlightDistance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFlightDistance();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getFlightDistance <em>Flight Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Distance</em>' containment reference.
	 * @see #getFlightDistance()
	 * @generated
	 */
	void setFlightDistance(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Ground Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Distance</em>' containment reference.
	 * @see #setGroundDistance(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_GroundDistance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='groundDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getGroundDistance();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getGroundDistance <em>Ground Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Distance</em>' containment reference.
	 * @see #getGroundDistance()
	 * @generated
	 */
	void setGroundDistance(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Static Pressure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Pressure</em>' containment reference.
	 * @see #setStaticPressure(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_StaticPressure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staticPressure' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getStaticPressure();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getStaticPressure <em>Static Pressure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Pressure</em>' containment reference.
	 * @see #getStaticPressure()
	 * @generated
	 */
	void setStaticPressure(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>TAS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TAS</em>' containment reference.
	 * @see #setTAS(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_TAS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tAS' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getTAS();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getTAS <em>TAS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TAS</em>' containment reference.
	 * @see #getTAS()
	 * @generated
	 */
	void setTAS(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>CAS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CAS</em>' containment reference.
	 * @see #setCAS(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_CAS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cAS' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCAS();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getCAS <em>CAS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CAS</em>' containment reference.
	 * @see #getCAS()
	 * @generated
	 */
	void setCAS(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Attack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_AngleOfAttack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Sideslip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #setAngleOfSideslip(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_AngleOfSideslip()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleOfSideslip' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAngleOfSideslip();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getAngleOfSideslip <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #getAngleOfSideslip()
	 * @generated
	 */
	void setAngleOfSideslip(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Roll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Of Roll</em>' containment reference.
	 * @see #setAngleOfRoll(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_AngleOfRoll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleOfRoll' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAngleOfRoll();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getAngleOfRoll <em>Angle Of Roll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Roll</em>' containment reference.
	 * @see #getAngleOfRoll()
	 * @generated
	 */
	void setAngleOfRoll(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_Mass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Fuel Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuel Flow</em>' containment reference.
	 * @see #setFuelFlow(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_FuelFlow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuelFlow' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFuelFlow();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getFuelFlow <em>Fuel Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuel Flow</em>' containment reference.
	 * @see #getFuelFlow()
	 * @generated
	 */
	void setFuelFlow(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>CO Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CO Flow</em>' containment reference.
	 * @see #setCOFlow(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_COFlow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cOFlow' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCOFlow();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getCOFlow <em>CO Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO Flow</em>' containment reference.
	 * @see #getCOFlow()
	 * @generated
	 */
	void setCOFlow(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>CO2 Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CO2 Flow</em>' containment reference.
	 * @see #setCO2Flow(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_CO2Flow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cO2Flow' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCO2Flow();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getCO2Flow <em>CO2 Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO2 Flow</em>' containment reference.
	 * @see #getCO2Flow()
	 * @generated
	 */
	void setCO2Flow(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>NOX Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NOX Flow</em>' containment reference.
	 * @see #setNOXFlow(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_NOXFlow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nOXFlow' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNOXFlow();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getNOXFlow <em>NOX Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NOX Flow</em>' containment reference.
	 * @see #getNOXFlow()
	 * @generated
	 */
	void setNOXFlow(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Soot Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soot Flow</em>' containment reference.
	 * @see #setSootFlow(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_SootFlow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sootFlow' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getSootFlow();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getSootFlow <em>Soot Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soot Flow</em>' containment reference.
	 * @see #getSootFlow()
	 * @generated
	 */
	void setSootFlow(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>HC Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HC Flow</em>' containment reference.
	 * @see #setHCFlow(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_HCFlow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hCFlow' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getHCFlow();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getHCFlow <em>HC Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HC Flow</em>' containment reference.
	 * @see #getHCFlow()
	 * @generated
	 */
	void setHCFlow(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>SO2 Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SO2 Flow</em>' containment reference.
	 * @see #setSO2Flow(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_SO2Flow()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sO2Flow' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getSO2Flow();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getSO2Flow <em>SO2 Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SO2 Flow</em>' containment reference.
	 * @see #getSO2Flow()
	 * @generated
	 */
	void setSO2Flow(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Gear Deflections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gear Deflections</em>' containment reference.
	 * @see #setGearDeflections(GearDeflectionVectorsType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_GearDeflections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='gearDeflections' namespace='##targetNamespace'"
	 * @generated
	 */
	GearDeflectionVectorsType getGearDeflections();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getGearDeflections <em>Gear Deflections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gear Deflections</em>' containment reference.
	 * @see #getGearDeflections()
	 * @generated
	 */
	void setGearDeflections(GearDeflectionVectorsType value);

	/**
	 * Returns the value of the '<em><b>Control Surface Deflections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surface Deflections</em>' containment reference.
	 * @see #setControlSurfaceDeflections(ControlSurfaceDeflectionVectorsType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_ControlSurfaceDeflections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlSurfaceDeflections' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceDeflectionVectorsType getControlSurfaceDeflections();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getControlSurfaceDeflections <em>Control Surface Deflections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surface Deflections</em>' containment reference.
	 * @see #getControlSurfaceDeflections()
	 * @generated
	 */
	void setControlSurfaceDeflections(ControlSurfaceDeflectionVectorsType value);

	/**
	 * Returns the value of the '<em><b>Thrust</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrust</em>' containment reference.
	 * @see #setThrust(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_Thrust()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thrust' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getThrust();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getThrust <em>Thrust</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrust</em>' containment reference.
	 * @see #getThrust()
	 * @generated
	 */
	void setThrust(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>N1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>N1</em>' containment reference.
	 * @see #setN1(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_N1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='n1' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getN1();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getN1 <em>N1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N1</em>' containment reference.
	 * @see #getN1()
	 * @generated
	 */
	void setN1(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Ref Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Location</em>' containment reference.
	 * @see #setRefLocation(PointListXYZVectorType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_RefLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='refLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointListXYZVectorType getRefLocation();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getRefLocation <em>Ref Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Location</em>' containment reference.
	 * @see #getRefLocation()
	 * @generated
	 */
	void setRefLocation(PointListXYZVectorType value);

	/**
	 * Returns the value of the '<em><b>Current Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Location</em>' containment reference.
	 * @see #setCurrentLocation(PointListXYZVectorType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_CurrentLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currentLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointListXYZVectorType getCurrentLocation();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getCurrentLocation <em>Current Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Location</em>' containment reference.
	 * @see #getCurrentLocation()
	 * @generated
	 */
	void setCurrentLocation(PointListXYZVectorType value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' containment reference.
	 * @see #setLatitude(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_Latitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='latitude' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getLatitude();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getLatitude <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' containment reference.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' containment reference.
	 * @see #setLongitude(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_Longitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='longitude' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getLongitude();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getLongitude <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' containment reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPointType_Altitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPointType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(StringVectorBaseType value);

} // FlightPointType
