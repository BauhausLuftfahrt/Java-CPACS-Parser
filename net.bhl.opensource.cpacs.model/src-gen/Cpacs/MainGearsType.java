/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Gears Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.MainGearsType#getMainGear <em>Main Gear</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getMainGearsType()
 * @model extendedMetaData="name='mainGearsType' kind='elementOnly'"
 * @generated
 */
public interface MainGearsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Main Gear</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LandingGearBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Gear</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getMainGearsType_MainGear()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='mainGear' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LandingGearBaseType> getMainGear();

} // MainGearsType
