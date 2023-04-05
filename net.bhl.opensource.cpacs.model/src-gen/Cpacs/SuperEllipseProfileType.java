/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Super Ellipse Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SuperEllipseProfileType#getMUpper <em>MUpper</em>}</li>
 *   <li>{@link Cpacs.SuperEllipseProfileType#getNUpper <em>NUpper</em>}</li>
 *   <li>{@link Cpacs.SuperEllipseProfileType#getMLower <em>MLower</em>}</li>
 *   <li>{@link Cpacs.SuperEllipseProfileType#getNLower <em>NLower</em>}</li>
 *   <li>{@link Cpacs.SuperEllipseProfileType#getLowerHeightFraction <em>Lower Height Fraction</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSuperEllipseProfileType()
 * @model extendedMetaData="name='superEllipseProfileType' kind='elementOnly'"
 * @generated
 */
public interface SuperEllipseProfileType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>MUpper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exponent m for upper semi-ellipse
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MUpper</em>' containment reference.
	 * @see #setMUpper(PosExcl0DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getSuperEllipseProfileType_MUpper()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mUpper' namespace='##targetNamespace'"
	 * @generated
	 */
	PosExcl0DoubleBaseType getMUpper();

	/**
	 * Sets the value of the '{@link Cpacs.SuperEllipseProfileType#getMUpper <em>MUpper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MUpper</em>' containment reference.
	 * @see #getMUpper()
	 * @generated
	 */
	void setMUpper(PosExcl0DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>NUpper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exponent n for upper semi-ellipse
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NUpper</em>' containment reference.
	 * @see #setNUpper(PosExcl0DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getSuperEllipseProfileType_NUpper()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nUpper' namespace='##targetNamespace'"
	 * @generated
	 */
	PosExcl0DoubleBaseType getNUpper();

	/**
	 * Sets the value of the '{@link Cpacs.SuperEllipseProfileType#getNUpper <em>NUpper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NUpper</em>' containment reference.
	 * @see #getNUpper()
	 * @generated
	 */
	void setNUpper(PosExcl0DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>MLower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exponent m for lower semi-ellipse
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MLower</em>' containment reference.
	 * @see #setMLower(PosExcl0DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getSuperEllipseProfileType_MLower()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mLower' namespace='##targetNamespace'"
	 * @generated
	 */
	PosExcl0DoubleBaseType getMLower();

	/**
	 * Sets the value of the '{@link Cpacs.SuperEllipseProfileType#getMLower <em>MLower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MLower</em>' containment reference.
	 * @see #getMLower()
	 * @generated
	 */
	void setMLower(PosExcl0DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>NLower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exponent n for lower semi-ellipse
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NLower</em>' containment reference.
	 * @see #setNLower(PosExcl0DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getSuperEllipseProfileType_NLower()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nLower' namespace='##targetNamespace'"
	 * @generated
	 */
	PosExcl0DoubleBaseType getNLower();

	/**
	 * Sets the value of the '{@link Cpacs.SuperEllipseProfileType#getNLower <em>NLower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NLower</em>' containment reference.
	 * @see #getNLower()
	 * @generated
	 */
	void setNLower(PosExcl0DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Lower Height Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Height Fraction</em>' containment reference.
	 * @see #setLowerHeightFraction(LowerHeightFractionType)
	 * @see Cpacs.CpacsPackage#getSuperEllipseProfileType_LowerHeightFraction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='lowerHeightFraction' namespace='##targetNamespace'"
	 * @generated
	 */
	LowerHeightFractionType getLowerHeightFraction();

	/**
	 * Sets the value of the '{@link Cpacs.SuperEllipseProfileType#getLowerHeightFraction <em>Lower Height Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Height Fraction</em>' containment reference.
	 * @see #getLowerHeightFraction()
	 * @generated
	 */
	void setLowerHeightFraction(LowerHeightFractionType value);

} // SuperEllipseProfileType
