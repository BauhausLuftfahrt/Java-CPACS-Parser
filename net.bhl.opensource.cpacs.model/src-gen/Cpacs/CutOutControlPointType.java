/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cut Out Control Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CutOutControlPointType#getRelHeight <em>Rel Height</em>}</li>
 *   <li>{@link Cpacs.CutOutControlPointType#getXsi <em>Xsi</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCutOutControlPointType()
 * @model extendedMetaData="name='cutOutControlPointType' kind='elementOnly'"
 * @generated
 */
public interface CutOutControlPointType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rel Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative height of the most forward position of
	 *                                 the parents leading edge, relative to the airfoil height without
	 *                                 cut out.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rel Height</em>' containment reference.
	 * @see #setRelHeight(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCutOutControlPointType_RelHeight()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getRelHeight();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutControlPointType#getRelHeight <em>Rel Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel Height</em>' containment reference.
	 * @see #getRelHeight()
	 * @generated
	 */
	void setRelHeight(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Xsi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative chordwise position of the most
	 *                                 forward position of the parents leading edge, relative to the
	 *                                 parents chord without cut out.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xsi</em>' containment reference.
	 * @see #setXsi(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCutOutControlPointType_Xsi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='xsi' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXsi();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutControlPointType#getXsi <em>Xsi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xsi</em>' containment reference.
	 * @see #getXsi()
	 * @generated
	 */
	void setXsi(DoubleBaseType value);

} // CutOutControlPointType
