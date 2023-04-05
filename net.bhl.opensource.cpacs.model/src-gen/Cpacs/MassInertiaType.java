/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mass Inertia Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MassInertiaType#getJxx <em>Jxx</em>}</li>
 *   <li>{@link Cpacs.MassInertiaType#getJyy <em>Jyy</em>}</li>
 *   <li>{@link Cpacs.MassInertiaType#getJzz <em>Jzz</em>}</li>
 *   <li>{@link Cpacs.MassInertiaType#getJxy <em>Jxy</em>}</li>
 *   <li>{@link Cpacs.MassInertiaType#getJxz <em>Jxz</em>}</li>
 *   <li>{@link Cpacs.MassInertiaType#getJyz <em>Jyz</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMassInertiaType()
 * @model extendedMetaData="name='massInertiaType' kind='elementOnly'"
 * @generated
 */
public interface MassInertiaType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Jxx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jxx</em>' containment reference.
	 * @see #setJxx(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMassInertiaType_Jxx()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Jxx' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getJxx();

	/**
	 * Sets the value of the '{@link Cpacs.MassInertiaType#getJxx <em>Jxx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jxx</em>' containment reference.
	 * @see #getJxx()
	 * @generated
	 */
	void setJxx(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Jyy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jyy</em>' containment reference.
	 * @see #setJyy(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMassInertiaType_Jyy()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Jyy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getJyy();

	/**
	 * Sets the value of the '{@link Cpacs.MassInertiaType#getJyy <em>Jyy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jyy</em>' containment reference.
	 * @see #getJyy()
	 * @generated
	 */
	void setJyy(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Jzz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jzz</em>' containment reference.
	 * @see #setJzz(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMassInertiaType_Jzz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Jzz' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getJzz();

	/**
	 * Sets the value of the '{@link Cpacs.MassInertiaType#getJzz <em>Jzz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jzz</em>' containment reference.
	 * @see #getJzz()
	 * @generated
	 */
	void setJzz(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Jxy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jxy</em>' containment reference.
	 * @see #setJxy(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMassInertiaType_Jxy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Jxy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getJxy();

	/**
	 * Sets the value of the '{@link Cpacs.MassInertiaType#getJxy <em>Jxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jxy</em>' containment reference.
	 * @see #getJxy()
	 * @generated
	 */
	void setJxy(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Jxz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jxz</em>' containment reference.
	 * @see #setJxz(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMassInertiaType_Jxz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Jxz' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getJxz();

	/**
	 * Sets the value of the '{@link Cpacs.MassInertiaType#getJxz <em>Jxz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jxz</em>' containment reference.
	 * @see #getJxz()
	 * @generated
	 */
	void setJxz(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Jyz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jyz</em>' containment reference.
	 * @see #setJyz(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getMassInertiaType_Jyz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Jyz' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getJyz();

	/**
	 * Sets the value of the '{@link Cpacs.MassInertiaType#getJyz <em>Jyz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jyz</em>' containment reference.
	 * @see #getJyz()
	 * @generated
	 */
	void setJyz(DoubleBaseType value);

} // MassInertiaType
