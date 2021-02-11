/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Cut Loads Envelope Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ComponentCutLoadsEnvelopeType#getParentUID <em>Parent UID</em>}</li>
 *   <li>{@link Cpacs.ComponentCutLoadsEnvelopeType#getMax <em>Max</em>}</li>
 *   <li>{@link Cpacs.ComponentCutLoadsEnvelopeType#getMin <em>Min</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getComponentCutLoadsEnvelopeType()
 * @model extendedMetaData="name='componentCutLoadsEnvelopeType' kind='elementOnly'"
 * @generated
 */
public interface ComponentCutLoadsEnvelopeType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Parent UID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parentUID of the corresponding component,
	 *                                 e.g.
	 *                                 "wingUID"
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent UID</em>' containment reference.
	 * @see #setParentUID(StringUIDBaseType)
	 * @see Cpacs.CpacsPackage#getComponentCutLoadsEnvelopeType_ParentUID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='parentUID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringUIDBaseType getParentUID();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentCutLoadsEnvelopeType#getParentUID <em>Parent UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent UID</em>' containment reference.
	 * @see #getParentUID()
	 * @generated
	 */
	void setParentUID(StringUIDBaseType value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(SubLoadType)
	 * @see Cpacs.CpacsPackage#getComponentCutLoadsEnvelopeType_Max()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='max' namespace='##targetNamespace'"
	 * @generated
	 */
	SubLoadType getMax();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentCutLoadsEnvelopeType#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(SubLoadType value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(SubLoadType)
	 * @see Cpacs.CpacsPackage#getComponentCutLoadsEnvelopeType_Min()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='min' namespace='##targetNamespace'"
	 * @generated
	 */
	SubLoadType getMin();

	/**
	 * Sets the value of the '{@link Cpacs.ComponentCutLoadsEnvelopeType#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(SubLoadType value);

} // ComponentCutLoadsEnvelopeType
