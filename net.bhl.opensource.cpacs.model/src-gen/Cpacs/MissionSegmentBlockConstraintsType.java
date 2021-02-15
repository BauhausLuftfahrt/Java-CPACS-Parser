/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Segment Block Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MissionSegmentBlockConstraintsType#getEndCondition <em>End Condition</em>}</li>
 *   <li>{@link Cpacs.MissionSegmentBlockConstraintsType#getFlightPath <em>Flight Path</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMissionSegmentBlockConstraintsType()
 * @model extendedMetaData="name='missionSegmentBlockConstraintsType' kind='elementOnly'"
 * @generated
 */
public interface MissionSegmentBlockConstraintsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>End Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Condition</em>' containment reference.
	 * @see #setEndCondition(MissionSegmentEndConditionType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlockConstraintsType_EndCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	MissionSegmentEndConditionType getEndCondition();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentBlockConstraintsType#getEndCondition <em>End Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Condition</em>' containment reference.
	 * @see #getEndCondition()
	 * @generated
	 */
	void setEndCondition(MissionSegmentEndConditionType value);

	/**
	 * Returns the value of the '<em><b>Flight Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Path</em>' containment reference.
	 * @see #setFlightPath(FlightPathType)
	 * @see Cpacs.CpacsPackage#getMissionSegmentBlockConstraintsType_FlightPath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flightPath' namespace='##targetNamespace'"
	 * @generated
	 */
	FlightPathType getFlightPath();

	/**
	 * Sets the value of the '{@link Cpacs.MissionSegmentBlockConstraintsType#getFlightPath <em>Flight Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Path</em>' containment reference.
	 * @see #getFlightPath()
	 * @generated
	 */
	void setFlightPath(FlightPathType value);

} // MissionSegmentBlockConstraintsType
