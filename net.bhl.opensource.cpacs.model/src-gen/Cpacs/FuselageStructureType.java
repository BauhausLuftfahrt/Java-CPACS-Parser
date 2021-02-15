/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageStructureType#getSkin <em>Skin</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getStringers <em>Stringers</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getFrames <em>Frames</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getPaxCrossBeams <em>Pax Cross Beams</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getPaxCrossBeamStruts <em>Pax Cross Beam Struts</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getCargoCrossBeams <em>Cargo Cross Beams</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getCargoCrossBeamStruts <em>Cargo Cross Beam Struts</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getLongFloorBeams <em>Long Floor Beams</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getGeneralStructuralMembers <em>General Structural Members</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getFloorPanels <em>Floor Panels</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getPressureBulkheads <em>Pressure Bulkheads</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getWindows <em>Windows</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getWalls <em>Walls</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getPaxDoors <em>Pax Doors</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getCargoDoors <em>Cargo Doors</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getIntercostals <em>Intercostals</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getCenterFuselageAreas <em>Center Fuselage Areas</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getTailplaneAttachmentArea <em>Tailplane Attachment Area</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getInterfaceDefinitions <em>Interface Definitions</em>}</li>
 *   <li>{@link Cpacs.FuselageStructureType#getUIDGroupDefinitions <em>UID Group Definitions</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageStructureType()
 * @model extendedMetaData="name='fuselageStructureType' kind='elementOnly'"
 * @generated
 */
public interface FuselageStructureType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Skin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skin</em>' containment reference.
	 * @see #setSkin(SkinType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_Skin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='skin' namespace='##targetNamespace'"
	 * @generated
	 */
	SkinType getSkin();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getSkin <em>Skin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skin</em>' containment reference.
	 * @see #getSkin()
	 * @generated
	 */
	void setSkin(SkinType value);

	/**
	 * Returns the value of the '<em><b>Stringers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stringers</em>' containment reference.
	 * @see #setStringers(StringersAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_Stringers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stringers' namespace='##targetNamespace'"
	 * @generated
	 */
	StringersAssemblyType getStringers();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getStringers <em>Stringers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stringers</em>' containment reference.
	 * @see #getStringers()
	 * @generated
	 */
	void setStringers(StringersAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference.
	 * @see #setFrames(FramesAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_Frames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='frames' namespace='##targetNamespace'"
	 * @generated
	 */
	FramesAssemblyType getFrames();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getFrames <em>Frames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames</em>' containment reference.
	 * @see #getFrames()
	 * @generated
	 */
	void setFrames(FramesAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Pax Cross Beams</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pax Cross Beams</em>' containment reference.
	 * @see #setPaxCrossBeams(PaxCrossBeamsAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_PaxCrossBeams()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paxCrossBeams' namespace='##targetNamespace'"
	 * @generated
	 */
	PaxCrossBeamsAssemblyType getPaxCrossBeams();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getPaxCrossBeams <em>Pax Cross Beams</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pax Cross Beams</em>' containment reference.
	 * @see #getPaxCrossBeams()
	 * @generated
	 */
	void setPaxCrossBeams(PaxCrossBeamsAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Pax Cross Beam Struts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pax Cross Beam Struts</em>' containment reference.
	 * @see #setPaxCrossBeamStruts(PaxCrossBeamStrutsAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_PaxCrossBeamStruts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paxCrossBeamStruts' namespace='##targetNamespace'"
	 * @generated
	 */
	PaxCrossBeamStrutsAssemblyType getPaxCrossBeamStruts();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getPaxCrossBeamStruts <em>Pax Cross Beam Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pax Cross Beam Struts</em>' containment reference.
	 * @see #getPaxCrossBeamStruts()
	 * @generated
	 */
	void setPaxCrossBeamStruts(PaxCrossBeamStrutsAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Cargo Cross Beams</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargo Cross Beams</em>' containment reference.
	 * @see #setCargoCrossBeams(CargoCrossBeamsAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_CargoCrossBeams()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cargoCrossBeams' namespace='##targetNamespace'"
	 * @generated
	 */
	CargoCrossBeamsAssemblyType getCargoCrossBeams();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getCargoCrossBeams <em>Cargo Cross Beams</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cargo Cross Beams</em>' containment reference.
	 * @see #getCargoCrossBeams()
	 * @generated
	 */
	void setCargoCrossBeams(CargoCrossBeamsAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Cargo Cross Beam Struts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargo Cross Beam Struts</em>' containment reference.
	 * @see #setCargoCrossBeamStruts(CargoCrossBeamStrutsAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_CargoCrossBeamStruts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cargoCrossBeamStruts' namespace='##targetNamespace'"
	 * @generated
	 */
	CargoCrossBeamStrutsAssemblyType getCargoCrossBeamStruts();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getCargoCrossBeamStruts <em>Cargo Cross Beam Struts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cargo Cross Beam Struts</em>' containment reference.
	 * @see #getCargoCrossBeamStruts()
	 * @generated
	 */
	void setCargoCrossBeamStruts(CargoCrossBeamStrutsAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Long Floor Beams</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Floor Beams</em>' containment reference.
	 * @see #setLongFloorBeams(LongFloorBeamsAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_LongFloorBeams()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='longFloorBeams' namespace='##targetNamespace'"
	 * @generated
	 */
	LongFloorBeamsAssemblyType getLongFloorBeams();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getLongFloorBeams <em>Long Floor Beams</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Floor Beams</em>' containment reference.
	 * @see #getLongFloorBeams()
	 * @generated
	 */
	void setLongFloorBeams(LongFloorBeamsAssemblyType value);

	/**
	 * Returns the value of the '<em><b>General Structural Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Structural Members</em>' containment reference.
	 * @see #setGeneralStructuralMembers(GeneralStructuralMembersAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_GeneralStructuralMembers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='generalStructuralMembers' namespace='##targetNamespace'"
	 * @generated
	 */
	GeneralStructuralMembersAssemblyType getGeneralStructuralMembers();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getGeneralStructuralMembers <em>General Structural Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Structural Members</em>' containment reference.
	 * @see #getGeneralStructuralMembers()
	 * @generated
	 */
	void setGeneralStructuralMembers(GeneralStructuralMembersAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Floor Panels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floor Panels</em>' containment reference.
	 * @see #setFloorPanels(FloorPanelsType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_FloorPanels()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='floorPanels' namespace='##targetNamespace'"
	 * @generated
	 */
	FloorPanelsType getFloorPanels();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getFloorPanels <em>Floor Panels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floor Panels</em>' containment reference.
	 * @see #getFloorPanels()
	 * @generated
	 */
	void setFloorPanels(FloorPanelsType value);

	/**
	 * Returns the value of the '<em><b>Pressure Bulkheads</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure Bulkheads</em>' containment reference.
	 * @see #setPressureBulkheads(PressureBulkheadAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_PressureBulkheads()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pressureBulkheads' namespace='##targetNamespace'"
	 * @generated
	 */
	PressureBulkheadAssemblyType getPressureBulkheads();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getPressureBulkheads <em>Pressure Bulkheads</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure Bulkheads</em>' containment reference.
	 * @see #getPressureBulkheads()
	 * @generated
	 */
	void setPressureBulkheads(PressureBulkheadAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' containment reference.
	 * @see #setWindows(WindowsAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_Windows()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='windows' namespace='##targetNamespace'"
	 * @generated
	 */
	WindowsAssemblyType getWindows();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getWindows <em>Windows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Windows</em>' containment reference.
	 * @see #getWindows()
	 * @generated
	 */
	void setWindows(WindowsAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Walls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Walls</em>' containment reference.
	 * @see #setWalls(WallsType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_Walls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='walls' namespace='##targetNamespace'"
	 * @generated
	 */
	WallsType getWalls();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getWalls <em>Walls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Walls</em>' containment reference.
	 * @see #getWalls()
	 * @generated
	 */
	void setWalls(WallsType value);

	/**
	 * Returns the value of the '<em><b>Pax Doors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pax Doors</em>' containment reference.
	 * @see #setPaxDoors(PaxDoorsAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_PaxDoors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paxDoors' namespace='##targetNamespace'"
	 * @generated
	 */
	PaxDoorsAssemblyType getPaxDoors();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getPaxDoors <em>Pax Doors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pax Doors</em>' containment reference.
	 * @see #getPaxDoors()
	 * @generated
	 */
	void setPaxDoors(PaxDoorsAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Cargo Doors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cargo Doors</em>' containment reference.
	 * @see #setCargoDoors(CargoDoorsAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_CargoDoors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cargoDoors' namespace='##targetNamespace'"
	 * @generated
	 */
	CargoDoorsAssemblyType getCargoDoors();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getCargoDoors <em>Cargo Doors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cargo Doors</em>' containment reference.
	 * @see #getCargoDoors()
	 * @generated
	 */
	void setCargoDoors(CargoDoorsAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Intercostals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intercostals</em>' containment reference.
	 * @see #setIntercostals(IntercostalsAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_Intercostals()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intercostals' namespace='##targetNamespace'"
	 * @generated
	 */
	IntercostalsAssemblyType getIntercostals();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getIntercostals <em>Intercostals</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intercostals</em>' containment reference.
	 * @see #getIntercostals()
	 * @generated
	 */
	void setIntercostals(IntercostalsAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Center Fuselage Areas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Fuselage Areas</em>' containment reference.
	 * @see #setCenterFuselageAreas(CenterFuselageAreasAssemblyType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_CenterFuselageAreas()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='centerFuselageAreas' namespace='##targetNamespace'"
	 * @generated
	 */
	CenterFuselageAreasAssemblyType getCenterFuselageAreas();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getCenterFuselageAreas <em>Center Fuselage Areas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Fuselage Areas</em>' containment reference.
	 * @see #getCenterFuselageAreas()
	 * @generated
	 */
	void setCenterFuselageAreas(CenterFuselageAreasAssemblyType value);

	/**
	 * Returns the value of the '<em><b>Tailplane Attachment Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tailplane Attachment Area</em>' containment reference.
	 * @see #setTailplaneAttachmentArea(TailplaneAttachmentAreaType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_TailplaneAttachmentArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tailplaneAttachmentArea' namespace='##targetNamespace'"
	 * @generated
	 */
	TailplaneAttachmentAreaType getTailplaneAttachmentArea();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getTailplaneAttachmentArea <em>Tailplane Attachment Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tailplane Attachment Area</em>' containment reference.
	 * @see #getTailplaneAttachmentArea()
	 * @generated
	 */
	void setTailplaneAttachmentArea(TailplaneAttachmentAreaType value);

	/**
	 * Returns the value of the '<em><b>Interface Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Definitions</em>' containment reference.
	 * @see #setInterfaceDefinitions(InterfaceDefinitionsType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_InterfaceDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interfaceDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfaceDefinitionsType getInterfaceDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getInterfaceDefinitions <em>Interface Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Definitions</em>' containment reference.
	 * @see #getInterfaceDefinitions()
	 * @generated
	 */
	void setInterfaceDefinitions(InterfaceDefinitionsType value);

	/**
	 * Returns the value of the '<em><b>UID Group Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID Group Definitions</em>' containment reference.
	 * @see #setUIDGroupDefinitions(UIDGroupDefinitionsType)
	 * @see Cpacs.CpacsPackage#getFuselageStructureType_UIDGroupDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UIDGroupDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	UIDGroupDefinitionsType getUIDGroupDefinitions();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageStructureType#getUIDGroupDefinitions <em>UID Group Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID Group Definitions</em>' containment reference.
	 * @see #getUIDGroupDefinitions()
	 * @generated
	 */
	void setUIDGroupDefinitions(UIDGroupDefinitionsType value);

} // FuselageStructureType
