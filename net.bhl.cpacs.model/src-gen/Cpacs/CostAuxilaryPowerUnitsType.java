/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Auxilary Power Units Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostAuxilaryPowerUnitsType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostAuxilaryPowerUnitsType#getAuxilaryPowerUnit <em>Auxilary Power Unit</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostAuxilaryPowerUnitsType()
 * @model extendedMetaData="name='costAuxilaryPowerUnitsType' kind='elementOnly'"
 * @generated
 */
public interface CostAuxilaryPowerUnitsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostAuxilaryPowerUnitsType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostAuxilaryPowerUnitsType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Auxilary Power Unit</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericCostType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auxilary Power Unit</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCostAuxilaryPowerUnitsType_AuxilaryPowerUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='auxilaryPowerUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericCostType> getAuxilaryPowerUnit();

} // CostAuxilaryPowerUnitsType
