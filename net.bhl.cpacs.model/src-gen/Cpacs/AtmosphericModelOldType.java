/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atmospheric Model Old Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AtmosphericModelOldType#getAtmosphericModel <em>Atmospheric Model</em>}</li>
 *   <li>{@link Cpacs.AtmosphericModelOldType#getDeltaTemperature <em>Delta Temperature</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAtmosphericModelOldType()
 * @model extendedMetaData="name='atmosphericModelOldType' kind='elementOnly'"
 * @generated
 */
public interface AtmosphericModelOldType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Atmospheric Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Atmospheric model (e.g. ISA for ICAO Standard
	 *                                 atmosphere (ISA) from 1993).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Atmospheric Model</em>' containment reference.
	 * @see #setAtmosphericModel(AtmosphericModelType)
	 * @see Cpacs.CpacsPackage#getAtmosphericModelOldType_AtmosphericModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='atmosphericModel' namespace='##targetNamespace'"
	 * @generated
	 */
	AtmosphericModelType getAtmosphericModel();

	/**
	 * Sets the value of the '{@link Cpacs.AtmosphericModelOldType#getAtmosphericModel <em>Atmospheric Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atmospheric Model</em>' containment reference.
	 * @see #getAtmosphericModel()
	 * @generated
	 */
	void setAtmosphericModel(AtmosphericModelType value);

	/**
	 * Returns the value of the '<em><b>Delta Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Offset from temperature of the atmospheric model [K].
	 *                                 For more details on atmospheric models, please refer to documentation
	 *                                 of the <CPACS> root element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #setDeltaTemperature(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAtmosphericModelOldType_DeltaTemperature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deltaTemperature' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getDeltaTemperature();

	/**
	 * Sets the value of the '{@link Cpacs.AtmosphericModelOldType#getDeltaTemperature <em>Delta Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Temperature</em>' containment reference.
	 * @see #getDeltaTemperature()
	 * @generated
	 */
	void setDeltaTemperature(DoubleBaseType value);

} // AtmosphericModelOldType
