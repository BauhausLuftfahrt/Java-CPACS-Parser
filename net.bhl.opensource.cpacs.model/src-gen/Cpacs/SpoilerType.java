/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spoiler Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SpoilerType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.SpoilerType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.SpoilerType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.SpoilerType#getOuterShape <em>Outer Shape</em>}</li>
 *   <li>{@link Cpacs.SpoilerType#getWingCutOut <em>Wing Cut Out</em>}</li>
 *   <li>{@link Cpacs.SpoilerType#getStructure <em>Structure</em>}</li>
 *   <li>{@link Cpacs.SpoilerType#getPath <em>Path</em>}</li>
 *   <li>{@link Cpacs.SpoilerType#getTracks <em>Tracks</em>}</li>
 *   <li>{@link Cpacs.SpoilerType#getActuators <em>Actuators</em>}</li>
 *   <li>{@link Cpacs.SpoilerType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSpoilerType()
 * @model extendedMetaData="name='spoilerType' kind='elementOnly'"
 * @generated
 */
public interface SpoilerType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the spoiler.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getSpoilerType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.SpoilerType#getName <em>Name</em>}' containment reference.
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
	 * Description of the spoiler.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getSpoilerType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.SpoilerType#getDescription <em>Description</em>}' containment reference.
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
	 * UID of the parent of the spoiler. The parent
	 *                                 is the componentSegment, where the spoiler is attached.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent UID</em>' containment reference.
	 * @see #setParentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getSpoilerType_ParentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.SpoilerType#getParentUID <em>Parent UID</em>}' containment reference.
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
	 * @see #setOuterShape(ControlSurfaceOuterShapeSpoilerType)
	 * @see Cpacs.CpacsPackage#getSpoilerType_OuterShape()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outerShape' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceOuterShapeSpoilerType getOuterShape();

	/**
	 * Sets the value of the '{@link Cpacs.SpoilerType#getOuterShape <em>Outer Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Shape</em>' containment reference.
	 * @see #getOuterShape()
	 * @generated
	 */
	void setOuterShape(ControlSurfaceOuterShapeSpoilerType value);

	/**
	 * Returns the value of the '<em><b>Wing Cut Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wing Cut Out</em>' containment reference.
	 * @see #setWingCutOut(ControlSurfaceWingCutOutType)
	 * @see Cpacs.CpacsPackage#getSpoilerType_WingCutOut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wingCutOut' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceWingCutOutType getWingCutOut();

	/**
	 * Sets the value of the '{@link Cpacs.SpoilerType#getWingCutOut <em>Wing Cut Out</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getSpoilerType_Structure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
	 * @generated
	 */
	WingComponentSegmentStructureType getStructure();

	/**
	 * Sets the value of the '{@link Cpacs.SpoilerType#getStructure <em>Structure</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getSpoilerType_Path()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='path' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfacePathType getPath();

	/**
	 * Sets the value of the '{@link Cpacs.SpoilerType#getPath <em>Path</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getSpoilerType_Tracks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tracks' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceTracksType getTracks();

	/**
	 * Sets the value of the '{@link Cpacs.SpoilerType#getTracks <em>Tracks</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getSpoilerType_Actuators()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='actuators' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlSurfaceActuatorsType getActuators();

	/**
	 * Sets the value of the '{@link Cpacs.SpoilerType#getActuators <em>Actuators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuators</em>' containment reference.
	 * @see #getActuators()
	 * @generated
	 */
	void setActuators(ControlSurfaceActuatorsType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getSpoilerType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.SpoilerType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // SpoilerType
