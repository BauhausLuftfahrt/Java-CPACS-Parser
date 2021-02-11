/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CurveProfilesType#getCurveProfile <em>Curve Profile</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCurveProfilesType()
 * @model extendedMetaData="name='curveProfilesType' kind='elementOnly'"
 * @generated
 */
public interface CurveProfilesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Curve Profile</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.ProfileGeometry2DType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Profile</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCurveProfilesType_CurveProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='curveProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProfileGeometry2DType> getCurveProfile();

} // CurveProfilesType
