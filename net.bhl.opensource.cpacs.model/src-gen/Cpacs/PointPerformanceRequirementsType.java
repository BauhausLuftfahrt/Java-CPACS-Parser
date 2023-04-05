/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Performance Requirements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PointPerformanceRequirementsType#getSustainedLoadFactor <em>Sustained Load Factor</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceRequirementsType#getInstantaneousLoadFactor <em>Instantaneous Load Factor</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceRequirementsType#getSpecificExcessPower <em>Specific Excess Power</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceRequirementsType#getRollRate <em>Roll Rate</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceRequirementsType#getRollAccelerationOnset <em>Roll Acceleration Onset</em>}</li>
 *   <li>{@link Cpacs.PointPerformanceRequirementsType#getRollAccelerationStop <em>Roll Acceleration Stop</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPointPerformanceRequirementsType()
 * @model extendedMetaData="name='pointPerformanceRequirementsType' kind='elementOnly'"
 * @generated
 */
public interface PointPerformanceRequirementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Sustained Load Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Sustained load factor to be achieved
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sustained Load Factor</em>' containment reference.
	 * @see #setSustainedLoadFactor(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceRequirementsType_SustainedLoadFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sustainedLoadFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSustainedLoadFactor();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceRequirementsType#getSustainedLoadFactor <em>Sustained Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sustained Load Factor</em>' containment reference.
	 * @see #getSustainedLoadFactor()
	 * @generated
	 */
	void setSustainedLoadFactor(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Instantaneous Load Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Instantaneous load factor to be achieved
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instantaneous Load Factor</em>' containment reference.
	 * @see #setInstantaneousLoadFactor(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceRequirementsType_InstantaneousLoadFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instantaneousLoadFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getInstantaneousLoadFactor();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceRequirementsType#getInstantaneousLoadFactor <em>Instantaneous Load Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantaneous Load Factor</em>' containment reference.
	 * @see #getInstantaneousLoadFactor()
	 * @generated
	 */
	void setInstantaneousLoadFactor(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Specific Excess Power</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Specific excess power to be achieved [m/s]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specific Excess Power</em>' containment reference.
	 * @see #setSpecificExcessPower(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceRequirementsType_SpecificExcessPower()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specificExcessPower' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSpecificExcessPower();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceRequirementsType#getSpecificExcessPower <em>Specific Excess Power</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Excess Power</em>' containment reference.
	 * @see #getSpecificExcessPower()
	 * @generated
	 */
	void setSpecificExcessPower(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Roll Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Roll rate to be achieved [deg/s]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Rate</em>' containment reference.
	 * @see #setRollRate(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceRequirementsType_RollRate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollRate' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRollRate();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceRequirementsType#getRollRate <em>Roll Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Rate</em>' containment reference.
	 * @see #getRollRate()
	 * @generated
	 */
	void setRollRate(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Roll Acceleration Onset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Roll acceleration to be achieved upon control onset [deg/s^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Acceleration Onset</em>' containment reference.
	 * @see #setRollAccelerationOnset(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceRequirementsType_RollAccelerationOnset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollAccelerationOnset' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRollAccelerationOnset();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceRequirementsType#getRollAccelerationOnset <em>Roll Acceleration Onset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Acceleration Onset</em>' containment reference.
	 * @see #getRollAccelerationOnset()
	 * @generated
	 */
	void setRollAccelerationOnset(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Roll Acceleration Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Roll acceleration to be achieved upon control stop [deg/s^2]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Acceleration Stop</em>' containment reference.
	 * @see #setRollAccelerationStop(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPointPerformanceRequirementsType_RollAccelerationStop()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rollAccelerationStop' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRollAccelerationStop();

	/**
	 * Sets the value of the '{@link Cpacs.PointPerformanceRequirementsType#getRollAccelerationStop <em>Roll Acceleration Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Acceleration Stop</em>' containment reference.
	 * @see #getRollAccelerationStop()
	 * @generated
	 */
	void setRollAccelerationStop(DoubleBaseType value);

} // PointPerformanceRequirementsType
