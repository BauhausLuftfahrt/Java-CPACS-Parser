/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pylon Struts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PylonStrutsType#getDragStrut <em>Drag Strut</em>}</li>
 *   <li>{@link Cpacs.PylonStrutsType#getUpperLinks <em>Upper Links</em>}</li>
 *   <li>{@link Cpacs.PylonStrutsType#getTangentLinks <em>Tangent Links</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPylonStrutsType()
 * @model extendedMetaData="name='pylonStrutsType' kind='elementOnly'"
 * @generated
 */
public interface PylonStrutsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Drag Strut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drag Strut</em>' containment reference.
	 * @see #setDragStrut(StrutType)
	 * @see Cpacs.CpacsPackage#getPylonStrutsType_DragStrut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dragStrut' namespace='##targetNamespace'"
	 * @generated
	 */
	StrutType getDragStrut();

	/**
	 * Sets the value of the '{@link Cpacs.PylonStrutsType#getDragStrut <em>Drag Strut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drag Strut</em>' containment reference.
	 * @see #getDragStrut()
	 * @generated
	 */
	void setDragStrut(StrutType value);

	/**
	 * Returns the value of the '<em><b>Upper Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Links</em>' containment reference.
	 * @see #setUpperLinks(UpperLinksType)
	 * @see Cpacs.CpacsPackage#getPylonStrutsType_UpperLinks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='upperLinks' namespace='##targetNamespace'"
	 * @generated
	 */
	UpperLinksType getUpperLinks();

	/**
	 * Sets the value of the '{@link Cpacs.PylonStrutsType#getUpperLinks <em>Upper Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Links</em>' containment reference.
	 * @see #getUpperLinks()
	 * @generated
	 */
	void setUpperLinks(UpperLinksType value);

	/**
	 * Returns the value of the '<em><b>Tangent Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tangent Links</em>' containment reference.
	 * @see #setTangentLinks(TangentLinksType)
	 * @see Cpacs.CpacsPackage#getPylonStrutsType_TangentLinks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tangentLinks' namespace='##targetNamespace'"
	 * @generated
	 */
	TangentLinksType getTangentLinks();

	/**
	 * Sets the value of the '{@link Cpacs.PylonStrutsType#getTangentLinks <em>Tangent Links</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tangent Links</em>' containment reference.
	 * @see #getTangentLinks()
	 * @generated
	 */
	void setTangentLinks(TangentLinksType value);

} // PylonStrutsType
