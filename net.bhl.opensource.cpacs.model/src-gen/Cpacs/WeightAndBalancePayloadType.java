/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weight And Balance Payload Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.WeightAndBalancePayloadType#getMass <em>Mass</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalancePayloadType#getCoG <em>Co G</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalancePayloadType#getMassInertia <em>Mass Inertia</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalancePayloadType#getMPaxx <em>MPaxx</em>}</li>
 *   <li>{@link Cpacs.WeightAndBalancePayloadType#getMCargos <em>MCargos</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getWeightAndBalancePayloadType()
 * @model extendedMetaData="name='weightAndBalancePayloadType' kind='elementOnly'"
 * @generated
 */
public interface WeightAndBalancePayloadType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Mass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass</em>' containment reference.
	 * @see #setMass(StringVectorBaseType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalancePayloadType_Mass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
	 * @generated
	 */
	StringVectorBaseType getMass();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalancePayloadType#getMass <em>Mass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' containment reference.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(StringVectorBaseType value);

	/**
	 * Returns the value of the '<em><b>Co G</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Co G</em>' containment reference.
	 * @see #setCoG(PointListXYZVectorType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalancePayloadType_CoG()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coG' namespace='##targetNamespace'"
	 * @generated
	 */
	PointListXYZVectorType getCoG();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalancePayloadType#getCoG <em>Co G</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Co G</em>' containment reference.
	 * @see #getCoG()
	 * @generated
	 */
	void setCoG(PointListXYZVectorType value);

	/**
	 * Returns the value of the '<em><b>Mass Inertia</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Inertia</em>' containment reference.
	 * @see #setMassInertia(MassInertiaVectorType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalancePayloadType_MassInertia()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='massInertia' namespace='##targetNamespace'"
	 * @generated
	 */
	MassInertiaVectorType getMassInertia();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalancePayloadType#getMassInertia <em>Mass Inertia</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Inertia</em>' containment reference.
	 * @see #getMassInertia()
	 * @generated
	 */
	void setMassInertia(MassInertiaVectorType value);

	/**
	 * Returns the value of the '<em><b>MPaxx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MPaxx</em>' containment reference.
	 * @see #setMPaxx(WeightAndBalancemPaxxType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalancePayloadType_MPaxx()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mPaxx' namespace='##targetNamespace'"
	 * @generated
	 */
	WeightAndBalancemPaxxType getMPaxx();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalancePayloadType#getMPaxx <em>MPaxx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MPaxx</em>' containment reference.
	 * @see #getMPaxx()
	 * @generated
	 */
	void setMPaxx(WeightAndBalancemPaxxType value);

	/**
	 * Returns the value of the '<em><b>MCargos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MCargos</em>' containment reference.
	 * @see #setMCargos(WeightAndBalancemCargosType)
	 * @see Cpacs.CpacsPackage#getWeightAndBalancePayloadType_MCargos()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mCargos' namespace='##targetNamespace'"
	 * @generated
	 */
	WeightAndBalancemCargosType getMCargos();

	/**
	 * Sets the value of the '{@link Cpacs.WeightAndBalancePayloadType#getMCargos <em>MCargos</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCargos</em>' containment reference.
	 * @see #getMCargos()
	 * @generated
	 */
	void setMCargos(WeightAndBalancemCargosType value);

} // WeightAndBalancePayloadType
