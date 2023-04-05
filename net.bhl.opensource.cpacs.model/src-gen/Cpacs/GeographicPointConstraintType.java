/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geographic Point Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GeographicPointConstraintType#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link Cpacs.GeographicPointConstraintType#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link Cpacs.GeographicPointConstraintType#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGeographicPointConstraintType()
 * @model extendedMetaData="name='geographicPointConstraintType' kind='elementOnly'"
 * @generated
 */
public interface GeographicPointConstraintType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' containment reference.
	 * @see #setLongitude(LongitudeType)
	 * @see Cpacs.CpacsPackage#getGeographicPointConstraintType_Longitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='longitude' namespace='##targetNamespace'"
	 * @generated
	 */
	LongitudeType getLongitude();

	/**
	 * Sets the value of the '{@link Cpacs.GeographicPointConstraintType#getLongitude <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' containment reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(LongitudeType value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' containment reference.
	 * @see #setLatitude(LatitudeType)
	 * @see Cpacs.CpacsPackage#getGeographicPointConstraintType_Latitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='latitude' namespace='##targetNamespace'"
	 * @generated
	 */
	LatitudeType getLatitude();

	/**
	 * Sets the value of the '{@link Cpacs.GeographicPointConstraintType#getLatitude <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' containment reference.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(LatitudeType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(AltitudeType)
	 * @see Cpacs.CpacsPackage#getGeographicPointConstraintType_Altitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	AltitudeType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.GeographicPointConstraintType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(AltitudeType value);

} // GeographicPointConstraintType
