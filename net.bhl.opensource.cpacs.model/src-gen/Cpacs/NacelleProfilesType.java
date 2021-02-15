/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nacelle Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.NacelleProfilesType#getNacelleProfile <em>Nacelle Profile</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getNacelleProfilesType()
 * @model extendedMetaData="name='nacelleProfilesType' kind='elementOnly'"
 * @generated
 */
public interface NacelleProfilesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Nacelle Profile</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ProfileGeometry2DType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nacelle Profile</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getNacelleProfilesType_NacelleProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nacelleProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProfileGeometry2DType> getNacelleProfile();

} // NacelleProfilesType
