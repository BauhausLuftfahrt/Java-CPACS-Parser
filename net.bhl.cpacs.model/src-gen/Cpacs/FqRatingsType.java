/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fq Ratings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FqRatingsType#getPhugoid <em>Phugoid</em>}</li>
 *   <li>{@link Cpacs.FqRatingsType#getCStar <em>CStar</em>}</li>
 *   <li>{@link Cpacs.FqRatingsType#getShortPeriod <em>Short Period</em>}</li>
 *   <li>{@link Cpacs.FqRatingsType#getRolosc <em>Rolosc</em>}</li>
 *   <li>{@link Cpacs.FqRatingsType#getEiglat <em>Eiglat</em>}</li>
 *   <li>{@link Cpacs.FqRatingsType#getTreff <em>Treff</em>}</li>
 *   <li>{@link Cpacs.FqRatingsType#getRollPerf <em>Roll Perf</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFqRatingsType()
 * @model extendedMetaData="name='fqRatingsType' kind='elementOnly'"
 * @generated
 */
public interface FqRatingsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Phugoid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * handling qualities level of phugoid damping
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phugoid</em>' containment reference.
	 * @see #setPhugoid(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFqRatingsType_Phugoid()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='phugoid' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getPhugoid();

	/**
	 * Sets the value of the '{@link Cpacs.FqRatingsType#getPhugoid <em>Phugoid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phugoid</em>' containment reference.
	 * @see #getPhugoid()
	 * @generated
	 */
	void setPhugoid(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>CStar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * handling qualities level of C* criterion
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CStar</em>' containment reference.
	 * @see #setCStar(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFqRatingsType_CStar()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='cStar' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getCStar();

	/**
	 * Sets the value of the '{@link Cpacs.FqRatingsType#getCStar <em>CStar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CStar</em>' containment reference.
	 * @see #getCStar()
	 * @generated
	 */
	void setCStar(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Short Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * main element containing handling qualities
	 *                                 levels of short period mode
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Period</em>' containment reference.
	 * @see #setShortPeriod(FqShortPeriodType)
	 * @see Cpacs.CpacsPackage#getFqRatingsType_ShortPeriod()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='shortPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	FqShortPeriodType getShortPeriod();

	/**
	 * Sets the value of the '{@link Cpacs.FqRatingsType#getShortPeriod <em>Short Period</em>}' containment reference.
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
	 * main element containing handling qualities
	 *                                 levels of roll oscillation criterion
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rolosc</em>' containment reference.
	 * @see #setRolosc(FqRoloscType)
	 * @see Cpacs.CpacsPackage#getFqRatingsType_Rolosc()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rolosc' namespace='##targetNamespace'"
	 * @generated
	 */
	FqRoloscType getRolosc();

	/**
	 * Sets the value of the '{@link Cpacs.FqRatingsType#getRolosc <em>Rolosc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rolosc</em>' containment reference.
	 * @see #getRolosc()
	 * @generated
	 */
	void setRolosc(FqRoloscType value);

	/**
	 * Returns the value of the '<em><b>Eiglat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * main element containing handling qualities
	 *                                 levels of lateral eigenvalues
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eiglat</em>' containment reference.
	 * @see #setEiglat(FqEiglatType)
	 * @see Cpacs.CpacsPackage#getFqRatingsType_Eiglat()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eiglat' namespace='##targetNamespace'"
	 * @generated
	 */
	FqEiglatType getEiglat();

	/**
	 * Sets the value of the '{@link Cpacs.FqRatingsType#getEiglat <em>Eiglat</em>}' containment reference.
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
	 * handling qualities level of effective roll
	 *                                 time constant
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Treff</em>' containment reference.
	 * @see #setTreff(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFqRatingsType_Treff()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='treff' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getTreff();

	/**
	 * Sets the value of the '{@link Cpacs.FqRatingsType#getTreff <em>Treff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treff</em>' containment reference.
	 * @see #getTreff()
	 * @generated
	 */
	void setTreff(StringBaseType value);

	/**
	 * Returns the value of the '<em><b>Roll Perf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * handling qualities level of roll performance
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Perf</em>' containment reference.
	 * @see #setRollPerf(StringBaseType)
	 * @see Cpacs.CpacsPackage#getFqRatingsType_RollPerf()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rollPerf' namespace='##targetNamespace'"
	 * @generated
	 */
	StringBaseType getRollPerf();

	/**
	 * Sets the value of the '{@link Cpacs.FqRatingsType#getRollPerf <em>Roll Perf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Perf</em>' containment reference.
	 * @see #getRollPerf()
	 * @generated
	 */
	void setRollPerf(StringBaseType value);

} // FqRatingsType
