/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Setting Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EngineSettingType#getModelEngineUID <em>Model Engine UID</em>}</li>
 *   <li>{@link Cpacs.EngineSettingType#getThrustLevel <em>Thrust Level</em>}</li>
 *   <li>{@link Cpacs.EngineSettingType#getInoperative <em>Inoperative</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEngineSettingType()
 * @model extendedMetaData="name='engineSettingType' kind='elementOnly'"
 * @generated
 */
public interface EngineSettingType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Model Engine UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a engine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Engine UID</em>' containment reference.
	 * @see #setModelEngineUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getEngineSettingType_ModelEngineUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modelEngineUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getModelEngineUID();

	/**
	 * Sets the value of the '{@link Cpacs.EngineSettingType#getModelEngineUID <em>Model Engine UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Engine UID</em>' containment reference.
	 * @see #getModelEngineUID()
	 * @generated
	 */
	void setModelEngineUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Thrust Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engine thrust level
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thrust Level</em>' containment reference.
	 * @see #setThrustLevel(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getEngineSettingType_ThrustLevel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='thrustLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getThrustLevel();

	/**
	 * Sets the value of the '{@link Cpacs.EngineSettingType#getThrustLevel <em>Thrust Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrust Level</em>' containment reference.
	 * @see #getThrustLevel()
	 * @generated
	 */
	void setThrustLevel(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Inoperative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Engine inoperative (1 = true, 0 = false)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inoperative</em>' containment reference.
	 * @see #setInoperative(BooleanBaseType)
	 * @see Cpacs.CpacsPackage#getEngineSettingType_Inoperative()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='inoperative' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanBaseType getInoperative();

	/**
	 * Sets the value of the '{@link Cpacs.EngineSettingType#getInoperative <em>Inoperative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inoperative</em>' containment reference.
	 * @see #getInoperative()
	 * @generated
	 */
	void setInoperative(BooleanBaseType value);

} // EngineSettingType
