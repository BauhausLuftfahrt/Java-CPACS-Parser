/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost De Icing Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostDeIcingSystemsType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostDeIcingSystemsType#getDeIcingSystem <em>De Icing System</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostDeIcingSystemsType()
 * @model extendedMetaData="name='costDeIcingSystemsType' kind='elementOnly'"
 * @generated
 */
public interface CostDeIcingSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostDeIcingSystemsType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostDeIcingSystemsType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>De Icing System</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericCostType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>De Icing System</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCostDeIcingSystemsType_DeIcingSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deIcingSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericCostType> getDeIcingSystem();

} // CostDeIcingSystemsType
