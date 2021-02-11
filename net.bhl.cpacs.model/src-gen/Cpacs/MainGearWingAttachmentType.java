/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Gear Wing Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MainGearWingAttachmentType#getFirstSparUID <em>First Spar UID</em>}</li>
 *   <li>{@link Cpacs.MainGearWingAttachmentType#getPositioning <em>Positioning</em>}</li>
 *   <li>{@link Cpacs.MainGearWingAttachmentType#getSecondSparUID <em>Second Spar UID</em>}</li>
 *   <li>{@link Cpacs.MainGearWingAttachmentType#getSupportBeam <em>Support Beam</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMainGearWingAttachmentType()
 * @model extendedMetaData="name='mainGearWingAttachmentType' kind='elementOnly'"
 * @generated
 */
public interface MainGearWingAttachmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>First Spar UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the first spar, where the landing gear
	 *                                 is attached to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Spar UID</em>' containment reference.
	 * @see #setFirstSparUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMainGearWingAttachmentType_FirstSparUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='firstSparUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFirstSparUID();

	/**
	 * Sets the value of the '{@link Cpacs.MainGearWingAttachmentType#getFirstSparUID <em>First Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Spar UID</em>' containment reference.
	 * @see #getFirstSparUID()
	 * @generated
	 */
	void setFirstSparUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Positioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positioning</em>' containment reference.
	 * @see #setPositioning(EtaXsiRelHeightPointType)
	 * @see Cpacs.CpacsPackage#getMainGearWingAttachmentType_Positioning()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positioning' namespace='##targetNamespace'"
	 * @generated
	 */
	EtaXsiRelHeightPointType getPositioning();

	/**
	 * Sets the value of the '{@link Cpacs.MainGearWingAttachmentType#getPositioning <em>Positioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positioning</em>' containment reference.
	 * @see #getPositioning()
	 * @generated
	 */
	void setPositioning(EtaXsiRelHeightPointType value);

	/**
	 * Returns the value of the '<em><b>Second Spar UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the second spar, where the landing
	 *                                     gear is attached to. Only used, if the landing gear is attached
	 *                                     between two spars.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second Spar UID</em>' containment reference.
	 * @see #setSecondSparUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getMainGearWingAttachmentType_SecondSparUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='secondSparUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSecondSparUID();

	/**
	 * Sets the value of the '{@link Cpacs.MainGearWingAttachmentType#getSecondSparUID <em>Second Spar UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Spar UID</em>' containment reference.
	 * @see #getSecondSparUID()
	 * @generated
	 */
	void setSecondSparUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Support Beam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Beam</em>' containment reference.
	 * @see #setSupportBeam(MainGearSupportBeamType)
	 * @see Cpacs.CpacsPackage#getMainGearWingAttachmentType_SupportBeam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportBeam' namespace='##targetNamespace'"
	 * @generated
	 */
	MainGearSupportBeamType getSupportBeam();

	/**
	 * Sets the value of the '{@link Cpacs.MainGearWingAttachmentType#getSupportBeam <em>Support Beam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Beam</em>' containment reference.
	 * @see #getSupportBeam()
	 * @generated
	 */
	void setSupportBeam(MainGearSupportBeamType value);

} // MainGearWingAttachmentType
