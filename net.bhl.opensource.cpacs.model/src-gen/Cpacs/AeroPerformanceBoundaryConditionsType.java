/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Performance Boundary Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroPerformanceBoundaryConditionsType#getAtmosphericModel <em>Atmospheric Model</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceBoundaryConditionsType#getDeltaTemperature <em>Delta Temperature</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceBoundaryConditionsType#getControlElements <em>Control Elements</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroPerformanceBoundaryConditionsType()
 * @model extendedMetaData="name='aeroPerformanceBoundaryConditionsType' kind='elementOnly'"
 * @generated
 */
public interface AeroPerformanceBoundaryConditionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Atmospheric Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Atmospheric Model. Available options: ISA. See documentation of  <CPACS> root element for further details.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Atmospheric Model</em>' containment reference.
	 * @see #setAtmosphericModel(AtmosphericModelType1)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceBoundaryConditionsType_AtmosphericModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='atmosphericModel' namespace='##targetNamespace'"
	 * @generated
	 */
	AtmosphericModelType1 getAtmosphericModel();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceBoundaryConditionsType#getAtmosphericModel <em>Atmospheric Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atmospheric Model</em>' containment reference.
	 * @see #getAtmosphericModel()
	 * @generated
	 */
	void setAtmosphericModel(AtmosphericModelType1 value);

	/**
	 * Returns the value of the '<em><b>Delta Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Offset from temperature of the
	 *                                 atmospheric model [K]. For more details
	 *                                 on atmospheric models, please refer to
	 *                                 documentation of the <CPACS> root
	 *                                 element.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #setDeltaTemperature(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceBoundaryConditionsType_DeltaTemperature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaTemperature' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaTemperature();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceBoundaryConditionsType#getDeltaTemperature <em>Delta Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #getDeltaTemperature()
	 * @generated
	 */
	void setDeltaTemperature(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Elements</em>' containment reference.
	 * @see #setControlElements(AeroPerformanceControlElementsType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceBoundaryConditionsType_ControlElements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlElements' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroPerformanceControlElementsType getControlElements();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceBoundaryConditionsType#getControlElements <em>Control Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Elements</em>' containment reference.
	 * @see #getControlElements()
	 * @generated
	 */
	void setControlElements(AeroPerformanceControlElementsType value);

} // AeroPerformanceBoundaryConditionsType
