/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remaining Contributions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RemainingContributionsType#getRemainingContribution <em>Remaining Contribution</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRemainingContributionsType()
 * @model extendedMetaData="name='remainingContributionsType' kind='elementOnly'"
 * @generated
 */
public interface RemainingContributionsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Remaining Contribution</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.RemainingContributionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Contribution</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRemainingContributionsType_RemainingContribution()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='remainingContribution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RemainingContributionType> getRemainingContribution();

} // RemainingContributionsType
