/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Start Runway Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionStartRunwayType#getRunwayUID <em>Runway UID</em>}</li>
 *   <li>{@link Cpacs.MissionStartRunwayType#getRunwayStartPosition <em>Runway Start Position</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionStartRunwayType()
 * @model extendedMetaData="name='missionStartRunwayType' kind='elementOnly'"
 * @generated
 */
public interface MissionStartRunwayType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Runway UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 UID of the runway
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runway UID</em>' containment reference.
	 * @see #setRunwayUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMissionStartRunwayType_RunwayUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='runwayUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRunwayUID();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartRunwayType#getRunwayUID <em>Runway UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runway UID</em>' containment reference.
	 * @see #getRunwayUID()
	 * @generated
	 */
	void setRunwayUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Runway Start Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Offset from runway threshold in the runway coordinate system
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runway Start Position</em>' containment reference.
	 * @see #setRunwayStartPosition(RunwayStartPositionType)
	 * @see Cpacs.CpacsPackage#getMissionStartRunwayType_RunwayStartPosition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='runwayStartPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	RunwayStartPositionType getRunwayStartPosition();

	/**
	 * Sets the value of the '{@link Cpacs.MissionStartRunwayType#getRunwayStartPosition <em>Runway Start Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runway Start Position</em>' containment reference.
	 * @see #getRunwayStartPosition()
	 * @generated
	 */
	void setRunwayStartPosition(RunwayStartPositionType value);

} // MissionStartRunwayType
