/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Performance Level Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPerformanceLevelType#getSpecificExcessPower <em>Specific Excess Power</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPerformanceLevelType()
 * @model extendedMetaData="name='flightPerformanceLevelType' kind='elementOnly'"
 * @generated
 */
public interface FlightPerformanceLevelType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Specific Excess Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific excess power
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Excess Power</em>' containment reference.
	 * @see #setSpecificExcessPower(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceLevelType_SpecificExcessPower()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='specificExcessPower' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSpecificExcessPower();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceLevelType#getSpecificExcessPower <em>Specific Excess Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Excess Power</em>' containment reference.
	 * @see #getSpecificExcessPower()
	 * @generated
	 */
	void setSpecificExcessPower(DoubleBaseType value);

} // FlightPerformanceLevelType
