/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coefficients Breakdown Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CoefficientsBreakdownComponentType#getComponentUID <em>Component UID</em>}</li>
 *   <li>{@link Cpacs.CoefficientsBreakdownComponentType#getCoefficients <em>Coefficients</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownComponentType()
 * @model extendedMetaData="name='coefficientsBreakdownComponentType' kind='elementOnly'"
 * @generated
 */
public interface CoefficientsBreakdownComponentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Component UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference to a component
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component UID</em>' containment reference.
	 * @see #setComponentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownComponentType_ComponentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getComponentUID();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownComponentType#getComponentUID <em>Component UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component UID</em>' containment reference.
	 * @see #getComponentUID()
	 * @generated
	 */
	void setComponentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficients</em>' containment reference.
	 * @see #setCoefficients(AeroCaseCoefficientsType)
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownComponentType_Coefficients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroCaseCoefficientsType getCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsBreakdownComponentType#getCoefficients <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficients</em>' containment reference.
	 * @see #getCoefficients()
	 * @generated
	 */
	void setCoefficients(AeroCaseCoefficientsType value);

} // CoefficientsBreakdownComponentType
