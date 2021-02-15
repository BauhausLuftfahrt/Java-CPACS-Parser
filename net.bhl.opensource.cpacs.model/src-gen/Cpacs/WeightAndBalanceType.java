/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weight And Balance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WeightAndBalanceType#getOperationalCases <em>Operational Cases</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalanceType#getCertificationCases <em>Certification Cases</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWeightAndBalanceType()
 * @model extendedMetaData="name='weightAndBalanceType' kind='elementOnly'"
 * @generated
 */
public interface WeightAndBalanceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Operational Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Cases</em>' containment reference.
	 * @see #setOperationalCases(OperationalCasesType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceType_OperationalCases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operationalCases' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationalCasesType getOperationalCases();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalanceType#getOperationalCases <em>Operational Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operational Cases</em>' containment reference.
	 * @see #getOperationalCases()
	 * @generated
	 */
	void setOperationalCases(OperationalCasesType value);

	/**
	 * Returns the value of the '<em><b>Certification Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certification Cases</em>' containment reference.
	 * @see #setCertificationCases(CertificationCasesType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalanceType_CertificationCases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='certificationCases' namespace='##targetNamespace'"
	 * @generated
	 */
	CertificationCasesType getCertificationCases();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalanceType#getCertificationCases <em>Certification Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certification Cases</em>' containment reference.
	 * @see #getCertificationCases()
	 * @generated
	 */
	void setCertificationCases(CertificationCasesType value);

} // WeightAndBalanceType
