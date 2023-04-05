/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controllability Reqs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControllabilityReqsType#getControllabilityRequirement <em>Controllability Requirement</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControllabilityReqsType()
 * @model extendedMetaData="name='controllabilityReqsType' kind='elementOnly'"
 * @generated
 */
public interface ControllabilityReqsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Controllability Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControllabilityRequirementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllability Requirement</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControllabilityReqsType_ControllabilityRequirement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controllabilityRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControllabilityRequirementType> getControllabilityRequirement();

} // ControllabilityReqsType
