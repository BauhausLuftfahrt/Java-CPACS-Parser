/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Settings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseSettingsType#getControlSurfaces <em>Control Surfaces</em>}</li>
 *   <li>{@link Cpacs.LoadCaseSettingsType#getControlInputs <em>Control Inputs</em>}</li>
 *   <li>{@link Cpacs.LoadCaseSettingsType#getLandingGears <em>Landing Gears</em>}</li>
 *   <li>{@link Cpacs.LoadCaseSettingsType#getEngines <em>Engines</em>}</li>
 *   <li>{@link Cpacs.LoadCaseSettingsType#getCabinPressure <em>Cabin Pressure</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseSettingsType()
 * @model extendedMetaData="name='loadCaseSettingsType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseSettingsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Surfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surfaces</em>' containment reference.
	 * @see #setControlSurfaces(ControlSurfaceDeflectionsType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSettingsType_ControlSurfaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlSurfaces' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceDeflectionsType getControlSurfaces();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSettingsType#getControlSurfaces <em>Control Surfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surfaces</em>' containment reference.
	 * @see #getControlSurfaces()
	 * @generated
	 */
	void setControlSurfaces(ControlSurfaceDeflectionsType value);

	/**
	 * Returns the value of the '<em><b>Control Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Inputs</em>' containment reference.
	 * @see #setControlInputs(ControlInputsType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSettingsType_ControlInputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlInputs' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlInputsType getControlInputs();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSettingsType#getControlInputs <em>Control Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Inputs</em>' containment reference.
	 * @see #getControlInputs()
	 * @generated
	 */
	void setControlInputs(ControlInputsType value);

	/**
	 * Returns the value of the '<em><b>Landing Gears</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Gears</em>' containment reference.
	 * @see #setLandingGears(LoadCaseLandingGearsType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSettingsType_LandingGears()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landingGears' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseLandingGearsType getLandingGears();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSettingsType#getLandingGears <em>Landing Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing Gears</em>' containment reference.
	 * @see #getLandingGears()
	 * @generated
	 */
	void setLandingGears(LoadCaseLandingGearsType value);

	/**
	 * Returns the value of the '<em><b>Engines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engines</em>' containment reference.
	 * @see #setEngines(LoadCaseEnginesType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSettingsType_Engines()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='engines' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseEnginesType getEngines();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSettingsType#getEngines <em>Engines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engines</em>' containment reference.
	 * @see #getEngines()
	 * @generated
	 */
	void setEngines(LoadCaseEnginesType value);

	/**
	 * Returns the value of the '<em><b>Cabin Pressure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cabin Pressure</em>' containment reference.
	 * @see #setCabinPressure(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseSettingsType_CabinPressure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cabinPressure' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCabinPressure();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseSettingsType#getCabinPressure <em>Cabin Pressure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cabin Pressure</em>' containment reference.
	 * @see #getCabinPressure()
	 * @generated
	 */
	void setCabinPressure(DoubleBaseType value);

} // LoadCaseSettingsType
