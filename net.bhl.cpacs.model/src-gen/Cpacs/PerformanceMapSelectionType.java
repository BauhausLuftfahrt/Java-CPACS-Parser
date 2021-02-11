/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Map Selection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PerformanceMapSelectionType#getEngine <em>Engine</em>}</li>
 *   <li>{@link Cpacs.PerformanceMapSelectionType#getAerodynamic <em>Aerodynamic</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPerformanceMapSelectionType()
 * @model extendedMetaData="name='performanceMapSelectionType' kind='elementOnly'"
 * @generated
 */
public interface PerformanceMapSelectionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engine performance map selection
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engine</em>' containment reference.
	 * @see #setEngine(MissionPerformanceMapDefinitionType)
	 * @see Cpacs.CpacsPackage#getPerformanceMapSelectionType_Engine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='engine' namespace='##targetNamespace'"
	 * @generated
	 */
	MissionPerformanceMapDefinitionType getEngine();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceMapSelectionType#getEngine <em>Engine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' containment reference.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(MissionPerformanceMapDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Aerodynamic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aerodynamic performance map selection
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aerodynamic</em>' containment reference.
	 * @see #setAerodynamic(MissionPerformanceMapDefinitionType)
	 * @see Cpacs.CpacsPackage#getPerformanceMapSelectionType_Aerodynamic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aerodynamic' namespace='##targetNamespace'"
	 * @generated
	 */
	MissionPerformanceMapDefinitionType getAerodynamic();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceMapSelectionType#getAerodynamic <em>Aerodynamic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aerodynamic</em>' containment reference.
	 * @see #getAerodynamic()
	 * @generated
	 */
	void setAerodynamic(MissionPerformanceMapDefinitionType value);

} // PerformanceMapSelectionType
