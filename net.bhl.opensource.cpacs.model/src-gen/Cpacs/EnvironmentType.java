/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EnvironmentType#getAtmosphericModel <em>Atmospheric Model</em>}</li>
 *   <li>{@link Cpacs.EnvironmentType#getDeltaTemperature <em>Delta Temperature</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEnvironmentType()
 * @model extendedMetaData="name='environmentType' kind='elementOnly'"
 * @generated
 */
public interface EnvironmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Atmospheric Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atmospheric Model</em>' containment reference.
	 * @see #setAtmosphericModel(AtmosphericModelType1)
	 * @see Cpacs.CpacsPackage#getEnvironmentType_AtmosphericModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='atmosphericModel' namespace='##targetNamespace'"
	 * @generated
	 */
	AtmosphericModelType1 getAtmosphericModel();

	/**
	 * Sets the value of the '{@link Cpacs.EnvironmentType#getAtmosphericModel <em>Atmospheric Model</em>}' containment reference.
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
	 *                                 Delta temperature with respect to the standard temperature of the selected atmosphere [K]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #setDeltaTemperature(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEnvironmentType_DeltaTemperature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaTemperature' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaTemperature();

	/**
	 * Sets the value of the '{@link Cpacs.EnvironmentType#getDeltaTemperature <em>Delta Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #getDeltaTemperature()
	 * @generated
	 */
	void setDeltaTemperature(DoubleBaseType value);

} // EnvironmentType
