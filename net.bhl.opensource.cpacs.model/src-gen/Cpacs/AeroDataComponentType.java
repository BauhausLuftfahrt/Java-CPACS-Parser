/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aero Data Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AeroDataComponentType#getComponentUID <em>Component UID</em>}</li>
 *   <li>{@link Cpacs.AeroDataComponentType#getCoefficients <em>Coefficients</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAeroDataComponentType()
 * @model extendedMetaData="name='aeroDataComponentType' kind='elementOnly'"
 * @generated
 */
public interface AeroDataComponentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Component UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference to a component uID
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component UID</em>' containment reference.
	 * @see #setComponentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getAeroDataComponentType_ComponentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='componentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getComponentUID();

	/**
	 * Sets the value of the '{@link Cpacs.AeroDataComponentType#getComponentUID <em>Component UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getAeroDataComponentType_Coefficients()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	AeroCaseCoefficientsType getCoefficients();

	/**
	 * Sets the value of the '{@link Cpacs.AeroDataComponentType#getCoefficients <em>Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficients</em>' containment reference.
	 * @see #getCoefficients()
	 * @generated
	 */
	void setCoefficients(AeroCaseCoefficientsType value);

} // AeroDataComponentType
