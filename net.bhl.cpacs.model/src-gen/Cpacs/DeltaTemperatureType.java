/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta Temperature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DeltaTemperatureType#getTotal <em>Total</em>}</li>
 *   <li>{@link Cpacs.DeltaTemperatureType#getCO2 <em>CO2</em>}</li>
 *   <li>{@link Cpacs.DeltaTemperatureType#getH2O <em>H2O</em>}</li>
 *   <li>{@link Cpacs.DeltaTemperatureType#getO3 <em>O3</em>}</li>
 *   <li>{@link Cpacs.DeltaTemperatureType#getCH4 <em>CH4</em>}</li>
 *   <li>{@link Cpacs.DeltaTemperatureType#getCont <em>Cont</em>}</li>
 *   <li>{@link Cpacs.DeltaTemperatureType#getPmo <em>Pmo</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDeltaTemperatureType()
 * @model extendedMetaData="name='deltaTemperatureType' kind='elementOnly'"
 * @generated
 */
public interface DeltaTemperatureType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Total</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' containment reference.
	 * @see #setTotal(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDeltaTemperatureType_Total()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='total' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getTotal();

	/**
	 * Sets the value of the '{@link Cpacs.DeltaTemperatureType#getTotal <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' containment reference.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>CO2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CO2</em>' containment reference.
	 * @see #setCO2(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDeltaTemperatureType_CO2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cO2' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCO2();

	/**
	 * Sets the value of the '{@link Cpacs.DeltaTemperatureType#getCO2 <em>CO2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO2</em>' containment reference.
	 * @see #getCO2()
	 * @generated
	 */
	void setCO2(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>H2O</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H2O</em>' containment reference.
	 * @see #setH2O(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDeltaTemperatureType_H2O()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='h2O' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getH2O();

	/**
	 * Sets the value of the '{@link Cpacs.DeltaTemperatureType#getH2O <em>H2O</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H2O</em>' containment reference.
	 * @see #getH2O()
	 * @generated
	 */
	void setH2O(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>O3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>O3</em>' containment reference.
	 * @see #setO3(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDeltaTemperatureType_O3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='o3' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getO3();

	/**
	 * Sets the value of the '{@link Cpacs.DeltaTemperatureType#getO3 <em>O3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>O3</em>' containment reference.
	 * @see #getO3()
	 * @generated
	 */
	void setO3(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>CH4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CH4</em>' containment reference.
	 * @see #setCH4(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDeltaTemperatureType_CH4()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cH4' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCH4();

	/**
	 * Sets the value of the '{@link Cpacs.DeltaTemperatureType#getCH4 <em>CH4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CH4</em>' containment reference.
	 * @see #getCH4()
	 * @generated
	 */
	void setCH4(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cont</em>' containment reference.
	 * @see #setCont(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDeltaTemperatureType_Cont()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cont' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCont();

	/**
	 * Sets the value of the '{@link Cpacs.DeltaTemperatureType#getCont <em>Cont</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cont</em>' containment reference.
	 * @see #getCont()
	 * @generated
	 */
	void setCont(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Pmo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pmo</em>' containment reference.
	 * @see #setPmo(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getDeltaTemperatureType_Pmo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='pmo' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getPmo();

	/**
	 * Sets the value of the '{@link Cpacs.DeltaTemperatureType#getPmo <em>Pmo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pmo</em>' containment reference.
	 * @see #getPmo()
	 * @generated
	 */
	void setPmo(DoubleBaseType value);

} // DeltaTemperatureType
