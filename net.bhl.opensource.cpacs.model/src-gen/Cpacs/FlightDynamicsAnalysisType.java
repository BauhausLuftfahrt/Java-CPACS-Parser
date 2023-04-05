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
 *   <li>{@link Cpacs.FlightDynamicsAnalysisType#getTrim <em>Trim</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsAnalysisType#getFlyingQualities <em>Flying Qualities</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsAnalysisType#getFlightPerformance <em>Flight Performance</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightDynamicsAnalysisType()
 * @model extendedMetaData="name='flightDynamicsAnalysisType' kind='elementOnly'"
 * @generated
 */
public interface FlightDynamicsAnalysisType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Trim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim</em>' containment reference.
	 * @see #setTrim(TrimType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsAnalysisType_Trim()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trim' namespace='##targetNamespace'"
	 * @generated
	 */
	TrimType getTrim();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsAnalysisType#getTrim <em>Trim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trim</em>' containment reference.
	 * @see #getTrim()
	 * @generated
	 */
	void setTrim(TrimType value);

	/**
	 * Returns the value of the '<em><b>Flying Qualities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flying Qualities</em>' containment reference.
	 * @see #setFlyingQualities(FlyingQualitiesCasesType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsAnalysisType_FlyingQualities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flyingQualities' namespace='##targetNamespace'"
	 * @generated
	 */
	FlyingQualitiesCasesType getFlyingQualities();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsAnalysisType#getFlyingQualities <em>Flying Qualities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flying Qualities</em>' containment reference.
	 * @see #getFlyingQualities()
	 * @generated
	 */
	void setFlyingQualities(FlyingQualitiesCasesType value);

	/**
	 * Returns the value of the '<em><b>Flight Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Performance</em>' containment reference.
	 * @see #setFlightPerformance(FlightPerformanceCasesType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsAnalysisType_FlightPerformance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPerformanceCasesType getFlightPerformance();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsAnalysisType#getFlightPerformance <em>Flight Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Performance</em>' containment reference.
	 * @see #getFlightPerformance()
	 * @generated
	 */
	void setFlightPerformance(FlightPerformanceCasesType value);

} // FlightDynamicsAnalysisType
