/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dam Tol Forman Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DamTolFormanType#getKc <em>Kc</em>}</li>
 *   <li>{@link Cpacs.DamTolFormanType#getC2 <em>C2</em>}</li>
 *   <li>{@link Cpacs.DamTolFormanType#getM2 <em>M2</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDamTolFormanType()
 * @model extendedMetaData="name='damTolFormanType' kind='elementOnly'"
 * @generated
 */
public interface DamTolFormanType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Kc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter Kc [Pa m^0.5]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kc</em>' containment reference.
	 * @see #setKc(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDamTolFormanType_Kc()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kc' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKc();

	/**
	 * Sets the value of the '{@link Cpacs.DamTolFormanType#getKc <em>Kc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kc</em>' containment reference.
	 * @see #getKc()
	 * @generated
	 */
	void setKc(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>C2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter C2 [m/cycle]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>C2</em>' containment reference.
	 * @see #setC2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDamTolFormanType_C2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='C2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getC2();

	/**
	 * Sets the value of the '{@link Cpacs.DamTolFormanType#getC2 <em>C2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C2</em>' containment reference.
	 * @see #getC2()
	 * @generated
	 */
	void setC2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>M2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter m2 [-]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>M2</em>' containment reference.
	 * @see #setM2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDamTolFormanType_M2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='m2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getM2();

	/**
	 * Sets the value of the '{@link Cpacs.DamTolFormanType#getM2 <em>M2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M2</em>' containment reference.
	 * @see #getM2()
	 * @generated
	 */
	void setM2(DoubleBaseType value);

} // DamTolFormanType
