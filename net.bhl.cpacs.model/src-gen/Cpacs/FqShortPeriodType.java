/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fq Short Period Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FqShortPeriodType#getNAlpha <em>NAlpha</em>}</li>
 *   <li>{@link Cpacs.FqShortPeriodType#getSpFrequency <em>Sp Frequency</em>}</li>
 *   <li>{@link Cpacs.FqShortPeriodType#getSpDamping <em>Sp Damping</em>}</li>
 *   <li>{@link Cpacs.FqShortPeriodType#getSpTauRed <em>Sp Tau Red</em>}</li>
 *   <li>{@link Cpacs.FqShortPeriodType#getCap <em>Cap</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFqShortPeriodType()
 * @model extendedMetaData="name='fqShortPeriodType' kind='elementOnly'"
 * @generated
 */
public interface FqShortPeriodType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>NAlpha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * steady state normal acceleration change with
	 *                                 angle of attack [g/rad]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NAlpha</em>' containment reference.
	 * @see #setNAlpha(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqShortPeriodType_NAlpha()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nAlpha' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getNAlpha();

	/**
	 * Sets the value of the '{@link Cpacs.FqShortPeriodType#getNAlpha <em>NAlpha</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NAlpha</em>' containment reference.
	 * @see #getNAlpha()
	 * @generated
	 */
	void setNAlpha(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sp Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * short period natural frequency of reduced
	 *                                 order system [rad/s]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sp Frequency</em>' containment reference.
	 * @see #setSpFrequency(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqShortPeriodType_SpFrequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSpFrequency();

	/**
	 * Sets the value of the '{@link Cpacs.FqShortPeriodType#getSpFrequency <em>Sp Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sp Frequency</em>' containment reference.
	 * @see #getSpFrequency()
	 * @generated
	 */
	void setSpFrequency(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sp Damping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * short period damping ratio of reduced order
	 *                                 system [-]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sp Damping</em>' containment reference.
	 * @see #setSpDamping(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqShortPeriodType_SpDamping()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spDamping' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSpDamping();

	/**
	 * Sets the value of the '{@link Cpacs.FqShortPeriodType#getSpDamping <em>Sp Damping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sp Damping</em>' containment reference.
	 * @see #getSpDamping()
	 * @generated
	 */
	void setSpDamping(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Sp Tau Red</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * equivalent pitch time delay of reduced order
	 *                                 system [s]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sp Tau Red</em>' containment reference.
	 * @see #setSpTauRed(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqShortPeriodType_SpTauRed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spTauRed' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getSpTauRed();

	/**
	 * Sets the value of the '{@link Cpacs.FqShortPeriodType#getSpTauRed <em>Sp Tau Red</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sp Tau Red</em>' containment reference.
	 * @see #getSpTauRed()
	 * @generated
	 */
	void setSpTauRed(DoubleBaseType value);

	/**
	 * Returns the value of the '<em><b>Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * handling qualities level of CAP criterion
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cap</em>' containment reference.
	 * @see #setCap(DoubleBaseType)
	 * @see Cpacs.CpacsPackage#getFqShortPeriodType_Cap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cap' namespace='##targetNamespace'"
	 * @generated
	 */
	DoubleBaseType getCap();

	/**
	 * Sets the value of the '{@link Cpacs.FqShortPeriodType#getCap <em>Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap</em>' containment reference.
	 * @see #getCap()
	 * @generated
	 */
	void setCap(DoubleBaseType value);

} // FqShortPeriodType
