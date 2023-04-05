/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Performance Turn Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPerformanceTurnType#getSustainableLoadFactor <em>Sustainable Load Factor</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceTurnType#getInstantaneousLoadFactor <em>Instantaneous Load Factor</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPerformanceTurnType()
 * @model extendedMetaData="name='flightPerformanceTurnType' kind='elementOnly'"
 * @generated
 */
public interface FlightPerformanceTurnType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sustainable Load Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sustainable Load Factor</em>' containment reference.
	 * @see #setSustainableLoadFactor(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceTurnType_SustainableLoadFactor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sustainableLoadFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSustainableLoadFactor();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceTurnType#getSustainableLoadFactor <em>Sustainable Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sustainable Load Factor</em>' containment reference.
	 * @see #getSustainableLoadFactor()
	 * @generated
	 */
	void setSustainableLoadFactor(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Instantaneous Load Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ...
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantaneous Load Factor</em>' containment reference.
	 * @see #setInstantaneousLoadFactor(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceTurnType_InstantaneousLoadFactor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='instantaneousLoadFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getInstantaneousLoadFactor();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceTurnType#getInstantaneousLoadFactor <em>Instantaneous Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantaneous Load Factor</em>' containment reference.
	 * @see #getInstantaneousLoadFactor()
	 * @generated
	 */
	void setInstantaneousLoadFactor(DoubleBaseType value);

} // FlightPerformanceTurnType
