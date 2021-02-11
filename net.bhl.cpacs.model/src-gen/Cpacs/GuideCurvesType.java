/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guide Curves Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.GuideCurvesType#getGuideCurve <em>Guide Curve</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getGuideCurvesType()
 * @model extendedMetaData="name='guideCurvesType' kind='elementOnly'"
 * @generated
 */
public interface GuideCurvesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Guide Curve</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.GuideCurveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guide Curve</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getGuideCurvesType_GuideCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='guideCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GuideCurveType> getGuideCurve();

} // GuideCurvesType
