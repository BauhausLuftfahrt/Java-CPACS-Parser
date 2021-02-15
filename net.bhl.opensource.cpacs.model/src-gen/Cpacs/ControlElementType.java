/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlElementType#getControlDeviceUID <em>Control Device UID</em>}</li>
 *   <li>{@link Cpacs.ControlElementType#getControlParameters <em>Control Parameters</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlElementType()
 * @model extendedMetaData="name='controlElementType' kind='elementOnly'"
 * @generated
 */
public interface ControlElementType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Device UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the control device, e.g. a control surface. It is not allowed to reference another control distributor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Device UID</em>' containment reference.
	 * @see #setControlDeviceUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getControlElementType_ControlDeviceUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlDeviceUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getControlDeviceUID();

	/**
	 * Sets the value of the '{@link Cpacs.ControlElementType#getControlDeviceUID <em>Control Device UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Device UID</em>' containment reference.
	 * @see #getControlDeviceUID()
	 * @generated
	 */
	void setControlDeviceUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Control Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vector of control device states resulting from the input commands. It must be of the same length as the inputCommands element. 
	 *                             The minimum and maximum values are defined according to the minimum and maximum values of the input commands.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Parameters</em>' containment reference.
	 * @see #setControlParameters(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getControlElementType_ControlParameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getControlParameters();

	/**
	 * Sets the value of the '{@link Cpacs.ControlElementType#getControlParameters <em>Control Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameters</em>' containment reference.
	 * @see #getControlParameters()
	 * @generated
	 */
	void setControlParameters(StringVectorBaseType value);

} // ControlElementType
