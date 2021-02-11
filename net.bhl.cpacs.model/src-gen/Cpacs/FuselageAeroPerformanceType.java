/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Aero Performance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageAeroPerformanceType#getFuselageUID <em>Fuselage UID</em>}</li>
 *   <li>{@link Cpacs.FuselageAeroPerformanceType#getReference <em>Reference</em>}</li>
 *   <li>{@link Cpacs.FuselageAeroPerformanceType#getAeroPerformanceMaps <em>Aero Performance Maps</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageAeroPerformanceType()
 * @model extendedMetaData="name='fuselageAeroPerformanceType' kind='elementOnly'"
 * @generated
 */
public interface FuselageAeroPerformanceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuselage UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the uID of the analysed fuselage
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuselage UID</em>' containment reference.
	 * @see #setFuselageUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getFuselageAeroPerformanceType_FuselageUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuselageUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFuselageUID();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageAeroPerformanceType#getFuselageUID <em>Fuselage UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselage UID</em>' containment reference.
	 * @see #getFuselageUID()
	 * @generated
	 */
	void setFuselageUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References used for the calculation of the
	 *                                 force and moment coefficients of the fuselage (in the fuselage
	 *                                 axis system!)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceType)
	 * @see Cpacs.CpacsPackage#getFuselageAeroPerformanceType_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getReference();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageAeroPerformanceType#getReference <em>Reference</em>}' containment reference.
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
	 *                                 fuselage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aero Performance Maps</em>' containment reference.
	 * @see #setAeroPerformanceMaps(AeroPerformanceMapsRCType)
	 * @see Cpacs.CpacsPackage#getFuselageAeroPerformanceType_AeroPerformanceMaps()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aeroPerformanceMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroPerformanceMapsRCType getAeroPerformanceMaps();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageAeroPerformanceType#getAeroPerformanceMaps <em>Aero Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Performance Maps</em>' containment reference.
	 * @see #getAeroPerformanceMaps()
	 * @generated
	 */
	void setAeroPerformanceMaps(AeroPerformanceMapsRCType value);

} // FuselageAeroPerformanceType
