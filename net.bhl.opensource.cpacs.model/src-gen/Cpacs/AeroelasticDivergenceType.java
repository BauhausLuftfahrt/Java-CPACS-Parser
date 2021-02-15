/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aeroelastic Divergence Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroelasticDivergenceType#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroelasticDivergenceType()
 * @model extendedMetaData="name='aeroelasticDivergenceType' kind='elementOnly'"
 * @generated
 */
public interface AeroelasticDivergenceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference.
	 * @see #setCases(DivergenceCasesType)
	 * @see Cpacs.CpacsPackage#getAeroelasticDivergenceType_Cases()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cases' namespace='##targetNamespace'"
	 * @generated
	 */
	DivergenceCasesType getCases();

	/**
	 * Sets the value of the '{@link Cpacs.AeroelasticDivergenceType#getCases <em>Cases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cases</em>' containment reference.
	 * @see #getCases()
	 * @generated
	 */
	void setCases(DivergenceCasesType value);

} // AeroelasticDivergenceType
