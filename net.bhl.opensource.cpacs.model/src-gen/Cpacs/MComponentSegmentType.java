/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MComponent Segment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MComponentSegmentType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MComponentSegmentType#getMPylonAttachments <em>MPylon Attachments</em>}</li>
 *   <li>{@link Cpacs.MComponentSegmentType#getMLandingGearSupports <em>MLanding Gear Supports</em>}</li>
 *   <li>{@link Cpacs.MComponentSegmentType#getMMiscellaneous <em>MMiscellaneous</em>}</li>
 *   <li>{@link Cpacs.MComponentSegmentType#getMWingBox <em>MWing Box</em>}</li>
 *   <li>{@link Cpacs.MComponentSegmentType#getMMoveables <em>MMoveables</em>}</li>
 *   <li>{@link Cpacs.MComponentSegmentType#getMFixedLeadingEdges <em>MFixed Leading Edges</em>}</li>
 *   <li>{@link Cpacs.MComponentSegmentType#getMFixedTrailingEdges <em>MFixed Trailing Edges</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMComponentSegmentType()
 * @model extendedMetaData="name='mComponentSegmentType' kind='elementOnly'"
 * @generated
 */
public interface MComponentSegmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMComponentSegmentType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MComponentSegmentType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MPylon Attachments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPylon Attachments</em>' containment reference.
	 * @see #setMPylonAttachments(MPylonAttachmentsType)
	 * @see Cpacs.CpacsPackage#getMComponentSegmentType_MPylonAttachments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mPylonAttachments' namespace='##targetNamespace'"
	 * @generated
	 */
	MPylonAttachmentsType getMPylonAttachments();

	/**
	 * Sets the value of the '{@link Cpacs.MComponentSegmentType#getMPylonAttachments <em>MPylon Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPylon Attachments</em>' containment reference.
	 * @see #getMPylonAttachments()
	 * @generated
	 */
	void setMPylonAttachments(MPylonAttachmentsType value);

	/**
	 * Returns the value of the '<em><b>MLanding Gear Supports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MLanding Gear Supports</em>' containment reference.
	 * @see #setMLandingGearSupports(MLandingGearSupportsType)
	 * @see Cpacs.CpacsPackage#getMComponentSegmentType_MLandingGearSupports()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mLandingGearSupports' namespace='##targetNamespace'"
	 * @generated
	 */
	MLandingGearSupportsType getMLandingGearSupports();

	/**
	 * Sets the value of the '{@link Cpacs.MComponentSegmentType#getMLandingGearSupports <em>MLanding Gear Supports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MLanding Gear Supports</em>' containment reference.
	 * @see #getMLandingGearSupports()
	 * @generated
	 */
	void setMLandingGearSupports(MLandingGearSupportsType value);

	/**
	 * Returns the value of the '<em><b>MMiscellaneous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMiscellaneous</em>' containment reference.
	 * @see #setMMiscellaneous(SingleGenericMassType)
	 * @see Cpacs.CpacsPackage#getMComponentSegmentType_MMiscellaneous()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mMiscellaneous' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleGenericMassType getMMiscellaneous();

	/**
	 * Sets the value of the '{@link Cpacs.MComponentSegmentType#getMMiscellaneous <em>MMiscellaneous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMiscellaneous</em>' containment reference.
	 * @see #getMMiscellaneous()
	 * @generated
	 */
	void setMMiscellaneous(SingleGenericMassType value);

	/**
	 * Returns the value of the '<em><b>MWing Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MWing Box</em>' containment reference.
	 * @see #setMWingBox(MWingBoxType)
	 * @see Cpacs.CpacsPackage#getMComponentSegmentType_MWingBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mWingBox' namespace='##targetNamespace'"
	 * @generated
	 */
	MWingBoxType getMWingBox();

	/**
	 * Sets the value of the '{@link Cpacs.MComponentSegmentType#getMWingBox <em>MWing Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MWing Box</em>' containment reference.
	 * @see #getMWingBox()
	 * @generated
	 */
	void setMWingBox(MWingBoxType value);

	/**
	 * Returns the value of the '<em><b>MMoveables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMoveables</em>' containment reference.
	 * @see #setMMoveables(MMoveablesType)
	 * @see Cpacs.CpacsPackage#getMComponentSegmentType_MMoveables()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mMoveables' namespace='##targetNamespace'"
	 * @generated
	 */
	MMoveablesType getMMoveables();

	/**
	 * Sets the value of the '{@link Cpacs.MComponentSegmentType#getMMoveables <em>MMoveables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMoveables</em>' containment reference.
	 * @see #getMMoveables()
	 * @generated
	 */
	void setMMoveables(MMoveablesType value);

	/**
	 * Returns the value of the '<em><b>MFixed Leading Edges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFixed Leading Edges</em>' containment reference.
	 * @see #setMFixedLeadingEdges(MFixedLeadingEdgesType)
	 * @see Cpacs.CpacsPackage#getMComponentSegmentType_MFixedLeadingEdges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFixedLeadingEdges' namespace='##targetNamespace'"
	 * @generated
	 */
	MFixedLeadingEdgesType getMFixedLeadingEdges();

	/**
	 * Sets the value of the '{@link Cpacs.MComponentSegmentType#getMFixedLeadingEdges <em>MFixed Leading Edges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFixed Leading Edges</em>' containment reference.
	 * @see #getMFixedLeadingEdges()
	 * @generated
	 */
	void setMFixedLeadingEdges(MFixedLeadingEdgesType value);

	/**
	 * Returns the value of the '<em><b>MFixed Trailing Edges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFixed Trailing Edges</em>' containment reference.
	 * @see #setMFixedTrailingEdges(MFixedTrailingEdgesType)
	 * @see Cpacs.CpacsPackage#getMComponentSegmentType_MFixedTrailingEdges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mFixedTrailingEdges' namespace='##targetNamespace'"
	 * @generated
	 */
	MFixedTrailingEdgesType getMFixedTrailingEdges();

	/**
	 * Sets the value of the '{@link Cpacs.MComponentSegmentType#getMFixedTrailingEdges <em>MFixed Trailing Edges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFixed Trailing Edges</em>' containment reference.
	 * @see #getMFixedTrailingEdges()
	 * @generated
	 */
	void setMFixedTrailingEdges(MFixedTrailingEdgesType value);

} // MComponentSegmentType
