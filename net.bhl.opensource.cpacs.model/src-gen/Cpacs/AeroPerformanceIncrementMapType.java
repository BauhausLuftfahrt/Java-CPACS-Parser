/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Performance Increment Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroPerformanceIncrementMapType#getControlDeviceUID <em>Control Device UID</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceIncrementMapType#getControlParameters <em>Control Parameters</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceIncrementMapType#getControlDistributorUID <em>Control Distributor UID</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceIncrementMapType#getCommandInputs <em>Command Inputs</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceIncrementMapType#getDcd <em>Dcd</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceIncrementMapType#getDcs <em>Dcs</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceIncrementMapType#getDcl <em>Dcl</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceIncrementMapType#getDcmd <em>Dcmd</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceIncrementMapType#getDcms <em>Dcms</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceIncrementMapType#getDcml <em>Dcml</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceIncrementMapType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapType()
 * @model extendedMetaData="name='aeroPerformanceIncrementMapType' kind='elementOnly'"
 * @generated
 */
public interface AeroPerformanceIncrementMapType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Device UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the uID of a control device, e.g. a control surface or a landing gear
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Device UID</em>' containment reference.
	 * @see #setControlDeviceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapType_ControlDeviceUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlDeviceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlDeviceUID();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceIncrementMapType#getControlDeviceUID <em>Control Device UID</em>}' containment reference.
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
	 * @see #setControlParameters(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapType_ControlParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getControlParameters();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceIncrementMapType#getControlParameters <em>Control Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameters</em>' containment reference.
	 * @see #getControlParameters()
	 * @generated
	 */
	void setControlParameters(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Distributor UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a control distributor uID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Distributor UID</em>' containment reference.
	 * @see #setControlDistributorUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapType_ControlDistributorUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlDistributorUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlDistributorUID();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceIncrementMapType#getControlDistributorUID <em>Control Distributor UID</em>}' containment reference.
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
	 * @see #setCommandInputs(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapType_CommandInputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='commandInputs' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getCommandInputs();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceIncrementMapType#getCommandInputs <em>Command Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Inputs</em>' containment reference.
	 * @see #getCommandInputs()
	 * @generated
	 */
	void setCommandInputs(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment of drag coefficient in aerodynamic coordinates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcd</em>' containment reference.
	 * @see #setDcd(DoubleArrayBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapType_Dcd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcd' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleArrayBaseType getDcd();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceIncrementMapType#getDcd <em>Dcd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcd</em>' containment reference.
	 * @see #getDcd()
	 * @generated
	 */
	void setDcd(DoubleArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment of coefficient of the side force vector in aerodynamic coordinates (perpendicular to lift and drag)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcs</em>' containment reference.
	 * @see #setDcs(DoubleArrayBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapType_Dcs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcs' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleArrayBaseType getDcs();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceIncrementMapType#getDcs <em>Dcs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcs</em>' containment reference.
	 * @see #getDcs()
	 * @generated
	 */
	void setDcs(DoubleArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment of lift coefficient in aerodynamic coordinates
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcl</em>' containment reference.
	 * @see #setDcl(DoubleArrayBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapType_Dcl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcl' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleArrayBaseType getDcl();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceIncrementMapType#getDcl <em>Dcl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcl</em>' containment reference.
	 * @see #getDcl()
	 * @generated
	 */
	void setDcl(DoubleArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment of cmd
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmd</em>' containment reference.
	 * @see #setDcmd(DoubleArrayBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapType_Dcmd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmd' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleArrayBaseType getDcmd();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceIncrementMapType#getDcmd <em>Dcmd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmd</em>' containment reference.
	 * @see #getDcmd()
	 * @generated
	 */
	void setDcmd(DoubleArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment of cms
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcms</em>' containment reference.
	 * @see #setDcms(DoubleArrayBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapType_Dcms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcms' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleArrayBaseType getDcms();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceIncrementMapType#getDcms <em>Dcms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcms</em>' containment reference.
	 * @see #getDcms()
	 * @generated
	 */
	void setDcms(DoubleArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment of cml
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcml</em>' containment reference.
	 * @see #setDcml(DoubleArrayBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapType_Dcml()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcml' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleArrayBaseType getDcml();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceIncrementMapType#getDcml <em>Dcml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcml</em>' containment reference.
	 * @see #getDcml()
	 * @generated
	 */
	void setDcml(DoubleArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceIncrementMapType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceIncrementMapType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // AeroPerformanceIncrementMapType
