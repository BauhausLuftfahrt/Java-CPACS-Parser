/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Takeoff Performance Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TakeoffPerformanceParametersType#getTodVLiftoff <em>Tod VLiftoff</em>}</li>
 *   <li>{@link Cpacs.TakeoffPerformanceParametersType#getTodV2 <em>Tod V2</em>}</li>
 *   <li>{@link Cpacs.TakeoffPerformanceParametersType#getVElevOptimal <em>VElev Optimal</em>}</li>
 *   <li>{@link Cpacs.TakeoffPerformanceParametersType#getVRotationOptimal <em>VRotation Optimal</em>}</li>
 *   <li>{@link Cpacs.TakeoffPerformanceParametersType#getVLiftoff <em>VLiftoff</em>}</li>
 *   <li>{@link Cpacs.TakeoffPerformanceParametersType#getV2 <em>V2</em>}</li>
 *   <li>{@link Cpacs.TakeoffPerformanceParametersType#getV1 <em>V1</em>}</li>
 *   <li>{@link Cpacs.TakeoffPerformanceParametersType#getVMCG <em>VMCG</em>}</li>
 *   <li>{@link Cpacs.TakeoffPerformanceParametersType#getGammaCheck <em>Gamma Check</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTakeoffPerformanceParametersType()
 * @model extendedMetaData="name='takeoffPerformanceParametersType' kind='elementOnly'"
 * @generated
 */
public interface TakeoffPerformanceParametersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Tod VLiftoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Take-off distance at liftoff speed VLOF.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tod VLiftoff</em>' containment reference.
	 * @see #setTodVLiftoff(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTakeoffPerformanceParametersType_TodVLiftoff()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='todVLiftoff' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTodVLiftoff();

	/**
	 * Sets the value of the '{@link Cpacs.TakeoffPerformanceParametersType#getTodVLiftoff <em>Tod VLiftoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tod VLiftoff</em>' containment reference.
	 * @see #getTodVLiftoff()
	 * @generated
	 */
	void setTodVLiftoff(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Tod V2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Take-off distance at safety speed V2.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tod V2</em>' containment reference.
	 * @see #setTodV2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTakeoffPerformanceParametersType_TodV2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='todV2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTodV2();

	/**
	 * Sets the value of the '{@link Cpacs.TakeoffPerformanceParametersType#getTodV2 <em>Tod V2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tod V2</em>' containment reference.
	 * @see #getTodV2()
	 * @generated
	 */
	void setTodV2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>VElev Optimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optimal speed Velev at point of initiating
	 *                                 take-off rotation by elevator deflection for a minimum take-off
	 *                                 distance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VElev Optimal</em>' containment reference.
	 * @see #setVElevOptimal(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTakeoffPerformanceParametersType_VElevOptimal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vElevOptimal' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getVElevOptimal();

	/**
	 * Sets the value of the '{@link Cpacs.TakeoffPerformanceParametersType#getVElevOptimal <em>VElev Optimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VElev Optimal</em>' containment reference.
	 * @see #getVElevOptimal()
	 * @generated
	 */
	void setVElevOptimal(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>VRotation Optimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optimal rotation speed VR for a mini-mum
	 *                                 take-off distance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VRotation Optimal</em>' containment reference.
	 * @see #setVRotationOptimal(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTakeoffPerformanceParametersType_VRotationOptimal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vRotationOptimal' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getVRotationOptimal();

	/**
	 * Sets the value of the '{@link Cpacs.TakeoffPerformanceParametersType#getVRotationOptimal <em>VRotation Optimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VRotation Optimal</em>' containment reference.
	 * @see #getVRotationOptimal()
	 * @generated
	 */
	void setVRotationOptimal(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>VLiftoff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Liftoff speed VLOF.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VLiftoff</em>' containment reference.
	 * @see #setVLiftoff(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTakeoffPerformanceParametersType_VLiftoff()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vLiftoff' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getVLiftoff();

	/**
	 * Sets the value of the '{@link Cpacs.TakeoffPerformanceParametersType#getVLiftoff <em>VLiftoff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VLiftoff</em>' containment reference.
	 * @see #getVLiftoff()
	 * @generated
	 */
	void setVLiftoff(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>V2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Safety speed V2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>V2</em>' containment reference.
	 * @see #setV2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTakeoffPerformanceParametersType_V2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='v2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getV2();

	/**
	 * Sets the value of the '{@link Cpacs.TakeoffPerformanceParametersType#getV2 <em>V2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V2</em>' containment reference.
	 * @see #getV2()
	 * @generated
	 */
	void setV2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>V1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Take-off decision speed V1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>V1</em>' containment reference.
	 * @see #setV1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTakeoffPerformanceParametersType_V1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='v1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getV1();

	/**
	 * Sets the value of the '{@link Cpacs.TakeoffPerformanceParametersType#getV1 <em>V1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V1</em>' containment reference.
	 * @see #getV1()
	 * @generated
	 */
	void setV1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>VMCG</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum control speed ground VMCG.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VMCG</em>' containment reference.
	 * @see #setVMCG(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTakeoffPerformanceParametersType_VMCG()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='vMCG' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getVMCG();

	/**
	 * Sets the value of the '{@link Cpacs.TakeoffPerformanceParametersType#getVMCG <em>VMCG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VMCG</em>' containment reference.
	 * @see #getVMCG()
	 * @generated
	 */
	void setVMCG(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Gamma Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flight path angle being achieved at V2 with
	 *                                 one engine failure in 400 ft height above ground. This is the
	 *                                 result of a post trim calculation using the deter-mined V2. If
	 *                                 the trim calculation fails the entry is set to -90.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gamma Check</em>' containment reference.
	 * @see #setGammaCheck(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getTakeoffPerformanceParametersType_GammaCheck()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gammaCheck' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGammaCheck();

	/**
	 * Sets the value of the '{@link Cpacs.TakeoffPerformanceParametersType#getGammaCheck <em>Gamma Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma Check</em>' containment reference.
	 * @see #getGammaCheck()
	 * @generated
	 */
	void setGammaCheck(DoubleBaseType value);

} // TakeoffPerformanceParametersType
