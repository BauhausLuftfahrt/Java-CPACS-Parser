/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Segment Strip Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageSegmentStripCoefficientsType#getCfx <em>Cfx</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentStripCoefficientsType#getCfy <em>Cfy</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentStripCoefficientsType#getCfz <em>Cfz</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentStripCoefficientsType#getCmx <em>Cmx</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentStripCoefficientsType#getCmy <em>Cmy</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentStripCoefficientsType#getCmz <em>Cmz</em>}</li>
 *   <li>{@link Cpacs.FuselageSegmentStripCoefficientsType#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageSegmentStripCoefficientsType()
 * @model extendedMetaData="name='fuselageSegmentStripCoefficientsType' kind='elementOnly'"
 * @generated
 */
public interface FuselageSegmentStripCoefficientsType extends ComplexBaseType {
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
	 * @see Cpacs.CpacsPackage#getFuselageSegmentStripCoefficientsType_Cfx()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cfx' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCfx();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentStripCoefficientsType#getCfx <em>Cfx</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getFuselageSegmentStripCoefficientsType_Cfy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cfy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCfy();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentStripCoefficientsType#getCfy <em>Cfy</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getFuselageSegmentStripCoefficientsType_Cfz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cfz' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCfz();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentStripCoefficientsType#getCfz <em>Cfz</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getFuselageSegmentStripCoefficientsType_Cmx()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmx' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCmx();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentStripCoefficientsType#getCmx <em>Cmx</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getFuselageSegmentStripCoefficientsType_Cmy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmy' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCmy();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentStripCoefficientsType#getCmy <em>Cmy</em>}' containment reference.
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
	 * @see Cpacs.CpacsPackage#getFuselageSegmentStripCoefficientsType_Cmz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cmz' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCmz();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentStripCoefficientsType#getCmz <em>Cmz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmz</em>' containment reference.
	 * @see #getCmz()
	 * @generated
	 */
	void setCmz(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(LoadReferenceType)
	 * @see Cpacs.CpacsPackage#getFuselageSegmentStripCoefficientsType_Reference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadReferenceType getReference();

	/**
	 * Sets the value of the '{@link Cpacs.FuselageSegmentStripCoefficientsType#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(LoadReferenceType value);

} // FuselageSegmentStripCoefficientsType
