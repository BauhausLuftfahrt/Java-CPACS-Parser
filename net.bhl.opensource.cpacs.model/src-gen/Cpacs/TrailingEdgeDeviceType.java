/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trailing Edge Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getOuterShape <em>Outer Shape</em>}</li>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getWingCutOut <em>Wing Cut Out</em>}</li>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getStructure <em>Structure</em>}</li>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getPath <em>Path</em>}</li>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getTracks <em>Tracks</em>}</li>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getActuators <em>Actuators</em>}</li>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getCruiseRollers <em>Cruise Rollers</em>}</li>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getInterconnectionStruts <em>Interconnection Struts</em>}</li>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getZCouplings <em>ZCouplings</em>}</li>
 *   <li>{@link Cpacs.TrailingEdgeDeviceType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType()
 * @model extendedMetaData="name='trailingEdgeDeviceType' kind='elementOnly'"
 * @generated
 */
public interface TrailingEdgeDeviceType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the trailing edge device.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getName <em>Name</em>}' containment reference.
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
	 * Description of the trailing edge device.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Parent UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the parent of the TED. The parent can
	 *                                 either be the uID of the componentSegment of the wing, or the
	 *                                 uID of another TED. In the second case this TED is placed within
	 *                                 the other TED (double slotted flap). In this way n-slotted TEDs
	 *                                 can be created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent UID</em>' containment reference.
	 * @see #setParentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_ParentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getParentUID <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent UID</em>' containment reference.
	 * @see #getParentUID()
	 * @generated
	 */
	void setParentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Outer Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Shape</em>' containment reference.
	 * @see #setOuterShape(ControlSurfaceOuterShapeTrailingEdgeType)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_OuterShape()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outerShape' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceOuterShapeTrailingEdgeType getOuterShape();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getOuterShape <em>Outer Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Shape</em>' containment reference.
	 * @see #getOuterShape()
	 * @generated
	 */
	void setOuterShape(ControlSurfaceOuterShapeTrailingEdgeType value);

	/**
	 * Returns the value of the '<em><b>Wing Cut Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Cut Out</em>' containment reference.
	 * @see #setWingCutOut(ControlSurfaceWingCutOutType)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_WingCutOut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wingCutOut' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceWingCutOutType getWingCutOut();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getWingCutOut <em>Wing Cut Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wing Cut Out</em>' containment reference.
	 * @see #getWingCutOut()
	 * @generated
	 */
	void setWingCutOut(ControlSurfaceWingCutOutType value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(WingComponentSegmentStructureType)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_Structure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
	 * @generated
	 */
	WingComponentSegmentStructureType getStructure();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(WingComponentSegmentStructureType value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(ControlSurfacePathType)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_Path()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfacePathType getPath();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(ControlSurfacePathType value);

	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' containment reference.
	 * @see #setTracks(ControlSurfaceTracksType)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_Tracks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tracks' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceTracksType getTracks();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getTracks <em>Tracks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tracks</em>' containment reference.
	 * @see #getTracks()
	 * @generated
	 */
	void setTracks(ControlSurfaceTracksType value);

	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' containment reference.
	 * @see #setActuators(ControlSurfaceActuatorsType)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_Actuators()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actuators' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceActuatorsType getActuators();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getActuators <em>Actuators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuators</em>' containment reference.
	 * @see #getActuators()
	 * @generated
	 */
	void setActuators(ControlSurfaceActuatorsType value);

	/**
	 * Returns the value of the '<em><b>Cruise Rollers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of cruise rollers/mid-span stops.
	 *                                 Those features are small rolls at the leading edge of a flap
	 *                                 that keep the flap within the bending wing at cruise
	 *                                 configuration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cruise Rollers</em>' containment reference.
	 * @see #setCruiseRollers(CruiseRollersType)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_CruiseRollers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cruiseRollers' namespace='##targetNamespace'"
	 * @generated
	 */
	CruiseRollersType getCruiseRollers();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getCruiseRollers <em>Cruise Rollers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cruise Rollers</em>' containment reference.
	 * @see #getCruiseRollers()
	 * @generated
	 */
	void setCruiseRollers(CruiseRollersType value);

	/**
	 * Returns the value of the '<em><b>Interconnection Struts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of interconnection struts. Those
	 *                                 struts connect two neighbouring flaps and are load carrying in
	 *                                 case of an actuator of flap track failour.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnection Struts</em>' containment reference.
	 * @see #setInterconnectionStruts(InterconnectionStrutsType)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_InterconnectionStruts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interconnectionStruts' namespace='##targetNamespace'"
	 * @generated
	 */
	InterconnectionStrutsType getInterconnectionStruts();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getInterconnectionStruts <em>Interconnection Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interconnection Struts</em>' containment reference.
	 * @see #getInterconnectionStruts()
	 * @generated
	 */
	void setInterconnectionStruts(InterconnectionStrutsType value);

	/**
	 * Returns the value of the '<em><b>ZCouplings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of z-couplings. Those elements
	 *                                 couple two neighbouring flaps in z-direction.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZCouplings</em>' containment reference.
	 * @see #setZCouplings(ZCouplingsType)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_ZCouplings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zCouplings' namespace='##targetNamespace'"
	 * @generated
	 */
	ZCouplingsType getZCouplings();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getZCouplings <em>ZCouplings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZCouplings</em>' containment reference.
	 * @see #getZCouplings()
	 * @generated
	 */
	void setZCouplings(ZCouplingsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getTrailingEdgeDeviceType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.TrailingEdgeDeviceType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // TrailingEdgeDeviceType
