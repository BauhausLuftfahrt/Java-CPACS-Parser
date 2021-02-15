/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Engine Pylons Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostEnginePylonsType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostEnginePylonsType#getEnginePylon <em>Engine Pylon</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostEnginePylonsType()
 * @model extendedMetaData="name='costEnginePylonsType' kind='elementOnly'"
 * @generated
 */
public interface CostEnginePylonsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostEnginePylonsType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostEnginePylonsType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Engine Pylon</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericCostType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine Pylon</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCostEnginePylonsType_EnginePylon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enginePylon' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericCostType> getEnginePylon();

} // CostEnginePylonsType
