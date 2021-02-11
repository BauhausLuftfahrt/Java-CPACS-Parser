/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotor Airfoils Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.RotorAirfoilsType#getRotorAirfoil <em>Rotor Airfoil</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getRotorAirfoilsType()
 * @model extendedMetaData="name='rotorAirfoilsType' kind='elementOnly'"
 * @generated
 */
public interface RotorAirfoilsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Rotor Airfoil</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ProfileGeometryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotor Airfoil</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getRotorAirfoilsType_RotorAirfoil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rotorAirfoil' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProfileGeometryType> getRotorAirfoil();

} // RotorAirfoilsType
