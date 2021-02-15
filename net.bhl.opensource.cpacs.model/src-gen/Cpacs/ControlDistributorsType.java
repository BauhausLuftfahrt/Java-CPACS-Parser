/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Distributors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ControlDistributorsType#getControlDistributor <em>Control Distributor</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getControlDistributorsType()
 * @model extendedMetaData="name='controlDistributorsType' kind='elementOnly'"
 * @generated
 */
public interface ControlDistributorsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Control Distributor</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ControlDistributorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Distributor</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getControlDistributorsType_ControlDistributor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='controlDistributor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlDistributorType> getControlDistributor();

} // ControlDistributorsType
