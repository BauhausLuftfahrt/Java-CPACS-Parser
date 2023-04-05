/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aircraft Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AircraftModelType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getReference <em>Reference</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getFuselages <em>Fuselages</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getWings <em>Wings</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getEngines <em>Engines</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getEnginePylons <em>Engine Pylons</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getLandingGears <em>Landing Gears</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getSystems <em>Systems</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getGenericGeometryComponents <em>Generic Geometry Components</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getGlobal <em>Global</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getAnalyses <em>Analyses</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getPerformanceRequirements <em>Performance Requirements</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link Cpacs.AircraftModelType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAircraftModelType()
 * @model extendedMetaData="name='aircraftModelType' kind='elementOnly'"
 * @generated
 */
public interface AircraftModelType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the aircraft model
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of the aircraft model
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getReference();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Fuselages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselages</em>' containment reference.
	 * @see #setFuselages(FuselagesType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_Fuselages()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuselages' namespace='##targetNamespace'"
	 * @generated
	 */
	FuselagesType getFuselages();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getFuselages <em>Fuselages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselages</em>' containment reference.
	 * @see #getFuselages()
	 * @generated
	 */
	void setFuselages(FuselagesType value);

	/**
	 * Returns the value of the '<em><b>Wings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wings</em>' containment reference.
	 * @see #setWings(WingsType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_Wings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wings' namespace='##targetNamespace'"
	 * @generated
	 */
	WingsType getWings();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getWings <em>Wings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wings</em>' containment reference.
	 * @see #getWings()
	 * @generated
	 */
	void setWings(WingsType value);

	/**
	 * Returns the value of the '<em><b>Engines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engines</em>' containment reference.
	 * @see #setEngines(EnginePositionsType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_Engines()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='engines' namespace='##targetNamespace'"
	 * @generated
	 */
	EnginePositionsType getEngines();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getEngines <em>Engines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engines</em>' containment reference.
	 * @see #getEngines()
	 * @generated
	 */
	void setEngines(EnginePositionsType value);

	/**
	 * Returns the value of the '<em><b>Engine Pylons</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Pylons</em>' containment reference.
	 * @see #setEnginePylons(EnginePylonsType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_EnginePylons()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enginePylons' namespace='##targetNamespace'"
	 * @generated
	 */
	EnginePylonsType getEnginePylons();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getEnginePylons <em>Engine Pylons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Pylons</em>' containment reference.
	 * @see #getEnginePylons()
	 * @generated
	 */
	void setEnginePylons(EnginePylonsType value);

	/**
	 * Returns the value of the '<em><b>Landing Gears</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Gears</em>' containment reference.
	 * @see #setLandingGears(LandingGearsType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_LandingGears()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landingGears' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingGearsType getLandingGears();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getLandingGears <em>Landing Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing Gears</em>' containment reference.
	 * @see #getLandingGears()
	 * @generated
	 */
	void setLandingGears(LandingGearsType value);

	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference.
	 * @see #setSystems(SystemsType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_Systems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='systems' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemsType getSystems();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getSystems <em>Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systems</em>' containment reference.
	 * @see #getSystems()
	 * @generated
	 */
	void setSystems(SystemsType value);

	/**
	 * Returns the value of the '<em><b>Generic Geometry Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Geometry Components</em>' containment reference.
	 * @see #setGenericGeometryComponents(GenericGeometryComponentsType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_GenericGeometryComponents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genericGeometryComponents' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericGeometryComponentsType getGenericGeometryComponents();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getGenericGeometryComponents <em>Generic Geometry Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Geometry Components</em>' containment reference.
	 * @see #getGenericGeometryComponents()
	 * @generated
	 */
	void setGenericGeometryComponents(GenericGeometryComponentsType value);

	/**
	 * Returns the value of the '<em><b>Global</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' containment reference.
	 * @see #setGlobal(AircraftGlobalType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_Global()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='global' namespace='##targetNamespace'"
	 * @generated
	 */
	AircraftGlobalType getGlobal();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getGlobal <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' containment reference.
	 * @see #getGlobal()
	 * @generated
	 */
	void setGlobal(AircraftGlobalType value);

	/**
	 * Returns the value of the '<em><b>Analyses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyses</em>' containment reference.
	 * @see #setAnalyses(AircraftAnalysesType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_Analyses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='analyses' namespace='##targetNamespace'"
	 * @generated
	 */
	AircraftAnalysesType getAnalyses();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getAnalyses <em>Analyses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analyses</em>' containment reference.
	 * @see #getAnalyses()
	 * @generated
	 */
	void setAnalyses(AircraftAnalysesType value);

	/**
	 * Returns the value of the '<em><b>Performance Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Requirements</em>' containment reference.
	 * @see #setPerformanceRequirements(PerformanceRequirementsType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_PerformanceRequirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performanceRequirements' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceRequirementsType getPerformanceRequirements();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getPerformanceRequirements <em>Performance Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Requirements</em>' containment reference.
	 * @see #getPerformanceRequirements()
	 * @generated
	 */
	void setPerformanceRequirements(PerformanceRequirementsType value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference.
	 * @see #setConfigurations(VehicleConfigurationsType)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_Configurations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configurations' namespace='##targetNamespace'"
	 * @generated
	 */
	VehicleConfigurationsType getConfigurations();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getConfigurations <em>Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations</em>' containment reference.
	 * @see #getConfigurations()
	 * @generated
	 */
	void setConfigurations(VehicleConfigurationsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getAircraftModelType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftModelType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // AircraftModelType
