/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Liner Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LinerType#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.LinerType#getIntakeLength <em>Intake Length</em>}</li>
 *   <li>{@link Cpacs.LinerType#getBypassLength <em>Bypass Length</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLinerType()
 * @model extendedMetaData="name='linerType' kind='elementOnly'"
 * @generated
 */
public interface LinerType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of liner
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeType1)
	 * @see Cpacs.CpacsPackage#getLinerType_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType1 getType();

	/**
	 * Sets the value of the '{@link Cpacs.LinerType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType1 value);

	/**
	 * Returns the value of the '<em><b>Intake Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * % of fan diameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intake Length</em>' containment reference.
	 * @see #setIntakeLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLinerType_IntakeLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intakeLength' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getIntakeLength();

	/**
	 * Sets the value of the '{@link Cpacs.LinerType#getIntakeLength <em>Intake Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intake Length</em>' containment reference.
	 * @see #getIntakeLength()
	 * @generated
	 */
	void setIntakeLength(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Bypass Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * % of fan diameter
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bypass Length</em>' containment reference.
	 * @see #setBypassLength(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLinerType_BypassLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bypassLength' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getBypassLength();

	/**
	 * Sets the value of the '{@link Cpacs.LinerType#getBypassLength <em>Bypass Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bypass Length</em>' containment reference.
	 * @see #getBypassLength()
	 * @generated
	 */
	void setBypassLength(DoubleBaseType value);

} // LinerType
