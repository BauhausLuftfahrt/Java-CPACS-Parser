/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotor Hub Hinges Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorHubHingesType#getHinge <em>Hinge</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorHubHingesType()
 * @model extendedMetaData="name='rotorHubHingesType' kind='elementOnly'"
 * @generated
 */
public interface RotorHubHingesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Hinge</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.RotorHubHingeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Definition of a flap, lead-lag or pitch hinge.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hinge</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRotorHubHingesType_Hinge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hinge' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RotorHubHingeType> getHinge();

} // RotorHubHingesType
