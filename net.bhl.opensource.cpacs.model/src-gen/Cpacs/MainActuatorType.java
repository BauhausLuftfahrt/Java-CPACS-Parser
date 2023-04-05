/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Actuator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MainActuatorType#getActuatorUID <em>Actuator UID</em>}</li>
 *   <li>{@link Cpacs.MainActuatorType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMainActuatorType()
 * @model extendedMetaData="name='mainActuatorType' kind='elementOnly'"
 * @generated
 */
public interface MainActuatorType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Actuator UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the main actuator uID of the
	 *                                 landing gear
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuator UID</em>' containment reference.
	 * @see #setActuatorUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMainActuatorType_ActuatorUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actuatorUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getActuatorUID();

	/**
	 * Sets the value of the '{@link Cpacs.MainActuatorType#getActuatorUID <em>Actuator UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator UID</em>' containment reference.
	 * @see #getActuatorUID()
	 * @generated
	 */
	void setActuatorUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getMainActuatorType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.MainActuatorType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // MainActuatorType
