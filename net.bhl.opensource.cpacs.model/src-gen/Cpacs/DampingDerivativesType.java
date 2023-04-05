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
 *   <li>{@link Cpacs.DampingDerivativesType#getDcddpStar <em>Dcddp Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcddqStar <em>Dcddq Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcddrStar <em>Dcddr Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcsdpStar <em>Dcsdp Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcsdqStar <em>Dcsdq Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcsdrStar <em>Dcsdr Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcldpStar <em>Dcldp Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcldqStar <em>Dcldq Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcldrStar <em>Dcldr Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmddpStar <em>Dcmddp Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmddqStar <em>Dcmddq Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmddrStar <em>Dcmddr Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmsdpStar <em>Dcmsdp Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmsdqStar <em>Dcmsdq Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmsdrStar <em>Dcmsdr Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmldpStar <em>Dcmldp Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmldqStar <em>Dcmldq Star</em>}</li>
 *   <li>{@link Cpacs.DampingDerivativesType#getDcmldrStar <em>Dcmldr Star</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getDampingDerivativesType()
 * @model extendedMetaData="name='dampingDerivativesType' kind='elementOnly'"
 * @generated
 */
public interface DampingDerivativesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Dcddp Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cd by normalized roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcddp Star</em>' containment reference.
	 * @see #setDcddpStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcddpStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcddpStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcddpStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcddpStar <em>Dcddp Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcddp Star</em>' containment reference.
	 * @see #getDcddpStar()
	 * @generated
	 */
	void setDcddpStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcddq Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cd by normalized pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcddq Star</em>' containment reference.
	 * @see #setDcddqStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcddqStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcddqStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcddqStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcddqStar <em>Dcddq Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcddq Star</em>' containment reference.
	 * @see #getDcddqStar()
	 * @generated
	 */
	void setDcddqStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcddr Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cd by normalized yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcddr Star</em>' containment reference.
	 * @see #setDcddrStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcddrStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcddrStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcddrStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcddrStar <em>Dcddr Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcddr Star</em>' containment reference.
	 * @see #getDcddrStar()
	 * @generated
	 */
	void setDcddrStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcsdp Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cs by normalized roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcsdp Star</em>' containment reference.
	 * @see #setDcsdpStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcsdpStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcsdpStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcsdpStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcsdpStar <em>Dcsdp Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcsdp Star</em>' containment reference.
	 * @see #getDcsdpStar()
	 * @generated
	 */
	void setDcsdpStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcsdq Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cs by normalized pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcsdq Star</em>' containment reference.
	 * @see #setDcsdqStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcsdqStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcsdqStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcsdqStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcsdqStar <em>Dcsdq Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcsdq Star</em>' containment reference.
	 * @see #getDcsdqStar()
	 * @generated
	 */
	void setDcsdqStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcsdr Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cs by normalized yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcsdr Star</em>' containment reference.
	 * @see #setDcsdrStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcsdrStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcsdrStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcsdrStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcsdrStar <em>Dcsdr Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcsdr Star</em>' containment reference.
	 * @see #getDcsdrStar()
	 * @generated
	 */
	void setDcsdrStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcldp Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cl by normalized roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcldp Star</em>' containment reference.
	 * @see #setDcldpStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcldpStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcldpStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcldpStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcldpStar <em>Dcldp Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcldp Star</em>' containment reference.
	 * @see #getDcldpStar()
	 * @generated
	 */
	void setDcldpStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcldq Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cl by normalized pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcldq Star</em>' containment reference.
	 * @see #setDcldqStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcldqStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcldqStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcldqStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcldqStar <em>Dcldq Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcldq Star</em>' containment reference.
	 * @see #getDcldqStar()
	 * @generated
	 */
	void setDcldqStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcldr Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cl by normalized yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcldr Star</em>' containment reference.
	 * @see #setDcldrStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcldrStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcldrStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcldrStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcldrStar <em>Dcldr Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcldr Star</em>' containment reference.
	 * @see #getDcldrStar()
	 * @generated
	 */
	void setDcldrStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmddp Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cmd by normalized roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmddp Star</em>' containment reference.
	 * @see #setDcmddpStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcmddpStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmddpStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcmddpStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmddpStar <em>Dcmddp Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmddp Star</em>' containment reference.
	 * @see #getDcmddpStar()
	 * @generated
	 */
	void setDcmddpStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmddq Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cmd by normalized pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmddq Star</em>' containment reference.
	 * @see #setDcmddqStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcmddqStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmddqStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcmddqStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmddqStar <em>Dcmddq Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmddq Star</em>' containment reference.
	 * @see #getDcmddqStar()
	 * @generated
	 */
	void setDcmddqStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmddr Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cmd by normalized yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmddr Star</em>' containment reference.
	 * @see #setDcmddrStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcmddrStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmddrStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcmddrStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmddrStar <em>Dcmddr Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmddr Star</em>' containment reference.
	 * @see #getDcmddrStar()
	 * @generated
	 */
	void setDcmddrStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmsdp Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cms by normalized roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmsdp Star</em>' containment reference.
	 * @see #setDcmsdpStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcmsdpStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmsdpStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcmsdpStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmsdpStar <em>Dcmsdp Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmsdp Star</em>' containment reference.
	 * @see #getDcmsdpStar()
	 * @generated
	 */
	void setDcmsdpStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmsdq Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cms by normalized pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmsdq Star</em>' containment reference.
	 * @see #setDcmsdqStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcmsdqStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmsdqStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcmsdqStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmsdqStar <em>Dcmsdq Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmsdq Star</em>' containment reference.
	 * @see #getDcmsdqStar()
	 * @generated
	 */
	void setDcmsdqStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmsdr Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cms by normalized yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmsdr Star</em>' containment reference.
	 * @see #setDcmsdrStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcmsdrStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmsdrStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcmsdrStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmsdrStar <em>Dcmsdr Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmsdr Star</em>' containment reference.
	 * @see #getDcmsdrStar()
	 * @generated
	 */
	void setDcmsdrStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmldp Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cml by normalized roll rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmldp Star</em>' containment reference.
	 * @see #setDcmldpStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcmldpStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmldpStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcmldpStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmldpStar <em>Dcmldp Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmldp Star</em>' containment reference.
	 * @see #getDcmldpStar()
	 * @generated
	 */
	void setDcmldpStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmldq Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cml by normalized pitch rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmldq Star</em>' containment reference.
	 * @see #setDcmldqStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcmldqStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmldqStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcmldqStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmldqStar <em>Dcmldq Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmldq Star</em>' containment reference.
	 * @see #getDcmldqStar()
	 * @generated
	 */
	void setDcmldqStar(DoubleVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Dcmldr Star</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Change of cml by normalized yaw rate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dcmldr Star</em>' containment reference.
	 * @see #setDcmldrStar(DoubleVectorBaseType)
	 * @see Cpacs.CpacsPackage#getDampingDerivativesType_DcmldrStar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dcmldrStar' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleVectorBaseType getDcmldrStar();

	/**
	 * Sets the value of the '{@link Cpacs.DampingDerivativesType#getDcmldrStar <em>Dcmldr Star</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dcmldr Star</em>' containment reference.
	 * @see #getDcmldrStar()
	 * @generated
	 */
	void setDcmldrStar(DoubleVectorBaseType value);

} // DampingDerivativesType
