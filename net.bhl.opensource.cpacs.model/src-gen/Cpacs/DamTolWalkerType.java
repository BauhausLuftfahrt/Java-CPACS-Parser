/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dam Tol Walker Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DamTolWalkerType#getKIc <em>KIc</em>}</li>
 *   <li>{@link Cpacs.DamTolWalkerType#getC0 <em>C0</em>}</li>
 *   <li>{@link Cpacs.DamTolWalkerType#getM <em>M</em>}</li>
 *   <li>{@link Cpacs.DamTolWalkerType#getGamma <em>Gamma</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDamTolWalkerType()
 * @model extendedMetaData="name='damTolWalkerType' kind='elementOnly'"
 * @generated
 */
public interface DamTolWalkerType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>KIc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fracture toughness KIc [Pa m^0.5]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>KIc</em>' containment reference.
	 * @see #setKIc(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDamTolWalkerType_KIc()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='KIc' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getKIc();

	/**
	 * Sets the value of the '{@link Cpacs.DamTolWalkerType#getKIc <em>KIc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KIc</em>' containment reference.
	 * @see #getKIc()
	 * @generated
	 */
	void setKIc(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>C0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter C0 [m/cycle]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>C0</em>' containment reference.
	 * @see #setC0(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDamTolWalkerType_C0()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='C0' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getC0();

	/**
	 * Sets the value of the '{@link Cpacs.DamTolWalkerType#getC0 <em>C0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C0</em>' containment reference.
	 * @see #getC0()
	 * @generated
	 */
	void setC0(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>M</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter m [-]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>M</em>' containment reference.
	 * @see #setM(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDamTolWalkerType_M()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='m' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getM();

	/**
	 * Sets the value of the '{@link Cpacs.DamTolWalkerType#getM <em>M</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M</em>' containment reference.
	 * @see #getM()
	 * @generated
	 */
	void setM(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Gamma</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter gamma [-]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gamma</em>' containment reference.
	 * @see #setGamma(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDamTolWalkerType_Gamma()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='gamma' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getGamma();

	/**
	 * Sets the value of the '{@link Cpacs.DamTolWalkerType#getGamma <em>Gamma</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma</em>' containment reference.
	 * @see #getGamma()
	 * @generated
	 */
	void setGamma(DoubleBaseType value);

} // DamTolWalkerType
