/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flight Dynamics Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FlightDynamicsModelType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsModelType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsModelType#getXLonNames <em>XLon Names</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsModelType#getYLonNames <em>YLon Names</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsModelType#getULonNames <em>ULon Names</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsModelType#getXLatNames <em>XLat Names</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsModelType#getYLatNames <em>YLat Names</em>}</li>
 *   <li>{@link Cpacs.FlightDynamicsModelType#getULatNames <em>ULat Names</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFlightDynamicsModelType()
 * @model extendedMetaData="name='flightDynamicsModelType' kind='elementOnly'"
 * @generated
 */
public interface FlightDynamicsModelType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsModelType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsModelType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsModelType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsModelType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>XLon Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XLon Names</em>' containment reference.
	 * @see #setXLonNames(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsModelType_XLonNames()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xLonNames' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getXLonNames();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsModelType#getXLonNames <em>XLon Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XLon Names</em>' containment reference.
	 * @see #getXLonNames()
	 * @generated
	 */
	void setXLonNames(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>YLon Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YLon Names</em>' containment reference.
	 * @see #setYLonNames(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsModelType_YLonNames()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='yLonNames' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getYLonNames();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsModelType#getYLonNames <em>YLon Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YLon Names</em>' containment reference.
	 * @see #getYLonNames()
	 * @generated
	 */
	void setYLonNames(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>ULon Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ULon Names</em>' containment reference.
	 * @see #setULonNames(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsModelType_ULonNames()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uLonNames' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getULonNames();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsModelType#getULonNames <em>ULon Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ULon Names</em>' containment reference.
	 * @see #getULonNames()
	 * @generated
	 */
	void setULonNames(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>XLat Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XLat Names</em>' containment reference.
	 * @see #setXLatNames(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsModelType_XLatNames()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xLatNames' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getXLatNames();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsModelType#getXLatNames <em>XLat Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XLat Names</em>' containment reference.
	 * @see #getXLatNames()
	 * @generated
	 */
	void setXLatNames(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>YLat Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YLat Names</em>' containment reference.
	 * @see #setYLatNames(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsModelType_YLatNames()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='yLatNames' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getYLatNames();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsModelType#getYLatNames <em>YLat Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YLat Names</em>' containment reference.
	 * @see #getYLatNames()
	 * @generated
	 */
	void setYLatNames(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>ULat Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ULat Names</em>' containment reference.
	 * @see #setULatNames(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFlightDynamicsModelType_ULatNames()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='uLatNames' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getULatNames();

	/**
	 * Sets the value of the '{@link Cpacs.FlightDynamicsModelType#getULatNames <em>ULat Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ULat Names</em>' containment reference.
	 * @see #getULatNames()
	 * @generated
	 */
	void setULatNames(StringVectorBaseType value);

} // FlightDynamicsModelType
