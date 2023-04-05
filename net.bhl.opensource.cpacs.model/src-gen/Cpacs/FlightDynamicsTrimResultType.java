/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Dynamics Trim Result Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightDynamicsTrimResultType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsTrimResultType#getTrueAirSpeed <em>True Air Speed</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsTrimResultType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsTrimResultType#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightDynamicsTrimResultType()
 * @model extendedMetaData="name='flightDynamicsTrimResultType' kind='elementOnly'"
 * @generated
 */
public interface FlightDynamicsTrimResultType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Mach number
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsTrimResultType_MachNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsTrimResultType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>True Air Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 True airspeed
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>True Air Speed</em>' containment reference.
	 * @see #setTrueAirSpeed(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsTrimResultType_TrueAirSpeed()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='trueAirSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTrueAirSpeed();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsTrimResultType#getTrueAirSpeed <em>True Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Air Speed</em>' containment reference.
	 * @see #getTrueAirSpeed()
	 * @generated
	 */
	void setTrueAirSpeed(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Attack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Angle of attack
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsTrimResultType_AngleOfAttack()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsTrimResultType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Altitude
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsTrimResultType_Altitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsTrimResultType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(DoubleBaseType value);

} // FlightDynamicsTrimResultType
