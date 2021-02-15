/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Dynamics Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightDynamicsAnalysisType#getFlightCases <em>Flight Cases</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsAnalysisType#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightDynamicsAnalysisType()
 * @model extendedMetaData="name='flightDynamicsAnalysisType' kind='elementOnly'"
 * @generated
 */
public interface FlightDynamicsAnalysisType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Flight Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Cases</em>' containment reference.
	 * @see #setFlightCases(FlightDynamicsFlightCasesType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsAnalysisType_FlightCases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightCases' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightDynamicsFlightCasesType getFlightCases();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsAnalysisType#getFlightCases <em>Flight Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Cases</em>' containment reference.
	 * @see #getFlightCases()
	 * @generated
	 */
	void setFlightCases(FlightDynamicsFlightCasesType value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(FlightDynamicsModelType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsAnalysisType_Model()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='model' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightDynamicsModelType getModel();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsAnalysisType#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(FlightDynamicsModelType value);

} // FlightDynamicsAnalysisType
