/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fq Roll Perf Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FqRollPerfType#getTPhi <em>TPhi</em>}</li>
 *   <li>{@link Cpacs.FqRollPerfType#getPhiCrit <em>Phi Crit</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFqRollPerfType()
 * @model extendedMetaData="name='fqRollPerfType' kind='elementOnly'"
 * @generated
 */
public interface FqRollPerfType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>TPhi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * time to reach critical bank angle [s]
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TPhi</em>' containment reference.
	 * @see #setTPhi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqRollPerfType_TPhi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tPhi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTPhi();

	/**
	 * Sets the value of the '{@link Cpacs.FqRollPerfType#getTPhi <em>TPhi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TPhi</em>' containment reference.
	 * @see #getTPhi()
	 * @generated
	 */
	void setTPhi(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Phi Crit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * critical bank angle that has to be reached
	 *                                 [deg]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phi Crit</em>' containment reference.
	 * @see #setPhiCrit(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqRollPerfType_PhiCrit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='phiCrit' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPhiCrit();

	/**
	 * Sets the value of the '{@link Cpacs.FqRollPerfType#getPhiCrit <em>Phi Crit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi Crit</em>' containment reference.
	 * @see #getPhiCrit()
	 * @generated
	 */
	void setPhiCrit(DoubleBaseType value);

} // FqRollPerfType
