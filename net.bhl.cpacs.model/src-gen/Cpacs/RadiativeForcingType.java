/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radiative Forcing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RadiativeForcingType#getTotal <em>Total</em>}</li>
 *   <li>{@link Cpacs.RadiativeForcingType#getCO2 <em>CO2</em>}</li>
 *   <li>{@link Cpacs.RadiativeForcingType#getH2O <em>H2O</em>}</li>
 *   <li>{@link Cpacs.RadiativeForcingType#getO3 <em>O3</em>}</li>
 *   <li>{@link Cpacs.RadiativeForcingType#getCH4 <em>CH4</em>}</li>
 *   <li>{@link Cpacs.RadiativeForcingType#getCont <em>Cont</em>}</li>
 *   <li>{@link Cpacs.RadiativeForcingType#getPmo <em>Pmo</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRadiativeForcingType()
 * @model extendedMetaData="name='radiativeForcingType' kind='elementOnly'"
 * @generated
 */
public interface RadiativeForcingType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' containment reference.
	 * @see #setTotal(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getRadiativeForcingType_Total()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='total' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getTotal();

	/**
	 * Sets the value of the '{@link Cpacs.RadiativeForcingType#getTotal <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' containment reference.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>CO2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CO2</em>' containment reference.
	 * @see #setCO2(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getRadiativeForcingType_CO2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cO2' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCO2();

	/**
	 * Sets the value of the '{@link Cpacs.RadiativeForcingType#getCO2 <em>CO2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO2</em>' containment reference.
	 * @see #getCO2()
	 * @generated
	 */
	void setCO2(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>H2O</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H2O</em>' containment reference.
	 * @see #setH2O(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getRadiativeForcingType_H2O()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='h2O' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getH2O();

	/**
	 * Sets the value of the '{@link Cpacs.RadiativeForcingType#getH2O <em>H2O</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H2O</em>' containment reference.
	 * @see #getH2O()
	 * @generated
	 */
	void setH2O(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>O3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>O3</em>' containment reference.
	 * @see #setO3(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getRadiativeForcingType_O3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='o3' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getO3();

	/**
	 * Sets the value of the '{@link Cpacs.RadiativeForcingType#getO3 <em>O3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>O3</em>' containment reference.
	 * @see #getO3()
	 * @generated
	 */
	void setO3(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>CH4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CH4</em>' containment reference.
	 * @see #setCH4(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getRadiativeForcingType_CH4()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cH4' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCH4();

	/**
	 * Sets the value of the '{@link Cpacs.RadiativeForcingType#getCH4 <em>CH4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CH4</em>' containment reference.
	 * @see #getCH4()
	 * @generated
	 */
	void setCH4(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cont</em>' containment reference.
	 * @see #setCont(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getRadiativeForcingType_Cont()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cont' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getCont();

	/**
	 * Sets the value of the '{@link Cpacs.RadiativeForcingType#getCont <em>Cont</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cont</em>' containment reference.
	 * @see #getCont()
	 * @generated
	 */
	void setCont(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Pmo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pmo</em>' containment reference.
	 * @see #setPmo(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getRadiativeForcingType_Pmo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pmo' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getPmo();

	/**
	 * Sets the value of the '{@link Cpacs.RadiativeForcingType#getPmo <em>Pmo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pmo</em>' containment reference.
	 * @see #getPmo()
	 * @generated
	 */
	void setPmo(StringVectorBaseType value);

} // RadiativeForcingType
