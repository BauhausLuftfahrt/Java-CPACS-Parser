/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightPathType#getWayPoints <em>Way Points</em>}</li>
 *   <li>{@link Cpacs.FlightPathType#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link Cpacs.FlightPathType#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link Cpacs.FlightPathType#getWayPointType <em>Way Point Type</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightPathType()
 * @model extendedMetaData="name='flightPathType' kind='elementOnly'"
 * @generated
 */
public interface FlightPathType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Way Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector of waypoint codes. If waypoint codes are not available put empty items into the waypoint string
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Way Points</em>' containment reference.
	 * @see #setWayPoints(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPathType_WayPoints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wayPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getWayPoints();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPathType#getWayPoints <em>Way Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Way Points</em>' containment reference.
	 * @see #getWayPoints()
	 * @generated
	 */
	void setWayPoints(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector of waypoint latitude values in [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude</em>' containment reference.
	 * @see #setLatitude(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPathType_Latitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='latitude' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getLatitude();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPathType#getLatitude <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' containment reference.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector of waypoint longitude values in [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude</em>' containment reference.
	 * @see #setLongitude(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightPathType_Longitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='longitude' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getLongitude();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPathType#getLongitude <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' containment reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Way Point Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the type of the way point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Way Point Type</em>' containment reference.
	 * @see #setWayPointType(WayPointTypeType)
	 * @see Cpacs.CpacsPackage#getFlightPathType_WayPointType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='wayPointType' namespace='##targetNamespace'"
	 * @generated
	 */
	WayPointTypeType getWayPointType();

	/**
	 * Sets the value of the '{@link Cpacs.FlightPathType#getWayPointType <em>Way Point Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Way Point Type</em>' containment reference.
	 * @see #getWayPointType()
	 * @generated
	 */
	void setWayPointType(WayPointTypeType value);

} // FlightPathType
