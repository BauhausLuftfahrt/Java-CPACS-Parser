/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Translation Acceleration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseTranslationAccelerationType#getUDot <em>UDot</em>}</li>
 *   <li>{@link Cpacs.LoadCaseTranslationAccelerationType#getVDot <em>VDot</em>}</li>
 *   <li>{@link Cpacs.LoadCaseTranslationAccelerationType#getWDot <em>WDot</em>}</li>
 *   <li>{@link Cpacs.LoadCaseTranslationAccelerationType#getXDotDot <em>XDot Dot</em>}</li>
 *   <li>{@link Cpacs.LoadCaseTranslationAccelerationType#getYDotDot <em>YDot Dot</em>}</li>
 *   <li>{@link Cpacs.LoadCaseTranslationAccelerationType#getZDotDot <em>ZDot Dot</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseTranslationAccelerationType()
 * @model extendedMetaData="name='loadCaseTranslationAccelerationType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseTranslationAccelerationType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>UDot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Acceleration in u (body fixed coord.sys.)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UDot</em>' containment reference.
	 * @see #setUDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationAccelerationType_UDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='uDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getUDot();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationAccelerationType#getUDot <em>UDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UDot</em>' containment reference.
	 * @see #getUDot()
	 * @generated
	 */
	void setUDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>VDot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Acceleration in v (body fixed coord.sys.)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VDot</em>' containment reference.
	 * @see #setVDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationAccelerationType_VDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getVDot();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationAccelerationType#getVDot <em>VDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VDot</em>' containment reference.
	 * @see #getVDot()
	 * @generated
	 */
	void setVDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>WDot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Acceleration in w (body fixed coord.sys.)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WDot</em>' containment reference.
	 * @see #setWDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationAccelerationType_WDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getWDot();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationAccelerationType#getWDot <em>WDot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WDot</em>' containment reference.
	 * @see #getWDot()
	 * @generated
	 */
	void setWDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>XDot Dot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Acceleration in x (earth fixed coord.sys.)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XDot Dot</em>' containment reference.
	 * @see #setXDotDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationAccelerationType_XDotDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='xDotDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getXDotDot();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationAccelerationType#getXDotDot <em>XDot Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDot Dot</em>' containment reference.
	 * @see #getXDotDot()
	 * @generated
	 */
	void setXDotDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>YDot Dot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Acceleration in y (earth fixed coord.sys.)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YDot Dot</em>' containment reference.
	 * @see #setYDotDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationAccelerationType_YDotDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='yDotDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getYDotDot();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationAccelerationType#getYDotDot <em>YDot Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDot Dot</em>' containment reference.
	 * @see #getYDotDot()
	 * @generated
	 */
	void setYDotDot(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>ZDot Dot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Acceleration in z (earth fixed coord.sys.)
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZDot Dot</em>' containment reference.
	 * @see #setZDotDot(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getLoadCaseTranslationAccelerationType_ZDotDot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='zDotDot' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getZDotDot();

	/**
	 * Sets the value of the '{@link Cpacs.LoadCaseTranslationAccelerationType#getZDotDot <em>ZDot Dot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZDot Dot</em>' containment reference.
	 * @see #getZDotDot()
	 * @generated
	 */
	void setZDotDot(DoubleBaseType value);

} // LoadCaseTranslationAccelerationType
