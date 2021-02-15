/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Limits Increment Maps Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroLimitsIncrementMapsType#getControlDeviceUID <em>Control Device UID</em>}</li>
 *   <li>{@link Cpacs.AeroLimitsIncrementMapsType#getControlParameters <em>Control Parameters</em>}</li>
 *   <li>{@link Cpacs.AeroLimitsIncrementMapsType#getControlDistributorUID <em>Control Distributor UID</em>}</li>
 *   <li>{@link Cpacs.AeroLimitsIncrementMapsType#getCommandInputs <em>Command Inputs</em>}</li>
 *   <li>{@link Cpacs.AeroLimitsIncrementMapsType#getAeroPerformanceIncrementMapUID <em>Aero Performance Increment Map UID</em>}</li>
 *   <li>{@link Cpacs.AeroLimitsIncrementMapsType#getOperationLimitIncrements <em>Operation Limit Increments</em>}</li>
 *   <li>{@link Cpacs.AeroLimitsIncrementMapsType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroLimitsIncrementMapsType()
 * @model extendedMetaData="name='aeroLimitsIncrementMapsType' kind='elementOnly'"
 * @generated
 */
public interface AeroLimitsIncrementMapsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Device UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the uID of a control device, e.g. a control surface or a landing gear
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Device UID</em>' containment reference.
	 * @see #setControlDeviceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getAeroLimitsIncrementMapsType_ControlDeviceUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlDeviceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlDeviceUID();

	/**
	 * Sets the value of the '{@link Cpacs.AeroLimitsIncrementMapsType#getControlDeviceUID <em>Control Device UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Device UID</em>' containment reference.
	 * @see #getControlDeviceUID()
	 * @generated
	 */
	void setControlDeviceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Value of the command parameters of a control distributor. If not given explicitly in the control distributor, linear interpolation between the neighboring points is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameters</em>' containment reference.
	 * @see #setControlParameters(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroLimitsIncrementMapsType_ControlParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getControlParameters();

	/**
	 * Sets the value of the '{@link Cpacs.AeroLimitsIncrementMapsType#getControlParameters <em>Control Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameters</em>' containment reference.
	 * @see #getControlParameters()
	 * @generated
	 */
	void setControlParameters(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Distributor UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a control distributor uID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Distributor UID</em>' containment reference.
	 * @see #setControlDistributorUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getAeroLimitsIncrementMapsType_ControlDistributorUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlDistributorUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlDistributorUID();

	/**
	 * Sets the value of the '{@link Cpacs.AeroLimitsIncrementMapsType#getControlDistributorUID <em>Control Distributor UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Distributor UID</em>' containment reference.
	 * @see #getControlDistributorUID()
	 * @generated
	 */
	void setControlDistributorUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Command Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Command inputs of a control distributor given as vector. If not given explicitly in the control distributor, linear interpolation between the neighboring points is required.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Inputs</em>' containment reference.
	 * @see #setCommandInputs(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroLimitsIncrementMapsType_CommandInputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='commandInputs' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCommandInputs();

	/**
	 * Sets the value of the '{@link Cpacs.AeroLimitsIncrementMapsType#getCommandInputs <em>Command Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Inputs</em>' containment reference.
	 * @see #getCommandInputs()
	 * @generated
	 */
	void setCommandInputs(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Aero Performance Increment Map UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to an increment map of the aeroPerformanceMap
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aero Performance Increment Map UID</em>' containment reference.
	 * @see #setAeroPerformanceIncrementMapUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getAeroLimitsIncrementMapsType_AeroPerformanceIncrementMapUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='aeroPerformanceIncrementMapUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getAeroPerformanceIncrementMapUID();

	/**
	 * Sets the value of the '{@link Cpacs.AeroLimitsIncrementMapsType#getAeroPerformanceIncrementMapUID <em>Aero Performance Increment Map UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aero Performance Increment Map UID</em>' containment reference.
	 * @see #getAeroPerformanceIncrementMapUID()
	 * @generated
	 */
	void setAeroPerformanceIncrementMapUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Operation Limit Increments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increments of the vehicle operation limits
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Limit Increments</em>' containment reference.
	 * @see #setOperationLimitIncrements(OperationLimitIncrementsType)
	 * @see Cpacs.CpacsPackage#getAeroLimitsIncrementMapsType_OperationLimitIncrements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operationLimitIncrements' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationLimitIncrementsType getOperationLimitIncrements();

	/**
	 * Sets the value of the '{@link Cpacs.AeroLimitsIncrementMapsType#getOperationLimitIncrements <em>Operation Limit Increments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Limit Increments</em>' containment reference.
	 * @see #getOperationLimitIncrements()
	 * @generated
	 */
	void setOperationLimitIncrements(OperationLimitIncrementsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getAeroLimitsIncrementMapsType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.AeroLimitsIncrementMapsType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // AeroLimitsIncrementMapsType
