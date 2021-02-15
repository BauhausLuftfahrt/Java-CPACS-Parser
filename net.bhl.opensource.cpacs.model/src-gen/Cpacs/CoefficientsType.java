/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CoefficientsType#getCfx <em>Cfx</em>}</li>
 *   <li>{@link Cpacs.CoefficientsType#getCfy <em>Cfy</em>}</li>
 *   <li>{@link Cpacs.CoefficientsType#getCfz <em>Cfz</em>}</li>
 *   <li>{@link Cpacs.CoefficientsType#getCmx <em>Cmx</em>}</li>
 *   <li>{@link Cpacs.CoefficientsType#getCmy <em>Cmy</em>}</li>
 *   <li>{@link Cpacs.CoefficientsType#getCmz <em>Cmz</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCoefficientsType()
 * @model extendedMetaData="name='coefficientsType' kind='elementOnly'"
 * @generated
 */
public interface CoefficientsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cfx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Force coefficient in CPACS-x direction
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cfx</em>' containment reference.
	 * @see #setCfx(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCoefficientsType_Cfx()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cfx' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCfx();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsType#getCfx <em>Cfx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfx</em>' containment reference.
	 * @see #getCfx()
	 * @generated
	 */
	void setCfx(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cfy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Force coefficient in CPACS-y direction
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cfy</em>' containment reference.
	 * @see #setCfy(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCoefficientsType_Cfy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cfy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCfy();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsType#getCfy <em>Cfy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfy</em>' containment reference.
	 * @see #getCfy()
	 * @generated
	 */
	void setCfy(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cfz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Force coefficient in CPACS-z direction
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cfz</em>' containment reference.
	 * @see #setCfz(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCoefficientsType_Cfz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cfz' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCfz();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsType#getCfz <em>Cfz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfz</em>' containment reference.
	 * @see #getCfz()
	 * @generated
	 */
	void setCfz(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cmx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moment coefficient in CPACS-x direction
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cmx</em>' containment reference.
	 * @see #setCmx(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCoefficientsType_Cmx()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmx' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCmx();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsType#getCmx <em>Cmx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmx</em>' containment reference.
	 * @see #getCmx()
	 * @generated
	 */
	void setCmx(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cmy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moment coefficient in CPACS-y direction
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cmy</em>' containment reference.
	 * @see #setCmy(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCoefficientsType_Cmy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCmy();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsType#getCmy <em>Cmy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmy</em>' containment reference.
	 * @see #getCmy()
	 * @generated
	 */
	void setCmy(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cmz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moment coefficient in CPACS-z direction
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cmz</em>' containment reference.
	 * @see #setCmz(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getCoefficientsType_Cmz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmz' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCmz();

	/**
	 * Sets the value of the '{@link Cpacs.CoefficientsType#getCmz <em>Cmz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmz</em>' containment reference.
	 * @see #getCmz()
	 * @generated
	 */
	void setCmz(DoubleBaseType value);

} // CoefficientsType
