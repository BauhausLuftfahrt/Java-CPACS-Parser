/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case State Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseStateType#getAtmosphericConditions <em>Atmospheric Conditions</em>}</li>
 *   <li>{@link Cpacs.LoadCaseStateType#getTrimParameters <em>Trim Parameters</em>}</li>
 *   <li>{@link Cpacs.LoadCaseStateType#getWind <em>Wind</em>}</li>
 *   <li>{@link Cpacs.LoadCaseStateType#getAttitudeAndMotion <em>Attitude And Motion</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseStateType()
 * @model extendedMetaData="name='loadCaseStateType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseStateType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Atmospheric Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atmospheric Conditions</em>' containment reference.
	 * @see #setAtmosphericConditions(AtmosphericConditionsType)
	 * @see Cpacs.CpacsPackage#getLoadCaseStateType_AtmosphericConditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='atmosphericConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	AtmosphericConditionsType getAtmosphericConditions();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseStateType#getAtmosphericConditions <em>Atmospheric Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atmospheric Conditions</em>' containment reference.
	 * @see #getAtmosphericConditions()
	 * @generated
	 */
	void setAtmosphericConditions(AtmosphericConditionsType value);

	/**
	 * Returns the value of the '<em><b>Trim Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim Parameters</em>' containment reference.
	 * @see #setTrimParameters(TrimParametersType)
	 * @see Cpacs.CpacsPackage#getLoadCaseStateType_TrimParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trimParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	TrimParametersType getTrimParameters();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseStateType#getTrimParameters <em>Trim Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trim Parameters</em>' containment reference.
	 * @see #getTrimParameters()
	 * @generated
	 */
	void setTrimParameters(TrimParametersType value);

	/**
	 * Returns the value of the '<em><b>Wind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wind
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wind</em>' containment reference.
	 * @see #setWind(PointXYZType)
	 * @see Cpacs.CpacsPackage#getLoadCaseStateType_Wind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wind' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getWind();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseStateType#getWind <em>Wind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wind</em>' containment reference.
	 * @see #getWind()
	 * @generated
	 */
	void setWind(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Attitude And Motion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attitude And Motion</em>' containment reference.
	 * @see #setAttitudeAndMotion(AttitudeAndMotionType)
	 * @see Cpacs.CpacsPackage#getLoadCaseStateType_AttitudeAndMotion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attitudeAndMotion' namespace='##targetNamespace'"
	 * @generated
	 */
	AttitudeAndMotionType getAttitudeAndMotion();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseStateType#getAttitudeAndMotion <em>Attitude And Motion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude And Motion</em>' containment reference.
	 * @see #getAttitudeAndMotion()
	 * @generated
	 */
	void setAttitudeAndMotion(AttitudeAndMotionType value);

} // LoadCaseStateType
