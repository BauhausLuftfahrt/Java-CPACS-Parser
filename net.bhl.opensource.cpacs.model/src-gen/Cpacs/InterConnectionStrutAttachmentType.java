/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Connection Strut Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.InterConnectionStrutAttachmentType#getPosition <em>Position</em>}</li>
 *   <li>{@link Cpacs.InterConnectionStrutAttachmentType#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getInterConnectionStrutAttachmentType()
 * @model extendedMetaData="name='interConnectionStrutAttachmentType' kind='elementOnly'"
 * @generated
 */
public interface InterConnectionStrutAttachmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the position of the attachment
	 *                                 joint in relative coordinates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(EtaXsiRelHeightPointType)
	 * @see Cpacs.CpacsPackage#getInterConnectionStrutAttachmentType_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiRelHeightPointType getPosition();

	/**
	 * Sets the value of the '{@link Cpacs.InterConnectionStrutAttachmentType#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(EtaXsiRelHeightPointType value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Material settings of the attachment.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference.
	 * @see #setMaterial(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getInterConnectionStrutAttachmentType_Material()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getMaterial();

	/**
	 * Sets the value of the '{@link Cpacs.InterConnectionStrutAttachmentType#getMaterial <em>Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material</em>' containment reference.
	 * @see #getMaterial()
	 * @generated
	 */
	void setMaterial(MaterialDefinitionType value);

} // InterConnectionStrutAttachmentType
