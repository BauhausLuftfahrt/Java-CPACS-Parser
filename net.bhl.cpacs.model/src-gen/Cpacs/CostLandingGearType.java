/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Landing Gear Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostLandingGearType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostLandingGearType#getLandingGear <em>Landing Gear</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostLandingGearType()
 * @model extendedMetaData="name='costLandingGearType' kind='elementOnly'"
 * @generated
 */
public interface CostLandingGearType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostLandingGearType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostLandingGearType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Landing Gear</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericCostType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Gear</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCostLandingGearType_LandingGear()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='landingGear' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericCostType> getLandingGear();

} // CostLandingGearType
