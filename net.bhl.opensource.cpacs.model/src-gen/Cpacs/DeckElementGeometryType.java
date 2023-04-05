/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deck Element Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DeckElementGeometryType#getGenericGeometryComponent <em>Generic Geometry Component</em>}</li>
 *   <li>{@link Cpacs.DeckElementGeometryType#getBoundingBox <em>Bounding Box</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDeckElementGeometryType()
 * @model extendedMetaData="name='deckElementGeometryType' kind='elementOnly'"
 * @generated
 */
public interface DeckElementGeometryType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Generic Geometry Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Geometry Component</em>' containment reference.
	 * @see #setGenericGeometryComponent(GenericGeometryComponentType)
	 * @see Cpacs.CpacsPackage#getDeckElementGeometryType_GenericGeometryComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='genericGeometryComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericGeometryComponentType getGenericGeometryComponent();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementGeometryType#getGenericGeometryComponent <em>Generic Geometry Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Geometry Component</em>' containment reference.
	 * @see #getGenericGeometryComponent()
	 * @generated
	 */
	void setGenericGeometryComponent(GenericGeometryComponentType value);

	/**
	 * Returns the value of the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounding Box</em>' containment reference.
	 * @see #setBoundingBox(BoundingBoxType)
	 * @see Cpacs.CpacsPackage#getDeckElementGeometryType_BoundingBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundingBox' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundingBoxType getBoundingBox();

	/**
	 * Sets the value of the '{@link Cpacs.DeckElementGeometryType#getBoundingBox <em>Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounding Box</em>' containment reference.
	 * @see #getBoundingBox()
	 * @generated
	 */
	void setBoundingBox(BoundingBoxType value);

} // DeckElementGeometryType
