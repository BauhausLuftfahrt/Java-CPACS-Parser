/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotor Blades Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorBladesType#getRotorBlade <em>Rotor Blade</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorBladesType()
 * @model extendedMetaData="name='rotorBladesType' kind='elementOnly'"
 * @generated
 */
public interface RotorBladesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rotor Blade</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.WingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotor blade geometries are defined using the
	 *                                 same data structure as wings (wingType). But in order to be
	 *                                 compatible with the other rotor blade related types (e.g.
	 *                                 rotorType, rotorHubType, rotorHubHingeType) there are some
	 *                                 additional conventions/requirements regarding the definition and
	 *                                 orientation of rotorBlade geometries: see remarks.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotor Blade</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRotorBladesType_RotorBlade()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotorBlade' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WingType> getRotorBlade();

} // RotorBladesType
