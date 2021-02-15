/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightSystemsType#getHingeMomentMap <em>Hinge Moment Map</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightSystemsType()
 * @model extendedMetaData="name='flightSystemsType' kind='elementOnly'"
 * @generated
 */
public interface FlightSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Hinge Moment Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hinge Moment Map</em>' containment reference.
	 * @see #setHingeMomentMap(HingeMomentsMapType)
	 * @see Cpacs.CpacsPackage#getFlightSystemsType_HingeMomentMap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hingeMomentMap' namespace='##targetNamespace'"
	 * @generated
	 */
	HingeMomentsMapType getHingeMomentMap();

	/**
	 * Sets the value of the '{@link Cpacs.FlightSystemsType#getHingeMomentMap <em>Hinge Moment Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinge Moment Map</em>' containment reference.
	 * @see #getHingeMomentMap()
	 * @generated
	 */
	void setHingeMomentMap(HingeMomentsMapType value);

} // FlightSystemsType
