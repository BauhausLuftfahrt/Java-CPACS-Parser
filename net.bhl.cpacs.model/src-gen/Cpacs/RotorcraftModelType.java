/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotorcraft Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorcraftModelType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getReference <em>Reference</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getFuselages <em>Fuselages</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getWings <em>Wings</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getRotors <em>Rotors</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getRotorBlades <em>Rotor Blades</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getEngines <em>Engines</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getDriveSystems <em>Drive Systems</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getLandingGear <em>Landing Gear</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getSystems <em>Systems</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getGlobal <em>Global</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getAnalyses <em>Analyses</em>}</li>
 *   <li>{@link Cpacs.RotorcraftModelType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorcraftModelType()
 * @model extendedMetaData="name='rotorcraftModelType' kind='elementOnly'"
 * @generated
 */
public interface RotorcraftModelType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of rotorcraft model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getName <em>Name</em>}' containment reference.
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
	 * Description of rotorcraft model
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getDescription <em>Description</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getReference();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getReference <em>Reference</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_Fuselages()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuselages' namespace='##targetNamespace'"
	 * @generated
	 */
	FuselagesType getFuselages();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getFuselages <em>Fuselages</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_Wings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wings' namespace='##targetNamespace'"
	 * @generated
	 */
	WingsType getWings();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getWings <em>Wings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wings</em>' containment reference.
	 * @see #getWings()
	 * @generated
	 */
	void setWings(WingsType value);

	/**
	 * Returns the value of the '<em><b>Rotors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotors</em>' containment reference.
	 * @see #setRotors(RotorsType)
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_Rotors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotors' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorsType getRotors();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getRotors <em>Rotors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotors</em>' containment reference.
	 * @see #getRotors()
	 * @generated
	 */
	void setRotors(RotorsType value);

	/**
	 * Returns the value of the '<em><b>Rotor Blades</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotor Blades</em>' containment reference.
	 * @see #setRotorBlades(RotorBladesType)
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_RotorBlades()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotorBlades' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorBladesType getRotorBlades();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getRotorBlades <em>Rotor Blades</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotor Blades</em>' containment reference.
	 * @see #getRotorBlades()
	 * @generated
	 */
	void setRotorBlades(RotorBladesType value);

	/**
	 * Returns the value of the '<em><b>Engines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engines</em>' containment reference.
	 * @see #setEngines(EnginePositionsType)
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_Engines()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='engines' namespace='##targetNamespace'"
	 * @generated
	 */
	EnginePositionsType getEngines();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getEngines <em>Engines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engines</em>' containment reference.
	 * @see #getEngines()
	 * @generated
	 */
	void setEngines(EnginePositionsType value);

	/**
	 * Returns the value of the '<em><b>Drive Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drive Systems</em>' containment reference.
	 * @see #setDriveSystems(DriveSystemsType)
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_DriveSystems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='driveSystems' namespace='##targetNamespace'"
	 * @generated
	 */
	DriveSystemsType getDriveSystems();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getDriveSystems <em>Drive Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drive Systems</em>' containment reference.
	 * @see #getDriveSystems()
	 * @generated
	 */
	void setDriveSystems(DriveSystemsType value);

	/**
	 * Returns the value of the '<em><b>Landing Gear</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Gear</em>' containment reference.
	 * @see #setLandingGear(LandingGearType)
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_LandingGear()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landingGear' namespace='##targetNamespace'"
	 * @generated
	 */
	LandingGearType getLandingGear();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getLandingGear <em>Landing Gear</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing Gear</em>' containment reference.
	 * @see #getLandingGear()
	 * @generated
	 */
	void setLandingGear(LandingGearType value);

	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference.
	 * @see #setSystems(SystemsType)
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_Systems()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='systems' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemsType getSystems();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getSystems <em>Systems</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systems</em>' containment reference.
	 * @see #getSystems()
	 * @generated
	 */
	void setSystems(SystemsType value);

	/**
	 * Returns the value of the '<em><b>Global</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' containment reference.
	 * @see #setGlobal(RotorcraftGlobalType)
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_Global()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='global' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorcraftGlobalType getGlobal();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getGlobal <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' containment reference.
	 * @see #getGlobal()
	 * @generated
	 */
	void setGlobal(RotorcraftGlobalType value);

	/**
	 * Returns the value of the '<em><b>Analyses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyses</em>' containment reference.
	 * @see #setAnalyses(RotorcraftAnalysesType)
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_Analyses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='analyses' namespace='##targetNamespace'"
	 * @generated
	 */
	RotorcraftAnalysesType getAnalyses();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getAnalyses <em>Analyses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analyses</em>' containment reference.
	 * @see #getAnalyses()
	 * @generated
	 */
	void setAnalyses(RotorcraftAnalysesType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getRotorcraftModelType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.RotorcraftModelType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // RotorcraftModelType
