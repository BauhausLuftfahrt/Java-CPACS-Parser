/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nacelle Guide Curves Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.NacelleGuideCurvesType#getNacelleGuideCurve <em>Nacelle Guide Curve</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getNacelleGuideCurvesType()
 * @model extendedMetaData="name='nacelleGuideCurvesType' kind='elementOnly'"
 * @generated
 */
public interface NacelleGuideCurvesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Nacelle Guide Curve</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.NacelleGuideCurveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nacelle Guide Curve</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getNacelleGuideCurvesType_NacelleGuideCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='nacelleGuideCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NacelleGuideCurveType> getNacelleGuideCurve();

} // NacelleGuideCurvesType
