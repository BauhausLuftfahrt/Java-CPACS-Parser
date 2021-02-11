/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Automatic Flight Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostAutomaticFlightSystemsType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostAutomaticFlightSystemsType#getAutomaticFlightSystem <em>Automatic Flight System</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostAutomaticFlightSystemsType()
 * @model extendedMetaData="name='costAutomaticFlightSystemsType' kind='elementOnly'"
 * @generated
 */
public interface CostAutomaticFlightSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostAutomaticFlightSystemsType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostAutomaticFlightSystemsType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Automatic Flight System</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericCostType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Flight System</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCostAutomaticFlightSystemsType_AutomaticFlightSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='automaticFlightSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericCostType> getAutomaticFlightSystem();

} // CostAutomaticFlightSystemsType
