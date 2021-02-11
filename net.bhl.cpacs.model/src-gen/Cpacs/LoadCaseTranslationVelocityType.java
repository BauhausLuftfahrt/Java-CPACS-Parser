/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Translation Velocity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseTranslationVelocityType#getU <em>U</em>}</li>
 *   <li>{@link Cpacs.LoadCaseTranslationVelocityType#getV <em>V</em>}</li>
 *   <li>{@link Cpacs.LoadCaseTranslationVelocityType#getW <em>W</em>}</li>
 *   <li>{@link Cpacs.LoadCaseTranslationVelocityType#getXDot <em>XDot</em>}</li>
 *   <li>{@link Cpacs.LoadCaseTranslationVelocityType#getYDot <em>YDot</em>}</li>
 *   <li>{@link Cpacs.LoadCaseTranslationVelocityType#getZDot <em>ZDot</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseTranslationVelocityType()
 * @model extendedMetaData="name='loadCaseTranslationVelocityType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseTranslationVelocityType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>U</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Velocity in u (body fixed coord.sys.)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>U</em>' containment reference.
	 * @see #setU(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationVelocityType_U()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='u' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getU();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationVelocityType#getU <em>U</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U</em>' containment reference.
	 * @see #getU()
	 * @generated
	 */
	void setU(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Velocity in v (body fixed coord.sys.)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>V</em>' containment reference.
	 * @see #setV(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationVelocityType_V()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='v' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getV();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationVelocityType#getV <em>V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' containment reference.
	 * @see #getV()
	 * @generated
	 */
	void setV(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>W</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Velocity in w (body fixed coord.sys.)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>W</em>' containment reference.
	 * @see #setW(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationVelocityType_W()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='w' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getW();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationVelocityType#getW <em>W</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' containment reference.
	 * @see #getW()
	 * @generated
	 */
	void setW(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>XDot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Velocity in x (earth fixed coord.sys.)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XDot</em>' containment reference.
	 * @see #setXDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationVelocityType_XDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXDot();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationVelocityType#getXDot <em>XDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDot</em>' containment reference.
	 * @see #getXDot()
	 * @generated
	 */
	void setXDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>YDot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Velocity in y (earth fixed coord.sys.)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YDot</em>' containment reference.
	 * @see #setYDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationVelocityType_YDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='yDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getYDot();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationVelocityType#getYDot <em>YDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDot</em>' containment reference.
	 * @see #getYDot()
	 * @generated
	 */
	void setYDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>ZDot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Velocity in z (earth fixed coord.sys.)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZDot</em>' containment reference.
	 * @see #setZDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationVelocityType_ZDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZDot();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationVelocityType#getZDot <em>ZDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZDot</em>' containment reference.
	 * @see #getZDot()
	 * @generated
	 */
	void setZDot(DoubleBaseType value);

} // LoadCaseTranslationVelocityType
