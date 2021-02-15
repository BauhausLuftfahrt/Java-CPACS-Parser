/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Aero Performance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GlobalAeroPerformanceType#getReference <em>Reference</em>}</li>
 *   <li>{@link Cpacs.GlobalAeroPerformanceType#getAeroPerformanceMaps <em>Aero Performance Maps</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGlobalAeroPerformanceType()
 * @model extendedMetaData="name='globalAeroPerformanceType' kind='elementOnly'"
 * @generated
 */
public interface GlobalAeroPerformanceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References used for the calculation of the
	 *                                 force and moment coefficients
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(ReferenceType)
	 * @see Cpacs.CpacsPackage#getGlobalAeroPerformanceType_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getReference();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalAeroPerformanceType#getReference <em>Reference</em>}' containment reference.
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
	 *                                 full configuration
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aero Performance Maps</em>' containment reference.
	 * @see #setAeroPerformanceMaps(AeroPerformanceMapsRCType)
	 * @see Cpacs.CpacsPackage#getGlobalAeroPerformanceType_AeroPerformanceMaps()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='aeroPerformanceMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroPerformanceMapsRCType getAeroPerformanceMaps();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalAeroPerformanceType#getAeroPerformanceMaps <em>Aero Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Performance Maps</em>' containment reference.
	 * @see #getAeroPerformanceMaps()
	 * @generated
	 */
	void setAeroPerformanceMaps(AeroPerformanceMapsRCType value);

} // GlobalAeroPerformanceType
