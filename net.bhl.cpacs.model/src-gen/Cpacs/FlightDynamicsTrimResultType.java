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
 *   <li>{@link Cpacs.FlightDynamicsTrimResultType#getMach <em>Mach</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsTrimResultType#getVTAS <em>VTAS</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsTrimResultType#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsTrimResultType#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightDynamicsTrimResultType()
 * @model extendedMetaData="name='flightDynamicsTrimResultType' kind='elementOnly'"
 * @generated
 */
public interface FlightDynamicsTrimResultType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mach</em>' containment reference.
	 * @see #setMach(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsTrimResultType_Mach()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mach' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMach();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsTrimResultType#getMach <em>Mach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach</em>' containment reference.
	 * @see #getMach()
	 * @generated
	 */
	void setMach(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>VTAS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VTAS</em>' containment reference.
	 * @see #setVTAS(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsTrimResultType_VTAS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vTAS' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getVTAS();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsTrimResultType#getVTAS <em>VTAS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VTAS</em>' containment reference.
	 * @see #getVTAS()
	 * @generated
	 */
	void setVTAS(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' containment reference.
	 * @see #setAlpha(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsTrimResultType_Alpha()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='alpha' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAlpha();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsTrimResultType#getAlpha <em>Alpha</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' containment reference.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
