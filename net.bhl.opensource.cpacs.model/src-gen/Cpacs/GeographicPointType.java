/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geographic Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GeographicPointType#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link Cpacs.GeographicPointType#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link Cpacs.GeographicPointType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.GeographicPointType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGeographicPointType()
 * @model extendedMetaData="name='geographicPointType' kind='elementOnly'"
 * @generated
 */
public interface GeographicPointType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Longitude coordinate 0-360
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Longitude</em>' containment reference.
	 * @see #setLongitude(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGeographicPointType_Longitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='longitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLongitude();

	/**
	 * Sets the value of the '{@link Cpacs.GeographicPointType#getLongitude <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' containment reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Latitude coordinate 0-360
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latitude</em>' containment reference.
	 * @see #setLatitude(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGeographicPointType_Latitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='latitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLatitude();

	/**
	 * Sets the value of the '{@link Cpacs.GeographicPointType#getLatitude <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' containment reference.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Altitude in meters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGeographicPointType_Altitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.GeographicPointType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getGeographicPointType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.GeographicPointType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // GeographicPointType
