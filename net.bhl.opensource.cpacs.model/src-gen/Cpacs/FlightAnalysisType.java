/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightAnalysisType#getTotalOperatingCost <em>Total Operating Cost</em>}</li>
 *   <li>{@link Cpacs.FlightAnalysisType#getRevenue <em>Revenue</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightAnalysisType()
 * @model extendedMetaData="name='flightAnalysisType' kind='elementOnly'"
 * @generated
 */
public interface FlightAnalysisType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Total Operating Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Operating Cost</em>' containment reference.
	 * @see #setTotalOperatingCost(TotalOperatingCostType)
	 * @see Cpacs.CpacsPackage#getFlightAnalysisType_TotalOperatingCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='totalOperatingCost' namespace='##targetNamespace'"
	 * @generated
	 */
	TotalOperatingCostType getTotalOperatingCost();

	/**
	 * Sets the value of the '{@link Cpacs.FlightAnalysisType#getTotalOperatingCost <em>Total Operating Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Operating Cost</em>' containment reference.
	 * @see #getTotalOperatingCost()
	 * @generated
	 */
	void setTotalOperatingCost(TotalOperatingCostType value);

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revenue</em>' containment reference.
	 * @see #setRevenue(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightAnalysisType_Revenue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='revenue' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRevenue();

	/**
	 * Sets the value of the '{@link Cpacs.FlightAnalysisType#getRevenue <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' containment reference.
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(DoubleBaseType value);

} // FlightAnalysisType
