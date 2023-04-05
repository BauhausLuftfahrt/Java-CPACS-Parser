/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck Component2 DBase Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DeckComponent2DBaseType#getName <em>Name</em>}</li>
 *   <li>{@link Cpacs.DeckComponent2DBaseType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.DeckComponent2DBaseType#getDeckElementUID <em>Deck Element UID</em>}</li>
 *   <li>{@link Cpacs.DeckComponent2DBaseType#getStructuralMounts <em>Structural Mounts</em>}</li>
 *   <li>{@link Cpacs.DeckComponent2DBaseType#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link Cpacs.DeckComponent2DBaseType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDeckComponent2DBaseType()
 * @model extendedMetaData="name='deckComponent2DBaseType' kind='elementOnly'"
 * @generated
 */
public interface DeckComponent2DBaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDeckComponent2DBaseType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getName();

	/**
	 * Sets the value of the '{@link Cpacs.DeckComponent2DBaseType#getName <em>Name</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getDeckComponent2DBaseType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.DeckComponent2DBaseType#getDescription <em>Description</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getDeckComponent2DBaseType_DeckElementUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='deckElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getDeckElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.DeckComponent2DBaseType#getDeckElementUID <em>Deck Element UID</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getDeckComponent2DBaseType_StructuralMounts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structuralMounts' namespace='##targetNamespace'"
	 * @generated
	 */
	DeckStructuralMountsType getStructuralMounts();

	/**
	 * Sets the value of the '{@link Cpacs.DeckComponent2DBaseType#getStructuralMounts <em>Structural Mounts</em>}' containment reference.
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
	 * @see #setTransformation(Transformation2DType)
	 * @see Cpacs.CpacsPackage#getDeckComponent2DBaseType_Transformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transformation' namespace='##targetNamespace'"
	 * @generated
	 */
	Transformation2DType getTransformation();

	/**
	 * Sets the value of the '{@link Cpacs.DeckComponent2DBaseType#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation2DType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getDeckComponent2DBaseType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.DeckComponent2DBaseType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // DeckComponent2DBaseType
