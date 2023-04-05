/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Map Operation Limit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroMapOperationLimitType#getAngleOfAttackMin <em>Angle Of Attack Min</em>}</li>
 *   <li>{@link Cpacs.AeroMapOperationLimitType#getAngleOfAttackMax <em>Angle Of Attack Max</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroMapOperationLimitType()
 * @model extendedMetaData="name='aeroMapOperationLimitType' kind='elementOnly'"
 * @generated
 */
public interface AeroMapOperationLimitType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Angle Of Attack Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum angle of attack defining the operation limit. Must be a vector of the same length as angleOfSideslip, machNumber and altitude. [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack Min</em>' containment reference.
	 * @see #setAngleOfAttackMin(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroMapOperationLimitType_AngleOfAttackMin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfAttackMin' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getAngleOfAttackMin();

	/**
	 * Sets the value of the '{@link Cpacs.AeroMapOperationLimitType#getAngleOfAttackMin <em>Angle Of Attack Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack Min</em>' containment reference.
	 * @see #getAngleOfAttackMin()
	 * @generated
	 */
	void setAngleOfAttackMin(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Attack Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum angle of attack defining the operation limit. Must be a vector of the same length as angleOfSideslip, machNumber and altitude. [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack Max</em>' containment reference.
	 * @see #setAngleOfAttackMax(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroMapOperationLimitType_AngleOfAttackMax()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfAttackMax' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getAngleOfAttackMax();

	/**
	 * Sets the value of the '{@link Cpacs.AeroMapOperationLimitType#getAngleOfAttackMax <em>Angle Of Attack Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack Max</em>' containment reference.
	 * @see #getAngleOfAttackMax()
	 * @generated
	 */
	void setAngleOfAttackMax(DoubleVectorBaseType value);

} // AeroMapOperationLimitType
