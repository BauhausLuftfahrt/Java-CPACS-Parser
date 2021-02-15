/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Targets Global Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PerformanceTargetsGlobalType#getCruiseMach <em>Cruise Mach</em>}</li>
 *   <li>{@link Cpacs.PerformanceTargetsGlobalType#getMaximumOperatingVelocity <em>Maximum Operating Velocity</em>}</li>
 *   <li>{@link Cpacs.PerformanceTargetsGlobalType#getMaximumOperatingMach <em>Maximum Operating Mach</em>}</li>
 *   <li>{@link Cpacs.PerformanceTargetsGlobalType#getInitialCruiseAltitude <em>Initial Cruise Altitude</em>}</li>
 *   <li>{@link Cpacs.PerformanceTargetsGlobalType#getTimeToClimb <em>Time To Climb</em>}</li>
 *   <li>{@link Cpacs.PerformanceTargetsGlobalType#getMaxOperatingAltitude <em>Max Operating Altitude</em>}</li>
 *   <li>{@link Cpacs.PerformanceTargetsGlobalType#getApproachSpeed <em>Approach Speed</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPerformanceTargetsGlobalType()
 * @model extendedMetaData="name='performanceTargetsGlobalType' kind='elementOnly'"
 * @generated
 */
public interface PerformanceTargetsGlobalType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cruise Mach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cruise Mach</em>' containment reference.
	 * @see #setCruiseMach(RequirementType)
	 * @see Cpacs.CpacsPackage#getPerformanceTargetsGlobalType_CruiseMach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cruiseMach' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getCruiseMach();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceTargetsGlobalType#getCruiseMach <em>Cruise Mach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cruise Mach</em>' containment reference.
	 * @see #getCruiseMach()
	 * @generated
	 */
	void setCruiseMach(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Maximum Operating Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Operating Velocity</em>' containment reference.
	 * @see #setMaximumOperatingVelocity(RequirementType)
	 * @see Cpacs.CpacsPackage#getPerformanceTargetsGlobalType_MaximumOperatingVelocity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maximumOperatingVelocity' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getMaximumOperatingVelocity();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceTargetsGlobalType#getMaximumOperatingVelocity <em>Maximum Operating Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Operating Velocity</em>' containment reference.
	 * @see #getMaximumOperatingVelocity()
	 * @generated
	 */
	void setMaximumOperatingVelocity(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Maximum Operating Mach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Operating Mach</em>' containment reference.
	 * @see #setMaximumOperatingMach(RequirementType)
	 * @see Cpacs.CpacsPackage#getPerformanceTargetsGlobalType_MaximumOperatingMach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maximumOperatingMach' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getMaximumOperatingMach();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceTargetsGlobalType#getMaximumOperatingMach <em>Maximum Operating Mach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Operating Mach</em>' containment reference.
	 * @see #getMaximumOperatingMach()
	 * @generated
	 */
	void setMaximumOperatingMach(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Initial Cruise Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Cruise Altitude</em>' containment reference.
	 * @see #setInitialCruiseAltitude(RequirementType)
	 * @see Cpacs.CpacsPackage#getPerformanceTargetsGlobalType_InitialCruiseAltitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initialCruiseAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getInitialCruiseAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceTargetsGlobalType#getInitialCruiseAltitude <em>Initial Cruise Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Cruise Altitude</em>' containment reference.
	 * @see #getInitialCruiseAltitude()
	 * @generated
	 */
	void setInitialCruiseAltitude(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Time To Climb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Climb</em>' containment reference.
	 * @see #setTimeToClimb(RequirementType)
	 * @see Cpacs.CpacsPackage#getPerformanceTargetsGlobalType_TimeToClimb()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeToClimb' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getTimeToClimb();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceTargetsGlobalType#getTimeToClimb <em>Time To Climb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Climb</em>' containment reference.
	 * @see #getTimeToClimb()
	 * @generated
	 */
	void setTimeToClimb(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Max Operating Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Operating Altitude</em>' containment reference.
	 * @see #setMaxOperatingAltitude(RequirementType)
	 * @see Cpacs.CpacsPackage#getPerformanceTargetsGlobalType_MaxOperatingAltitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxOperatingAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getMaxOperatingAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceTargetsGlobalType#getMaxOperatingAltitude <em>Max Operating Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Operating Altitude</em>' containment reference.
	 * @see #getMaxOperatingAltitude()
	 * @generated
	 */
	void setMaxOperatingAltitude(RequirementType value);

	/**
	 * Returns the value of the '<em><b>Approach Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approach Speed</em>' containment reference.
	 * @see #setApproachSpeed(RequirementType)
	 * @see Cpacs.CpacsPackage#getPerformanceTargetsGlobalType_ApproachSpeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='approachSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementType getApproachSpeed();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceTargetsGlobalType#getApproachSpeed <em>Approach Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approach Speed</em>' containment reference.
	 * @see #getApproachSpeed()
	 * @generated
	 */
	void setApproachSpeed(RequirementType value);

} // PerformanceTargetsGlobalType
