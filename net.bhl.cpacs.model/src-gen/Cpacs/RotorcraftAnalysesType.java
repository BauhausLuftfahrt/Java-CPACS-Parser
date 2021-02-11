/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotorcraft Analyses Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorcraftAnalysesType#getAeroPerformance <em>Aero Performance</em>}</li>
 *   <li>{@link Cpacs.RotorcraftAnalysesType#getPaxFlow <em>Pax Flow</em>}</li>
 *   <li>{@link Cpacs.RotorcraftAnalysesType#getAeroelastics <em>Aeroelastics</em>}</li>
 *   <li>{@link Cpacs.RotorcraftAnalysesType#getMassBreakdown <em>Mass Breakdown</em>}</li>
 *   <li>{@link Cpacs.RotorcraftAnalysesType#getLandingGearPositionSafetyMargins <em>Landing Gear Position Safety Margins</em>}</li>
 *   <li>{@link Cpacs.RotorcraftAnalysesType#getLoadAnalysis <em>Load Analysis</em>}</li>
 *   <li>{@link Cpacs.RotorcraftAnalysesType#getDynamicAircraftModel <em>Dynamic Aircraft Model</em>}</li>
 *   <li>{@link Cpacs.RotorcraftAnalysesType#getWeightAndBalance <em>Weight And Balance</em>}</li>
 *   <li>{@link Cpacs.RotorcraftAnalysesType#getTrajectories <em>Trajectories</em>}</li>
 *   <li>{@link Cpacs.RotorcraftAnalysesType#getNoise <em>Noise</em>}</li>
 *   <li>{@link Cpacs.RotorcraftAnalysesType#getEmission <em>Emission</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorcraftAnalysesType()
 * @model extendedMetaData="name='rotorcraftAnalysesType' kind='elementOnly'"
 * @generated
 */
public interface RotorcraftAnalysesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Aero Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aero Performance</em>' containment reference.
	 * @see #setAeroPerformance(AeroPerformanceRCType)
	 * @see Cpacs.CpacsPackage#getRotorcraftAnalysesType_AeroPerformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aeroPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroPerformanceRCType getAeroPerformance();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftAnalysesType#getAeroPerformance <em>Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Performance</em>' containment reference.
	 * @see #getAeroPerformance()
	 * @generated
	 */
	void setAeroPerformance(AeroPerformanceRCType value);

	/**
	 * Returns the value of the '<em><b>Pax Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pax Flow</em>' attribute.
	 * @see #setPaxFlow(String)
	 * @see Cpacs.CpacsPackage#getRotorcraftAnalysesType_PaxFlow()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='paxFlow' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPaxFlow();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftAnalysesType#getPaxFlow <em>Pax Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pax Flow</em>' attribute.
	 * @see #getPaxFlow()
	 * @generated
	 */
	void setPaxFlow(String value);

	/**
	 * Returns the value of the '<em><b>Aeroelastics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aeroelastics</em>' containment reference.
	 * @see #setAeroelastics(AeroelasticsType)
	 * @see Cpacs.CpacsPackage#getRotorcraftAnalysesType_Aeroelastics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aeroelastics' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroelasticsType getAeroelastics();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftAnalysesType#getAeroelastics <em>Aeroelastics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aeroelastics</em>' containment reference.
	 * @see #getAeroelastics()
	 * @generated
	 */
	void setAeroelastics(AeroelasticsType value);

	/**
	 * Returns the value of the '<em><b>Mass Breakdown</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Breakdown</em>' containment reference.
	 * @see #setMassBreakdown(RotorcraftMassBreakdownType)
	 * @see Cpacs.CpacsPackage#getRotorcraftAnalysesType_MassBreakdown()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='massBreakdown' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorcraftMassBreakdownType getMassBreakdown();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftAnalysesType#getMassBreakdown <em>Mass Breakdown</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Breakdown</em>' containment reference.
	 * @see #getMassBreakdown()
	 * @generated
	 */
	void setMassBreakdown(RotorcraftMassBreakdownType value);

	/**
	 * Returns the value of the '<em><b>Landing Gear Position Safety Margins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Gear Position Safety Margins</em>' containment reference.
	 * @see #setLandingGearPositionSafetyMargins(LandingGearPositionSafetyMarginsType)
	 * @see Cpacs.CpacsPackage#getRotorcraftAnalysesType_LandingGearPositionSafetyMargins()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landingGearPositionSafetyMargins' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingGearPositionSafetyMarginsType getLandingGearPositionSafetyMargins();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftAnalysesType#getLandingGearPositionSafetyMargins <em>Landing Gear Position Safety Margins</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getRotorcraftAnalysesType_LoadAnalysis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadAnalysis' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadAnalysisType getLoadAnalysis();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftAnalysesType#getLoadAnalysis <em>Load Analysis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Analysis</em>' containment reference.
	 * @see #getLoadAnalysis()
	 * @generated
	 */
	void setLoadAnalysis(LoadAnalysisType value);

	/**
	 * Returns the value of the '<em><b>Dynamic Aircraft Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Aircraft Model</em>' containment reference.
	 * @see #setDynamicAircraftModel(DynamicAircraftModelAnalysisType)
	 * @see Cpacs.CpacsPackage#getRotorcraftAnalysesType_DynamicAircraftModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dynamicAircraftModel' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicAircraftModelAnalysisType getDynamicAircraftModel();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftAnalysesType#getDynamicAircraftModel <em>Dynamic Aircraft Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Aircraft Model</em>' containment reference.
	 * @see #getDynamicAircraftModel()
	 * @generated
	 */
	void setDynamicAircraftModel(DynamicAircraftModelAnalysisType value);

	/**
	 * Returns the value of the '<em><b>Weight And Balance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight And Balance</em>' containment reference.
	 * @see #setWeightAndBalance(WeightAndBalanceType)
	 * @see Cpacs.CpacsPackage#getRotorcraftAnalysesType_WeightAndBalance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weightAndBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	WeightAndBalanceType getWeightAndBalance();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftAnalysesType#getWeightAndBalance <em>Weight And Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight And Balance</em>' containment reference.
	 * @see #getWeightAndBalance()
	 * @generated
	 */
	void setWeightAndBalance(WeightAndBalanceType value);

	/**
	 * Returns the value of the '<em><b>Trajectories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trajectories</em>' containment reference.
	 * @see #setTrajectories(TrajectoriesType)
	 * @see Cpacs.CpacsPackage#getRotorcraftAnalysesType_Trajectories()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trajectories' namespace='##targetNamespace'"
	 * @generated
	 */
	TrajectoriesType getTrajectories();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftAnalysesType#getTrajectories <em>Trajectories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectories</em>' containment reference.
	 * @see #getTrajectories()
	 * @generated
	 */
	void setTrajectories(TrajectoriesType value);

	/**
	 * Returns the value of the '<em><b>Noise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noise</em>' containment reference.
	 * @see #setNoise(NoiseAnalysisType)
	 * @see Cpacs.CpacsPackage#getRotorcraftAnalysesType_Noise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noise' namespace='##targetNamespace'"
	 * @generated
	 */
	NoiseAnalysisType getNoise();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftAnalysesType#getNoise <em>Noise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise</em>' containment reference.
	 * @see #getNoise()
	 * @generated
	 */
	void setNoise(NoiseAnalysisType value);

	/**
	 * Returns the value of the '<em><b>Emission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emission</em>' attribute.
	 * @see #setEmission(String)
	 * @see Cpacs.CpacsPackage#getRotorcraftAnalysesType_Emission()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='emission' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmission();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftAnalysesType#getEmission <em>Emission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emission</em>' attribute.
	 * @see #getEmission()
	 * @generated
	 */
	void setEmission(String value);

} // RotorcraftAnalysesType
