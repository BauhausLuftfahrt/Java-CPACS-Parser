/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Noise Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.NoiseAnalysisType#getNoiseLevelApproach <em>Noise Level Approach</em>}</li>
 *   <li>{@link Cpacs.NoiseAnalysisType#getNoiseLevelSideline <em>Noise Level Sideline</em>}</li>
 *   <li>{@link Cpacs.NoiseAnalysisType#getNoiseLevelTakeOff <em>Noise Level Take Off</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getNoiseAnalysisType()
 * @model extendedMetaData="name='noiseAnalysisType' kind='elementOnly'"
 * @generated
 */
public interface NoiseAnalysisType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Noise Level Approach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FAR approach noise level
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Noise Level Approach</em>' containment reference.
	 * @see #setNoiseLevelApproach(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getNoiseAnalysisType_NoiseLevelApproach()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noiseLevelApproach' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNoiseLevelApproach();

	/**
	 * Sets the value of the '{@link Cpacs.NoiseAnalysisType#getNoiseLevelApproach <em>Noise Level Approach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise Level Approach</em>' containment reference.
	 * @see #getNoiseLevelApproach()
	 * @generated
	 */
	void setNoiseLevelApproach(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Noise Level Sideline</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FAR sideline noise level
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Noise Level Sideline</em>' containment reference.
	 * @see #setNoiseLevelSideline(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getNoiseAnalysisType_NoiseLevelSideline()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noiseLevelSideline' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNoiseLevelSideline();

	/**
	 * Sets the value of the '{@link Cpacs.NoiseAnalysisType#getNoiseLevelSideline <em>Noise Level Sideline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise Level Sideline</em>' containment reference.
	 * @see #getNoiseLevelSideline()
	 * @generated
	 */
	void setNoiseLevelSideline(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Noise Level Take Off</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FAR take-off noise level
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Noise Level Take Off</em>' containment reference.
	 * @see #setNoiseLevelTakeOff(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getNoiseAnalysisType_NoiseLevelTakeOff()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noiseLevelTakeOff' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNoiseLevelTakeOff();

	/**
	 * Sets the value of the '{@link Cpacs.NoiseAnalysisType#getNoiseLevelTakeOff <em>Noise Level Take Off</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise Level Take Off</em>' containment reference.
	 * @see #getNoiseLevelTakeOff()
	 * @generated
	 */
	void setNoiseLevelTakeOff(DoubleBaseType value);

} // NoiseAnalysisType
