/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Actuator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrackActuatorType#getActuatorUID <em>Actuator UID</em>}</li>
 *   <li>{@link Cpacs.TrackActuatorType#getMaterial <em>Material</em>}</li>
 *   <li>{@link Cpacs.TrackActuatorType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrackActuatorType()
 * @model extendedMetaData="name='trackActuatorType' kind='elementOnly'"
 * @generated
 */
public interface TrackActuatorType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Actuator UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the uID of the actuator of the
	 *                                 track.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuator UID</em>' containment reference.
	 * @see #setActuatorUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getTrackActuatorType_ActuatorUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='actuatorUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getActuatorUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrackActuatorType#getActuatorUID <em>Actuator UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator UID</em>' containment reference.
	 * @see #getActuatorUID()
	 * @generated
	 */
	void setActuatorUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the material properties of the
	 *                                 actuator to track attachment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getTrackActuatorType_Material()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getMaterial();

	/**
	 * Sets the value of the '{@link Cpacs.TrackActuatorType#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getTrackActuatorType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrackActuatorType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // TrackActuatorType
