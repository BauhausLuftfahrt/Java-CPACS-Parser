/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skid Gears Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.SkidGearsType#getSkidGear <em>Skid Gear</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getSkidGearsType()
 * @model extendedMetaData="name='skidGearsType' kind='elementOnly'"
 * @generated
 */
public interface SkidGearsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Skid Gear</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LandingGearBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skid Gear</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getSkidGearsType_SkidGear()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='skidGear' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LandingGearBaseType> getSkidGear();

} // SkidGearsType
