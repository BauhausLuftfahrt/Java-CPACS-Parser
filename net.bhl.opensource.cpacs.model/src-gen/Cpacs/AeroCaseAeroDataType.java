/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Case Aero Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroCaseAeroDataType#getAngleOfAttack <em>Angle Of Attack</em>}</li>
 *   <li>{@link Cpacs.AeroCaseAeroDataType#getAngleOfSideslip <em>Angle Of Sideslip</em>}</li>
 *   <li>{@link Cpacs.AeroCaseAeroDataType#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link Cpacs.AeroCaseAeroDataType#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroCaseAeroDataType()
 * @model extendedMetaData="name='aeroCaseAeroDataType' kind='elementOnly'"
 * @generated
 */
public interface AeroCaseAeroDataType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Angle Of Attack</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Angle of attack [deg]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #setAngleOfAttack(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseAeroDataType_AngleOfAttack()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleOfAttack();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseAeroDataType#getAngleOfAttack <em>Angle Of Attack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Attack</em>' containment reference.
	 * @see #getAngleOfAttack()
	 * @generated
	 */
	void setAngleOfAttack(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Angle Of Sideslip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Angle of sideslip [deg]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #setAngleOfSideslip(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getAeroCaseAeroDataType_AngleOfSideslip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='angleOfSideslip' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getAngleOfSideslip();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseAeroDataType#getAngleOfSideslip <em>Angle Of Sideslip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Of Sideslip</em>' containment reference.
	 * @see #getAngleOfSideslip()
	 * @generated
	 */
	void setAngleOfSideslip(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' containment reference.
	 * @see #setVehicle(AeroDataVehicleType)
	 * @see Cpacs.CpacsPackage#getAeroCaseAeroDataType_Vehicle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vehicle' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroDataVehicleType getVehicle();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseAeroDataType#getVehicle <em>Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' containment reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(AeroDataVehicleType value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference.
	 * @see #setComponents(AeroDataComponentsType)
	 * @see Cpacs.CpacsPackage#getAeroCaseAeroDataType_Components()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='components' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroDataComponentsType getComponents();

	/**
	 * Sets the value of the '{@link Cpacs.AeroCaseAeroDataType#getComponents <em>Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components</em>' containment reference.
	 * @see #getComponents()
	 * @generated
	 */
	void setComponents(AeroDataComponentsType value);

} // AeroCaseAeroDataType
