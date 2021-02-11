/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabin Door Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CabinDoorType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.CabinDoorType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.CabinDoorType#getStructuralUID <em>Structural UID</em>}</li>
 *   <li>{@link Cpacs.CabinDoorType#getPaxCapacity <em>Pax Capacity</em>}</li>
 *   <li>{@link Cpacs.CabinDoorType#getX <em>X</em>}</li>
 *   <li>{@link Cpacs.CabinDoorType#getZ <em>Z</em>}</li>
 *   <li>{@link Cpacs.CabinDoorType#getWidth <em>Width</em>}</li>
 *   <li>{@link Cpacs.CabinDoorType#getHeight <em>Height</em>}</li>
 *   <li>{@link Cpacs.CabinDoorType#getSide <em>Side</em>}</li>
 *   <li>{@link Cpacs.CabinDoorType#getType <em>Type</em>}</li>
 *   <li>{@link Cpacs.CabinDoorType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCabinDoorType()
 * @model extendedMetaData="name='cabinDoorType' kind='elementOnly'"
 * @generated
 */
public interface CabinDoorType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getCabinDoorType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.CabinDoorType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getCabinDoorType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CabinDoorType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Structural UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural UID</em>' containment reference.
	 * @see #setStructuralUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getCabinDoorType_StructuralUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structuralUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralUID();

	/**
	 * Sets the value of the '{@link Cpacs.CabinDoorType#getStructuralUID <em>Structural UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural UID</em>' containment reference.
	 * @see #getStructuralUID()
	 * @generated
	 */
	void setStructuralUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Pax Capacity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of passengers this door adds to the
	 *                                 overall exit capacity limit of the aircraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pax Capacity</em>' containment reference.
	 * @see #setPaxCapacity(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getCabinDoorType_PaxCapacity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='paxCapacity' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getPaxCapacity();

	/**
	 * Sets the value of the '{@link Cpacs.CabinDoorType#getPaxCapacity <em>Pax Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pax Capacity</em>' containment reference.
	 * @see #getPaxCapacity()
	 * @generated
	 */
	void setPaxCapacity(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the forward x-coordinate of the door
	 *                                 relative to the cabin origin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' containment reference.
	 * @see #setX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCabinDoorType_X()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='x' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getX();

	/**
	 * Sets the value of the '{@link Cpacs.CabinDoorType#getX <em>X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' containment reference.
	 * @see #getX()
	 * @generated
	 */
	void setX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the door sill height relative to cabin origin.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z</em>' containment reference.
	 * @see #setZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCabinDoorType_Z()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='z' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZ();

	/**
	 * Sets the value of the '{@link Cpacs.CabinDoorType#getZ <em>Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' containment reference.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The width of the door in x-direction.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' containment reference.
	 * @see #setWidth(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCabinDoorType_Width()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getWidth();

	/**
	 * Sets the value of the '{@link Cpacs.CabinDoorType#getWidth <em>Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' containment reference.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the effective height of the door.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' containment reference.
	 * @see #setHeight(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCabinDoorType_Height()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='height' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getHeight();

	/**
	 * Sets the value of the '{@link Cpacs.CabinDoorType#getHeight <em>Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' containment reference.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' containment reference.
	 * @see #setSide(SideType)
	 * @see Cpacs.CpacsPackage#getCabinDoorType_Side()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='side' namespace='##targetNamespace'"
	 * @generated
	 */
	SideType getSide();

	/**
	 * Sets the value of the '{@link Cpacs.CabinDoorType#getSide <em>Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' containment reference.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(SideType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeType2)
	 * @see Cpacs.CpacsPackage#getCabinDoorType_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeType2 getType();

	/**
	 * Sets the value of the '{@link Cpacs.CabinDoorType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType2 value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getCabinDoorType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.CabinDoorType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // CabinDoorType
