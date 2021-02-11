/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Bleed Air Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostBleedAirSystemsType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostBleedAirSystemsType#getBleedAirSystem <em>Bleed Air System</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostBleedAirSystemsType()
 * @model extendedMetaData="name='costBleedAirSystemsType' kind='elementOnly'"
 * @generated
 */
public interface CostBleedAirSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostBleedAirSystemsType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostBleedAirSystemsType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Bleed Air System</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericCostType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bleed Air System</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCostBleedAirSystemsType_BleedAirSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bleedAirSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericCostType> getBleedAirSystem();

} // CostBleedAirSystemsType
