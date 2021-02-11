/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plasticity Curve Points Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.PlasticityCurvePointsType#getPlasticityCurvePoint <em>Plasticity Curve Point</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getPlasticityCurvePointsType()
 * @model extendedMetaData="name='plasticityCurvePointsType' kind='elementOnly'"
 * @generated
 */
public interface PlasticityCurvePointsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Plasticity Curve Point</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.PlasticityCurvePointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Points on plasticity curve of material
	 *                                 (min. 1 point)
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plasticity Curve Point</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getPlasticityCurvePointsType_PlasticityCurvePoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='plasticityCurvePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlasticityCurvePointType> getPlasticityCurvePoint();

} // PlasticityCurvePointsType
