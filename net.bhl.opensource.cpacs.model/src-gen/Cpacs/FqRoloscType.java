/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fq Rolosc Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FqRoloscType#getRatioPoscPav <em>Ratio Posc Pav</em>}</li>
 *   <li>{@link Cpacs.FqRoloscType#getPhasePsiBeta <em>Phase Psi Beta</em>}</li>
 *   <li>{@link Cpacs.FqRoloscType#getPasePBeta <em>Pase PBeta</em>}</li>
 *   <li>{@link Cpacs.FqRoloscType#getRatioP2P1 <em>Ratio P2P1</em>}</li>
 *   <li>{@link Cpacs.FqRoloscType#getRollRateOsc <em>Roll Rate Osc</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFqRoloscType()
 * @model extendedMetaData="name='fqRoloscType' kind='elementOnly'"
 * @generated
 */
public interface FqRoloscType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Ratio Posc Pav</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ratio of oscillatory component of the roll
	 *                                 rate to the average roll rate [-]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ratio Posc Pav</em>' containment reference.
	 * @see #setRatioPoscPav(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqRoloscType_RatioPoscPav()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ratioPoscPav' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRatioPoscPav();

	/**
	 * Sets the value of the '{@link Cpacs.FqRoloscType#getRatioPoscPav <em>Ratio Posc Pav</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio Posc Pav</em>' containment reference.
	 * @see #getRatioPoscPav()
	 * @generated
	 */
	void setRatioPoscPav(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Phase Psi Beta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * phase angle of dutch roll oscillation in
	 *                                 sideslip [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phase Psi Beta</em>' containment reference.
	 * @see #setPhasePsiBeta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqRoloscType_PhasePsiBeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phasePsiBeta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPhasePsiBeta();

	/**
	 * Sets the value of the '{@link Cpacs.FqRoloscType#getPhasePsiBeta <em>Phase Psi Beta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Psi Beta</em>' containment reference.
	 * @see #getPhasePsiBeta()
	 * @generated
	 */
	void setPhasePsiBeta(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Pase PBeta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * phase angle between roll rate and sideslip in
	 *                                 dutch roll mode [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pase PBeta</em>' containment reference.
	 * @see #setPasePBeta(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqRoloscType_PasePBeta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pasePBeta' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPasePBeta();

	/**
	 * Sets the value of the '{@link Cpacs.FqRoloscType#getPasePBeta <em>Pase PBeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pase PBeta</em>' containment reference.
	 * @see #getPasePBeta()
	 * @generated
	 */
	void setPasePBeta(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Ratio P2P1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ratio of first minimum roll rate to first
	 *                                 maximum [-]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ratio P2P1</em>' containment reference.
	 * @see #setRatioP2P1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqRoloscType_RatioP2P1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ratioP2P1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRatioP2P1();

	/**
	 * Sets the value of the '{@link Cpacs.FqRoloscType#getRatioP2P1 <em>Ratio P2P1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio P2P1</em>' containment reference.
	 * @see #getRatioP2P1()
	 * @generated
	 */
	void setRatioP2P1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Roll Rate Osc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * handling qualities level of ratio of
	 *                                 oscillatory component of roll rate to average roll rate
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Rate Osc</em>' containment reference.
	 * @see #setRollRateOsc(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqRoloscType_RollRateOsc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollRateOsc' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRollRateOsc();

	/**
	 * Sets the value of the '{@link Cpacs.FqRoloscType#getRollRateOsc <em>Roll Rate Osc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Rate Osc</em>' containment reference.
	 * @see #getRollRateOsc()
	 * @generated
	 */
	void setRollRateOsc(DoubleBaseType value);

} // FqRoloscType
