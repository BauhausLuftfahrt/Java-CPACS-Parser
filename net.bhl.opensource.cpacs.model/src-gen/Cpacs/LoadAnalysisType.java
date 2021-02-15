/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadAnalysisType#getLoadCases <em>Load Cases</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadAnalysisType()
 * @model extendedMetaData="name='loadAnalysisType' kind='elementOnly'"
 * @generated
 */
public interface LoadAnalysisType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Load Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Cases</em>' containment reference.
	 * @see #setLoadCases(LoadCasesType)
	 * @see Cpacs.CpacsPackage#getLoadAnalysisType_LoadCases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='loadCases' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadCasesType getLoadCases();

	/**
	 * Sets the value of the '{@link Cpacs.LoadAnalysisType#getLoadCases <em>Load Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Cases</em>' containment reference.
	 * @see #getLoadCases()
	 * @generated
	 */
	void setLoadCases(LoadCasesType value);

} // LoadAnalysisType
