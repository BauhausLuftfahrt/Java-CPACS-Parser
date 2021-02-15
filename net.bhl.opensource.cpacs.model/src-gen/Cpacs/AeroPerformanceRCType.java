/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Performance RC Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroPerformanceRCType#getGlobalAeroPerformance <em>Global Aero Performance</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceRCType#getFuselagesAeroPerformance <em>Fuselages Aero Performance</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceRCType#getWingsAeroPerformance <em>Wings Aero Performance</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceRCType#getControlSurfacesAeroPerformance <em>Control Surfaces Aero Performance</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceRCType#getAirfoilsAeroPerformance <em>Airfoils Aero Performance</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroPerformanceRCType()
 * @model extendedMetaData="name='aeroPerformanceRCType' kind='elementOnly'"
 * @generated
 */
public interface AeroPerformanceRCType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Global Aero Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aerodynamic performance map of the full
	 *                                 configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Global Aero Performance</em>' containment reference.
	 * @see #setGlobalAeroPerformance(GlobalAeroPerformanceType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceRCType_GlobalAeroPerformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='globalAeroPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	GlobalAeroPerformanceType getGlobalAeroPerformance();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceRCType#getGlobalAeroPerformance <em>Global Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Aero Performance</em>' containment reference.
	 * @see #getGlobalAeroPerformance()
	 * @generated
	 */
	void setGlobalAeroPerformance(GlobalAeroPerformanceType value);

	/**
	 * Returns the value of the '<em><b>Fuselages Aero Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aerodynamic performance maps of isolated
	 *                                 fuselages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuselages Aero Performance</em>' containment reference.
	 * @see #setFuselagesAeroPerformance(FuselagesAeroPerformanceType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceRCType_FuselagesAeroPerformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuselagesAeroPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	FuselagesAeroPerformanceType getFuselagesAeroPerformance();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceRCType#getFuselagesAeroPerformance <em>Fuselages Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselages Aero Performance</em>' containment reference.
	 * @see #getFuselagesAeroPerformance()
	 * @generated
	 */
	void setFuselagesAeroPerformance(FuselagesAeroPerformanceType value);

	/**
	 * Returns the value of the '<em><b>Wings Aero Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aerodynamic performance maps of isolated wings
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wings Aero Performance</em>' containment reference.
	 * @see #setWingsAeroPerformance(WingsAeroPerformanceType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceRCType_WingsAeroPerformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wingsAeroPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	WingsAeroPerformanceType getWingsAeroPerformance();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceRCType#getWingsAeroPerformance <em>Wings Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wings Aero Performance</em>' containment reference.
	 * @see #getWingsAeroPerformance()
	 * @generated
	 */
	void setWingsAeroPerformance(WingsAeroPerformanceType value);

	/**
	 * Returns the value of the '<em><b>Control Surfaces Aero Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aerodynamic performance maps of control
	 *                                 surfaces
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Surfaces Aero Performance</em>' containment reference.
	 * @see #setControlSurfacesAeroPerformance(ControlSurfacePerformanceMapsOldType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceRCType_ControlSurfacesAeroPerformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlSurfacesAeroPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfacePerformanceMapsOldType getControlSurfacesAeroPerformance();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceRCType#getControlSurfacesAeroPerformance <em>Control Surfaces Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surfaces Aero Performance</em>' containment reference.
	 * @see #getControlSurfacesAeroPerformance()
	 * @generated
	 */
	void setControlSurfacesAeroPerformance(ControlSurfacePerformanceMapsOldType value);

	/**
	 * Returns the value of the '<em><b>Airfoils Aero Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aerodynamic performance maps of isolated
	 *                                 airfoils
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Airfoils Aero Performance</em>' containment reference.
	 * @see #setAirfoilsAeroPerformance(AirfoilsAeroPerformanceType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceRCType_AirfoilsAeroPerformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airfoilsAeroPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	AirfoilsAeroPerformanceType getAirfoilsAeroPerformance();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceRCType#getAirfoilsAeroPerformance <em>Airfoils Aero Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airfoils Aero Performance</em>' containment reference.
	 * @see #getAirfoilsAeroPerformance()
	 * @generated
	 */
	void setAirfoilsAeroPerformance(AirfoilsAeroPerformanceType value);

} // AeroPerformanceRCType
