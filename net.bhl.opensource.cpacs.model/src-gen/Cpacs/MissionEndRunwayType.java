/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission End Runway Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionEndRunwayType#getRunwayUID <em>Runway UID</em>}</li>
 *   <li>{@link Cpacs.MissionEndRunwayType#getRunwayEndPosition <em>Runway End Position</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionEndRunwayType()
 * @model extendedMetaData="name='missionEndRunwayType' kind='elementOnly'"
 * @generated
 */
public interface MissionEndRunwayType extends ComplexBaseType {
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
	 * @see Cpacs.CpacsPackage#getMissionEndRunwayType_RunwayUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='runwayUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRunwayUID();

	/**
	 * Sets the value of the '{@link Cpacs.MissionEndRunwayType#getRunwayUID <em>Runway UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runway UID</em>' containment reference.
	 * @see #getRunwayUID()
	 * @generated
	 */
	void setRunwayUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Runway End Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Offset from runway threshold in cartesian coordinates in the runway coordinate system
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Runway End Position</em>' containment reference.
	 * @see #setRunwayEndPosition(PointXYZType)
	 * @see Cpacs.CpacsPackage#getMissionEndRunwayType_RunwayEndPosition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='runwayEndPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getRunwayEndPosition();

	/**
	 * Sets the value of the '{@link Cpacs.MissionEndRunwayType#getRunwayEndPosition <em>Runway End Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runway End Position</em>' containment reference.
	 * @see #getRunwayEndPosition()
	 * @generated
	 */
	void setRunwayEndPosition(PointXYZType value);

} // MissionEndRunwayType
