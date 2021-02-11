/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Airport Compatability Global Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AirportCompatabilityGlobalType#getWingSpan <em>Wing Span</em>}</li>
 *   <li>{@link Cpacs.AirportCompatabilityGlobalType#getWheelTrackWidth <em>Wheel Track Width</em>}</li>
 *   <li>{@link Cpacs.AirportCompatabilityGlobalType#getRunwayLoading <em>Runway Loading</em>}</li>
 *   <li>{@link Cpacs.AirportCompatabilityGlobalType#getTakeOffFieldLength <em>Take Off Field Length</em>}</li>
 *   <li>{@link Cpacs.AirportCompatabilityGlobalType#getLandingFieldLength <em>Landing Field Length</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAirportCompatabilityGlobalType()
 * @model extendedMetaData="name='airportCompatabilityGlobalType' kind='elementOnly'"
 * @generated
 */
public interface AirportCompatabilityGlobalType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Wing Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Span</em>' containment reference.
	 * @see #setWingSpan(RequirementType)
	 * @see Cpacs.CpacsPackage#getAirportCompatabilityGlobalType_WingSpan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wingSpan' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getWingSpan();

	/**
	 * Sets the value of the '{@link Cpacs.AirportCompatabilityGlobalType#getWingSpan <em>Wing Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Span</em>' containment reference.
	 * @see #getWingSpan()
	 * @generated
	 */
	void setWingSpan(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Wheel Track Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheel Track Width</em>' containment reference.
	 * @see #setWheelTrackWidth(RequirementType)
	 * @see Cpacs.CpacsPackage#getAirportCompatabilityGlobalType_WheelTrackWidth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wheelTrackWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getWheelTrackWidth();

	/**
	 * Sets the value of the '{@link Cpacs.AirportCompatabilityGlobalType#getWheelTrackWidth <em>Wheel Track Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wheel Track Width</em>' containment reference.
	 * @see #getWheelTrackWidth()
	 * @generated
	 */
	void setWheelTrackWidth(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Runway Loading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runway Loading</em>' containment reference.
	 * @see #setRunwayLoading(RequirementType)
	 * @see Cpacs.CpacsPackage#getAirportCompatabilityGlobalType_RunwayLoading()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='runwayLoading' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getRunwayLoading();

	/**
	 * Sets the value of the '{@link Cpacs.AirportCompatabilityGlobalType#getRunwayLoading <em>Runway Loading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runway Loading</em>' containment reference.
	 * @see #getRunwayLoading()
	 * @generated
	 */
	void setRunwayLoading(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Take Off Field Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Take Off Field Length</em>' containment reference.
	 * @see #setTakeOffFieldLength(RequirementType)
	 * @see Cpacs.CpacsPackage#getAirportCompatabilityGlobalType_TakeOffFieldLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='takeOffFieldLength' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getTakeOffFieldLength();

	/**
	 * Sets the value of the '{@link Cpacs.AirportCompatabilityGlobalType#getTakeOffFieldLength <em>Take Off Field Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Take Off Field Length</em>' containment reference.
	 * @see #getTakeOffFieldLength()
	 * @generated
	 */
	void setTakeOffFieldLength(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Landing Field Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Field Length</em>' containment reference.
	 * @see #setLandingFieldLength(RequirementType)
	 * @see Cpacs.CpacsPackage#getAirportCompatabilityGlobalType_LandingFieldLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landingFieldLength' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getLandingFieldLength();

	/**
	 * Sets the value of the '{@link Cpacs.AirportCompatabilityGlobalType#getLandingFieldLength <em>Landing Field Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing Field Length</em>' containment reference.
	 * @see #getLandingFieldLength()
	 * @generated
	 */
	void setLandingFieldLength(RequirementType value);

} // AirportCompatabilityGlobalType
