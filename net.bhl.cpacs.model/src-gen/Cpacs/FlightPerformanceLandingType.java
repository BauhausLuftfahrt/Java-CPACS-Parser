/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Performance Landing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPerformanceLandingType#getLdgDistance <em>Ldg Distance</em>}</li>
 *   <li>{@link Cpacs.FlightPerformanceLandingType#getGrdPhaseDist <em>Grd Phase Dist</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPerformanceLandingType()
 * @model extendedMetaData="name='flightPerformanceLandingType' kind='elementOnly'"
 * @generated
 */
public interface FlightPerformanceLandingType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Ldg Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determined landing distance.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ldg Distance</em>' containment reference.
	 * @see #setLdgDistance(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceLandingType_LdgDistance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ldgDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLdgDistance();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceLandingType#getLdgDistance <em>Ldg Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ldg Distance</em>' containment reference.
	 * @see #getLdgDistance()
	 * @generated
	 */
	void setLdgDistance(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Grd Phase Dist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determined ground phase distance.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Grd Phase Dist</em>' containment reference.
	 * @see #setGrdPhaseDist(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPerformanceLandingType_GrdPhaseDist()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='grdPhaseDist' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGrdPhaseDist();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPerformanceLandingType#getGrdPhaseDist <em>Grd Phase Dist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grd Phase Dist</em>' containment reference.
	 * @see #getGrdPhaseDist()
	 * @generated
	 */
	void setGrdPhaseDist(DoubleBaseType value);

} // FlightPerformanceLandingType
