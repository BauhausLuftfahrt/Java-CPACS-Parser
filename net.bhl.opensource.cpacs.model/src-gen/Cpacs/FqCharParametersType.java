/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fq Char Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FqCharParametersType#getStaticMargin <em>Static Margin</em>}</li>
 *   <li>{@link Cpacs.FqCharParametersType#getPhugoid <em>Phugoid</em>}</li>
 *   <li>{@link Cpacs.FqCharParametersType#getShortPeriod <em>Short Period</em>}</li>
 *   <li>{@link Cpacs.FqCharParametersType#getRolosc <em>Rolosc</em>}</li>
 *   <li>{@link Cpacs.FqCharParametersType#getRollSpiral <em>Roll Spiral</em>}</li>
 *   <li>{@link Cpacs.FqCharParametersType#getEiglat <em>Eiglat</em>}</li>
 *   <li>{@link Cpacs.FqCharParametersType#getTreff <em>Treff</em>}</li>
 *   <li>{@link Cpacs.FqCharParametersType#getRollPerf <em>Roll Perf</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFqCharParametersType()
 * @model extendedMetaData="name='fqCharParametersType' kind='elementOnly'"
 * @generated
 */
public interface FqCharParametersType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Static Margin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * static margin [-]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Static Margin</em>' containment reference.
	 * @see #setStaticMargin(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFqCharParametersType_StaticMargin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='staticMargin' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getStaticMargin();

	/**
	 * Sets the value of the '{@link Cpacs.FqCharParametersType#getStaticMargin <em>Static Margin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Margin</em>' containment reference.
	 * @see #getStaticMargin()
	 * @generated
	 */
	void setStaticMargin(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Phugoid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * main element containing characteristic
	 *                                 parameter of phugoid damping
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phugoid</em>' containment reference.
	 * @see #setPhugoid(FqPhugoidType)
	 * @see Cpacs.CpacsPackage#getFqCharParametersType_Phugoid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='phugoid' namespace='##targetNamespace'"
	 * @generated
	 */
	FqPhugoidType getPhugoid();

	/**
	 * Sets the value of the '{@link Cpacs.FqCharParametersType#getPhugoid <em>Phugoid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phugoid</em>' containment reference.
	 * @see #getPhugoid()
	 * @generated
	 */
	void setPhugoid(FqPhugoidType value);

	/**
	 * Returns the value of the '<em><b>Short Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * main element containing characteristic
	 *                                 parameters of short period mode criteria
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Period</em>' containment reference.
	 * @see #setShortPeriod(FqShortPeriodType)
	 * @see Cpacs.CpacsPackage#getFqCharParametersType_ShortPeriod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='shortPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	FqShortPeriodType getShortPeriod();

	/**
	 * Sets the value of the '{@link Cpacs.FqCharParametersType#getShortPeriod <em>Short Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Period</em>' containment reference.
	 * @see #getShortPeriod()
	 * @generated
	 */
	void setShortPeriod(FqShortPeriodType value);

	/**
	 * Returns the value of the '<em><b>Rolosc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * main element containing characteristic
	 *                                 parameters of roll oscillation criterion
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rolosc</em>' containment reference.
	 * @see #setRolosc(FqRoloscType)
	 * @see Cpacs.CpacsPackage#getFqCharParametersType_Rolosc()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rolosc' namespace='##targetNamespace'"
	 * @generated
	 */
	FqRoloscType getRolosc();

	/**
	 * Sets the value of the '{@link Cpacs.FqCharParametersType#getRolosc <em>Rolosc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolosc</em>' containment reference.
	 * @see #getRolosc()
	 * @generated
	 */
	void setRolosc(FqRoloscType value);

	/**
	 * Returns the value of the '<em><b>Roll Spiral</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * coupling of roll and spiral mode: normal = no
	 *                                 coupling of roll and spiral mode coupled = coupling of roll and
	 *                                 spiral mode
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Spiral</em>' containment reference.
	 * @see #setRollSpiral(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFqCharParametersType_RollSpiral()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rollSpiral' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getRollSpiral();

	/**
	 * Sets the value of the '{@link Cpacs.FqCharParametersType#getRollSpiral <em>Roll Spiral</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Spiral</em>' containment reference.
	 * @see #getRollSpiral()
	 * @generated
	 */
	void setRollSpiral(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Eiglat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * main element containing characteristic
	 *                                 parameters of lateral eigenvalues
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eiglat</em>' containment reference.
	 * @see #setEiglat(FqEiglatType)
	 * @see Cpacs.CpacsPackage#getFqCharParametersType_Eiglat()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eiglat' namespace='##targetNamespace'"
	 * @generated
	 */
	FqEiglatType getEiglat();

	/**
	 * Sets the value of the '{@link Cpacs.FqCharParametersType#getEiglat <em>Eiglat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eiglat</em>' containment reference.
	 * @see #getEiglat()
	 * @generated
	 */
	void setEiglat(FqEiglatType value);

	/**
	 * Returns the value of the '<em><b>Treff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * main element containing characteristic
	 *                                 parameters of effective roll time constant criterion
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treff</em>' containment reference.
	 * @see #setTreff(FqTreffType)
	 * @see Cpacs.CpacsPackage#getFqCharParametersType_Treff()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='treff' namespace='##targetNamespace'"
	 * @generated
	 */
	FqTreffType getTreff();

	/**
	 * Sets the value of the '{@link Cpacs.FqCharParametersType#getTreff <em>Treff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treff</em>' containment reference.
	 * @see #getTreff()
	 * @generated
	 */
	void setTreff(FqTreffType value);

	/**
	 * Returns the value of the '<em><b>Roll Perf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * main element containing characteristic
	 *                                 parameters of roll performance criterion
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Perf</em>' containment reference.
	 * @see #setRollPerf(FqRollPerfType)
	 * @see Cpacs.CpacsPackage#getFqCharParametersType_RollPerf()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rollPerf' namespace='##targetNamespace'"
	 * @generated
	 */
	FqRollPerfType getRollPerf();

	/**
	 * Sets the value of the '{@link Cpacs.FqCharParametersType#getRollPerf <em>Roll Perf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Perf</em>' containment reference.
	 * @see #getRollPerf()
	 * @generated
	 */
	void setRollPerf(FqRollPerfType value);

} // FqCharParametersType
