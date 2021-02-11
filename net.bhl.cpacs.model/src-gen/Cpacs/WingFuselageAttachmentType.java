/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wing Fuselage Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WingFuselageAttachmentType#getRib1 <em>Rib1</em>}</li>
 *   <li>{@link Cpacs.WingFuselageAttachmentType#getRib2 <em>Rib2</em>}</li>
 *   <li>{@link Cpacs.WingFuselageAttachmentType#getAttachmentPins <em>Attachment Pins</em>}</li>
 *   <li>{@link Cpacs.WingFuselageAttachmentType#getActuators <em>Actuators</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWingFuselageAttachmentType()
 * @model extendedMetaData="name='wingFuselageAttachmentType' kind='elementOnly'"
 * @generated
 */
public interface WingFuselageAttachmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rib1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of first (=inner) rib of the
	 *                                 fuselage attachment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib1</em>' containment reference.
	 * @see #setRib1(RibIdentificationType)
	 * @see Cpacs.CpacsPackage#getWingFuselageAttachmentType_Rib1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rib1' namespace='##targetNamespace'"
	 * @generated
	 */
	RibIdentificationType getRib1();

	/**
	 * Sets the value of the '{@link Cpacs.WingFuselageAttachmentType#getRib1 <em>Rib1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib1</em>' containment reference.
	 * @see #getRib1()
	 * @generated
	 */
	void setRib1(RibIdentificationType value);

	/**
	 * Returns the value of the '<em><b>Rib2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of the second (=outer) rib of the
	 *                                 fuselage attachment. Optional. Only to be used if attachment is
	 *                                 defined over two ribs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib2</em>' containment reference.
	 * @see #setRib2(RibIdentificationType)
	 * @see Cpacs.CpacsPackage#getWingFuselageAttachmentType_Rib2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rib2' namespace='##targetNamespace'"
	 * @generated
	 */
	RibIdentificationType getRib2();

	/**
	 * Sets the value of the '{@link Cpacs.WingFuselageAttachmentType#getRib2 <em>Rib2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib2</em>' containment reference.
	 * @see #getRib2()
	 * @generated
	 */
	void setRib2(RibIdentificationType value);

	/**
	 * Returns the value of the '<em><b>Attachment Pins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of position, orientation, materials
	 *                                 and blocked DOFs of attachment pins.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attachment Pins</em>' containment reference.
	 * @see #setAttachmentPins(AttachmentPinsType)
	 * @see Cpacs.CpacsPackage#getWingFuselageAttachmentType_AttachmentPins()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attachmentPins' namespace='##targetNamespace'"
	 * @generated
	 */
	AttachmentPinsType getAttachmentPins();

	/**
	 * Sets the value of the '{@link Cpacs.WingFuselageAttachmentType#getAttachmentPins <em>Attachment Pins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment Pins</em>' containment reference.
	 * @see #getAttachmentPins()
	 * @generated
	 */
	void setAttachmentPins(AttachmentPinsType value);

	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of actuators (e.g. trim actuator of
	 *                                 an HTP) of the attachment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuators</em>' containment reference.
	 * @see #setActuators(ActuatorsFuselageWingType)
	 * @see Cpacs.CpacsPackage#getWingFuselageAttachmentType_Actuators()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actuators' namespace='##targetNamespace'"
	 * @generated
	 */
	ActuatorsFuselageWingType getActuators();

	/**
	 * Sets the value of the '{@link Cpacs.WingFuselageAttachmentType#getActuators <em>Actuators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuators</em>' containment reference.
	 * @see #getActuators()
	 * @generated
	 */
	void setActuators(ActuatorsFuselageWingType value);

} // WingFuselageAttachmentType
