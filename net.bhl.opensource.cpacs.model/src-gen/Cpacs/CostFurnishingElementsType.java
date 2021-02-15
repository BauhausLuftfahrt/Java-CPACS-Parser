/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Furnishing Elements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostFurnishingElementsType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostFurnishingElementsType#getFurnishingElement <em>Furnishing Element</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostFurnishingElementsType()
 * @model extendedMetaData="name='costFurnishingElementsType' kind='elementOnly'"
 * @generated
 */
public interface CostFurnishingElementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostFurnishingElementsType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostFurnishingElementsType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Furnishing Element</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericCostType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Furnishing Element</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCostFurnishingElementsType_FurnishingElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='furnishingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericCostType> getFurnishingElement();

} // CostFurnishingElementsType
