/**
 */
package Cpacs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Case Specification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroCaseSpecificationType#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link Cpacs.AeroCaseSpecificationType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link Cpacs.AeroCaseSpecificationType#getMachNumber <em>Mach Number</em>}</li>
 *   <li>{@link Cpacs.AeroCaseSpecificationType#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.AeroCaseSpecificationType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.AeroCaseSpecificationType#getTargetCl <em>Target Cl</em>}</li>
 *   <li>{@link Cpacs.AeroCaseSpecificationType#getPStar <em>PStar</em>}</li>
 *   <li>{@link Cpacs.AeroCaseSpecificationType#getQStar <em>QStar</em>}</li>
 *   <li>{@link Cpacs.AeroCaseSpecificationType#getRStar <em>RStar</em>}</li>
 *   <li>{@link Cpacs.AeroCaseSpecificationType#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link Cpacs.AeroCaseSpecificationType#getWeightAndBalanceUID <em>Weight And Balance UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroCaseSpecificationType()
 * @model extendedMetaData="name='aeroCaseSpecificationType' kind='elementOnly'"
 * @generated
 */
public interface AeroCaseSpecificationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(EnvironmentType)
	 * @see Cpacs.CpacsPackage#getAeroCaseSpecificationType_Environment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='environment' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvironmentType getEnvironment();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseSpecificationType#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(EnvironmentType value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Altitude
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseSpecificationType_Altitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAltitude();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseSpecificationType#getAltitude <em>Altitude</em>}' containment reference.
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
	 *                         Mach number
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mach Number</em>' containment reference.
	 * @see #setMachNumber(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseSpecificationType_MachNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='machNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMachNumber();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseSpecificationType#getMachNumber <em>Mach Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mach Number</em>' containment reference.
	 * @see #getMachNumber()
	 * @generated
	 */
	void setMachNumber(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Sideslip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Angle of sideslip [deg]
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #setAngleOfSideslip(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseSpecificationType_AngleOfSideslip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfSideslip' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleOfSideslip();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseSpecificationType#getAngleOfSideslip <em>Angle Of Sideslip</em>}' containment reference.
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
	 * <!-- begin-model-doc -->
	 * 
	 *                             Angle of attack [deg]
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseSpecificationType_AngleOfAttack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseSpecificationType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Target Cl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Target lift coefficient
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Cl</em>' containment reference.
	 * @see #setTargetCl(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseSpecificationType_TargetCl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='targetCl' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTargetCl();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseSpecificationType#getTargetCl <em>Target Cl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Cl</em>' containment reference.
	 * @see #getTargetCl()
	 * @generated
	 */
	void setTargetCl(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>PStar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Normalized roll rate [rad/sec]. It is specified around the global x-axis
	 *                         with the aircraft model's global reference point as origin and
	 *                         nondimensionalized by: pStar = p * reference length / flow speed.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PStar</em>' containment reference.
	 * @see #setPStar(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseSpecificationType_PStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPStar();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseSpecificationType#getPStar <em>PStar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PStar</em>' containment reference.
	 * @see #getPStar()
	 * @generated
	 */
	void setPStar(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>QStar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Normalized pitch rate [rad/sec]. It is specified around the global y-axis
	 *                         with the aircraft model's global reference point as origin and
	 *                         nondimensionalized by: qStar = q * reference length / flow speed.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>QStar</em>' containment reference.
	 * @see #setQStar(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseSpecificationType_QStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getQStar();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseSpecificationType#getQStar <em>QStar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QStar</em>' containment reference.
	 * @see #getQStar()
	 * @generated
	 */
	void setQStar(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>RStar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Normalized yaw rate [rad/sec]. It is specified around the global z-axis
	 *                         with the aircraft model's global reference point as origin and
	 *                         nondimensionalized by: rStar = r * reference length / flow speed.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RStar</em>' containment reference.
	 * @see #setRStar(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseSpecificationType_RStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRStar();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseSpecificationType#getRStar <em>RStar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RStar</em>' containment reference.
	 * @see #getRStar()
	 * @generated
	 */
	void setRStar(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(ConfigurationType)
	 * @see Cpacs.CpacsPackage#getAeroCaseSpecificationType_Configuration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='configuration' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfigurationType getConfiguration();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseSpecificationType#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(ConfigurationType value);

	/**
	 * Returns the value of the '<em><b>Weight And Balance UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Reference to a weight and balance description
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight And Balance UID</em>' containment reference.
	 * @see #setWeightAndBalanceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseSpecificationType_WeightAndBalanceUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weightAndBalanceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getWeightAndBalanceUID();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseSpecificationType#getWeightAndBalanceUID <em>Weight And Balance UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight And Balance UID</em>' containment reference.
	 * @see #getWeightAndBalanceUID()
	 * @generated
	 */
	void setWeightAndBalanceUID(StringUIDBaseType value);

} // AeroCaseSpecificationType
