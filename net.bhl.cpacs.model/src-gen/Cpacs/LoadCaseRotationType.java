/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Rotation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseRotationType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link Cpacs.LoadCaseRotationType#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link Cpacs.LoadCaseRotationType#getAngularAcceleration <em>Angular Acceleration</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseRotationType()
 * @model extendedMetaData="name='loadCaseRotationType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseRotationType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(AngleDisplacementType)
	 * @see Cpacs.CpacsPackage#getLoadCaseRotationType_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	AngleDisplacementType getOrientation();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseRotationType#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(AngleDisplacementType value);

	/**
	 * Returns the value of the '<em><b>Angular Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular Velocity</em>' containment reference.
	 * @see #setAngularVelocity(LoadCaseRotationVelocityType)
	 * @see Cpacs.CpacsPackage#getLoadCaseRotationType_AngularVelocity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angularVelocity' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseRotationVelocityType getAngularVelocity();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseRotationType#getAngularVelocity <em>Angular Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Velocity</em>' containment reference.
	 * @see #getAngularVelocity()
	 * @generated
	 */
	void setAngularVelocity(LoadCaseRotationVelocityType value);

	/**
	 * Returns the value of the '<em><b>Angular Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular Acceleration</em>' containment reference.
	 * @see #setAngularAcceleration(AngleAccelerationType)
	 * @see Cpacs.CpacsPackage#getLoadCaseRotationType_AngularAcceleration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angularAcceleration' namespace='##targetNamespace'"
	 * @generated
	 */
	AngleAccelerationType getAngularAcceleration();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseRotationType#getAngularAcceleration <em>Angular Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Acceleration</em>' containment reference.
	 * @see #getAngularAcceleration()
	 * @generated
	 */
	void setAngularAcceleration(AngleAccelerationType value);

} // LoadCaseRotationType
