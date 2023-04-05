/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Load Factors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseLoadFactorsType#getNX <em>NX</em>}</li>
 *   <li>{@link Cpacs.LoadCaseLoadFactorsType#getNY <em>NY</em>}</li>
 *   <li>{@link Cpacs.LoadCaseLoadFactorsType#getNZ <em>NZ</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseLoadFactorsType()
 * @model extendedMetaData="name='loadCaseLoadFactorsType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseLoadFactorsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>NX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Load factor in x-direction
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NX</em>' containment reference.
	 * @see #setNX(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseLoadFactorsType_NX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nX' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNX();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseLoadFactorsType#getNX <em>NX</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NX</em>' containment reference.
	 * @see #getNX()
	 * @generated
	 */
	void setNX(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>NY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Load factor in y-direction
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NY</em>' containment reference.
	 * @see #setNY(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseLoadFactorsType_NY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nY' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNY();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseLoadFactorsType#getNY <em>NY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NY</em>' containment reference.
	 * @see #getNY()
	 * @generated
	 */
	void setNY(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>NZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Load factor in z-direction
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NZ</em>' containment reference.
	 * @see #setNZ(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseLoadFactorsType_NZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nZ' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNZ();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseLoadFactorsType#getNZ <em>NZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NZ</em>' containment reference.
	 * @see #getNZ()
	 * @generated
	 */
	void setNZ(DoubleBaseType value);

} // LoadCaseLoadFactorsType
