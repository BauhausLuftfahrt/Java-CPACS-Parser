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
 *   <li>{@link Cpacs.OperationLimitIncrementsType#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.OperationLimitIncrementsType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getOperationLimitIncrementsType()
 * @model extendedMetaData="name='operationLimitIncrementsType' kind='elementOnly'"
 * @generated
 */
public interface OperationLimitIncrementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Angle Of Sideslip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sideslip angle [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #setAngleOfSideslip(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getOperationLimitIncrementsType_AngleOfSideslip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfSideslip' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getAngleOfSideslip();

	/**
	 * Sets the value of the '{@link Cpacs.OperationLimitIncrementsType#getAngleOfSideslip <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #getAngleOfSideslip()
	 * @generated
	 */
	void setAngleOfSideslip(StringArrayBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Attack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angle of attack [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(StringArrayBaseType)
	 * @see Cpacs.CpacsPackage#getOperationLimitIncrementsType_AngleOfAttack()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	StringArrayBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.OperationLimitIncrementsType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(StringArrayBaseType value);

} // OperationLimitIncrementsType
