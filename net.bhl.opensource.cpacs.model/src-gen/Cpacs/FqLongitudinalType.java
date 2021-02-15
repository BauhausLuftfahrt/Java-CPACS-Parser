/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fq Longitudinal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FqLongitudinalType#getNumQFes <em>Num QFes</em>}</li>
 *   <li>{@link Cpacs.FqLongitudinalType#getNumThe <em>Num The</em>}</li>
 *   <li>{@link Cpacs.FqLongitudinalType#getNumTheFes <em>Num The Fes</em>}</li>
 *   <li>{@link Cpacs.FqLongitudinalType#getNumAlFes <em>Num Al Fes</em>}</li>
 *   <li>{@link Cpacs.FqLongitudinalType#getNumNzFes <em>Num Nz Fes</em>}</li>
 *   <li>{@link Cpacs.FqLongitudinalType#getDenLon <em>Den Lon</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFqLongitudinalType()
 * @model extendedMetaData="name='fqLongitudinalType' kind='elementOnly'"
 * @generated
 */
public interface FqLongitudinalType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Num QFes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function pitch stick
	 *                                 input to pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num QFes</em>' containment reference.
	 * @see #setNumQFes(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLongitudinalType_NumQFes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numQFes' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumQFes();

	/**
	 * Sets the value of the '{@link Cpacs.FqLongitudinalType#getNumQFes <em>Num QFes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num QFes</em>' containment reference.
	 * @see #getNumQFes()
	 * @generated
	 */
	void setNumQFes(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num The</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function pitch control
	 *                                 surface deflection to pitch angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num The</em>' containment reference.
	 * @see #setNumThe(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLongitudinalType_NumThe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numThe' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumThe();

	/**
	 * Sets the value of the '{@link Cpacs.FqLongitudinalType#getNumThe <em>Num The</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num The</em>' containment reference.
	 * @see #getNumThe()
	 * @generated
	 */
	void setNumThe(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num The Fes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function pitch stick
	 *                                 input to pitch angle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num The Fes</em>' containment reference.
	 * @see #setNumTheFes(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLongitudinalType_NumTheFes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numTheFes' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumTheFes();

	/**
	 * Sets the value of the '{@link Cpacs.FqLongitudinalType#getNumTheFes <em>Num The Fes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num The Fes</em>' containment reference.
	 * @see #getNumTheFes()
	 * @generated
	 */
	void setNumTheFes(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num Al Fes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function pitch stick
	 *                                 input to angle of attack
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Al Fes</em>' containment reference.
	 * @see #setNumAlFes(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLongitudinalType_NumAlFes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numAlFes' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumAlFes();

	/**
	 * Sets the value of the '{@link Cpacs.FqLongitudinalType#getNumAlFes <em>Num Al Fes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Al Fes</em>' containment reference.
	 * @see #getNumAlFes()
	 * @generated
	 */
	void setNumAlFes(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Num Nz Fes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numerator of transfer function pitch stick
	 *                                 input to vertical load factor
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Nz Fes</em>' containment reference.
	 * @see #setNumNzFes(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLongitudinalType_NumNzFes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='numNzFes' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getNumNzFes();

	/**
	 * Sets the value of the '{@link Cpacs.FqLongitudinalType#getNumNzFes <em>Num Nz Fes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Nz Fes</em>' containment reference.
	 * @see #getNumNzFes()
	 * @generated
	 */
	void setNumNzFes(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Den Lon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * denominator of longitudinal motion
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Den Lon</em>' containment reference.
	 * @see #setDenLon(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getFqLongitudinalType_DenLon()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='denLon' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDenLon();

	/**
	 * Sets the value of the '{@link Cpacs.FqLongitudinalType#getDenLon <em>Den Lon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Den Lon</em>' containment reference.
	 * @see #getDenLon()
	 * @generated
	 */
	void setDenLon(StringVectorBaseType value);

} // FqLongitudinalType
