/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fatigue Stress Based Brown Miller Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FatigueStressBasedBrownMillerType#getSigmaF <em>Sigma F</em>}</li>
 *   <li>{@link Cpacs.FatigueStressBasedBrownMillerType#getB <em>B</em>}</li>
 *   <li>{@link Cpacs.FatigueStressBasedBrownMillerType#getEpsilonF <em>Epsilon F</em>}</li>
 *   <li>{@link Cpacs.FatigueStressBasedBrownMillerType#getC <em>C</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFatigueStressBasedBrownMillerType()
 * @model extendedMetaData="name='fatigueStressBasedBrownMillerType' kind='elementOnly'"
 * @generated
 */
public interface FatigueStressBasedBrownMillerType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sigma F</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter sigma_f [N/m^2]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sigma F</em>' containment reference.
	 * @see #setSigmaF(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFatigueStressBasedBrownMillerType_SigmaF()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sigmaF' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSigmaF();

	/**
	 * Sets the value of the '{@link Cpacs.FatigueStressBasedBrownMillerType#getSigmaF <em>Sigma F</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigma F</em>' containment reference.
	 * @see #getSigmaF()
	 * @generated
	 */
	void setSigmaF(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter b [-]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>B</em>' containment reference.
	 * @see #setB(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFatigueStressBasedBrownMillerType_B()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getB();

	/**
	 * Sets the value of the '{@link Cpacs.FatigueStressBasedBrownMillerType#getB <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' containment reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Epsilon F</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter epsilon_f [-]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Epsilon F</em>' containment reference.
	 * @see #setEpsilonF(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFatigueStressBasedBrownMillerType_EpsilonF()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='epsilonF' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getEpsilonF();

	/**
	 * Sets the value of the '{@link Cpacs.FatigueStressBasedBrownMillerType#getEpsilonF <em>Epsilon F</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epsilon F</em>' containment reference.
	 * @see #getEpsilonF()
	 * @generated
	 */
	void setEpsilonF(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter c [-]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>C</em>' containment reference.
	 * @see #setC(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFatigueStressBasedBrownMillerType_C()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='c' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getC();

	/**
	 * Sets the value of the '{@link Cpacs.FatigueStressBasedBrownMillerType#getC <em>C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' containment reference.
	 * @see #getC()
	 * @generated
	 */
	void setC(DoubleBaseType value);

} // FatigueStressBasedBrownMillerType
