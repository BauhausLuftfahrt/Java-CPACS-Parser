/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fq Phugoid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FqPhugoidType#getPhDamping <em>Ph Damping</em>}</li>
 *   <li>{@link Cpacs.FqPhugoidType#getPhDoublingTime <em>Ph Doubling Time</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFqPhugoidType()
 * @model extendedMetaData="name='fqPhugoidType' kind='elementOnly'"
 * @generated
 */
public interface FqPhugoidType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Ph Damping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * damping ratio of phugoid mode [-]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ph Damping</em>' containment reference.
	 * @see #setPhDamping(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqPhugoidType_PhDamping()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='phDamping' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPhDamping();

	/**
	 * Sets the value of the '{@link Cpacs.FqPhugoidType#getPhDamping <em>Ph Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ph Damping</em>' containment reference.
	 * @see #getPhDamping()
	 * @generated
	 */
	void setPhDamping(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Ph Doubling Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * time to double amplitude of unstable phugoid
	 *                                 mode [s]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ph Doubling Time</em>' containment reference.
	 * @see #setPhDoublingTime(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqPhugoidType_PhDoublingTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='phDoublingTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPhDoublingTime();

	/**
	 * Sets the value of the '{@link Cpacs.FqPhugoidType#getPhDoublingTime <em>Ph Doubling Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ph Doubling Time</em>' containment reference.
	 * @see #getPhDoublingTime()
	 * @generated
	 */
	void setPhDoublingTime(DoubleBaseType value);

} // FqPhugoidType
