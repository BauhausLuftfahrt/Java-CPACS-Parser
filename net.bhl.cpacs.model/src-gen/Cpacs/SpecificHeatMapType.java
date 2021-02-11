/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Heat Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SpecificHeatMapType#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link Cpacs.SpecificHeatMapType#getSpecificHeat <em>Specific Heat</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSpecificHeatMapType()
 * @model extendedMetaData="name='specificHeatMapType' kind='elementOnly'"
 * @generated
 */
public interface SpecificHeatMapType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Temperature in [K]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temperature</em>' containment reference.
	 * @see #setTemperature(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getSpecificHeatMapType_Temperature()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='temperature' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getTemperature();

	/**
	 * Sets the value of the '{@link Cpacs.SpecificHeatMapType#getTemperature <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' containment reference.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Specific Heat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific heat capacity of the material in [J/(kg*K)]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Heat</em>' containment reference.
	 * @see #setSpecificHeat(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getSpecificHeatMapType_SpecificHeat()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='specificHeat' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getSpecificHeat();

	/**
	 * Sets the value of the '{@link Cpacs.SpecificHeatMapType#getSpecificHeat <em>Specific Heat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Heat</em>' containment reference.
	 * @see #getSpecificHeat()
	 * @generated
	 */
	void setSpecificHeat(StringVectorBaseType value);

} // SpecificHeatMapType
