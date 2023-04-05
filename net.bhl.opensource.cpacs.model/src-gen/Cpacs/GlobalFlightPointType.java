/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Flight Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GlobalFlightPointType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.GlobalFlightPointType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.GlobalFlightPointType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.GlobalFlightPointType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.GlobalFlightPointType#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}</li>
 *   <li>{@link Cpacs.GlobalFlightPointType#getTrueAirSpeed <em>True Air Speed</em>}</li>
 *   <li>{@link Cpacs.GlobalFlightPointType#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link Cpacs.GlobalFlightPointType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGlobalFlightPointType()
 * @model extendedMetaData="name='globalFlightPointType' kind='elementOnly'"
 * @generated
 */
public interface GlobalFlightPointType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getGlobalFlightPointType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalFlightPointType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getGlobalFlightPointType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalFlightPointType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGlobalFlightPointType_Altitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalFlightPointType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Mach number
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGlobalFlightPointType_MachNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalFlightPointType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Calibrated Air Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Calibrated air speed
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calibrated Air Speed</em>' containment reference.
	 * @see #setCalibratedAirSpeed(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGlobalFlightPointType_CalibratedAirSpeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='calibratedAirSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCalibratedAirSpeed();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalFlightPointType#getCalibratedAirSpeed <em>Calibrated Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calibrated Air Speed</em>' containment reference.
	 * @see #getCalibratedAirSpeed()
	 * @generated
	 */
	void setCalibratedAirSpeed(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>True Air Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     True air speed
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>True Air Speed</em>' containment reference.
	 * @see #setTrueAirSpeed(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getGlobalFlightPointType_TrueAirSpeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trueAirSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTrueAirSpeed();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalFlightPointType#getTrueAirSpeed <em>True Air Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Air Speed</em>' containment reference.
	 * @see #getTrueAirSpeed()
	 * @generated
	 */
	void setTrueAirSpeed(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(EnvironmentType)
	 * @see Cpacs.CpacsPackage#getGlobalFlightPointType_Environment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='environment' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvironmentType getEnvironment();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalFlightPointType#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(EnvironmentType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getGlobalFlightPointType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.GlobalFlightPointType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // GlobalFlightPointType
