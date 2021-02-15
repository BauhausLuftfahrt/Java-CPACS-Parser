/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trim Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrimParametersType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.TrimParametersType#getReynoldsNumber <em>Reynolds Number</em>}</li>
 *   <li>{@link Cpacs.TrimParametersType#getAirspeed <em>Airspeed</em>}</li>
 *   <li>{@link Cpacs.TrimParametersType#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.TrimParametersType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.TrimParametersType#getLoadFactorZ <em>Load Factor Z</em>}</li>
 *   <li>{@link Cpacs.TrimParametersType#getTargetLiftCoefficient <em>Target Lift Coefficient</em>}</li>
 *   <li>{@link Cpacs.TrimParametersType#getQuasiSteadyRotation <em>Quasi Steady Rotation</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrimParametersType()
 * @model extendedMetaData="name='trimParametersType' kind='elementOnly'"
 * @generated
 */
public interface TrimParametersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mach Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mach number
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrimParametersType_MachNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.TrimParametersType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reynolds Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reynolds number (reference length is definden
	 *                                 in ...aircraft/model/reference/length)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reynolds Number</em>' containment reference.
	 * @see #setReynoldsNumber(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrimParametersType_ReynoldsNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reynoldsNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getReynoldsNumber();

	/**
	 * Sets the value of the '{@link Cpacs.TrimParametersType#getReynoldsNumber <em>Reynolds Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reynolds Number</em>' containment reference.
	 * @see #getReynoldsNumber()
	 * @generated
	 */
	void setReynoldsNumber(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Airspeed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Airspeed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Airspeed</em>' containment reference.
	 * @see #setAirspeed(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrimParametersType_Airspeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='airspeed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAirspeed();

	/**
	 * Sets the value of the '{@link Cpacs.TrimParametersType#getAirspeed <em>Airspeed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Airspeed</em>' containment reference.
	 * @see #getAirspeed()
	 * @generated
	 */
	void setAirspeed(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Sideslip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #setAngleOfSideslip(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrimParametersType_AngleOfSideslip()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleOfSideslip' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleOfSideslip();

	/**
	 * Sets the value of the '{@link Cpacs.TrimParametersType#getAngleOfSideslip <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #getAngleOfSideslip()
	 * @generated
	 */
	void setAngleOfSideslip(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Attack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrimParametersType_AngleOfAttack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.TrimParametersType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Load Factor Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Load factor in CPACS coordinate system
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Factor Z</em>' containment reference.
	 * @see #setLoadFactorZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrimParametersType_LoadFactorZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadFactorZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLoadFactorZ();

	/**
	 * Sets the value of the '{@link Cpacs.TrimParametersType#getLoadFactorZ <em>Load Factor Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Factor Z</em>' containment reference.
	 * @see #getLoadFactorZ()
	 * @generated
	 */
	void setLoadFactorZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Target Lift Coefficient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lift coefficient in the aerodynamic coordinate
	 *                                 system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Lift Coefficient</em>' containment reference.
	 * @see #setTargetLiftCoefficient(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTrimParametersType_TargetLiftCoefficient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetLiftCoefficient' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTargetLiftCoefficient();

	/**
	 * Sets the value of the '{@link Cpacs.TrimParametersType#getTargetLiftCoefficient <em>Target Lift Coefficient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Lift Coefficient</em>' containment reference.
	 * @see #getTargetLiftCoefficient()
	 * @generated
	 */
	void setTargetLiftCoefficient(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Quasi Steady Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quasi Steady Rotation</em>' containment reference.
	 * @see #setQuasiSteadyRotation(QuasiSteadyRotationType)
	 * @see Cpacs.CpacsPackage#getTrimParametersType_QuasiSteadyRotation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quasiSteadyRotation' namespace='##targetNamespace'"
	 * @generated
	 */
	QuasiSteadyRotationType getQuasiSteadyRotation();

	/**
	 * Sets the value of the '{@link Cpacs.TrimParametersType#getQuasiSteadyRotation <em>Quasi Steady Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quasi Steady Rotation</em>' containment reference.
	 * @see #getQuasiSteadyRotation()
	 * @generated
	 */
	void setQuasiSteadyRotation(QuasiSteadyRotationType value);

} // TrimParametersType
