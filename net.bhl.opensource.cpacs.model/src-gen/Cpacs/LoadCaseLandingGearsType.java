/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Case Landing Gears Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.LoadCaseLandingGearsType#getLandingGear <em>Landing Gear</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getLoadCaseLandingGearsType()
 * @model extendedMetaData="name='loadCaseLandingGearsType' kind='elementOnly'"
 * @generated
 */
public interface LoadCaseLandingGearsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Landing Gear</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LandingGearSettingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Landing Gear</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getLoadCaseLandingGearsType_LandingGear()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='landingGear' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LandingGearSettingType> getLandingGear();

} // LoadCaseLandingGearsType
