/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plasticity Curves Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Plastification curve incl. element elimination (isotropic
 *                 materials). The data may be used to describe the plastic behavior of isotropic
 *                 materials in non-linear analysis, such as crash simulations. The input is defined
 *                 according to the needs of Material 103 (single stress strain option) in the
 *                 PAM-CRASH explicit Finite Element code, but can also be used for equivalent material
 *                 laws in alternative simulation environment (see PAM-CRASH Solver Reference Manual.,
 *                 Material 103).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PlasticityCurvesType#getPlasticityCurve <em>Plasticity Curve</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPlasticityCurvesType()
 * @model extendedMetaData="name='plasticityCurvesType' kind='elementOnly'"
 * @generated
 */
public interface PlasticityCurvesType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Plasticity Curve</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PlasticityCurveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plasticity Curve</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPlasticityCurvesType_PlasticityCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='plasticityCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlasticityCurveType> getPlasticityCurve();

} // PlasticityCurvesType
