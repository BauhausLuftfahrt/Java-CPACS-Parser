/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Performance Case Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPerformanceCaseType#getTakeoff <em>Takeoff</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceCaseType#getLanding <em>Landing</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceCaseType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType()
 * @model extendedMetaData="name='flightPerformanceCaseType' kind='elementOnly'"
 * @generated
 */
public interface FlightPerformanceCaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Takeoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main element containing the results of the
	 *                                 take-off analysis cases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Takeoff</em>' containment reference.
	 * @see #setTakeoff(FlightPerformanceTakeoffType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType_Takeoff()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='takeoff' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPerformanceTakeoffType getTakeoff();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceCaseType#getTakeoff <em>Takeoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Takeoff</em>' containment reference.
	 * @see #getTakeoff()
	 * @generated
	 */
	void setTakeoff(FlightPerformanceTakeoffType value);

	/**
	 * Returns the value of the '<em><b>Landing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Main element containing the results of the
	 *                                 landing analysis cases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Landing</em>' containment reference.
	 * @see #setLanding(FlightPerformanceLandingType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType_Landing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landing' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPerformanceLandingType getLanding();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceCaseType#getLanding <em>Landing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing</em>' containment reference.
	 * @see #getLanding()
	 * @generated
	 */
	void setLanding(FlightPerformanceLandingType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceCaseType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceCaseType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // FlightPerformanceCaseType
