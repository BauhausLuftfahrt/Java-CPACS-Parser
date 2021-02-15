/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Start Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionStartConditionType#getRunwayUID <em>Runway UID</em>}</li>
 *   <li>{@link Cpacs.MissionStartConditionType#getCAS <em>CAS</em>}</li>
 *   <li>{@link Cpacs.MissionStartConditionType#getMach <em>Mach</em>}</li>
 *   <li>{@link Cpacs.MissionStartConditionType#getPositionXYZ <em>Position XYZ</em>}</li>
 *   <li>{@link Cpacs.MissionStartConditionType#getPositionGeo <em>Position Geo</em>}</li>
 *   <li>{@link Cpacs.MissionStartConditionType#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionStartConditionType()
 * @model extendedMetaData="name='missionStartConditionType' kind='elementOnly'"
 * @generated
 */
public interface MissionStartConditionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Runway UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the runway at which the mission starts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runway UID</em>' containment reference.
	 * @see #setRunwayUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_RunwayUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='runwayUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRunwayUID();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getRunwayUID <em>Runway UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runway UID</em>' containment reference.
	 * @see #getRunwayUID()
	 * @generated
	 */
	void setRunwayUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>CAS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Calibrated airspeed at the start of the mission
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CAS</em>' containment reference.
	 * @see #setCAS(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_CAS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CAS' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCAS();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getCAS <em>CAS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CAS</em>' containment reference.
	 * @see #getCAS()
	 * @generated
	 */
	void setCAS(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Mach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mach number at the start of the mission
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach</em>' containment reference.
	 * @see #setMach(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_Mach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mach' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMach();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getMach <em>Mach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach</em>' containment reference.
	 * @see #getMach()
	 * @generated
	 */
	void setMach(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Position XYZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Global coordinate at the start of the mission in xyz coordinates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position XYZ</em>' containment reference.
	 * @see #setPositionXYZ(PointType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_PositionXYZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionXYZ' namespace='##targetNamespace'"
	 * @generated
	 */
	PointType getPositionXYZ();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getPositionXYZ <em>Position XYZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position XYZ</em>' containment reference.
	 * @see #getPositionXYZ()
	 * @generated
	 */
	void setPositionXYZ(PointType value);

	/**
	 * Returns the value of the '<em><b>Position Geo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Global coordinate at the start of the mission in geographic coordinates (longitude, latitude, altitude)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Geo</em>' containment reference.
	 * @see #setPositionGeo(GeographicPointType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_PositionGeo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positionGeo' namespace='##targetNamespace'"
	 * @generated
	 */
	GeographicPointType getPositionGeo();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getPositionGeo <em>Position Geo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Geo</em>' containment reference.
	 * @see #getPositionGeo()
	 * @generated
	 */
	void setPositionGeo(GeographicPointType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Orientation if the aircraft at the start of the mission
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(OrientationType)
	 * @see Cpacs.CpacsPackage#getMissionStartConditionType_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartConditionType#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

} // MissionStartConditionType
