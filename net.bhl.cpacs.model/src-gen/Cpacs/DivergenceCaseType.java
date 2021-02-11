/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Divergence Case Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DivergenceCaseType#getMa <em>Ma</em>}</li>
 *   <li>{@link Cpacs.DivergenceCaseType#getQDiv <em>QDiv</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDivergenceCaseType()
 * @model extendedMetaData="name='divergenceCaseType' kind='elementOnly'"
 * @generated
 */
public interface DivergenceCaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Ma</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mach number of divergence case
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ma</em>' containment reference.
	 * @see #setMa(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDivergenceCaseType_Ma()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ma' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMa();

	/**
	 * Sets the value of the '{@link Cpacs.DivergenceCaseType#getMa <em>Ma</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ma</em>' containment reference.
	 * @see #getMa()
	 * @generated
	 */
	void setMa(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>QDiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Divergence stagnation pressure
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>QDiv</em>' containment reference.
	 * @see #setQDiv(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDivergenceCaseType_QDiv()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='qDiv' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getQDiv();

	/**
	 * Sets the value of the '{@link Cpacs.DivergenceCaseType#getQDiv <em>QDiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QDiv</em>' containment reference.
	 * @see #getQDiv()
	 * @generated
	 */
	void setQDiv(DoubleBaseType value);

} // DivergenceCaseType
