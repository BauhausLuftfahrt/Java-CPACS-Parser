/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck Element Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DeckElementBaseType#getDescription <em>Description</em>}</li>
 *   <li>{@link Cpacs.DeckElementBaseType#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link Cpacs.DeckElementBaseType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.DeckElementBaseType#getUID <em>UID</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDeckElementBaseType()
 * @model extendedMetaData="name='deckElementBaseType' kind='elementOnly'"
 * @generated
 */
public interface DeckElementBaseType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(StringBaseType)
	 * @see Cpacs.CpacsPackage#getDeckElementBaseType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getDescription();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementBaseType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see #setGeometry(DeckElementGeometryType)
	 * @see Cpacs.CpacsPackage#getDeckElementBaseType_Geometry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	DeckElementGeometryType getGeometry();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementBaseType#getGeometry <em>Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry</em>' containment reference.
	 * @see #getGeometry()
	 * @generated
	 */
	void setGeometry(DeckElementGeometryType value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(DeckElementMassType)
	 * @see Cpacs.CpacsPackage#getDeckElementBaseType_Mass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	DeckElementMassType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementBaseType#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(DeckElementMassType value);

	/**
	 * Returns the value of the '<em><b>UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UID</em>' attribute.
	 * @see #setUID(String)
	 * @see Cpacs.CpacsPackage#getDeckElementBaseType_UID()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='uID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUID();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementBaseType#getUID <em>UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UID</em>' attribute.
	 * @see #getUID()
	 * @generated
	 */
	void setUID(String value);

} // DeckElementBaseType
