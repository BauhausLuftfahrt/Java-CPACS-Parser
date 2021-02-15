/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Performance Takeoff Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPerformanceTakeoffType#getVMinLOF <em>VMin LOF</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceTakeoffType#getV2Min <em>V2 Min</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPerformanceTakeoffType()
 * @model extendedMetaData="name='flightPerformanceTakeoffType' kind='elementOnly'"
 * @generated
 */
public interface FlightPerformanceTakeoffType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>VMin LOF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main element containing the results for
	 *                                 take-off calculations optimized for min-imum liftoff speed
	 *                                 VLOFmin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VMin LOF</em>' containment reference.
	 * @see #setVMinLOF(TakeoffPerformanceParametersType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceTakeoffType_VMinLOF()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vMinLOF' namespace='##targetNamespace'"
	 * @generated
	 */
	TakeoffPerformanceParametersType getVMinLOF();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceTakeoffType#getVMinLOF <em>VMin LOF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VMin LOF</em>' containment reference.
	 * @see #getVMinLOF()
	 * @generated
	 */
	void setVMinLOF(TakeoffPerformanceParametersType value);

	/**
	 * Returns the value of the '<em><b>V2 Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main element containing the results for
	 *                                 take-off calculations optimized for min-imum safety speed V2min.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>V2 Min</em>' containment reference.
	 * @see #setV2Min(TakeoffPerformanceParametersType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceTakeoffType_V2Min()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='v2Min' namespace='##targetNamespace'"
	 * @generated
	 */
	TakeoffPerformanceParametersType getV2Min();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceTakeoffType#getV2Min <em>V2 Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V2 Min</em>' containment reference.
	 * @see #getV2Min()
	 * @generated
	 */
	void setV2Min(TakeoffPerformanceParametersType value);

} // FlightPerformanceTakeoffType
