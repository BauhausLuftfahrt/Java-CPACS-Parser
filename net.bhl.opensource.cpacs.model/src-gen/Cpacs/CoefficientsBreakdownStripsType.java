/**
 */
package Cpacs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coefficients Breakdown Strips Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Cpacs.CoefficientsBreakdownStripsType#getStrip <em>Strip</em>}</li>
 * </ul>
 *
 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownStripsType()
 * @model extendedMetaData="name='coefficientsBreakdownStripsType' kind='elementOnly'"
 * @generated
 */
public interface CoefficientsBreakdownStripsType extends ComplexBaseType {
	/**
	 * Returns the value of the '<em><b>Strip</b></em>' containment reference list.
	 * The list contents are of type {@link Cpacs.CoefficientsBreakdownStripType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strip</em>' containment reference list.
	 * @see Cpacs.CpacsPackage#getCoefficientsBreakdownStripsType_Strip()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='strip' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CoefficientsBreakdownStripType> getStrip();

} // CoefficientsBreakdownStripsType
