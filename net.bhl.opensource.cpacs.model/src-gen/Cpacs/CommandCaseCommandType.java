/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Case Command Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CommandCaseCommandType#getControlDistributorUID <em>Control Distributor UID</em>}</li>
 *   <li>{@link Cpacs.CommandCaseCommandType#getControlFunctionUID <em>Control Function UID</em>}</li>
 *   <li>{@link Cpacs.CommandCaseCommandType#getGain <em>Gain</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCommandCaseCommandType()
 * @model extendedMetaData="name='commandCaseCommandType' kind='elementOnly'"
 * @generated
 */
public interface CommandCaseCommandType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Distributor UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Distributor UID</em>' containment reference.
	 * @see #setControlDistributorUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCommandCaseCommandType_ControlDistributorUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlDistributorUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlDistributorUID();

	/**
	 * Sets the value of the '{@link Cpacs.CommandCaseCommandType#getControlDistributorUID <em>Control Distributor UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Distributor UID</em>' containment reference.
	 * @see #getControlDistributorUID()
	 * @generated
	 */
	void setControlDistributorUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Function UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Function UID</em>' containment reference.
	 * @see #setControlFunctionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCommandCaseCommandType_ControlFunctionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlFunctionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlFunctionUID();

	/**
	 * Sets the value of the '{@link Cpacs.CommandCaseCommandType#getControlFunctionUID <em>Control Function UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Function UID</em>' containment reference.
	 * @see #getControlFunctionUID()
	 * @generated
	 */
	void setControlFunctionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Gain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gain</em>' containment reference.
	 * @see #setGain(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCommandCaseCommandType_Gain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gain' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGain();

	/**
	 * Sets the value of the '{@link Cpacs.CommandCaseCommandType#getGain <em>Gain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gain</em>' containment reference.
	 * @see #getGain()
	 * @generated
	 */
	void setGain(DoubleBaseType value);

} // CommandCaseCommandType
