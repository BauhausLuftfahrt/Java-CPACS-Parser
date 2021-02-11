/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Equipped Engines Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostEquippedEnginesType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostEquippedEnginesType#getEquippedEngine <em>Equipped Engine</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostEquippedEnginesType()
 * @model extendedMetaData="name='costEquippedEnginesType' kind='elementOnly'"
 * @generated
 */
public interface CostEquippedEnginesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostEquippedEnginesType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostEquippedEnginesType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Equipped Engine</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericCostType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipped Engine</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCostEquippedEnginesType_EquippedEngine()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='equippedEngine' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericCostType> getEquippedEngine();

} // CostEquippedEnginesType
