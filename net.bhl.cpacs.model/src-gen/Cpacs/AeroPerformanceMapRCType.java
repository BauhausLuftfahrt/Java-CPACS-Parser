/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Performance Map RC Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getAtmosphericModel <em>Atmospheric Model</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getAnalysisTool <em>Analysis Tool</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getAnalysisLevel <em>Analysis Level</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getCfx <em>Cfx</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getCfy <em>Cfy</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getCfz <em>Cfz</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getCmx <em>Cmx</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getCmy <em>Cmy</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getCmz <em>Cmz</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapRCType#getDampingDerivatives <em>Damping Derivatives</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType()
 * @model extendedMetaData="name='aeroPerformanceMapRCType' kind='elementOnly'"
 * @generated
 */
public interface AeroPerformanceMapRCType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Atmospheric Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Atmospheric model and temperature offset
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Atmospheric Model</em>' containment reference.
	 * @see #setAtmosphericModel(AtmosphericModelOldType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_AtmosphericModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='atmosphericModel' namespace='##targetNamespace'"
	 * @generated
	 */
	AtmosphericModelOldType getAtmosphericModel();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getAtmosphericModel <em>Atmospheric Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atmospheric Model</em>' containment reference.
	 * @see #getAtmosphericModel()
	 * @generated
	 */
	void setAtmosphericModel(AtmosphericModelOldType value);

	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mach number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_MachNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Altitude
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_Altitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Sideslip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sideslip angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #setAngleOfSideslip(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_AngleOfSideslip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfSideslip' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAngleOfSideslip();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getAngleOfSideslip <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #getAngleOfSideslip()
	 * @generated
	 */
	void setAngleOfSideslip(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Attack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angle of attack
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_AngleOfAttack()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Analysis Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name and version of the tool used to compute
	 *                                 the aerodynamic performance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Analysis Tool</em>' containment reference.
	 * @see #setAnalysisTool(ToolType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_AnalysisTool()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='analysisTool' namespace='##targetNamespace'"
	 * @generated
	 */
	ToolType getAnalysisTool();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getAnalysisTool <em>Analysis Tool</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Tool</em>' containment reference.
	 * @see #getAnalysisTool()
	 * @generated
	 */
	void setAnalysisTool(ToolType value);

	/**
	 * Returns the value of the '<em><b>Analysis Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modeling level of the methods used to compute
	 *                                 the aerodynamic performance. The higher the analysisLevel, the
	 *                                 higher the quality of the results. Possible use of
	 *                                 analysisLevel: 0- 9 = Statistical models, 10-19 = Analytic
	 *                                 models, 20-29 = Lifting line method, 30-39 = Panel method, 40-49
	 *                                 = Panel-BL-coupled method, 50-59 = Full potential method, 60-69
	 *                                 = Full potential-BL coupled method, 70-79 = CFD euler method,
	 *                                 80-89 = CFD euler-bl coupled method, 99-99 = CFD RANS method,
	 *                                 >=100 = Experimental data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Analysis Level</em>' containment reference.
	 * @see #setAnalysisLevel(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_AnalysisLevel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='analysisLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getAnalysisLevel();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getAnalysisLevel <em>Analysis Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Level</em>' containment reference.
	 * @see #getAnalysisLevel()
	 * @generated
	 */
	void setAnalysisLevel(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Cfx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfx</em>' containment reference.
	 * @see #setCfx(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_Cfx()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cfx' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getCfx();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getCfx <em>Cfx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfx</em>' containment reference.
	 * @see #getCfx()
	 * @generated
	 */
	void setCfx(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Cfy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfy</em>' containment reference.
	 * @see #setCfy(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_Cfy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cfy' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getCfy();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getCfy <em>Cfy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfy</em>' containment reference.
	 * @see #getCfy()
	 * @generated
	 */
	void setCfy(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Cfz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfz</em>' containment reference.
	 * @see #setCfz(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_Cfz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cfz' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getCfz();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getCfz <em>Cfz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfz</em>' containment reference.
	 * @see #getCfz()
	 * @generated
	 */
	void setCfz(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Cmx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmx</em>' containment reference.
	 * @see #setCmx(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_Cmx()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmx' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getCmx();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getCmx <em>Cmx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmx</em>' containment reference.
	 * @see #getCmx()
	 * @generated
	 */
	void setCmx(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Cmy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmy</em>' containment reference.
	 * @see #setCmy(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_Cmy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmy' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getCmy();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getCmy <em>Cmy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmy</em>' containment reference.
	 * @see #getCmy()
	 * @generated
	 */
	void setCmy(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Cmz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmz</em>' containment reference.
	 * @see #setCmz(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_Cmz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmz' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getCmz();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getCmz <em>Cmz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmz</em>' containment reference.
	 * @see #getCmz()
	 * @generated
	 */
	void setCmz(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Damping Derivatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damping Derivatives</em>' containment reference.
	 * @see #setDampingDerivatives(DampingDerivativesRatesArrayType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapRCType_DampingDerivatives()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dampingDerivatives' namespace='##targetNamespace'"
	 * @generated
	 */
	DampingDerivativesRatesArrayType getDampingDerivatives();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapRCType#getDampingDerivatives <em>Damping Derivatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damping Derivatives</em>' containment reference.
	 * @see #getDampingDerivatives()
	 * @generated
	 */
	void setDampingDerivatives(DampingDerivativesRatesArrayType value);

} // AeroPerformanceMapRCType
