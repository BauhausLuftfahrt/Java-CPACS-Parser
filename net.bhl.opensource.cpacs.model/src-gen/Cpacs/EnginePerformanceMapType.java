/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Performance Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getBleedAirOfftake <em>Bleed Air Offtake</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getPowerOfftake <em>Power Offtake</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getFlightLevel <em>Flight Level</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getThrust <em>Thrust</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getMDotFuel <em>MDot Fuel</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getV8 <em>V8</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getT8 <em>T8</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getMDot8 <em>MDot8</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getV18 <em>V18</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getT18 <em>T18</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getMDot18 <em>MDot18</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getN1 <em>N1</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getN2 <em>N2</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getPiFan <em>Pi Fan</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getEtaPFan <em>Eta PFan</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getTET <em>TET</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getEiCO <em>Ei CO</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getEiNOx <em>Ei NOx</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getEiSOx <em>Ei SOx</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getEiSoot <em>Ei Soot</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getEiHC <em>Ei HC</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getRho8 <em>Rho8</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getRho18 <em>Rho18</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getNozzA8 <em>Nozz A8</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getNozzA18 <em>Nozz A18</em>}</li>
 *   <li>{@link Cpacs.EnginePerformanceMapType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType()
 * @model extendedMetaData="name='enginePerformanceMapType' kind='elementOnly'"
 * @generated
 */
public interface EnginePerformanceMapType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Bleed Air Offtake</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bleed Air Offtake</em>' containment reference.
	 * @see #setBleedAirOfftake(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_BleedAirOfftake()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='bleedAirOfftake' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getBleedAirOfftake();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getBleedAirOfftake <em>Bleed Air Offtake</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bleed Air Offtake</em>' containment reference.
	 * @see #getBleedAirOfftake()
	 * @generated
	 */
	void setBleedAirOfftake(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Power Offtake</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Offtake</em>' containment reference.
	 * @see #setPowerOfftake(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_PowerOfftake()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='powerOfftake' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPowerOfftake();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getPowerOfftake <em>Power Offtake</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Offtake</em>' containment reference.
	 * @see #getPowerOfftake()
	 * @generated
	 */
	void setPowerOfftake(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Flight Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flight Level
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flight Level</em>' containment reference.
	 * @see #setFlightLevel(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_FlightLevel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getFlightLevel();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getFlightLevel <em>Flight Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Level</em>' containment reference.
	 * @see #getFlightLevel()
	 * @generated
	 */
	void setFlightLevel(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mach number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_MachNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Thrust</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Absolute thrust [N]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thrust</em>' containment reference.
	 * @see #setThrust(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_Thrust()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thrust' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getThrust();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getThrust <em>Thrust</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrust</em>' containment reference.
	 * @see #getThrust()
	 * @generated
	 */
	void setThrust(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>MDot Fuel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fuel mass flow
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MDot Fuel</em>' containment reference.
	 * @see #setMDotFuel(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_MDotFuel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mDotFuel' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMDotFuel();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getMDotFuel <em>MDot Fuel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDot Fuel</em>' containment reference.
	 * @see #getMDotFuel()
	 * @generated
	 */
	void setMDotFuel(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>V8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speed at core engine nozzle
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>V8</em>' containment reference.
	 * @see #setV8(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_V8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='v8' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getV8();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getV8 <em>V8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V8</em>' containment reference.
	 * @see #getV8()
	 * @generated
	 */
	void setV8(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>T8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total temperature at core engine nozzle
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>T8</em>' containment reference.
	 * @see #setT8(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_T8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='t8' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getT8();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getT8 <em>T8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T8</em>' containment reference.
	 * @see #getT8()
	 * @generated
	 */
	void setT8(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>MDot8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mass flow through core engine nozzle
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MDot8</em>' containment reference.
	 * @see #setMDot8(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_MDot8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mDot8' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMDot8();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getMDot8 <em>MDot8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDot8</em>' containment reference.
	 * @see #getMDot8()
	 * @generated
	 */
	void setMDot8(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>V18</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speed at bypass nozzle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>V18</em>' containment reference.
	 * @see #setV18(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_V18()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='v18' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getV18();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getV18 <em>V18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V18</em>' containment reference.
	 * @see #getV18()
	 * @generated
	 */
	void setV18(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>T18</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total temperature at bypass nozzle
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>T18</em>' containment reference.
	 * @see #setT18(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_T18()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='t18' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getT18();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getT18 <em>T18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T18</em>' containment reference.
	 * @see #getT18()
	 * @generated
	 */
	void setT18(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>MDot18</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mass flow through bypass nozzle
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MDot18</em>' containment reference.
	 * @see #setMDot18(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_MDot18()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mDot18' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMDot18();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getMDot18 <em>MDot18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MDot18</em>' containment reference.
	 * @see #getMDot18()
	 * @generated
	 */
	void setMDot18(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>N1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Percent of n1Max, shaft 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>N1</em>' containment reference.
	 * @see #setN1(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_N1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='n1' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getN1();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getN1 <em>N1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N1</em>' containment reference.
	 * @see #getN1()
	 * @generated
	 */
	void setN1(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>N2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Percent of n2Max, shaft 2
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>N2</em>' containment reference.
	 * @see #setN2(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_N2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='n2' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getN2();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getN2 <em>N2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N2</em>' containment reference.
	 * @see #getN2()
	 * @generated
	 */
	void setN2(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Pi Fan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fan pressure ratio
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pi Fan</em>' containment reference.
	 * @see #setPiFan(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_PiFan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='piFan' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getPiFan();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getPiFan <em>Pi Fan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pi Fan</em>' containment reference.
	 * @see #getPiFan()
	 * @generated
	 */
	void setPiFan(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Eta PFan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fan efficiency
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eta PFan</em>' containment reference.
	 * @see #setEtaPFan(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_EtaPFan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='etaPFan' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getEtaPFan();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getEtaPFan <em>Eta PFan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eta PFan</em>' containment reference.
	 * @see #getEtaPFan()
	 * @generated
	 */
	void setEtaPFan(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>TET</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Turbine entry total temperature
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TET</em>' containment reference.
	 * @see #setTET(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_TET()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tET' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getTET();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getTET <em>TET</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TET</em>' containment reference.
	 * @see #getTET()
	 * @generated
	 */
	void setTET(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Ei CO</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Emission index Carbon Monoxide
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ei CO</em>' containment reference.
	 * @see #setEiCO(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_EiCO()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eiCO' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getEiCO();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getEiCO <em>Ei CO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ei CO</em>' containment reference.
	 * @see #getEiCO()
	 * @generated
	 */
	void setEiCO(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Ei NOx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Emission index Nitrogen Oxide
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ei NOx</em>' containment reference.
	 * @see #setEiNOx(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_EiNOx()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eiNOx' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getEiNOx();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getEiNOx <em>Ei NOx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ei NOx</em>' containment reference.
	 * @see #getEiNOx()
	 * @generated
	 */
	void setEiNOx(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Ei SOx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Emission index Sulfur Oxide
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ei SOx</em>' containment reference.
	 * @see #setEiSOx(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_EiSOx()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eiSOx' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getEiSOx();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getEiSOx <em>Ei SOx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ei SOx</em>' containment reference.
	 * @see #getEiSOx()
	 * @generated
	 */
	void setEiSOx(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Ei Soot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Emission index Soot
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ei Soot</em>' containment reference.
	 * @see #setEiSoot(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_EiSoot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eiSoot' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getEiSoot();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getEiSoot <em>Ei Soot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ei Soot</em>' containment reference.
	 * @see #getEiSoot()
	 * @generated
	 */
	void setEiSoot(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Ei HC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Emission index unburned hydrocarbon
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ei HC</em>' containment reference.
	 * @see #setEiHC(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_EiHC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='eiHC' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getEiHC();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getEiHC <em>Ei HC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ei HC</em>' containment reference.
	 * @see #getEiHC()
	 * @generated
	 */
	void setEiHC(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Rho8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * air density at core outlet 8
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rho8</em>' containment reference.
	 * @see #setRho8(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_Rho8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rho8' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getRho8();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getRho8 <em>Rho8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rho8</em>' containment reference.
	 * @see #getRho8()
	 * @generated
	 */
	void setRho8(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Rho18</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * air density at bypass outlet 18
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rho18</em>' containment reference.
	 * @see #setRho18(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_Rho18()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rho18' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getRho18();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getRho18 <em>Rho18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rho18</em>' containment reference.
	 * @see #getRho18()
	 * @generated
	 */
	void setRho18(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Nozz A8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * area at core outlet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nozz A8</em>' containment reference.
	 * @see #setNozzA8(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_NozzA8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nozzA8' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNozzA8();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getNozzA8 <em>Nozz A8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nozz A8</em>' containment reference.
	 * @see #getNozzA8()
	 * @generated
	 */
	void setNozzA8(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Nozz A18</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * area at bypass outlet
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nozz A18</em>' containment reference.
	 * @see #setNozzA18(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_NozzA18()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nozzA18' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNozzA18();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getNozzA18 <em>Nozz A18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nozz A18</em>' containment reference.
	 * @see #getNozzA18()
	 * @generated
	 */
	void setNozzA18(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getEnginePerformanceMapType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.EnginePerformanceMapType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // EnginePerformanceMapType
