/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crew Cost Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CrewCostType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CrewCostType#getCockpitCrew <em>Cockpit Crew</em>}</li>
 *   <li>{@link Cpacs.CrewCostType#getFlightAttendants <em>Flight Attendants</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCrewCostType()
 * @model extendedMetaData="name='crewCostType' kind='elementOnly'"
 * @generated
 */
public interface CrewCostType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCrewCostType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CrewCostType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Cockpit Crew</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cockpit Crew</em>' containment reference.
	 * @see #setCockpitCrew(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCrewCostType_CockpitCrew()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cockpitCrew' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCockpitCrew();

	/**
	 * Sets the value of the '{@link Cpacs.CrewCostType#getCockpitCrew <em>Cockpit Crew</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cockpit Crew</em>' containment reference.
	 * @see #getCockpitCrew()
	 * @generated
	 */
	void setCockpitCrew(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Flight Attendants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Attendants</em>' containment reference.
	 * @see #setFlightAttendants(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCrewCostType_FlightAttendants()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='flightAttendants' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getFlightAttendants();

	/**
	 * Sets the value of the '{@link Cpacs.CrewCostType#getFlightAttendants <em>Flight Attendants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Attendants</em>' containment reference.
	 * @see #getFlightAttendants()
	 * @generated
	 */
	void setFlightAttendants(GenericCostType value);

} // CrewCostType
