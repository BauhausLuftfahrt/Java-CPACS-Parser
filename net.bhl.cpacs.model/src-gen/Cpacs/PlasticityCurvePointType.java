/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plasticity Curve Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PlasticityCurvePointType#getTangentModulus <em>Tangent Modulus</em>}</li>
 *   <li>{@link Cpacs.PlasticityCurvePointType#getTrueStress <em>True Stress</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPlasticityCurvePointType()
 * @model extendedMetaData="name='plasticityCurvePointType' kind='elementOnly'"
 * @generated
 */
public interface PlasticityCurvePointType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Tangent Modulus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tangent modulus [N/m^2]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tangent Modulus</em>' containment reference.
	 * @see #setTangentModulus(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPlasticityCurvePointType_TangentModulus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tangentModulus' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTangentModulus();

	/**
	 * Sets the value of the '{@link Cpacs.PlasticityCurvePointType#getTangentModulus <em>Tangent Modulus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tangent Modulus</em>' containment reference.
	 * @see #getTangentModulus()
	 * @generated
	 */
	void setTangentModulus(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>True Stress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True stress [N/m^2]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>True Stress</em>' containment reference.
	 * @see #setTrueStress(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getPlasticityCurvePointType_TrueStress()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='trueStress' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTrueStress();

	/**
	 * Sets the value of the '{@link Cpacs.PlasticityCurvePointType#getTrueStress <em>True Stress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Stress</em>' containment reference.
	 * @see #getTrueStress()
	 * @generated
	 */
	void setTrueStress(DoubleBaseType value);

} // PlasticityCurvePointType
