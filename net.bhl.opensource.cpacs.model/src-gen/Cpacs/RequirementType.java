/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RequirementType#getRequired <em>Required</em>}</li>
 *   <li>{@link Cpacs.RequirementType#getActual <em>Actual</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRequirementType()
 * @model extendedMetaData="name='requirementType' kind='elementOnly'"
 * @generated
 */
public interface RequirementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRequirementType_Required()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='required' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRequired();

	/**
	 * Sets the value of the '{@link Cpacs.RequirementType#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual</em>' containment reference.
	 * @see #setActual(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRequirementType_Actual()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actual' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getActual();

	/**
	 * Sets the value of the '{@link Cpacs.RequirementType#getActual <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' containment reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(DoubleBaseType value);

} // RequirementType
