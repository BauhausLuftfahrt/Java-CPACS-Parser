/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pylon Pin Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PylonPinType#getFirstAttachmentUID <em>First Attachment UID</em>}</li>
 *   <li>{@link Cpacs.PylonPinType#getSecondAttachmentUID <em>Second Attachment UID</em>}</li>
 *   <li>{@link Cpacs.PylonPinType#getRelPosition <em>Rel Position</em>}</li>
 *   <li>{@link Cpacs.PylonPinType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link Cpacs.PylonPinType#getBlockedDOF <em>Blocked DOF</em>}</li>
 *   <li>{@link Cpacs.PylonPinType#getBolt <em>Bolt</em>}</li>
 *   <li>{@link Cpacs.PylonPinType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPylonPinType()
 * @model extendedMetaData="name='pylonPinType' kind='elementOnly'"
 * @generated
 */
public interface PylonPinType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>First Attachment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * First element (parentAttachmentUID, engineUID
	 *                                 or uID of a pylon structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Attachment UID</em>' containment reference.
	 * @see #setFirstAttachmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPylonPinType_FirstAttachmentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='firstAttachmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFirstAttachmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.PylonPinType#getFirstAttachmentUID <em>First Attachment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Attachment UID</em>' containment reference.
	 * @see #getFirstAttachmentUID()
	 * @generated
	 */
	void setFirstAttachmentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Second Attachment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Second element (parentAttachmentUID, engineUID
	 *                                 or uID of a pylon structure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second Attachment UID</em>' containment reference.
	 * @see #setSecondAttachmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getPylonPinType_SecondAttachmentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='secondAttachmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSecondAttachmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.PylonPinType#getSecondAttachmentUID <em>Second Attachment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Attachment UID</em>' containment reference.
	 * @see #getSecondAttachmentUID()
	 * @generated
	 */
	void setSecondAttachmentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rel Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Position of the pylon pin related to the pylon
	 *                                 coordinate system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Position</em>' containment reference.
	 * @see #setRelPosition(PointXYZType)
	 * @see Cpacs.CpacsPackage#getPylonPinType_RelPosition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getRelPosition();

	/**
	 * Sets the value of the '{@link Cpacs.PylonPinType#getRelPosition <em>Rel Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Position</em>' containment reference.
	 * @see #getRelPosition()
	 * @generated
	 */
	void setRelPosition(PointXYZType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(PointYZType)
	 * @see Cpacs.CpacsPackage#getPylonPinType_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	PointYZType getOrientation();

	/**
	 * Sets the value of the '{@link Cpacs.PylonPinType#getOrientation <em>Orientation</em>}' containment reference.
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
	 * Blocked DOFs. Referes to the rotated
	 *                                 coordinate system that is defined in 'orientation'.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blocked DOF</em>' containment reference.
	 * @see #setBlockedDOF(PointXYZType)
	 * @see Cpacs.CpacsPackage#getPylonPinType_BlockedDOF()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='blockedDOF' namespace='##targetNamespace'"
	 * @generated
	 */
	PointXYZType getBlockedDOF();

	/**
	 * Sets the value of the '{@link Cpacs.PylonPinType#getBlockedDOF <em>Blocked DOF</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getPylonPinType_Bolt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bolt' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutType getBolt();

	/**
	 * Sets the value of the '{@link Cpacs.PylonPinType#getBolt <em>Bolt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bolt</em>' containment reference.
	 * @see #getBolt()
	 * @generated
	 */
	void setBolt(StrutType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the pin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getPylonPinType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.PylonPinType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // PylonPinType
