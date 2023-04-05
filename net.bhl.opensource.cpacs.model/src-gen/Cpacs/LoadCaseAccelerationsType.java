/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Accelerations Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseAccelerationsType#getLoadFactors <em>Load Factors</em>}</li>
 *   <li>{@link Cpacs.LoadCaseAccelerationsType#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseAccelerationsType()
 * @model extendedMetaData="name='loadCaseAccelerationsType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseAccelerationsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load Factors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Factors</em>' containment reference.
	 * @see #setLoadFactors(LoadCaseLoadFactorsType)
	 * @see Cpacs.CpacsPackage#getLoadCaseAccelerationsType_LoadFactors()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='loadFactors' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCaseLoadFactorsType getLoadFactors();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseAccelerationsType#getLoadFactors <em>Load Factors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Factors</em>' containment reference.
	 * @see #getLoadFactors()
	 * @generated
	 */
	void setLoadFactors(LoadCaseLoadFactorsType value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotational accelerations acting around aircraft centre of gravity [deg/s^2]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotation</em>' containment reference.
	 * @see #setRotation(PointXYZType)
	 * @see Cpacs.CpacsPackage#getLoadCaseAccelerationsType_Rotation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getRotation();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseAccelerationsType#getRotation <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' containment reference.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(PointXYZType value);

} // LoadCaseAccelerationsType
