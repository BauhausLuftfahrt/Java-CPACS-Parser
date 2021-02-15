/**
 */
package Cpacs;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Total Operating Cost Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TotalOperatingCostType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.TotalOperatingCostType#getDirectOperatingCost <em>Direct Operating Cost</em>}</li>
 *   <li>{@link Cpacs.TotalOperatingCostType#getIndirectOperatingCost <em>Indirect Operating Cost</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTotalOperatingCostType()
 * @model extendedMetaData="name='totalOperatingCostType' kind='elementOnly'"
 * @generated
 */
public interface TotalOperatingCostType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getTotalOperatingCostType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.TotalOperatingCostType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Direct Operating Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Operating Cost</em>' containment reference.
	 * @see #setDirectOperatingCost(DirectOperatingCostType)
	 * @see Cpacs.CpacsPackage#getTotalOperatingCostType_DirectOperatingCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='directOperatingCost' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectOperatingCostType getDirectOperatingCost();

	/**
	 * Sets the value of the '{@link Cpacs.TotalOperatingCostType#getDirectOperatingCost <em>Direct Operating Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Operating Cost</em>' containment reference.
	 * @see #getDirectOperatingCost()
	 * @generated
	 */
	void setDirectOperatingCost(DirectOperatingCostType value);

	/**
	 * Returns the value of the '<em><b>Indirect Operating Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indirect Operating Cost</em>' containment reference.
	 * @see #setIndirectOperatingCost(IndirectOperatingCostType)
	 * @see Cpacs.CpacsPackage#getTotalOperatingCostType_IndirectOperatingCost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indirectOperatingCost' namespace='##targetNamespace'"
	 * @generated
	 */
	IndirectOperatingCostType getIndirectOperatingCost();

	/**
	 * Sets the value of the '{@link Cpacs.TotalOperatingCostType#getIndirectOperatingCost <em>Indirect Operating Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indirect Operating Cost</em>' containment reference.
	 * @see #getIndirectOperatingCost()
	 * @generated
	 */
	void setIndirectOperatingCost(IndirectOperatingCostType value);

} // TotalOperatingCostType
