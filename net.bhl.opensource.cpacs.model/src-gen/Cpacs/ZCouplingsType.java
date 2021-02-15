/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZCouplings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.ZCouplingsType#getZCoupling <em>ZCoupling</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getZCouplingsType()
 * @model extendedMetaData="name='zCouplingsType' kind='elementOnly'"
 * @generated
 */
public interface ZCouplingsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>ZCoupling</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ZCouplingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definiton of one z-coupling.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZCoupling</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getZCouplingsType_ZCoupling()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='zCoupling' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ZCouplingType> getZCoupling();

} // ZCouplingsType
