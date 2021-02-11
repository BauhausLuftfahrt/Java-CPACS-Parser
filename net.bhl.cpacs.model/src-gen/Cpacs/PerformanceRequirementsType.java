/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Requirements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PerformanceRequirementsType#getRequiredPerformanceCases <em>Required Performance Cases</em>}</li>
 *   <li>{@link Cpacs.PerformanceRequirementsType#getOptionalPerformanceCases <em>Optional Performance Cases</em>}</li>
 *   <li>{@link Cpacs.PerformanceRequirementsType#getPerformanceCases <em>Performance Cases</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPerformanceRequirementsType()
 * @model extendedMetaData="name='performanceRequirementsType' kind='elementOnly'"
 * @generated
 */
public interface PerformanceRequirementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Required Performance Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Performance Cases</em>' containment reference.
	 * @see #setRequiredPerformanceCases(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getPerformanceRequirementsType_RequiredPerformanceCases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requiredPerformanceCases' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getRequiredPerformanceCases();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceRequirementsType#getRequiredPerformanceCases <em>Required Performance Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Performance Cases</em>' containment reference.
	 * @see #getRequiredPerformanceCases()
	 * @generated
	 */
	void setRequiredPerformanceCases(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Optional Performance Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Performance Cases</em>' containment reference.
	 * @see #setOptionalPerformanceCases(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getPerformanceRequirementsType_OptionalPerformanceCases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='optionalPerformanceCases' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getOptionalPerformanceCases();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceRequirementsType#getOptionalPerformanceCases <em>Optional Performance Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional Performance Cases</em>' containment reference.
	 * @see #getOptionalPerformanceCases()
	 * @generated
	 */
	void setOptionalPerformanceCases(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Performance Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Cases</em>' containment reference.
	 * @see #setPerformanceCases(PerformanceCasesType)
	 * @see Cpacs.CpacsPackage#getPerformanceRequirementsType_PerformanceCases()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='performanceCases' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceCasesType getPerformanceCases();

	/**
	 * Sets the value of the '{@link Cpacs.PerformanceRequirementsType#getPerformanceCases <em>Performance Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Cases</em>' containment reference.
	 * @see #getPerformanceCases()
	 * @generated
	 */
	void setPerformanceCases(PerformanceCasesType value);

} // PerformanceRequirementsType
