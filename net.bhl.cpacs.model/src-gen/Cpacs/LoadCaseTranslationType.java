/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Translation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseTranslationType#getDisplacement <em>Displacement</em>}</li>
 *   <li>{@link Cpacs.LoadCaseTranslationType#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link Cpacs.LoadCaseTranslationType#getAcceleration <em>Acceleration</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseTranslationType()
 * @model extendedMetaData="name='loadCaseTranslationType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseTranslationType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Displacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Displacement of refPoint (vector in earth fix
	 *                                 coord.sys. to refPoint)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Displacement</em>' containment reference.
	 * @see #setDisplacement(PointXYZType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationType_Displacement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='displacement' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getDisplacement();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationType#getDisplacement <em>Displacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displacement</em>' containment reference.
	 * @see #getDisplacement()
	 * @generated
	 */
	void setDisplacement(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Velocity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity</em>' containment reference.
	 * @see #setVelocity(LoadCaseTranslationVelocityType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationType_Velocity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='velocity' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseTranslationVelocityType getVelocity();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationType#getVelocity <em>Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity</em>' containment reference.
	 * @see #getVelocity()
	 * @generated
	 */
	void setVelocity(LoadCaseTranslationVelocityType value);

	/**
	 * Returns the value of the '<em><b>Acceleration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceleration</em>' containment reference.
	 * @see #setAcceleration(LoadCaseTranslationAccelerationType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationType_Acceleration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='acceleration' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseTranslationAccelerationType getAcceleration();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationType#getAcceleration <em>Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceleration</em>' containment reference.
	 * @see #getAcceleration()
	 * @generated
	 */
	void setAcceleration(LoadCaseTranslationAccelerationType value);

} // LoadCaseTranslationType
