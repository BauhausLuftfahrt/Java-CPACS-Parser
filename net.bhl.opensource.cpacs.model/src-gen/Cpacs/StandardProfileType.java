/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.StandardProfileType#getRectangle <em>Rectangle</em>}</li>
 *   <li>{@link Cpacs.StandardProfileType#getSuperEllipse <em>Super Ellipse</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getStandardProfileType()
 * @model extendedMetaData="name='standardProfileType' kind='elementOnly'"
 * @generated
 */
public interface StandardProfileType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rectangle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectangle</em>' containment reference.
	 * @see #setRectangle(RectangleProfileType)
	 * @see Cpacs.CpacsPackage#getStandardProfileType_Rectangle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rectangle' namespace='##targetNamespace'"
	 * @generated
	 */
	RectangleProfileType getRectangle();

	/**
	 * Sets the value of the '{@link Cpacs.StandardProfileType#getRectangle <em>Rectangle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectangle</em>' containment reference.
	 * @see #getRectangle()
	 * @generated
	 */
	void setRectangle(RectangleProfileType value);

	/**
	 * Returns the value of the '<em><b>Super Ellipse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Ellipse</em>' containment reference.
	 * @see #setSuperEllipse(SuperEllipseProfileType)
	 * @see Cpacs.CpacsPackage#getStandardProfileType_SuperEllipse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='superEllipse' namespace='##targetNamespace'"
	 * @generated
	 */
	SuperEllipseProfileType getSuperEllipse();

	/**
	 * Sets the value of the '{@link Cpacs.StandardProfileType#getSuperEllipse <em>Super Ellipse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Ellipse</em>' containment reference.
	 * @see #getSuperEllipse()
	 * @generated
	 */
	void setSuperEllipse(SuperEllipseProfileType value);

} // StandardProfileType
