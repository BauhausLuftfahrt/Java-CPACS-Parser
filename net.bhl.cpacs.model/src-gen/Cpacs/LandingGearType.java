/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearType#getNoseGears <em>Nose Gears</em>}</li>
 *   <li>{@link Cpacs.LandingGearType#getMainGears <em>Main Gears</em>}</li>
 *   <li>{@link Cpacs.LandingGearType#getSkidGears <em>Skid Gears</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearType()
 * @model extendedMetaData="name='landingGearType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Nose Gears</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nose Gears</em>' containment reference.
	 * @see #setNoseGears(NoseGearsType)
	 * @see Cpacs.CpacsPackage#getLandingGearType_NoseGears()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noseGears' namespace='##targetNamespace'"
	 * @generated
	 */
	NoseGearsType getNoseGears();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearType#getNoseGears <em>Nose Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nose Gears</em>' containment reference.
	 * @see #getNoseGears()
	 * @generated
	 */
	void setNoseGears(NoseGearsType value);

	/**
	 * Returns the value of the '<em><b>Main Gears</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Gears</em>' containment reference.
	 * @see #setMainGears(MainGearsType)
	 * @see Cpacs.CpacsPackage#getLandingGearType_MainGears()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mainGears' namespace='##targetNamespace'"
	 * @generated
	 */
	MainGearsType getMainGears();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearType#getMainGears <em>Main Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Gears</em>' containment reference.
	 * @see #getMainGears()
	 * @generated
	 */
	void setMainGears(MainGearsType value);

	/**
	 * Returns the value of the '<em><b>Skid Gears</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skid Gears</em>' containment reference.
	 * @see #setSkidGears(SkidGearsType)
	 * @see Cpacs.CpacsPackage#getLandingGearType_SkidGears()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='skidGears' namespace='##targetNamespace'"
	 * @generated
	 */
	SkidGearsType getSkidGears();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearType#getSkidGears <em>Skid Gears</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skid Gears</em>' containment reference.
	 * @see #getSkidGears()
	 * @generated
	 */
	void setSkidGears(SkidGearsType value);

} // LandingGearType
