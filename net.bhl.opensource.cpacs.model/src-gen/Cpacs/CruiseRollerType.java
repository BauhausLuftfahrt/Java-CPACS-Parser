/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cruise Roller Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CruiseRollerType#getPosition <em>Position</em>}</li>
 *   <li>{@link Cpacs.CruiseRollerType#getParentAttachment <em>Parent Attachment</em>}</li>
 *   <li>{@link Cpacs.CruiseRollerType#getControlSurfaceAttachment <em>Control Surface Attachment</em>}</li>
 *   <li>{@link Cpacs.CruiseRollerType#getBlockedDOF <em>Blocked DOF</em>}</li>
 *   <li>{@link Cpacs.CruiseRollerType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCruiseRollerType()
 * @model extendedMetaData="name='cruiseRollerType' kind='elementOnly'"
 * @generated
 */
public interface CruiseRollerType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the position of the mid point of
	 *                                 the roll of the cruise roller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(EtaXsiRelHeightPointType)
	 * @see Cpacs.CpacsPackage#getCruiseRollerType_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='position' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiRelHeightPointType getPosition();

	/**
	 * Sets the value of the '{@link Cpacs.CruiseRollerType#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(EtaXsiRelHeightPointType value);

	/**
	 * Returns the value of the '<em><b>Parent Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the attachment of the cruise
	 *                                 roller to the parent of the flap. This is the track on which the
	 *                                 roll rolls during retracted flap position
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Attachment</em>' containment reference.
	 * @see #setParentAttachment(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getCruiseRollerType_ParentAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parentAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getParentAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.CruiseRollerType#getParentAttachment <em>Parent Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Attachment</em>' containment reference.
	 * @see #getParentAttachment()
	 * @generated
	 */
	void setParentAttachment(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Control Surface Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the attachment of the cruise
	 *                                 roller to the flap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Surface Attachment</em>' containment reference.
	 * @see #setControlSurfaceAttachment(MaterialDefinitionType)
	 * @see Cpacs.CpacsPackage#getCruiseRollerType_ControlSurfaceAttachment()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlSurfaceAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialDefinitionType getControlSurfaceAttachment();

	/**
	 * Sets the value of the '{@link Cpacs.CruiseRollerType#getControlSurfaceAttachment <em>Control Surface Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surface Attachment</em>' containment reference.
	 * @see #getControlSurfaceAttachment()
	 * @generated
	 */
	void setControlSurfaceAttachment(MaterialDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Blocked DOF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Degree of freedom that is blocked by the
	 *                                 cruise roller if the flap is in retracted position. Positive =
	 *                                 cruise roller blocks bending in the direction of the upper skin
	 *                                 of the parent. Negative = cruise roller blocks bending in the
	 *                                 direction of the lower skin of the parent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blocked DOF</em>' containment reference.
	 * @see #setBlockedDOF(BlockedDOFType)
	 * @see Cpacs.CpacsPackage#getCruiseRollerType_BlockedDOF()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='blockedDOF' namespace='##targetNamespace'"
	 * @generated
	 */
	BlockedDOFType getBlockedDOF();

	/**
	 * Sets the value of the '{@link Cpacs.CruiseRollerType#getBlockedDOF <em>Blocked DOF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked DOF</em>' containment reference.
	 * @see #getBlockedDOF()
	 * @generated
	 */
	void setBlockedDOF(BlockedDOFType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCruiseRollerType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CruiseRollerType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CruiseRollerType
