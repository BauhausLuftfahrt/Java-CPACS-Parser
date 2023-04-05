/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Requirements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PerformanceRequirementsType#getFlightPerformanceRequirements <em>Flight Performance Requirements</em>}</li>
 *   <li>{@link Cpacs.PerformanceRequirementsType#getControllabilityRequirements <em>Controllability Requirements</em>}</li>
 *   <li>{@link Cpacs.PerformanceRequirementsType#getTrimRequirements <em>Trim Requirements</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPerformanceRequirementsType()
 * @model extendedMetaData="name='performanceRequirementsType' kind='elementOnly'"
 * @generated
 */
public interface PerformanceRequirementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Flight Performance Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Performance Requirements</em>' containment reference.
	 * @see #setFlightPerformanceRequirements(FlightPerformanceRequirementsType)
	 * @see Cpacs.CpacsPackage#getPerformanceRequirementsType_FlightPerformanceRequirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightPerformanceRequirements' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPerformanceRequirementsType getFlightPerformanceRequirements();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceRequirementsType#getFlightPerformanceRequirements <em>Flight Performance Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Performance Requirements</em>' containment reference.
	 * @see #getFlightPerformanceRequirements()
	 * @generated
	 */
	void setFlightPerformanceRequirements(FlightPerformanceRequirementsType value);

	/**
	 * Returns the value of the '<em><b>Controllability Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllability Requirements</em>' containment reference.
	 * @see #setControllabilityRequirements(ControllabilityReqsType)
	 * @see Cpacs.CpacsPackage#getPerformanceRequirementsType_ControllabilityRequirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controllabilityRequirements' namespace='##targetNamespace'"
	 * @generated
	 */
	ControllabilityReqsType getControllabilityRequirements();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceRequirementsType#getControllabilityRequirements <em>Controllability Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controllability Requirements</em>' containment reference.
	 * @see #getControllabilityRequirements()
	 * @generated
	 */
	void setControllabilityRequirements(ControllabilityReqsType value);

	/**
	 * Returns the value of the '<em><b>Trim Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim Requirements</em>' containment reference.
	 * @see #setTrimRequirements(TrimRequirementsType)
	 * @see Cpacs.CpacsPackage#getPerformanceRequirementsType_TrimRequirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trimRequirements' namespace='##targetNamespace'"
	 * @generated
	 */
	TrimRequirementsType getTrimRequirements();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceRequirementsType#getTrimRequirements <em>Trim Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trim Requirements</em>' containment reference.
	 * @see #getTrimRequirements()
	 * @generated
	 */
	void setTrimRequirements(TrimRequirementsType value);

} // PerformanceRequirementsType
