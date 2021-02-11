/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator Parent Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ActuatorParentAttachmentType#getParentXsi <em>Parent Xsi</em>}</li>
 *   <li>{@link Cpacs.ActuatorParentAttachmentType#getParentHeight <em>Parent Height</em>}</li>
 *   <li>{@link Cpacs.ActuatorParentAttachmentType#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getActuatorParentAttachmentType()
 * @model extendedMetaData="name='actuatorParentAttachmentType' kind='elementOnly'"
 * @generated
 */
public interface ActuatorParentAttachmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Parent Xsi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the relative chordwise position
	 *                                 of the parent actuator attachment. Xsi refers to the parents
	 *                                 dimensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Xsi</em>' containment reference.
	 * @see #setParentXsi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getActuatorParentAttachmentType_ParentXsi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parentXsi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getParentXsi();

	/**
	 * Sets the value of the '{@link Cpacs.ActuatorParentAttachmentType#getParentXsi <em>Parent Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Xsi</em>' containment reference.
	 * @see #getParentXsi()
	 * @generated
	 */
	void setParentXsi(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Parent Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the relative height position of
	 *                                 the parent actuator attachment. relHeight refers to the parents
	 *                                 dimensions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Height</em>' containment reference.
	 * @see #setParentHeight(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getActuatorParentAttachmentType_ParentHeight()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parentHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getParentHeight();

	/**
	 * Sets the value of the '{@link Cpacs.ActuatorParentAttachmentType#getParentHeight <em>Parent Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Height</em>' containment reference.
	 * @see #getParentHeight()
	 * @generated
	 */
	void setParentHeight(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the material properties of the
	 *                                 actuator attachment at the parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getActuatorParentAttachmentType_Material()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getMaterial();

	/**
	 * Sets the value of the '{@link Cpacs.ActuatorParentAttachmentType#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(MaterialDefinitionType value);

} // ActuatorParentAttachmentType
