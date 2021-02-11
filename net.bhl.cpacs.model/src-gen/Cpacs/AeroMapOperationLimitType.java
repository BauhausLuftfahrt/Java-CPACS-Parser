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
 *   <li>{@link Cpacs.AeroMapOperationLimitType#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.AeroMapOperationLimitType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroMapOperationLimitType()
 * @model extendedMetaData="name='aeroMapOperationLimitType' kind='elementOnly'"
 * @generated
 */
public interface AeroMapOperationLimitType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Angle Of Sideslip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sideslip angle defining the operation limit. Must be a vector of the same length as angleOfAttack, machNumber and altitude. [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #setAngleOfSideslip(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroMapOperationLimitType_AngleOfSideslip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfSideslip' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAngleOfSideslip();

	/**
	 * Sets the value of the '{@link Cpacs.AeroMapOperationLimitType#getAngleOfSideslip <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #getAngleOfSideslip()
	 * @generated
	 */
	void setAngleOfSideslip(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Attack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angle of attack defining the operation limit. Must be a vector of the same length as angleOfSideslip, machNumber and altitude. [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getAeroMapOperationLimitType_AngleOfAttack()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.AeroMapOperationLimitType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(StringVectorBaseType value);

} // AeroMapOperationLimitType
