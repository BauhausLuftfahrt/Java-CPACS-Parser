/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Damping Derivatives Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcddpstar <em>Dcddpstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcddqstar <em>Dcddqstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcddrstar <em>Dcddrstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcsdpstar <em>Dcsdpstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcsdqstar <em>Dcsdqstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcsdrstar <em>Dcsdrstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcldpstar <em>Dcldpstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcldqstar <em>Dcldqstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcldrstar <em>Dcldrstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmddpstar <em>Dcmddpstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmddqstar <em>Dcmddqstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmddrstar <em>Dcmddrstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmsdpstar <em>Dcmsdpstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmsdqstar <em>Dcmsdqstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmsdrstar <em>Dcmsdrstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmldpstar <em>Dcmldpstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmldqstar <em>Dcmldqstar</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmldrstar <em>Dcmldrstar</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDampingDerivativesType()
 * @model extendedMetaData="name='dampingDerivativesType' kind='elementOnly'"
 * @generated
 */
public interface DampingDerivativesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Dcddpstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cd by normalized roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcddpstar</em>' containment reference.
	 * @see #setDcddpstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcddpstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcddpstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcddpstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcddpstar <em>Dcddpstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcddpstar</em>' containment reference.
	 * @see #getDcddpstar()
	 * @generated
	 */
	void setDcddpstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcddqstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cd by normalized pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcddqstar</em>' containment reference.
	 * @see #setDcddqstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcddqstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcddqstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcddqstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcddqstar <em>Dcddqstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcddqstar</em>' containment reference.
	 * @see #getDcddqstar()
	 * @generated
	 */
	void setDcddqstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcddrstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cd by normalized yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcddrstar</em>' containment reference.
	 * @see #setDcddrstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcddrstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcddrstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcddrstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcddrstar <em>Dcddrstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcddrstar</em>' containment reference.
	 * @see #getDcddrstar()
	 * @generated
	 */
	void setDcddrstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcsdpstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cs by normalized roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcsdpstar</em>' containment reference.
	 * @see #setDcsdpstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcsdpstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcsdpstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcsdpstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcsdpstar <em>Dcsdpstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcsdpstar</em>' containment reference.
	 * @see #getDcsdpstar()
	 * @generated
	 */
	void setDcsdpstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcsdqstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cs by normalized pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcsdqstar</em>' containment reference.
	 * @see #setDcsdqstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcsdqstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcsdqstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcsdqstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcsdqstar <em>Dcsdqstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcsdqstar</em>' containment reference.
	 * @see #getDcsdqstar()
	 * @generated
	 */
	void setDcsdqstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcsdrstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cs by normalized yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcsdrstar</em>' containment reference.
	 * @see #setDcsdrstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcsdrstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcsdrstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcsdrstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcsdrstar <em>Dcsdrstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcsdrstar</em>' containment reference.
	 * @see #getDcsdrstar()
	 * @generated
	 */
	void setDcsdrstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcldpstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cl by normalized roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcldpstar</em>' containment reference.
	 * @see #setDcldpstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcldpstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcldpstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcldpstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcldpstar <em>Dcldpstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcldpstar</em>' containment reference.
	 * @see #getDcldpstar()
	 * @generated
	 */
	void setDcldpstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcldqstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cl by normalized pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcldqstar</em>' containment reference.
	 * @see #setDcldqstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcldqstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcldqstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcldqstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcldqstar <em>Dcldqstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcldqstar</em>' containment reference.
	 * @see #getDcldqstar()
	 * @generated
	 */
	void setDcldqstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcldrstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cl by normalized yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcldrstar</em>' containment reference.
	 * @see #setDcldrstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcldrstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcldrstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcldrstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcldrstar <em>Dcldrstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcldrstar</em>' containment reference.
	 * @see #getDcldrstar()
	 * @generated
	 */
	void setDcldrstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmddpstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cmd by normalized roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmddpstar</em>' containment reference.
	 * @see #setDcmddpstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcmddpstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmddpstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcmddpstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmddpstar <em>Dcmddpstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmddpstar</em>' containment reference.
	 * @see #getDcmddpstar()
	 * @generated
	 */
	void setDcmddpstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmddqstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cmd by normalized pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmddqstar</em>' containment reference.
	 * @see #setDcmddqstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcmddqstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmddqstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcmddqstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmddqstar <em>Dcmddqstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmddqstar</em>' containment reference.
	 * @see #getDcmddqstar()
	 * @generated
	 */
	void setDcmddqstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmddrstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cmd by normalized yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmddrstar</em>' containment reference.
	 * @see #setDcmddrstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcmddrstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmddrstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcmddrstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmddrstar <em>Dcmddrstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmddrstar</em>' containment reference.
	 * @see #getDcmddrstar()
	 * @generated
	 */
	void setDcmddrstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmsdpstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cms by normalized roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmsdpstar</em>' containment reference.
	 * @see #setDcmsdpstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcmsdpstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmsdpstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcmsdpstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmsdpstar <em>Dcmsdpstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmsdpstar</em>' containment reference.
	 * @see #getDcmsdpstar()
	 * @generated
	 */
	void setDcmsdpstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmsdqstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cms by normalized pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmsdqstar</em>' containment reference.
	 * @see #setDcmsdqstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcmsdqstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmsdqstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcmsdqstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmsdqstar <em>Dcmsdqstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmsdqstar</em>' containment reference.
	 * @see #getDcmsdqstar()
	 * @generated
	 */
	void setDcmsdqstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmsdrstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cms by normalized yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmsdrstar</em>' containment reference.
	 * @see #setDcmsdrstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcmsdrstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmsdrstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcmsdrstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmsdrstar <em>Dcmsdrstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmsdrstar</em>' containment reference.
	 * @see #getDcmsdrstar()
	 * @generated
	 */
	void setDcmsdrstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmldpstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cml by normalized roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmldpstar</em>' containment reference.
	 * @see #setDcmldpstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcmldpstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmldpstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcmldpstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmldpstar <em>Dcmldpstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmldpstar</em>' containment reference.
	 * @see #getDcmldpstar()
	 * @generated
	 */
	void setDcmldpstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmldqstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cml by normalized pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmldqstar</em>' containment reference.
	 * @see #setDcmldqstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcmldqstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmldqstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcmldqstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmldqstar <em>Dcmldqstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmldqstar</em>' containment reference.
	 * @see #getDcmldqstar()
	 * @generated
	 */
	void setDcmldqstar(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmldrstar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cml by normalized yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmldrstar</em>' containment reference.
	 * @see #setDcmldrstar(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_Dcmldrstar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmldrstar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getDcmldrstar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmldrstar <em>Dcmldrstar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmldrstar</em>' containment reference.
	 * @see #getDcmldrstar()
	 * @generated
	 */
	void setDcmldrstar(StringVectorBaseType value);

} // DampingDerivativesType
