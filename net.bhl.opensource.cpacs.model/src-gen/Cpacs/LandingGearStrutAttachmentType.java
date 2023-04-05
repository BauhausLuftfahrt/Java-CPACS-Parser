/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gear Strut Attachment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearStrutAttachmentType#getSparSegmentUID <em>Spar Segment UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearStrutAttachmentType#getRibDefinitionUID <em>Rib Definition UID</em>}</li>
 *   <li>{@link Cpacs.LandingGearStrutAttachmentType#getRibNumber <em>Rib Number</em>}</li>
 *   <li>{@link Cpacs.LandingGearStrutAttachmentType#getSupportBeam <em>Support Beam</em>}</li>
 *   <li>{@link Cpacs.LandingGearStrutAttachmentType#getStringerFramePositionUIDs <em>Stringer Frame Position UI Ds</em>}</li>
 *   <li>{@link Cpacs.LandingGearStrutAttachmentType#getStructuralMountUIDs <em>Structural Mount UI Ds</em>}</li>
 *   <li>{@link Cpacs.LandingGearStrutAttachmentType#getPositioning <em>Positioning</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearStrutAttachmentType()
 * @model extendedMetaData="name='landingGearStrutAttachmentType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearStrutAttachmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Spar Segment UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the second spar, where the landing gear is attached to. Only used, if the landing gear is attached between two spars.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spar Segment UID</em>' containment reference.
	 * @see #setSparSegmentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearStrutAttachmentType_SparSegmentUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sparSegmentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getSparSegmentUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearStrutAttachmentType#getSparSegmentUID <em>Spar Segment UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spar Segment UID</em>' containment reference.
	 * @see #getSparSegmentUID()
	 * @generated
	 */
	void setSparSegmentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Definition UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of a set of ribs (ribDefinition)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Definition UID</em>' containment reference.
	 * @see #setRibDefinitionUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearStrutAttachmentType_RibDefinitionUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribDefinitionUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRibDefinitionUID();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearStrutAttachmentType#getRibDefinitionUID <em>Rib Definition UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Definition UID</em>' containment reference.
	 * @see #getRibDefinitionUID()
	 * @generated
	 */
	void setRibDefinitionUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rib Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of the rib in the rib set (ribDefinition)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rib Number</em>' containment reference.
	 * @see #setRibNumber(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getLandingGearStrutAttachmentType_RibNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ribNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getRibNumber();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearStrutAttachmentType#getRibNumber <em>Rib Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rib Number</em>' containment reference.
	 * @see #getRibNumber()
	 * @generated
	 */
	void setRibNumber(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Support Beam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Beam</em>' containment reference.
	 * @see #setSupportBeam(SupportBeamType)
	 * @see Cpacs.CpacsPackage#getLandingGearStrutAttachmentType_SupportBeam()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportBeam' namespace='##targetNamespace'"
	 * @generated
	 */
	SupportBeamType getSupportBeam();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearStrutAttachmentType#getSupportBeam <em>Support Beam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support Beam</em>' containment reference.
	 * @see #getSupportBeam()
	 * @generated
	 */
	void setSupportBeam(SupportBeamType value);

	/**
	 * Returns the value of the '<em><b>Stringer Frame Position UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringer Frame Position UI Ds</em>' containment reference.
	 * @see #setStringerFramePositionUIDs(StringerFramePositionUIDsType)
	 * @see Cpacs.CpacsPackage#getLandingGearStrutAttachmentType_StringerFramePositionUIDs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stringerFramePositionUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	StringerFramePositionUIDsType getStringerFramePositionUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearStrutAttachmentType#getStringerFramePositionUIDs <em>Stringer Frame Position UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stringer Frame Position UI Ds</em>' containment reference.
	 * @see #getStringerFramePositionUIDs()
	 * @generated
	 */
	void setStringerFramePositionUIDs(StringerFramePositionUIDsType value);

	/**
	 * Returns the value of the '<em><b>Structural Mount UI Ds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the structural mount
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Mount UI Ds</em>' containment reference.
	 * @see #setStructuralMountUIDs(UIDSequenceType)
	 * @see Cpacs.CpacsPackage#getLandingGearStrutAttachmentType_StructuralMountUIDs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralMountUIDs' namespace='##targetNamespace'"
	 * @generated
	 */
	UIDSequenceType getStructuralMountUIDs();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearStrutAttachmentType#getStructuralMountUIDs <em>Structural Mount UI Ds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Mount UI Ds</em>' containment reference.
	 * @see #getStructuralMountUIDs()
	 * @generated
	 */
	void setStructuralMountUIDs(UIDSequenceType value);

	/**
	 * Returns the value of the '<em><b>Positioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positioning</em>' containment reference.
	 * @see #setPositioning(WingAttachmentPositioningType)
	 * @see Cpacs.CpacsPackage#getLandingGearStrutAttachmentType_Positioning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='positioning' namespace='##targetNamespace'"
	 * @generated
	 */
	WingAttachmentPositioningType getPositioning();

	/**
	 * Sets the value of the '{@link Cpacs.LandingGearStrutAttachmentType#getPositioning <em>Positioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positioning</em>' containment reference.
	 * @see #getPositioning()
	 * @generated
	 */
	void setPositioning(WingAttachmentPositioningType value);

} // LandingGearStrutAttachmentType
