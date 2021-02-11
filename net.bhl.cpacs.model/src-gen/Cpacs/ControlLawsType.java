/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Laws Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlLawsType#getManualModes <em>Manual Modes</em>}</li>
 *   <li>{@link Cpacs.ControlLawsType#getAutomaticModes <em>Automatic Modes</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlLawsType()
 * @model extendedMetaData="name='controlLawsType' kind='elementOnly'"
 * @generated
 */
public interface ControlLawsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Manual Modes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Modes</em>' containment reference.
	 * @see #setManualModes(ControlLawModesType)
	 * @see Cpacs.CpacsPackage#getControlLawsType_ManualModes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='manualModes' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlLawModesType getManualModes();

	/**
	 * Sets the value of the '{@link Cpacs.ControlLawsType#getManualModes <em>Manual Modes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Modes</em>' containment reference.
	 * @see #getManualModes()
	 * @generated
	 */
	void setManualModes(ControlLawModesType value);

	/**
	 * Returns the value of the '<em><b>Automatic Modes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Modes</em>' containment reference.
	 * @see #setAutomaticModes(ControlLawModesType)
	 * @see Cpacs.CpacsPackage#getControlLawsType_AutomaticModes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='automaticModes' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlLawModesType getAutomaticModes();

	/**
	 * Sets the value of the '{@link Cpacs.ControlLawsType#getAutomaticModes <em>Automatic Modes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Modes</em>' containment reference.
	 * @see #getAutomaticModes()
	 * @generated
	 */
	void setAutomaticModes(ControlLawModesType value);

} // ControlLawsType
