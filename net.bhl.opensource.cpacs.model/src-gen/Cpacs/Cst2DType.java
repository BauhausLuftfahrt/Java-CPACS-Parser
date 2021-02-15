/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cst2 DType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A 2D impelmentation for Class shape
 *                         transformations. For more details look at AIAA Journal of Aircraft
 *                         Vol.45 No.1 2008
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.Cst2DType#getPsi <em>Psi</em>}</li>
 *   <li>{@link Cpacs.Cst2DType#getUpperN1 <em>Upper N1</em>}</li>
 *   <li>{@link Cpacs.Cst2DType#getUpperN2 <em>Upper N2</em>}</li>
 *   <li>{@link Cpacs.Cst2DType#getUpperB <em>Upper B</em>}</li>
 *   <li>{@link Cpacs.Cst2DType#getLowerN1 <em>Lower N1</em>}</li>
 *   <li>{@link Cpacs.Cst2DType#getLowerN2 <em>Lower N2</em>}</li>
 *   <li>{@link Cpacs.Cst2DType#getLowerB <em>Lower B</em>}</li>
 *   <li>{@link Cpacs.Cst2DType#getTrailingEdgeThickness <em>Trailing Edge Thickness</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCst2DType()
 * @model extendedMetaData="name='cst2DType' kind='elementOnly'"
 * @generated
 */
public interface Cst2DType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Psi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The psi vector for definition of the class and
	 *                                 shape function, i.e. the points at which the CST functions will
	 *                                 be evaluated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Psi</em>' containment reference.
	 * @see #setPsi(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCst2DType_Psi()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='psi' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getPsi();

	/**
	 * Sets the value of the '{@link Cpacs.Cst2DType#getPsi <em>Psi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Psi</em>' containment reference.
	 * @see #getPsi()
	 * @generated
	 */
	void setPsi(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Upper N1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N1 for the class function for the upper side
	 *                                 of the profile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper N1</em>' containment reference.
	 * @see #setUpperN1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCst2DType_UpperN1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='upperN1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getUpperN1();

	/**
	 * Sets the value of the '{@link Cpacs.Cst2DType#getUpperN1 <em>Upper N1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper N1</em>' containment reference.
	 * @see #getUpperN1()
	 * @generated
	 */
	void setUpperN1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Upper N2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N2 for the class function for the upper side
	 *                                 of the profile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper N2</em>' containment reference.
	 * @see #setUpperN2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCst2DType_UpperN2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='upperN2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getUpperN2();

	/**
	 * Sets the value of the '{@link Cpacs.Cst2DType#getUpperN2 <em>Upper N2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper N2</em>' containment reference.
	 * @see #getUpperN2()
	 * @generated
	 */
	void setUpperN2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Upper B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * B Coefficients for the Bernstein polynominal
	 *                                 on the upper side
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper B</em>' containment reference.
	 * @see #setUpperB(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCst2DType_UpperB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='upperB' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getUpperB();

	/**
	 * Sets the value of the '{@link Cpacs.Cst2DType#getUpperB <em>Upper B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper B</em>' containment reference.
	 * @see #getUpperB()
	 * @generated
	 */
	void setUpperB(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Lower N1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N1 for the class function for the lower side
	 *                                 of the profile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower N1</em>' containment reference.
	 * @see #setLowerN1(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCst2DType_LowerN1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lowerN1' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLowerN1();

	/**
	 * Sets the value of the '{@link Cpacs.Cst2DType#getLowerN1 <em>Lower N1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower N1</em>' containment reference.
	 * @see #getLowerN1()
	 * @generated
	 */
	void setLowerN1(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Lower N2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N2 for the class function for the lower side
	 *                                 of the profile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower N2</em>' containment reference.
	 * @see #setLowerN2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCst2DType_LowerN2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lowerN2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getLowerN2();

	/**
	 * Sets the value of the '{@link Cpacs.Cst2DType#getLowerN2 <em>Lower N2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower N2</em>' containment reference.
	 * @see #getLowerN2()
	 * @generated
	 */
	void setLowerN2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Lower B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * B Coefficients for the Bernstein polynominal
	 *                                 on the lower side
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower B</em>' containment reference.
	 * @see #setLowerB(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getCst2DType_LowerB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lowerB' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getLowerB();

	/**
	 * Sets the value of the '{@link Cpacs.Cst2DType#getLowerB <em>Lower B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower B</em>' containment reference.
	 * @see #getLowerB()
	 * @generated
	 */
	void setLowerB(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Trailing Edge Thickness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optionally, the trailingEdgeThickness of the
	 *                                 profile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trailing Edge Thickness</em>' containment reference.
	 * @see #setTrailingEdgeThickness(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCst2DType_TrailingEdgeThickness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='trailingEdgeThickness' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTrailingEdgeThickness();

	/**
	 * Sets the value of the '{@link Cpacs.Cst2DType#getTrailingEdgeThickness <em>Trailing Edge Thickness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trailing Edge Thickness</em>' containment reference.
	 * @see #getTrailingEdgeThickness()
	 * @generated
	 */
	void setTrailingEdgeThickness(DoubleBaseType value);

} // Cst2DType
