/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Hydraulic Systems Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CostHydraulicSystemsType#getCostDescription <em>Cost Description</em>}</li>
 *   <li>{@link Cpacs.CostHydraulicSystemsType#getHydraulicSystem <em>Hydraulic System</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCostHydraulicSystemsType()
 * @model extendedMetaData="name='costHydraulicSystemsType' kind='elementOnly'"
 * @generated
 */
public interface CostHydraulicSystemsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Cost Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Description</em>' attribute.
	 * @see #setCostDescription(String)
	 * @see Cpacs.CpacsPackage#getCostHydraulicSystemsType_CostDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='costDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCostDescription();

	/**
	 * Sets the value of the '{@link Cpacs.CostHydraulicSystemsType#getCostDescription <em>Cost Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Description</em>' attribute.
	 * @see #getCostDescription()
	 * @generated
	 */
	void setCostDescription(String value);

	/**
	 * Returns the value of the '<em><b>Hydraulic System</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydraulic System</em>' attribute list.
	 * @see Cpacs.CpacsPackage#getCostHydraulicSystemsType_HydraulicSystem()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='hydraulicSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getHydraulicSystem();

} // CostHydraulicSystemsType
