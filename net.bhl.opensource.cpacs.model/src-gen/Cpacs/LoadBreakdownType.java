/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Breakdown Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadBreakdownType#getInertialLoads <em>Inertial Loads</em>}</li>
 *   <li>{@link Cpacs.LoadBreakdownType#getAeroLoads <em>Aero Loads</em>}</li>
 *   <li>{@link Cpacs.LoadBreakdownType#getPropulsionLoads <em>Propulsion Loads</em>}</li>
 *   <li>{@link Cpacs.LoadBreakdownType#getLandingGearLoads <em>Landing Gear Loads</em>}</li>
 *   <li>{@link Cpacs.LoadBreakdownType#getRemainingLoads <em>Remaining Loads</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadBreakdownType()
 * @model extendedMetaData="name='loadBreakdownType' kind='elementOnly'"
 * @generated
 */
public interface LoadBreakdownType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Inertial Loads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inertial Loads</em>' containment reference.
	 * @see #setInertialLoads(SubLoadType)
	 * @see Cpacs.CpacsPackage#getLoadBreakdownType_InertialLoads()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inertialLoads' namespace='##targetNamespace'"
	 * @generated
	 */
	SubLoadType getInertialLoads();

	/**
	 * Sets the value of the '{@link Cpacs.LoadBreakdownType#getInertialLoads <em>Inertial Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inertial Loads</em>' containment reference.
	 * @see #getInertialLoads()
	 * @generated
	 */
	void setInertialLoads(SubLoadType value);

	/**
	 * Returns the value of the '<em><b>Aero Loads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aero Loads</em>' containment reference.
	 * @see #setAeroLoads(SubLoadType)
	 * @see Cpacs.CpacsPackage#getLoadBreakdownType_AeroLoads()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aeroLoads' namespace='##targetNamespace'"
	 * @generated
	 */
	SubLoadType getAeroLoads();

	/**
	 * Sets the value of the '{@link Cpacs.LoadBreakdownType#getAeroLoads <em>Aero Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Loads</em>' containment reference.
	 * @see #getAeroLoads()
	 * @generated
	 */
	void setAeroLoads(SubLoadType value);

	/**
	 * Returns the value of the '<em><b>Propulsion Loads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propulsion Loads</em>' containment reference.
	 * @see #setPropulsionLoads(SubLoadType)
	 * @see Cpacs.CpacsPackage#getLoadBreakdownType_PropulsionLoads()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propulsionLoads' namespace='##targetNamespace'"
	 * @generated
	 */
	SubLoadType getPropulsionLoads();

	/**
	 * Sets the value of the '{@link Cpacs.LoadBreakdownType#getPropulsionLoads <em>Propulsion Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propulsion Loads</em>' containment reference.
	 * @see #getPropulsionLoads()
	 * @generated
	 */
	void setPropulsionLoads(SubLoadType value);

	/**
	 * Returns the value of the '<em><b>Landing Gear Loads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Gear Loads</em>' containment reference.
	 * @see #setLandingGearLoads(SubLoadType)
	 * @see Cpacs.CpacsPackage#getLoadBreakdownType_LandingGearLoads()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landingGearLoads' namespace='##targetNamespace'"
	 * @generated
	 */
	SubLoadType getLandingGearLoads();

	/**
	 * Sets the value of the '{@link Cpacs.LoadBreakdownType#getLandingGearLoads <em>Landing Gear Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing Gear Loads</em>' containment reference.
	 * @see #getLandingGearLoads()
	 * @generated
	 */
	void setLandingGearLoads(SubLoadType value);

	/**
	 * Returns the value of the '<em><b>Remaining Loads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Loads</em>' containment reference.
	 * @see #setRemainingLoads(SubLoadType)
	 * @see Cpacs.CpacsPackage#getLoadBreakdownType_RemainingLoads()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='remainingLoads' namespace='##targetNamespace'"
	 * @generated
	 */
	SubLoadType getRemainingLoads();

	/**
	 * Sets the value of the '{@link Cpacs.LoadBreakdownType#getRemainingLoads <em>Remaining Loads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Loads</em>' containment reference.
	 * @see #getRemainingLoads()
	 * @generated
	 */
	void setRemainingLoads(SubLoadType value);

} // LoadBreakdownType
