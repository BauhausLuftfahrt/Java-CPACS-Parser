/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Pin Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.AttachmentPinType#getRelPosition <em>Rel Position</em>}</li>
 *   <li>{@link Cpacs.AttachmentPinType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link Cpacs.AttachmentPinType#getBlockedDOF <em>Blocked DOF</em>}</li>
 *   <li>{@link Cpacs.AttachmentPinType#getBolt <em>Bolt</em>}</li>
 *   <li>{@link Cpacs.AttachmentPinType#getAttachmentStructure <em>Attachment Structure</em>}</li>
 *   <li>{@link Cpacs.AttachmentPinType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getAttachmentPinType()
 * @model extendedMetaData="name='attachmentPinType' kind='elementOnly'"
 * @generated
 */
public interface AttachmentPinType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel Position</em>' containment reference.
	 * @see #setRelPosition(EtaXsiRelHeightPointType)
	 * @see Cpacs.CpacsPackage#getAttachmentPinType_RelPosition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiRelHeightPointType getRelPosition();

	/**
	 * Sets the value of the '{@link Cpacs.AttachmentPinType#getRelPosition <em>Rel Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Position</em>' containment reference.
	 * @see #getRelPosition()
	 * @generated
	 */
	void setRelPosition(EtaXsiRelHeightPointType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(PointYZType)
	 * @see Cpacs.CpacsPackage#getAttachmentPinType_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointYZType getOrientation();

	/**
	 * Sets the value of the '{@link Cpacs.AttachmentPinType#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(PointYZType value);

	/**
	 * Returns the value of the '<em><b>Blocked DOF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition which translation degrees of
	 *                                 freedom are blocked. Default x=0 (free); y=1 (blocked); z=1
	 *                                 (blocked).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blocked DOF</em>' containment reference.
	 * @see #setBlockedDOF(PointXYZType)
	 * @see Cpacs.CpacsPackage#getAttachmentPinType_BlockedDOF()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='blockedDOF' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getBlockedDOF();

	/**
	 * Sets the value of the '{@link Cpacs.AttachmentPinType#getBlockedDOF <em>Blocked DOF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked DOF</em>' containment reference.
	 * @see #getBlockedDOF()
	 * @generated
	 */
	void setBlockedDOF(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Bolt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bolt</em>' containment reference.
	 * @see #setBolt(StrutType)
	 * @see Cpacs.CpacsPackage#getAttachmentPinType_Bolt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bolt' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutType getBolt();

	/**
	 * Sets the value of the '{@link Cpacs.AttachmentPinType#getBolt <em>Bolt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bolt</em>' containment reference.
	 * @see #getBolt()
	 * @generated
	 */
	void setBolt(StrutType value);

	/**
	 * Returns the value of the '<em><b>Attachment Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment Structure</em>' containment reference.
	 * @see #setAttachmentStructure(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getAttachmentPinType_AttachmentStructure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attachmentStructure' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getAttachmentStructure();

	/**
	 * Sets the value of the '{@link Cpacs.AttachmentPinType#getAttachmentStructure <em>Attachment Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment Structure</em>' containment reference.
	 * @see #getAttachmentStructure()
	 * @generated
	 */
	void setAttachmentStructure(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getAttachmentPinType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.AttachmentPinType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // AttachmentPinType
