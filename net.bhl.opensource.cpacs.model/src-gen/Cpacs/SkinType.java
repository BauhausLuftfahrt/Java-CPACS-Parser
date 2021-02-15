/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skin Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SkinType#getStandardSheetElementUID <em>Standard Sheet Element UID</em>}</li>
 *   <li>{@link Cpacs.SkinType#getSkinSegments <em>Skin Segments</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSkinType()
 * @model extendedMetaData="name='skinType' kind='elementOnly'"
 * @generated
 */
public interface SkinType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Standard Sheet Element UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default UID of sheetBasedStructuralElement
	 *                                 used for the fuselage skin not covered by individual panels
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standard Sheet Element UID</em>' containment reference.
	 * @see #setStandardSheetElementUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getSkinType_StandardSheetElementUID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='standardSheetElementUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getStandardSheetElementUID();

	/**
	 * Sets the value of the '{@link Cpacs.SkinType#getStandardSheetElementUID <em>Standard Sheet Element UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Sheet Element UID</em>' containment reference.
	 * @see #getStandardSheetElementUID()
	 * @generated
	 */
	void setStandardSheetElementUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Skin Segments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skin Segments</em>' containment reference.
	 * @see #setSkinSegments(SkinSegmentsType)
	 * @see Cpacs.CpacsPackage#getSkinType_SkinSegments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='skinSegments' namespace='##targetNamespace'"
	 * @generated
	 */
	SkinSegmentsType getSkinSegments();

	/**
	 * Sets the value of the '{@link Cpacs.SkinType#getSkinSegments <em>Skin Segments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skin Segments</em>' containment reference.
	 * @see #getSkinSegments()
	 * @generated
	 */
	void setSkinSegments(SkinSegmentsType value);

} // SkinType
