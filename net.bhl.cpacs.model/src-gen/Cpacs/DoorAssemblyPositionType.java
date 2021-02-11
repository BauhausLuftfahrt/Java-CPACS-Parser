/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Assembly Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getDoorType <em>Door Type</em>}</li>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getDoorElementUID <em>Door Element UID</em>}</li>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getStartFrameUID <em>Start Frame UID</em>}</li>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getEndFrameUID <em>End Frame UID</em>}</li>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getStartStringerUID <em>Start Stringer UID</em>}</li>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getEndStringerUID <em>End Stringer UID</em>}</li>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getZBase <em>ZBase</em>}</li>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getMinWidth <em>Min Width</em>}</li>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getMinHeight <em>Min Height</em>}</li>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getYSign <em>YSign</em>}</li>
 *   <li>{@link Cpacs.DoorAssemblyPositionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType()
 * @model extendedMetaData="name='doorAssemblyPositionType' kind='elementOnly'"
 * @generated
 */
public interface DoorAssemblyPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getName <em>Name</em>}' containment reference.
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
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Door Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * optional definition of door type (restricted to pax,
	 *                                 service, emergency, cargo)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Door Type</em>' containment reference.
	 * @see #setDoorType(DoorTypeType)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_DoorType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='doorType' namespace='##targetNamespace'"
	 * @generated
	 */
	DoorTypeType getDoorType();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getDoorType <em>Door Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Type</em>' containment reference.
	 * @see #getDoorType()
	 * @generated
	 */
	void setDoorType(DoorTypeType value);

	/**
	 * Returns the value of the '<em><b>Door Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the door element
	 *                                 description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Door Element UID</em>' containment reference.
	 * @see #setDoorElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_DoorElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='doorElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getDoorElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getDoorElementUID <em>Door Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Element UID</em>' containment reference.
	 * @see #getDoorElementUID()
	 * @generated
	 */
	void setDoorElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Start Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the forward door frame
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Frame UID</em>' containment reference.
	 * @see #setStartFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_StartFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStartFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getStartFrameUID <em>Start Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Frame UID</em>' containment reference.
	 * @see #getStartFrameUID()
	 * @generated
	 */
	void setStartFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>End Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the backward door frame
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Frame UID</em>' containment reference.
	 * @see #setEndFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_EndFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='endFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getEndFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getEndFrameUID <em>End Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Frame UID</em>' containment reference.
	 * @see #getEndFrameUID()
	 * @generated
	 */
	void setEndFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Start Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the stringer at the upper door
	 *                                 edge
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Stringer UID</em>' containment reference.
	 * @see #setStartStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_StartStringerUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='startStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStartStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getStartStringerUID <em>Start Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Stringer UID</em>' containment reference.
	 * @see #getStartStringerUID()
	 * @generated
	 */
	void setStartStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>End Stringer UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the stringer at the lower door
	 *                                 edge
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Stringer UID</em>' containment reference.
	 * @see #setEndStringerUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_EndStringerUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='endStringerUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getEndStringerUID();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getEndStringerUID <em>End Stringer UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Stringer UID</em>' containment reference.
	 * @see #getEndStringerUID()
	 * @generated
	 */
	void setEndStringerUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>ZBase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lower height of the door with respect to the floor.
	 *                                 (Information necessary for boarding and evacuation analysis not
	 *                                 necessarily linked to structures)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZBase</em>' containment reference.
	 * @see #setZBase(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_ZBase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zBase' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZBase();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getZBase <em>ZBase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBase</em>' containment reference.
	 * @see #getZBase()
	 * @generated
	 */
	void setZBase(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Min Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum widh of the door element. (Information
	 *                                 necessary for boarding and evacuation analysis not necessarily
	 *                                 linked to structures)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Width</em>' containment reference.
	 * @see #setMinWidth(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_MinWidth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMinWidth();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getMinWidth <em>Min Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Width</em>' containment reference.
	 * @see #getMinWidth()
	 * @generated
	 */
	void setMinWidth(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Min Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum height of the door element. (Information
	 *                                 necessary for boarding and evacuation analysis not necessarily
	 *                                 linked to structures)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Height</em>' containment reference.
	 * @see #setMinHeight(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_MinHeight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getMinHeight();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getMinHeight <em>Min Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Height</em>' containment reference.
	 * @see #getMinHeight()
	 * @generated
	 */
	void setMinHeight(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>YSign</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Door on right side of the fuselage = 1; on the left =
	 *                                 -1. (Information necessary for boarding and evacuation analysis not
	 *                                 necessarily linked to structures)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YSign</em>' containment reference.
	 * @see #setYSign(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_YSign()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ySign' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getYSign();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getYSign <em>YSign</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YSign</em>' containment reference.
	 * @see #getYSign()
	 * @generated
	 */
	void setYSign(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getDoorAssemblyPositionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.DoorAssemblyPositionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // DoorAssemblyPositionType
