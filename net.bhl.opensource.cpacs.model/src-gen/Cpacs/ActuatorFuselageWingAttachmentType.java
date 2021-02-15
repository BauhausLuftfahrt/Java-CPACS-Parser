/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Fuselage Wing Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ActuatorFuselageWingAttachmentType#getRefPoint <em>Ref Point</em>}</li>
 *   <li>{@link Cpacs.ActuatorFuselageWingAttachmentType#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getActuatorFuselageWingAttachmentType()
 * @model extendedMetaData="name='actuatorFuselageWingAttachmentType' kind='elementOnly'"
 * @generated
 */
public interface ActuatorFuselageWingAttachmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Ref Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Point</em>' containment reference.
	 * @see #setRefPoint(EtaXsiRelHeightPointType)
	 * @see Cpacs.CpacsPackage#getActuatorFuselageWingAttachmentType_RefPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='refPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiRelHeightPointType getRefPoint();

	/**
	 * Sets the value of the '{@link Cpacs.ActuatorFuselageWingAttachmentType#getRefPoint <em>Ref Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Point</em>' containment reference.
	 * @see #getRefPoint()
	 * @generated
	 */
	void setRefPoint(EtaXsiRelHeightPointType value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getActuatorFuselageWingAttachmentType_Material()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getMaterial();

	/**
	 * Sets the value of the '{@link Cpacs.ActuatorFuselageWingAttachmentType#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(MaterialDefinitionType value);

} // ActuatorFuselageWingAttachmentType
