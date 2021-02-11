/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlInputType#getCockpitControlUID <em>Cockpit Control UID</em>}</li>
 *   <li>{@link Cpacs.ControlInputType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlInputType()
 * @model extendedMetaData="name='controlInputType' kind='elementOnly'"
 * @generated
 */
public interface ControlInputType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cockpit Control UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to to a cockpit control
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cockpit Control UID</em>' containment reference.
	 * @see #setCockpitControlUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getControlInputType_CockpitControlUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cockpitControlUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getCockpitControlUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlInputType#getCockpitControlUID <em>Cockpit Control UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cockpit Control UID</em>' containment reference.
	 * @see #getCockpitControlUID()
	 * @generated
	 */
	void setCockpitControlUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control input value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getControlInputType_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getValue();

	/**
	 * Sets the value of the '{@link Cpacs.ControlInputType#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(StringVectorBaseType value);

} // ControlInputType
