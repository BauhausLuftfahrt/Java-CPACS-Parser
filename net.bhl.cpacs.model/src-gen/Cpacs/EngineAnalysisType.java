/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.EngineAnalysisType#getThrust00 <em>Thrust00</em>}</li>
 *   <li>{@link Cpacs.EngineAnalysisType#getFpr00 <em>Fpr00</em>}</li>
 *   <li>{@link Cpacs.EngineAnalysisType#getBpr00 <em>Bpr00</em>}</li>
 *   <li>{@link Cpacs.EngineAnalysisType#getOpr00 <em>Opr00</em>}</li>
 *   <li>{@link Cpacs.EngineAnalysisType#getN1Max <em>N1 Max</em>}</li>
 *   <li>{@link Cpacs.EngineAnalysisType#getN2Max <em>N2 Max</em>}</li>
 *   <li>{@link Cpacs.EngineAnalysisType#getMTrD <em>MTr D</em>}</li>
 *   <li>{@link Cpacs.EngineAnalysisType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.EngineAnalysisType#getPerformanceMaps <em>Performance Maps</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getEngineAnalysisType()
 * @model extendedMetaData="name='engineAnalysisType' kind='elementOnly'"
 * @generated
 */
public interface EngineAnalysisType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Thrust00</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Thrust at takeoff
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thrust00</em>' containment reference.
	 * @see #setThrust00(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineAnalysisType_Thrust00()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thrust00' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getThrust00();

	/**
	 * Sets the value of the '{@link Cpacs.EngineAnalysisType#getThrust00 <em>Thrust00</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thrust00</em>' containment reference.
	 * @see #getThrust00()
	 * @generated
	 */
	void setThrust00(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Fpr00</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fan pressure ratio at takeoff
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fpr00</em>' containment reference.
	 * @see #setFpr00(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineAnalysisType_Fpr00()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fpr00' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getFpr00();

	/**
	 * Sets the value of the '{@link Cpacs.EngineAnalysisType#getFpr00 <em>Fpr00</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fpr00</em>' containment reference.
	 * @see #getFpr00()
	 * @generated
	 */
	void setFpr00(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Bpr00</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bypass ratio at takeoff
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bpr00</em>' containment reference.
	 * @see #setBpr00(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineAnalysisType_Bpr00()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bpr00' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getBpr00();

	/**
	 * Sets the value of the '{@link Cpacs.EngineAnalysisType#getBpr00 <em>Bpr00</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpr00</em>' containment reference.
	 * @see #getBpr00()
	 * @generated
	 */
	void setBpr00(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Opr00</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * overall pressure ratio at takeoff
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opr00</em>' containment reference.
	 * @see #setOpr00(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineAnalysisType_Opr00()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='opr00' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getOpr00();

	/**
	 * Sets the value of the '{@link Cpacs.EngineAnalysisType#getOpr00 <em>Opr00</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opr00</em>' containment reference.
	 * @see #getOpr00()
	 * @generated
	 */
	void setOpr00(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>N1 Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum rotations per second, shaft 1
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>N1 Max</em>' containment reference.
	 * @see #setN1Max(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineAnalysisType_N1Max()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='n1Max' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getN1Max();

	/**
	 * Sets the value of the '{@link Cpacs.EngineAnalysisType#getN1Max <em>N1 Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N1 Max</em>' containment reference.
	 * @see #getN1Max()
	 * @generated
	 */
	void setN1Max(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>N2 Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum rotations per second, shaft 2
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>N2 Max</em>' containment reference.
	 * @see #setN2Max(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineAnalysisType_N2Max()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='n2Max' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getN2Max();

	/**
	 * Sets the value of the '{@link Cpacs.EngineAnalysisType#getN2Max <em>N2 Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N2 Max</em>' containment reference.
	 * @see #getN2Max()
	 * @generated
	 */
	void setN2Max(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>MTr D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Design tip relative mach number (FAN)
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MTr D</em>' containment reference.
	 * @see #setMTrD(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getEngineAnalysisType_MTrD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mTrD' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMTrD();

	/**
	 * Sets the value of the '{@link Cpacs.EngineAnalysisType#getMTrD <em>MTr D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MTr D</em>' containment reference.
	 * @see #getMTrD()
	 * @generated
	 */
	void setMTrD(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DryMass of engine
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(GenericMassType)
	 * @see Cpacs.CpacsPackage#getEngineAnalysisType_Mass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.EngineAnalysisType#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>Performance Maps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Maps</em>' containment reference.
	 * @see #setPerformanceMaps(EnginePerformanceMapsType)
	 * @see Cpacs.CpacsPackage#getEngineAnalysisType_PerformanceMaps()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performanceMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	EnginePerformanceMapsType getPerformanceMaps();

	/**
	 * Sets the value of the '{@link Cpacs.EngineAnalysisType#getPerformanceMaps <em>Performance Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Maps</em>' containment reference.
	 * @see #getPerformanceMaps()
	 * @generated
	 */
	void setPerformanceMaps(EnginePerformanceMapsType value);

} // EngineAnalysisType
