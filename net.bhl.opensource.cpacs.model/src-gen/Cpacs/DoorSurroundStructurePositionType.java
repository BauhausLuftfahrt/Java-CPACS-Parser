/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door Surround Structure Position Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DoorSurroundStructurePositionType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.DoorSurroundStructurePositionType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.DoorSurroundStructurePositionType#getFramesGapFront <em>Frames Gap Front</em>}</li>
 *   <li>{@link Cpacs.DoorSurroundStructurePositionType#getFramesGapRear <em>Frames Gap Rear</em>}</li>
 *   <li>{@link Cpacs.DoorSurroundStructurePositionType#getStringersGapPrimary <em>Stringers Gap Primary</em>}</li>
 *   <li>{@link Cpacs.DoorSurroundStructurePositionType#getStringersGapSecondary <em>Stringers Gap Secondary</em>}</li>
 *   <li>{@link Cpacs.DoorSurroundStructurePositionType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDoorSurroundStructurePositionType()
 * @model extendedMetaData="name='doorSurroundStructurePositionType' kind='elementOnly'"
 * @generated
 */
public interface DoorSurroundStructurePositionType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDoorSurroundStructurePositionType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.DoorSurroundStructurePositionType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getDoorSurroundStructurePositionType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.DoorSurroundStructurePositionType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Frames Gap Front</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * number of bays effected by DSS in front of
	 *                                 door
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frames Gap Front</em>' containment reference.
	 * @see #setFramesGapFront(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getDoorSurroundStructurePositionType_FramesGapFront()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='framesGapFront' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getFramesGapFront();

	/**
	 * Sets the value of the '{@link Cpacs.DoorSurroundStructurePositionType#getFramesGapFront <em>Frames Gap Front</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames Gap Front</em>' containment reference.
	 * @see #getFramesGapFront()
	 * @generated
	 */
	void setFramesGapFront(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Frames Gap Rear</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * number of bays effected by DSS in behind of
	 *                                 door
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frames Gap Rear</em>' containment reference.
	 * @see #setFramesGapRear(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getDoorSurroundStructurePositionType_FramesGapRear()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='framesGapRear' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getFramesGapRear();

	/**
	 * Sets the value of the '{@link Cpacs.DoorSurroundStructurePositionType#getFramesGapRear <em>Frames Gap Rear</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames Gap Rear</em>' containment reference.
	 * @see #getFramesGapRear()
	 * @generated
	 */
	void setFramesGapRear(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Stringers Gap Primary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * number of bays effected by DSS
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stringers Gap Primary</em>' containment reference.
	 * @see #setStringersGapPrimary(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getDoorSurroundStructurePositionType_StringersGapPrimary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stringersGapPrimary' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getStringersGapPrimary();

	/**
	 * Sets the value of the '{@link Cpacs.DoorSurroundStructurePositionType#getStringersGapPrimary <em>Stringers Gap Primary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stringers Gap Primary</em>' containment reference.
	 * @see #getStringersGapPrimary()
	 * @generated
	 */
	void setStringersGapPrimary(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>Stringers Gap Secondary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * number of bays effected by DSS
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stringers Gap Secondary</em>' containment reference.
	 * @see #setStringersGapSecondary(IntegerBaseType)
	 * @see Cpacs.CpacsPackage#getDoorSurroundStructurePositionType_StringersGapSecondary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='stringersGapSecondary' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerBaseType getStringersGapSecondary();

	/**
	 * Sets the value of the '{@link Cpacs.DoorSurroundStructurePositionType#getStringersGapSecondary <em>Stringers Gap Secondary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stringers Gap Secondary</em>' containment reference.
	 * @see #getStringersGapSecondary()
	 * @generated
	 */
	void setStringersGapSecondary(IntegerBaseType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getDoorSurroundStructurePositionType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.DoorSurroundStructurePositionType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // DoorSurroundStructurePositionType
