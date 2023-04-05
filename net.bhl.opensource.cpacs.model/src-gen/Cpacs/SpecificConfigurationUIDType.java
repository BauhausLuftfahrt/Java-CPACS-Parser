/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Configuration UID Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SpecificConfigurationUIDType#getConfigurationUID <em>Configuration UID</em>}</li>
 *   <li>{@link Cpacs.SpecificConfigurationUIDType#getSegments <em>Segments</em>}</li>
 *   <li>{@link Cpacs.SpecificConfigurationUIDType#getPointPerformanceUIDs <em>Point Performance UI Ds</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSpecificConfigurationUIDType()
 * @model extendedMetaData="name='specificConfigurationUIDType' kind='elementOnly'"
 * @generated
 */
public interface SpecificConfigurationUIDType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Configuration UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Configuration uID
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Configuration UID</em>' containment reference.
	 * @see #setConfigurationUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getSpecificConfigurationUIDType_ConfigurationUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='configurationUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getConfigurationUID();

	/**
	 * Sets the value of the '{@link Cpacs.SpecificConfigurationUIDType#getConfigurationUID <em>Configuration UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration UID</em>' containment reference.
	 * @see #getConfigurationUID()
	 * @generated
	 */
	void setConfigurationUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference.
	 * @see #setSegments(SpecificConfigurationSegmentsType)
	 * @see Cpacs.CpacsPackage#getSpecificConfigurationUIDType_Segments()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='segments' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificConfigurationSegmentsType getSegments();

	/**
	 * Sets the value of the '{@link Cpacs.SpecificConfigurationUIDType#getSegments <em>Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segments</em>' containment reference.
	 * @see #getSegments()
	 * @generated
	 */
	void setSegments(SpecificConfigurationSegmentsType value);

	/**
	 * Returns the value of the '<em><b>Point Performance UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 List of pointPerformanceUIDs
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Performance UI Ds</em>' containment reference.
	 * @see #setPointPerformanceUIDs(UIDSequenceType)
	 * @see Cpacs.CpacsPackage#getSpecificConfigurationUIDType_PointPerformanceUIDs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pointPerformanceUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	UIDSequenceType getPointPerformanceUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.SpecificConfigurationUIDType#getPointPerformanceUIDs <em>Point Performance UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Performance UI Ds</em>' containment reference.
	 * @see #getPointPerformanceUIDs()
	 * @generated
	 */
	void setPointPerformanceUIDs(UIDSequenceType value);

} // SpecificConfigurationUIDType
