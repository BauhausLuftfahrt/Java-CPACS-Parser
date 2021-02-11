/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Setting Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearSettingType#getLandingGearUID <em>Landing Gear UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearSettingType#getExtended <em>Extended</em>}</li>
 *   <li>{@link Cpacs.LandingGearSettingType#getControlParameter <em>Control Parameter</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearSettingType()
 * @model extendedMetaData="name='landingGearSettingType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearSettingType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Landing Gear UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a landing gear
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Landing Gear UID</em>' containment reference.
	 * @see #setLandingGearUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearSettingType_LandingGearUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='landingGearUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getLandingGearUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearSettingType#getLandingGearUID <em>Landing Gear UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing Gear UID</em>' containment reference.
	 * @see #getLandingGearUID()
	 * @generated
	 */
	void setLandingGearUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Extended</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extended (1=true, 2=false)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended</em>' containment reference.
	 * @see #setExtended(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearSettingType_Extended()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='extended' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getExtended();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearSettingType#getExtended <em>Extended</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended</em>' containment reference.
	 * @see #getExtended()
	 * @generated
	 */
	void setExtended(BooleanBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control parameter of the landing gear
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameter</em>' containment reference.
	 * @see #setControlParameter(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearSettingType_ControlParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getControlParameter();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearSettingType#getControlParameter <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameter</em>' containment reference.
	 * @see #getControlParameter()
	 * @generated
	 */
	void setControlParameter(DoubleBaseType value);

} // LandingGearSettingType
