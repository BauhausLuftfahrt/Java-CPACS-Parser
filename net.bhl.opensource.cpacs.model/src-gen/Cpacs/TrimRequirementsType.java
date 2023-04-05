/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trim Requirements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.TrimRequirementsType#getTrimRequirement <em>Trim Requirement</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getTrimRequirementsType()
 * @model extendedMetaData="name='trimRequirementsType' kind='elementOnly'"
 * @generated
 */
public interface TrimRequirementsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Trim Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.TrimRequirementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim Requirement</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getTrimRequirementsType_TrimRequirement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='trimRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TrimRequirementType> getTrimRequirement();

} // TrimRequirementsType
