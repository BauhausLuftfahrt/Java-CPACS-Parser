/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Limits Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroLimitsMapType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.AeroLimitsMapType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.AeroLimitsMapType#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.AeroLimitsMapType#getOperationLimit <em>Operation Limit</em>}</li>
 *   <li>{@link Cpacs.AeroLimitsMapType#getIncrementMaps <em>Increment Maps</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroLimitsMapType()
 * @model extendedMetaData="name='aeroLimitsMapType' kind='elementOnly'"
 * @generated
 */
public interface AeroLimitsMapType extends ComplexBaseType {
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
	 * @see #setAltitude(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroLimitsMapType_Altitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.AeroLimitsMapType#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(DoubleVectorBaseType value);

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
	 * @see #setMachNumber(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroLimitsMapType_MachNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.AeroLimitsMapType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Sideslip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Angle of sideslip
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #setAngleOfSideslip(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroLimitsMapType_AngleOfSideslip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfSideslip' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getAngleOfSideslip();

	/**
	 * Sets the value of the '{@link Cpacs.AeroLimitsMapType#getAngleOfSideslip <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #getAngleOfSideslip()
	 * @generated
	 */
	void setAngleOfSideslip(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Operation Limit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Limit</em>' containment reference.
	 * @see #setOperationLimit(AeroMapOperationLimitType)
	 * @see Cpacs.CpacsPackage#getAeroLimitsMapType_OperationLimit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operationLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroMapOperationLimitType getOperationLimit();

	/**
	 * Sets the value of the '{@link Cpacs.AeroLimitsMapType#getOperationLimit <em>Operation Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Limit</em>' containment reference.
	 * @see #getOperationLimit()
	 * @generated
	 */
	void setOperationLimit(AeroMapOperationLimitType value);

	/**
	 * Returns the value of the '<em><b>Increment Maps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Maps</em>' containment reference.
	 * @see #setIncrementMaps(AeroLimitsIncrementMapsType)
	 * @see Cpacs.CpacsPackage#getAeroLimitsMapType_IncrementMaps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='incrementMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroLimitsIncrementMapsType getIncrementMaps();

	/**
	 * Sets the value of the '{@link Cpacs.AeroLimitsMapType#getIncrementMaps <em>Increment Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Maps</em>' containment reference.
	 * @see #getIncrementMaps()
	 * @generated
	 */
	void setIncrementMaps(AeroLimitsIncrementMapsType value);

} // AeroLimitsMapType
