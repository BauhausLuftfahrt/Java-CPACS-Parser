/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Law Mode Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlLawModeType#getControlFunctions <em>Control Functions</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlLawModeType()
 * @model extendedMetaData="name='controlLawModeType' kind='elementOnly'"
 * @generated
 */
public interface ControlLawModeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Functions</em>' containment reference.
	 * @see #setControlFunctions(ControlFunctionsType)
	 * @see Cpacs.CpacsPackage#getControlLawModeType_ControlFunctions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlFunctions' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlFunctionsType getControlFunctions();

	/**
	 * Sets the value of the '{@link Cpacs.ControlLawModeType#getControlFunctions <em>Control Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Functions</em>' containment reference.
	 * @see #getControlFunctions()
	 * @generated
	 */
	void setControlFunctions(ControlFunctionsType value);

} // ControlLawModeType
