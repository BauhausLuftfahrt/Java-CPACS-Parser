/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Nacelles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostNacellesType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostNacellesType#getNacelle <em>Nacelle</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostNacellesType()
 * @model extendedMetaData="name='costNacellesType' kind='elementOnly'"
 * @generated
 */
public interface CostNacellesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' containment reference.
	 * @see #setCostDescription(GenericCostType)
	 * @see Cpacs.CpacsPackage#getCostNacellesType_CostDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	GenericCostType getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostNacellesType#getCostDescription <em>Cost Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' containment reference.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(GenericCostType value);

	/**
	 * Returns the value of the '<em><b>Nacelle</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GenericCostType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nacelle</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCostNacellesType_Nacelle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nacelle' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericCostType> getNacelle();

} // CostNacellesType
