/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Surface Deflection Vector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlSurfaceDeflectionVectorType#getControlSurfaceUID <em>Control Surface UID</em>}</li>
 *   <li>{@link Cpacs.ControlSurfaceDeflectionVectorType#getControlParameters <em>Control Parameters</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlSurfaceDeflectionVectorType()
 * @model extendedMetaData="name='controlSurfaceDeflectionVectorType' kind='elementOnly'"
 * @generated
 */
public interface ControlSurfaceDeflectionVectorType extends ComplexBaseType {
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
	 * @see Cpacs.CpacsPackage#getControlSurfaceDeflectionVectorType_ControlSurfaceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlSurfaceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlSurfaceUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceDeflectionVectorType#getControlSurfaceUID <em>Control Surface UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surface UID</em>' containment reference.
	 * @see #getControlSurfaceUID()
	 * @generated
	 */
	void setControlSurfaceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control parameters of the control surface
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameters</em>' containment reference.
	 * @see #setControlParameters(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getControlSurfaceDeflectionVectorType_ControlParameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getControlParameters();

	/**
	 * Sets the value of the '{@link Cpacs.ControlSurfaceDeflectionVectorType#getControlParameters <em>Control Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameters</em>' containment reference.
	 * @see #getControlParameters()
	 * @generated
	 */
	void setControlParameters(StringVectorBaseType value);

} // ControlSurfaceDeflectionVectorType
