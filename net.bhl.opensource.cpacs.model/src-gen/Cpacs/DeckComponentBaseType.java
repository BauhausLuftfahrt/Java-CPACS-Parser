/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck Component Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DeckComponentBaseType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.DeckComponentBaseType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.DeckComponentBaseType#getDeckElementUID <em>Deck Element UID</em>}</li>
 *   <li>{@link Cpacs.DeckComponentBaseType#getStructuralMounts <em>Structural Mounts</em>}</li>
 *   <li>{@link Cpacs.DeckComponentBaseType#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.DeckComponentBaseType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDeckComponentBaseType()
 * @model extendedMetaData="name='deckComponentBaseType' kind='elementOnly'"
 * @generated
 */
public interface DeckComponentBaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDeckComponentBaseType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.DeckComponentBaseType#getName <em>Name</em>}' containment reference.
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
	 * Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDeckComponentBaseType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.DeckComponentBaseType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Deck Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UID of the corresponding element in the cpacs/vehicles/deckElemets node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deck Element UID</em>' containment reference.
	 * @see #setDeckElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getDeckComponentBaseType_DeckElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deckElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getDeckElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.DeckComponentBaseType#getDeckElementUID <em>Deck Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deck Element UID</em>' containment reference.
	 * @see #getDeckElementUID()
	 * @generated
	 */
	void setDeckElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Structural Mounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Mounts</em>' containment reference.
	 * @see #setStructuralMounts(DeckStructuralMountsType)
	 * @see Cpacs.CpacsPackage#getDeckComponentBaseType_StructuralMounts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralMounts' namespace='##targetNamespace'"
	 * @generated
	 */
	DeckStructuralMountsType getStructuralMounts();

	/**
	 * Sets the value of the '{@link Cpacs.DeckComponentBaseType#getStructuralMounts <em>Structural Mounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Mounts</em>' containment reference.
	 * @see #getStructuralMounts()
	 * @generated
	 */
	void setStructuralMounts(DeckStructuralMountsType value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(TransformationType)
	 * @see Cpacs.CpacsPackage#getDeckComponentBaseType_Transformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	TransformationType getTransformation();

	/**
	 * Sets the value of the '{@link Cpacs.DeckComponentBaseType#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(TransformationType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getDeckComponentBaseType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.DeckComponentBaseType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // DeckComponentBaseType
