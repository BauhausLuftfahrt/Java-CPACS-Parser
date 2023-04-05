/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RectangleProfileType#getCornerRadius <em>Corner Radius</em>}</li>
 *   <li>{@link Cpacs.RectangleProfileType#getHeightToWidthRatio <em>Height To Width Ratio</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRectangleProfileType()
 * @model extendedMetaData="name='rectangleProfileType' kind='elementOnly'"
 * @generated
 */
public interface RectangleProfileType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Corner Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner Radius</em>' containment reference.
	 * @see #setCornerRadius(CornerRadiusType)
	 * @see Cpacs.CpacsPackage#getRectangleProfileType_CornerRadius()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cornerRadius' namespace='##targetNamespace'"
	 * @generated
	 */
	CornerRadiusType getCornerRadius();

	/**
	 * Sets the value of the '{@link Cpacs.RectangleProfileType#getCornerRadius <em>Corner Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corner Radius</em>' containment reference.
	 * @see #getCornerRadius()
	 * @generated
	 */
	void setCornerRadius(CornerRadiusType value);

	/**
	 * Returns the value of the '<em><b>Height To Width Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height To Width Ratio</em>' containment reference.
	 * @see #setHeightToWidthRatio(PosExcl0DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getRectangleProfileType_HeightToWidthRatio()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='heightToWidthRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	PosExcl0DoubleBaseType getHeightToWidthRatio();

	/**
	 * Sets the value of the '{@link Cpacs.RectangleProfileType#getHeightToWidthRatio <em>Height To Width Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height To Width Ratio</em>' containment reference.
	 * @see #getHeightToWidthRatio()
	 * @generated
	 */
	void setHeightToWidthRatio(PosExcl0DoubleBaseType value);

} // RectangleProfileType
