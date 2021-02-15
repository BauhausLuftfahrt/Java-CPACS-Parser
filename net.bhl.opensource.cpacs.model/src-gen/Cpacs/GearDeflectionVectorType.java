/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gear Deflection Vector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GearDeflectionVectorType#getGearUID <em>Gear UID</em>}</li>
 *   <li>{@link Cpacs.GearDeflectionVectorType#getControlParameters <em>Control Parameters</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGearDeflectionVectorType()
 * @model extendedMetaData="name='gearDeflectionVectorType' kind='elementOnly'"
 * @generated
 */
public interface GearDeflectionVectorType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Gear UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a gear
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gear UID</em>' containment reference.
	 * @see #setGearUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getGearDeflectionVectorType_GearUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gearUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getGearUID();

	/**
	 * Sets the value of the '{@link Cpacs.GearDeflectionVectorType#getGearUID <em>Gear UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gear UID</em>' containment reference.
	 * @see #getGearUID()
	 * @generated
	 */
	void setGearUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control parameters of the gear
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameters</em>' containment reference.
	 * @see #setControlParameters(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getGearDeflectionVectorType_ControlParameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getControlParameters();

	/**
	 * Sets the value of the '{@link Cpacs.GearDeflectionVectorType#getControlParameters <em>Control Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameters</em>' containment reference.
	 * @see #getControlParameters()
	 * @generated
	 */
	void setControlParameters(StringVectorBaseType value);

} // GearDeflectionVectorType
