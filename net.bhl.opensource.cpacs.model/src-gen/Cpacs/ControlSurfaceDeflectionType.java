/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Deflection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceDeflectionType#getControlSurfaceUID <em>Control Surface UID</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceDeflectionType#getControlParameter <em>Control Parameter</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceDeflectionType()
 * @model extendedMetaData="name='controlSurfaceDeflectionType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceDeflectionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Surface UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a control surface
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Surface UID</em>' containment reference.
	 * @see #setControlSurfaceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceDeflectionType_ControlSurfaceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlSurfaceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlSurfaceUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceDeflectionType#getControlSurfaceUID <em>Control Surface UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surface UID</em>' containment reference.
	 * @see #getControlSurfaceUID()
	 * @generated
	 */
	void setControlSurfaceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control parameter of the control surface
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameter</em>' containment reference.
	 * @see #setControlParameter(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceDeflectionType_ControlParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getControlParameter();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceDeflectionType#getControlParameter <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameter</em>' containment reference.
	 * @see #getControlParameter()
	 * @generated
	 */
	void setControlParameter(DoubleBaseType value);

} // ControlSurfaceDeflectionType
