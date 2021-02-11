/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Charges Cost Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ChargesCostType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.ChargesCostType#getNavigation <em>Navigation</em>}</li>
 *   <li>{@link Cpacs.ChargesCostType#getLanding <em>Landing</em>}</li>
 *   <li>{@link Cpacs.ChargesCostType#getGround <em>Ground</em>}</li>
 *   <li>{@link Cpacs.ChargesCostType#getEnvironmentalFees <em>Environmental Fees</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getChargesCostType()
 * @model extendedMetaData="name='chargesCostType' kind='elementOnly'"
 * @generated
 */
public interface ChargesCostType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getChargesCostType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.ChargesCostType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Navigation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation</em>' containment reference.
	 * @see #setNavigation(GenericCostType)
	 * @see Cpacs.CpacsPackage#getChargesCostType_Navigation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='navigation' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getNavigation();

	/**
	 * Sets the value of the '{@link Cpacs.ChargesCostType#getNavigation <em>Navigation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation</em>' containment reference.
	 * @see #getNavigation()
	 * @generated
	 */
	void setNavigation(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Landing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing</em>' containment reference.
	 * @see #setLanding(GenericCostType)
	 * @see Cpacs.CpacsPackage#getChargesCostType_Landing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landing' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getLanding();

	/**
	 * Sets the value of the '{@link Cpacs.ChargesCostType#getLanding <em>Landing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing</em>' containment reference.
	 * @see #getLanding()
	 * @generated
	 */
	void setLanding(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Ground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground</em>' containment reference.
	 * @see #setGround(GenericCostType)
	 * @see Cpacs.CpacsPackage#getChargesCostType_Ground()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ground' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getGround();

	/**
	 * Sets the value of the '{@link Cpacs.ChargesCostType#getGround <em>Ground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground</em>' containment reference.
	 * @see #getGround()
	 * @generated
	 */
	void setGround(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Environmental Fees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environmental Fees</em>' containment reference.
	 * @see #setEnvironmentalFees(GenericCostType)
	 * @see Cpacs.CpacsPackage#getChargesCostType_EnvironmentalFees()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environmentalFees' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getEnvironmentalFees();

	/**
	 * Sets the value of the '{@link Cpacs.ChargesCostType#getEnvironmentalFees <em>Environmental Fees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environmental Fees</em>' containment reference.
	 * @see #getEnvironmentalFees()
	 * @generated
	 */
	void setEnvironmentalFees(GenericCostType value);

} // ChargesCostType
