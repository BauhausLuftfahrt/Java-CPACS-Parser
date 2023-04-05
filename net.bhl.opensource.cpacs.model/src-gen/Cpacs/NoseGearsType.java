/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nose Gears Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.NoseGearsType#getNoseGear <em>Nose Gear</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getNoseGearsType()
 * @model extendedMetaData="name='noseGearsType' kind='elementOnly'"
 * @generated
 */
public interface NoseGearsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Nose Gear</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.LandingGearBaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nose Gear</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getNoseGearsType_NoseGear()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='noseGear' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LandingGearBaseType> getNoseGear();

} // NoseGearsType
