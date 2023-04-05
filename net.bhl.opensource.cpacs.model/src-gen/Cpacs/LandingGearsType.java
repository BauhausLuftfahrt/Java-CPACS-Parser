/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Landing Gears Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LandingGearsType#getLandingGear <em>Landing Gear</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLandingGearsType()
 * @model extendedMetaData="name='landingGearsType' kind='elementOnly'"
 * @generated
 */
public interface LandingGearsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Landing Gear</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LandingGearBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Gear</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLandingGearsType_LandingGear()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='landingGear' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LandingGearBaseType> getLandingGear();

} // LandingGearsType
