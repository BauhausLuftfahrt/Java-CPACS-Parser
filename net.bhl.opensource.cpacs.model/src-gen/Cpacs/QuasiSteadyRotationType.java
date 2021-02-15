/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quasi Steady Rotation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.QuasiSteadyRotationType#getPstar <em>Pstar</em>}</li>
 *   <li>{@link Cpacs.QuasiSteadyRotationType#getQstar <em>Qstar</em>}</li>
 *   <li>{@link Cpacs.QuasiSteadyRotationType#getRstar <em>Rstar</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getQuasiSteadyRotationType()
 * @model extendedMetaData="name='quasiSteadyRotationType' kind='elementOnly'"
 * @generated
 */
public interface QuasiSteadyRotationType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Pstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * normalized roll rate pstar, default
	 *                                 (performance maps) = 0.003 (or -0.003 for negative rotation);
	 *                                 default (Loadcases) = 0. The roll rate p [rad/sec] is
	 *                                 nondimensionalized by: pStar = p * reference length (CMY) / flow
	 *                                 speed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pstar</em>' containment reference.
	 * @see #setPstar(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getQuasiSteadyRotationType_Pstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pstar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPstar();

	/**
	 * Sets the value of the '{@link Cpacs.QuasiSteadyRotationType#getPstar <em>Pstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pstar</em>' containment reference.
	 * @see #getPstar()
	 * @generated
	 */
	void setPstar(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Qstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * normalized pitch rate qstar, default
	 *                                 (performance maps) = 0.003 (or -0.003 for negative rotation);
	 *                                 default (Loadcases) = 0. The pitch rate q [rad/sec] is
	 *                                 nondimensionalized by: qStar = q * reference length (CMY) / flow
	 *                                 speed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qstar</em>' containment reference.
	 * @see #setQstar(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getQuasiSteadyRotationType_Qstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='qstar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getQstar();

	/**
	 * Sets the value of the '{@link Cpacs.QuasiSteadyRotationType#getQstar <em>Qstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qstar</em>' containment reference.
	 * @see #getQstar()
	 * @generated
	 */
	void setQstar(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Rstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * normalized yaw rate rstar, default
	 *                                 (performance maps) = 0.003 (or -0.003 for negative rotation);
	 *                                 default (Loadcases) = 0. The roll rate r [rad/sec] is
	 *                                 nondimensionalized by: rStar = r * reference length (CMY) / flow
	 *                                 speed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rstar</em>' containment reference.
	 * @see #setRstar(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getQuasiSteadyRotationType_Rstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rstar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRstar();

	/**
	 * Sets the value of the '{@link Cpacs.QuasiSteadyRotationType#getRstar <em>Rstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rstar</em>' containment reference.
	 * @see #getRstar()
	 * @generated
	 */
	void setRstar(DoubleBaseType value);

} // QuasiSteadyRotationType
