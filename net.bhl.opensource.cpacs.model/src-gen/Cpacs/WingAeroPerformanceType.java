/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Aero Performance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingAeroPerformanceType#getWingUID <em>Wing UID</em>}</li>
 *   <li>{@link Cpacs.WingAeroPerformanceType#getReference <em>Reference</em>}</li>
 *   <li>{@link Cpacs.WingAeroPerformanceType#getAeroPerformanceMaps <em>Aero Performance Maps</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingAeroPerformanceType()
 * @model extendedMetaData="name='wingAeroPerformanceType' kind='elementOnly'"
 * @generated
 */
public interface WingAeroPerformanceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the uID of the analysed wing
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wing UID</em>' containment reference.
	 * @see #setWingUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getWingAeroPerformanceType_WingUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wingUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWingUID();

	/**
	 * Sets the value of the '{@link Cpacs.WingAeroPerformanceType#getWingUID <em>Wing UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing UID</em>' containment reference.
	 * @see #getWingUID()
	 * @generated
	 */
	void setWingUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References used for the calculation of the
	 *                                 force and moment coefficients of the wing (in the wing axis
	 *                                 system!)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceType)
	 * @see Cpacs.CpacsPackage#getWingAeroPerformanceType_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getReference();

	/**
	 * Sets the value of the '{@link Cpacs.WingAeroPerformanceType#getReference <em>Reference</em>}' containment reference.
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
	 *                                 wing
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aero Performance Maps</em>' containment reference.
	 * @see #setAeroPerformanceMaps(AeroPerformanceMapsRCType)
	 * @see Cpacs.CpacsPackage#getWingAeroPerformanceType_AeroPerformanceMaps()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aeroPerformanceMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroPerformanceMapsRCType getAeroPerformanceMaps();

	/**
	 * Sets the value of the '{@link Cpacs.WingAeroPerformanceType#getAeroPerformanceMaps <em>Aero Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Performance Maps</em>' containment reference.
	 * @see #getAeroPerformanceMaps()
	 * @generated
	 */
	void setAeroPerformanceMaps(AeroPerformanceMapsRCType value);

} // WingAeroPerformanceType
