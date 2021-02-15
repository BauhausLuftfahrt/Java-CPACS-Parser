/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aircraft Analyses Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AircraftAnalysesType#getAeroPerformance <em>Aero Performance</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getAeroelastics <em>Aeroelastics</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getDynamicAircraftModel <em>Dynamic Aircraft Model</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getFlightDynamics <em>Flight Dynamics</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getFlyingQualities <em>Flying Qualities</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getFlightPerformance <em>Flight Performance</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getFlightSystems <em>Flight Systems</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getLandingGearPositionSafetyMargins <em>Landing Gear Position Safety Margins</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getLoadAnalysis <em>Load Analysis</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getMassBreakdown <em>Mass Breakdown</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getMonetaryValues <em>Monetary Values</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getNoise <em>Noise</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getTrajectories <em>Trajectories</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getWeightAndBalance <em>Weight And Balance</em>}</li>
 *   <li>{@link Cpacs.AircraftAnalysesType#getPaxFlow <em>Pax Flow</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAircraftAnalysesType()
 * @model extendedMetaData="name='aircraftAnalysesType' kind='elementOnly'"
 * @generated
 */
public interface AircraftAnalysesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Aero Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aero Performance</em>' containment reference.
	 * @see #setAeroPerformance(AeroPerformanceType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_AeroPerformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aeroPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroPerformanceType getAeroPerformance();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getAeroPerformance <em>Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Performance</em>' containment reference.
	 * @see #getAeroPerformance()
	 * @generated
	 */
	void setAeroPerformance(AeroPerformanceType value);

	/**
	 * Returns the value of the '<em><b>Aeroelastics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aeroelastics</em>' containment reference.
	 * @see #setAeroelastics(AeroelasticsType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_Aeroelastics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aeroelastics' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroelasticsType getAeroelastics();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getAeroelastics <em>Aeroelastics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aeroelastics</em>' containment reference.
	 * @see #getAeroelastics()
	 * @generated
	 */
	void setAeroelastics(AeroelasticsType value);

	/**
	 * Returns the value of the '<em><b>Dynamic Aircraft Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Aircraft Model</em>' containment reference.
	 * @see #setDynamicAircraftModel(DynamicAircraftModelAnalysisType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_DynamicAircraftModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dynamicAircraftModel' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicAircraftModelAnalysisType getDynamicAircraftModel();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getDynamicAircraftModel <em>Dynamic Aircraft Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Aircraft Model</em>' containment reference.
	 * @see #getDynamicAircraftModel()
	 * @generated
	 */
	void setDynamicAircraftModel(DynamicAircraftModelAnalysisType value);

	/**
	 * Returns the value of the '<em><b>Flight Dynamics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Dynamics</em>' containment reference.
	 * @see #setFlightDynamics(FlightDynamicsAnalysisType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_FlightDynamics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightDynamics' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightDynamicsAnalysisType getFlightDynamics();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getFlightDynamics <em>Flight Dynamics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Dynamics</em>' containment reference.
	 * @see #getFlightDynamics()
	 * @generated
	 */
	void setFlightDynamics(FlightDynamicsAnalysisType value);

	/**
	 * Returns the value of the '<em><b>Flying Qualities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flying Qualities</em>' containment reference.
	 * @see #setFlyingQualities(FlyingQualitiesType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_FlyingQualities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flyingQualities' namespace='##targetNamespace'"
	 * @generated
	 */
	FlyingQualitiesType getFlyingQualities();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getFlyingQualities <em>Flying Qualities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flying Qualities</em>' containment reference.
	 * @see #getFlyingQualities()
	 * @generated
	 */
	void setFlyingQualities(FlyingQualitiesType value);

	/**
	 * Returns the value of the '<em><b>Flight Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Performance</em>' containment reference.
	 * @see #setFlightPerformance(FlightPerformanceType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_FlightPerformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPerformanceType getFlightPerformance();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getFlightPerformance <em>Flight Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Performance</em>' containment reference.
	 * @see #getFlightPerformance()
	 * @generated
	 */
	void setFlightPerformance(FlightPerformanceType value);

	/**
	 * Returns the value of the '<em><b>Flight Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Systems</em>' containment reference.
	 * @see #setFlightSystems(FlightSystemsType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_FlightSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightSystemsType getFlightSystems();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getFlightSystems <em>Flight Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Systems</em>' containment reference.
	 * @see #getFlightSystems()
	 * @generated
	 */
	void setFlightSystems(FlightSystemsType value);

	/**
	 * Returns the value of the '<em><b>Landing Gear Position Safety Margins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Gear Position Safety Margins</em>' containment reference.
	 * @see #setLandingGearPositionSafetyMargins(LandingGearPositionSafetyMarginsType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_LandingGearPositionSafetyMargins()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landingGearPositionSafetyMargins' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingGearPositionSafetyMarginsType getLandingGearPositionSafetyMargins();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getLandingGearPositionSafetyMargins <em>Landing Gear Position Safety Margins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing Gear Position Safety Margins</em>' containment reference.
	 * @see #getLandingGearPositionSafetyMargins()
	 * @generated
	 */
	void setLandingGearPositionSafetyMargins(LandingGearPositionSafetyMarginsType value);

	/**
	 * Returns the value of the '<em><b>Load Analysis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Analysis</em>' containment reference.
	 * @see #setLoadAnalysis(LoadAnalysisType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_LoadAnalysis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadAnalysis' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadAnalysisType getLoadAnalysis();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getLoadAnalysis <em>Load Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Analysis</em>' containment reference.
	 * @see #getLoadAnalysis()
	 * @generated
	 */
	void setLoadAnalysis(LoadAnalysisType value);

	/**
	 * Returns the value of the '<em><b>Mass Breakdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Breakdown</em>' containment reference.
	 * @see #setMassBreakdown(MassBreakdownType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_MassBreakdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='massBreakdown' namespace='##targetNamespace'"
	 * @generated
	 */
	MassBreakdownType getMassBreakdown();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getMassBreakdown <em>Mass Breakdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Breakdown</em>' containment reference.
	 * @see #getMassBreakdown()
	 * @generated
	 */
	void setMassBreakdown(MassBreakdownType value);

	/**
	 * Returns the value of the '<em><b>Monetary Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monetary Values</em>' containment reference.
	 * @see #setMonetaryValues(MonetaryValuesAnalysisType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_MonetaryValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='monetaryValues' namespace='##targetNamespace'"
	 * @generated
	 */
	MonetaryValuesAnalysisType getMonetaryValues();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getMonetaryValues <em>Monetary Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monetary Values</em>' containment reference.
	 * @see #getMonetaryValues()
	 * @generated
	 */
	void setMonetaryValues(MonetaryValuesAnalysisType value);

	/**
	 * Returns the value of the '<em><b>Noise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noise</em>' containment reference.
	 * @see #setNoise(NoiseAnalysisType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_Noise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noise' namespace='##targetNamespace'"
	 * @generated
	 */
	NoiseAnalysisType getNoise();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getNoise <em>Noise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise</em>' containment reference.
	 * @see #getNoise()
	 * @generated
	 */
	void setNoise(NoiseAnalysisType value);

	/**
	 * Returns the value of the '<em><b>Trajectories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trajectories</em>' containment reference.
	 * @see #setTrajectories(TrajectoriesType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_Trajectories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trajectories' namespace='##targetNamespace'"
	 * @generated
	 */
	TrajectoriesType getTrajectories();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getTrajectories <em>Trajectories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectories</em>' containment reference.
	 * @see #getTrajectories()
	 * @generated
	 */
	void setTrajectories(TrajectoriesType value);

	/**
	 * Returns the value of the '<em><b>Weight And Balance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight And Balance</em>' containment reference.
	 * @see #setWeightAndBalance(WeightAndBalanceType)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_WeightAndBalance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weightAndBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	WeightAndBalanceType getWeightAndBalance();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getWeightAndBalance <em>Weight And Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight And Balance</em>' containment reference.
	 * @see #getWeightAndBalance()
	 * @generated
	 */
	void setWeightAndBalance(WeightAndBalanceType value);

	/**
	 * Returns the value of the '<em><b>Pax Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pax Flow</em>' attribute.
	 * @see #setPaxFlow(String)
	 * @see Cpacs.CpacsPackage#getAircraftAnalysesType_PaxFlow()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='paxFlow' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPaxFlow();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftAnalysesType#getPaxFlow <em>Pax Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pax Flow</em>' attribute.
	 * @see #getPaxFlow()
	 * @generated
	 */
	void setPaxFlow(String value);

} // AircraftAnalysesType
