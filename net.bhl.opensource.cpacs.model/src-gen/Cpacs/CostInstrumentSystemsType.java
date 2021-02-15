/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Instrument Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostInstrumentSystemsType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostInstrumentSystemsType#getInstrumentSystem <em>Instrument System</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostInstrumentSystemsType()
 * @model extendedMetaData="name='costInstrumentSystemsType' kind='elementOnly'"
 * @generated
 */
public interface CostInstrumentSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostInstrumentSystemsType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostInstrumentSystemsType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Instrument System</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericCostType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrument System</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCostInstrumentSystemsType_InstrumentSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='instrumentSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericCostType> getInstrumentSystem();

} // CostInstrumentSystemsType
