/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guide Curve Profiles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GuideCurveProfilesType#getGuideCurveProfile <em>Guide Curve Profile</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGuideCurveProfilesType()
 * @model extendedMetaData="name='guideCurveProfilesType' kind='elementOnly'"
 * @generated
 */
public interface GuideCurveProfilesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Guide Curve Profile</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GuideCurveProfileGeometryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guide Curve Profile</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGuideCurveProfilesType_GuideCurveProfile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='guideCurveProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GuideCurveProfileGeometryType> getGuideCurveProfile();

} // GuideCurveProfilesType
