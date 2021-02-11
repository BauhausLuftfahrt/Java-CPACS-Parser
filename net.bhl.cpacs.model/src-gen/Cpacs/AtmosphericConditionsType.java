/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atmospheric Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AtmosphericConditionsType#getModel <em>Model</em>}</li>
 *   <li>{@link Cpacs.AtmosphericConditionsType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.AtmosphericConditionsType#getDeltaTemperature <em>Delta Temperature</em>}</li>
 *   <li>{@link Cpacs.AtmosphericConditionsType#getStaticPressure <em>Static Pressure</em>}</li>
 *   <li>{@link Cpacs.AtmosphericConditionsType#getDensity <em>Density</em>}</li>
 *   <li>{@link Cpacs.AtmosphericConditionsType#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link Cpacs.AtmosphericConditionsType#getSpeedOfSound <em>Speed Of Sound</em>}</li>
 *   <li>{@link Cpacs.AtmosphericConditionsType#getDynamicViscosity <em>Dynamic Viscosity</em>}</li>
 *   <li>{@link Cpacs.AtmosphericConditionsType#getKinematicViscosity <em>Kinematic Viscosity</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAtmosphericConditionsType()
 * @model extendedMetaData="name='atmosphericConditionsType' kind='elementOnly'"
 * @generated
 */
public interface AtmosphericConditionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Atmospheric model (e.g. ISA)(string)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(ModelType)
	 * @see Cpacs.CpacsPackage#getAtmosphericConditionsType_Model()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='model' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelType getModel();

	/**
	 * Sets the value of the '{@link Cpacs.AtmosphericConditionsType#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Altitude
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAtmosphericConditionsType_Altitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.AtmosphericConditionsType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offset from temperature of the atmospheric
	 *                                     model [K]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #setDeltaTemperature(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAtmosphericConditionsType_DeltaTemperature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaTemperature' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaTemperature();

	/**
	 * Sets the value of the '{@link Cpacs.AtmosphericConditionsType#getDeltaTemperature <em>Delta Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #getDeltaTemperature()
	 * @generated
	 */
	void setDeltaTemperature(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Static Pressure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Static pressure
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Pressure</em>' containment reference.
	 * @see #setStaticPressure(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAtmosphericConditionsType_StaticPressure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='staticPressure' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getStaticPressure();

	/**
	 * Sets the value of the '{@link Cpacs.AtmosphericConditionsType#getStaticPressure <em>Static Pressure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Pressure</em>' containment reference.
	 * @see #getStaticPressure()
	 * @generated
	 */
	void setStaticPressure(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Density</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Density
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Density</em>' containment reference.
	 * @see #setDensity(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAtmosphericConditionsType_Density()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='density' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDensity();

	/**
	 * Sets the value of the '{@link Cpacs.AtmosphericConditionsType#getDensity <em>Density</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Density</em>' containment reference.
	 * @see #getDensity()
	 * @generated
	 */
	void setDensity(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temperature
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temperature</em>' containment reference.
	 * @see #setTemperature(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAtmosphericConditionsType_Temperature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='temperature' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTemperature();

	/**
	 * Sets the value of the '{@link Cpacs.AtmosphericConditionsType#getTemperature <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' containment reference.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Speed Of Sound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speed of sound
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed Of Sound</em>' containment reference.
	 * @see #setSpeedOfSound(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAtmosphericConditionsType_SpeedOfSound()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='speedOfSound' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSpeedOfSound();

	/**
	 * Sets the value of the '{@link Cpacs.AtmosphericConditionsType#getSpeedOfSound <em>Speed Of Sound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Of Sound</em>' containment reference.
	 * @see #getSpeedOfSound()
	 * @generated
	 */
	void setSpeedOfSound(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Dynamic Viscosity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dynamic viscosity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Viscosity</em>' containment reference.
	 * @see #setDynamicViscosity(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAtmosphericConditionsType_DynamicViscosity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dynamicViscosity' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDynamicViscosity();

	/**
	 * Sets the value of the '{@link Cpacs.AtmosphericConditionsType#getDynamicViscosity <em>Dynamic Viscosity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Viscosity</em>' containment reference.
	 * @see #getDynamicViscosity()
	 * @generated
	 */
	void setDynamicViscosity(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Kinematic Viscosity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kinematic viscosity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kinematic Viscosity</em>' containment reference.
	 * @see #setKinematicViscosity(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAtmosphericConditionsType_KinematicViscosity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kinematicViscosity' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKinematicViscosity();

	/**
	 * Sets the value of the '{@link Cpacs.AtmosphericConditionsType#getKinematicViscosity <em>Kinematic Viscosity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinematic Viscosity</em>' containment reference.
	 * @see #getKinematicViscosity()
	 * @generated
	 */
	void setKinematicViscosity(DoubleBaseType value);

} // AtmosphericConditionsType
