/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuselage Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.FuselageProfilesType#getFuselageProfile <em>Fuselage Profile</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getFuselageProfilesType()
 * @model extendedMetaData="name='fuselageProfilesType' kind='elementOnly'"
 * @generated
 */
public interface FuselageProfilesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Fuselage Profile</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ProfileGeometryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuselage Profile</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getFuselageProfilesType_FuselageProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='fuselageProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProfileGeometryType> getFuselageProfile();

} // FuselageProfilesType
