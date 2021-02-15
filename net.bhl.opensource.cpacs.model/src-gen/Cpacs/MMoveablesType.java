/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMoveables Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MMoveablesType#getMassDescription <em>Mass Description</em>}</li>
 *   <li>{@link Cpacs.MMoveablesType#getMMoveableLeadingEdges <em>MMoveable Leading Edges</em>}</li>
 *   <li>{@link Cpacs.MMoveablesType#getMMoveableTrailingEdge <em>MMoveable Trailing Edge</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMMoveablesType()
 * @model extendedMetaData="name='mMoveablesType' kind='elementOnly'"
 * @generated
 */
public interface MMoveablesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Description</em>' containment reference.
	 * @see #setMassDescription(GenericMassType)
	 * @see Cpacs.CpacsPackage#getMMoveablesType_MassDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericMassType getMassDescription();

	/**
	 * Sets the value of the '{@link Cpacs.MMoveablesType#getMassDescription <em>Mass Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Description</em>' containment reference.
	 * @see #getMassDescription()
	 * @generated
	 */
	void setMassDescription(GenericMassType value);

	/**
	 * Returns the value of the '<em><b>MMoveable Leading Edges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMoveable Leading Edges</em>' containment reference.
	 * @see #setMMoveableLeadingEdges(MMoveableLeadingEdgesType)
	 * @see Cpacs.CpacsPackage#getMMoveablesType_MMoveableLeadingEdges()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mMoveableLeadingEdges' namespace='##targetNamespace'"
	 * @generated
	 */
	MMoveableLeadingEdgesType getMMoveableLeadingEdges();

	/**
	 * Sets the value of the '{@link Cpacs.MMoveablesType#getMMoveableLeadingEdges <em>MMoveable Leading Edges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMoveable Leading Edges</em>' containment reference.
	 * @see #getMMoveableLeadingEdges()
	 * @generated
	 */
	void setMMoveableLeadingEdges(MMoveableLeadingEdgesType value);

	/**
	 * Returns the value of the '<em><b>MMoveable Trailing Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MMoveable Trailing Edge</em>' containment reference.
	 * @see #setMMoveableTrailingEdge(MMoveableTrailingEdgeType)
	 * @see Cpacs.CpacsPackage#getMMoveablesType_MMoveableTrailingEdge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mMoveableTrailingEdge' namespace='##targetNamespace'"
	 * @generated
	 */
	MMoveableTrailingEdgeType getMMoveableTrailingEdge();

	/**
	 * Sets the value of the '{@link Cpacs.MMoveablesType#getMMoveableTrailingEdge <em>MMoveable Trailing Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MMoveable Trailing Edge</em>' containment reference.
	 * @see #getMMoveableTrailingEdge()
	 * @generated
	 */
	void setMMoveableTrailingEdge(MMoveableTrailingEdgeType value);

} // MMoveablesType
