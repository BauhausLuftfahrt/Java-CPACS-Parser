/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cut Out Control Points Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CutOutControlPointsType#getInnerBorder <em>Inner Border</em>}</li>
 *   <li>{@link Cpacs.CutOutControlPointsType#getOuterBorder <em>Outer Border</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCutOutControlPointsType()
 * @model extendedMetaData="name='cutOutControlPointsType' kind='elementOnly'"
 * @generated
 */
public interface CutOutControlPointsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Inner Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Border</em>' containment reference.
	 * @see #setInnerBorder(CutOutControlPointType)
	 * @see Cpacs.CpacsPackage#getCutOutControlPointsType_InnerBorder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='innerBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	CutOutControlPointType getInnerBorder();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutControlPointsType#getInnerBorder <em>Inner Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Border</em>' containment reference.
	 * @see #getInnerBorder()
	 * @generated
	 */
	void setInnerBorder(CutOutControlPointType value);

	/**
	 * Returns the value of the '<em><b>Outer Border</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Border</em>' containment reference.
	 * @see #setOuterBorder(CutOutControlPointType)
	 * @see Cpacs.CpacsPackage#getCutOutControlPointsType_OuterBorder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='outerBorder' namespace='##targetNamespace'"
	 * @generated
	 */
	CutOutControlPointType getOuterBorder();

	/**
	 * Sets the value of the '{@link Cpacs.CutOutControlPointsType#getOuterBorder <em>Outer Border</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Border</em>' containment reference.
	 * @see #getOuterBorder()
	 * @generated
	 */
	void setOuterBorder(CutOutControlPointType value);

} // CutOutControlPointsType
