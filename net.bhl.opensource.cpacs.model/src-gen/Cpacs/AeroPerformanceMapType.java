/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Performance Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroPerformanceMapType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapType#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapType#getCd <em>Cd</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapType#getCs <em>Cs</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapType#getCl <em>Cl</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapType#getCmd <em>Cmd</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapType#getCms <em>Cms</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapType#getCml <em>Cml</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapType#getDampingDerivatives <em>Damping Derivatives</em>}</li>
 *   <li>{@link Cpacs.AeroPerformanceMapType#getIncrementMaps <em>Increment Maps</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType()
 * @model extendedMetaData="name='aeroPerformanceMapType' kind='elementOnly'"
 * @generated
 */
public interface AeroPerformanceMapType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Altitude [m]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType_Altitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Mach number
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType_MachNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Sideslip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Sideslip angle [deg]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #setAngleOfSideslip(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType_AngleOfSideslip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfSideslip' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAngleOfSideslip();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapType#getAngleOfSideslip <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #getAngleOfSideslip()
	 * @generated
	 */
	void setAngleOfSideslip(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Attack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Angle of attack [deg]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType_AngleOfAttack()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Cd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Drag coefficient in aerodynamic
	 *                                 coordinates
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cd</em>' containment reference.
	 * @see #setCd(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType_Cd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cd' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCd();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapType#getCd <em>Cd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cd</em>' containment reference.
	 * @see #getCd()
	 * @generated
	 */
	void setCd(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Cs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Coefficient of the side force vector in
	 *                                 aerodynamic coordinates (perpendicular
	 *                                 to lift and drag)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cs</em>' containment reference.
	 * @see #setCs(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType_Cs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cs' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCs();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapType#getCs <em>Cs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs</em>' containment reference.
	 * @see #getCs()
	 * @generated
	 */
	void setCs(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Cl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Lift coefficient in aerodynamic
	 *                                 coordinates
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cl</em>' containment reference.
	 * @see #setCl(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType_Cl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cl' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCl();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapType#getCl <em>Cl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cl</em>' containment reference.
	 * @see #getCl()
	 * @generated
	 */
	void setCl(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' containment reference.
	 * @see #setCmd(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType_Cmd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmd' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCmd();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapType#getCmd <em>Cmd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd</em>' containment reference.
	 * @see #getCmd()
	 * @generated
	 */
	void setCmd(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Cms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cms</em>' containment reference.
	 * @see #setCms(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType_Cms()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cms' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCms();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapType#getCms <em>Cms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cms</em>' containment reference.
	 * @see #getCms()
	 * @generated
	 */
	void setCms(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Cml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cml</em>' containment reference.
	 * @see #setCml(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType_Cml()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cml' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCml();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapType#getCml <em>Cml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cml</em>' containment reference.
	 * @see #getCml()
	 * @generated
	 */
	void setCml(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Damping Derivatives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damping Derivatives</em>' containment reference.
	 * @see #setDampingDerivatives(DampingDerivativesRatesType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType_DampingDerivatives()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dampingDerivatives' namespace='##targetNamespace'"
	 * @generated
	 */
	DampingDerivativesRatesType getDampingDerivatives();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapType#getDampingDerivatives <em>Damping Derivatives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damping Derivatives</em>' containment reference.
	 * @see #getDampingDerivatives()
	 * @generated
	 */
	void setDampingDerivatives(DampingDerivativesRatesType value);

	/**
	 * Returns the value of the '<em><b>Increment Maps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Maps</em>' containment reference.
	 * @see #setIncrementMaps(AeroPerformanceIncrementMapsType)
	 * @see Cpacs.CpacsPackage#getAeroPerformanceMapType_IncrementMaps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='incrementMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroPerformanceIncrementMapsType getIncrementMaps();

	/**
	 * Sets the value of the '{@link Cpacs.AeroPerformanceMapType#getIncrementMaps <em>Increment Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Maps</em>' containment reference.
	 * @see #getIncrementMaps()
	 * @generated
	 */
	void setIncrementMaps(AeroPerformanceIncrementMapsType value);

} // AeroPerformanceMapType
