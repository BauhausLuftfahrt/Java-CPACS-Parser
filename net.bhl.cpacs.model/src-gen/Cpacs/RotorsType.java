/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorsType#getRotor <em>Rotor</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorsType()
 * @model extendedMetaData="name='rotorsType' kind='elementOnly'"
 * @generated
 */
public interface RotorsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rotor</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.RotorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotor</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRotorsType_Rotor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RotorType> getRotor();

} // RotorsType
