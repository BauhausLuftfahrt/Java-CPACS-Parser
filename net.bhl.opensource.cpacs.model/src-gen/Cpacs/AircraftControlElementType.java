/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aircraft Control Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AircraftControlElementType#getControlDeviceUID <em>Control Device UID</em>}</li>
 *   <li>{@link Cpacs.AircraftControlElementType#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link Cpacs.AircraftControlElementType#getControlDistributorUID <em>Control Distributor UID</em>}</li>
 *   <li>{@link Cpacs.AircraftControlElementType#getCommandInput <em>Command Input</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAircraftControlElementType()
 * @model extendedMetaData="name='aircraftControlElementType' kind='elementOnly'"
 * @generated
 */
public interface AircraftControlElementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Device UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the uID of a control device, e.g. a control surface or a landing gear
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Device UID</em>' containment reference.
	 * @see #setControlDeviceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getAircraftControlElementType_ControlDeviceUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlDeviceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlDeviceUID();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftControlElementType#getControlDeviceUID <em>Control Device UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Device UID</em>' containment reference.
	 * @see #getControlDeviceUID()
	 * @generated
	 */
	void setControlDeviceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control parameter of the control device
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameter</em>' containment reference.
	 * @see #setControlParameter(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAircraftControlElementType_ControlParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getControlParameter();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftControlElementType#getControlParameter <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameter</em>' containment reference.
	 * @see #getControlParameter()
	 * @generated
	 */
	void setControlParameter(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Distributor UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a control distributor uID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Distributor UID</em>' containment reference.
	 * @see #setControlDistributorUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getAircraftControlElementType_ControlDistributorUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlDistributorUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlDistributorUID();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftControlElementType#getControlDistributorUID <em>Control Distributor UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Distributor UID</em>' containment reference.
	 * @see #getControlDistributorUID()
	 * @generated
	 */
	void setControlDistributorUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Command Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of the command parameter of a control distributor. If not given explicitly in the control distributor, linear interpolation between the neighboring points is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Input</em>' containment reference.
	 * @see #setCommandInput(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAircraftControlElementType_CommandInput()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='commandInput' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCommandInput();

	/**
	 * Sets the value of the '{@link Cpacs.AircraftControlElementType#getCommandInput <em>Command Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Input</em>' containment reference.
	 * @see #getCommandInput()
	 * @generated
	 */
	void setCommandInput(DoubleBaseType value);

} // AircraftControlElementType
