/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Components Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostComponentsType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostComponentsType#getWings <em>Wings</em>}</li>
 *   <li>{@link Cpacs.CostComponentsType#getFuselages <em>Fuselages</em>}</li>
 *   <li>{@link Cpacs.CostComponentsType#getEnginePylons <em>Engine Pylons</em>}</li>
 *   <li>{@link Cpacs.CostComponentsType#getLandingGear <em>Landing Gear</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostComponentsType()
 * @model extendedMetaData="name='costComponentsType' kind='elementOnly'"
 * @generated
 */
public interface CostComponentsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostComponentsType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostComponentsType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Wings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wings</em>' containment reference.
	 * @see #setWings(CostWingsType)
	 * @see Cpacs.CpacsPackage#getCostComponentsType_Wings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wings' namespace='##targetNamespace'"
	 * @generated
	 */
	CostWingsType getWings();

	/**
	 * Sets the value of the '{@link Cpacs.CostComponentsType#getWings <em>Wings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wings</em>' containment reference.
	 * @see #getWings()
	 * @generated
	 */
	void setWings(CostWingsType value);

	/**
	 * Returns the value of the '<em><b>Fuselages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselages</em>' containment reference.
	 * @see #setFuselages(CostFuselagesType)
	 * @see Cpacs.CpacsPackage#getCostComponentsType_Fuselages()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fuselages' namespace='##targetNamespace'"
	 * @generated
	 */
	CostFuselagesType getFuselages();

	/**
	 * Sets the value of the '{@link Cpacs.CostComponentsType#getFuselages <em>Fuselages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuselages</em>' containment reference.
	 * @see #getFuselages()
	 * @generated
	 */
	void setFuselages(CostFuselagesType value);

	/**
	 * Returns the value of the '<em><b>Engine Pylons</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Pylons</em>' containment reference.
	 * @see #setEnginePylons(CostEnginePylonsType)
	 * @see Cpacs.CpacsPackage#getCostComponentsType_EnginePylons()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enginePylons' namespace='##targetNamespace'"
	 * @generated
	 */
	CostEnginePylonsType getEnginePylons();

	/**
	 * Sets the value of the '{@link Cpacs.CostComponentsType#getEnginePylons <em>Engine Pylons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine Pylons</em>' containment reference.
	 * @see #getEnginePylons()
	 * @generated
	 */
	void setEnginePylons(CostEnginePylonsType value);

	/**
	 * Returns the value of the '<em><b>Landing Gear</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Gear</em>' containment reference.
	 * @see #setLandingGear(CostLandingGearType)
	 * @see Cpacs.CpacsPackage#getCostComponentsType_LandingGear()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landingGear' namespace='##targetNamespace'"
	 * @generated
	 */
	CostLandingGearType getLandingGear();

	/**
	 * Sets the value of the '{@link Cpacs.CostComponentsType#getLandingGear <em>Landing Gear</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Landing Gear</em>' containment reference.
	 * @see #getLandingGear()
	 * @generated
	 */
	void setLandingGear(CostLandingGearType value);

} // CostComponentsType
