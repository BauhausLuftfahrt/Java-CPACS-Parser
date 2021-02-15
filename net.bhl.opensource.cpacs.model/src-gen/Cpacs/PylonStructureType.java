/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pylon Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PylonStructureType#getPylonBox <em>Pylon Box</em>}</li>
 *   <li>{@link Cpacs.PylonStructureType#getFrontPyramid <em>Front Pyramid</em>}</li>
 *   <li>{@link Cpacs.PylonStructureType#getStruts <em>Struts</em>}</li>
 *   <li>{@link Cpacs.PylonStructureType#getPins <em>Pins</em>}</li>
 *   <li>{@link Cpacs.PylonStructureType#getShackles <em>Shackles</em>}</li>
 *   <li>{@link Cpacs.PylonStructureType#getWingAttachments <em>Wing Attachments</em>}</li>
 *   <li>{@link Cpacs.PylonStructureType#getFuselageAttachments <em>Fuselage Attachments</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPylonStructureType()
 * @model extendedMetaData="name='pylonStructureType' kind='elementOnly'"
 * @generated
 */
public interface PylonStructureType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Pylon Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pylon Box</em>' containment reference.
	 * @see #setPylonBox(PylonBoxType)
	 * @see Cpacs.CpacsPackage#getPylonStructureType_PylonBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pylonBox' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonBoxType getPylonBox();

	/**
	 * Sets the value of the '{@link Cpacs.PylonStructureType#getPylonBox <em>Pylon Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pylon Box</em>' containment reference.
	 * @see #getPylonBox()
	 * @generated
	 */
	void setPylonBox(PylonBoxType value);

	/**
	 * Returns the value of the '<em><b>Front Pyramid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front Pyramid</em>' containment reference.
	 * @see #setFrontPyramid(PylonShellType)
	 * @see Cpacs.CpacsPackage#getPylonStructureType_FrontPyramid()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frontPyramid' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonShellType getFrontPyramid();

	/**
	 * Sets the value of the '{@link Cpacs.PylonStructureType#getFrontPyramid <em>Front Pyramid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Pyramid</em>' containment reference.
	 * @see #getFrontPyramid()
	 * @generated
	 */
	void setFrontPyramid(PylonShellType value);

	/**
	 * Returns the value of the '<em><b>Struts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struts</em>' containment reference.
	 * @see #setStruts(PylonStrutsType)
	 * @see Cpacs.CpacsPackage#getPylonStructureType_Struts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='struts' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonStrutsType getStruts();

	/**
	 * Sets the value of the '{@link Cpacs.PylonStructureType#getStruts <em>Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struts</em>' containment reference.
	 * @see #getStruts()
	 * @generated
	 */
	void setStruts(PylonStrutsType value);

	/**
	 * Returns the value of the '<em><b>Pins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pins</em>' containment reference.
	 * @see #setPins(PylonPinsType)
	 * @see Cpacs.CpacsPackage#getPylonStructureType_Pins()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pins' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonPinsType getPins();

	/**
	 * Sets the value of the '{@link Cpacs.PylonStructureType#getPins <em>Pins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pins</em>' containment reference.
	 * @see #getPins()
	 * @generated
	 */
	void setPins(PylonPinsType value);

	/**
	 * Returns the value of the '<em><b>Shackles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shackles</em>' containment reference.
	 * @see #setShackles(PylonShacklesType)
	 * @see Cpacs.CpacsPackage#getPylonStructureType_Shackles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shackles' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonShacklesType getShackles();

	/**
	 * Sets the value of the '{@link Cpacs.PylonStructureType#getShackles <em>Shackles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shackles</em>' containment reference.
	 * @see #getShackles()
	 * @generated
	 */
	void setShackles(PylonShacklesType value);

	/**
	 * Returns the value of the '<em><b>Wing Attachments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Attachments</em>' containment reference.
	 * @see #setWingAttachments(PylonAttachmentsType)
	 * @see Cpacs.CpacsPackage#getPylonStructureType_WingAttachments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wingAttachments' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonAttachmentsType getWingAttachments();

	/**
	 * Sets the value of the '{@link Cpacs.PylonStructureType#getWingAttachments <em>Wing Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Attachments</em>' containment reference.
	 * @see #getWingAttachments()
	 * @generated
	 */
	void setWingAttachments(PylonAttachmentsType value);

	/**
	 * Returns the value of the '<em><b>Fuselage Attachments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselage Attachments</em>' containment reference.
	 * @see #setFuselageAttachments(PylonAttachmentsType)
	 * @see Cpacs.CpacsPackage#getPylonStructureType_FuselageAttachments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuselageAttachments' namespace='##targetNamespace'"
	 * @generated
	 */
	PylonAttachmentsType getFuselageAttachments();

	/**
	 * Sets the value of the '{@link Cpacs.PylonStructureType#getFuselageAttachments <em>Fuselage Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselage Attachments</em>' containment reference.
	 * @see #getFuselageAttachments()
	 * @generated
	 */
	void setFuselageAttachments(PylonAttachmentsType value);

} // PylonStructureType
