/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Limit Increments Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.OperationLimitIncrementsType#getDeltaAngleOfAttackMin <em>Delta Angle Of Attack Min</em>}</li>
 *   <li>{@link Cpacs.OperationLimitIncrementsType#getDeltaAngleOfAttackMax <em>Delta Angle Of Attack Max</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getOperationLimitIncrementsType()
 * @model extendedMetaData="name='operationLimitIncrementsType' kind='elementOnly'"
 * @generated
 */
public interface OperationLimitIncrementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Delta Angle Of Attack Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum delta angle of attack [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Angle Of Attack Min</em>' containment reference.
	 * @see #setDeltaAngleOfAttackMin(DoubleArrayBaseType)
	 * @see Cpacs.CpacsPackage#getOperationLimitIncrementsType_DeltaAngleOfAttackMin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deltaAngleOfAttackMin' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleArrayBaseType getDeltaAngleOfAttackMin();

	/**
	 * Sets the value of the '{@link Cpacs.OperationLimitIncrementsType#getDeltaAngleOfAttackMin <em>Delta Angle Of Attack Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Angle Of Attack Min</em>' containment reference.
	 * @see #getDeltaAngleOfAttackMin()
	 * @generated
	 */
	void setDeltaAngleOfAttackMin(DoubleArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Delta Angle Of Attack Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum delta angle of attack [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta Angle Of Attack Max</em>' containment reference.
	 * @see #setDeltaAngleOfAttackMax(DoubleArrayBaseType)
	 * @see Cpacs.CpacsPackage#getOperationLimitIncrementsType_DeltaAngleOfAttackMax()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deltaAngleOfAttackMax' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleArrayBaseType getDeltaAngleOfAttackMax();

	/**
	 * Sets the value of the '{@link Cpacs.OperationLimitIncrementsType#getDeltaAngleOfAttackMax <em>Delta Angle Of Attack Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta Angle Of Attack Max</em>' containment reference.
	 * @see #getDeltaAngleOfAttackMax()
	 * @generated
	 */
	void setDeltaAngleOfAttackMax(DoubleArrayBaseType value);

} // OperationLimitIncrementsType
