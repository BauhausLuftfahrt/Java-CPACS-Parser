/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trajectory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrajectoryType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.TrajectoryType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.TrajectoryType#getMissionUID <em>Mission UID</em>}</li>
 *   <li>{@link Cpacs.TrajectoryType#getGlobal <em>Global</em>}</li>
 *   <li>{@link Cpacs.TrajectoryType#getFlightPoints <em>Flight Points</em>}</li>
 *   <li>{@link Cpacs.TrajectoryType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrajectoryType()
 * @model extendedMetaData="name='trajectoryType' kind='elementOnly'"
 * @generated
 */
public interface TrajectoryType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getTrajectoryType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Mission UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission UID</em>' containment reference.
	 * @see #setMissionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getTrajectoryType_MissionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='missionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getMissionUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryType#getMissionUID <em>Mission UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission UID</em>' containment reference.
	 * @see #getMissionUID()
	 * @generated
	 */
	void setMissionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Global</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' containment reference.
	 * @see #setGlobal(TrajectoryGlobalType)
	 * @see Cpacs.CpacsPackage#getTrajectoryType_Global()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='global' namespace='##targetNamespace'"
	 * @generated
	 */
	TrajectoryGlobalType getGlobal();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryType#getGlobal <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' containment reference.
	 * @see #getGlobal()
	 * @generated
	 */
	void setGlobal(TrajectoryGlobalType value);

	/**
	 * Returns the value of the '<em><b>Flight Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Points</em>' containment reference.
	 * @see #setFlightPoints(FlightPointType)
	 * @see Cpacs.CpacsPackage#getTrajectoryType_FlightPoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightPoints' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPointType getFlightPoints();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryType#getFlightPoints <em>Flight Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Points</em>' containment reference.
	 * @see #getFlightPoints()
	 * @generated
	 */
	void setFlightPoints(FlightPointType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getTrajectoryType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrajectoryType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // TrajectoryType
