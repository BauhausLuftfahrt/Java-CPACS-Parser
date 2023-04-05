/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pressure Bulkhead Assembly Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PressureBulkheadAssemblyPositionType#getFrameUID <em>Frame UID</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadAssemblyPositionType#getPressureBulkheadElementUID <em>Pressure Bulkhead Element UID</em>}</li>
 *   <li>{@link Cpacs.PressureBulkheadAssemblyPositionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPressureBulkheadAssemblyPositionType()
 * @model extendedMetaData="name='pressureBulkheadAssemblyPositionType' kind='elementOnly'"
 * @generated
 */
public interface PressureBulkheadAssemblyPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Frame to which bulkhead is attached to
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frame UID</em>' containment reference.
	 * @see #setFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadAssemblyPositionType_FrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='frameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadAssemblyPositionType#getFrameUID <em>Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame UID</em>' containment reference.
	 * @see #getFrameUID()
	 * @generated
	 */
	void setFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Pressure Bulkhead Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of bulkhead element description
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pressure Bulkhead Element UID</em>' containment reference.
	 * @see #setPressureBulkheadElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadAssemblyPositionType_PressureBulkheadElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pressureBulkheadElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getPressureBulkheadElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadAssemblyPositionType#getPressureBulkheadElementUID <em>Pressure Bulkhead Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Bulkhead Element UID</em>' containment reference.
	 * @see #getPressureBulkheadElementUID()
	 * @generated
	 */
	void setPressureBulkheadElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getPressureBulkheadAssemblyPositionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.PressureBulkheadAssemblyPositionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // PressureBulkheadAssemblyPositionType
