/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intercostal Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.IntercostalPositionType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.IntercostalPositionType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.IntercostalPositionType#getFrontFrameUID <em>Front Frame UID</em>}</li>
 *   <li>{@link Cpacs.IntercostalPositionType#getRearFrameUID <em>Rear Frame UID</em>}</li>
 *   <li>{@link Cpacs.IntercostalPositionType#getDoorUID <em>Door UID</em>}</li>
 *   <li>{@link Cpacs.IntercostalPositionType#getPositionRelZ <em>Position Rel Z</em>}</li>
 *   <li>{@link Cpacs.IntercostalPositionType#getStructuralElementUID <em>Structural Element UID</em>}</li>
 *   <li>{@link Cpacs.IntercostalPositionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getIntercostalPositionType()
 * @model extendedMetaData="name='intercostalPositionType' kind='elementOnly'"
 * @generated
 */
public interface IntercostalPositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getIntercostalPositionType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.IntercostalPositionType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getIntercostalPositionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.IntercostalPositionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Front Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the frame at which intercostal
	 *                                 starts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Front Frame UID</em>' containment reference.
	 * @see #setFrontFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getIntercostalPositionType_FrontFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='frontFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getFrontFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.IntercostalPositionType#getFrontFrameUID <em>Front Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Frame UID</em>' containment reference.
	 * @see #getFrontFrameUID()
	 * @generated
	 */
	void setFrontFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Rear Frame UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the forward door frame
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rear Frame UID</em>' containment reference.
	 * @see #setRearFrameUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getIntercostalPositionType_RearFrameUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rearFrameUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getRearFrameUID();

	/**
	 * Sets the value of the '{@link Cpacs.IntercostalPositionType#getRearFrameUID <em>Rear Frame UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rear Frame UID</em>' containment reference.
	 * @see #getRearFrameUID()
	 * @generated
	 */
	void setRearFrameUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Door UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the door
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Door UID</em>' containment reference.
	 * @see #setDoorUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getIntercostalPositionType_DoorUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='doorUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getDoorUID();

	/**
	 * Sets the value of the '{@link Cpacs.IntercostalPositionType#getDoorUID <em>Door UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door UID</em>' containment reference.
	 * @see #getDoorUID()
	 * @generated
	 */
	void setDoorUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Position Rel Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * non-dimensional value ranging between 0 and 1
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Rel Z</em>' containment reference.
	 * @see #setPositionRelZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getIntercostalPositionType_PositionRelZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='positionRelZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPositionRelZ();

	/**
	 * Sets the value of the '{@link Cpacs.IntercostalPositionType#getPositionRelZ <em>Position Rel Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Rel Z</em>' containment reference.
	 * @see #getPositionRelZ()
	 * @generated
	 */
	void setPositionRelZ(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Structural Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of profileBasedStructuralElement used for
	 *                                 intercostal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #setStructuralElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getIntercostalPositionType_StructuralElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='structuralElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStructuralElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.IntercostalPositionType#getStructuralElementUID <em>Structural Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Element UID</em>' containment reference.
	 * @see #getStructuralElementUID()
	 * @generated
	 */
	void setStructuralElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getIntercostalPositionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.IntercostalPositionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // IntercostalPositionType
