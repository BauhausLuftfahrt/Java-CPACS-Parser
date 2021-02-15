/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airfoil Aero Performance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AirfoilAeroPerformanceType#getAirfoilUID <em>Airfoil UID</em>}</li>
 *   <li>{@link Cpacs.AirfoilAeroPerformanceType#getReference <em>Reference</em>}</li>
 *   <li>{@link Cpacs.AirfoilAeroPerformanceType#getAeroPerformanceMaps <em>Aero Performance Maps</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAirfoilAeroPerformanceType()
 * @model extendedMetaData="name='airfoilAeroPerformanceType' kind='elementOnly'"
 * @generated
 */
public interface AirfoilAeroPerformanceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Airfoil UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the uID of the analysed airfoil
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Airfoil UID</em>' containment reference.
	 * @see #setAirfoilUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getAirfoilAeroPerformanceType_AirfoilUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='airfoilUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getAirfoilUID();

	/**
	 * Sets the value of the '{@link Cpacs.AirfoilAeroPerformanceType#getAirfoilUID <em>Airfoil UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airfoil UID</em>' containment reference.
	 * @see #getAirfoilUID()
	 * @generated
	 */
	void setAirfoilUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References used for the calculation of the
	 *                                 force and moment coefficients of the airfoil (in the airfoil
	 *                                 axis system!)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceType)
	 * @see Cpacs.CpacsPackage#getAirfoilAeroPerformanceType_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getReference();

	/**
	 * Sets the value of the '{@link Cpacs.AirfoilAeroPerformanceType#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Aero Performance Maps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calculated aerodynamic performance maps of the
	 *                                 airfoil
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aero Performance Maps</em>' containment reference.
	 * @see #setAeroPerformanceMaps(AeroPerformanceMapsRCType)
	 * @see Cpacs.CpacsPackage#getAirfoilAeroPerformanceType_AeroPerformanceMaps()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aeroPerformanceMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroPerformanceMapsRCType getAeroPerformanceMaps();

	/**
	 * Sets the value of the '{@link Cpacs.AirfoilAeroPerformanceType#getAeroPerformanceMaps <em>Aero Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Performance Maps</em>' containment reference.
	 * @see #getAeroPerformanceMaps()
	 * @generated
	 */
	void setAeroPerformanceMaps(AeroPerformanceMapsRCType value);

} // AirfoilAeroPerformanceType
