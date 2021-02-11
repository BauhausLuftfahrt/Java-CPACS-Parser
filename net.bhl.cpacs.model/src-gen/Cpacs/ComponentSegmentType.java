/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Segment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ComponentSegmentType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentType#getFromElementUID <em>From Element UID</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentType#getToElementUID <em>To Element UID</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentType#getStructure <em>Structure</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentType#getControlSurfaces <em>Control Surfaces</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentType#getPath <em>Path</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentType#getWingFuselageAttachments <em>Wing Fuselage Attachments</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentType#getWingWingAttachments <em>Wing Wing Attachments</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentType#getWingFuelTanks <em>Wing Fuel Tanks</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentType#getWingStructuralMounts <em>Wing Structural Mounts</em>}</li>
 *   <li>{@link Cpacs.ComponentSegmentType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getComponentSegmentType()
 * @model extendedMetaData="name='componentSegmentType' kind='elementOnly'"
 * @generated
 */
public interface ComponentSegmentType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Name of the wing componentSegment.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Description of the componentSegment.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>From Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference to the element from which the
	 *                                 componentSegment shall start.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Element UID</em>' containment reference.
	 * @see #setFromElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentType_FromElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fromElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFromElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentType#getFromElementUID <em>From Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Element UID</em>' containment reference.
	 * @see #getFromElementUID()
	 * @generated
	 */
	void setFromElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>To Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Reference to the element from which the
	 *                                 componentSegment shall end.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Element UID</em>' containment reference.
	 * @see #setToElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentType_ToElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='toElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getToElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentType#getToElementUID <em>To Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Element UID</em>' containment reference.
	 * @see #getToElementUID()
	 * @generated
	 */
	void setToElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(WingComponentSegmentStructureType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentType_Structure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
	 * @generated
	 */
	WingComponentSegmentStructureType getStructure();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentType#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(WingComponentSegmentStructureType value);

	/**
	 * Returns the value of the '<em><b>Control Surfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surfaces</em>' containment reference.
	 * @see #setControlSurfaces(ControlSurfacesType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentType_ControlSurfaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='controlSurfaces' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfacesType getControlSurfaces();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentType#getControlSurfaces <em>Control Surfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Surfaces</em>' containment reference.
	 * @see #getControlSurfaces()
	 * @generated
	 */
	void setControlSurfaces(ControlSurfacesType value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Description of deflection path of
	 *                                 componentSegments (e.g. used for
	 *                                 trimmable HTPs).
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(ComponentSegmentPathType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentType_Path()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentSegmentPathType getPath();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentType#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(ComponentSegmentPathType value);

	/**
	 * Returns the value of the '<em><b>Wing Fuselage Attachments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Fuselage Attachments</em>' containment reference.
	 * @see #setWingFuselageAttachments(WingFuselageAttachmentsType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentType_WingFuselageAttachments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wingFuselageAttachments' namespace='##targetNamespace'"
	 * @generated
	 */
	WingFuselageAttachmentsType getWingFuselageAttachments();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentType#getWingFuselageAttachments <em>Wing Fuselage Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Fuselage Attachments</em>' containment reference.
	 * @see #getWingFuselageAttachments()
	 * @generated
	 */
	void setWingFuselageAttachments(WingFuselageAttachmentsType value);

	/**
	 * Returns the value of the '<em><b>Wing Wing Attachments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Wing Attachments</em>' containment reference.
	 * @see #setWingWingAttachments(WingWingAttachmentsType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentType_WingWingAttachments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wingWingAttachments' namespace='##targetNamespace'"
	 * @generated
	 */
	WingWingAttachmentsType getWingWingAttachments();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentType#getWingWingAttachments <em>Wing Wing Attachments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Wing Attachments</em>' containment reference.
	 * @see #getWingWingAttachments()
	 * @generated
	 */
	void setWingWingAttachments(WingWingAttachmentsType value);

	/**
	 * Returns the value of the '<em><b>Wing Fuel Tanks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Fuel Tanks</em>' containment reference.
	 * @see #setWingFuelTanks(WingFuelTanksType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentType_WingFuelTanks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wingFuelTanks' namespace='##targetNamespace'"
	 * @generated
	 */
	WingFuelTanksType getWingFuelTanks();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentType#getWingFuelTanks <em>Wing Fuel Tanks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Fuel Tanks</em>' containment reference.
	 * @see #getWingFuelTanks()
	 * @generated
	 */
	void setWingFuelTanks(WingFuelTanksType value);

	/**
	 * Returns the value of the '<em><b>Wing Structural Mounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Structural Mounts</em>' containment reference.
	 * @see #setWingStructuralMounts(WingStructuralMountsType)
	 * @see Cpacs.CpacsPackage#getComponentSegmentType_WingStructuralMounts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wingStructuralMounts' namespace='##targetNamespace'"
	 * @generated
	 */
	WingStructuralMountsType getWingStructuralMounts();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentType#getWingStructuralMounts <em>Wing Structural Mounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Structural Mounts</em>' containment reference.
	 * @see #getWingStructuralMounts()
	 * @generated
	 */
	void setWingStructuralMounts(WingStructuralMountsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getComponentSegmentType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentSegmentType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // ComponentSegmentType
